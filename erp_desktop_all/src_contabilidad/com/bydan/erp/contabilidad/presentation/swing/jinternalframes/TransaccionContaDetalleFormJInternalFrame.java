/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TransaccionContaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class TransaccionContaDetalleFormJInternalFrame extends TransaccionContaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTransaccionConta;
	
	protected JMenuBar jmenuBarDetalleTransaccionConta;
	
	protected JMenu jmenuDetalleTransaccionConta;
	protected JMenu jmenuDetalleArchivoTransaccionConta;
	protected JMenu jmenuDetalleAccionesTransaccionConta;
	protected JMenu jmenuDetalleDatosTransaccionConta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccionConta;	
	protected GridBagConstraints gridBagConstraintsTransaccionConta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TransaccionContaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTransaccionConta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TransaccionContaSessionBean transaccioncontaSessionBean;
	
	

	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;
	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTransaccionLocal=false;
	public TransaccionLocalSessionBean transaccionlocalSessionBean;
	
		
	
	public TransaccionContaLogic transaccioncontaLogic;
	
	public JScrollPane jScrollPanelDatosTransaccionConta;
	public JScrollPane jScrollPanelDatosEdicionTransaccionConta;
	public JScrollPane jScrollPanelDatosGeneralTransaccionConta;
	
	protected JPanel jPanelCamposTransaccionConta;    
	protected JPanel jPanelCamposOcultosTransaccionConta;    	
	protected JPanel jPanelAccionesTransaccionConta;
	protected JPanel jPanelAccionesFormularioTransaccionConta;
    
	
	
	protected Integer iXPanelCamposTransaccionConta=0;
	protected Integer iYPanelCamposTransaccionConta=0;
	
	protected Integer iXPanelCamposOcultosTransaccionConta=0;
	protected Integer iYPanelCamposOcultosTransaccionConta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTransaccionConta;
	public JButton jButtonModificarTransaccionConta;
	public JButton jButtonActualizarTransaccionConta;
    public JButton jButtonEliminarTransaccionConta;
	public JButton jButtonCancelarTransaccionConta;
    public JButton jButtonGuardarCambiosTransaccionConta;
	public JButton jButtonGuardarCambiosTablaTransaccionConta;
	protected JButton jButtonCerrarTransaccionConta;
	
	
	protected JButton jButtonProcesarInformacionTransaccionConta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTransaccionConta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTransaccionConta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTransaccionConta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccionConta;
	protected JButton jButtonModificarToolBarTransaccionConta;
	protected JButton jButtonActualizarToolBarTransaccionConta;
    protected JButton jButtonEliminarToolBarTransaccionConta;
	protected JButton jButtonCancelarToolBarTransaccionConta;
    protected JButton jButtonGuardarCambiosToolBarTransaccionConta;
	protected JButton jButtonGuardarCambiosTablaToolBarTransaccionConta;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccionConta;
	protected JButton jButtonCerrarToolBarTransaccionConta;
	
	protected JButton jButtonProcesarInformacionToolBarTransaccionConta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccionConta;
	protected JMenuItem jMenuItemModificarTransaccionConta;
	protected JMenuItem jMenuItemActualizarTransaccionConta;
    protected JMenuItem jMenuItemEliminarTransaccionConta;
	protected JMenuItem jMenuItemCancelarTransaccionConta;
    protected JMenuItem jMenuItemGuardarCambiosTransaccionConta;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccionConta;
	protected JMenuItem jMenuItemCerrarTransaccionConta;
	protected JMenuItem jMenuItemDetalleCerrarTransaccionConta;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccionConta;
	
	protected JMenuItem jMenuItemProcesarInformacionTransaccionConta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccionConta;
	protected JMenuItem jMenuItemMostrarOcultarTransaccionConta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccionConta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccionConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccionConta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTransaccionConta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTransaccionConta;
	public JLabel jLabelIdTransaccionConta;
	public JTextFieldMe jTextFieldidTransaccionConta;
	public JButton jButtonidTransaccionContaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTransaccionConta;
	public JLabel jLabelcodigoTransaccionConta;
	public JTextField jTextFieldcodigoTransaccionConta;
	public JButton jButtoncodigoTransaccionContaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTransaccionConta;
	public JLabel jLabelnombreTransaccionConta;
	public JTextArea jTextAreanombreTransaccionConta;
	public JScrollPane jscrollPanenombreTransaccionConta;
	public JButton jButtonnombreTransaccionContaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTransaccionConta;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TransaccionContaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTransaccionConta=new JPanel();
				this.jPanelAccionesFormularioTransaccionConta=new JPanel();
				this.jmenuBarDetalleTransaccionConta=new JMenuBar();
				this.jTtoolBarDetalleTransaccionConta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionContaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TransaccionConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TransaccionContaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TransaccionConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionContaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionContaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionContaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransaccionConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarTransaccionConta() {
		return this.jButtonActualizarToolBarTransaccionConta;
	}
	
	public JButton getjButtonEliminarToolBarTransaccionConta() {
		return this.jButtonEliminarToolBarTransaccionConta;
	}
	
	public JButton getjButtonCancelarToolBarTransaccionConta() {
		return this.jButtonCancelarToolBarTransaccionConta;
	}		
	
	public JButton getjButtonProcesarInformacionTransaccionConta() {
		return this.jButtonProcesarInformacionTransaccionConta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccionConta)	{
		this.jButtonProcesarInformacionTransaccionConta = jButtonProcesarInformacionTransaccionConta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccionConta() {
		return this.jComboBoxTiposAccionesTransaccionConta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccionConta(
			JComboBox jComboBoxTiposRelacionesTransaccionConta) {
		this.jComboBoxTiposRelacionesTransaccionConta = jComboBoxTiposRelacionesTransaccionConta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccionConta(
			JComboBox jComboBoxTiposAccionesTransaccionConta) {
		this.jComboBoxTiposAccionesTransaccionConta = jComboBoxTiposAccionesTransaccionConta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTransaccionConta() {
		return this.jComboBoxTiposAccionesFormularioTransaccionConta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTransaccionConta(
			JComboBox jComboBoxTiposAccionesFormularioTransaccionConta) {
		this.jComboBoxTiposAccionesFormularioTransaccionConta = jComboBoxTiposAccionesFormularioTransaccionConta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.transaccioncontaSessionBean=new TransaccionContaSessionBean();
		
		this.transaccioncontaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccioncontaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccioncontaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionContaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionContaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionContaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transaccion Contablilidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		TransaccionContaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransaccionConta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTransaccionConta=new JButtonMe();
				this.jButtonModificarToolBarTransaccionConta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTransaccionConta,this.jTtoolBarDetalleTransaccionConta,
							"actualizar","actualizar","Actualizar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTransaccionConta,this.jTtoolBarDetalleTransaccionConta,
							"eliminar","eliminar","Eliminar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTransaccionConta,this.jTtoolBarDetalleTransaccionConta,
							"cancelar","cancelar","Cancelar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTransaccionConta,this.jTtoolBarDetalleTransaccionConta,
							"guardarcambios","guardarcambios","Guardar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTransaccionConta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTransaccionConta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTransaccionConta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTransaccionConta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTransaccionConta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTransaccionConta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTransaccionConta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTransaccionConta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccionConta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccionConta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccionConta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTransaccionConta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTransaccionConta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTransaccionConta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTransaccionConta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTransaccionConta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTransaccionConta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTransaccionConta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTransaccionConta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTransaccionConta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTransaccionConta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTransaccionConta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTransaccionConta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTransaccionConta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccionConta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccionConta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccionConta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccionConta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccionConta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTransaccionConta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTransaccionConta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTransaccionConta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccionConta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccionConta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccionConta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccionConta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccionConta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccionConta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTransaccionConta.add(this.jMenuItemDetalleCerrarTransaccionConta);
		
		this.jmenuDetalleAccionesTransaccionConta.add(this.jMenuItemActualizarTransaccionConta);
		this.jmenuDetalleAccionesTransaccionConta.add(this.jMenuItemEliminarTransaccionConta);
		this.jmenuDetalleAccionesTransaccionConta.add(this.jMenuItemCancelarTransaccionConta);		
		
		//this.jmenuDetalleDatosTransaccionConta.add(this.jMenuItemDetalleAbrirOrderByTransaccionConta);				
		this.jmenuDetalleDatosTransaccionConta.add(this.jMenuItemDetalleMostarOcultarTransaccionConta);				
				
		//this.jmenuDetalleAccionesTransaccionConta.add(this.jMenuItemGuardarCambiosTransaccionConta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTransaccionConta.add(this.jmenuDetalleArchivoTransaccionConta);		
		this.jmenuBarDetalleTransaccionConta.add(this.jmenuDetalleAccionesTransaccionConta);		
		this.jmenuBarDetalleTransaccionConta.add(this.jmenuDetalleDatosTransaccionConta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTransaccionConta.add(this.jmenuDetalleTransaccionConta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTransaccionConta);				
	}
	
	
	public void inicializarElementosCamposTransaccionConta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTransaccionConta = new JLabelMe();
		jLabelIdTransaccionConta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTransaccionConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTransaccionConta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTransaccionConta.setToolTipText(TransaccionContaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTransaccionConta= new GridBagLayout();

		this.jPanelidTransaccionConta.setLayout(this.gridaBagLayoutTransaccionConta);

		jTextFieldidTransaccionConta = new JTextFieldMe();
		jTextFieldidTransaccionConta.setText("Id");

		jTextFieldidTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTransaccionConta = new JLabelMe();
		this.jLabelcodigoTransaccionConta.setText(""+TransaccionContaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTransaccionConta.setToolTipText("Codigo");
		this.jLabelcodigoTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTransaccionConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTransaccionConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTransaccionConta.setToolTipText(TransaccionContaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTransaccionConta = new GridBagLayout();
		this.jPanelcodigoTransaccionConta.setLayout(this.gridaBagLayoutTransaccionConta);


		jTextFieldcodigoTransaccionConta= new JTextFieldMe();

		jTextFieldcodigoTransaccionConta.setEnabled(false);
		jTextFieldcodigoTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTransaccionConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTransaccionContaBusqueda= new JButtonMe();
		this.jButtoncodigoTransaccionContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTransaccionContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTransaccionContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTransaccionContaBusqueda.setText("U");
		this.jButtoncodigoTransaccionContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTransaccionContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTransaccionContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTransaccionConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTransaccionConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTransaccionContaBusqueda"));

		if(this.transaccioncontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTransaccionContaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTransaccionConta = new JLabelMe();
		this.jLabelnombreTransaccionConta.setText(""+TransaccionContaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTransaccionConta.setToolTipText("Nombre");
		this.jLabelnombreTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTransaccionConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTransaccionConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTransaccionConta.setToolTipText(TransaccionContaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTransaccionConta = new GridBagLayout();
		this.jPanelnombreTransaccionConta.setLayout(this.gridaBagLayoutTransaccionConta);


		jTextAreanombreTransaccionConta= new JTextAreaMe();
		jTextAreanombreTransaccionConta.setEnabled(false);
		jTextAreanombreTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransaccionConta.setLineWrap(true);
		jTextAreanombreTransaccionConta.setWrapStyleWord(true);
		jTextAreanombreTransaccionConta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTransaccionConta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTransaccionConta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTransaccionConta = new JScrollPane(jTextAreanombreTransaccionConta);
		jscrollPanenombreTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTransaccionContaBusqueda= new JButtonMe();
		this.jButtonnombreTransaccionContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTransaccionContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTransaccionContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTransaccionContaBusqueda.setText("U");
		this.jButtonnombreTransaccionContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTransaccionContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTransaccionContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTransaccionConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTransaccionConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTransaccionContaBusqueda"));

		if(this.transaccioncontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTransaccionContaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTransaccionConta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleTransaccionConta = new TransaccionContaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Transaccion Contablilidad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccionConta= new GridBagLayout();
		

		
		String sToolTipTransaccionConta="";
		sToolTipTransaccionConta=TransaccionContaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccionConta+="(Contabilidad.TransaccionConta)";
		}
		
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccionConta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTransaccionConta = new JButtonMe();
		this.jButtonModificarTransaccionConta = new JButtonMe();
        this.jButtonActualizarTransaccionConta = new JButtonMe();
        this.jButtonEliminarTransaccionConta = new JButtonMe();
        this.jButtonCancelarTransaccionConta = new JButtonMe();
        this.jButtonGuardarCambiosTransaccionConta = new JButtonMe();
		this.jButtonGuardarCambiosTablaTransaccionConta = new JButtonMe();
		this.jButtonCerrarTransaccionConta = new JButtonMe();
		
		this.jScrollPanelDatosTransaccionConta = new JScrollPane();   
        this.jScrollPanelDatosEdicionTransaccionConta = new JScrollPane();
		this.jScrollPanelDatosGeneralTransaccionConta = new JScrollPane();
				
		
		
		this.jPanelCamposTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Transaccion Contablilidad";
		
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Contablilidads" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccionConta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTransaccionConta.setName("jPanelCamposTransaccionConta"); 

		this.jPanelCamposOcultosTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTransaccionConta.setName("jPanelCamposOcultosTransaccionConta"); 

        this.jPanelAccionesTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccionConta.setToolTipText("Acciones");
        this.jPanelAccionesTransaccionConta.setName("Acciones"); 

		this.jPanelAccionesFormularioTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTransaccionConta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTransaccionConta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTransaccionConta.setText("Nuevo");
		this.jButtonModificarTransaccionConta.setText("Editar");
        this.jButtonActualizarTransaccionConta.setText("Actualizar");
        this.jButtonEliminarTransaccionConta.setText("Eliminar");
        this.jButtonCancelarTransaccionConta.setText("Cancelar");
        this.jButtonGuardarCambiosTransaccionConta.setText("Guardar");
		this.jButtonGuardarCambiosTablaTransaccionConta.setText("Guardar");
		this.jButtonCerrarTransaccionConta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccionConta,"nuevo_button","Nuevo",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTransaccionConta,"modificar_button","Editar",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTransaccionConta,"actualizar_button","Actualizar",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTransaccionConta,"eliminar_button","Eliminar",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTransaccionConta,"cancelar_button","Cancelar",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTransaccionConta,"guardarcambios_button","Guardar",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccionConta,"guardarcambiostabla_button","Guardar",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccionConta,"cerrar_button","Salir",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTransaccionConta.setToolTipText("Nuevo"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTransaccionConta.setToolTipText("Editar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTransaccionConta.setToolTipText("Actualizar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTransaccionConta.setToolTipText("Eliminar)"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTransaccionConta.setToolTipText("Cancelar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTransaccionConta.setToolTipText("Guardar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTransaccionConta.setToolTipText("Guardar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccionConta.setToolTipText("Salir"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoTransaccionConta";
		inputMap = this.jButtonNuevoTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccionConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccionConta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTransaccionConta";
		inputMap = this.jButtonActualizarTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTransaccionConta"));
		
		//ELIMINAR
		sMapKey = "EliminarTransaccionConta";
		inputMap = this.jButtonEliminarTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTransaccionConta"));
		
		//CANCELAR	
		sMapKey = "CancelarTransaccionConta";
		inputMap = this.jButtonCancelarTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTransaccionConta"));
		
		//CERRAR		
		sMapKey = "CerrarTransaccionConta";
		inputMap = this.jButtonCerrarTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccionConta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccionConta";
		inputMap = this.jButtonGuardarCambiosTablaTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccionConta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTransaccionConta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTransaccionConta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTransaccionConta.setToolTipText("Nuevo TransaccionConta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTransaccionConta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTransaccionConta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTransaccionConta.setToolTipText("Sin Cerrar Ventana TransaccionConta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTransaccionConta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTransaccionConta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTransaccionConta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTransaccionConta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccionConta.setText("Accion");
		this.jComboBoxTiposAccionesTransaccionConta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTransaccionConta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTransaccionConta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTransaccionConta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTransaccionConta = new JLabelMe();
		
		this.jLabelAccionesTransaccionConta.setText("Acciones");		
		this.jLabelAccionesTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTransaccionConta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTransaccionConta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTransaccionConta=new JTabbedPane();
		this.jTabbedPaneRelacionesTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTransaccionConta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTransaccionConta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionConta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionConta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTransaccionConta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccionConta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccionConta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTransaccionConta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTransaccionConta = new GridBagLayout();
		
		this.jPanelCamposTransaccionConta.setLayout(gridaBagLayoutCamposTransaccionConta);
		this.jPanelCamposOcultosTransaccionConta.setLayout(gridaBagLayoutCamposOcultosTransaccionConta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
	this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionConta.gridy = 0;
	this.gridBagConstraintsTransaccionConta.gridx = 0;
	this.gridBagConstraintsTransaccionConta.ipadx = 0;
	this.gridBagConstraintsTransaccionConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTransaccionConta.add(jLabelIdTransaccionConta, this.gridBagConstraintsTransaccionConta);



	this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
	this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionConta.gridy = 0;
	this.gridBagConstraintsTransaccionConta.gridx = 1;
	this.gridBagConstraintsTransaccionConta.ipadx = 0;
	this.gridBagConstraintsTransaccionConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTransaccionConta.add(jTextFieldidTransaccionConta, this.gridBagConstraintsTransaccionConta);


	this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
	this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionConta.gridy = 0;
	this.gridBagConstraintsTransaccionConta.gridx = 0;
	this.gridBagConstraintsTransaccionConta.ipadx = 0;
	this.gridBagConstraintsTransaccionConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTransaccionConta.add(jLabelcodigoTransaccionConta, this.gridBagConstraintsTransaccionConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionConta.gridy = 0;
		this.gridBagConstraintsTransaccionConta.gridx = 2;
		this.gridBagConstraintsTransaccionConta.ipadx = 0;
		this.gridBagConstraintsTransaccionConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTransaccionConta.add(jButtoncodigoTransaccionContaBusqueda, this.gridBagConstraintsTransaccionConta);
	}

	this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
	this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionConta.gridy = 0;
	this.gridBagConstraintsTransaccionConta.gridx = 1;
	this.gridBagConstraintsTransaccionConta.ipadx = 0;
	this.gridBagConstraintsTransaccionConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTransaccionConta.add(jTextFieldcodigoTransaccionConta, this.gridBagConstraintsTransaccionConta);


	this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
	this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionConta.gridy = 0;
	this.gridBagConstraintsTransaccionConta.gridx = 0;
	this.gridBagConstraintsTransaccionConta.ipadx = 0;
	this.gridBagConstraintsTransaccionConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTransaccionConta.add(jLabelnombreTransaccionConta, this.gridBagConstraintsTransaccionConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionConta.gridy = 0;
		this.gridBagConstraintsTransaccionConta.gridx = 2;
		this.gridBagConstraintsTransaccionConta.ipadx = 0;
		this.gridBagConstraintsTransaccionConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTransaccionConta.add(jButtonnombreTransaccionContaBusqueda, this.gridBagConstraintsTransaccionConta);
	}

	this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
	this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionConta.gridy = 0;
	this.gridBagConstraintsTransaccionConta.gridx = 1;
	this.gridBagConstraintsTransaccionConta.ipadx = 0;
	this.gridBagConstraintsTransaccionConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTransaccionConta.add(jscrollPanenombreTransaccionConta, this.gridBagConstraintsTransaccionConta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
	this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionConta.gridy = iYPanelCamposTransaccionConta;
	this.gridBagConstraintsTransaccionConta.gridx = iXPanelCamposTransaccionConta++;
	this.gridBagConstraintsTransaccionConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionConta.add(this.jPanelidTransaccionConta, this.gridBagConstraintsTransaccionConta);



	if(iXPanelCamposTransaccionConta % 1==0) {
		iXPanelCamposTransaccionConta=0;
		iYPanelCamposTransaccionConta++;
	}
	this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
	this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionConta.gridy = iYPanelCamposTransaccionConta;
	this.gridBagConstraintsTransaccionConta.gridx = iXPanelCamposTransaccionConta++;
	this.gridBagConstraintsTransaccionConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionConta.add(this.jPanelcodigoTransaccionConta, this.gridBagConstraintsTransaccionConta);



	if(iXPanelCamposTransaccionConta % 1==0) {
		iXPanelCamposTransaccionConta=0;
		iYPanelCamposTransaccionConta++;
	}
	this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
	this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionConta.gridy = iYPanelCamposTransaccionConta;
	this.gridBagConstraintsTransaccionConta.gridx = iXPanelCamposTransaccionConta++;
	this.gridBagConstraintsTransaccionConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionConta.add(this.jPanelnombreTransaccionConta, this.gridBagConstraintsTransaccionConta);



	if(iXPanelCamposTransaccionConta % 1==0) {
		iXPanelCamposTransaccionConta=0;
		iYPanelCamposTransaccionConta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransaccionConta= new GridBagLayout();
		this.jPanelAccionesTransaccionConta.setLayout(gridaBagLayoutAccionesTransaccionConta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTransaccionConta= new GridBagLayout();
		this.jPanelAccionesFormularioTransaccionConta.setLayout(gridaBagLayoutAccionesFormularioTransaccionConta);
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransaccionConta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransaccionConta.add(this.jComboBoxTiposAccionesFormularioTransaccionConta, this.gridBagConstraintsTransaccionConta);

		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransaccionConta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransaccionConta.add(this.jCheckBoxPostAccionNuevoTransaccionConta, this.gridBagConstraintsTransaccionConta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransaccionConta.add(this.jCheckBoxPostAccionSinCerrarTransaccionConta, this.gridBagConstraintsTransaccionConta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.transaccioncontaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransaccionConta.add(this.jCheckBoxPostAccionSinMensajeTransaccionConta, this.gridBagConstraintsTransaccionConta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionConta.gridy = 0;
		this.gridBagConstraintsTransaccionConta.gridx = iPosXAccion++;
			
		this.jPanelAccionesTransaccionConta.add(this.jButtonModificarTransaccionConta, this.gridBagConstraintsTransaccionConta);							

		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionConta.gridy = 0;
		this.gridBagConstraintsTransaccionConta.gridx =iPosXAccion++;
			
		this.jPanelAccionesTransaccionConta.add(this.jButtonEliminarTransaccionConta, this.gridBagConstraintsTransaccionConta);
		
			
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = 0;		
		this.gridBagConstraintsTransaccionConta.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccionConta.add(this.jButtonActualizarTransaccionConta, this.gridBagConstraintsTransaccionConta);


		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = 0;		
		this.gridBagConstraintsTransaccionConta.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccionConta.add(this.jButtonGuardarCambiosTransaccionConta, this.gridBagConstraintsTransaccionConta);	
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = 0;		
		this.gridBagConstraintsTransaccionConta.gridx =iPosXAccion++;
		
		this.jPanelAccionesTransaccionConta.add(this.jButtonCancelarTransaccionConta, this.gridBagConstraintsTransaccionConta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccionConta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccionConta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();						
			this.gridBagConstraintsTransaccionConta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionConta.gridx = 0;		
			//this.gridBagConstraintsTransaccionConta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccionConta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccionConta.gridx =0;
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccionConta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccionConta, this.gridBagConstraintsTransaccionConta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TransaccionContaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTransaccionConta = new TransaccionContaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Transaccion Contablilidad DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Transaccion Contablilidad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transaccion Contablilidad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TransaccionContaModel transaccioncontaModel=new TransaccionContaModel(this);
			
			//SI USARA CLASE INTERNA
			//TransaccionContaModel.TransaccionContaFocusTraversalPolicy transaccioncontaFocusTraversalPolicy = transaccioncontaModel.new TransaccionContaFocusTraversalPolicy(this);
			
			//transaccioncontaFocusTraversalPolicy.settransaccioncontaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(transaccioncontaModel);
			
			
			this.jContentPaneDetalleTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTransaccionConta = new GridBagLayout();	
			this.jContentPaneDetalleTransaccionConta.setLayout(gridaBagLayoutDetalleTransaccionConta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccionConta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
				this.gridBagConstraintsTransaccionConta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTransaccionConta.gridx = 0;
					
				
				this.jContentPaneDetalleTransaccionConta.add(jTtoolBarDetalleTransaccionConta, gridBagConstraintsTransaccionConta);								
				
}
			
			this.jScrollPanelDatosEdicionTransaccionConta=   new JScrollPane(jContentPaneDetalleTransaccionConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccionConta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionConta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionConta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTransaccionConta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccionConta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionConta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionConta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTransaccionConta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTransaccionConta.gridx = 0;
	        
			this.jContentPaneDetalleTransaccionConta.add(jPanelCamposTransaccionConta, gridBagConstraintsTransaccionConta);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& transaccioncontaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(this.puedeCargarPorParteTransaccionLocal,false,-1);
					
					if(this.transaccioncontaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTransaccionConta= new GridBagConstraints();
						this.gridBagConstraintsTransaccionConta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTransaccionConta.gridx = 0;
						this.jContentPaneDetalleTransaccionConta.add(this.jTabbedPaneRelacionesTransaccionConta, this.gridBagConstraintsTransaccionConta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTransaccionConta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTransaccionConta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
					this.gridBagConstraintsTransaccionConta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTransaccionConta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTransaccionConta.gridx = 0;
					
				
					this.jContentPaneDetalleTransaccionConta.add(jPanelCamposOcultosTransaccionConta, gridBagConstraintsTransaccionConta);
				
					this.jPanelCamposOcultosTransaccionConta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTransaccionConta.gridx = 0;
	        this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTransaccionConta.add(this.jPanelAccionesFormularioTransaccionConta, this.gridBagConstraintsTransaccionConta);							
			
			
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
	        this.gridBagConstraintsTransaccionConta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTransaccionConta.gridx = 0;
	        
			
			this.jContentPaneDetalleTransaccionConta.add(this.jPanelAccionesTransaccionConta, this.gridBagConstraintsTransaccionConta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTransaccionConta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTransaccionConta=   new JScrollPane(this.jPanelCamposTransaccionConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccionConta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionConta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionConta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionConta.gridx = 0;
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTransaccionConta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTransaccionConta, this.gridBagConstraintsTransaccionConta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionConta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTransaccionConta, this.gridBagConstraintsTransaccionConta);			
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionConta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTransaccionConta, this.gridBagConstraintsTransaccionConta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionConta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccionConta, this.gridBagConstraintsTransaccionConta);
			
			
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionConta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccionConta, this.gridBagConstraintsTransaccionConta);
		
			
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionConta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccionConta, this.gridBagConstraintsTransaccionConta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTransaccionConta;//jContentPane;
		
		return jScrollPanelDatosEdicionTransaccionConta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameTransaccionLocal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		this.transaccionlocalSessionBean.setConGuardarRelaciones(false);
		this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

		this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.transaccionlocalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {

				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL=TransaccionContaJInternalFrame.STIPO_TAMANIO_GENERAL;
				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TransaccionContaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

				this.transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.transaccionlocalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.transaccionlocalBeanSwingJInternalFrame.settransaccionlocalSessionBean(this.transaccionlocalSessionBean);

				//this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
				//this.gridBagConstraintsTransaccionConta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTransaccionConta.gridx = 0;
				//this.jContentPaneDetalleTransaccionConta.add(this.transaccionlocalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTransaccionConta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTransaccionConta.add("Transaccion Locales",this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTransaccionConta.setComponentAt(iIndexTab,this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				}

				//TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTransaccionLocal) {
					this.jTabbedPaneRelacionesTransaccionConta.add("Transaccion Locales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTransaccionLocalBeanSwingJInternalFrame(List<TransaccionConta> transaccioncontas,TransaccionConta transaccionconta,TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					transaccionlocalBeanSwingJInternalFrame.getTransaccionLocalLogic().setConnexion(this.transaccioncontaLogic.getConnexion());

					transaccionlocalBeanSwingJInternalFrame.settransaccioncontasForeignKey(transaccioncontas);
					transaccionlocalBeanSwingJInternalFrame.settransaccioncontaForeignKey(transaccionconta);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionTransaccionConta(true);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setlidTransaccionContaActual(transaccionconta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					transaccionlocalBeanSwingJInternalFrame.cargarCombosForeignKeyTransaccionLocal(transaccionlocalBeanSwingJInternalFrame.isCargarCombosDependencia);
					transaccionlocalBeanSwingJInternalFrame.setVisibilidadBusquedasParaTransaccionConta(true);
					transaccionlocalBeanSwingJInternalFrame.setid_transaccion_contaFK_IdTransaccionConta(transaccionconta.getId());

					if(!this.conCargarFormDetalle) {
						transaccionlocalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					transaccionlocalBeanSwingJInternalFrame.setSelectedItemCombosFrameTransaccionContaForeignKey(transaccionconta,1,false,true,true);
					transaccionlocalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					transaccionlocalBeanSwingJInternalFrame.procesarBusqueda("FK_IdTransaccionConta");
					transaccionlocalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTransaccionConta");
					transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(true);
					transaccionlocalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTransaccionLocal("n",transaccionlocalBeanSwingJInternalFrame.isGuardarCambiosEnLote, transaccionlocalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					transaccionlocalBeanSwingJInternalFrame.setAutoscrolls(true);
					transaccionlocalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("relacionado");
					} else {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");
					}

					transaccionlocalBeanSwingJInternalFrame.getjButtonRecargarInformacionTransaccionLocal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
