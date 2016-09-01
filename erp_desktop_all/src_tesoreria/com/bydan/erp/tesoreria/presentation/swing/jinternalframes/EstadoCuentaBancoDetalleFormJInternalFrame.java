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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.EstadoCuentaBancoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class EstadoCuentaBancoDetalleFormJInternalFrame extends EstadoCuentaBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoCuentaBanco;
	
	protected JMenuBar jmenuBarDetalleEstadoCuentaBanco;
	
	protected JMenu jmenuDetalleEstadoCuentaBanco;
	protected JMenu jmenuDetalleArchivoEstadoCuentaBanco;
	protected JMenu jmenuDetalleAccionesEstadoCuentaBanco;
	protected JMenu jmenuDetalleDatosEstadoCuentaBanco;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoCuentaBanco;	
	protected GridBagConstraints gridBagConstraintsEstadoCuentaBanco;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoCuentaBancoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoCuentaBanco;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoCuentaBancoSessionBean estadocuentabancoSessionBean;
	
	
	
		
	
	public EstadoCuentaBancoLogic estadocuentabancoLogic;
	
	public JScrollPane jScrollPanelDatosEstadoCuentaBanco;
	public JScrollPane jScrollPanelDatosEdicionEstadoCuentaBanco;
	public JScrollPane jScrollPanelDatosGeneralEstadoCuentaBanco;
	
	protected JPanel jPanelCamposEstadoCuentaBanco;    
	protected JPanel jPanelCamposOcultosEstadoCuentaBanco;    	
	protected JPanel jPanelAccionesEstadoCuentaBanco;
	protected JPanel jPanelAccionesFormularioEstadoCuentaBanco;
    
	
	
	protected Integer iXPanelCamposEstadoCuentaBanco=0;
	protected Integer iYPanelCamposEstadoCuentaBanco=0;
	
	protected Integer iXPanelCamposOcultosEstadoCuentaBanco=0;
	protected Integer iYPanelCamposOcultosEstadoCuentaBanco=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoCuentaBanco;
	public JButton jButtonModificarEstadoCuentaBanco;
	public JButton jButtonActualizarEstadoCuentaBanco;
    public JButton jButtonEliminarEstadoCuentaBanco;
	public JButton jButtonCancelarEstadoCuentaBanco;
    public JButton jButtonGuardarCambiosEstadoCuentaBanco;
	public JButton jButtonGuardarCambiosTablaEstadoCuentaBanco;
	protected JButton jButtonCerrarEstadoCuentaBanco;
	
	
	protected JButton jButtonProcesarInformacionEstadoCuentaBanco;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoCuentaBanco;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoCuentaBanco;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoCuentaBanco;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoCuentaBanco;
	protected JButton jButtonModificarToolBarEstadoCuentaBanco;
	protected JButton jButtonActualizarToolBarEstadoCuentaBanco;
    protected JButton jButtonEliminarToolBarEstadoCuentaBanco;
	protected JButton jButtonCancelarToolBarEstadoCuentaBanco;
    protected JButton jButtonGuardarCambiosToolBarEstadoCuentaBanco;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoCuentaBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoCuentaBanco;
	protected JButton jButtonCerrarToolBarEstadoCuentaBanco;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoCuentaBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoCuentaBanco;
	protected JMenuItem jMenuItemModificarEstadoCuentaBanco;
	protected JMenuItem jMenuItemActualizarEstadoCuentaBanco;
    protected JMenuItem jMenuItemEliminarEstadoCuentaBanco;
	protected JMenuItem jMenuItemCancelarEstadoCuentaBanco;
    protected JMenuItem jMenuItemGuardarCambiosEstadoCuentaBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoCuentaBanco;
	protected JMenuItem jMenuItemCerrarEstadoCuentaBanco;
	protected JMenuItem jMenuItemDetalleCerrarEstadoCuentaBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoCuentaBanco;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoCuentaBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoCuentaBanco;
	protected JMenuItem jMenuItemMostrarOcultarEstadoCuentaBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoCuentaBanco;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoCuentaBanco;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoCuentaBanco;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoCuentaBanco;
	public JLabel jLabelIdEstadoCuentaBanco;
	public JTextFieldMe jTextFieldidEstadoCuentaBanco;
	public JButton jButtonidEstadoCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoCuentaBanco;
	public JLabel jLabelcodigoEstadoCuentaBanco;
	public JTextField jTextFieldcodigoEstadoCuentaBanco;
	public JButton jButtoncodigoEstadoCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoCuentaBanco;
	public JLabel jLabelnombreEstadoCuentaBanco;
	public JTextArea jTextAreanombreEstadoCuentaBanco;
	public JScrollPane jscrollPanenombreEstadoCuentaBanco;
	public JButton jButtonnombreEstadoCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPaneles_defectoEstadoCuentaBanco;
	public JLabel jLabeles_defectoEstadoCuentaBanco;
	public JCheckBox jCheckBoxes_defectoEstadoCuentaBanco;
	public JButton jButtones_defectoEstadoCuentaBancoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoCuentaBanco;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EstadoCuentaBancoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoCuentaBanco=new JPanel();
				this.jPanelAccionesFormularioEstadoCuentaBanco=new JPanel();
				this.jmenuBarDetalleEstadoCuentaBanco=new JMenuBar();
				this.jTtoolBarDetalleEstadoCuentaBanco=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuentaBancoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoCuentaBancoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuentaBancoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuentaBancoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuentaBancoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoCuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoCuentaBanco() {
		return this.jButtonActualizarToolBarEstadoCuentaBanco;
	}
	
	public JButton getjButtonEliminarToolBarEstadoCuentaBanco() {
		return this.jButtonEliminarToolBarEstadoCuentaBanco;
	}
	
	public JButton getjButtonCancelarToolBarEstadoCuentaBanco() {
		return this.jButtonCancelarToolBarEstadoCuentaBanco;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoCuentaBanco() {
		return this.jButtonProcesarInformacionEstadoCuentaBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoCuentaBanco)	{
		this.jButtonProcesarInformacionEstadoCuentaBanco = jButtonProcesarInformacionEstadoCuentaBanco;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoCuentaBanco() {
		return this.jComboBoxTiposAccionesEstadoCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoCuentaBanco(
			JComboBox jComboBoxTiposRelacionesEstadoCuentaBanco) {
		this.jComboBoxTiposRelacionesEstadoCuentaBanco = jComboBoxTiposRelacionesEstadoCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoCuentaBanco(
			JComboBox jComboBoxTiposAccionesEstadoCuentaBanco) {
		this.jComboBoxTiposAccionesEstadoCuentaBanco = jComboBoxTiposAccionesEstadoCuentaBanco;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoCuentaBanco() {
		return this.jComboBoxTiposAccionesFormularioEstadoCuentaBanco;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoCuentaBanco(
			JComboBox jComboBoxTiposAccionesFormularioEstadoCuentaBanco) {
		this.jComboBoxTiposAccionesFormularioEstadoCuentaBanco = jComboBoxTiposAccionesFormularioEstadoCuentaBanco;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadocuentabancoSessionBean=new EstadoCuentaBancoSessionBean();
		
		this.estadocuentabancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadocuentabancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadocuentabancoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoCuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoCuentaBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Cuenta Banco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoCuentaBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoCuentaBanco= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoCuentaBanco=new JButtonMe();
				this.jButtonModificarToolBarEstadoCuentaBanco=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoCuentaBanco,this.jTtoolBarDetalleEstadoCuentaBanco,
							"actualizar","actualizar","Actualizar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoCuentaBanco,this.jTtoolBarDetalleEstadoCuentaBanco,
							"eliminar","eliminar","Eliminar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoCuentaBanco,this.jTtoolBarDetalleEstadoCuentaBanco,
							"cancelar","cancelar","Cancelar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoCuentaBanco,this.jTtoolBarDetalleEstadoCuentaBanco,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoCuentaBanco=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoCuentaBanco=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoCuentaBanco=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoCuentaBanco=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoCuentaBanco=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoCuentaBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoCuentaBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoCuentaBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoCuentaBanco= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoCuentaBanco.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoCuentaBanco,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoCuentaBanco= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoCuentaBanco.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoCuentaBanco,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoCuentaBanco= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoCuentaBanco.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoCuentaBanco,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoCuentaBanco= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoCuentaBanco.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoCuentaBanco,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoCuentaBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoCuentaBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoCuentaBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoCuentaBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoCuentaBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoCuentaBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoCuentaBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoCuentaBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoCuentaBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoCuentaBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoCuentaBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoCuentaBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoCuentaBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoCuentaBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoCuentaBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoCuentaBanco.add(this.jMenuItemDetalleCerrarEstadoCuentaBanco);
		
		this.jmenuDetalleAccionesEstadoCuentaBanco.add(this.jMenuItemActualizarEstadoCuentaBanco);
		this.jmenuDetalleAccionesEstadoCuentaBanco.add(this.jMenuItemEliminarEstadoCuentaBanco);
		this.jmenuDetalleAccionesEstadoCuentaBanco.add(this.jMenuItemCancelarEstadoCuentaBanco);		
		
		//this.jmenuDetalleDatosEstadoCuentaBanco.add(this.jMenuItemDetalleAbrirOrderByEstadoCuentaBanco);				
		this.jmenuDetalleDatosEstadoCuentaBanco.add(this.jMenuItemDetalleMostarOcultarEstadoCuentaBanco);				
				
		//this.jmenuDetalleAccionesEstadoCuentaBanco.add(this.jMenuItemGuardarCambiosEstadoCuentaBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoCuentaBanco.add(this.jmenuDetalleArchivoEstadoCuentaBanco);		
		this.jmenuBarDetalleEstadoCuentaBanco.add(this.jmenuDetalleAccionesEstadoCuentaBanco);		
		this.jmenuBarDetalleEstadoCuentaBanco.add(this.jmenuDetalleDatosEstadoCuentaBanco);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoCuentaBanco);				
	}
	
	
	public void inicializarElementosCamposEstadoCuentaBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoCuentaBanco = new JLabelMe();
		jLabelIdEstadoCuentaBanco.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoCuentaBanco = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoCuentaBanco.setToolTipText(EstadoCuentaBancoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoCuentaBanco= new GridBagLayout();

		this.jPanelidEstadoCuentaBanco.setLayout(this.gridaBagLayoutEstadoCuentaBanco);

		jTextFieldidEstadoCuentaBanco = new JTextFieldMe();
		jTextFieldidEstadoCuentaBanco.setText("Id");

		jTextFieldidEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoCuentaBanco = new JLabelMe();
		this.jLabelcodigoEstadoCuentaBanco.setText(""+EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoCuentaBanco.setToolTipText("Codigo");
		this.jLabelcodigoEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoCuentaBanco.setToolTipText(EstadoCuentaBancoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoCuentaBanco = new GridBagLayout();
		this.jPanelcodigoEstadoCuentaBanco.setLayout(this.gridaBagLayoutEstadoCuentaBanco);


		jTextFieldcodigoEstadoCuentaBanco= new JTextFieldMe();

		jTextFieldcodigoEstadoCuentaBanco.setEnabled(false);
		jTextFieldcodigoEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoCuentaBancoBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoCuentaBancoBusqueda.setText("U");
		this.jButtoncodigoEstadoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoCuentaBancoBusqueda"));

		if(this.estadocuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoCuentaBancoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoCuentaBanco = new JLabelMe();
		this.jLabelnombreEstadoCuentaBanco.setText(""+EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoCuentaBanco.setToolTipText("Nombre");
		this.jLabelnombreEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoCuentaBanco.setToolTipText(EstadoCuentaBancoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoCuentaBanco = new GridBagLayout();
		this.jPanelnombreEstadoCuentaBanco.setLayout(this.gridaBagLayoutEstadoCuentaBanco);


		jTextAreanombreEstadoCuentaBanco= new JTextAreaMe();
		jTextAreanombreEstadoCuentaBanco.setEnabled(false);
		jTextAreanombreEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoCuentaBanco.setLineWrap(true);
		jTextAreanombreEstadoCuentaBanco.setWrapStyleWord(true);
		jTextAreanombreEstadoCuentaBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoCuentaBanco.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoCuentaBanco = new JScrollPane(jTextAreanombreEstadoCuentaBanco);
		jscrollPanenombreEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoCuentaBancoBusqueda= new JButtonMe();
		this.jButtonnombreEstadoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoCuentaBancoBusqueda.setText("U");
		this.jButtonnombreEstadoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoCuentaBancoBusqueda"));

		if(this.estadocuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoCuentaBancoBusqueda.setVisible(false);		}


					
		this.jLabeles_defectoEstadoCuentaBanco = new JLabelMe();
		this.jLabeles_defectoEstadoCuentaBanco.setText(""+EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO+" : *");
		this.jLabeles_defectoEstadoCuentaBanco.setToolTipText("Es Defecto");
		this.jLabeles_defectoEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_defectoEstadoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_defectoEstadoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_defectoEstadoCuentaBanco.setToolTipText(EstadoCuentaBancoConstantesFunciones.LABEL_ESDEFECTO);
		this.gridaBagLayoutEstadoCuentaBanco = new GridBagLayout();
		this.jPaneles_defectoEstadoCuentaBanco.setLayout(this.gridaBagLayoutEstadoCuentaBanco);


		jCheckBoxes_defectoEstadoCuentaBanco= new JCheckBoxMe();
		jCheckBoxes_defectoEstadoCuentaBanco.setEnabled(false);

		jCheckBoxes_defectoEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_defectoEstadoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_defectoEstadoCuentaBancoBusqueda= new JButtonMe();
		this.jButtones_defectoEstadoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoEstadoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoEstadoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_defectoEstadoCuentaBancoBusqueda.setText("U");
		this.jButtones_defectoEstadoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_defectoEstadoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_defectoEstadoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_defectoEstadoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_defectoEstadoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_defectoEstadoCuentaBancoBusqueda"));

		if(this.estadocuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_defectoEstadoCuentaBancoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoCuentaBanco() {
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
		//this.jInternalFrameDetalleEstadoCuentaBanco = new EstadoCuentaBancoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Cuenta Banco DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoCuentaBanco= new GridBagLayout();
		

		
		String sToolTipEstadoCuentaBanco="";
		sToolTipEstadoCuentaBanco=EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoCuentaBanco+="(Tesoreria.EstadoCuentaBanco)";
		}
		
		if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoCuentaBanco+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoCuentaBanco = new JButtonMe();
		this.jButtonModificarEstadoCuentaBanco = new JButtonMe();
        this.jButtonActualizarEstadoCuentaBanco = new JButtonMe();
        this.jButtonEliminarEstadoCuentaBanco = new JButtonMe();
        this.jButtonCancelarEstadoCuentaBanco = new JButtonMe();
        this.jButtonGuardarCambiosEstadoCuentaBanco = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoCuentaBanco = new JButtonMe();
		this.jButtonCerrarEstadoCuentaBanco = new JButtonMe();
		
		this.jScrollPanelDatosEstadoCuentaBanco = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoCuentaBanco = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoCuentaBanco = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Cuenta Banco";
		
		if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Cuenta Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoCuentaBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoCuentaBanco.setName("jPanelCamposEstadoCuentaBanco"); 

		this.jPanelCamposOcultosEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoCuentaBanco.setName("jPanelCamposOcultosEstadoCuentaBanco"); 

        this.jPanelAccionesEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoCuentaBanco.setToolTipText("Acciones");
        this.jPanelAccionesEstadoCuentaBanco.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoCuentaBanco.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoCuentaBanco.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoCuentaBanco.setText("Nuevo");
		this.jButtonModificarEstadoCuentaBanco.setText("Editar");
        this.jButtonActualizarEstadoCuentaBanco.setText("Actualizar");
        this.jButtonEliminarEstadoCuentaBanco.setText("Eliminar");
        this.jButtonCancelarEstadoCuentaBanco.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoCuentaBanco.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoCuentaBanco.setText("Guardar");
		this.jButtonCerrarEstadoCuentaBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoCuentaBanco,"nuevo_button","Nuevo",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoCuentaBanco,"modificar_button","Editar",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoCuentaBanco,"actualizar_button","Actualizar",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoCuentaBanco,"eliminar_button","Eliminar",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoCuentaBanco,"cancelar_button","Cancelar",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoCuentaBanco,"guardarcambios_button","Guardar",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoCuentaBanco,"guardarcambiostabla_button","Guardar",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoCuentaBanco,"cerrar_button","Salir",this.estadocuentabancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoCuentaBanco.setToolTipText("Nuevo"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoCuentaBanco.setToolTipText("Editar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoCuentaBanco.setToolTipText("Actualizar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoCuentaBanco.setToolTipText("Eliminar)"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoCuentaBanco.setToolTipText("Cancelar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoCuentaBanco.setToolTipText("Guardar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoCuentaBanco.setToolTipText("Guardar"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoCuentaBanco.setToolTipText("Salir"+" "+EstadoCuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoCuentaBanco";
		inputMap = this.jButtonNuevoEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoCuentaBanco"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoCuentaBanco";
		inputMap = this.jButtonActualizarEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoCuentaBanco"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoCuentaBanco";
		inputMap = this.jButtonEliminarEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoCuentaBanco"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoCuentaBanco";
		inputMap = this.jButtonCancelarEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoCuentaBanco"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoCuentaBanco";
		inputMap = this.jButtonCerrarEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoCuentaBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoCuentaBanco";
		inputMap = this.jButtonGuardarCambiosTablaEstadoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoCuentaBanco"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoCuentaBanco.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoCuentaBanco.setToolTipText("Nuevo EstadoCuentaBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoCuentaBanco.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoCuentaBanco.setToolTipText("Sin Cerrar Ventana EstadoCuentaBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoCuentaBanco.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoCuentaBanco.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoCuentaBanco.setText("Accion");
		this.jComboBoxTiposAccionesEstadoCuentaBanco.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoCuentaBanco = new JLabelMe();
		
		this.jLabelAccionesEstadoCuentaBanco.setText("Acciones");		
		this.jLabelAccionesEstadoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoCuentaBanco();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoCuentaBanco();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoCuentaBanco=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoCuentaBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCuentaBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCuentaBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoCuentaBanco.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoCuentaBanco = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoCuentaBanco = new GridBagLayout();
		
		this.jPanelCamposEstadoCuentaBanco.setLayout(gridaBagLayoutCamposEstadoCuentaBanco);
		this.jPanelCamposOcultosEstadoCuentaBanco.setLayout(gridaBagLayoutCamposOcultosEstadoCuentaBanco);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
	this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
	this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoCuentaBanco.add(jLabelIdEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);



	this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
	this.gridBagConstraintsEstadoCuentaBanco.gridx = 1;
	this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoCuentaBanco.add(jTextFieldidEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);


	this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
	this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
	this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoCuentaBanco.add(jLabelcodigoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = 2;
		this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
		this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoCuentaBanco.add(jButtoncodigoEstadoCuentaBancoBusqueda, this.gridBagConstraintsEstadoCuentaBanco);
	}

	this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
	this.gridBagConstraintsEstadoCuentaBanco.gridx = 1;
	this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoCuentaBanco.add(jTextFieldcodigoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);


	this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
	this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
	this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoCuentaBanco.add(jLabelnombreEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = 2;
		this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
		this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoCuentaBanco.add(jButtonnombreEstadoCuentaBancoBusqueda, this.gridBagConstraintsEstadoCuentaBanco);
	}

	this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
	this.gridBagConstraintsEstadoCuentaBanco.gridx = 1;
	this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoCuentaBanco.add(jscrollPanenombreEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);


	this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
	this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
	this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_defectoEstadoCuentaBanco.add(jLabeles_defectoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = 2;
		this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
		this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_defectoEstadoCuentaBanco.add(jButtones_defectoEstadoCuentaBancoBusqueda, this.gridBagConstraintsEstadoCuentaBanco);
	}

	this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
	this.gridBagConstraintsEstadoCuentaBanco.gridx = 1;
	this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
	this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_defectoEstadoCuentaBanco.add(jCheckBoxes_defectoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCuentaBanco.gridy = iYPanelCamposEstadoCuentaBanco;
	this.gridBagConstraintsEstadoCuentaBanco.gridx = iXPanelCamposEstadoCuentaBanco++;
	this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCuentaBanco.add(this.jPanelidEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);



	if(iXPanelCamposEstadoCuentaBanco % 1==0) {
		iXPanelCamposEstadoCuentaBanco=0;
		iYPanelCamposEstadoCuentaBanco++;
	}
	this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCuentaBanco.gridy = iYPanelCamposEstadoCuentaBanco;
	this.gridBagConstraintsEstadoCuentaBanco.gridx = iXPanelCamposEstadoCuentaBanco++;
	this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCuentaBanco.add(this.jPanelcodigoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);



	if(iXPanelCamposEstadoCuentaBanco % 1==0) {
		iXPanelCamposEstadoCuentaBanco=0;
		iYPanelCamposEstadoCuentaBanco++;
	}
	this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCuentaBanco.gridy = iYPanelCamposEstadoCuentaBanco;
	this.gridBagConstraintsEstadoCuentaBanco.gridx = iXPanelCamposEstadoCuentaBanco++;
	this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCuentaBanco.add(this.jPanelnombreEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);



	if(iXPanelCamposEstadoCuentaBanco % 1==0) {
		iXPanelCamposEstadoCuentaBanco=0;
		iYPanelCamposEstadoCuentaBanco++;
	}
	this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCuentaBanco.gridy = iYPanelCamposEstadoCuentaBanco;
	this.gridBagConstraintsEstadoCuentaBanco.gridx = iXPanelCamposEstadoCuentaBanco++;
	this.gridBagConstraintsEstadoCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCuentaBanco.add(this.jPaneles_defectoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);



	if(iXPanelCamposEstadoCuentaBanco % 1==0) {
		iXPanelCamposEstadoCuentaBanco=0;
		iYPanelCamposEstadoCuentaBanco++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoCuentaBanco= new GridBagLayout();
		this.jPanelAccionesEstadoCuentaBanco.setLayout(gridaBagLayoutAccionesEstadoCuentaBanco);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoCuentaBanco= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoCuentaBanco.setLayout(gridaBagLayoutAccionesFormularioEstadoCuentaBanco);
		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoCuentaBanco.add(this.jComboBoxTiposAccionesFormularioEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);

		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoCuentaBanco.add(this.jCheckBoxPostAccionNuevoEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoCuentaBanco.add(this.jCheckBoxPostAccionSinCerrarEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadocuentabancoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadocuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoCuentaBanco.add(this.jCheckBoxPostAccionSinMensajeEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoCuentaBanco.add(this.jButtonModificarEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);							

		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;
		this.gridBagConstraintsEstadoCuentaBanco.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoCuentaBanco.add(this.jButtonEliminarEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		
			
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoCuentaBanco.add(this.jButtonActualizarEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);


		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoCuentaBanco.add(this.jButtonGuardarCambiosEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);	
		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = 0;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoCuentaBanco.add(this.jButtonCancelarEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoCuentaBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoCuentaBanco);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadocuentabancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();						
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;		
			//this.gridBagConstraintsEstadoCuentaBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoCuentaBanco.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoCuentaBanco.gridx =0;
		this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoCuentaBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoCuentaBancoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoCuentaBanco = new EstadoCuentaBancoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Cuenta Banco DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Cuenta Banco DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Cuenta Banco Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoCuentaBancoModel estadocuentabancoModel=new EstadoCuentaBancoModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoCuentaBancoModel.EstadoCuentaBancoFocusTraversalPolicy estadocuentabancoFocusTraversalPolicy = estadocuentabancoModel.new EstadoCuentaBancoFocusTraversalPolicy(this);
			
			//estadocuentabancoFocusTraversalPolicy.setestadocuentabancoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadocuentabancoModel);
			
			
			this.jContentPaneDetalleEstadoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoCuentaBanco = new GridBagLayout();	
			this.jContentPaneDetalleEstadoCuentaBanco.setLayout(gridaBagLayoutDetalleEstadoCuentaBanco);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoCuentaBanco = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
				this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoCuentaBanco.add(jTtoolBarDetalleEstadoCuentaBanco, gridBagConstraintsEstadoCuentaBanco);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoCuentaBanco=   new JScrollPane(jContentPaneDetalleEstadoCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoCuentaBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
	        
			this.jContentPaneDetalleEstadoCuentaBanco.add(jPanelCamposEstadoCuentaBanco, gridBagConstraintsEstadoCuentaBanco);
			
			
			
			
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
						&& estadocuentabancoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadocuentabancoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoCuentaBanco= new GridBagConstraints();
						this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
						this.jContentPaneDetalleEstadoCuentaBanco.add(this.jTabbedPaneRelacionesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoCuentaBanco.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoCuentaBanco.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
					this.gridBagConstraintsEstadoCuentaBanco.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoCuentaBanco.add(jPanelCamposOcultosEstadoCuentaBanco, gridBagConstraintsEstadoCuentaBanco);
				
					this.jPanelCamposOcultosEstadoCuentaBanco.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
	        this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoCuentaBanco.add(this.jPanelAccionesFormularioEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);							
			
			
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
	        this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoCuentaBanco.add(this.jPanelAccionesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoCuentaBanco);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoCuentaBanco=   new JScrollPane(this.jPanelCamposEstadoCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoCuentaBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCuentaBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCuentaBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
			this.gridBagConstraintsEstadoCuentaBanco.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoCuentaBanco.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoCuentaBanco.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);			
			
			this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuentaBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
			
			
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		
			
		this.gridBagConstraintsEstadoCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuentaBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuentaBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoCuentaBanco, this.gridBagConstraintsEstadoCuentaBanco);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoCuentaBanco;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoCuentaBanco;
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
