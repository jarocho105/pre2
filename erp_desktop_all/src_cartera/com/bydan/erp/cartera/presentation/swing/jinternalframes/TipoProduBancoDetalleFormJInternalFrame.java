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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoProduBancoConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoProduBancoDetalleFormJInternalFrame extends TipoProduBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoProduBanco;
	
	protected JMenuBar jmenuBarDetalleTipoProduBanco;
	
	protected JMenu jmenuDetalleTipoProduBanco;
	protected JMenu jmenuDetalleArchivoTipoProduBanco;
	protected JMenu jmenuDetalleAccionesTipoProduBanco;
	protected JMenu jmenuDetalleDatosTipoProduBanco;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProduBanco;	
	protected GridBagConstraints gridBagConstraintsTipoProduBanco;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoProduBancoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoProduBanco;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoProduBancoSessionBean tipoprodubancoSessionBean;
	
	

	public ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFrame=null;
	public ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteReferenciaBancaria=false;
	public ReferenciaBancariaSessionBean referenciabancariaSessionBean;
	
		
	
	public TipoProduBancoLogic tipoprodubancoLogic;
	
	public JScrollPane jScrollPanelDatosTipoProduBanco;
	public JScrollPane jScrollPanelDatosEdicionTipoProduBanco;
	public JScrollPane jScrollPanelDatosGeneralTipoProduBanco;
	
	protected JPanel jPanelCamposTipoProduBanco;    
	protected JPanel jPanelCamposOcultosTipoProduBanco;    	
	protected JPanel jPanelAccionesTipoProduBanco;
	protected JPanel jPanelAccionesFormularioTipoProduBanco;
    
	
	
	protected Integer iXPanelCamposTipoProduBanco=0;
	protected Integer iYPanelCamposTipoProduBanco=0;
	
	protected Integer iXPanelCamposOcultosTipoProduBanco=0;
	protected Integer iYPanelCamposOcultosTipoProduBanco=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoProduBanco;
	public JButton jButtonModificarTipoProduBanco;
	public JButton jButtonActualizarTipoProduBanco;
    public JButton jButtonEliminarTipoProduBanco;
	public JButton jButtonCancelarTipoProduBanco;
    public JButton jButtonGuardarCambiosTipoProduBanco;
	public JButton jButtonGuardarCambiosTablaTipoProduBanco;
	protected JButton jButtonCerrarTipoProduBanco;
	
	
	protected JButton jButtonProcesarInformacionTipoProduBanco;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoProduBanco;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoProduBanco;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoProduBanco;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProduBanco;
	protected JButton jButtonModificarToolBarTipoProduBanco;
	protected JButton jButtonActualizarToolBarTipoProduBanco;
    protected JButton jButtonEliminarToolBarTipoProduBanco;
	protected JButton jButtonCancelarToolBarTipoProduBanco;
    protected JButton jButtonGuardarCambiosToolBarTipoProduBanco;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoProduBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProduBanco;
	protected JButton jButtonCerrarToolBarTipoProduBanco;
	
	protected JButton jButtonProcesarInformacionToolBarTipoProduBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProduBanco;
	protected JMenuItem jMenuItemModificarTipoProduBanco;
	protected JMenuItem jMenuItemActualizarTipoProduBanco;
    protected JMenuItem jMenuItemEliminarTipoProduBanco;
	protected JMenuItem jMenuItemCancelarTipoProduBanco;
    protected JMenuItem jMenuItemGuardarCambiosTipoProduBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProduBanco;
	protected JMenuItem jMenuItemCerrarTipoProduBanco;
	protected JMenuItem jMenuItemDetalleCerrarTipoProduBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProduBanco;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoProduBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProduBanco;
	protected JMenuItem jMenuItemMostrarOcultarTipoProduBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProduBanco;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProduBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProduBanco;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoProduBanco;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoProduBanco;
	public JLabel jLabelIdTipoProduBanco;
	public JTextFieldMe jTextFieldidTipoProduBanco;
	public JButton jButtonidTipoProduBancoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoProduBanco;
	public JLabel jLabelcodigoTipoProduBanco;
	public JTextField jTextFieldcodigoTipoProduBanco;
	public JButton jButtoncodigoTipoProduBancoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoProduBanco;
	public JLabel jLabelnombreTipoProduBanco;
	public JTextArea jTextAreanombreTipoProduBanco;
	public JScrollPane jscrollPanenombreTipoProduBanco;
	public JButton jButtonnombreTipoProduBancoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoProduBanco;
	
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
	
	public TipoProduBancoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoProduBanco=new JPanel();
				this.jPanelAccionesFormularioTipoProduBanco=new JPanel();
				this.jmenuBarDetalleTipoProduBanco=new JMenuBar();
				this.jTtoolBarDetalleTipoProduBanco=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProduBancoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoProduBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoProduBancoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoProduBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProduBancoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProduBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProduBancoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProduBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProduBancoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProduBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoProduBanco() {
		return this.jButtonActualizarToolBarTipoProduBanco;
	}
	
	public JButton getjButtonEliminarToolBarTipoProduBanco() {
		return this.jButtonEliminarToolBarTipoProduBanco;
	}
	
	public JButton getjButtonCancelarToolBarTipoProduBanco() {
		return this.jButtonCancelarToolBarTipoProduBanco;
	}		
	
	public JButton getjButtonProcesarInformacionTipoProduBanco() {
		return this.jButtonProcesarInformacionTipoProduBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProduBanco)	{
		this.jButtonProcesarInformacionTipoProduBanco = jButtonProcesarInformacionTipoProduBanco;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProduBanco() {
		return this.jComboBoxTiposAccionesTipoProduBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProduBanco(
			JComboBox jComboBoxTiposRelacionesTipoProduBanco) {
		this.jComboBoxTiposRelacionesTipoProduBanco = jComboBoxTiposRelacionesTipoProduBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProduBanco(
			JComboBox jComboBoxTiposAccionesTipoProduBanco) {
		this.jComboBoxTiposAccionesTipoProduBanco = jComboBoxTiposAccionesTipoProduBanco;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoProduBanco() {
		return this.jComboBoxTiposAccionesFormularioTipoProduBanco;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoProduBanco(
			JComboBox jComboBoxTiposAccionesFormularioTipoProduBanco) {
		this.jComboBoxTiposAccionesFormularioTipoProduBanco = jComboBoxTiposAccionesFormularioTipoProduBanco;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoprodubancoSessionBean=new TipoProduBancoSessionBean();
		
		this.tipoprodubancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprodubancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprodubancoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProduBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProduBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProduBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Produ Banco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoProduBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoProduBanco= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoProduBanco=new JButtonMe();
				this.jButtonModificarToolBarTipoProduBanco=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoProduBanco,this.jTtoolBarDetalleTipoProduBanco,
							"actualizar","actualizar","Actualizar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoProduBanco,this.jTtoolBarDetalleTipoProduBanco,
							"eliminar","eliminar","Eliminar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoProduBanco,this.jTtoolBarDetalleTipoProduBanco,
							"cancelar","cancelar","Cancelar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoProduBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoProduBanco,this.jTtoolBarDetalleTipoProduBanco,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoProduBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoProduBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoProduBanco,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoProduBanco=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoProduBanco=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoProduBanco=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoProduBanco=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoProduBanco=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProduBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProduBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProduBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoProduBanco= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoProduBanco.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoProduBanco,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoProduBanco= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoProduBanco.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoProduBanco,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoProduBanco= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoProduBanco.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoProduBanco,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoProduBanco= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoProduBanco.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoProduBanco,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoProduBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProduBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProduBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProduBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProduBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProduBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoProduBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoProduBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoProduBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProduBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProduBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProduBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProduBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProduBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProduBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoProduBanco.add(this.jMenuItemDetalleCerrarTipoProduBanco);
		
		this.jmenuDetalleAccionesTipoProduBanco.add(this.jMenuItemActualizarTipoProduBanco);
		this.jmenuDetalleAccionesTipoProduBanco.add(this.jMenuItemEliminarTipoProduBanco);
		this.jmenuDetalleAccionesTipoProduBanco.add(this.jMenuItemCancelarTipoProduBanco);		
		
		//this.jmenuDetalleDatosTipoProduBanco.add(this.jMenuItemDetalleAbrirOrderByTipoProduBanco);				
		this.jmenuDetalleDatosTipoProduBanco.add(this.jMenuItemDetalleMostarOcultarTipoProduBanco);				
				
		//this.jmenuDetalleAccionesTipoProduBanco.add(this.jMenuItemGuardarCambiosTipoProduBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoProduBanco.add(this.jmenuDetalleArchivoTipoProduBanco);		
		this.jmenuBarDetalleTipoProduBanco.add(this.jmenuDetalleAccionesTipoProduBanco);		
		this.jmenuBarDetalleTipoProduBanco.add(this.jmenuDetalleDatosTipoProduBanco);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoProduBanco.add(this.jmenuDetalleTipoProduBanco);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoProduBanco);				
	}
	
	
	public void inicializarElementosCamposTipoProduBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoProduBanco = new JLabelMe();
		jLabelIdTipoProduBanco.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoProduBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoProduBanco = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoProduBanco.setToolTipText(TipoProduBancoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoProduBanco= new GridBagLayout();

		this.jPanelidTipoProduBanco.setLayout(this.gridaBagLayoutTipoProduBanco);

		jTextFieldidTipoProduBanco = new JTextFieldMe();
		jTextFieldidTipoProduBanco.setText("Id");

		jTextFieldidTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoProduBanco = new JLabelMe();
		this.jLabelcodigoTipoProduBanco.setText(""+TipoProduBancoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoProduBanco.setToolTipText("Codigo");
		this.jLabelcodigoTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoProduBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoProduBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoProduBanco.setToolTipText(TipoProduBancoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoProduBanco = new GridBagLayout();
		this.jPanelcodigoTipoProduBanco.setLayout(this.gridaBagLayoutTipoProduBanco);


		jTextFieldcodigoTipoProduBanco= new JTextFieldMe();

		jTextFieldcodigoTipoProduBanco.setEnabled(false);
		jTextFieldcodigoTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoProduBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoProduBancoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoProduBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoProduBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoProduBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoProduBancoBusqueda.setText("U");
		this.jButtoncodigoTipoProduBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoProduBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoProduBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoProduBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoProduBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoProduBancoBusqueda"));

		if(this.tipoprodubancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoProduBancoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoProduBanco = new JLabelMe();
		this.jLabelnombreTipoProduBanco.setText(""+TipoProduBancoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoProduBanco.setToolTipText("Nombre");
		this.jLabelnombreTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoProduBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoProduBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoProduBanco.setToolTipText(TipoProduBancoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoProduBanco = new GridBagLayout();
		this.jPanelnombreTipoProduBanco.setLayout(this.gridaBagLayoutTipoProduBanco);


		jTextAreanombreTipoProduBanco= new JTextAreaMe();
		jTextAreanombreTipoProduBanco.setEnabled(false);
		jTextAreanombreTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProduBanco.setLineWrap(true);
		jTextAreanombreTipoProduBanco.setWrapStyleWord(true);
		jTextAreanombreTipoProduBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoProduBanco.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoProduBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoProduBanco = new JScrollPane(jTextAreanombreTipoProduBanco);
		jscrollPanenombreTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoProduBancoBusqueda= new JButtonMe();
		this.jButtonnombreTipoProduBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProduBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProduBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoProduBancoBusqueda.setText("U");
		this.jButtonnombreTipoProduBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoProduBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoProduBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoProduBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoProduBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoProduBancoBusqueda"));

		if(this.tipoprodubancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoProduBancoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoProduBanco() {
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
		//this.jInternalFrameDetalleTipoProduBanco = new TipoProduBancoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Produ Banco DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProduBanco= new GridBagLayout();
		

		
		String sToolTipTipoProduBanco="";
		sToolTipTipoProduBanco=TipoProduBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProduBanco+="(Cartera.TipoProduBanco)";
		}
		
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProduBanco+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoProduBanco = new JButtonMe();
		this.jButtonModificarTipoProduBanco = new JButtonMe();
        this.jButtonActualizarTipoProduBanco = new JButtonMe();
        this.jButtonEliminarTipoProduBanco = new JButtonMe();
        this.jButtonCancelarTipoProduBanco = new JButtonMe();
        this.jButtonGuardarCambiosTipoProduBanco = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoProduBanco = new JButtonMe();
		this.jButtonCerrarTipoProduBanco = new JButtonMe();
		
		this.jScrollPanelDatosTipoProduBanco = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoProduBanco = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoProduBanco = new JScrollPane();
				
		
		
		this.jPanelCamposTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Produ Banco";
		
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Produ Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProduBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoProduBanco.setName("jPanelCamposTipoProduBanco"); 

		this.jPanelCamposOcultosTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoProduBanco.setName("jPanelCamposOcultosTipoProduBanco"); 

        this.jPanelAccionesTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProduBanco.setToolTipText("Acciones");
        this.jPanelAccionesTipoProduBanco.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoProduBanco.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoProduBanco.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoProduBanco.setText("Nuevo");
		this.jButtonModificarTipoProduBanco.setText("Editar");
        this.jButtonActualizarTipoProduBanco.setText("Actualizar");
        this.jButtonEliminarTipoProduBanco.setText("Eliminar");
        this.jButtonCancelarTipoProduBanco.setText("Cancelar");
        this.jButtonGuardarCambiosTipoProduBanco.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoProduBanco.setText("Guardar");
		this.jButtonCerrarTipoProduBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProduBanco,"nuevo_button","Nuevo",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoProduBanco,"modificar_button","Editar",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoProduBanco,"actualizar_button","Actualizar",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoProduBanco,"eliminar_button","Eliminar",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoProduBanco,"cancelar_button","Cancelar",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoProduBanco,"guardarcambios_button","Guardar",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProduBanco,"guardarcambiostabla_button","Guardar",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProduBanco,"cerrar_button","Salir",this.tipoprodubancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoProduBanco.setToolTipText("Nuevo"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoProduBanco.setToolTipText("Editar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoProduBanco.setToolTipText("Actualizar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoProduBanco.setToolTipText("Eliminar)"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoProduBanco.setToolTipText("Cancelar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoProduBanco.setToolTipText("Guardar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoProduBanco.setToolTipText("Guardar"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProduBanco.setToolTipText("Salir"+" "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProduBanco";
		inputMap = this.jButtonNuevoTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProduBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProduBanco"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoProduBanco";
		inputMap = this.jButtonActualizarTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoProduBanco"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoProduBanco";
		inputMap = this.jButtonEliminarTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoProduBanco"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoProduBanco";
		inputMap = this.jButtonCancelarTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoProduBanco"));
		
		//CERRAR		
		sMapKey = "CerrarTipoProduBanco";
		inputMap = this.jButtonCerrarTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProduBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProduBanco";
		inputMap = this.jButtonGuardarCambiosTablaTipoProduBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProduBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProduBanco"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoProduBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoProduBanco.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoProduBanco.setToolTipText("Nuevo TipoProduBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoProduBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoProduBanco.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoProduBanco.setToolTipText("Sin Cerrar Ventana TipoProduBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoProduBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoProduBanco.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoProduBanco.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoProduBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProduBanco.setText("Accion");
		this.jComboBoxTiposAccionesTipoProduBanco.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoProduBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoProduBanco.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoProduBanco.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoProduBanco = new JLabelMe();
		
		this.jLabelAccionesTipoProduBanco.setText("Acciones");		
		this.jLabelAccionesTipoProduBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProduBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProduBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoProduBanco();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoProduBanco();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoProduBanco=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoProduBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoProduBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoProduBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProduBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProduBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProduBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoProduBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProduBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProduBanco.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoProduBanco, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoProduBanco = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoProduBanco = new GridBagLayout();
		
		this.jPanelCamposTipoProduBanco.setLayout(gridaBagLayoutCamposTipoProduBanco);
		this.jPanelCamposOcultosTipoProduBanco.setLayout(gridaBagLayoutCamposOcultosTipoProduBanco);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProduBanco.gridy = 0;
	this.gridBagConstraintsTipoProduBanco.gridx = 0;
	this.gridBagConstraintsTipoProduBanco.ipadx = 0;
	this.gridBagConstraintsTipoProduBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoProduBanco.add(jLabelIdTipoProduBanco, this.gridBagConstraintsTipoProduBanco);



	this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProduBanco.gridy = 0;
	this.gridBagConstraintsTipoProduBanco.gridx = 1;
	this.gridBagConstraintsTipoProduBanco.ipadx = 0;
	this.gridBagConstraintsTipoProduBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoProduBanco.add(jTextFieldidTipoProduBanco, this.gridBagConstraintsTipoProduBanco);


	this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProduBanco.gridy = 0;
	this.gridBagConstraintsTipoProduBanco.gridx = 0;
	this.gridBagConstraintsTipoProduBanco.ipadx = 0;
	this.gridBagConstraintsTipoProduBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoProduBanco.add(jLabelcodigoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProduBanco.gridy = 0;
		this.gridBagConstraintsTipoProduBanco.gridx = 2;
		this.gridBagConstraintsTipoProduBanco.ipadx = 0;
		this.gridBagConstraintsTipoProduBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoProduBanco.add(jButtoncodigoTipoProduBancoBusqueda, this.gridBagConstraintsTipoProduBanco);
	}

	this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProduBanco.gridy = 0;
	this.gridBagConstraintsTipoProduBanco.gridx = 1;
	this.gridBagConstraintsTipoProduBanco.ipadx = 0;
	this.gridBagConstraintsTipoProduBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoProduBanco.add(jTextFieldcodigoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);


	this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProduBanco.gridy = 0;
	this.gridBagConstraintsTipoProduBanco.gridx = 0;
	this.gridBagConstraintsTipoProduBanco.ipadx = 0;
	this.gridBagConstraintsTipoProduBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoProduBanco.add(jLabelnombreTipoProduBanco, this.gridBagConstraintsTipoProduBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProduBanco.gridy = 0;
		this.gridBagConstraintsTipoProduBanco.gridx = 2;
		this.gridBagConstraintsTipoProduBanco.ipadx = 0;
		this.gridBagConstraintsTipoProduBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoProduBanco.add(jButtonnombreTipoProduBancoBusqueda, this.gridBagConstraintsTipoProduBanco);
	}

	this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProduBanco.gridy = 0;
	this.gridBagConstraintsTipoProduBanco.gridx = 1;
	this.gridBagConstraintsTipoProduBanco.ipadx = 0;
	this.gridBagConstraintsTipoProduBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoProduBanco.add(jscrollPanenombreTipoProduBanco, this.gridBagConstraintsTipoProduBanco);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProduBanco.gridy = iYPanelCamposTipoProduBanco;
	this.gridBagConstraintsTipoProduBanco.gridx = iXPanelCamposTipoProduBanco++;
	this.gridBagConstraintsTipoProduBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProduBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProduBanco.add(this.jPanelidTipoProduBanco, this.gridBagConstraintsTipoProduBanco);



	if(iXPanelCamposTipoProduBanco % 1==0) {
		iXPanelCamposTipoProduBanco=0;
		iYPanelCamposTipoProduBanco++;
	}
	this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProduBanco.gridy = iYPanelCamposTipoProduBanco;
	this.gridBagConstraintsTipoProduBanco.gridx = iXPanelCamposTipoProduBanco++;
	this.gridBagConstraintsTipoProduBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProduBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProduBanco.add(this.jPanelcodigoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);



	if(iXPanelCamposTipoProduBanco % 1==0) {
		iXPanelCamposTipoProduBanco=0;
		iYPanelCamposTipoProduBanco++;
	}
	this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProduBanco.gridy = iYPanelCamposTipoProduBanco;
	this.gridBagConstraintsTipoProduBanco.gridx = iXPanelCamposTipoProduBanco++;
	this.gridBagConstraintsTipoProduBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProduBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProduBanco.add(this.jPanelnombreTipoProduBanco, this.gridBagConstraintsTipoProduBanco);



	if(iXPanelCamposTipoProduBanco % 1==0) {
		iXPanelCamposTipoProduBanco=0;
		iYPanelCamposTipoProduBanco++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoProduBanco= new GridBagLayout();
		this.jPanelAccionesTipoProduBanco.setLayout(gridaBagLayoutAccionesTipoProduBanco);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoProduBanco= new GridBagLayout();
		this.jPanelAccionesFormularioTipoProduBanco.setLayout(gridaBagLayoutAccionesFormularioTipoProduBanco);
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProduBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProduBanco.add(this.jComboBoxTiposAccionesFormularioTipoProduBanco, this.gridBagConstraintsTipoProduBanco);

		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProduBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProduBanco.add(this.jCheckBoxPostAccionNuevoTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProduBanco.add(this.jCheckBoxPostAccionSinCerrarTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProduBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProduBanco.add(this.jCheckBoxPostAccionSinMensajeTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProduBanco.gridy = 0;
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoProduBanco.add(this.jButtonModificarTipoProduBanco, this.gridBagConstraintsTipoProduBanco);							

		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProduBanco.gridy = 0;
		this.gridBagConstraintsTipoProduBanco.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoProduBanco.add(this.jButtonEliminarTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		
			
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = 0;		
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProduBanco.add(this.jButtonActualizarTipoProduBanco, this.gridBagConstraintsTipoProduBanco);


		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = 0;		
		this.gridBagConstraintsTipoProduBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProduBanco.add(this.jButtonGuardarCambiosTipoProduBanco, this.gridBagConstraintsTipoProduBanco);	
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = 0;		
		this.gridBagConstraintsTipoProduBanco.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoProduBanco.add(this.jButtonCancelarTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProduBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProduBanco);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();						
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProduBanco.gridx = 0;		
			//this.gridBagConstraintsTipoProduBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProduBanco.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProduBanco.gridx =0;
		this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProduBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoProduBancoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoProduBanco = new TipoProduBancoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Produ Banco DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Produ Banco DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Produ Banco Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoProduBancoModel tipoprodubancoModel=new TipoProduBancoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoProduBancoModel.TipoProduBancoFocusTraversalPolicy tipoprodubancoFocusTraversalPolicy = tipoprodubancoModel.new TipoProduBancoFocusTraversalPolicy(this);
			
			//tipoprodubancoFocusTraversalPolicy.settipoprodubancoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoprodubancoModel);
			
			
			this.jContentPaneDetalleTipoProduBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoProduBanco = new GridBagLayout();	
			this.jContentPaneDetalleTipoProduBanco.setLayout(gridaBagLayoutDetalleTipoProduBanco);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProduBanco = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoProduBanco.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoProduBanco.gridx = 0;
					
				
				this.jContentPaneDetalleTipoProduBanco.add(jTtoolBarDetalleTipoProduBanco, gridBagConstraintsTipoProduBanco);								
				
}
			
			this.jScrollPanelDatosEdicionTipoProduBanco=   new JScrollPane(jContentPaneDetalleTipoProduBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProduBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProduBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProduBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoProduBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProduBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProduBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProduBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoProduBanco.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoProduBanco.gridx = 0;
	        
			this.jContentPaneDetalleTipoProduBanco.add(jPanelCamposTipoProduBanco, gridBagConstraintsTipoProduBanco);
			
			
			
			
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
						&& tipoprodubancoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(this.puedeCargarPorParteReferenciaBancaria,false,-1);
					
					if(this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoProduBanco= new GridBagConstraints();
						this.gridBagConstraintsTipoProduBanco.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoProduBanco.gridx = 0;
						this.jContentPaneDetalleTipoProduBanco.add(this.jTabbedPaneRelacionesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoProduBanco.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoProduBanco.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
					this.gridBagConstraintsTipoProduBanco.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoProduBanco.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoProduBanco.gridx = 0;
					
				
					this.jContentPaneDetalleTipoProduBanco.add(jPanelCamposOcultosTipoProduBanco, gridBagConstraintsTipoProduBanco);
				
					this.jPanelCamposOcultosTipoProduBanco.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoProduBanco.gridx = 0;
	        this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoProduBanco.add(this.jPanelAccionesFormularioTipoProduBanco, this.gridBagConstraintsTipoProduBanco);							
			
			
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
	        this.gridBagConstraintsTipoProduBanco.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoProduBanco.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoProduBanco.add(this.jPanelAccionesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoProduBanco);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoProduBanco=   new JScrollPane(this.jPanelCamposTipoProduBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProduBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProduBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProduBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoProduBanco.gridx = 0;
			this.gridBagConstraintsTipoProduBanco.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoProduBanco.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoProduBanco.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProduBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoProduBanco, this.gridBagConstraintsTipoProduBanco);			
			
			this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoProduBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProduBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProduBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
			
			
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProduBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		
			
		this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoProduBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProduBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProduBanco, this.gridBagConstraintsTipoProduBanco);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoProduBanco;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoProduBanco;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		this.referenciabancariaSessionBean.setConGuardarRelaciones(false);
		this.referenciabancariaSessionBean.setEsGuardarRelacionado(true);

		this.referenciabancariaBeanSwingJInternalFrame=null;//new ReferenciaBancariaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.referenciabancariaBeanSwingJInternalFramePopup=new ReferenciaBancariaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.referenciabancariaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {

				ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProduBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProduBancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.referenciabancariaSessionBean.setEsGuardarRelacionado(true);

				this.referenciabancariaBeanSwingJInternalFrame=new ReferenciaBancariaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.referenciabancariaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.referenciabancariaBeanSwingJInternalFrame.setreferenciabancariaSessionBean(this.referenciabancariaSessionBean);

				//this.gridBagConstraintsTipoProduBanco = new GridBagConstraints();
				//this.gridBagConstraintsTipoProduBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProduBanco.gridx = 0;
				//this.jContentPaneDetalleTipoProduBanco.add(this.referenciabancariaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProduBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProduBanco.add("Referencia Bancarias",this.referenciabancariaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProduBanco.setComponentAt(iIndexTab,this.referenciabancariaBeanSwingJInternalFrame.getContentPane());
				}

				//ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.referenciabancariaSessionBean.setEsGuardarRelacionado(false);
				this.referenciabancariaBeanSwingJInternalFrame=null;//new ReferenciaBancariaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteReferenciaBancaria) {
					this.jTabbedPaneRelacionesTipoProduBanco.add("Referencia Bancarias",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarReferenciaBancariaBeanSwingJInternalFrame(List<TipoProduBanco> tipoprodubancos,TipoProduBanco tipoprodubanco,ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//referenciabancariaBeanSwingJInternalFrame=new ReferenciaBancariaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					referenciabancariaBeanSwingJInternalFrame.getReferenciaBancariaLogic().setConnexion(this.tipoprodubancoLogic.getConnexion());

					referenciabancariaBeanSwingJInternalFrame.settipoprodubancosForeignKey(tipoprodubancos);
					referenciabancariaBeanSwingJInternalFrame.settipoprodubancoForeignKey(tipoprodubanco);
					referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setisBusquedaDesdeForeignKeySesionTipoProduBanco(true);
					referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setlidTipoProduBancoActual(tipoprodubanco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					referenciabancariaBeanSwingJInternalFrame.cargarCombosForeignKeyReferenciaBancaria(referenciabancariaBeanSwingJInternalFrame.isCargarCombosDependencia);
					referenciabancariaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProduBanco(true);
					referenciabancariaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					referenciabancariaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProduBanco");
					referenciabancariaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProduBanco");
					referenciabancariaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaBancaria(true);
					referenciabancariaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesReferenciaBancaria("n",referenciabancariaBeanSwingJInternalFrame.isGuardarCambiosEnLote, referenciabancariaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					referenciabancariaBeanSwingJInternalFrame.setAutoscrolls(true);
					referenciabancariaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						referenciabancariaBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaBancaria("relacionado");
					} else {
						referenciabancariaBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaBancaria("no_relacionado");
					}

					referenciabancariaBeanSwingJInternalFrame.getjButtonRecargarInformacionReferenciaBancaria().setVisible(false);

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
