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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.TipoParametroContaConstantesFunciones;

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
public class TipoParametroContaDetalleFormJInternalFrame extends TipoParametroContaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoParametroConta;
	
	protected JMenuBar jmenuBarDetalleTipoParametroConta;
	
	protected JMenu jmenuDetalleTipoParametroConta;
	protected JMenu jmenuDetalleArchivoTipoParametroConta;
	protected JMenu jmenuDetalleAccionesTipoParametroConta;
	protected JMenu jmenuDetalleDatosTipoParametroConta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoParametroConta;	
	protected GridBagConstraints gridBagConstraintsTipoParametroConta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoParametroContaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoParametroConta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoParametroContaSessionBean tipoparametrocontaSessionBean;
	
	

	public ParametroContaDetalleBeanSwingJInternalFrame parametrocontadetalleBeanSwingJInternalFrame=null;
	public ParametroContaDetalleBeanSwingJInternalFrame parametrocontadetalleBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroContaDetalle=false;
	public ParametroContaDetalleSessionBean parametrocontadetalleSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoParametroContaLogic tipoparametrocontaLogic;
	
	public JScrollPane jScrollPanelDatosTipoParametroConta;
	public JScrollPane jScrollPanelDatosEdicionTipoParametroConta;
	public JScrollPane jScrollPanelDatosGeneralTipoParametroConta;
	
	protected JPanel jPanelCamposTipoParametroConta;    
	protected JPanel jPanelCamposOcultosTipoParametroConta;    	
	protected JPanel jPanelAccionesTipoParametroConta;
	protected JPanel jPanelAccionesFormularioTipoParametroConta;
    
	
	
	protected Integer iXPanelCamposTipoParametroConta=0;
	protected Integer iYPanelCamposTipoParametroConta=0;
	
	protected Integer iXPanelCamposOcultosTipoParametroConta=0;
	protected Integer iYPanelCamposOcultosTipoParametroConta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoParametroConta;
	public JButton jButtonModificarTipoParametroConta;
	public JButton jButtonActualizarTipoParametroConta;
    public JButton jButtonEliminarTipoParametroConta;
	public JButton jButtonCancelarTipoParametroConta;
    public JButton jButtonGuardarCambiosTipoParametroConta;
	public JButton jButtonGuardarCambiosTablaTipoParametroConta;
	protected JButton jButtonCerrarTipoParametroConta;
	
	
	protected JButton jButtonProcesarInformacionTipoParametroConta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoParametroConta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoParametroConta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoParametroConta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoParametroConta;
	protected JButton jButtonModificarToolBarTipoParametroConta;
	protected JButton jButtonActualizarToolBarTipoParametroConta;
    protected JButton jButtonEliminarToolBarTipoParametroConta;
	protected JButton jButtonCancelarToolBarTipoParametroConta;
    protected JButton jButtonGuardarCambiosToolBarTipoParametroConta;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoParametroConta;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoParametroConta;
	protected JButton jButtonCerrarToolBarTipoParametroConta;
	
	protected JButton jButtonProcesarInformacionToolBarTipoParametroConta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoParametroConta;
	protected JMenuItem jMenuItemModificarTipoParametroConta;
	protected JMenuItem jMenuItemActualizarTipoParametroConta;
    protected JMenuItem jMenuItemEliminarTipoParametroConta;
	protected JMenuItem jMenuItemCancelarTipoParametroConta;
    protected JMenuItem jMenuItemGuardarCambiosTipoParametroConta;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoParametroConta;
	protected JMenuItem jMenuItemCerrarTipoParametroConta;
	protected JMenuItem jMenuItemDetalleCerrarTipoParametroConta;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoParametroConta;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoParametroConta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoParametroConta;
	protected JMenuItem jMenuItemMostrarOcultarTipoParametroConta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoParametroConta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoParametroConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoParametroConta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoParametroConta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoParametroConta;
	public JLabel jLabelIdTipoParametroConta;
	public JLabel jLabelidTipoParametroConta;
	public JButton jButtonidTipoParametroContaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoParametroConta;
	public JLabel jLabelcodigoTipoParametroConta;
	public JTextField jTextFieldcodigoTipoParametroConta;
	public JButton jButtoncodigoTipoParametroContaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoParametroConta;
	public JLabel jLabelnombreTipoParametroConta;
	public JTextArea jTextAreanombreTipoParametroConta;
	public JScrollPane jscrollPanenombreTipoParametroConta;
	public JButton jButtonnombreTipoParametroContaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoParametroConta;
	public JLabel jLabelid_empresaTipoParametroConta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoParametroConta;
	public JButton jButtonid_empresaTipoParametroConta= new JButtonMe();
	public JButton jButtonid_empresaTipoParametroContaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoParametroContaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoParametroConta;
	
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
	
	public TipoParametroContaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoParametroConta=new JPanel();
				this.jPanelAccionesFormularioTipoParametroConta=new JPanel();
				this.jmenuBarDetalleTipoParametroConta=new JMenuBar();
				this.jTtoolBarDetalleTipoParametroConta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroContaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoParametroContaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroContaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroContaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroContaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoParametroConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoParametroConta() {
		return this.jButtonActualizarToolBarTipoParametroConta;
	}
	
	public JButton getjButtonEliminarToolBarTipoParametroConta() {
		return this.jButtonEliminarToolBarTipoParametroConta;
	}
	
	public JButton getjButtonCancelarToolBarTipoParametroConta() {
		return this.jButtonCancelarToolBarTipoParametroConta;
	}		
	
	public JButton getjButtonProcesarInformacionTipoParametroConta() {
		return this.jButtonProcesarInformacionTipoParametroConta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoParametroConta)	{
		this.jButtonProcesarInformacionTipoParametroConta = jButtonProcesarInformacionTipoParametroConta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoParametroConta() {
		return this.jComboBoxTiposAccionesTipoParametroConta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoParametroConta(
			JComboBox jComboBoxTiposRelacionesTipoParametroConta) {
		this.jComboBoxTiposRelacionesTipoParametroConta = jComboBoxTiposRelacionesTipoParametroConta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoParametroConta(
			JComboBox jComboBoxTiposAccionesTipoParametroConta) {
		this.jComboBoxTiposAccionesTipoParametroConta = jComboBoxTiposAccionesTipoParametroConta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoParametroConta() {
		return this.jComboBoxTiposAccionesFormularioTipoParametroConta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoParametroConta(
			JComboBox jComboBoxTiposAccionesFormularioTipoParametroConta) {
		this.jComboBoxTiposAccionesFormularioTipoParametroConta = jComboBoxTiposAccionesFormularioTipoParametroConta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoparametrocontaSessionBean=new TipoParametroContaSessionBean();
		
		this.tipoparametrocontaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparametrocontaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoparametrocontaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoParametroContaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Parametro Conta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoParametroContaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoParametroConta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoParametroConta=new JButtonMe();
				this.jButtonModificarToolBarTipoParametroConta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoParametroConta,this.jTtoolBarDetalleTipoParametroConta,
							"actualizar","actualizar","Actualizar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoParametroConta,this.jTtoolBarDetalleTipoParametroConta,
							"eliminar","eliminar","Eliminar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoParametroConta,this.jTtoolBarDetalleTipoParametroConta,
							"cancelar","cancelar","Cancelar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoParametroConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoParametroConta,this.jTtoolBarDetalleTipoParametroConta,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoParametroConta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoParametroConta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoParametroConta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoParametroConta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoParametroConta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoParametroConta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoParametroConta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoParametroConta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoParametroConta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoParametroConta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoParametroConta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoParametroConta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoParametroConta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoParametroConta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoParametroConta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoParametroConta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoParametroConta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoParametroConta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoParametroConta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoParametroConta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoParametroConta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoParametroConta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoParametroConta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoParametroConta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoParametroConta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoParametroConta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoParametroConta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoParametroConta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoParametroConta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoParametroConta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoParametroConta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoParametroConta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoParametroConta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoParametroConta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoParametroConta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoParametroConta.add(this.jMenuItemDetalleCerrarTipoParametroConta);
		
		this.jmenuDetalleAccionesTipoParametroConta.add(this.jMenuItemActualizarTipoParametroConta);
		this.jmenuDetalleAccionesTipoParametroConta.add(this.jMenuItemEliminarTipoParametroConta);
		this.jmenuDetalleAccionesTipoParametroConta.add(this.jMenuItemCancelarTipoParametroConta);		
		
		//this.jmenuDetalleDatosTipoParametroConta.add(this.jMenuItemDetalleAbrirOrderByTipoParametroConta);				
		this.jmenuDetalleDatosTipoParametroConta.add(this.jMenuItemDetalleMostarOcultarTipoParametroConta);				
				
		//this.jmenuDetalleAccionesTipoParametroConta.add(this.jMenuItemGuardarCambiosTipoParametroConta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoParametroConta.add(this.jmenuDetalleArchivoTipoParametroConta);		
		this.jmenuBarDetalleTipoParametroConta.add(this.jmenuDetalleAccionesTipoParametroConta);		
		this.jmenuBarDetalleTipoParametroConta.add(this.jmenuDetalleDatosTipoParametroConta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoParametroConta.add(this.jmenuDetalleTipoParametroConta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoParametroConta);				
	}
	
	
	public void inicializarElementosCamposTipoParametroConta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoParametroConta = new JLabelMe();
		jLabelIdTipoParametroConta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoParametroConta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoParametroConta.setToolTipText(TipoParametroContaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoParametroConta= new GridBagLayout();

		this.jPanelidTipoParametroConta.setLayout(this.gridaBagLayoutTipoParametroConta);

		jLabelidTipoParametroConta = new JLabel();
		jLabelidTipoParametroConta.setText("Id");

		jLabelidTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoParametroConta = new JLabelMe();
		this.jLabelcodigoTipoParametroConta.setText(""+TipoParametroContaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoParametroConta.setToolTipText("Codigo");
		this.jLabelcodigoTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoParametroConta.setToolTipText(TipoParametroContaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoParametroConta = new GridBagLayout();
		this.jPanelcodigoTipoParametroConta.setLayout(this.gridaBagLayoutTipoParametroConta);


		jTextFieldcodigoTipoParametroConta= new JTextFieldMe();

		jTextFieldcodigoTipoParametroConta.setEnabled(false);
		jTextFieldcodigoTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoParametroContaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoParametroContaBusqueda.setText("U");
		this.jButtoncodigoTipoParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoParametroContaBusqueda"));

		if(this.tipoparametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoParametroContaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoParametroConta = new JLabelMe();
		this.jLabelnombreTipoParametroConta.setText(""+TipoParametroContaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoParametroConta.setToolTipText("Nombre");
		this.jLabelnombreTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoParametroConta.setToolTipText(TipoParametroContaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoParametroConta = new GridBagLayout();
		this.jPanelnombreTipoParametroConta.setLayout(this.gridaBagLayoutTipoParametroConta);


		jTextAreanombreTipoParametroConta= new JTextAreaMe();
		jTextAreanombreTipoParametroConta.setEnabled(false);
		jTextAreanombreTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParametroConta.setLineWrap(true);
		jTextAreanombreTipoParametroConta.setWrapStyleWord(true);
		jTextAreanombreTipoParametroConta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoParametroConta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoParametroConta = new JScrollPane(jTextAreanombreTipoParametroConta);
		jscrollPanenombreTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoParametroContaBusqueda= new JButtonMe();
		this.jButtonnombreTipoParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoParametroContaBusqueda.setText("U");
		this.jButtonnombreTipoParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoParametroContaBusqueda"));

		if(this.tipoparametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoParametroContaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoParametroConta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoParametroConta = new JLabelMe();
		this.jLabelid_empresaTipoParametroConta.setText(""+TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoParametroConta.setToolTipText("Empresa");
		this.jLabelid_empresaTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoParametroConta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoParametroConta.setToolTipText(TipoParametroContaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoParametroConta = new GridBagLayout();
		this.jPanelid_empresaTipoParametroConta.setLayout(this.gridaBagLayoutTipoParametroConta);


		jComboBoxid_empresaTipoParametroConta= new JComboBoxMe();
		jComboBoxid_empresaTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoParametroConta.setEnabled(false);

		this.jButtonid_empresaTipoParametroConta= new JButtonMe();
		this.jButtonid_empresaTipoParametroConta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoParametroConta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoParametroConta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoParametroConta.setText("Buscar");
		this.jButtonid_empresaTipoParametroConta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoParametroConta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoParametroConta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoParametroConta"));

		this.jButtonid_empresaTipoParametroContaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoParametroContaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoParametroContaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoParametroContaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoParametroContaBusqueda.setText("U");
		this.jButtonid_empresaTipoParametroContaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoParametroContaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoParametroContaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoParametroContaBusqueda"));

		if(this.tipoparametrocontaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoParametroContaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoParametroContaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoParametroContaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoParametroContaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoParametroContaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoParametroContaUpdate.setText("U");
		this.jButtonid_empresaTipoParametroContaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoParametroContaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoParametroContaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoParametroConta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoParametroConta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoParametroContaUpdate"));



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
		//this.jInternalFrameDetalleTipoParametroConta = new TipoParametroContaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Parametro Conta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoParametroConta= new GridBagLayout();
		

		
		String sToolTipTipoParametroConta="";
		sToolTipTipoParametroConta=TipoParametroContaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoParametroConta+="(Contabilidad.TipoParametroConta)";
		}
		
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoParametroConta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoParametroConta = new JButtonMe();
		this.jButtonModificarTipoParametroConta = new JButtonMe();
        this.jButtonActualizarTipoParametroConta = new JButtonMe();
        this.jButtonEliminarTipoParametroConta = new JButtonMe();
        this.jButtonCancelarTipoParametroConta = new JButtonMe();
        this.jButtonGuardarCambiosTipoParametroConta = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoParametroConta = new JButtonMe();
		this.jButtonCerrarTipoParametroConta = new JButtonMe();
		
		this.jScrollPanelDatosTipoParametroConta = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoParametroConta = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoParametroConta = new JScrollPane();
				
		
		
		this.jPanelCamposTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Parametro Conta";
		
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Parametro Contas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoParametroConta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoParametroConta.setName("jPanelCamposTipoParametroConta"); 

		this.jPanelCamposOcultosTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoParametroConta.setName("jPanelCamposOcultosTipoParametroConta"); 

        this.jPanelAccionesTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoParametroConta.setToolTipText("Acciones");
        this.jPanelAccionesTipoParametroConta.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoParametroConta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoParametroConta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoParametroConta.setText("Nuevo");
		this.jButtonModificarTipoParametroConta.setText("Editar");
        this.jButtonActualizarTipoParametroConta.setText("Actualizar");
        this.jButtonEliminarTipoParametroConta.setText("Eliminar");
        this.jButtonCancelarTipoParametroConta.setText("Cancelar");
        this.jButtonGuardarCambiosTipoParametroConta.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoParametroConta.setText("Guardar");
		this.jButtonCerrarTipoParametroConta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoParametroConta,"nuevo_button","Nuevo",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoParametroConta,"modificar_button","Editar",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoParametroConta,"actualizar_button","Actualizar",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoParametroConta,"eliminar_button","Eliminar",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoParametroConta,"cancelar_button","Cancelar",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoParametroConta,"guardarcambios_button","Guardar",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoParametroConta,"guardarcambiostabla_button","Guardar",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoParametroConta,"cerrar_button","Salir",this.tipoparametrocontaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoParametroConta.setToolTipText("Nuevo"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoParametroConta.setToolTipText("Editar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoParametroConta.setToolTipText("Actualizar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoParametroConta.setToolTipText("Eliminar)"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoParametroConta.setToolTipText("Cancelar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoParametroConta.setToolTipText("Guardar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoParametroConta.setToolTipText("Guardar"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoParametroConta.setToolTipText("Salir"+" "+TipoParametroContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoParametroConta";
		inputMap = this.jButtonNuevoTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoParametroConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoParametroConta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoParametroConta";
		inputMap = this.jButtonActualizarTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoParametroConta"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoParametroConta";
		inputMap = this.jButtonEliminarTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoParametroConta"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoParametroConta";
		inputMap = this.jButtonCancelarTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoParametroConta"));
		
		//CERRAR		
		sMapKey = "CerrarTipoParametroConta";
		inputMap = this.jButtonCerrarTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoParametroConta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoParametroConta";
		inputMap = this.jButtonGuardarCambiosTablaTipoParametroConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoParametroConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoParametroConta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoParametroConta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoParametroConta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoParametroConta.setToolTipText("Nuevo TipoParametroConta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoParametroConta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoParametroConta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoParametroConta.setToolTipText("Sin Cerrar Ventana TipoParametroConta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoParametroConta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoParametroConta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoParametroConta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoParametroConta.setText("Accion");
		this.jComboBoxTiposAccionesTipoParametroConta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoParametroConta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoParametroConta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoParametroConta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoParametroConta = new JLabelMe();
		
		this.jLabelAccionesTipoParametroConta.setText("Acciones");		
		this.jLabelAccionesTipoParametroConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParametroConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParametroConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoParametroConta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoParametroConta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoParametroConta=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoParametroConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoParametroConta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoParametroConta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParametroConta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParametroConta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoParametroConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoParametroConta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoParametroConta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoParametroConta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoParametroConta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoParametroConta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoParametroConta = new GridBagLayout();
		
		this.jPanelCamposTipoParametroConta.setLayout(gridaBagLayoutCamposTipoParametroConta);
		this.jPanelCamposOcultosTipoParametroConta.setLayout(gridaBagLayoutCamposOcultosTipoParametroConta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroConta.gridy = 0;
	this.gridBagConstraintsTipoParametroConta.gridx = 0;
	this.gridBagConstraintsTipoParametroConta.ipadx = 0;
	this.gridBagConstraintsTipoParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoParametroConta.add(jLabelIdTipoParametroConta, this.gridBagConstraintsTipoParametroConta);



	this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroConta.gridy = 0;
	this.gridBagConstraintsTipoParametroConta.gridx = 1;
	this.gridBagConstraintsTipoParametroConta.ipadx = 0;
	this.gridBagConstraintsTipoParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoParametroConta.add(jLabelidTipoParametroConta, this.gridBagConstraintsTipoParametroConta);


	this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroConta.gridy = 0;
	this.gridBagConstraintsTipoParametroConta.gridx = 0;
	this.gridBagConstraintsTipoParametroConta.ipadx = 0;
	this.gridBagConstraintsTipoParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoParametroConta.add(jLabelid_empresaTipoParametroConta, this.gridBagConstraintsTipoParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroConta.gridy = 0;
		this.gridBagConstraintsTipoParametroConta.gridx = 2;
		this.gridBagConstraintsTipoParametroConta.ipadx = 0;
		this.gridBagConstraintsTipoParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoParametroConta.add(jButtonid_empresaTipoParametroContaBusqueda, this.gridBagConstraintsTipoParametroConta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroConta.gridy = 0;
		this.gridBagConstraintsTipoParametroConta.gridx = 3;
		this.gridBagConstraintsTipoParametroConta.ipadx = 0;
		this.gridBagConstraintsTipoParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoParametroConta.add(jButtonid_empresaTipoParametroContaUpdate, this.gridBagConstraintsTipoParametroConta);
	}

	this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroConta.gridy = 0;
	this.gridBagConstraintsTipoParametroConta.gridx = 1;
	this.gridBagConstraintsTipoParametroConta.ipadx = 0;
	this.gridBagConstraintsTipoParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoParametroConta.add(jComboBoxid_empresaTipoParametroConta, this.gridBagConstraintsTipoParametroConta);


	this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroConta.gridy = 0;
	this.gridBagConstraintsTipoParametroConta.gridx = 0;
	this.gridBagConstraintsTipoParametroConta.ipadx = 0;
	this.gridBagConstraintsTipoParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoParametroConta.add(jLabelcodigoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroConta.gridy = 0;
		this.gridBagConstraintsTipoParametroConta.gridx = 2;
		this.gridBagConstraintsTipoParametroConta.ipadx = 0;
		this.gridBagConstraintsTipoParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoParametroConta.add(jButtoncodigoTipoParametroContaBusqueda, this.gridBagConstraintsTipoParametroConta);
	}

	this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroConta.gridy = 0;
	this.gridBagConstraintsTipoParametroConta.gridx = 1;
	this.gridBagConstraintsTipoParametroConta.ipadx = 0;
	this.gridBagConstraintsTipoParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoParametroConta.add(jTextFieldcodigoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);


	this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroConta.gridy = 0;
	this.gridBagConstraintsTipoParametroConta.gridx = 0;
	this.gridBagConstraintsTipoParametroConta.ipadx = 0;
	this.gridBagConstraintsTipoParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoParametroConta.add(jLabelnombreTipoParametroConta, this.gridBagConstraintsTipoParametroConta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		//this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroConta.gridy = 0;
		this.gridBagConstraintsTipoParametroConta.gridx = 2;
		this.gridBagConstraintsTipoParametroConta.ipadx = 0;
		this.gridBagConstraintsTipoParametroConta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoParametroConta.add(jButtonnombreTipoParametroContaBusqueda, this.gridBagConstraintsTipoParametroConta);
	}

	this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParametroConta.gridy = 0;
	this.gridBagConstraintsTipoParametroConta.gridx = 1;
	this.gridBagConstraintsTipoParametroConta.ipadx = 0;
	this.gridBagConstraintsTipoParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoParametroConta.add(jscrollPanenombreTipoParametroConta, this.gridBagConstraintsTipoParametroConta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParametroConta.gridy = iYPanelCamposTipoParametroConta;
	this.gridBagConstraintsTipoParametroConta.gridx = iXPanelCamposTipoParametroConta++;
	this.gridBagConstraintsTipoParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParametroConta.add(this.jPanelidTipoParametroConta, this.gridBagConstraintsTipoParametroConta);



	if(iXPanelCamposTipoParametroConta % 1==0) {
		iXPanelCamposTipoParametroConta=0;
		iYPanelCamposTipoParametroConta++;
	}
	this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParametroConta.gridy = iYPanelCamposTipoParametroConta;
	this.gridBagConstraintsTipoParametroConta.gridx = iXPanelCamposTipoParametroConta++;
	this.gridBagConstraintsTipoParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParametroConta.add(this.jPanelcodigoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);



	if(iXPanelCamposTipoParametroConta % 1==0) {
		iXPanelCamposTipoParametroConta=0;
		iYPanelCamposTipoParametroConta++;
	}
	this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParametroConta.gridy = iYPanelCamposTipoParametroConta;
	this.gridBagConstraintsTipoParametroConta.gridx = iXPanelCamposTipoParametroConta++;
	this.gridBagConstraintsTipoParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParametroConta.add(this.jPanelnombreTipoParametroConta, this.gridBagConstraintsTipoParametroConta);



	if(iXPanelCamposTipoParametroConta % 1==0) {
		iXPanelCamposTipoParametroConta=0;
		iYPanelCamposTipoParametroConta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParametroConta.gridy = iYPanelCamposOcultosTipoParametroConta;
	this.gridBagConstraintsTipoParametroConta.gridx = iXPanelCamposOcultosTipoParametroConta++;
	this.gridBagConstraintsTipoParametroConta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParametroConta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoParametroConta.add(this.jPanelid_empresaTipoParametroConta, this.gridBagConstraintsTipoParametroConta);



	if(iXPanelCamposOcultosTipoParametroConta % 1==0) {
		iXPanelCamposOcultosTipoParametroConta=0;
		iYPanelCamposOcultosTipoParametroConta++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesTipoParametroConta= new GridBagLayout();
		this.jPanelAccionesTipoParametroConta.setLayout(gridaBagLayoutAccionesTipoParametroConta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoParametroConta= new GridBagLayout();
		this.jPanelAccionesFormularioTipoParametroConta.setLayout(gridaBagLayoutAccionesFormularioTipoParametroConta);
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoParametroConta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoParametroConta.add(this.jComboBoxTiposAccionesFormularioTipoParametroConta, this.gridBagConstraintsTipoParametroConta);

		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoParametroConta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoParametroConta.add(this.jCheckBoxPostAccionNuevoTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoParametroConta.add(this.jCheckBoxPostAccionSinCerrarTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoparametrocontaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoParametroConta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoParametroConta.add(this.jCheckBoxPostAccionSinMensajeTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroConta.gridy = 0;
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoParametroConta.add(this.jButtonModificarTipoParametroConta, this.gridBagConstraintsTipoParametroConta);							

		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroConta.gridy = 0;
		this.gridBagConstraintsTipoParametroConta.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoParametroConta.add(this.jButtonEliminarTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		
			
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = 0;		
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoParametroConta.add(this.jButtonActualizarTipoParametroConta, this.gridBagConstraintsTipoParametroConta);


		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = 0;		
		this.gridBagConstraintsTipoParametroConta.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoParametroConta.add(this.jButtonGuardarCambiosTipoParametroConta, this.gridBagConstraintsTipoParametroConta);	
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = 0;		
		this.gridBagConstraintsTipoParametroConta.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoParametroConta.add(this.jButtonCancelarTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoParametroConta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoParametroConta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoparametrocontaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();						
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParametroConta.gridx = 0;		
			//this.gridBagConstraintsTipoParametroConta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoParametroConta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoParametroConta.gridx =0;
		this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoParametroConta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoParametroContaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoParametroConta = new TipoParametroContaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Parametro Conta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Parametro Conta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Parametro Conta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoParametroContaModel tipoparametrocontaModel=new TipoParametroContaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoParametroContaModel.TipoParametroContaFocusTraversalPolicy tipoparametrocontaFocusTraversalPolicy = tipoparametrocontaModel.new TipoParametroContaFocusTraversalPolicy(this);
			
			//tipoparametrocontaFocusTraversalPolicy.settipoparametrocontaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoparametrocontaModel);
			
			
			this.jContentPaneDetalleTipoParametroConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoParametroConta = new GridBagLayout();	
			this.jContentPaneDetalleTipoParametroConta.setLayout(gridaBagLayoutDetalleTipoParametroConta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoParametroConta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
				this.gridBagConstraintsTipoParametroConta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoParametroConta.gridx = 0;
					
				
				this.jContentPaneDetalleTipoParametroConta.add(jTtoolBarDetalleTipoParametroConta, gridBagConstraintsTipoParametroConta);								
				
}
			
			this.jScrollPanelDatosEdicionTipoParametroConta=   new JScrollPane(jContentPaneDetalleTipoParametroConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoParametroConta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParametroConta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParametroConta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoParametroConta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoParametroConta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParametroConta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParametroConta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoParametroConta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoParametroConta.gridx = 0;
	        
			this.jContentPaneDetalleTipoParametroConta.add(jPanelCamposTipoParametroConta, gridBagConstraintsTipoParametroConta);
			
			
			
			
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
						&& tipoparametrocontaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroContaDetalle(this.puedeCargarPorParteParametroContaDetalle,false,-1);
					
					if(this.tipoparametrocontaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoParametroConta= new GridBagConstraints();
						this.gridBagConstraintsTipoParametroConta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoParametroConta.gridx = 0;
						this.jContentPaneDetalleTipoParametroConta.add(this.jTabbedPaneRelacionesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoParametroConta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroContaDetalle(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoParametroConta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
					this.gridBagConstraintsTipoParametroConta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoParametroConta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoParametroConta.gridx = 0;
					
				
					this.jContentPaneDetalleTipoParametroConta.add(jPanelCamposOcultosTipoParametroConta, gridBagConstraintsTipoParametroConta);
				
					this.jPanelCamposOcultosTipoParametroConta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoParametroConta.gridx = 0;
	        this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoParametroConta.add(this.jPanelAccionesFormularioTipoParametroConta, this.gridBagConstraintsTipoParametroConta);							
			
			
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
	        this.gridBagConstraintsTipoParametroConta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoParametroConta.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoParametroConta.add(this.jPanelAccionesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoParametroConta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoParametroConta=   new JScrollPane(this.jPanelCamposTipoParametroConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoParametroConta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParametroConta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParametroConta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoParametroConta.gridx = 0;
			this.gridBagConstraintsTipoParametroConta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoParametroConta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoParametroConta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoParametroConta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoParametroConta, this.gridBagConstraintsTipoParametroConta);			
			
			this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroConta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoParametroConta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroConta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
			
			
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroConta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		
			
		this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroConta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroConta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoParametroConta, this.gridBagConstraintsTipoParametroConta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoParametroConta;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoParametroConta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameParametroContaDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
		this.parametrocontadetalleSessionBean.setConGuardarRelaciones(false);
		this.parametrocontadetalleSessionBean.setEsGuardarRelacionado(true);

		this.parametrocontadetalleBeanSwingJInternalFrame=null;//new ParametroContaDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocontadetalleBeanSwingJInternalFramePopup=new ParametroContaDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocontadetalleBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {

				ParametroContaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=TipoParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroContaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoParametroContaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocontadetalleSessionBean.setEsGuardarRelacionado(true);

				this.parametrocontadetalleBeanSwingJInternalFrame=new ParametroContaDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocontadetalleBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocontadetalleBeanSwingJInternalFrame.setparametrocontadetalleSessionBean(this.parametrocontadetalleSessionBean);

				//this.gridBagConstraintsTipoParametroConta = new GridBagConstraints();
				//this.gridBagConstraintsTipoParametroConta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoParametroConta.gridx = 0;
				//this.jContentPaneDetalleTipoParametroConta.add(this.parametrocontadetalleBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoParametroConta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoParametroConta.add("Parametro Conta Detalles",this.parametrocontadetalleBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoParametroConta.setComponentAt(iIndexTab,this.parametrocontadetalleBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroContaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocontadetalleSessionBean.setEsGuardarRelacionado(false);
				this.parametrocontadetalleBeanSwingJInternalFrame=null;//new ParametroContaDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroContaDetalle) {
					this.jTabbedPaneRelacionesTipoParametroConta.add("Parametro Conta Detalles",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroContaDetalleBeanSwingJInternalFrame(List<TipoParametroConta> tipoparametrocontas,TipoParametroConta tipoparametroconta,ParametroContaDetalleBeanSwingJInternalFrame parametrocontadetalleBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocontadetalleBeanSwingJInternalFrame=new ParametroContaDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocontadetalleBeanSwingJInternalFrame.getParametroContaDetalleLogic().setConnexion(this.tipoparametrocontaLogic.getConnexion());

					parametrocontadetalleBeanSwingJInternalFrame.settipoparametrocontasForeignKey(tipoparametrocontas);
					parametrocontadetalleBeanSwingJInternalFrame.settipoparametrocontaForeignKey(tipoparametroconta);
					parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleSessionBean.setisBusquedaDesdeForeignKeySesionTipoParametroConta(true);
					parametrocontadetalleBeanSwingJInternalFrame.parametrocontadetalleSessionBean.setlidTipoParametroContaActual(tipoparametroconta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocontadetalleBeanSwingJInternalFrame.cargarCombosForeignKeyParametroContaDetalle(parametrocontadetalleBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocontadetalleBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoParametroConta(true);
					parametrocontadetalleBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocontadetalleBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoParametroConta");
					parametrocontadetalleBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoParametroConta");
					parametrocontadetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContaDetalle(true);
					parametrocontadetalleBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroContaDetalle("n",parametrocontadetalleBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocontadetalleBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocontadetalleBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocontadetalleBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocontadetalleBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContaDetalle("relacionado");
					} else {
						parametrocontadetalleBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContaDetalle("no_relacionado");
					}

					parametrocontadetalleBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroContaDetalle().setVisible(false);

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
