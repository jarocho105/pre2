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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.ComisionConfigConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class ComisionConfigDetalleFormJInternalFrame extends ComisionConfigBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComisionConfig;
	
	protected JMenuBar jmenuBarDetalleComisionConfig;
	
	protected JMenu jmenuDetalleComisionConfig;
	protected JMenu jmenuDetalleArchivoComisionConfig;
	protected JMenu jmenuDetalleAccionesComisionConfig;
	protected JMenu jmenuDetalleDatosComisionConfig;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionConfig;	
	protected GridBagConstraints gridBagConstraintsComisionConfig;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComisionConfigBeanSwingJInternalFrameAdditional jInternalFrameDetalleComisionConfig;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoComisionConfigBeanSwingJInternalFrame tipocomisionconfigBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomisionconfig="";

	protected NivelLineaBeanSwingJInternalFrame nivellineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_nivellinea="";
	
	public ComisionConfigSessionBean comisionconfigSessionBean;
	
	

	public ComisionCateBeanSwingJInternalFrame comisioncateBeanSwingJInternalFrame=null;
	public ComisionCateBeanSwingJInternalFrame comisioncateBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionCate=false;
	public ComisionCateSessionBean comisioncateSessionBean;

	public ComisionMarcaBeanSwingJInternalFrame comisionmarcaBeanSwingJInternalFrame=null;
	public ComisionMarcaBeanSwingJInternalFrame comisionmarcaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionMarca=false;
	public ComisionMarcaSessionBean comisionmarcaSessionBean;

	public ComisionLineaBeanSwingJInternalFrame comisionlineaBeanSwingJInternalFrame=null;
	public ComisionLineaBeanSwingJInternalFrame comisionlineaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionLinea=false;
	public ComisionLineaSessionBean comisionlineaSessionBean;

	public ComisionPenaBeanSwingJInternalFrame comisionpenaBeanSwingJInternalFrame=null;
	public ComisionPenaBeanSwingJInternalFrame comisionpenaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionPena=false;
	public ComisionPenaSessionBean comisionpenaSessionBean;

	public ComisionGrupoBeanSwingJInternalFrame comisiongrupoBeanSwingJInternalFrame=null;
	public ComisionGrupoBeanSwingJInternalFrame comisiongrupoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionGrupo=false;
	public ComisionGrupoSessionBean comisiongrupoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoComisionConfigSessionBean tipocomisionconfigSessionBean;
	public NivelLineaSessionBean nivellineaSessionBean;	
	
	public ComisionConfigLogic comisionconfigLogic;
	
	public JScrollPane jScrollPanelDatosComisionConfig;
	public JScrollPane jScrollPanelDatosEdicionComisionConfig;
	public JScrollPane jScrollPanelDatosGeneralComisionConfig;
	
	protected JPanel jPanelCamposComisionConfig;    
	protected JPanel jPanelCamposOcultosComisionConfig;    	
	protected JPanel jPanelAccionesComisionConfig;
	protected JPanel jPanelAccionesFormularioComisionConfig;
    
	
	
	protected Integer iXPanelCamposComisionConfig=0;
	protected Integer iYPanelCamposComisionConfig=0;
	
	protected Integer iXPanelCamposOcultosComisionConfig=0;
	protected Integer iYPanelCamposOcultosComisionConfig=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComisionConfig;
	public JButton jButtonModificarComisionConfig;
	public JButton jButtonActualizarComisionConfig;
    public JButton jButtonEliminarComisionConfig;
	public JButton jButtonCancelarComisionConfig;
    public JButton jButtonGuardarCambiosComisionConfig;
	public JButton jButtonGuardarCambiosTablaComisionConfig;
	protected JButton jButtonCerrarComisionConfig;
	
	
	protected JButton jButtonProcesarInformacionComisionConfig;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComisionConfig;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComisionConfig;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComisionConfig;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionConfig;
	protected JButton jButtonModificarToolBarComisionConfig;
	protected JButton jButtonActualizarToolBarComisionConfig;
    protected JButton jButtonEliminarToolBarComisionConfig;
	protected JButton jButtonCancelarToolBarComisionConfig;
    protected JButton jButtonGuardarCambiosToolBarComisionConfig;
	protected JButton jButtonGuardarCambiosTablaToolBarComisionConfig;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionConfig;
	protected JButton jButtonCerrarToolBarComisionConfig;
	
	protected JButton jButtonProcesarInformacionToolBarComisionConfig;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionConfig;
	protected JMenuItem jMenuItemModificarComisionConfig;
	protected JMenuItem jMenuItemActualizarComisionConfig;
    protected JMenuItem jMenuItemEliminarComisionConfig;
	protected JMenuItem jMenuItemCancelarComisionConfig;
    protected JMenuItem jMenuItemGuardarCambiosComisionConfig;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionConfig;
	protected JMenuItem jMenuItemCerrarComisionConfig;
	protected JMenuItem jMenuItemDetalleCerrarComisionConfig;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionConfig;
	
	protected JMenuItem jMenuItemProcesarInformacionComisionConfig;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionConfig;
	protected JMenuItem jMenuItemMostrarOcultarComisionConfig;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionConfig;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionConfig;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionConfig;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComisionConfig;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComisionConfig;
	public JLabel jLabelIdComisionConfig;
	public JLabel jLabelidComisionConfig;
	public JButton jButtonidComisionConfigBusqueda= new JButtonMe();

	public JPanel jPanelcon_vendedorComisionConfig;
	public JLabel jLabelcon_vendedorComisionConfig;
	public JCheckBox jCheckBoxcon_vendedorComisionConfig;
	public JButton jButtoncon_vendedorComisionConfigBusqueda= new JButtonMe();

	public JPanel jPanelcon_ventasComisionConfig;
	public JLabel jLabelcon_ventasComisionConfig;
	public JCheckBox jCheckBoxcon_ventasComisionConfig;
	public JButton jButtoncon_ventasComisionConfigBusqueda= new JButtonMe();

	public JPanel jPanelcon_cobrosComisionConfig;
	public JLabel jLabelcon_cobrosComisionConfig;
	public JCheckBox jCheckBoxcon_cobrosComisionConfig;
	public JButton jButtoncon_cobrosComisionConfigBusqueda= new JButtonMe();

	public JPanel jPanelcon_remesa_transitoComisionConfig;
	public JLabel jLabelcon_remesa_transitoComisionConfig;
	public JCheckBox jCheckBoxcon_remesa_transitoComisionConfig;
	public JButton jButtoncon_remesa_transitoComisionConfigBusqueda= new JButtonMe();

	public JPanel jPanelcon_penalidadComisionConfig;
	public JLabel jLabelcon_penalidadComisionConfig;
	public JCheckBox jCheckBoxcon_penalidadComisionConfig;
	public JButton jButtoncon_penalidadComisionConfigBusqueda= new JButtonMe();

	public JPanel jPanelcon_abonoComisionConfig;
	public JLabel jLabelcon_abonoComisionConfig;
	public JCheckBox jCheckBoxcon_abonoComisionConfig;
	public JButton jButtoncon_abonoComisionConfigBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComisionConfig;
	public JLabel jLabelid_empresaComisionConfig;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComisionConfig;
	public JButton jButtonid_empresaComisionConfig= new JButtonMe();
	public JButton jButtonid_empresaComisionConfigUpdate= new JButtonMe();
	public JButton jButtonid_empresaComisionConfigBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_comision_configComisionConfig;
	public JLabel jLabelid_tipo_comision_configComisionConfig;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comision_configComisionConfig;
	public JButton jButtonid_tipo_comision_configComisionConfig= new JButtonMe();
	public JButton jButtonid_tipo_comision_configComisionConfigUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comision_configComisionConfigBusqueda= new JButtonMe();

	public JPanel jPanelid_nivel_lineaComisionConfig;
	public JLabel jLabelid_nivel_lineaComisionConfig;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_nivel_lineaComisionConfig;
	public JButton jButtonid_nivel_lineaComisionConfig= new JButtonMe();
	public JButton jButtonid_nivel_lineaComisionConfigUpdate= new JButtonMe();
	public JButton jButtonid_nivel_lineaComisionConfigBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComisionConfig;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ComisionConfigDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComisionConfig=new JPanel();
				this.jPanelAccionesFormularioComisionConfig=new JPanel();
				this.jmenuBarDetalleComisionConfig=new JMenuBar();
				this.jTtoolBarDetalleComisionConfig=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionConfigDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComisionConfigDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionConfigDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionConfigDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionConfigDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionConfig No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComisionConfig() {
		return this.jButtonActualizarToolBarComisionConfig;
	}
	
	public JButton getjButtonEliminarToolBarComisionConfig() {
		return this.jButtonEliminarToolBarComisionConfig;
	}
	
	public JButton getjButtonCancelarToolBarComisionConfig() {
		return this.jButtonCancelarToolBarComisionConfig;
	}		
	
	public JButton getjButtonProcesarInformacionComisionConfig() {
		return this.jButtonProcesarInformacionComisionConfig;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionConfig)	{
		this.jButtonProcesarInformacionComisionConfig = jButtonProcesarInformacionComisionConfig;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionConfig() {
		return this.jComboBoxTiposAccionesComisionConfig;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionConfig(
			JComboBox jComboBoxTiposRelacionesComisionConfig) {
		this.jComboBoxTiposRelacionesComisionConfig = jComboBoxTiposRelacionesComisionConfig;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionConfig(
			JComboBox jComboBoxTiposAccionesComisionConfig) {
		this.jComboBoxTiposAccionesComisionConfig = jComboBoxTiposAccionesComisionConfig;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComisionConfig() {
		return this.jComboBoxTiposAccionesFormularioComisionConfig;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComisionConfig(
			JComboBox jComboBoxTiposAccionesFormularioComisionConfig) {
		this.jComboBoxTiposAccionesFormularioComisionConfig = jComboBoxTiposAccionesFormularioComisionConfig;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comisionconfigSessionBean=new ComisionConfigSessionBean();
		
		this.comisionconfigSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionconfigSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisionconfigSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.comisioncateSessionBean=new ComisionCateSessionBean();
		//this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
		//this.comisionlineaSessionBean=new ComisionLineaSessionBean();
		//this.comisionpenaSessionBean=new ComisionPenaSessionBean();
		//this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionConfigJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comision Config MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
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
	
		ComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComisionConfig= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComisionConfig=new JButtonMe();
				this.jButtonModificarToolBarComisionConfig=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComisionConfig,this.jTtoolBarDetalleComisionConfig,
							"actualizar","actualizar","Actualizar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComisionConfig,this.jTtoolBarDetalleComisionConfig,
							"eliminar","eliminar","Eliminar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComisionConfig,this.jTtoolBarDetalleComisionConfig,
							"cancelar","cancelar","Cancelar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComisionConfig=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComisionConfig,this.jTtoolBarDetalleComisionConfig,
							"guardarcambios","guardarcambios","Guardar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComisionConfig=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComisionConfig=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComisionConfig=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComisionConfig=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComisionConfig=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionConfig= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionConfig.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionConfig,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComisionConfig= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComisionConfig.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComisionConfig,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComisionConfig= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComisionConfig.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComisionConfig,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComisionConfig= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComisionConfig.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComisionConfig,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComisionConfig= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComisionConfig.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComisionConfig,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComisionConfig= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionConfig.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionConfig,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionConfig= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionConfig.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionConfig,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComisionConfig= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComisionConfig.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComisionConfig,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionConfig= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionConfig.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionConfig,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionConfig= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionConfig.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionConfig,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComisionConfig.add(this.jMenuItemDetalleCerrarComisionConfig);
		
		this.jmenuDetalleAccionesComisionConfig.add(this.jMenuItemActualizarComisionConfig);
		this.jmenuDetalleAccionesComisionConfig.add(this.jMenuItemEliminarComisionConfig);
		this.jmenuDetalleAccionesComisionConfig.add(this.jMenuItemCancelarComisionConfig);		
		
		//this.jmenuDetalleDatosComisionConfig.add(this.jMenuItemDetalleAbrirOrderByComisionConfig);				
		this.jmenuDetalleDatosComisionConfig.add(this.jMenuItemDetalleMostarOcultarComisionConfig);				
				
		//this.jmenuDetalleAccionesComisionConfig.add(this.jMenuItemGuardarCambiosComisionConfig);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComisionConfig.add(this.jmenuDetalleArchivoComisionConfig);		
		this.jmenuBarDetalleComisionConfig.add(this.jmenuDetalleAccionesComisionConfig);		
		this.jmenuBarDetalleComisionConfig.add(this.jmenuDetalleDatosComisionConfig);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleComisionConfig.add(this.jmenuDetalleComisionConfig);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComisionConfig);				
	}
	
	
	public void inicializarElementosCamposComisionConfig() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComisionConfig = new JLabelMe();
		jLabelIdComisionConfig.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComisionConfig = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComisionConfig.setToolTipText(ComisionConfigConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComisionConfig= new GridBagLayout();

		this.jPanelidComisionConfig.setLayout(this.gridaBagLayoutComisionConfig);

		jLabelidComisionConfig = new JLabel();
		jLabelidComisionConfig.setText("Id");

		jLabelidComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcon_vendedorComisionConfig = new JLabelMe();
		this.jLabelcon_vendedorComisionConfig.setText(""+ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR+" : *");
		this.jLabelcon_vendedorComisionConfig.setToolTipText("Con Vendedor");
		this.jLabelcon_vendedorComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_vendedorComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_vendedorComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_vendedorComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_vendedorComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_vendedorComisionConfig.setToolTipText(ComisionConfigConstantesFunciones.LABEL_CONVENDEDOR);
		this.gridaBagLayoutComisionConfig = new GridBagLayout();
		this.jPanelcon_vendedorComisionConfig.setLayout(this.gridaBagLayoutComisionConfig);


		jCheckBoxcon_vendedorComisionConfig= new JCheckBoxMe();
		jCheckBoxcon_vendedorComisionConfig.setEnabled(false);

		jCheckBoxcon_vendedorComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_vendedorComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_vendedorComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_vendedorComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_vendedorComisionConfigBusqueda= new JButtonMe();
		this.jButtoncon_vendedorComisionConfigBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_vendedorComisionConfigBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_vendedorComisionConfigBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_vendedorComisionConfigBusqueda.setText("U");
		this.jButtoncon_vendedorComisionConfigBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_vendedorComisionConfigBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_vendedorComisionConfigBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_vendedorComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_vendedorComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_vendedorComisionConfigBusqueda"));

		if(this.comisionconfigSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_vendedorComisionConfigBusqueda.setVisible(false);		}


					
		this.jLabelcon_ventasComisionConfig = new JLabelMe();
		this.jLabelcon_ventasComisionConfig.setText(""+ComisionConfigConstantesFunciones.LABEL_CONVENTAS+" : *");
		this.jLabelcon_ventasComisionConfig.setToolTipText("Con Ventas");
		this.jLabelcon_ventasComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_ventasComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_ventasComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_ventasComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_ventasComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_ventasComisionConfig.setToolTipText(ComisionConfigConstantesFunciones.LABEL_CONVENTAS);
		this.gridaBagLayoutComisionConfig = new GridBagLayout();
		this.jPanelcon_ventasComisionConfig.setLayout(this.gridaBagLayoutComisionConfig);


		jCheckBoxcon_ventasComisionConfig= new JCheckBoxMe();
		jCheckBoxcon_ventasComisionConfig.setEnabled(false);

		jCheckBoxcon_ventasComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_ventasComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_ventasComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_ventasComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_ventasComisionConfigBusqueda= new JButtonMe();
		this.jButtoncon_ventasComisionConfigBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_ventasComisionConfigBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_ventasComisionConfigBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_ventasComisionConfigBusqueda.setText("U");
		this.jButtoncon_ventasComisionConfigBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_ventasComisionConfigBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_ventasComisionConfigBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_ventasComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_ventasComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_ventasComisionConfigBusqueda"));

		if(this.comisionconfigSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_ventasComisionConfigBusqueda.setVisible(false);		}


					
		this.jLabelcon_cobrosComisionConfig = new JLabelMe();
		this.jLabelcon_cobrosComisionConfig.setText(""+ComisionConfigConstantesFunciones.LABEL_CONCOBROS+" : *");
		this.jLabelcon_cobrosComisionConfig.setToolTipText("Con Cobros");
		this.jLabelcon_cobrosComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_cobrosComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_cobrosComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cobrosComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cobrosComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cobrosComisionConfig.setToolTipText(ComisionConfigConstantesFunciones.LABEL_CONCOBROS);
		this.gridaBagLayoutComisionConfig = new GridBagLayout();
		this.jPanelcon_cobrosComisionConfig.setLayout(this.gridaBagLayoutComisionConfig);


		jCheckBoxcon_cobrosComisionConfig= new JCheckBoxMe();
		jCheckBoxcon_cobrosComisionConfig.setEnabled(false);

		jCheckBoxcon_cobrosComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cobrosComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cobrosComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cobrosComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cobrosComisionConfigBusqueda= new JButtonMe();
		this.jButtoncon_cobrosComisionConfigBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cobrosComisionConfigBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cobrosComisionConfigBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cobrosComisionConfigBusqueda.setText("U");
		this.jButtoncon_cobrosComisionConfigBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cobrosComisionConfigBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cobrosComisionConfigBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cobrosComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cobrosComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cobrosComisionConfigBusqueda"));

		if(this.comisionconfigSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cobrosComisionConfigBusqueda.setVisible(false);		}


					
		this.jLabelcon_remesa_transitoComisionConfig = new JLabelMe();
		this.jLabelcon_remesa_transitoComisionConfig.setText(""+ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO+" : *");
		this.jLabelcon_remesa_transitoComisionConfig.setToolTipText("Con Remesa Transito");
		this.jLabelcon_remesa_transitoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_remesa_transitoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_remesa_transitoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_remesa_transitoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_remesa_transitoComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_remesa_transitoComisionConfig.setToolTipText(ComisionConfigConstantesFunciones.LABEL_CONREMESATRANSITO);
		this.gridaBagLayoutComisionConfig = new GridBagLayout();
		this.jPanelcon_remesa_transitoComisionConfig.setLayout(this.gridaBagLayoutComisionConfig);


		jCheckBoxcon_remesa_transitoComisionConfig= new JCheckBoxMe();
		jCheckBoxcon_remesa_transitoComisionConfig.setEnabled(false);

		jCheckBoxcon_remesa_transitoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_remesa_transitoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_remesa_transitoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_remesa_transitoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_remesa_transitoComisionConfigBusqueda= new JButtonMe();
		this.jButtoncon_remesa_transitoComisionConfigBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_remesa_transitoComisionConfigBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_remesa_transitoComisionConfigBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_remesa_transitoComisionConfigBusqueda.setText("U");
		this.jButtoncon_remesa_transitoComisionConfigBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_remesa_transitoComisionConfigBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_remesa_transitoComisionConfigBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_remesa_transitoComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_remesa_transitoComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_remesa_transitoComisionConfigBusqueda"));

		if(this.comisionconfigSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_remesa_transitoComisionConfigBusqueda.setVisible(false);		}


					
		this.jLabelcon_penalidadComisionConfig = new JLabelMe();
		this.jLabelcon_penalidadComisionConfig.setText(""+ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD+" : *");
		this.jLabelcon_penalidadComisionConfig.setToolTipText("Con Penalidad");
		this.jLabelcon_penalidadComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_penalidadComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_penalidadComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_penalidadComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_penalidadComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_penalidadComisionConfig.setToolTipText(ComisionConfigConstantesFunciones.LABEL_CONPENALIDAD);
		this.gridaBagLayoutComisionConfig = new GridBagLayout();
		this.jPanelcon_penalidadComisionConfig.setLayout(this.gridaBagLayoutComisionConfig);


		jCheckBoxcon_penalidadComisionConfig= new JCheckBoxMe();
		jCheckBoxcon_penalidadComisionConfig.setEnabled(false);

		jCheckBoxcon_penalidadComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_penalidadComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_penalidadComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_penalidadComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_penalidadComisionConfigBusqueda= new JButtonMe();
		this.jButtoncon_penalidadComisionConfigBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_penalidadComisionConfigBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_penalidadComisionConfigBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_penalidadComisionConfigBusqueda.setText("U");
		this.jButtoncon_penalidadComisionConfigBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_penalidadComisionConfigBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_penalidadComisionConfigBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_penalidadComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_penalidadComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_penalidadComisionConfigBusqueda"));

		if(this.comisionconfigSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_penalidadComisionConfigBusqueda.setVisible(false);		}


					
		this.jLabelcon_abonoComisionConfig = new JLabelMe();
		this.jLabelcon_abonoComisionConfig.setText(""+ComisionConfigConstantesFunciones.LABEL_CONABONO+" : *");
		this.jLabelcon_abonoComisionConfig.setToolTipText("Con Abono");
		this.jLabelcon_abonoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_abonoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_abonoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_abonoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_abonoComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_abonoComisionConfig.setToolTipText(ComisionConfigConstantesFunciones.LABEL_CONABONO);
		this.gridaBagLayoutComisionConfig = new GridBagLayout();
		this.jPanelcon_abonoComisionConfig.setLayout(this.gridaBagLayoutComisionConfig);


		jCheckBoxcon_abonoComisionConfig= new JCheckBoxMe();
		jCheckBoxcon_abonoComisionConfig.setEnabled(false);

		jCheckBoxcon_abonoComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_abonoComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_abonoComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_abonoComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_abonoComisionConfigBusqueda= new JButtonMe();
		this.jButtoncon_abonoComisionConfigBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_abonoComisionConfigBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_abonoComisionConfigBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_abonoComisionConfigBusqueda.setText("U");
		this.jButtoncon_abonoComisionConfigBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_abonoComisionConfigBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_abonoComisionConfigBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_abonoComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_abonoComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_abonoComisionConfigBusqueda"));

		if(this.comisionconfigSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_abonoComisionConfigBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComisionConfig() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComisionConfig = new JLabelMe();
		this.jLabelid_empresaComisionConfig.setText(""+ComisionConfigConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComisionConfig.setToolTipText("Empresa");
		this.jLabelid_empresaComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComisionConfig.setToolTipText(ComisionConfigConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComisionConfig = new GridBagLayout();
		this.jPanelid_empresaComisionConfig.setLayout(this.gridaBagLayoutComisionConfig);


		jComboBoxid_empresaComisionConfig= new JComboBoxMe();
		jComboBoxid_empresaComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComisionConfig.setEnabled(false);

		this.jButtonid_empresaComisionConfig= new JButtonMe();
		this.jButtonid_empresaComisionConfig.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionConfig.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionConfig.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionConfig.setText("Buscar");
		this.jButtonid_empresaComisionConfig.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComisionConfig.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionConfig,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionConfig"));

		this.jButtonid_empresaComisionConfigBusqueda= new JButtonMe();
		this.jButtonid_empresaComisionConfigBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionConfigBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionConfigBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionConfigBusqueda.setText("U");
		this.jButtonid_empresaComisionConfigBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComisionConfigBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionConfigBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionConfigBusqueda"));

		if(this.comisionconfigSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComisionConfigBusqueda.setVisible(false);		}

		this.jButtonid_empresaComisionConfigUpdate= new JButtonMe();
		this.jButtonid_empresaComisionConfigUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionConfigUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionConfigUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionConfigUpdate.setText("U");
		this.jButtonid_empresaComisionConfigUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComisionConfigUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionConfigUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionConfigUpdate"));



					
		this.jLabelid_tipo_comision_configComisionConfig = new JLabelMe();
		this.jLabelid_tipo_comision_configComisionConfig.setText(""+ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG+" : *");
		this.jLabelid_tipo_comision_configComisionConfig.setToolTipText("Tipo Configuracion");
		this.jLabelid_tipo_comision_configComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_comision_configComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_comision_configComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comision_configComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_comision_configComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_comision_configComisionConfig.setToolTipText(ComisionConfigConstantesFunciones.LABEL_IDTIPOCOMISIONCONFIG);
		this.gridaBagLayoutComisionConfig = new GridBagLayout();
		this.jPanelid_tipo_comision_configComisionConfig.setLayout(this.gridaBagLayoutComisionConfig);


		jComboBoxid_tipo_comision_configComisionConfig= new JComboBoxMe();
		jComboBoxid_tipo_comision_configComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comision_configComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comision_configComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comision_configComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_comision_configComisionConfig= new JButtonMe();
		this.jButtonid_tipo_comision_configComisionConfig.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comision_configComisionConfig.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comision_configComisionConfig.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comision_configComisionConfig.setText("Buscar");
		this.jButtonid_tipo_comision_configComisionConfig.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_comision_configComisionConfig.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comision_configComisionConfig,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_comision_configComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comision_configComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comision_configComisionConfig"));

		this.jButtonid_tipo_comision_configComisionConfigBusqueda= new JButtonMe();
		this.jButtonid_tipo_comision_configComisionConfigBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comision_configComisionConfigBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comision_configComisionConfigBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comision_configComisionConfigBusqueda.setText("U");
		this.jButtonid_tipo_comision_configComisionConfigBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_comision_configComisionConfigBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comision_configComisionConfigBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_comision_configComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comision_configComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comision_configComisionConfigBusqueda"));

		if(this.comisionconfigSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_comision_configComisionConfigBusqueda.setVisible(false);		}

		this.jButtonid_tipo_comision_configComisionConfigUpdate= new JButtonMe();
		this.jButtonid_tipo_comision_configComisionConfigUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comision_configComisionConfigUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comision_configComisionConfigUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comision_configComisionConfigUpdate.setText("U");
		this.jButtonid_tipo_comision_configComisionConfigUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_comision_configComisionConfigUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comision_configComisionConfigUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_comision_configComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comision_configComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comision_configComisionConfigUpdate"));



					
		this.jLabelid_nivel_lineaComisionConfig = new JLabelMe();
		this.jLabelid_nivel_lineaComisionConfig.setText(""+ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA+" : *");
		this.jLabelid_nivel_lineaComisionConfig.setToolTipText("Nivel Linea");
		this.jLabelid_nivel_lineaComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_nivel_lineaComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_nivel_lineaComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_nivel_lineaComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_nivel_lineaComisionConfig=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_nivel_lineaComisionConfig.setToolTipText(ComisionConfigConstantesFunciones.LABEL_IDNIVELLINEA);
		this.gridaBagLayoutComisionConfig = new GridBagLayout();
		this.jPanelid_nivel_lineaComisionConfig.setLayout(this.gridaBagLayoutComisionConfig);


		jComboBoxid_nivel_lineaComisionConfig= new JComboBoxMe();
		jComboBoxid_nivel_lineaComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_lineaComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_lineaComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_nivel_lineaComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_nivel_lineaComisionConfig= new JButtonMe();
		this.jButtonid_nivel_lineaComisionConfig.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nivel_lineaComisionConfig.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nivel_lineaComisionConfig.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nivel_lineaComisionConfig.setText("Buscar");
		this.jButtonid_nivel_lineaComisionConfig.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_nivel_lineaComisionConfig.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nivel_lineaComisionConfig,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_nivel_lineaComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nivel_lineaComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_lineaComisionConfig"));

		this.jButtonid_nivel_lineaComisionConfigBusqueda= new JButtonMe();
		this.jButtonid_nivel_lineaComisionConfigBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_lineaComisionConfigBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_lineaComisionConfigBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_nivel_lineaComisionConfigBusqueda.setText("U");
		this.jButtonid_nivel_lineaComisionConfigBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_nivel_lineaComisionConfigBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nivel_lineaComisionConfigBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_nivel_lineaComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nivel_lineaComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_lineaComisionConfigBusqueda"));

		if(this.comisionconfigSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_nivel_lineaComisionConfigBusqueda.setVisible(false);		}

		this.jButtonid_nivel_lineaComisionConfigUpdate= new JButtonMe();
		this.jButtonid_nivel_lineaComisionConfigUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_lineaComisionConfigUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_lineaComisionConfigUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_nivel_lineaComisionConfigUpdate.setText("U");
		this.jButtonid_nivel_lineaComisionConfigUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_nivel_lineaComisionConfigUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nivel_lineaComisionConfigUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_nivel_lineaComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nivel_lineaComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_lineaComisionConfigUpdate"));



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
		//this.jInternalFrameDetalleComisionConfig = new ComisionConfigBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comision Config DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionConfig= new GridBagLayout();
		

		
		String sToolTipComisionConfig="";
		sToolTipComisionConfig=ComisionConfigConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionConfig+="(Comisiones.ComisionConfig)";
		}
		
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionConfig+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComisionConfig = new JButtonMe();
		this.jButtonModificarComisionConfig = new JButtonMe();
        this.jButtonActualizarComisionConfig = new JButtonMe();
        this.jButtonEliminarComisionConfig = new JButtonMe();
        this.jButtonCancelarComisionConfig = new JButtonMe();
        this.jButtonGuardarCambiosComisionConfig = new JButtonMe();
		this.jButtonGuardarCambiosTablaComisionConfig = new JButtonMe();
		this.jButtonCerrarComisionConfig = new JButtonMe();
		
		this.jScrollPanelDatosComisionConfig = new JScrollPane();   
        this.jScrollPanelDatosEdicionComisionConfig = new JScrollPane();
		this.jScrollPanelDatosGeneralComisionConfig = new JScrollPane();
				
		
		
		this.jPanelCamposComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Comision Config";
		
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Configes" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionConfig.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComisionConfig.setName("jPanelCamposComisionConfig"); 

		this.jPanelCamposOcultosComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComisionConfig.setName("jPanelCamposOcultosComisionConfig"); 

        this.jPanelAccionesComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionConfig.setToolTipText("Acciones");
        this.jPanelAccionesComisionConfig.setName("Acciones"); 

		this.jPanelAccionesFormularioComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComisionConfig.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComisionConfig.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComisionConfig.setText("Nuevo");
		this.jButtonModificarComisionConfig.setText("Editar");
        this.jButtonActualizarComisionConfig.setText("Actualizar");
        this.jButtonEliminarComisionConfig.setText("Eliminar");
        this.jButtonCancelarComisionConfig.setText("Cancelar");
        this.jButtonGuardarCambiosComisionConfig.setText("Guardar");
		this.jButtonGuardarCambiosTablaComisionConfig.setText("Guardar");
		this.jButtonCerrarComisionConfig.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionConfig,"nuevo_button","Nuevo",this.comisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComisionConfig,"modificar_button","Editar",this.comisionconfigSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComisionConfig,"actualizar_button","Actualizar",this.comisionconfigSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComisionConfig,"eliminar_button","Eliminar",this.comisionconfigSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComisionConfig,"cancelar_button","Cancelar",this.comisionconfigSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComisionConfig,"guardarcambios_button","Guardar",this.comisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionConfig,"guardarcambiostabla_button","Guardar",this.comisionconfigSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionConfig,"cerrar_button","Salir",this.comisionconfigSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComisionConfig.setToolTipText("Nuevo"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComisionConfig.setToolTipText("Editar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComisionConfig.setToolTipText("Actualizar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComisionConfig.setToolTipText("Eliminar)"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComisionConfig.setToolTipText("Cancelar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComisionConfig.setToolTipText("Guardar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComisionConfig.setToolTipText("Guardar"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionConfig.setToolTipText("Salir"+" "+ComisionConfigConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionConfig";
		inputMap = this.jButtonNuevoComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionConfig.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionConfig"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComisionConfig";
		inputMap = this.jButtonActualizarComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComisionConfig"));
		
		//ELIMINAR
		sMapKey = "EliminarComisionConfig";
		inputMap = this.jButtonEliminarComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComisionConfig"));
		
		//CANCELAR	
		sMapKey = "CancelarComisionConfig";
		inputMap = this.jButtonCancelarComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComisionConfig"));
		
		//CERRAR		
		sMapKey = "CerrarComisionConfig";
		inputMap = this.jButtonCerrarComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionConfig"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionConfig";
		inputMap = this.jButtonGuardarCambiosTablaComisionConfig.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionConfig.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionConfig"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComisionConfig = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComisionConfig.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComisionConfig.setToolTipText("Nuevo ComisionConfig");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComisionConfig = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComisionConfig.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComisionConfig.setToolTipText("Sin Cerrar Ventana ComisionConfig");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComisionConfig = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComisionConfig.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComisionConfig.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionConfig.setText("Accion");
		this.jComboBoxTiposAccionesComisionConfig.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComisionConfig = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComisionConfig.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComisionConfig.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComisionConfig = new JLabelMe();
		
		this.jLabelAccionesComisionConfig.setText("Acciones");		
		this.jLabelAccionesComisionConfig.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionConfig.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionConfig.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComisionConfig();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComisionConfig();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComisionConfig=new JTabbedPane();
		this.jTabbedPaneRelacionesComisionConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComisionConfig,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComisionConfig.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionConfig.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionConfig.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionConfig, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComisionConfig.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionConfig.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionConfig.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComisionConfig, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComisionConfig = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComisionConfig = new GridBagLayout();
		
		this.jPanelCamposComisionConfig.setLayout(gridaBagLayoutCamposComisionConfig);
		this.jPanelCamposOcultosComisionConfig.setLayout(gridaBagLayoutCamposOcultosComisionConfig);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 0;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComisionConfig.add(jLabelIdComisionConfig, this.gridBagConstraintsComisionConfig);



	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 1;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComisionConfig.add(jLabelidComisionConfig, this.gridBagConstraintsComisionConfig);


	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 0;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComisionConfig.add(jLabelid_empresaComisionConfig, this.gridBagConstraintsComisionConfig);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 2;
		this.gridBagConstraintsComisionConfig.ipadx = 0;
		this.gridBagConstraintsComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionConfig.add(jButtonid_empresaComisionConfigBusqueda, this.gridBagConstraintsComisionConfig);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 3;
		this.gridBagConstraintsComisionConfig.ipadx = 0;
		this.gridBagConstraintsComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionConfig.add(jButtonid_empresaComisionConfigUpdate, this.gridBagConstraintsComisionConfig);
	}

	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 1;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComisionConfig.add(jComboBoxid_empresaComisionConfig, this.gridBagConstraintsComisionConfig);


	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 0;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_comision_configComisionConfig.add(jLabelid_tipo_comision_configComisionConfig, this.gridBagConstraintsComisionConfig);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 2;
		this.gridBagConstraintsComisionConfig.ipadx = 0;
		this.gridBagConstraintsComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comision_configComisionConfig.add(jButtonid_tipo_comision_configComisionConfigBusqueda, this.gridBagConstraintsComisionConfig);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 3;
		this.gridBagConstraintsComisionConfig.ipadx = 0;
		this.gridBagConstraintsComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comision_configComisionConfig.add(jButtonid_tipo_comision_configComisionConfigUpdate, this.gridBagConstraintsComisionConfig);
	}

	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 1;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_comision_configComisionConfig.add(jComboBoxid_tipo_comision_configComisionConfig, this.gridBagConstraintsComisionConfig);


	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 0;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_nivel_lineaComisionConfig.add(jLabelid_nivel_lineaComisionConfig, this.gridBagConstraintsComisionConfig);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 2;
		this.gridBagConstraintsComisionConfig.ipadx = 0;
		this.gridBagConstraintsComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_nivel_lineaComisionConfig.add(jButtonid_nivel_lineaComisionConfigBusqueda, this.gridBagConstraintsComisionConfig);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 3;
		this.gridBagConstraintsComisionConfig.ipadx = 0;
		this.gridBagConstraintsComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_nivel_lineaComisionConfig.add(jButtonid_nivel_lineaComisionConfigUpdate, this.gridBagConstraintsComisionConfig);
	}

	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 1;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_nivel_lineaComisionConfig.add(jComboBoxid_nivel_lineaComisionConfig, this.gridBagConstraintsComisionConfig);


	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 0;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_vendedorComisionConfig.add(jLabelcon_vendedorComisionConfig, this.gridBagConstraintsComisionConfig);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 2;
		this.gridBagConstraintsComisionConfig.ipadx = 0;
		this.gridBagConstraintsComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_vendedorComisionConfig.add(jButtoncon_vendedorComisionConfigBusqueda, this.gridBagConstraintsComisionConfig);
	}

	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 1;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_vendedorComisionConfig.add(jCheckBoxcon_vendedorComisionConfig, this.gridBagConstraintsComisionConfig);


	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 0;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_ventasComisionConfig.add(jLabelcon_ventasComisionConfig, this.gridBagConstraintsComisionConfig);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 2;
		this.gridBagConstraintsComisionConfig.ipadx = 0;
		this.gridBagConstraintsComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_ventasComisionConfig.add(jButtoncon_ventasComisionConfigBusqueda, this.gridBagConstraintsComisionConfig);
	}

	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 1;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_ventasComisionConfig.add(jCheckBoxcon_ventasComisionConfig, this.gridBagConstraintsComisionConfig);


	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 0;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_cobrosComisionConfig.add(jLabelcon_cobrosComisionConfig, this.gridBagConstraintsComisionConfig);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 2;
		this.gridBagConstraintsComisionConfig.ipadx = 0;
		this.gridBagConstraintsComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cobrosComisionConfig.add(jButtoncon_cobrosComisionConfigBusqueda, this.gridBagConstraintsComisionConfig);
	}

	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 1;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_cobrosComisionConfig.add(jCheckBoxcon_cobrosComisionConfig, this.gridBagConstraintsComisionConfig);


	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 0;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_remesa_transitoComisionConfig.add(jLabelcon_remesa_transitoComisionConfig, this.gridBagConstraintsComisionConfig);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 2;
		this.gridBagConstraintsComisionConfig.ipadx = 0;
		this.gridBagConstraintsComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_remesa_transitoComisionConfig.add(jButtoncon_remesa_transitoComisionConfigBusqueda, this.gridBagConstraintsComisionConfig);
	}

	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 1;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_remesa_transitoComisionConfig.add(jCheckBoxcon_remesa_transitoComisionConfig, this.gridBagConstraintsComisionConfig);


	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 0;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_penalidadComisionConfig.add(jLabelcon_penalidadComisionConfig, this.gridBagConstraintsComisionConfig);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 2;
		this.gridBagConstraintsComisionConfig.ipadx = 0;
		this.gridBagConstraintsComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_penalidadComisionConfig.add(jButtoncon_penalidadComisionConfigBusqueda, this.gridBagConstraintsComisionConfig);
	}

	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 1;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_penalidadComisionConfig.add(jCheckBoxcon_penalidadComisionConfig, this.gridBagConstraintsComisionConfig);


	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 0;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_abonoComisionConfig.add(jLabelcon_abonoComisionConfig, this.gridBagConstraintsComisionConfig);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		//this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = 2;
		this.gridBagConstraintsComisionConfig.ipadx = 0;
		this.gridBagConstraintsComisionConfig.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_abonoComisionConfig.add(jButtoncon_abonoComisionConfigBusqueda, this.gridBagConstraintsComisionConfig);
	}

	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionConfig.gridy = 0;
	this.gridBagConstraintsComisionConfig.gridx = 1;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_abonoComisionConfig.add(jCheckBoxcon_abonoComisionConfig, this.gridBagConstraintsComisionConfig);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionConfig.gridy = iYPanelCamposComisionConfig;
	this.gridBagConstraintsComisionConfig.gridx = iXPanelCamposComisionConfig++;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionConfig.add(this.jPanelidComisionConfig, this.gridBagConstraintsComisionConfig);



	if(iXPanelCamposComisionConfig % 1==0) {
		iXPanelCamposComisionConfig=0;
		iYPanelCamposComisionConfig++;
	}
	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionConfig.gridy = iYPanelCamposComisionConfig;
	this.gridBagConstraintsComisionConfig.gridx = iXPanelCamposComisionConfig++;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionConfig.add(this.jPanelid_tipo_comision_configComisionConfig, this.gridBagConstraintsComisionConfig);



	if(iXPanelCamposComisionConfig % 1==0) {
		iXPanelCamposComisionConfig=0;
		iYPanelCamposComisionConfig++;
	}
	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionConfig.gridy = iYPanelCamposComisionConfig;
	this.gridBagConstraintsComisionConfig.gridx = iXPanelCamposComisionConfig++;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionConfig.add(this.jPanelid_nivel_lineaComisionConfig, this.gridBagConstraintsComisionConfig);



	if(iXPanelCamposComisionConfig % 1==0) {
		iXPanelCamposComisionConfig=0;
		iYPanelCamposComisionConfig++;
	}
	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionConfig.gridy = iYPanelCamposComisionConfig;
	this.gridBagConstraintsComisionConfig.gridx = iXPanelCamposComisionConfig++;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionConfig.add(this.jPanelcon_vendedorComisionConfig, this.gridBagConstraintsComisionConfig);



	if(iXPanelCamposComisionConfig % 1==0) {
		iXPanelCamposComisionConfig=0;
		iYPanelCamposComisionConfig++;
	}
	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionConfig.gridy = iYPanelCamposComisionConfig;
	this.gridBagConstraintsComisionConfig.gridx = iXPanelCamposComisionConfig++;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionConfig.add(this.jPanelcon_ventasComisionConfig, this.gridBagConstraintsComisionConfig);



	if(iXPanelCamposComisionConfig % 1==0) {
		iXPanelCamposComisionConfig=0;
		iYPanelCamposComisionConfig++;
	}
	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionConfig.gridy = iYPanelCamposComisionConfig;
	this.gridBagConstraintsComisionConfig.gridx = iXPanelCamposComisionConfig++;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionConfig.add(this.jPanelcon_cobrosComisionConfig, this.gridBagConstraintsComisionConfig);



	if(iXPanelCamposComisionConfig % 1==0) {
		iXPanelCamposComisionConfig=0;
		iYPanelCamposComisionConfig++;
	}
	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionConfig.gridy = iYPanelCamposComisionConfig;
	this.gridBagConstraintsComisionConfig.gridx = iXPanelCamposComisionConfig++;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionConfig.add(this.jPanelcon_remesa_transitoComisionConfig, this.gridBagConstraintsComisionConfig);



	if(iXPanelCamposComisionConfig % 1==0) {
		iXPanelCamposComisionConfig=0;
		iYPanelCamposComisionConfig++;
	}
	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionConfig.gridy = iYPanelCamposComisionConfig;
	this.gridBagConstraintsComisionConfig.gridx = iXPanelCamposComisionConfig++;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionConfig.add(this.jPanelcon_penalidadComisionConfig, this.gridBagConstraintsComisionConfig);



	if(iXPanelCamposComisionConfig % 1==0) {
		iXPanelCamposComisionConfig=0;
		iYPanelCamposComisionConfig++;
	}
	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionConfig.gridy = iYPanelCamposComisionConfig;
	this.gridBagConstraintsComisionConfig.gridx = iXPanelCamposComisionConfig++;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionConfig.add(this.jPanelcon_abonoComisionConfig, this.gridBagConstraintsComisionConfig);



	if(iXPanelCamposComisionConfig % 1==0) {
		iXPanelCamposComisionConfig=0;
		iYPanelCamposComisionConfig++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionConfig.gridy = iYPanelCamposOcultosComisionConfig;
	this.gridBagConstraintsComisionConfig.gridx = iXPanelCamposOcultosComisionConfig++;
	this.gridBagConstraintsComisionConfig.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionConfig.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComisionConfig.add(this.jPanelid_empresaComisionConfig, this.gridBagConstraintsComisionConfig);



	if(iXPanelCamposOcultosComisionConfig % 1==0) {
		iXPanelCamposOcultosComisionConfig=0;
		iYPanelCamposOcultosComisionConfig++;
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
			
		GridBagLayout gridaBagLayoutAccionesComisionConfig= new GridBagLayout();
		this.jPanelAccionesComisionConfig.setLayout(gridaBagLayoutAccionesComisionConfig);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComisionConfig= new GridBagLayout();
		this.jPanelAccionesFormularioComisionConfig.setLayout(gridaBagLayoutAccionesFormularioComisionConfig);
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionConfig.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionConfig.add(this.jComboBoxTiposAccionesFormularioComisionConfig, this.gridBagConstraintsComisionConfig);

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionConfig.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionConfig.add(this.jCheckBoxPostAccionNuevoComisionConfig, this.gridBagConstraintsComisionConfig);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.comisionconfigSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionConfig.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionConfig.add(this.jCheckBoxPostAccionSinCerrarComisionConfig, this.gridBagConstraintsComisionConfig);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.comisionconfigSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.comisionconfigSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionConfig.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionConfig.add(this.jCheckBoxPostAccionSinMensajeComisionConfig, this.gridBagConstraintsComisionConfig);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx = iPosXAccion++;
			
		this.jPanelAccionesComisionConfig.add(this.jButtonModificarComisionConfig, this.gridBagConstraintsComisionConfig);							

		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionConfig.gridy = 0;
		this.gridBagConstraintsComisionConfig.gridx =iPosXAccion++;
			
		this.jPanelAccionesComisionConfig.add(this.jButtonEliminarComisionConfig, this.gridBagConstraintsComisionConfig);
		
			
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = 0;		
		this.gridBagConstraintsComisionConfig.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionConfig.add(this.jButtonActualizarComisionConfig, this.gridBagConstraintsComisionConfig);


		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = 0;		
		this.gridBagConstraintsComisionConfig.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionConfig.add(this.jButtonGuardarCambiosComisionConfig, this.gridBagConstraintsComisionConfig);	
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = 0;		
		this.gridBagConstraintsComisionConfig.gridx =iPosXAccion++;
		
		this.jPanelAccionesComisionConfig.add(this.jButtonCancelarComisionConfig, this.gridBagConstraintsComisionConfig);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionConfig = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionConfig);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisionconfigSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();						
			this.gridBagConstraintsComisionConfig.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionConfig.gridx = 0;		
			//this.gridBagConstraintsComisionConfig.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionConfig.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionConfig.gridx =0;
		this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionConfig.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionConfig, this.gridBagConstraintsComisionConfig);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComisionConfigJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComisionConfig = new ComisionConfigBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comision Config DATOS");
			
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
			
	        //this.setTitle("[FOR] - Comision Config DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comision Config Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComisionConfigModel comisionconfigModel=new ComisionConfigModel(this);
			
			//SI USARA CLASE INTERNA
			//ComisionConfigModel.ComisionConfigFocusTraversalPolicy comisionconfigFocusTraversalPolicy = comisionconfigModel.new ComisionConfigFocusTraversalPolicy(this);
			
			//comisionconfigFocusTraversalPolicy.setcomisionconfigJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comisionconfigModel);
			
			
			this.jContentPaneDetalleComisionConfig = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComisionConfig = new GridBagLayout();	
			this.jContentPaneDetalleComisionConfig.setLayout(gridaBagLayoutDetalleComisionConfig);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionConfig = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComisionConfig = new GridBagConstraints();
				this.gridBagConstraintsComisionConfig.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComisionConfig.gridx = 0;
					
				
				this.jContentPaneDetalleComisionConfig.add(jTtoolBarDetalleComisionConfig, gridBagConstraintsComisionConfig);								
				
}
			
			this.jScrollPanelDatosEdicionComisionConfig=   new JScrollPane(jContentPaneDetalleComisionConfig,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionConfig.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionConfig.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionConfig.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComisionConfig=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionConfig.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionConfig.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionConfig.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComisionConfig.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComisionConfig.gridx = 0;
	        
			this.jContentPaneDetalleComisionConfig.add(jPanelCamposComisionConfig, gridBagConstraintsComisionConfig);
			
			
			
			
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
						&& comisionconfigSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameComisionCate(this.puedeCargarPorParteComisionCate,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionGrupo(this.puedeCargarPorParteComisionGrupo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionLinea(this.puedeCargarPorParteComisionLinea,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionMarca(this.puedeCargarPorParteComisionMarca,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionPena(this.puedeCargarPorParteComisionPena,false,-1);
					
					if(this.comisionconfigSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComisionConfig= new GridBagConstraints();
						this.gridBagConstraintsComisionConfig.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComisionConfig.gridx = 0;
						this.jContentPaneDetalleComisionConfig.add(this.jTabbedPaneRelacionesComisionConfig, this.gridBagConstraintsComisionConfig);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComisionConfig.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameComisionCate(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionGrupo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionLinea(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionMarca(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionPena(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComisionConfig.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComisionConfig = new GridBagConstraints();
					this.gridBagConstraintsComisionConfig.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComisionConfig.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComisionConfig.gridx = 0;
					
				
					this.jContentPaneDetalleComisionConfig.add(jPanelCamposOcultosComisionConfig, gridBagConstraintsComisionConfig);
				
					this.jPanelCamposOcultosComisionConfig.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.gridy = iGridyRelaciones++;//16;		
	        this.gridBagConstraintsComisionConfig.gridx = 0;
	        this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComisionConfig.add(this.jPanelAccionesFormularioComisionConfig, this.gridBagConstraintsComisionConfig);							
			
			
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
	        this.gridBagConstraintsComisionConfig.gridy = iGridyRelaciones;//16;		
	        this.gridBagConstraintsComisionConfig.gridx = 0;
	        
			
			this.jContentPaneDetalleComisionConfig.add(this.jPanelAccionesComisionConfig, this.gridBagConstraintsComisionConfig);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComisionConfig);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComisionConfig=   new JScrollPane(this.jPanelCamposComisionConfig,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionConfig.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionConfig.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionConfig.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComisionConfig.gridx = 0;
			this.gridBagConstraintsComisionConfig.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComisionConfig.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComisionConfig.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComisionConfig, this.gridBagConstraintsComisionConfig);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionConfig.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComisionConfig, this.gridBagConstraintsComisionConfig);			
			
			this.gridBagConstraintsComisionConfig = new GridBagConstraints();
			this.gridBagConstraintsComisionConfig.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionConfig.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComisionConfig, this.gridBagConstraintsComisionConfig);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionConfig.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionConfig, this.gridBagConstraintsComisionConfig);
			
			
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionConfig.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionConfig, this.gridBagConstraintsComisionConfig);
		
			
		this.gridBagConstraintsComisionConfig = new GridBagConstraints();
		this.gridBagConstraintsComisionConfig.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionConfig.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionConfig, this.gridBagConstraintsComisionConfig);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComisionConfig;//jContentPane;
		
		return jScrollPanelDatosEdicionComisionConfig;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameComisionCate(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisioncateSessionBean=new ComisionCateSessionBean();
		this.comisioncateSessionBean.setConGuardarRelaciones(false);
		this.comisioncateSessionBean.setEsGuardarRelacionado(true);

		this.comisioncateBeanSwingJInternalFrame=null;//new ComisionCateBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisioncateBeanSwingJInternalFramePopup=new ComisionCateBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisioncateBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {

				ComisionCateJInternalFrame.STIPO_TAMANIO_GENERAL=ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionCateJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisioncateSessionBean.setEsGuardarRelacionado(true);

				this.comisioncateBeanSwingJInternalFrame=new ComisionCateBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisioncateBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisioncateBeanSwingJInternalFrame.setcomisioncateSessionBean(this.comisioncateSessionBean);

				//this.gridBagConstraintsComisionConfig = new GridBagConstraints();
				//this.gridBagConstraintsComisionConfig.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsComisionConfig.gridx = 0;
				//this.jContentPaneDetalleComisionConfig.add(this.comisioncateBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsComisionConfig);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesComisionConfig.add("Comision Cates",this.comisioncateBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesComisionConfig.setComponentAt(iIndexTab,this.comisioncateBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisioncateSessionBean.setEsGuardarRelacionado(false);
				this.comisioncateBeanSwingJInternalFrame=null;//new ComisionCateBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionCate) {
					this.jTabbedPaneRelacionesComisionConfig.add("Comision Cates",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionGrupo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
		this.comisiongrupoSessionBean.setConGuardarRelaciones(false);
		this.comisiongrupoSessionBean.setEsGuardarRelacionado(true);

		this.comisiongrupoBeanSwingJInternalFrame=null;//new ComisionGrupoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisiongrupoBeanSwingJInternalFramePopup=new ComisionGrupoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisiongrupoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {

				ComisionGrupoJInternalFrame.STIPO_TAMANIO_GENERAL=ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionGrupoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisiongrupoSessionBean.setEsGuardarRelacionado(true);

				this.comisiongrupoBeanSwingJInternalFrame=new ComisionGrupoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisiongrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisiongrupoBeanSwingJInternalFrame.setcomisiongrupoSessionBean(this.comisiongrupoSessionBean);

				//this.gridBagConstraintsComisionConfig = new GridBagConstraints();
				//this.gridBagConstraintsComisionConfig.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsComisionConfig.gridx = 0;
				//this.jContentPaneDetalleComisionConfig.add(this.comisiongrupoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsComisionConfig);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesComisionConfig.add("Comision Grupos",this.comisiongrupoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesComisionConfig.setComponentAt(iIndexTab,this.comisiongrupoBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisiongrupoSessionBean.setEsGuardarRelacionado(false);
				this.comisiongrupoBeanSwingJInternalFrame=null;//new ComisionGrupoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionGrupo) {
					this.jTabbedPaneRelacionesComisionConfig.add("Comision Grupos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionLinea(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisionlineaSessionBean=new ComisionLineaSessionBean();
		this.comisionlineaSessionBean.setConGuardarRelaciones(false);
		this.comisionlineaSessionBean.setEsGuardarRelacionado(true);

		this.comisionlineaBeanSwingJInternalFrame=null;//new ComisionLineaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisionlineaBeanSwingJInternalFramePopup=new ComisionLineaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisionlineaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {

				ComisionLineaJInternalFrame.STIPO_TAMANIO_GENERAL=ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisionlineaSessionBean.setEsGuardarRelacionado(true);

				this.comisionlineaBeanSwingJInternalFrame=new ComisionLineaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisionlineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisionlineaBeanSwingJInternalFrame.setcomisionlineaSessionBean(this.comisionlineaSessionBean);

				//this.gridBagConstraintsComisionConfig = new GridBagConstraints();
				//this.gridBagConstraintsComisionConfig.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsComisionConfig.gridx = 0;
				//this.jContentPaneDetalleComisionConfig.add(this.comisionlineaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsComisionConfig);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesComisionConfig.add("Comision Lineas",this.comisionlineaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesComisionConfig.setComponentAt(iIndexTab,this.comisionlineaBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisionlineaSessionBean.setEsGuardarRelacionado(false);
				this.comisionlineaBeanSwingJInternalFrame=null;//new ComisionLineaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionLinea) {
					this.jTabbedPaneRelacionesComisionConfig.add("Comision Lineas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionMarca(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
		this.comisionmarcaSessionBean.setConGuardarRelaciones(false);
		this.comisionmarcaSessionBean.setEsGuardarRelacionado(true);

		this.comisionmarcaBeanSwingJInternalFrame=null;//new ComisionMarcaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisionmarcaBeanSwingJInternalFramePopup=new ComisionMarcaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisionmarcaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {

				ComisionMarcaJInternalFrame.STIPO_TAMANIO_GENERAL=ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionMarcaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisionmarcaSessionBean.setEsGuardarRelacionado(true);

				this.comisionmarcaBeanSwingJInternalFrame=new ComisionMarcaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisionmarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisionmarcaBeanSwingJInternalFrame.setcomisionmarcaSessionBean(this.comisionmarcaSessionBean);

				//this.gridBagConstraintsComisionConfig = new GridBagConstraints();
				//this.gridBagConstraintsComisionConfig.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsComisionConfig.gridx = 0;
				//this.jContentPaneDetalleComisionConfig.add(this.comisionmarcaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsComisionConfig);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesComisionConfig.add("Comision Marcas",this.comisionmarcaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesComisionConfig.setComponentAt(iIndexTab,this.comisionmarcaBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisionmarcaSessionBean.setEsGuardarRelacionado(false);
				this.comisionmarcaBeanSwingJInternalFrame=null;//new ComisionMarcaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionMarca) {
					this.jTabbedPaneRelacionesComisionConfig.add("Comision Marcas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionPena(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisionpenaSessionBean=new ComisionPenaSessionBean();
		this.comisionpenaSessionBean.setConGuardarRelaciones(false);
		this.comisionpenaSessionBean.setEsGuardarRelacionado(true);

		this.comisionpenaBeanSwingJInternalFrame=null;//new ComisionPenaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisionpenaBeanSwingJInternalFramePopup=new ComisionPenaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisionpenaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisionpenaSessionBean.getEsGuardarRelacionado()) {

				ComisionPenaJInternalFrame.STIPO_TAMANIO_GENERAL=ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionPenaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ComisionConfigJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisionpenaSessionBean.setEsGuardarRelacionado(true);

				this.comisionpenaBeanSwingJInternalFrame=new ComisionPenaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisionpenaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisionpenaBeanSwingJInternalFrame.setcomisionpenaSessionBean(this.comisionpenaSessionBean);

				//this.gridBagConstraintsComisionConfig = new GridBagConstraints();
				//this.gridBagConstraintsComisionConfig.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsComisionConfig.gridx = 0;
				//this.jContentPaneDetalleComisionConfig.add(this.comisionpenaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsComisionConfig);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesComisionConfig.add("Penalidad Comisions",this.comisionpenaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesComisionConfig.setComponentAt(iIndexTab,this.comisionpenaBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionPenaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisionpenaSessionBean.setEsGuardarRelacionado(false);
				this.comisionpenaBeanSwingJInternalFrame=null;//new ComisionPenaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisionpenaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionPena) {
					this.jTabbedPaneRelacionesComisionConfig.add("Penalidad Comisions",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarComisionCateBeanSwingJInternalFrame(List<ComisionConfig> comisionconfigs,ComisionConfig comisionconfig,ComisionCateBeanSwingJInternalFrame comisioncateBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisioncateBeanSwingJInternalFrame=new ComisionCateBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisioncateBeanSwingJInternalFrame.getComisionCateLogic().setConnexion(this.comisionconfigLogic.getConnexion());

					comisioncateBeanSwingJInternalFrame.setcomisionconfigsForeignKey(comisionconfigs);
					comisioncateBeanSwingJInternalFrame.setcomisionconfigForeignKey(comisionconfig);
					comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setisBusquedaDesdeForeignKeySesionComisionConfig(true);
					comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setlidComisionConfigActual(comisionconfig.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisioncateBeanSwingJInternalFrame.cargarCombosForeignKeyComisionCate(comisioncateBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisioncateBeanSwingJInternalFrame.setVisibilidadBusquedasParaComisionConfig(true);
					comisioncateBeanSwingJInternalFrame.setid_comision_configFK_IdComisionConfig(comisionconfig.getId());

					if(!this.conCargarFormDetalle) {
						comisioncateBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisioncateBeanSwingJInternalFrame.setSelectedItemCombosFrameComisionConfigForeignKey(comisionconfig,1,false,true,true);
					comisioncateBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisioncateBeanSwingJInternalFrame.procesarBusqueda("FK_IdComisionConfig");
					comisioncateBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdComisionConfig");
					comisioncateBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionCate(true);
					comisioncateBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionCate("n",comisioncateBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisioncateBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisioncateBeanSwingJInternalFrame.setAutoscrolls(true);
					comisioncateBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisioncateBeanSwingJInternalFrame.actualizarEstadoPanelsComisionCate("relacionado");
					} else {
						comisioncateBeanSwingJInternalFrame.actualizarEstadoPanelsComisionCate("no_relacionado");
					}

					comisioncateBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionCate().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionMarcaBeanSwingJInternalFrame(List<ComisionConfig> comisionconfigs,ComisionConfig comisionconfig,ComisionMarcaBeanSwingJInternalFrame comisionmarcaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisionmarcaBeanSwingJInternalFrame=new ComisionMarcaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisionmarcaBeanSwingJInternalFrame.getComisionMarcaLogic().setConnexion(this.comisionconfigLogic.getConnexion());

					comisionmarcaBeanSwingJInternalFrame.setcomisionconfigsForeignKey(comisionconfigs);
					comisionmarcaBeanSwingJInternalFrame.setcomisionconfigForeignKey(comisionconfig);
					comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setisBusquedaDesdeForeignKeySesionComisionConfig(true);
					comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setlidComisionConfigActual(comisionconfig.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisionmarcaBeanSwingJInternalFrame.cargarCombosForeignKeyComisionMarca(comisionmarcaBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisionmarcaBeanSwingJInternalFrame.setVisibilidadBusquedasParaComisionConfig(true);
					comisionmarcaBeanSwingJInternalFrame.setid_comision_configFK_IdComisionConfig(comisionconfig.getId());

					if(!this.conCargarFormDetalle) {
						comisionmarcaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisionmarcaBeanSwingJInternalFrame.setSelectedItemCombosFrameComisionConfigForeignKey(comisionconfig,1,false,true,true);
					comisionmarcaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisionmarcaBeanSwingJInternalFrame.procesarBusqueda("FK_IdComisionConfig");
					comisionmarcaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdComisionConfig");
					comisionmarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionMarca(true);
					comisionmarcaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionMarca("n",comisionmarcaBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisionmarcaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisionmarcaBeanSwingJInternalFrame.setAutoscrolls(true);
					comisionmarcaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisionmarcaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionMarca("relacionado");
					} else {
						comisionmarcaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionMarca("no_relacionado");
					}

					comisionmarcaBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionMarca().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionLineaBeanSwingJInternalFrame(List<ComisionConfig> comisionconfigs,ComisionConfig comisionconfig,ComisionLineaBeanSwingJInternalFrame comisionlineaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisionlineaBeanSwingJInternalFrame=new ComisionLineaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisionlineaBeanSwingJInternalFrame.getComisionLineaLogic().setConnexion(this.comisionconfigLogic.getConnexion());

					comisionlineaBeanSwingJInternalFrame.setcomisionconfigsForeignKey(comisionconfigs);
					comisionlineaBeanSwingJInternalFrame.setcomisionconfigForeignKey(comisionconfig);
					comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setisBusquedaDesdeForeignKeySesionComisionConfig(true);
					comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setlidComisionConfigActual(comisionconfig.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisionlineaBeanSwingJInternalFrame.cargarCombosForeignKeyComisionLinea(comisionlineaBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisionlineaBeanSwingJInternalFrame.setVisibilidadBusquedasParaComisionConfig(true);
					comisionlineaBeanSwingJInternalFrame.setid_comision_configFK_IdComisionConfig(comisionconfig.getId());

					if(!this.conCargarFormDetalle) {
						comisionlineaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisionlineaBeanSwingJInternalFrame.setSelectedItemCombosFrameComisionConfigForeignKey(comisionconfig,1,false,true,true);
					comisionlineaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisionlineaBeanSwingJInternalFrame.procesarBusqueda("FK_IdComisionConfig");
					comisionlineaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdComisionConfig");
					comisionlineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionLinea(true);
					comisionlineaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionLinea("n",comisionlineaBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisionlineaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisionlineaBeanSwingJInternalFrame.setAutoscrolls(true);
					comisionlineaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisionlineaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionLinea("relacionado");
					} else {
						comisionlineaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionLinea("no_relacionado");
					}

					comisionlineaBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionLinea().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionPenaBeanSwingJInternalFrame(List<ComisionConfig> comisionconfigs,ComisionConfig comisionconfig,ComisionPenaBeanSwingJInternalFrame comisionpenaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisionpenaBeanSwingJInternalFrame=new ComisionPenaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisionpenaBeanSwingJInternalFrame.getComisionPenaLogic().setConnexion(this.comisionconfigLogic.getConnexion());

					comisionpenaBeanSwingJInternalFrame.setcomisionconfigsForeignKey(comisionconfigs);
					comisionpenaBeanSwingJInternalFrame.setcomisionconfigForeignKey(comisionconfig);
					comisionpenaBeanSwingJInternalFrame.comisionpenaSessionBean.setisBusquedaDesdeForeignKeySesionComisionConfig(true);
					comisionpenaBeanSwingJInternalFrame.comisionpenaSessionBean.setlidComisionConfigActual(comisionconfig.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisionpenaBeanSwingJInternalFrame.cargarCombosForeignKeyComisionPena(comisionpenaBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisionpenaBeanSwingJInternalFrame.setVisibilidadBusquedasParaComisionConfig(true);
					comisionpenaBeanSwingJInternalFrame.setid_comision_configFK_IdComisionConfig(comisionconfig.getId());

					if(!this.conCargarFormDetalle) {
						comisionpenaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisionpenaBeanSwingJInternalFrame.setSelectedItemCombosFrameComisionConfigForeignKey(comisionconfig,1,false,true,true);
					comisionpenaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisionpenaBeanSwingJInternalFrame.procesarBusqueda("FK_IdComisionConfig");
					comisionpenaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdComisionConfig");
					comisionpenaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionPena(true);
					comisionpenaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionPena("n",comisionpenaBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisionpenaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisionpenaBeanSwingJInternalFrame.setAutoscrolls(true);
					comisionpenaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisionpenaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionPena("relacionado");
					} else {
						comisionpenaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionPena("no_relacionado");
					}

					comisionpenaBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionPena().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionGrupoBeanSwingJInternalFrame(List<ComisionConfig> comisionconfigs,ComisionConfig comisionconfig,ComisionGrupoBeanSwingJInternalFrame comisiongrupoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisiongrupoBeanSwingJInternalFrame=new ComisionGrupoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisiongrupoBeanSwingJInternalFrame.getComisionGrupoLogic().setConnexion(this.comisionconfigLogic.getConnexion());

					comisiongrupoBeanSwingJInternalFrame.setcomisionconfigsForeignKey(comisionconfigs);
					comisiongrupoBeanSwingJInternalFrame.setcomisionconfigForeignKey(comisionconfig);
					comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setisBusquedaDesdeForeignKeySesionComisionConfig(true);
					comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setlidComisionConfigActual(comisionconfig.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisiongrupoBeanSwingJInternalFrame.cargarCombosForeignKeyComisionGrupo(comisiongrupoBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisiongrupoBeanSwingJInternalFrame.setVisibilidadBusquedasParaComisionConfig(true);
					comisiongrupoBeanSwingJInternalFrame.setid_comision_configFK_IdComisionConfig(comisionconfig.getId());

					if(!this.conCargarFormDetalle) {
						comisiongrupoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisiongrupoBeanSwingJInternalFrame.setSelectedItemCombosFrameComisionConfigForeignKey(comisionconfig,1,false,true,true);
					comisiongrupoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisiongrupoBeanSwingJInternalFrame.procesarBusqueda("FK_IdComisionConfig");
					comisiongrupoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdComisionConfig");
					comisiongrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionGrupo(true);
					comisiongrupoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionGrupo("n",comisiongrupoBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisiongrupoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisiongrupoBeanSwingJInternalFrame.setAutoscrolls(true);
					comisiongrupoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisiongrupoBeanSwingJInternalFrame.actualizarEstadoPanelsComisionGrupo("relacionado");
					} else {
						comisiongrupoBeanSwingJInternalFrame.actualizarEstadoPanelsComisionGrupo("no_relacionado");
					}

					comisiongrupoBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionGrupo().setVisible(false);

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
