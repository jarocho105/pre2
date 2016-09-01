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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.TipoMermaEmpresaConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class TipoMermaEmpresaDetalleFormJInternalFrame extends TipoMermaEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoMermaEmpresa;
	
	protected JMenuBar jmenuBarDetalleTipoMermaEmpresa;
	
	protected JMenu jmenuDetalleTipoMermaEmpresa;
	protected JMenu jmenuDetalleArchivoTipoMermaEmpresa;
	protected JMenu jmenuDetalleAccionesTipoMermaEmpresa;
	protected JMenu jmenuDetalleDatosTipoMermaEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMermaEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoMermaEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoMermaEmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoMermaEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoMermaEmpresaSessionBean tipomermaempresaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoMermaEmpresaLogic tipomermaempresaLogic;
	
	public JScrollPane jScrollPanelDatosTipoMermaEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoMermaEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoMermaEmpresa;
	
	protected JPanel jPanelCamposTipoMermaEmpresa;    
	protected JPanel jPanelCamposOcultosTipoMermaEmpresa;    	
	protected JPanel jPanelAccionesTipoMermaEmpresa;
	protected JPanel jPanelAccionesFormularioTipoMermaEmpresa;
    
	
	
	protected Integer iXPanelCamposTipoMermaEmpresa=0;
	protected Integer iYPanelCamposTipoMermaEmpresa=0;
	
	protected Integer iXPanelCamposOcultosTipoMermaEmpresa=0;
	protected Integer iYPanelCamposOcultosTipoMermaEmpresa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoMermaEmpresa;
	public JButton jButtonModificarTipoMermaEmpresa;
	public JButton jButtonActualizarTipoMermaEmpresa;
    public JButton jButtonEliminarTipoMermaEmpresa;
	public JButton jButtonCancelarTipoMermaEmpresa;
    public JButton jButtonGuardarCambiosTipoMermaEmpresa;
	public JButton jButtonGuardarCambiosTablaTipoMermaEmpresa;
	protected JButton jButtonCerrarTipoMermaEmpresa;
	
	
	protected JButton jButtonProcesarInformacionTipoMermaEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoMermaEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoMermaEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoMermaEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMermaEmpresa;
	protected JButton jButtonModificarToolBarTipoMermaEmpresa;
	protected JButton jButtonActualizarToolBarTipoMermaEmpresa;
    protected JButton jButtonEliminarToolBarTipoMermaEmpresa;
	protected JButton jButtonCancelarToolBarTipoMermaEmpresa;
    protected JButton jButtonGuardarCambiosToolBarTipoMermaEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoMermaEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMermaEmpresa;
	protected JButton jButtonCerrarToolBarTipoMermaEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarTipoMermaEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMermaEmpresa;
	protected JMenuItem jMenuItemModificarTipoMermaEmpresa;
	protected JMenuItem jMenuItemActualizarTipoMermaEmpresa;
    protected JMenuItem jMenuItemEliminarTipoMermaEmpresa;
	protected JMenuItem jMenuItemCancelarTipoMermaEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosTipoMermaEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMermaEmpresa;
	protected JMenuItem jMenuItemCerrarTipoMermaEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoMermaEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMermaEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoMermaEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMermaEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoMermaEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMermaEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMermaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMermaEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoMermaEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoMermaEmpresa;
	public JLabel jLabelIdTipoMermaEmpresa;
	public JLabel jLabelidTipoMermaEmpresa;
	public JButton jButtonidTipoMermaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoMermaEmpresa;
	public JLabel jLabelnombreTipoMermaEmpresa;
	public JTextArea jTextAreanombreTipoMermaEmpresa;
	public JScrollPane jscrollPanenombreTipoMermaEmpresa;
	public JButton jButtonnombreTipoMermaEmpresaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoMermaEmpresa;
	public JLabel jLabeldescripcionTipoMermaEmpresa;
	public JTextArea jTextAreadescripcionTipoMermaEmpresa;
	public JScrollPane jscrollPanedescripcionTipoMermaEmpresa;
	public JButton jButtondescripcionTipoMermaEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoMermaEmpresa;
	public JLabel jLabelid_empresaTipoMermaEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoMermaEmpresa;
	public JButton jButtonid_empresaTipoMermaEmpresa= new JButtonMe();
	public JButton jButtonid_empresaTipoMermaEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoMermaEmpresaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoMermaEmpresa;
	
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
	
	public TipoMermaEmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoMermaEmpresa=new JPanel();
				this.jPanelAccionesFormularioTipoMermaEmpresa=new JPanel();
				this.jmenuBarDetalleTipoMermaEmpresa=new JMenuBar();
				this.jTtoolBarDetalleTipoMermaEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaEmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoMermaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoMermaEmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoMermaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaEmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMermaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaEmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMermaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMermaEmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMermaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoMermaEmpresa() {
		return this.jButtonActualizarToolBarTipoMermaEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarTipoMermaEmpresa() {
		return this.jButtonEliminarToolBarTipoMermaEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarTipoMermaEmpresa() {
		return this.jButtonCancelarToolBarTipoMermaEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionTipoMermaEmpresa() {
		return this.jButtonProcesarInformacionTipoMermaEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMermaEmpresa)	{
		this.jButtonProcesarInformacionTipoMermaEmpresa = jButtonProcesarInformacionTipoMermaEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMermaEmpresa() {
		return this.jComboBoxTiposAccionesTipoMermaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMermaEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoMermaEmpresa) {
		this.jComboBoxTiposRelacionesTipoMermaEmpresa = jComboBoxTiposRelacionesTipoMermaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMermaEmpresa(
			JComboBox jComboBoxTiposAccionesTipoMermaEmpresa) {
		this.jComboBoxTiposAccionesTipoMermaEmpresa = jComboBoxTiposAccionesTipoMermaEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoMermaEmpresa() {
		return this.jComboBoxTiposAccionesFormularioTipoMermaEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoMermaEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioTipoMermaEmpresa) {
		this.jComboBoxTiposAccionesFormularioTipoMermaEmpresa = jComboBoxTiposAccionesFormularioTipoMermaEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipomermaempresaSessionBean=new TipoMermaEmpresaSessionBean();
		
		this.tipomermaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomermaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomermaempresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMermaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMermaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMermaEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Merma Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoMermaEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoMermaEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoMermaEmpresa=new JButtonMe();
				this.jButtonModificarToolBarTipoMermaEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoMermaEmpresa,this.jTtoolBarDetalleTipoMermaEmpresa,
							"actualizar","actualizar","Actualizar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoMermaEmpresa,this.jTtoolBarDetalleTipoMermaEmpresa,
							"eliminar","eliminar","Eliminar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoMermaEmpresa,this.jTtoolBarDetalleTipoMermaEmpresa,
							"cancelar","cancelar","Cancelar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoMermaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoMermaEmpresa,this.jTtoolBarDetalleTipoMermaEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoMermaEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoMermaEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoMermaEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoMermaEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoMermaEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMermaEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMermaEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMermaEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoMermaEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoMermaEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoMermaEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoMermaEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoMermaEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoMermaEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoMermaEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoMermaEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoMermaEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoMermaEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoMermaEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoMermaEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoMermaEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMermaEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMermaEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMermaEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMermaEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMermaEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoMermaEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoMermaEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoMermaEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMermaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMermaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMermaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMermaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMermaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMermaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoMermaEmpresa.add(this.jMenuItemDetalleCerrarTipoMermaEmpresa);
		
		this.jmenuDetalleAccionesTipoMermaEmpresa.add(this.jMenuItemActualizarTipoMermaEmpresa);
		this.jmenuDetalleAccionesTipoMermaEmpresa.add(this.jMenuItemEliminarTipoMermaEmpresa);
		this.jmenuDetalleAccionesTipoMermaEmpresa.add(this.jMenuItemCancelarTipoMermaEmpresa);		
		
		//this.jmenuDetalleDatosTipoMermaEmpresa.add(this.jMenuItemDetalleAbrirOrderByTipoMermaEmpresa);				
		this.jmenuDetalleDatosTipoMermaEmpresa.add(this.jMenuItemDetalleMostarOcultarTipoMermaEmpresa);				
				
		//this.jmenuDetalleAccionesTipoMermaEmpresa.add(this.jMenuItemGuardarCambiosTipoMermaEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoMermaEmpresa.add(this.jmenuDetalleArchivoTipoMermaEmpresa);		
		this.jmenuBarDetalleTipoMermaEmpresa.add(this.jmenuDetalleAccionesTipoMermaEmpresa);		
		this.jmenuBarDetalleTipoMermaEmpresa.add(this.jmenuDetalleDatosTipoMermaEmpresa);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoMermaEmpresa);				
	}
	
	
	public void inicializarElementosCamposTipoMermaEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoMermaEmpresa = new JLabelMe();
		jLabelIdTipoMermaEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoMermaEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoMermaEmpresa.setToolTipText(TipoMermaEmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoMermaEmpresa= new GridBagLayout();

		this.jPanelidTipoMermaEmpresa.setLayout(this.gridaBagLayoutTipoMermaEmpresa);

		jLabelidTipoMermaEmpresa = new JLabel();
		jLabelidTipoMermaEmpresa.setText("Id");

		jLabelidTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoMermaEmpresa = new JLabelMe();
		this.jLabelnombreTipoMermaEmpresa.setText(""+TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoMermaEmpresa.setToolTipText("Nombre");
		this.jLabelnombreTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoMermaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoMermaEmpresa.setToolTipText(TipoMermaEmpresaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoMermaEmpresa = new GridBagLayout();
		this.jPanelnombreTipoMermaEmpresa.setLayout(this.gridaBagLayoutTipoMermaEmpresa);


		jTextAreanombreTipoMermaEmpresa= new JTextAreaMe();
		jTextAreanombreTipoMermaEmpresa.setEnabled(false);
		jTextAreanombreTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMermaEmpresa.setLineWrap(true);
		jTextAreanombreTipoMermaEmpresa.setWrapStyleWord(true);
		jTextAreanombreTipoMermaEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoMermaEmpresa.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoMermaEmpresa = new JScrollPane(jTextAreanombreTipoMermaEmpresa);
		jscrollPanenombreTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoMermaEmpresaBusqueda= new JButtonMe();
		this.jButtonnombreTipoMermaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMermaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMermaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoMermaEmpresaBusqueda.setText("U");
		this.jButtonnombreTipoMermaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoMermaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoMermaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoMermaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoMermaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoMermaEmpresaBusqueda"));

		if(this.tipomermaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoMermaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoMermaEmpresa = new JLabelMe();
		this.jLabeldescripcionTipoMermaEmpresa.setText(""+TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTipoMermaEmpresa.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoMermaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoMermaEmpresa.setToolTipText(TipoMermaEmpresaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoMermaEmpresa = new GridBagLayout();
		this.jPaneldescripcionTipoMermaEmpresa.setLayout(this.gridaBagLayoutTipoMermaEmpresa);


		jTextAreadescripcionTipoMermaEmpresa= new JTextAreaMe();
		jTextAreadescripcionTipoMermaEmpresa.setEnabled(false);
		jTextAreadescripcionTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoMermaEmpresa.setLineWrap(true);
		jTextAreadescripcionTipoMermaEmpresa.setWrapStyleWord(true);
		jTextAreadescripcionTipoMermaEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoMermaEmpresa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoMermaEmpresa = new JScrollPane(jTextAreadescripcionTipoMermaEmpresa);
		jscrollPanedescripcionTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoMermaEmpresaBusqueda= new JButtonMe();
		this.jButtondescripcionTipoMermaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoMermaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoMermaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoMermaEmpresaBusqueda.setText("U");
		this.jButtondescripcionTipoMermaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoMermaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoMermaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoMermaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoMermaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoMermaEmpresaBusqueda"));

		if(this.tipomermaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoMermaEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoMermaEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoMermaEmpresa = new JLabelMe();
		this.jLabelid_empresaTipoMermaEmpresa.setText(""+TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoMermaEmpresa.setToolTipText("Empresa");
		this.jLabelid_empresaTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoMermaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoMermaEmpresa.setToolTipText(TipoMermaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoMermaEmpresa = new GridBagLayout();
		this.jPanelid_empresaTipoMermaEmpresa.setLayout(this.gridaBagLayoutTipoMermaEmpresa);


		jComboBoxid_empresaTipoMermaEmpresa= new JComboBoxMe();
		jComboBoxid_empresaTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoMermaEmpresa.setEnabled(false);

		this.jButtonid_empresaTipoMermaEmpresa= new JButtonMe();
		this.jButtonid_empresaTipoMermaEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoMermaEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoMermaEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoMermaEmpresa.setText("Buscar");
		this.jButtonid_empresaTipoMermaEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoMermaEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoMermaEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoMermaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoMermaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoMermaEmpresa"));

		this.jButtonid_empresaTipoMermaEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoMermaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMermaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMermaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoMermaEmpresaBusqueda.setText("U");
		this.jButtonid_empresaTipoMermaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoMermaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoMermaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoMermaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoMermaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoMermaEmpresaBusqueda"));

		if(this.tipomermaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoMermaEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoMermaEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoMermaEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMermaEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMermaEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoMermaEmpresaUpdate.setText("U");
		this.jButtonid_empresaTipoMermaEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoMermaEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoMermaEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoMermaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoMermaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoMermaEmpresaUpdate"));



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
		//this.jInternalFrameDetalleTipoMermaEmpresa = new TipoMermaEmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Merma Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMermaEmpresa= new GridBagLayout();
		

		
		String sToolTipTipoMermaEmpresa="";
		sToolTipTipoMermaEmpresa=TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMermaEmpresa+="(Produccion.TipoMermaEmpresa)";
		}
		
		if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMermaEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoMermaEmpresa = new JButtonMe();
		this.jButtonModificarTipoMermaEmpresa = new JButtonMe();
        this.jButtonActualizarTipoMermaEmpresa = new JButtonMe();
        this.jButtonEliminarTipoMermaEmpresa = new JButtonMe();
        this.jButtonCancelarTipoMermaEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosTipoMermaEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoMermaEmpresa = new JButtonMe();
		this.jButtonCerrarTipoMermaEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoMermaEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoMermaEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoMermaEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Merma Empresa";
		
		if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Merma Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMermaEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoMermaEmpresa.setName("jPanelCamposTipoMermaEmpresa"); 

		this.jPanelCamposOcultosTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoMermaEmpresa.setName("jPanelCamposOcultosTipoMermaEmpresa"); 

        this.jPanelAccionesTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMermaEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoMermaEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoMermaEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoMermaEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoMermaEmpresa.setText("Nuevo");
		this.jButtonModificarTipoMermaEmpresa.setText("Editar");
        this.jButtonActualizarTipoMermaEmpresa.setText("Actualizar");
        this.jButtonEliminarTipoMermaEmpresa.setText("Eliminar");
        this.jButtonCancelarTipoMermaEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosTipoMermaEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoMermaEmpresa.setText("Guardar");
		this.jButtonCerrarTipoMermaEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMermaEmpresa,"nuevo_button","Nuevo",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoMermaEmpresa,"modificar_button","Editar",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoMermaEmpresa,"actualizar_button","Actualizar",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoMermaEmpresa,"eliminar_button","Eliminar",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoMermaEmpresa,"cancelar_button","Cancelar",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoMermaEmpresa,"guardarcambios_button","Guardar",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMermaEmpresa,"guardarcambiostabla_button","Guardar",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMermaEmpresa,"cerrar_button","Salir",this.tipomermaempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoMermaEmpresa.setToolTipText("Nuevo"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoMermaEmpresa.setToolTipText("Editar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoMermaEmpresa.setToolTipText("Actualizar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoMermaEmpresa.setToolTipText("Eliminar)"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoMermaEmpresa.setToolTipText("Cancelar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoMermaEmpresa.setToolTipText("Guardar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoMermaEmpresa.setToolTipText("Guardar"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMermaEmpresa.setToolTipText("Salir"+" "+TipoMermaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMermaEmpresa";
		inputMap = this.jButtonNuevoTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMermaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMermaEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoMermaEmpresa";
		inputMap = this.jButtonActualizarTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoMermaEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoMermaEmpresa";
		inputMap = this.jButtonEliminarTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoMermaEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoMermaEmpresa";
		inputMap = this.jButtonCancelarTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoMermaEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarTipoMermaEmpresa";
		inputMap = this.jButtonCerrarTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMermaEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMermaEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoMermaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMermaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMermaEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoMermaEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoMermaEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoMermaEmpresa.setToolTipText("Nuevo TipoMermaEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoMermaEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoMermaEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoMermaEmpresa.setToolTipText("Sin Cerrar Ventana TipoMermaEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoMermaEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoMermaEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoMermaEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoMermaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMermaEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoMermaEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoMermaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoMermaEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoMermaEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoMermaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMermaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMermaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoMermaEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoMermaEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoMermaEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoMermaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoMermaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoMermaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMermaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMermaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMermaEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoMermaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoMermaEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoMermaEmpresa = new GridBagLayout();
		
		this.jPanelCamposTipoMermaEmpresa.setLayout(gridaBagLayoutCamposTipoMermaEmpresa);
		this.jPanelCamposOcultosTipoMermaEmpresa.setLayout(gridaBagLayoutCamposOcultosTipoMermaEmpresa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoMermaEmpresa.add(jLabelIdTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);



	this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMermaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoMermaEmpresa.add(jLabelidTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);


	this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoMermaEmpresa.add(jLabelid_empresaTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoMermaEmpresa.add(jButtonid_empresaTipoMermaEmpresaBusqueda, this.gridBagConstraintsTipoMermaEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 3;
		this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoMermaEmpresa.add(jButtonid_empresaTipoMermaEmpresaUpdate, this.gridBagConstraintsTipoMermaEmpresa);
	}

	this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMermaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoMermaEmpresa.add(jComboBoxid_empresaTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);


	this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoMermaEmpresa.add(jLabelnombreTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoMermaEmpresa.add(jButtonnombreTipoMermaEmpresaBusqueda, this.gridBagConstraintsTipoMermaEmpresa);
	}

	this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMermaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoMermaEmpresa.add(jscrollPanenombreTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);


	this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoMermaEmpresa.add(jLabeldescripcionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoMermaEmpresa.add(jButtondescripcionTipoMermaEmpresaBusqueda, this.gridBagConstraintsTipoMermaEmpresa);
	}

	this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMermaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoMermaEmpresa.add(jscrollPanedescripcionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMermaEmpresa.gridy = iYPanelCamposTipoMermaEmpresa;
	this.gridBagConstraintsTipoMermaEmpresa.gridx = iXPanelCamposTipoMermaEmpresa++;
	this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMermaEmpresa.add(this.jPanelidTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);



	if(iXPanelCamposTipoMermaEmpresa % 1==0) {
		iXPanelCamposTipoMermaEmpresa=0;
		iYPanelCamposTipoMermaEmpresa++;
	}
	this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMermaEmpresa.gridy = iYPanelCamposTipoMermaEmpresa;
	this.gridBagConstraintsTipoMermaEmpresa.gridx = iXPanelCamposTipoMermaEmpresa++;
	this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMermaEmpresa.add(this.jPanelnombreTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);



	if(iXPanelCamposTipoMermaEmpresa % 1==0) {
		iXPanelCamposTipoMermaEmpresa=0;
		iYPanelCamposTipoMermaEmpresa++;
	}
	this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMermaEmpresa.gridy = iYPanelCamposTipoMermaEmpresa;
	this.gridBagConstraintsTipoMermaEmpresa.gridx = iXPanelCamposTipoMermaEmpresa++;
	this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMermaEmpresa.add(this.jPaneldescripcionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);



	if(iXPanelCamposTipoMermaEmpresa % 1==0) {
		iXPanelCamposTipoMermaEmpresa=0;
		iYPanelCamposTipoMermaEmpresa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMermaEmpresa.gridy = iYPanelCamposOcultosTipoMermaEmpresa;
	this.gridBagConstraintsTipoMermaEmpresa.gridx = iXPanelCamposOcultosTipoMermaEmpresa++;
	this.gridBagConstraintsTipoMermaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMermaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoMermaEmpresa.add(this.jPanelid_empresaTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);



	if(iXPanelCamposOcultosTipoMermaEmpresa % 1==0) {
		iXPanelCamposOcultosTipoMermaEmpresa=0;
		iYPanelCamposOcultosTipoMermaEmpresa++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoMermaEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoMermaEmpresa.setLayout(gridaBagLayoutAccionesTipoMermaEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoMermaEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioTipoMermaEmpresa.setLayout(gridaBagLayoutAccionesFormularioTipoMermaEmpresa);
		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMermaEmpresa.add(this.jComboBoxTiposAccionesFormularioTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);

		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMermaEmpresa.add(this.jCheckBoxPostAccionNuevoTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMermaEmpresa.add(this.jCheckBoxPostAccionSinCerrarTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipomermaempresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipomermaempresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMermaEmpresa.add(this.jCheckBoxPostAccionSinMensajeTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoMermaEmpresa.add(this.jButtonModificarTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);							

		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMermaEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoMermaEmpresa.add(this.jButtonEliminarTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		
			
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMermaEmpresa.add(this.jButtonActualizarTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);


		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMermaEmpresa.add(this.jButtonGuardarCambiosTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);	
		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoMermaEmpresa.add(this.jButtonCancelarTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMermaEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMermaEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomermaempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoMermaEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMermaEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMermaEmpresa.gridx =0;
		this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMermaEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoMermaEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoMermaEmpresa = new TipoMermaEmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Merma Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Merma Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Merma Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoMermaEmpresaModel tipomermaempresaModel=new TipoMermaEmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoMermaEmpresaModel.TipoMermaEmpresaFocusTraversalPolicy tipomermaempresaFocusTraversalPolicy = tipomermaempresaModel.new TipoMermaEmpresaFocusTraversalPolicy(this);
			
			//tipomermaempresaFocusTraversalPolicy.settipomermaempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipomermaempresaModel);
			
			
			this.jContentPaneDetalleTipoMermaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoMermaEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleTipoMermaEmpresa.setLayout(gridaBagLayoutDetalleTipoMermaEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMermaEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleTipoMermaEmpresa.add(jTtoolBarDetalleTipoMermaEmpresa, gridBagConstraintsTipoMermaEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionTipoMermaEmpresa=   new JScrollPane(jContentPaneDetalleTipoMermaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoMermaEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
	        
			this.jContentPaneDetalleTipoMermaEmpresa.add(jPanelCamposTipoMermaEmpresa, gridBagConstraintsTipoMermaEmpresa);
			
			
			
			
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
						&& tipomermaempresaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipomermaempresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoMermaEmpresa= new GridBagConstraints();
						this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
						this.jContentPaneDetalleTipoMermaEmpresa.add(this.jTabbedPaneRelacionesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoMermaEmpresa.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoMermaEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
					this.gridBagConstraintsTipoMermaEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleTipoMermaEmpresa.add(jPanelCamposOcultosTipoMermaEmpresa, gridBagConstraintsTipoMermaEmpresa);
				
					this.jPanelCamposOcultosTipoMermaEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
	        this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoMermaEmpresa.add(this.jPanelAccionesFormularioTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);							
			
			
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoMermaEmpresa.add(this.jPanelAccionesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoMermaEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoMermaEmpresa=   new JScrollPane(this.jPanelCamposTipoMermaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMermaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMermaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMermaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
			this.gridBagConstraintsTipoMermaEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoMermaEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoMermaEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);			
			
			this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMermaEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
			
			
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		
			
		this.gridBagConstraintsTipoMermaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMermaEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMermaEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMermaEmpresa, this.gridBagConstraintsTipoMermaEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoMermaEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoMermaEmpresa;
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
