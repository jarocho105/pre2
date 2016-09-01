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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.TipoDescripcionAsientoConstantesFunciones;

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
public class TipoDescripcionAsientoDetalleFormJInternalFrame extends TipoDescripcionAsientoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDescripcionAsiento;
	
	protected JMenuBar jmenuBarDetalleTipoDescripcionAsiento;
	
	protected JMenu jmenuDetalleTipoDescripcionAsiento;
	protected JMenu jmenuDetalleArchivoTipoDescripcionAsiento;
	protected JMenu jmenuDetalleAccionesTipoDescripcionAsiento;
	protected JMenu jmenuDetalleDatosTipoDescripcionAsiento;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDescripcionAsiento;	
	protected GridBagConstraints gridBagConstraintsTipoDescripcionAsiento;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDescripcionAsientoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDescripcionAsiento;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public TipoDescripcionAsientoSessionBean tipodescripcionasientoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;	
	
	public TipoDescripcionAsientoLogic tipodescripcionasientoLogic;
	
	public JScrollPane jScrollPanelDatosTipoDescripcionAsiento;
	public JScrollPane jScrollPanelDatosEdicionTipoDescripcionAsiento;
	public JScrollPane jScrollPanelDatosGeneralTipoDescripcionAsiento;
	
	protected JPanel jPanelCamposTipoDescripcionAsiento;    
	protected JPanel jPanelCamposOcultosTipoDescripcionAsiento;    	
	protected JPanel jPanelAccionesTipoDescripcionAsiento;
	protected JPanel jPanelAccionesFormularioTipoDescripcionAsiento;
    
	
	
	protected Integer iXPanelCamposTipoDescripcionAsiento=0;
	protected Integer iYPanelCamposTipoDescripcionAsiento=0;
	
	protected Integer iXPanelCamposOcultosTipoDescripcionAsiento=0;
	protected Integer iYPanelCamposOcultosTipoDescripcionAsiento=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDescripcionAsiento;
	public JButton jButtonModificarTipoDescripcionAsiento;
	public JButton jButtonActualizarTipoDescripcionAsiento;
    public JButton jButtonEliminarTipoDescripcionAsiento;
	public JButton jButtonCancelarTipoDescripcionAsiento;
    public JButton jButtonGuardarCambiosTipoDescripcionAsiento;
	public JButton jButtonGuardarCambiosTablaTipoDescripcionAsiento;
	protected JButton jButtonCerrarTipoDescripcionAsiento;
	
	
	protected JButton jButtonProcesarInformacionTipoDescripcionAsiento;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDescripcionAsiento;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDescripcionAsiento;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDescripcionAsiento;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDescripcionAsiento;
	protected JButton jButtonModificarToolBarTipoDescripcionAsiento;
	protected JButton jButtonActualizarToolBarTipoDescripcionAsiento;
    protected JButton jButtonEliminarToolBarTipoDescripcionAsiento;
	protected JButton jButtonCancelarToolBarTipoDescripcionAsiento;
    protected JButton jButtonGuardarCambiosToolBarTipoDescripcionAsiento;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDescripcionAsiento;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDescripcionAsiento;
	protected JButton jButtonCerrarToolBarTipoDescripcionAsiento;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDescripcionAsiento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDescripcionAsiento;
	protected JMenuItem jMenuItemModificarTipoDescripcionAsiento;
	protected JMenuItem jMenuItemActualizarTipoDescripcionAsiento;
    protected JMenuItem jMenuItemEliminarTipoDescripcionAsiento;
	protected JMenuItem jMenuItemCancelarTipoDescripcionAsiento;
    protected JMenuItem jMenuItemGuardarCambiosTipoDescripcionAsiento;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDescripcionAsiento;
	protected JMenuItem jMenuItemCerrarTipoDescripcionAsiento;
	protected JMenuItem jMenuItemDetalleCerrarTipoDescripcionAsiento;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDescripcionAsiento;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDescripcionAsiento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDescripcionAsiento;
	protected JMenuItem jMenuItemMostrarOcultarTipoDescripcionAsiento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDescripcionAsiento;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDescripcionAsiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDescripcionAsiento;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDescripcionAsiento;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDescripcionAsiento;
	public JLabel jLabelIdTipoDescripcionAsiento;
	public JLabel jLabelidTipoDescripcionAsiento;
	public JButton jButtonidTipoDescripcionAsientoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDescripcionAsiento;
	public JLabel jLabelcodigoTipoDescripcionAsiento;
	public JTextField jTextFieldcodigoTipoDescripcionAsiento;
	public JButton jButtoncodigoTipoDescripcionAsientoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDescripcionAsiento;
	public JLabel jLabelnombreTipoDescripcionAsiento;
	public JTextArea jTextAreanombreTipoDescripcionAsiento;
	public JScrollPane jscrollPanenombreTipoDescripcionAsiento;
	public JButton jButtonnombreTipoDescripcionAsientoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoDescripcionAsiento;
	public JLabel jLabelid_empresaTipoDescripcionAsiento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoDescripcionAsiento;
	public JButton jButtonid_empresaTipoDescripcionAsiento= new JButtonMe();
	public JButton jButtonid_empresaTipoDescripcionAsientoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoDescripcionAsientoBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloTipoDescripcionAsiento;
	public JLabel jLabelid_moduloTipoDescripcionAsiento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloTipoDescripcionAsiento;
	public JButton jButtonid_moduloTipoDescripcionAsiento= new JButtonMe();
	public JButton jButtonid_moduloTipoDescripcionAsientoUpdate= new JButtonMe();
	public JButton jButtonid_moduloTipoDescripcionAsientoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDescripcionAsiento;
	
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
	
	public TipoDescripcionAsientoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDescripcionAsiento=new JPanel();
				this.jPanelAccionesFormularioTipoDescripcionAsiento=new JPanel();
				this.jmenuBarDetalleTipoDescripcionAsiento=new JMenuBar();
				this.jTtoolBarDetalleTipoDescripcionAsiento=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDescripcionAsientoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDescripcionAsiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDescripcionAsientoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDescripcionAsiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDescripcionAsientoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDescripcionAsiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDescripcionAsientoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDescripcionAsiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDescripcionAsientoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDescripcionAsiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDescripcionAsiento() {
		return this.jButtonActualizarToolBarTipoDescripcionAsiento;
	}
	
	public JButton getjButtonEliminarToolBarTipoDescripcionAsiento() {
		return this.jButtonEliminarToolBarTipoDescripcionAsiento;
	}
	
	public JButton getjButtonCancelarToolBarTipoDescripcionAsiento() {
		return this.jButtonCancelarToolBarTipoDescripcionAsiento;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDescripcionAsiento() {
		return this.jButtonProcesarInformacionTipoDescripcionAsiento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDescripcionAsiento)	{
		this.jButtonProcesarInformacionTipoDescripcionAsiento = jButtonProcesarInformacionTipoDescripcionAsiento;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDescripcionAsiento() {
		return this.jComboBoxTiposAccionesTipoDescripcionAsiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDescripcionAsiento(
			JComboBox jComboBoxTiposRelacionesTipoDescripcionAsiento) {
		this.jComboBoxTiposRelacionesTipoDescripcionAsiento = jComboBoxTiposRelacionesTipoDescripcionAsiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDescripcionAsiento(
			JComboBox jComboBoxTiposAccionesTipoDescripcionAsiento) {
		this.jComboBoxTiposAccionesTipoDescripcionAsiento = jComboBoxTiposAccionesTipoDescripcionAsiento;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDescripcionAsiento() {
		return this.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDescripcionAsiento(
			JComboBox jComboBoxTiposAccionesFormularioTipoDescripcionAsiento) {
		this.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento = jComboBoxTiposAccionesFormularioTipoDescripcionAsiento;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodescripcionasientoSessionBean=new TipoDescripcionAsientoSessionBean();
		
		this.tipodescripcionasientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodescripcionasientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDescripcionAsientoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDescripcionAsientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDescripcionAsientoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Descripcion Asiento Contable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDescripcionAsientoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDescripcionAsiento= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDescripcionAsiento=new JButtonMe();
				this.jButtonModificarToolBarTipoDescripcionAsiento=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDescripcionAsiento,this.jTtoolBarDetalleTipoDescripcionAsiento,
							"actualizar","actualizar","Actualizar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDescripcionAsiento,this.jTtoolBarDetalleTipoDescripcionAsiento,
							"eliminar","eliminar","Eliminar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDescripcionAsiento,this.jTtoolBarDetalleTipoDescripcionAsiento,
							"cancelar","cancelar","Cancelar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDescripcionAsiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDescripcionAsiento,this.jTtoolBarDetalleTipoDescripcionAsiento,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDescripcionAsiento=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDescripcionAsiento=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDescripcionAsiento=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDescripcionAsiento=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDescripcionAsiento=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDescripcionAsiento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDescripcionAsiento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDescripcionAsiento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDescripcionAsiento= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDescripcionAsiento.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDescripcionAsiento,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDescripcionAsiento= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDescripcionAsiento.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDescripcionAsiento,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDescripcionAsiento= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDescripcionAsiento.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDescripcionAsiento,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDescripcionAsiento= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDescripcionAsiento.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDescripcionAsiento,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDescripcionAsiento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDescripcionAsiento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDescripcionAsiento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDescripcionAsiento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDescripcionAsiento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDescripcionAsiento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDescripcionAsiento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDescripcionAsiento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDescripcionAsiento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDescripcionAsiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDescripcionAsiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDescripcionAsiento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDescripcionAsiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDescripcionAsiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDescripcionAsiento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDescripcionAsiento.add(this.jMenuItemDetalleCerrarTipoDescripcionAsiento);
		
		this.jmenuDetalleAccionesTipoDescripcionAsiento.add(this.jMenuItemActualizarTipoDescripcionAsiento);
		this.jmenuDetalleAccionesTipoDescripcionAsiento.add(this.jMenuItemEliminarTipoDescripcionAsiento);
		this.jmenuDetalleAccionesTipoDescripcionAsiento.add(this.jMenuItemCancelarTipoDescripcionAsiento);		
		
		//this.jmenuDetalleDatosTipoDescripcionAsiento.add(this.jMenuItemDetalleAbrirOrderByTipoDescripcionAsiento);				
		this.jmenuDetalleDatosTipoDescripcionAsiento.add(this.jMenuItemDetalleMostarOcultarTipoDescripcionAsiento);				
				
		//this.jmenuDetalleAccionesTipoDescripcionAsiento.add(this.jMenuItemGuardarCambiosTipoDescripcionAsiento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDescripcionAsiento.add(this.jmenuDetalleArchivoTipoDescripcionAsiento);		
		this.jmenuBarDetalleTipoDescripcionAsiento.add(this.jmenuDetalleAccionesTipoDescripcionAsiento);		
		this.jmenuBarDetalleTipoDescripcionAsiento.add(this.jmenuDetalleDatosTipoDescripcionAsiento);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDescripcionAsiento);				
	}
	
	
	public void inicializarElementosCamposTipoDescripcionAsiento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDescripcionAsiento = new JLabelMe();
		jLabelIdTipoDescripcionAsiento.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDescripcionAsiento = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDescripcionAsiento.setToolTipText(TipoDescripcionAsientoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDescripcionAsiento= new GridBagLayout();

		this.jPanelidTipoDescripcionAsiento.setLayout(this.gridaBagLayoutTipoDescripcionAsiento);

		jLabelidTipoDescripcionAsiento = new JLabel();
		jLabelidTipoDescripcionAsiento.setText("Id");

		jLabelidTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDescripcionAsiento = new JLabelMe();
		this.jLabelcodigoTipoDescripcionAsiento.setText(""+TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDescripcionAsiento.setToolTipText("Codigo");
		this.jLabelcodigoTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDescripcionAsiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDescripcionAsiento.setToolTipText(TipoDescripcionAsientoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDescripcionAsiento = new GridBagLayout();
		this.jPanelcodigoTipoDescripcionAsiento.setLayout(this.gridaBagLayoutTipoDescripcionAsiento);


		jTextFieldcodigoTipoDescripcionAsiento= new JTextFieldMe();

		jTextFieldcodigoTipoDescripcionAsiento.setEnabled(false);
		jTextFieldcodigoTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDescripcionAsientoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDescripcionAsientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDescripcionAsientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDescripcionAsientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDescripcionAsientoBusqueda.setText("U");
		this.jButtoncodigoTipoDescripcionAsientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDescripcionAsientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDescripcionAsientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDescripcionAsiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDescripcionAsiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDescripcionAsientoBusqueda"));

		if(this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDescripcionAsientoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDescripcionAsiento = new JLabelMe();
		this.jLabelnombreTipoDescripcionAsiento.setText(""+TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDescripcionAsiento.setToolTipText("Nombre");
		this.jLabelnombreTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDescripcionAsiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDescripcionAsiento.setToolTipText(TipoDescripcionAsientoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDescripcionAsiento = new GridBagLayout();
		this.jPanelnombreTipoDescripcionAsiento.setLayout(this.gridaBagLayoutTipoDescripcionAsiento);


		jTextAreanombreTipoDescripcionAsiento= new JTextAreaMe();
		jTextAreanombreTipoDescripcionAsiento.setEnabled(false);
		jTextAreanombreTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDescripcionAsiento.setLineWrap(true);
		jTextAreanombreTipoDescripcionAsiento.setWrapStyleWord(true);
		jTextAreanombreTipoDescripcionAsiento.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDescripcionAsiento.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDescripcionAsiento = new JScrollPane(jTextAreanombreTipoDescripcionAsiento);
		jscrollPanenombreTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoDescripcionAsientoBusqueda= new JButtonMe();
		this.jButtonnombreTipoDescripcionAsientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDescripcionAsientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDescripcionAsientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDescripcionAsientoBusqueda.setText("U");
		this.jButtonnombreTipoDescripcionAsientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDescripcionAsientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDescripcionAsientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDescripcionAsiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDescripcionAsiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDescripcionAsientoBusqueda"));

		if(this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDescripcionAsientoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDescripcionAsiento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoDescripcionAsiento = new JLabelMe();
		this.jLabelid_empresaTipoDescripcionAsiento.setText(""+TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoDescripcionAsiento.setToolTipText("Empresa");
		this.jLabelid_empresaTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoDescripcionAsiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoDescripcionAsiento.setToolTipText(TipoDescripcionAsientoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoDescripcionAsiento = new GridBagLayout();
		this.jPanelid_empresaTipoDescripcionAsiento.setLayout(this.gridaBagLayoutTipoDescripcionAsiento);


		jComboBoxid_empresaTipoDescripcionAsiento= new JComboBoxMe();
		jComboBoxid_empresaTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoDescripcionAsiento.setEnabled(false);

		this.jButtonid_empresaTipoDescripcionAsiento= new JButtonMe();
		this.jButtonid_empresaTipoDescripcionAsiento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDescripcionAsiento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDescripcionAsiento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDescripcionAsiento.setText("Buscar");
		this.jButtonid_empresaTipoDescripcionAsiento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoDescripcionAsiento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDescripcionAsiento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoDescripcionAsiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDescripcionAsiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDescripcionAsiento"));

		this.jButtonid_empresaTipoDescripcionAsientoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoDescripcionAsientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDescripcionAsientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDescripcionAsientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDescripcionAsientoBusqueda.setText("U");
		this.jButtonid_empresaTipoDescripcionAsientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoDescripcionAsientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDescripcionAsientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoDescripcionAsiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDescripcionAsiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDescripcionAsientoBusqueda"));

		if(this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoDescripcionAsientoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoDescripcionAsientoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoDescripcionAsientoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDescripcionAsientoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDescripcionAsientoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDescripcionAsientoUpdate.setText("U");
		this.jButtonid_empresaTipoDescripcionAsientoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoDescripcionAsientoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDescripcionAsientoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoDescripcionAsiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDescripcionAsiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDescripcionAsientoUpdate"));



					
		this.jLabelid_moduloTipoDescripcionAsiento = new JLabelMe();
		this.jLabelid_moduloTipoDescripcionAsiento.setText(""+TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloTipoDescripcionAsiento.setToolTipText("Modulo");
		this.jLabelid_moduloTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloTipoDescripcionAsiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloTipoDescripcionAsiento.setToolTipText(TipoDescripcionAsientoConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutTipoDescripcionAsiento = new GridBagLayout();
		this.jPanelid_moduloTipoDescripcionAsiento.setLayout(this.gridaBagLayoutTipoDescripcionAsiento);


		jComboBoxid_moduloTipoDescripcionAsiento= new JComboBoxMe();
		jComboBoxid_moduloTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloTipoDescripcionAsiento= new JButtonMe();
		this.jButtonid_moduloTipoDescripcionAsiento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoDescripcionAsiento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoDescripcionAsiento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoDescripcionAsiento.setText("Buscar");
		this.jButtonid_moduloTipoDescripcionAsiento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloTipoDescripcionAsiento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoDescripcionAsiento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloTipoDescripcionAsiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoDescripcionAsiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoDescripcionAsiento"));

		this.jButtonid_moduloTipoDescripcionAsientoBusqueda= new JButtonMe();
		this.jButtonid_moduloTipoDescripcionAsientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoDescripcionAsientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoDescripcionAsientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTipoDescripcionAsientoBusqueda.setText("U");
		this.jButtonid_moduloTipoDescripcionAsientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloTipoDescripcionAsientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoDescripcionAsientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloTipoDescripcionAsiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoDescripcionAsiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoDescripcionAsientoBusqueda"));

		if(this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloTipoDescripcionAsientoBusqueda.setVisible(false);		}

		this.jButtonid_moduloTipoDescripcionAsientoUpdate= new JButtonMe();
		this.jButtonid_moduloTipoDescripcionAsientoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoDescripcionAsientoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoDescripcionAsientoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTipoDescripcionAsientoUpdate.setText("U");
		this.jButtonid_moduloTipoDescripcionAsientoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloTipoDescripcionAsientoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoDescripcionAsientoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloTipoDescripcionAsiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoDescripcionAsiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoDescripcionAsientoUpdate"));



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
		//this.jInternalFrameDetalleTipoDescripcionAsiento = new TipoDescripcionAsientoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Descripcion Asiento Contable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDescripcionAsiento= new GridBagLayout();
		

		
		String sToolTipTipoDescripcionAsiento="";
		sToolTipTipoDescripcionAsiento=TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDescripcionAsiento+="(Contabilidad.TipoDescripcionAsiento)";
		}
		
		if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDescripcionAsiento+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDescripcionAsiento = new JButtonMe();
		this.jButtonModificarTipoDescripcionAsiento = new JButtonMe();
        this.jButtonActualizarTipoDescripcionAsiento = new JButtonMe();
        this.jButtonEliminarTipoDescripcionAsiento = new JButtonMe();
        this.jButtonCancelarTipoDescripcionAsiento = new JButtonMe();
        this.jButtonGuardarCambiosTipoDescripcionAsiento = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDescripcionAsiento = new JButtonMe();
		this.jButtonCerrarTipoDescripcionAsiento = new JButtonMe();
		
		this.jScrollPanelDatosTipoDescripcionAsiento = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDescripcionAsiento = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDescripcionAsiento = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Descripcion Asiento Contable";
		
		if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Descripcion Asiento Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDescripcionAsiento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDescripcionAsiento.setName("jPanelCamposTipoDescripcionAsiento"); 

		this.jPanelCamposOcultosTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDescripcionAsiento.setName("jPanelCamposOcultosTipoDescripcionAsiento"); 

        this.jPanelAccionesTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDescripcionAsiento.setToolTipText("Acciones");
        this.jPanelAccionesTipoDescripcionAsiento.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDescripcionAsiento.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDescripcionAsiento.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDescripcionAsiento.setText("Nuevo");
		this.jButtonModificarTipoDescripcionAsiento.setText("Editar");
        this.jButtonActualizarTipoDescripcionAsiento.setText("Actualizar");
        this.jButtonEliminarTipoDescripcionAsiento.setText("Eliminar");
        this.jButtonCancelarTipoDescripcionAsiento.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDescripcionAsiento.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.setText("Guardar");
		this.jButtonCerrarTipoDescripcionAsiento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDescripcionAsiento,"nuevo_button","Nuevo",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDescripcionAsiento,"modificar_button","Editar",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDescripcionAsiento,"actualizar_button","Actualizar",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDescripcionAsiento,"eliminar_button","Eliminar",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDescripcionAsiento,"cancelar_button","Cancelar",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDescripcionAsiento,"guardarcambios_button","Guardar",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDescripcionAsiento,"guardarcambiostabla_button","Guardar",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDescripcionAsiento,"cerrar_button","Salir",this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDescripcionAsiento.setToolTipText("Nuevo"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDescripcionAsiento.setToolTipText("Editar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDescripcionAsiento.setToolTipText("Actualizar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDescripcionAsiento.setToolTipText("Eliminar)"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDescripcionAsiento.setToolTipText("Cancelar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDescripcionAsiento.setToolTipText("Guardar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.setToolTipText("Guardar"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDescripcionAsiento.setToolTipText("Salir"+" "+TipoDescripcionAsientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDescripcionAsiento";
		inputMap = this.jButtonNuevoTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDescripcionAsiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDescripcionAsiento"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDescripcionAsiento";
		inputMap = this.jButtonActualizarTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDescripcionAsiento"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDescripcionAsiento";
		inputMap = this.jButtonEliminarTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDescripcionAsiento"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDescripcionAsiento";
		inputMap = this.jButtonCancelarTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDescripcionAsiento"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDescripcionAsiento";
		inputMap = this.jButtonCerrarTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDescripcionAsiento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDescripcionAsiento";
		inputMap = this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDescripcionAsiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDescripcionAsiento"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDescripcionAsiento = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDescripcionAsiento.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDescripcionAsiento.setToolTipText("Nuevo TipoDescripcionAsiento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDescripcionAsiento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDescripcionAsiento.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDescripcionAsiento.setToolTipText("Sin Cerrar Ventana TipoDescripcionAsiento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDescripcionAsiento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDescripcionAsiento.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDescripcionAsiento.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDescripcionAsiento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDescripcionAsiento.setText("Accion");
		this.jComboBoxTiposAccionesTipoDescripcionAsiento.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDescripcionAsiento = new JLabelMe();
		
		this.jLabelAccionesTipoDescripcionAsiento.setText("Acciones");		
		this.jLabelAccionesTipoDescripcionAsiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDescripcionAsiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDescripcionAsiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDescripcionAsiento();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDescripcionAsiento();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDescripcionAsiento=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDescripcionAsiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDescripcionAsiento,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDescripcionAsiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDescripcionAsiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDescripcionAsiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDescripcionAsiento = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDescripcionAsiento = new GridBagLayout();
		
		this.jPanelCamposTipoDescripcionAsiento.setLayout(gridaBagLayoutCamposTipoDescripcionAsiento);
		this.jPanelCamposOcultosTipoDescripcionAsiento.setLayout(gridaBagLayoutCamposOcultosTipoDescripcionAsiento);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDescripcionAsiento.add(jLabelIdTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);



	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = 1;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDescripcionAsiento.add(jLabelidTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);


	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoDescripcionAsiento.add(jLabelid_empresaTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 2;
		this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDescripcionAsiento.add(jButtonid_empresaTipoDescripcionAsientoBusqueda, this.gridBagConstraintsTipoDescripcionAsiento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 3;
		this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDescripcionAsiento.add(jButtonid_empresaTipoDescripcionAsientoUpdate, this.gridBagConstraintsTipoDescripcionAsiento);
	}

	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = 1;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoDescripcionAsiento.add(jComboBoxid_empresaTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);


	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloTipoDescripcionAsiento.add(jLabelid_moduloTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 2;
		this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTipoDescripcionAsiento.add(jButtonid_moduloTipoDescripcionAsientoBusqueda, this.gridBagConstraintsTipoDescripcionAsiento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 3;
		this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTipoDescripcionAsiento.add(jButtonid_moduloTipoDescripcionAsientoUpdate, this.gridBagConstraintsTipoDescripcionAsiento);
	}

	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = 1;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloTipoDescripcionAsiento.add(jComboBoxid_moduloTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);


	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDescripcionAsiento.add(jLabelcodigoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 2;
		this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDescripcionAsiento.add(jButtoncodigoTipoDescripcionAsientoBusqueda, this.gridBagConstraintsTipoDescripcionAsiento);
	}

	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = 1;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDescripcionAsiento.add(jTextFieldcodigoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);


	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDescripcionAsiento.add(jLabelnombreTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 2;
		this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDescripcionAsiento.add(jButtonnombreTipoDescripcionAsientoBusqueda, this.gridBagConstraintsTipoDescripcionAsiento);
	}

	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = 1;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDescripcionAsiento.add(jscrollPanenombreTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = iYPanelCamposTipoDescripcionAsiento;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = iXPanelCamposTipoDescripcionAsiento++;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDescripcionAsiento.add(this.jPanelidTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);



	if(iXPanelCamposTipoDescripcionAsiento % 1==0) {
		iXPanelCamposTipoDescripcionAsiento=0;
		iYPanelCamposTipoDescripcionAsiento++;
	}
	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = iYPanelCamposTipoDescripcionAsiento;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = iXPanelCamposTipoDescripcionAsiento++;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDescripcionAsiento.add(this.jPanelid_moduloTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);



	if(iXPanelCamposTipoDescripcionAsiento % 1==0) {
		iXPanelCamposTipoDescripcionAsiento=0;
		iYPanelCamposTipoDescripcionAsiento++;
	}
	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = iYPanelCamposTipoDescripcionAsiento;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = iXPanelCamposTipoDescripcionAsiento++;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDescripcionAsiento.add(this.jPanelcodigoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);



	if(iXPanelCamposTipoDescripcionAsiento % 1==0) {
		iXPanelCamposTipoDescripcionAsiento=0;
		iYPanelCamposTipoDescripcionAsiento++;
	}
	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = iYPanelCamposTipoDescripcionAsiento;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = iXPanelCamposTipoDescripcionAsiento++;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDescripcionAsiento.add(this.jPanelnombreTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);



	if(iXPanelCamposTipoDescripcionAsiento % 1==0) {
		iXPanelCamposTipoDescripcionAsiento=0;
		iYPanelCamposTipoDescripcionAsiento++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDescripcionAsiento.gridy = iYPanelCamposOcultosTipoDescripcionAsiento;
	this.gridBagConstraintsTipoDescripcionAsiento.gridx = iXPanelCamposOcultosTipoDescripcionAsiento++;
	this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDescripcionAsiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoDescripcionAsiento.add(this.jPanelid_empresaTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);



	if(iXPanelCamposOcultosTipoDescripcionAsiento % 1==0) {
		iXPanelCamposOcultosTipoDescripcionAsiento=0;
		iYPanelCamposOcultosTipoDescripcionAsiento++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDescripcionAsiento= new GridBagLayout();
		this.jPanelAccionesTipoDescripcionAsiento.setLayout(gridaBagLayoutAccionesTipoDescripcionAsiento);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDescripcionAsiento= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDescripcionAsiento.setLayout(gridaBagLayoutAccionesFormularioTipoDescripcionAsiento);
		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDescripcionAsiento.add(this.jComboBoxTiposAccionesFormularioTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);

		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDescripcionAsiento.add(this.jCheckBoxPostAccionNuevoTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodescripcionasientoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDescripcionAsiento.add(this.jCheckBoxPostAccionSinCerrarTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodescripcionasientoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDescripcionAsiento.add(this.jCheckBoxPostAccionSinMensajeTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDescripcionAsiento.add(this.jButtonModificarTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);							

		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDescripcionAsiento.add(this.jButtonEliminarTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		
			
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDescripcionAsiento.add(this.jButtonActualizarTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);


		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDescripcionAsiento.add(this.jButtonGuardarCambiosTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);	
		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = 0;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDescripcionAsiento.add(this.jButtonCancelarTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDescripcionAsiento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDescripcionAsiento);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodescripcionasientoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();						
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;		
			//this.gridBagConstraintsTipoDescripcionAsiento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDescripcionAsiento.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDescripcionAsiento.gridx =0;
		this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDescripcionAsiento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDescripcionAsientoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDescripcionAsiento = new TipoDescripcionAsientoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Descripcion Asiento Contable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Descripcion Asiento Contable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Descripcion Asiento Contable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDescripcionAsientoModel tipodescripcionasientoModel=new TipoDescripcionAsientoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDescripcionAsientoModel.TipoDescripcionAsientoFocusTraversalPolicy tipodescripcionasientoFocusTraversalPolicy = tipodescripcionasientoModel.new TipoDescripcionAsientoFocusTraversalPolicy(this);
			
			//tipodescripcionasientoFocusTraversalPolicy.settipodescripcionasientoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodescripcionasientoModel);
			
			
			this.jContentPaneDetalleTipoDescripcionAsiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDescripcionAsiento = new GridBagLayout();	
			this.jContentPaneDetalleTipoDescripcionAsiento.setLayout(gridaBagLayoutDetalleTipoDescripcionAsiento);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDescripcionAsiento = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
				this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDescripcionAsiento.add(jTtoolBarDetalleTipoDescripcionAsiento, gridBagConstraintsTipoDescripcionAsiento);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDescripcionAsiento=   new JScrollPane(jContentPaneDetalleTipoDescripcionAsiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDescripcionAsiento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
	        
			this.jContentPaneDetalleTipoDescripcionAsiento.add(jPanelCamposTipoDescripcionAsiento, gridBagConstraintsTipoDescripcionAsiento);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipodescripcionasientoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipodescripcionasientoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDescripcionAsiento= new GridBagConstraints();
						this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
						this.jContentPaneDetalleTipoDescripcionAsiento.add(this.jTabbedPaneRelacionesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDescripcionAsiento.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDescripcionAsiento.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
					this.gridBagConstraintsTipoDescripcionAsiento.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDescripcionAsiento.add(jPanelCamposOcultosTipoDescripcionAsiento, gridBagConstraintsTipoDescripcionAsiento);
				
					this.jPanelCamposOcultosTipoDescripcionAsiento.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
	        this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDescripcionAsiento.add(this.jPanelAccionesFormularioTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);							
			
			
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
	        this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDescripcionAsiento.add(this.jPanelAccionesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDescripcionAsiento);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDescripcionAsiento=   new JScrollPane(this.jPanelCamposTipoDescripcionAsiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDescripcionAsiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
			this.gridBagConstraintsTipoDescripcionAsiento.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDescripcionAsiento.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDescripcionAsiento.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);			
			
			this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
			this.gridBagConstraintsTipoDescripcionAsiento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
			
			
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		
			
		this.gridBagConstraintsTipoDescripcionAsiento = new GridBagConstraints();
		this.gridBagConstraintsTipoDescripcionAsiento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDescripcionAsiento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDescripcionAsiento, this.gridBagConstraintsTipoDescripcionAsiento);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDescripcionAsiento;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDescripcionAsiento;
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
