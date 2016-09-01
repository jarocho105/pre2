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
import com.bydan.erp.contabilidad.util.TipoFlujoEfectivoConstantesFunciones;

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
public class TipoFlujoEfectivoDetalleFormJInternalFrame extends TipoFlujoEfectivoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoFlujoEfectivo;
	
	protected JMenuBar jmenuBarDetalleTipoFlujoEfectivo;
	
	protected JMenu jmenuDetalleTipoFlujoEfectivo;
	protected JMenu jmenuDetalleArchivoTipoFlujoEfectivo;
	protected JMenu jmenuDetalleAccionesTipoFlujoEfectivo;
	protected JMenu jmenuDetalleDatosTipoFlujoEfectivo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFlujoEfectivo;	
	protected GridBagConstraints gridBagConstraintsTipoFlujoEfectivo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoFlujoEfectivoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoFlujoEfectivo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoFlujoEfectivoSessionBean tipoflujoefectivoSessionBean;
	
	

	public CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=null;
	public CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuentaContable=false;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoFlujoEfectivoLogic tipoflujoefectivoLogic;
	
	public JScrollPane jScrollPanelDatosTipoFlujoEfectivo;
	public JScrollPane jScrollPanelDatosEdicionTipoFlujoEfectivo;
	public JScrollPane jScrollPanelDatosGeneralTipoFlujoEfectivo;
	
	protected JPanel jPanelCamposTipoFlujoEfectivo;    
	protected JPanel jPanelCamposOcultosTipoFlujoEfectivo;    	
	protected JPanel jPanelAccionesTipoFlujoEfectivo;
	protected JPanel jPanelAccionesFormularioTipoFlujoEfectivo;
    
	
	
	protected Integer iXPanelCamposTipoFlujoEfectivo=0;
	protected Integer iYPanelCamposTipoFlujoEfectivo=0;
	
	protected Integer iXPanelCamposOcultosTipoFlujoEfectivo=0;
	protected Integer iYPanelCamposOcultosTipoFlujoEfectivo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoFlujoEfectivo;
	public JButton jButtonModificarTipoFlujoEfectivo;
	public JButton jButtonActualizarTipoFlujoEfectivo;
    public JButton jButtonEliminarTipoFlujoEfectivo;
	public JButton jButtonCancelarTipoFlujoEfectivo;
    public JButton jButtonGuardarCambiosTipoFlujoEfectivo;
	public JButton jButtonGuardarCambiosTablaTipoFlujoEfectivo;
	protected JButton jButtonCerrarTipoFlujoEfectivo;
	
	
	protected JButton jButtonProcesarInformacionTipoFlujoEfectivo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoFlujoEfectivo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoFlujoEfectivo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoFlujoEfectivo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFlujoEfectivo;
	protected JButton jButtonModificarToolBarTipoFlujoEfectivo;
	protected JButton jButtonActualizarToolBarTipoFlujoEfectivo;
    protected JButton jButtonEliminarToolBarTipoFlujoEfectivo;
	protected JButton jButtonCancelarToolBarTipoFlujoEfectivo;
    protected JButton jButtonGuardarCambiosToolBarTipoFlujoEfectivo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoFlujoEfectivo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFlujoEfectivo;
	protected JButton jButtonCerrarToolBarTipoFlujoEfectivo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoFlujoEfectivo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFlujoEfectivo;
	protected JMenuItem jMenuItemModificarTipoFlujoEfectivo;
	protected JMenuItem jMenuItemActualizarTipoFlujoEfectivo;
    protected JMenuItem jMenuItemEliminarTipoFlujoEfectivo;
	protected JMenuItem jMenuItemCancelarTipoFlujoEfectivo;
    protected JMenuItem jMenuItemGuardarCambiosTipoFlujoEfectivo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFlujoEfectivo;
	protected JMenuItem jMenuItemCerrarTipoFlujoEfectivo;
	protected JMenuItem jMenuItemDetalleCerrarTipoFlujoEfectivo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFlujoEfectivo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoFlujoEfectivo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFlujoEfectivo;
	protected JMenuItem jMenuItemMostrarOcultarTipoFlujoEfectivo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFlujoEfectivo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFlujoEfectivo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFlujoEfectivo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoFlujoEfectivo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoFlujoEfectivo;
	public JLabel jLabelIdTipoFlujoEfectivo;
	public JLabel jLabelidTipoFlujoEfectivo;
	public JButton jButtonidTipoFlujoEfectivoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoFlujoEfectivo;
	public JLabel jLabelnombreTipoFlujoEfectivo;
	public JTextArea jTextAreanombreTipoFlujoEfectivo;
	public JScrollPane jscrollPanenombreTipoFlujoEfectivo;
	public JButton jButtonnombreTipoFlujoEfectivoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoFlujoEfectivo;
	public JLabel jLabelid_empresaTipoFlujoEfectivo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoFlujoEfectivo;
	public JButton jButtonid_empresaTipoFlujoEfectivo= new JButtonMe();
	public JButton jButtonid_empresaTipoFlujoEfectivoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoFlujoEfectivoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoFlujoEfectivo;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoFlujoEfectivoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoFlujoEfectivo=new JPanel();
				this.jPanelAccionesFormularioTipoFlujoEfectivo=new JPanel();
				this.jmenuBarDetalleTipoFlujoEfectivo=new JMenuBar();
				this.jTtoolBarDetalleTipoFlujoEfectivo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFlujoEfectivoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoFlujoEfectivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoFlujoEfectivoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoFlujoEfectivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFlujoEfectivoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFlujoEfectivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFlujoEfectivoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFlujoEfectivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFlujoEfectivoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFlujoEfectivo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoFlujoEfectivo() {
		return this.jButtonActualizarToolBarTipoFlujoEfectivo;
	}
	
	public JButton getjButtonEliminarToolBarTipoFlujoEfectivo() {
		return this.jButtonEliminarToolBarTipoFlujoEfectivo;
	}
	
	public JButton getjButtonCancelarToolBarTipoFlujoEfectivo() {
		return this.jButtonCancelarToolBarTipoFlujoEfectivo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoFlujoEfectivo() {
		return this.jButtonProcesarInformacionTipoFlujoEfectivo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFlujoEfectivo)	{
		this.jButtonProcesarInformacionTipoFlujoEfectivo = jButtonProcesarInformacionTipoFlujoEfectivo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFlujoEfectivo() {
		return this.jComboBoxTiposAccionesTipoFlujoEfectivo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFlujoEfectivo(
			JComboBox jComboBoxTiposRelacionesTipoFlujoEfectivo) {
		this.jComboBoxTiposRelacionesTipoFlujoEfectivo = jComboBoxTiposRelacionesTipoFlujoEfectivo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFlujoEfectivo(
			JComboBox jComboBoxTiposAccionesTipoFlujoEfectivo) {
		this.jComboBoxTiposAccionesTipoFlujoEfectivo = jComboBoxTiposAccionesTipoFlujoEfectivo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoFlujoEfectivo() {
		return this.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoFlujoEfectivo(
			JComboBox jComboBoxTiposAccionesFormularioTipoFlujoEfectivo) {
		this.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo = jComboBoxTiposAccionesFormularioTipoFlujoEfectivo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoflujoefectivoSessionBean=new TipoFlujoEfectivoSessionBean();
		
		this.tipoflujoefectivoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoflujoefectivoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cuentacontableSessionBean=new CuentaContableSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFlujoEfectivoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFlujoEfectivoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFlujoEfectivoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Flujo Efectivo  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoFlujoEfectivoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoFlujoEfectivo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoFlujoEfectivo=new JButtonMe();
				this.jButtonModificarToolBarTipoFlujoEfectivo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoFlujoEfectivo,this.jTtoolBarDetalleTipoFlujoEfectivo,
							"actualizar","actualizar","Actualizar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoFlujoEfectivo,this.jTtoolBarDetalleTipoFlujoEfectivo,
							"eliminar","eliminar","Eliminar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoFlujoEfectivo,this.jTtoolBarDetalleTipoFlujoEfectivo,
							"cancelar","cancelar","Cancelar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoFlujoEfectivo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoFlujoEfectivo,this.jTtoolBarDetalleTipoFlujoEfectivo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoFlujoEfectivo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoFlujoEfectivo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoFlujoEfectivo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoFlujoEfectivo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoFlujoEfectivo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFlujoEfectivo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFlujoEfectivo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFlujoEfectivo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoFlujoEfectivo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoFlujoEfectivo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoFlujoEfectivo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoFlujoEfectivo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoFlujoEfectivo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoFlujoEfectivo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoFlujoEfectivo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoFlujoEfectivo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoFlujoEfectivo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoFlujoEfectivo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoFlujoEfectivo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoFlujoEfectivo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoFlujoEfectivo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFlujoEfectivo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFlujoEfectivo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFlujoEfectivo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFlujoEfectivo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFlujoEfectivo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoFlujoEfectivo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoFlujoEfectivo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoFlujoEfectivo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFlujoEfectivo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFlujoEfectivo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFlujoEfectivo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFlujoEfectivo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFlujoEfectivo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFlujoEfectivo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoFlujoEfectivo.add(this.jMenuItemDetalleCerrarTipoFlujoEfectivo);
		
		this.jmenuDetalleAccionesTipoFlujoEfectivo.add(this.jMenuItemActualizarTipoFlujoEfectivo);
		this.jmenuDetalleAccionesTipoFlujoEfectivo.add(this.jMenuItemEliminarTipoFlujoEfectivo);
		this.jmenuDetalleAccionesTipoFlujoEfectivo.add(this.jMenuItemCancelarTipoFlujoEfectivo);		
		
		//this.jmenuDetalleDatosTipoFlujoEfectivo.add(this.jMenuItemDetalleAbrirOrderByTipoFlujoEfectivo);				
		this.jmenuDetalleDatosTipoFlujoEfectivo.add(this.jMenuItemDetalleMostarOcultarTipoFlujoEfectivo);				
				
		//this.jmenuDetalleAccionesTipoFlujoEfectivo.add(this.jMenuItemGuardarCambiosTipoFlujoEfectivo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoFlujoEfectivo.add(this.jmenuDetalleArchivoTipoFlujoEfectivo);		
		this.jmenuBarDetalleTipoFlujoEfectivo.add(this.jmenuDetalleAccionesTipoFlujoEfectivo);		
		this.jmenuBarDetalleTipoFlujoEfectivo.add(this.jmenuDetalleDatosTipoFlujoEfectivo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoFlujoEfectivo.add(this.jmenuDetalleTipoFlujoEfectivo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoFlujoEfectivo);				
	}
	
	
	public void inicializarElementosCamposTipoFlujoEfectivo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoFlujoEfectivo = new JLabelMe();
		jLabelIdTipoFlujoEfectivo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoFlujoEfectivo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoFlujoEfectivo.setToolTipText(TipoFlujoEfectivoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoFlujoEfectivo= new GridBagLayout();

		this.jPanelidTipoFlujoEfectivo.setLayout(this.gridaBagLayoutTipoFlujoEfectivo);

		jLabelidTipoFlujoEfectivo = new JLabel();
		jLabelidTipoFlujoEfectivo.setText("Id");

		jLabelidTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoFlujoEfectivo = new JLabelMe();
		this.jLabelnombreTipoFlujoEfectivo.setText(""+TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoFlujoEfectivo.setToolTipText("Nombre");
		this.jLabelnombreTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoFlujoEfectivo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoFlujoEfectivo.setToolTipText(TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoFlujoEfectivo = new GridBagLayout();
		this.jPanelnombreTipoFlujoEfectivo.setLayout(this.gridaBagLayoutTipoFlujoEfectivo);


		jTextAreanombreTipoFlujoEfectivo= new JTextAreaMe();
		jTextAreanombreTipoFlujoEfectivo.setEnabled(false);
		jTextAreanombreTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFlujoEfectivo.setLineWrap(true);
		jTextAreanombreTipoFlujoEfectivo.setWrapStyleWord(true);
		jTextAreanombreTipoFlujoEfectivo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoFlujoEfectivo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoFlujoEfectivo = new JScrollPane(jTextAreanombreTipoFlujoEfectivo);
		jscrollPanenombreTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreTipoFlujoEfectivoBusqueda= new JButtonMe();
		this.jButtonnombreTipoFlujoEfectivoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFlujoEfectivoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFlujoEfectivoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoFlujoEfectivoBusqueda.setText("U");
		this.jButtonnombreTipoFlujoEfectivoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoFlujoEfectivoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoFlujoEfectivoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoFlujoEfectivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoFlujoEfectivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoFlujoEfectivoBusqueda"));

		if(this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoFlujoEfectivoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoFlujoEfectivo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoFlujoEfectivo = new JLabelMe();
		this.jLabelid_empresaTipoFlujoEfectivo.setText(""+TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoFlujoEfectivo.setToolTipText("Empresa");
		this.jLabelid_empresaTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoFlujoEfectivo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoFlujoEfectivo.setToolTipText(TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoFlujoEfectivo = new GridBagLayout();
		this.jPanelid_empresaTipoFlujoEfectivo.setLayout(this.gridaBagLayoutTipoFlujoEfectivo);


		jComboBoxid_empresaTipoFlujoEfectivo= new JComboBoxMe();
		jComboBoxid_empresaTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoFlujoEfectivo.setEnabled(false);

		this.jButtonid_empresaTipoFlujoEfectivo= new JButtonMe();
		this.jButtonid_empresaTipoFlujoEfectivo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoFlujoEfectivo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoFlujoEfectivo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoFlujoEfectivo.setText("Buscar");
		this.jButtonid_empresaTipoFlujoEfectivo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoFlujoEfectivo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoFlujoEfectivo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoFlujoEfectivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoFlujoEfectivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoFlujoEfectivo"));

		this.jButtonid_empresaTipoFlujoEfectivoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoFlujoEfectivoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFlujoEfectivoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFlujoEfectivoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoFlujoEfectivoBusqueda.setText("U");
		this.jButtonid_empresaTipoFlujoEfectivoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoFlujoEfectivoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoFlujoEfectivoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoFlujoEfectivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoFlujoEfectivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoFlujoEfectivoBusqueda"));

		if(this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoFlujoEfectivoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoFlujoEfectivoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoFlujoEfectivoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFlujoEfectivoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoFlujoEfectivoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoFlujoEfectivoUpdate.setText("U");
		this.jButtonid_empresaTipoFlujoEfectivoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoFlujoEfectivoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoFlujoEfectivoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoFlujoEfectivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoFlujoEfectivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoFlujoEfectivoUpdate"));



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
		//this.jInternalFrameDetalleTipoFlujoEfectivo = new TipoFlujoEfectivoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Flujo Efectivo  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFlujoEfectivo= new GridBagLayout();
		

		
		String sToolTipTipoFlujoEfectivo="";
		sToolTipTipoFlujoEfectivo=TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFlujoEfectivo+="(Contabilidad.TipoFlujoEfectivo)";
		}
		
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFlujoEfectivo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoFlujoEfectivo = new JButtonMe();
		this.jButtonModificarTipoFlujoEfectivo = new JButtonMe();
        this.jButtonActualizarTipoFlujoEfectivo = new JButtonMe();
        this.jButtonEliminarTipoFlujoEfectivo = new JButtonMe();
        this.jButtonCancelarTipoFlujoEfectivo = new JButtonMe();
        this.jButtonGuardarCambiosTipoFlujoEfectivo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoFlujoEfectivo = new JButtonMe();
		this.jButtonCerrarTipoFlujoEfectivo = new JButtonMe();
		
		this.jScrollPanelDatosTipoFlujoEfectivo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoFlujoEfectivo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoFlujoEfectivo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Flujo Efectivo ";
		
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Flujo Efectivo s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFlujoEfectivo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoFlujoEfectivo.setName("jPanelCamposTipoFlujoEfectivo"); 

		this.jPanelCamposOcultosTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoFlujoEfectivo.setName("jPanelCamposOcultosTipoFlujoEfectivo"); 

        this.jPanelAccionesTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFlujoEfectivo.setToolTipText("Acciones");
        this.jPanelAccionesTipoFlujoEfectivo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoFlujoEfectivo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoFlujoEfectivo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoFlujoEfectivo.setText("Nuevo");
		this.jButtonModificarTipoFlujoEfectivo.setText("Editar");
        this.jButtonActualizarTipoFlujoEfectivo.setText("Actualizar");
        this.jButtonEliminarTipoFlujoEfectivo.setText("Eliminar");
        this.jButtonCancelarTipoFlujoEfectivo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoFlujoEfectivo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.setText("Guardar");
		this.jButtonCerrarTipoFlujoEfectivo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFlujoEfectivo,"nuevo_button","Nuevo",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoFlujoEfectivo,"modificar_button","Editar",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoFlujoEfectivo,"actualizar_button","Actualizar",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoFlujoEfectivo,"eliminar_button","Eliminar",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoFlujoEfectivo,"cancelar_button","Cancelar",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoFlujoEfectivo,"guardarcambios_button","Guardar",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFlujoEfectivo,"guardarcambiostabla_button","Guardar",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFlujoEfectivo,"cerrar_button","Salir",this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoFlujoEfectivo.setToolTipText("Nuevo"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoFlujoEfectivo.setToolTipText("Editar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoFlujoEfectivo.setToolTipText("Actualizar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoFlujoEfectivo.setToolTipText("Eliminar)"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoFlujoEfectivo.setToolTipText("Cancelar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoFlujoEfectivo.setToolTipText("Guardar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.setToolTipText("Guardar"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFlujoEfectivo.setToolTipText("Salir"+" "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFlujoEfectivo";
		inputMap = this.jButtonNuevoTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFlujoEfectivo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFlujoEfectivo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoFlujoEfectivo";
		inputMap = this.jButtonActualizarTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoFlujoEfectivo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoFlujoEfectivo";
		inputMap = this.jButtonEliminarTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoFlujoEfectivo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoFlujoEfectivo";
		inputMap = this.jButtonCancelarTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoFlujoEfectivo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoFlujoEfectivo";
		inputMap = this.jButtonCerrarTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFlujoEfectivo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFlujoEfectivo";
		inputMap = this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFlujoEfectivo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoFlujoEfectivo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoFlujoEfectivo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoFlujoEfectivo.setToolTipText("Nuevo TipoFlujoEfectivo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoFlujoEfectivo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoFlujoEfectivo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoFlujoEfectivo.setToolTipText("Sin Cerrar Ventana TipoFlujoEfectivo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoFlujoEfectivo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoFlujoEfectivo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoFlujoEfectivo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoFlujoEfectivo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFlujoEfectivo.setText("Accion");
		this.jComboBoxTiposAccionesTipoFlujoEfectivo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoFlujoEfectivo = new JLabelMe();
		
		this.jLabelAccionesTipoFlujoEfectivo.setText("Acciones");		
		this.jLabelAccionesTipoFlujoEfectivo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFlujoEfectivo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFlujoEfectivo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoFlujoEfectivo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoFlujoEfectivo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoFlujoEfectivo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoFlujoEfectivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoFlujoEfectivo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoFlujoEfectivo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFlujoEfectivo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFlujoEfectivo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoFlujoEfectivo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoFlujoEfectivo = new GridBagLayout();
		
		this.jPanelCamposTipoFlujoEfectivo.setLayout(gridaBagLayoutCamposTipoFlujoEfectivo);
		this.jPanelCamposOcultosTipoFlujoEfectivo.setLayout(gridaBagLayoutCamposOcultosTipoFlujoEfectivo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
	this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoFlujoEfectivo.add(jLabelIdTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);



	this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
	this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.gridx = 1;
	this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoFlujoEfectivo.add(jLabelidTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);


	this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
	this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoFlujoEfectivo.add(jLabelid_empresaTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		//this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = 2;
		this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 0;
		this.gridBagConstraintsTipoFlujoEfectivo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoFlujoEfectivo.add(jButtonid_empresaTipoFlujoEfectivoBusqueda, this.gridBagConstraintsTipoFlujoEfectivo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		//this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = 3;
		this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 0;
		this.gridBagConstraintsTipoFlujoEfectivo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoFlujoEfectivo.add(jButtonid_empresaTipoFlujoEfectivoUpdate, this.gridBagConstraintsTipoFlujoEfectivo);
	}

	this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
	this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.gridx = 1;
	this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoFlujoEfectivo.add(jComboBoxid_empresaTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);


	this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
	this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoFlujoEfectivo.add(jLabelnombreTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		//this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = 2;
		this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 0;
		this.gridBagConstraintsTipoFlujoEfectivo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoFlujoEfectivo.add(jButtonnombreTipoFlujoEfectivoBusqueda, this.gridBagConstraintsTipoFlujoEfectivo);
	}

	this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
	this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.gridx = 1;
	this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 0;
	this.gridBagConstraintsTipoFlujoEfectivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoFlujoEfectivo.add(jscrollPanenombreTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
	this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFlujoEfectivo.gridy = iYPanelCamposTipoFlujoEfectivo;
	this.gridBagConstraintsTipoFlujoEfectivo.gridx = iXPanelCamposTipoFlujoEfectivo++;
	this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFlujoEfectivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFlujoEfectivo.add(this.jPanelidTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);



	if(iXPanelCamposTipoFlujoEfectivo % 1==0) {
		iXPanelCamposTipoFlujoEfectivo=0;
		iYPanelCamposTipoFlujoEfectivo++;
	}
	this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
	this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFlujoEfectivo.gridy = iYPanelCamposTipoFlujoEfectivo;
	this.gridBagConstraintsTipoFlujoEfectivo.gridx = iXPanelCamposTipoFlujoEfectivo++;
	this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFlujoEfectivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFlujoEfectivo.add(this.jPanelnombreTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);



	if(iXPanelCamposTipoFlujoEfectivo % 1==0) {
		iXPanelCamposTipoFlujoEfectivo=0;
		iYPanelCamposTipoFlujoEfectivo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
	this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFlujoEfectivo.gridy = iYPanelCamposOcultosTipoFlujoEfectivo;
	this.gridBagConstraintsTipoFlujoEfectivo.gridx = iXPanelCamposOcultosTipoFlujoEfectivo++;
	this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFlujoEfectivo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoFlujoEfectivo.add(this.jPanelid_empresaTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);



	if(iXPanelCamposOcultosTipoFlujoEfectivo % 1==0) {
		iXPanelCamposOcultosTipoFlujoEfectivo=0;
		iYPanelCamposOcultosTipoFlujoEfectivo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoFlujoEfectivo= new GridBagLayout();
		this.jPanelAccionesTipoFlujoEfectivo.setLayout(gridaBagLayoutAccionesTipoFlujoEfectivo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoFlujoEfectivo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoFlujoEfectivo.setLayout(gridaBagLayoutAccionesFormularioTipoFlujoEfectivo);
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFlujoEfectivo.add(this.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);

		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFlujoEfectivo.add(this.jCheckBoxPostAccionNuevoTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFlujoEfectivo.add(this.jCheckBoxPostAccionSinCerrarTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFlujoEfectivo.add(this.jCheckBoxPostAccionSinMensajeTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoFlujoEfectivo.add(this.jButtonModificarTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);							

		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoFlujoEfectivo.add(this.jButtonEliminarTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		
			
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFlujoEfectivo.add(this.jButtonActualizarTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);


		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFlujoEfectivo.add(this.jButtonGuardarCambiosTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);	
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = 0;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoFlujoEfectivo.add(this.jButtonCancelarTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFlujoEfectivo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFlujoEfectivo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();						
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;		
			//this.gridBagConstraintsTipoFlujoEfectivo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFlujoEfectivo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFlujoEfectivo.gridx =0;
		this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFlujoEfectivo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoFlujoEfectivoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoFlujoEfectivo = new TipoFlujoEfectivoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Flujo Efectivo  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Flujo Efectivo  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Flujo Efectivo  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoFlujoEfectivoModel tipoflujoefectivoModel=new TipoFlujoEfectivoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoFlujoEfectivoModel.TipoFlujoEfectivoFocusTraversalPolicy tipoflujoefectivoFocusTraversalPolicy = tipoflujoefectivoModel.new TipoFlujoEfectivoFocusTraversalPolicy(this);
			
			//tipoflujoefectivoFocusTraversalPolicy.settipoflujoefectivoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoflujoefectivoModel);
			
			
			this.jContentPaneDetalleTipoFlujoEfectivo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoFlujoEfectivo = new GridBagLayout();	
			this.jContentPaneDetalleTipoFlujoEfectivo.setLayout(gridaBagLayoutDetalleTipoFlujoEfectivo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFlujoEfectivo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
				this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoFlujoEfectivo.add(jTtoolBarDetalleTipoFlujoEfectivo, gridBagConstraintsTipoFlujoEfectivo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoFlujoEfectivo=   new JScrollPane(jContentPaneDetalleTipoFlujoEfectivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoFlujoEfectivo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
	        
			this.jContentPaneDetalleTipoFlujoEfectivo.add(jPanelCamposTipoFlujoEfectivo, gridBagConstraintsTipoFlujoEfectivo);
			
			
			
			
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
						&& tipoflujoefectivoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCuentaContable(this.puedeCargarPorParteCuentaContable,false,-1);
					
					if(this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoFlujoEfectivo= new GridBagConstraints();
						this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
						this.jContentPaneDetalleTipoFlujoEfectivo.add(this.jTabbedPaneRelacionesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoFlujoEfectivo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCuentaContable(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoFlujoEfectivo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
					this.gridBagConstraintsTipoFlujoEfectivo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoFlujoEfectivo.add(jPanelCamposOcultosTipoFlujoEfectivo, gridBagConstraintsTipoFlujoEfectivo);
				
					this.jPanelCamposOcultosTipoFlujoEfectivo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
	        this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoFlujoEfectivo.add(this.jPanelAccionesFormularioTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);							
			
			
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
	        this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoFlujoEfectivo.add(this.jPanelAccionesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoFlujoEfectivo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoFlujoEfectivo=   new JScrollPane(this.jPanelCamposTipoFlujoEfectivo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
			this.gridBagConstraintsTipoFlujoEfectivo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoFlujoEfectivo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoFlujoEfectivo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);			
			
			this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
			this.gridBagConstraintsTipoFlujoEfectivo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
			
			
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		
			
		this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
		this.gridBagConstraintsTipoFlujoEfectivo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFlujoEfectivo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFlujoEfectivo, this.gridBagConstraintsTipoFlujoEfectivo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoFlujoEfectivo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoFlujoEfectivo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCuentaContable(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuentacontableSessionBean=new CuentaContableSessionBean();
		this.cuentacontableSessionBean.setConGuardarRelaciones(false);
		this.cuentacontableSessionBean.setEsGuardarRelacionado(true);

		this.cuentacontableBeanSwingJInternalFrame=null;//new CuentaContableBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuentacontableBeanSwingJInternalFramePopup=new CuentaContableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuentacontableBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuentacontableSessionBean.getEsGuardarRelacionado()) {

				CuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFlujoEfectivoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFlujoEfectivoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuentacontableSessionBean.setEsGuardarRelacionado(true);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuentacontableBeanSwingJInternalFrame.setcuentacontableSessionBean(this.cuentacontableSessionBean);

				//this.gridBagConstraintsTipoFlujoEfectivo = new GridBagConstraints();
				//this.gridBagConstraintsTipoFlujoEfectivo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFlujoEfectivo.gridx = 0;
				//this.jContentPaneDetalleTipoFlujoEfectivo.add(this.cuentacontableBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFlujoEfectivo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFlujoEfectivo.add("Cuenta Contables",this.cuentacontableBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFlujoEfectivo.setComponentAt(iIndexTab,this.cuentacontableBeanSwingJInternalFrame.getContentPane());
				}

				//CuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuentacontableSessionBean.setEsGuardarRelacionado(false);
				this.cuentacontableBeanSwingJInternalFrame=null;//new CuentaContableBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuentacontableSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuentaContable) {
					this.jTabbedPaneRelacionesTipoFlujoEfectivo.add("Cuenta Contables",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCuentaContableBeanSwingJInternalFrame(List<TipoFlujoEfectivo> tipoflujoefectivos,TipoFlujoEfectivo tipoflujoefectivo,CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.tipoflujoefectivoLogic.getConnexion());

					cuentacontableBeanSwingJInternalFrame.settipoflujoefectivosForeignKey(tipoflujoefectivos);
					cuentacontableBeanSwingJInternalFrame.settipoflujoefectivoForeignKey(tipoflujoefectivo);
					cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionTipoFlujoEfectivo(true);
					cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.setlidTipoFlujoEfectivoActual(tipoflujoefectivo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuentacontableBeanSwingJInternalFrame.cargarCombosForeignKeyCuentaContable(cuentacontableBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuentacontableBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFlujoEfectivo(true);
					cuentacontableBeanSwingJInternalFrame.setid_tipo_flujo_efectivoFK_IdTipoFlujoEfectivo(tipoflujoefectivo.getId());

					if(!this.conCargarFormDetalle) {
						cuentacontableBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuentacontableBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFlujoEfectivoForeignKey(tipoflujoefectivo,1,false,true,true);
					cuentacontableBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuentacontableBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFlujoEfectivo");
					cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFlujoEfectivo");
					cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable(true);
					cuentacontableBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuentaContable("n",cuentacontableBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuentacontableBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuentacontableBeanSwingJInternalFrame.setAutoscrolls(true);
					cuentacontableBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuentacontableBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContable("relacionado");
					} else {
						cuentacontableBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContable("no_relacionado");
					}

					cuentacontableBeanSwingJInternalFrame.getjButtonRecargarInformacionCuentaContable().setVisible(false);

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
