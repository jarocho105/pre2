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
import com.bydan.erp.comisiones.util.ComisionGrupoConstantesFunciones;

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
public class ComisionGrupoDetalleFormJInternalFrame extends ComisionGrupoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComisionGrupo;
	
	protected JMenuBar jmenuBarDetalleComisionGrupo;
	
	protected JMenu jmenuDetalleComisionGrupo;
	protected JMenu jmenuDetalleArchivoComisionGrupo;
	protected JMenu jmenuDetalleAccionesComisionGrupo;
	protected JMenu jmenuDetalleDatosComisionGrupo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComisionGrupo;	
	protected GridBagConstraints gridBagConstraintsComisionGrupo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComisionGrupoBeanSwingJInternalFrameAdditional jInternalFrameDetalleComisionGrupo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_comisionconfig="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocomision="";
	
	public ComisionGrupoSessionBean comisiongrupoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ComisionConfigSessionBean comisionconfigSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public EstadoComisionSessionBean estadocomisionSessionBean;	
	
	public ComisionGrupoLogic comisiongrupoLogic;
	
	public JScrollPane jScrollPanelDatosComisionGrupo;
	public JScrollPane jScrollPanelDatosEdicionComisionGrupo;
	public JScrollPane jScrollPanelDatosGeneralComisionGrupo;
	
	protected JPanel jPanelCamposComisionGrupo;    
	protected JPanel jPanelCamposOcultosComisionGrupo;    	
	protected JPanel jPanelAccionesComisionGrupo;
	protected JPanel jPanelAccionesFormularioComisionGrupo;
    
	
	
	protected Integer iXPanelCamposComisionGrupo=0;
	protected Integer iYPanelCamposComisionGrupo=0;
	
	protected Integer iXPanelCamposOcultosComisionGrupo=0;
	protected Integer iYPanelCamposOcultosComisionGrupo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComisionGrupo;
	public JButton jButtonModificarComisionGrupo;
	public JButton jButtonActualizarComisionGrupo;
    public JButton jButtonEliminarComisionGrupo;
	public JButton jButtonCancelarComisionGrupo;
    public JButton jButtonGuardarCambiosComisionGrupo;
	public JButton jButtonGuardarCambiosTablaComisionGrupo;
	protected JButton jButtonCerrarComisionGrupo;
	
	
	protected JButton jButtonProcesarInformacionComisionGrupo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComisionGrupo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComisionGrupo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComisionGrupo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComisionGrupo;
	protected JButton jButtonModificarToolBarComisionGrupo;
	protected JButton jButtonActualizarToolBarComisionGrupo;
    protected JButton jButtonEliminarToolBarComisionGrupo;
	protected JButton jButtonCancelarToolBarComisionGrupo;
    protected JButton jButtonGuardarCambiosToolBarComisionGrupo;
	protected JButton jButtonGuardarCambiosTablaToolBarComisionGrupo;
	protected JButton jButtonMostrarOcultarTablaToolBarComisionGrupo;
	protected JButton jButtonCerrarToolBarComisionGrupo;
	
	protected JButton jButtonProcesarInformacionToolBarComisionGrupo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComisionGrupo;
	protected JMenuItem jMenuItemModificarComisionGrupo;
	protected JMenuItem jMenuItemActualizarComisionGrupo;
    protected JMenuItem jMenuItemEliminarComisionGrupo;
	protected JMenuItem jMenuItemCancelarComisionGrupo;
    protected JMenuItem jMenuItemGuardarCambiosComisionGrupo;
	protected JMenuItem jMenuItemGuardarCambiosTablaComisionGrupo;
	protected JMenuItem jMenuItemCerrarComisionGrupo;
	protected JMenuItem jMenuItemDetalleCerrarComisionGrupo;
	protected JMenuItem jMenuItemDetalleMostarOcultarComisionGrupo;
	
	protected JMenuItem jMenuItemProcesarInformacionComisionGrupo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComisionGrupo;
	protected JMenuItem jMenuItemMostrarOcultarComisionGrupo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComisionGrupo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComisionGrupo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComisionGrupo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComisionGrupo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComisionGrupo;
	public JLabel jLabelIdComisionGrupo;
	public JLabel jLabelidComisionGrupo;
	public JButton jButtonidComisionGrupoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeComisionGrupo;
	public JLabel jLabelporcentajeComisionGrupo;
	public JTextField jTextFieldporcentajeComisionGrupo;
	public JButton jButtonporcentajeComisionGrupoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionComisionGrupo;
	public JLabel jLabeldescripcionComisionGrupo;
	public JTextArea jTextAreadescripcionComisionGrupo;
	public JScrollPane jscrollPanedescripcionComisionGrupo;
	public JButton jButtondescripcionComisionGrupoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComisionGrupo;
	public JLabel jLabelid_empresaComisionGrupo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComisionGrupo;
	public JButton jButtonid_empresaComisionGrupo= new JButtonMe();
	public JButton jButtonid_empresaComisionGrupoUpdate= new JButtonMe();
	public JButton jButtonid_empresaComisionGrupoBusqueda= new JButtonMe();

	public JPanel jPanelid_comision_configComisionGrupo;
	public JLabel jLabelid_comision_configComisionGrupo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_comision_configComisionGrupo;
	public JButton jButtonid_comision_configComisionGrupo= new JButtonMe();
	public JButton jButtonid_comision_configComisionGrupoUpdate= new JButtonMe();
	public JButton jButtonid_comision_configComisionGrupoBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorComisionGrupo;
	public JLabel jLabelid_vendedorComisionGrupo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorComisionGrupo;
	public JButton jButtonid_vendedorComisionGrupo= new JButtonMe();
	public JButton jButtonid_vendedorComisionGrupoUpdate= new JButtonMe();
	public JButton jButtonid_vendedorComisionGrupoBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorComisionGrupoArbol= new JButtonMe();

	public JPanel jPanelid_lineaComisionGrupo;
	public JLabel jLabelid_lineaComisionGrupo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaComisionGrupo;
	public JButton jButtonid_lineaComisionGrupo= new JButtonMe();
	public JButton jButtonid_lineaComisionGrupoUpdate= new JButtonMe();
	public JButton jButtonid_lineaComisionGrupoBusqueda= new JButtonMe();
	public JButton jButtonid_lineaComisionGrupoArbol= new JButtonMe();

	public JPanel jPanelid_linea_grupoComisionGrupo;
	public JLabel jLabelid_linea_grupoComisionGrupo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoComisionGrupo;
	public JButton jButtonid_linea_grupoComisionGrupo= new JButtonMe();
	public JButton jButtonid_linea_grupoComisionGrupoUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoComisionGrupoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoComisionGrupoArbol= new JButtonMe();

	public JPanel jPanelid_estado_comisionComisionGrupo;
	public JLabel jLabelid_estado_comisionComisionGrupo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_comisionComisionGrupo;
	public JButton jButtonid_estado_comisionComisionGrupo= new JButtonMe();
	public JButton jButtonid_estado_comisionComisionGrupoUpdate= new JButtonMe();
	public JButton jButtonid_estado_comisionComisionGrupoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComisionGrupo;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ComisionGrupoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComisionGrupo=new JPanel();
				this.jPanelAccionesFormularioComisionGrupo=new JPanel();
				this.jmenuBarDetalleComisionGrupo=new JMenuBar();
				this.jTtoolBarDetalleComisionGrupo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionGrupoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComisionGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComisionGrupoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComisionGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionGrupoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionGrupoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComisionGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComisionGrupoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComisionGrupo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarComisionGrupo() {
		return this.jButtonActualizarToolBarComisionGrupo;
	}
	
	public JButton getjButtonEliminarToolBarComisionGrupo() {
		return this.jButtonEliminarToolBarComisionGrupo;
	}
	
	public JButton getjButtonCancelarToolBarComisionGrupo() {
		return this.jButtonCancelarToolBarComisionGrupo;
	}		
	
	public JButton getjButtonProcesarInformacionComisionGrupo() {
		return this.jButtonProcesarInformacionComisionGrupo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComisionGrupo)	{
		this.jButtonProcesarInformacionComisionGrupo = jButtonProcesarInformacionComisionGrupo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComisionGrupo() {
		return this.jComboBoxTiposAccionesComisionGrupo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComisionGrupo(
			JComboBox jComboBoxTiposRelacionesComisionGrupo) {
		this.jComboBoxTiposRelacionesComisionGrupo = jComboBoxTiposRelacionesComisionGrupo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComisionGrupo(
			JComboBox jComboBoxTiposAccionesComisionGrupo) {
		this.jComboBoxTiposAccionesComisionGrupo = jComboBoxTiposAccionesComisionGrupo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComisionGrupo() {
		return this.jComboBoxTiposAccionesFormularioComisionGrupo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComisionGrupo(
			JComboBox jComboBoxTiposAccionesFormularioComisionGrupo) {
		this.jComboBoxTiposAccionesFormularioComisionGrupo = jComboBoxTiposAccionesFormularioComisionGrupo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
		
		this.comisiongrupoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisiongrupoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comisiongrupoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComisionGrupoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComisionGrupoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComisionGrupoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comision Grupo MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
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
	
		ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComisionGrupo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComisionGrupo=new JButtonMe();
				this.jButtonModificarToolBarComisionGrupo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComisionGrupo,this.jTtoolBarDetalleComisionGrupo,
							"actualizar","actualizar","Actualizar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComisionGrupo,this.jTtoolBarDetalleComisionGrupo,
							"eliminar","eliminar","Eliminar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComisionGrupo,this.jTtoolBarDetalleComisionGrupo,
							"cancelar","cancelar","Cancelar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComisionGrupo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComisionGrupo,this.jTtoolBarDetalleComisionGrupo,
							"guardarcambios","guardarcambios","Guardar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComisionGrupo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComisionGrupo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComisionGrupo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComisionGrupo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComisionGrupo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComisionGrupo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComisionGrupo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComisionGrupo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComisionGrupo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComisionGrupo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComisionGrupo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComisionGrupo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComisionGrupo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComisionGrupo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComisionGrupo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComisionGrupo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComisionGrupo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComisionGrupo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComisionGrupo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComisionGrupo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComisionGrupo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComisionGrupo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComisionGrupo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComisionGrupo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComisionGrupo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComisionGrupo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComisionGrupo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComisionGrupo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComisionGrupo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComisionGrupo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComisionGrupo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComisionGrupo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComisionGrupo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComisionGrupo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComisionGrupo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComisionGrupo.add(this.jMenuItemDetalleCerrarComisionGrupo);
		
		this.jmenuDetalleAccionesComisionGrupo.add(this.jMenuItemActualizarComisionGrupo);
		this.jmenuDetalleAccionesComisionGrupo.add(this.jMenuItemEliminarComisionGrupo);
		this.jmenuDetalleAccionesComisionGrupo.add(this.jMenuItemCancelarComisionGrupo);		
		
		//this.jmenuDetalleDatosComisionGrupo.add(this.jMenuItemDetalleAbrirOrderByComisionGrupo);				
		this.jmenuDetalleDatosComisionGrupo.add(this.jMenuItemDetalleMostarOcultarComisionGrupo);				
				
		//this.jmenuDetalleAccionesComisionGrupo.add(this.jMenuItemGuardarCambiosComisionGrupo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComisionGrupo.add(this.jmenuDetalleArchivoComisionGrupo);		
		this.jmenuBarDetalleComisionGrupo.add(this.jmenuDetalleAccionesComisionGrupo);		
		this.jmenuBarDetalleComisionGrupo.add(this.jmenuDetalleDatosComisionGrupo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComisionGrupo);				
	}
	
	
	public void inicializarElementosCamposComisionGrupo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComisionGrupo = new JLabelMe();
		jLabelIdComisionGrupo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComisionGrupo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComisionGrupo.setToolTipText(ComisionGrupoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComisionGrupo= new GridBagLayout();

		this.jPanelidComisionGrupo.setLayout(this.gridaBagLayoutComisionGrupo);

		jLabelidComisionGrupo = new JLabel();
		jLabelidComisionGrupo.setText("Id");

		jLabelidComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeComisionGrupo = new JLabelMe();
		this.jLabelporcentajeComisionGrupo.setText(""+ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeComisionGrupo.setToolTipText("Porcentaje");
		this.jLabelporcentajeComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeComisionGrupo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeComisionGrupo.setToolTipText(ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutComisionGrupo = new GridBagLayout();
		this.jPanelporcentajeComisionGrupo.setLayout(this.gridaBagLayoutComisionGrupo);


		jTextFieldporcentajeComisionGrupo= new JTextFieldMe();
		jTextFieldporcentajeComisionGrupo.setEnabled(false);
		jTextFieldporcentajeComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeComisionGrupo.setText("0.0");

		this.jButtonporcentajeComisionGrupoBusqueda= new JButtonMe();
		this.jButtonporcentajeComisionGrupoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeComisionGrupoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeComisionGrupoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeComisionGrupoBusqueda.setText("U");
		this.jButtonporcentajeComisionGrupoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeComisionGrupoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeComisionGrupoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeComisionGrupoBusqueda"));

		if(this.comisiongrupoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeComisionGrupoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionComisionGrupo = new JLabelMe();
		this.jLabeldescripcionComisionGrupo.setText(""+ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionComisionGrupo.setToolTipText("Descripcion");
		this.jLabeldescripcionComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionComisionGrupo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionComisionGrupo.setToolTipText(ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutComisionGrupo = new GridBagLayout();
		this.jPaneldescripcionComisionGrupo.setLayout(this.gridaBagLayoutComisionGrupo);


		jTextAreadescripcionComisionGrupo= new JTextAreaMe();
		jTextAreadescripcionComisionGrupo.setEnabled(false);
		jTextAreadescripcionComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionComisionGrupo.setLineWrap(true);
		jTextAreadescripcionComisionGrupo.setWrapStyleWord(true);
		jTextAreadescripcionComisionGrupo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionComisionGrupo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionComisionGrupo = new JScrollPane(jTextAreadescripcionComisionGrupo);
		jscrollPanedescripcionComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionComisionGrupoBusqueda= new JButtonMe();
		this.jButtondescripcionComisionGrupoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionComisionGrupoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionComisionGrupoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionComisionGrupoBusqueda.setText("U");
		this.jButtondescripcionComisionGrupoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionComisionGrupoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionComisionGrupoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionComisionGrupoBusqueda"));

		if(this.comisiongrupoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionComisionGrupoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComisionGrupo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComisionGrupo = new JLabelMe();
		this.jLabelid_empresaComisionGrupo.setText(""+ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComisionGrupo.setToolTipText("Empresa");
		this.jLabelid_empresaComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComisionGrupo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComisionGrupo.setToolTipText(ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComisionGrupo = new GridBagLayout();
		this.jPanelid_empresaComisionGrupo.setLayout(this.gridaBagLayoutComisionGrupo);


		jComboBoxid_empresaComisionGrupo= new JComboBoxMe();
		jComboBoxid_empresaComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComisionGrupo.setEnabled(false);

		this.jButtonid_empresaComisionGrupo= new JButtonMe();
		this.jButtonid_empresaComisionGrupo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionGrupo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionGrupo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComisionGrupo.setText("Buscar");
		this.jButtonid_empresaComisionGrupo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComisionGrupo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionGrupo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionGrupo"));

		this.jButtonid_empresaComisionGrupoBusqueda= new JButtonMe();
		this.jButtonid_empresaComisionGrupoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionGrupoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionGrupoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionGrupoBusqueda.setText("U");
		this.jButtonid_empresaComisionGrupoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComisionGrupoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionGrupoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionGrupoBusqueda"));

		if(this.comisiongrupoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComisionGrupoBusqueda.setVisible(false);		}

		this.jButtonid_empresaComisionGrupoUpdate= new JButtonMe();
		this.jButtonid_empresaComisionGrupoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionGrupoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComisionGrupoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComisionGrupoUpdate.setText("U");
		this.jButtonid_empresaComisionGrupoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComisionGrupoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComisionGrupoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComisionGrupoUpdate"));



					
		this.jLabelid_comision_configComisionGrupo = new JLabelMe();
		this.jLabelid_comision_configComisionGrupo.setText(""+ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG+" : *");
		this.jLabelid_comision_configComisionGrupo.setToolTipText("Configuracion");
		this.jLabelid_comision_configComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_comision_configComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_comision_configComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_comision_configComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_comision_configComisionGrupo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_comision_configComisionGrupo.setToolTipText(ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG);
		this.gridaBagLayoutComisionGrupo = new GridBagLayout();
		this.jPanelid_comision_configComisionGrupo.setLayout(this.gridaBagLayoutComisionGrupo);


		jComboBoxid_comision_configComisionGrupo= new JComboBoxMe();
		jComboBoxid_comision_configComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_comision_configComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_comision_configComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_comision_configComisionGrupo= new JButtonMe();
		this.jButtonid_comision_configComisionGrupo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionGrupo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionGrupo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_comision_configComisionGrupo.setText("Buscar");
		this.jButtonid_comision_configComisionGrupo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_comision_configComisionGrupo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionGrupo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_comision_configComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionGrupo"));

		this.jButtonid_comision_configComisionGrupoBusqueda= new JButtonMe();
		this.jButtonid_comision_configComisionGrupoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionGrupoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionGrupoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_comision_configComisionGrupoBusqueda.setText("U");
		this.jButtonid_comision_configComisionGrupoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_comision_configComisionGrupoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionGrupoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_comision_configComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionGrupoBusqueda"));

		if(this.comisiongrupoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_comision_configComisionGrupoBusqueda.setVisible(false);		}

		this.jButtonid_comision_configComisionGrupoUpdate= new JButtonMe();
		this.jButtonid_comision_configComisionGrupoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionGrupoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_comision_configComisionGrupoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_comision_configComisionGrupoUpdate.setText("U");
		this.jButtonid_comision_configComisionGrupoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_comision_configComisionGrupoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_comision_configComisionGrupoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_comision_configComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_comision_configComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_comision_configComisionGrupoUpdate"));



					
		this.jLabelid_vendedorComisionGrupo = new JLabelMe();
		this.jLabelid_vendedorComisionGrupo.setText(""+ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorComisionGrupo.setToolTipText("Vendedor");
		this.jLabelid_vendedorComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorComisionGrupo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorComisionGrupo.setToolTipText(ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutComisionGrupo = new GridBagLayout();
		this.jPanelid_vendedorComisionGrupo.setLayout(this.gridaBagLayoutComisionGrupo);


		jComboBoxid_vendedorComisionGrupo= new JComboBoxMe();
		jComboBoxid_vendedorComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorComisionGrupo= new JButtonMe();
		this.jButtonid_vendedorComisionGrupo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionGrupo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionGrupo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorComisionGrupo.setText("Buscar");
		this.jButtonid_vendedorComisionGrupo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorComisionGrupo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionGrupo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionGrupo"));

		this.jButtonid_vendedorComisionGrupoBusqueda= new JButtonMe();
		this.jButtonid_vendedorComisionGrupoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionGrupoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionGrupoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorComisionGrupoBusqueda.setText("U");
		this.jButtonid_vendedorComisionGrupoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorComisionGrupoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionGrupoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionGrupoBusqueda"));

		if(this.comisiongrupoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorComisionGrupoBusqueda.setVisible(false);		}

		this.jButtonid_vendedorComisionGrupoUpdate= new JButtonMe();
		this.jButtonid_vendedorComisionGrupoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionGrupoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorComisionGrupoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorComisionGrupoUpdate.setText("U");
		this.jButtonid_vendedorComisionGrupoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorComisionGrupoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionGrupoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionGrupoUpdate"));


		jButtonid_vendedorComisionGrupoArbol= new JButtonMe();
		jButtonid_vendedorComisionGrupoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionGrupoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionGrupoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorComisionGrupoArbol.setText("Arbol");
		jButtonid_vendedorComisionGrupoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorComisionGrupoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorComisionGrupoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorComisionGrupoArbol"));



					
		this.jLabelid_lineaComisionGrupo = new JLabelMe();
		this.jLabelid_lineaComisionGrupo.setText(""+ComisionGrupoConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaComisionGrupo.setToolTipText("Linea");
		this.jLabelid_lineaComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaComisionGrupo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaComisionGrupo.setToolTipText(ComisionGrupoConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutComisionGrupo = new GridBagLayout();
		this.jPanelid_lineaComisionGrupo.setLayout(this.gridaBagLayoutComisionGrupo);


		jComboBoxid_lineaComisionGrupo= new JComboBoxMe();
		jComboBoxid_lineaComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaComisionGrupo= new JButtonMe();
		this.jButtonid_lineaComisionGrupo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaComisionGrupo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaComisionGrupo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaComisionGrupo.setText("Buscar");
		this.jButtonid_lineaComisionGrupo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaComisionGrupo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionGrupo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionGrupo"));

		this.jButtonid_lineaComisionGrupoBusqueda= new JButtonMe();
		this.jButtonid_lineaComisionGrupoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionGrupoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionGrupoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaComisionGrupoBusqueda.setText("U");
		this.jButtonid_lineaComisionGrupoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaComisionGrupoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionGrupoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionGrupoBusqueda"));

		if(this.comisiongrupoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaComisionGrupoBusqueda.setVisible(false);		}

		this.jButtonid_lineaComisionGrupoUpdate= new JButtonMe();
		this.jButtonid_lineaComisionGrupoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionGrupoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaComisionGrupoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaComisionGrupoUpdate.setText("U");
		this.jButtonid_lineaComisionGrupoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaComisionGrupoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionGrupoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionGrupoUpdate"));


		jButtonid_lineaComisionGrupoArbol= new JButtonMe();
		jButtonid_lineaComisionGrupoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaComisionGrupoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaComisionGrupoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaComisionGrupoArbol.setText("Arbol");
		jButtonid_lineaComisionGrupoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaComisionGrupoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaComisionGrupoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaComisionGrupoArbol"));



					
		this.jLabelid_linea_grupoComisionGrupo = new JLabelMe();
		this.jLabelid_linea_grupoComisionGrupo.setText(""+ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoComisionGrupo.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoComisionGrupo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoComisionGrupo.setToolTipText(ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutComisionGrupo = new GridBagLayout();
		this.jPanelid_linea_grupoComisionGrupo.setLayout(this.gridaBagLayoutComisionGrupo);


		jComboBoxid_linea_grupoComisionGrupo= new JComboBoxMe();
		jComboBoxid_linea_grupoComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoComisionGrupo= new JButtonMe();
		this.jButtonid_linea_grupoComisionGrupo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoComisionGrupo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoComisionGrupo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoComisionGrupo.setText("Buscar");
		this.jButtonid_linea_grupoComisionGrupo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoComisionGrupo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoComisionGrupo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoComisionGrupo"));

		this.jButtonid_linea_grupoComisionGrupoBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoComisionGrupoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoComisionGrupoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoComisionGrupoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoComisionGrupoBusqueda.setText("U");
		this.jButtonid_linea_grupoComisionGrupoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoComisionGrupoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoComisionGrupoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoComisionGrupoBusqueda"));

		if(this.comisiongrupoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoComisionGrupoBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoComisionGrupoUpdate= new JButtonMe();
		this.jButtonid_linea_grupoComisionGrupoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoComisionGrupoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoComisionGrupoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoComisionGrupoUpdate.setText("U");
		this.jButtonid_linea_grupoComisionGrupoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoComisionGrupoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoComisionGrupoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoComisionGrupoUpdate"));


		jButtonid_linea_grupoComisionGrupoArbol= new JButtonMe();
		jButtonid_linea_grupoComisionGrupoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoComisionGrupoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoComisionGrupoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoComisionGrupoArbol.setText("Arbol");
		jButtonid_linea_grupoComisionGrupoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_grupoComisionGrupoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoComisionGrupoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_grupoComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoComisionGrupoArbol"));



					
		this.jLabelid_estado_comisionComisionGrupo = new JLabelMe();
		this.jLabelid_estado_comisionComisionGrupo.setText(""+ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION+" : *");
		this.jLabelid_estado_comisionComisionGrupo.setToolTipText("Estado");
		this.jLabelid_estado_comisionComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_comisionComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_comisionComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_comisionComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_comisionComisionGrupo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_comisionComisionGrupo.setToolTipText(ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION);
		this.gridaBagLayoutComisionGrupo = new GridBagLayout();
		this.jPanelid_estado_comisionComisionGrupo.setLayout(this.gridaBagLayoutComisionGrupo);


		jComboBoxid_estado_comisionComisionGrupo= new JComboBoxMe();
		jComboBoxid_estado_comisionComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_comisionComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_comisionComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_comisionComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_comisionComisionGrupo= new JButtonMe();
		this.jButtonid_estado_comisionComisionGrupo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_comisionComisionGrupo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_comisionComisionGrupo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_comisionComisionGrupo.setText("Buscar");
		this.jButtonid_estado_comisionComisionGrupo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_comisionComisionGrupo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_comisionComisionGrupo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_comisionComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_comisionComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_comisionComisionGrupo"));

		this.jButtonid_estado_comisionComisionGrupoBusqueda= new JButtonMe();
		this.jButtonid_estado_comisionComisionGrupoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionGrupoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionGrupoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_comisionComisionGrupoBusqueda.setText("U");
		this.jButtonid_estado_comisionComisionGrupoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_comisionComisionGrupoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_comisionComisionGrupoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_comisionComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_comisionComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_comisionComisionGrupoBusqueda"));

		if(this.comisiongrupoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_comisionComisionGrupoBusqueda.setVisible(false);		}

		this.jButtonid_estado_comisionComisionGrupoUpdate= new JButtonMe();
		this.jButtonid_estado_comisionComisionGrupoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionGrupoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_comisionComisionGrupoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_comisionComisionGrupoUpdate.setText("U");
		this.jButtonid_estado_comisionComisionGrupoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_comisionComisionGrupoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_comisionComisionGrupoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_comisionComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_comisionComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_comisionComisionGrupoUpdate"));



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
		//this.jInternalFrameDetalleComisionGrupo = new ComisionGrupoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comision Grupo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComisionGrupo= new GridBagLayout();
		

		
		String sToolTipComisionGrupo="";
		sToolTipComisionGrupo=ComisionGrupoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComisionGrupo+="(Comisiones.ComisionGrupo)";
		}
		
		if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
			sToolTipComisionGrupo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComisionGrupo = new JButtonMe();
		this.jButtonModificarComisionGrupo = new JButtonMe();
        this.jButtonActualizarComisionGrupo = new JButtonMe();
        this.jButtonEliminarComisionGrupo = new JButtonMe();
        this.jButtonCancelarComisionGrupo = new JButtonMe();
        this.jButtonGuardarCambiosComisionGrupo = new JButtonMe();
		this.jButtonGuardarCambiosTablaComisionGrupo = new JButtonMe();
		this.jButtonCerrarComisionGrupo = new JButtonMe();
		
		this.jScrollPanelDatosComisionGrupo = new JScrollPane();   
        this.jScrollPanelDatosEdicionComisionGrupo = new JScrollPane();
		this.jScrollPanelDatosGeneralComisionGrupo = new JScrollPane();
				
		
		
		this.jPanelCamposComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Comision Grupo";
		
		if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comision Grupos" + this.sPath));
		} else {
			this.jScrollPanelDatosComisionGrupo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComisionGrupo.setName("jPanelCamposComisionGrupo"); 

		this.jPanelCamposOcultosComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComisionGrupo.setName("jPanelCamposOcultosComisionGrupo"); 

        this.jPanelAccionesComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComisionGrupo.setToolTipText("Acciones");
        this.jPanelAccionesComisionGrupo.setName("Acciones"); 

		this.jPanelAccionesFormularioComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComisionGrupo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComisionGrupo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComisionGrupo.setText("Nuevo");
		this.jButtonModificarComisionGrupo.setText("Editar");
        this.jButtonActualizarComisionGrupo.setText("Actualizar");
        this.jButtonEliminarComisionGrupo.setText("Eliminar");
        this.jButtonCancelarComisionGrupo.setText("Cancelar");
        this.jButtonGuardarCambiosComisionGrupo.setText("Guardar");
		this.jButtonGuardarCambiosTablaComisionGrupo.setText("Guardar");
		this.jButtonCerrarComisionGrupo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComisionGrupo,"nuevo_button","Nuevo",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComisionGrupo,"modificar_button","Editar",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComisionGrupo,"actualizar_button","Actualizar",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComisionGrupo,"eliminar_button","Eliminar",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComisionGrupo,"cancelar_button","Cancelar",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComisionGrupo,"guardarcambios_button","Guardar",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComisionGrupo,"guardarcambiostabla_button","Guardar",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComisionGrupo,"cerrar_button","Salir",this.comisiongrupoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComisionGrupo.setToolTipText("Nuevo"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComisionGrupo.setToolTipText("Editar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComisionGrupo.setToolTipText("Actualizar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComisionGrupo.setToolTipText("Eliminar)"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComisionGrupo.setToolTipText("Cancelar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComisionGrupo.setToolTipText("Guardar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComisionGrupo.setToolTipText("Guardar"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComisionGrupo.setToolTipText("Salir"+" "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoComisionGrupo";
		inputMap = this.jButtonNuevoComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComisionGrupo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComisionGrupo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComisionGrupo";
		inputMap = this.jButtonActualizarComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComisionGrupo"));
		
		//ELIMINAR
		sMapKey = "EliminarComisionGrupo";
		inputMap = this.jButtonEliminarComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComisionGrupo"));
		
		//CANCELAR	
		sMapKey = "CancelarComisionGrupo";
		inputMap = this.jButtonCancelarComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComisionGrupo"));
		
		//CERRAR		
		sMapKey = "CerrarComisionGrupo";
		inputMap = this.jButtonCerrarComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComisionGrupo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComisionGrupo";
		inputMap = this.jButtonGuardarCambiosTablaComisionGrupo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComisionGrupo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComisionGrupo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComisionGrupo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComisionGrupo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComisionGrupo.setToolTipText("Nuevo ComisionGrupo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComisionGrupo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComisionGrupo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComisionGrupo.setToolTipText("Sin Cerrar Ventana ComisionGrupo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComisionGrupo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComisionGrupo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComisionGrupo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComisionGrupo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComisionGrupo.setText("Accion");
		this.jComboBoxTiposAccionesComisionGrupo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComisionGrupo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComisionGrupo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComisionGrupo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComisionGrupo = new JLabelMe();
		
		this.jLabelAccionesComisionGrupo.setText("Acciones");		
		this.jLabelAccionesComisionGrupo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionGrupo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComisionGrupo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComisionGrupo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComisionGrupo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComisionGrupo=new JTabbedPane();
		this.jTabbedPaneRelacionesComisionGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComisionGrupo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComisionGrupo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionGrupo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComisionGrupo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComisionGrupo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComisionGrupo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionGrupo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComisionGrupo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComisionGrupo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComisionGrupo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComisionGrupo = new GridBagLayout();
		
		this.jPanelCamposComisionGrupo.setLayout(gridaBagLayoutCamposComisionGrupo);
		this.jPanelCamposOcultosComisionGrupo.setLayout(gridaBagLayoutCamposOcultosComisionGrupo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 0;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComisionGrupo.add(jLabelIdComisionGrupo, this.gridBagConstraintsComisionGrupo);



	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 1;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComisionGrupo.add(jLabelidComisionGrupo, this.gridBagConstraintsComisionGrupo);


	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 0;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComisionGrupo.add(jLabelid_empresaComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 2;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionGrupo.add(jButtonid_empresaComisionGrupoBusqueda, this.gridBagConstraintsComisionGrupo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 3;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComisionGrupo.add(jButtonid_empresaComisionGrupoUpdate, this.gridBagConstraintsComisionGrupo);
	}

	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 1;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComisionGrupo.add(jComboBoxid_empresaComisionGrupo, this.gridBagConstraintsComisionGrupo);


	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 0;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_comision_configComisionGrupo.add(jLabelid_comision_configComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 2;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_comision_configComisionGrupo.add(jButtonid_comision_configComisionGrupoBusqueda, this.gridBagConstraintsComisionGrupo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 3;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_comision_configComisionGrupo.add(jButtonid_comision_configComisionGrupoUpdate, this.gridBagConstraintsComisionGrupo);
	}

	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 1;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_comision_configComisionGrupo.add(jComboBoxid_comision_configComisionGrupo, this.gridBagConstraintsComisionGrupo);


	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 0;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorComisionGrupo.add(jLabelid_vendedorComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 2;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorComisionGrupo.add(jButtonid_vendedorComisionGrupo, this.gridBagConstraintsComisionGrupo);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 3;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorComisionGrupo.add(jButtonid_vendedorComisionGrupoArbol, this.gridBagConstraintsComisionGrupo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 4;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorComisionGrupo.add(jButtonid_vendedorComisionGrupoBusqueda, this.gridBagConstraintsComisionGrupo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 5;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorComisionGrupo.add(jButtonid_vendedorComisionGrupoUpdate, this.gridBagConstraintsComisionGrupo);
	}

	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 1;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorComisionGrupo.add(jComboBoxid_vendedorComisionGrupo, this.gridBagConstraintsComisionGrupo);


	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 0;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaComisionGrupo.add(jLabelid_lineaComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 2;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaComisionGrupo.add(jButtonid_lineaComisionGrupoBusqueda, this.gridBagConstraintsComisionGrupo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 3;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaComisionGrupo.add(jButtonid_lineaComisionGrupoUpdate, this.gridBagConstraintsComisionGrupo);
	}

	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 1;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaComisionGrupo.add(jComboBoxid_lineaComisionGrupo, this.gridBagConstraintsComisionGrupo);


	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 0;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoComisionGrupo.add(jLabelid_linea_grupoComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 2;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoComisionGrupo.add(jButtonid_linea_grupoComisionGrupoBusqueda, this.gridBagConstraintsComisionGrupo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 3;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoComisionGrupo.add(jButtonid_linea_grupoComisionGrupoUpdate, this.gridBagConstraintsComisionGrupo);
	}

	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 1;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoComisionGrupo.add(jComboBoxid_linea_grupoComisionGrupo, this.gridBagConstraintsComisionGrupo);


	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 0;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_comisionComisionGrupo.add(jLabelid_estado_comisionComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 2;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_comisionComisionGrupo.add(jButtonid_estado_comisionComisionGrupoBusqueda, this.gridBagConstraintsComisionGrupo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 3;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_comisionComisionGrupo.add(jButtonid_estado_comisionComisionGrupoUpdate, this.gridBagConstraintsComisionGrupo);
	}

	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 1;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_comisionComisionGrupo.add(jComboBoxid_estado_comisionComisionGrupo, this.gridBagConstraintsComisionGrupo);


	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 0;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeComisionGrupo.add(jLabelporcentajeComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 2;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeComisionGrupo.add(jButtonporcentajeComisionGrupoBusqueda, this.gridBagConstraintsComisionGrupo);
	}

	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 1;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeComisionGrupo.add(jTextFieldporcentajeComisionGrupo, this.gridBagConstraintsComisionGrupo);


	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 0;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionComisionGrupo.add(jLabeldescripcionComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		//this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = 2;
		this.gridBagConstraintsComisionGrupo.ipadx = 0;
		this.gridBagConstraintsComisionGrupo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionComisionGrupo.add(jButtondescripcionComisionGrupoBusqueda, this.gridBagConstraintsComisionGrupo);
	}

	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComisionGrupo.gridy = 0;
	this.gridBagConstraintsComisionGrupo.gridx = 1;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionComisionGrupo.add(jscrollPanedescripcionComisionGrupo, this.gridBagConstraintsComisionGrupo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionGrupo.gridy = iYPanelCamposComisionGrupo;
	this.gridBagConstraintsComisionGrupo.gridx = iXPanelCamposComisionGrupo++;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionGrupo.add(this.jPanelidComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(iXPanelCamposComisionGrupo % 1==0) {
		iXPanelCamposComisionGrupo=0;
		iYPanelCamposComisionGrupo++;
	}
	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionGrupo.gridy = iYPanelCamposComisionGrupo;
	this.gridBagConstraintsComisionGrupo.gridx = iXPanelCamposComisionGrupo++;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionGrupo.add(this.jPanelid_comision_configComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(iXPanelCamposComisionGrupo % 1==0) {
		iXPanelCamposComisionGrupo=0;
		iYPanelCamposComisionGrupo++;
	}
	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionGrupo.gridy = iYPanelCamposComisionGrupo;
	this.gridBagConstraintsComisionGrupo.gridx = iXPanelCamposComisionGrupo++;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionGrupo.add(this.jPanelid_vendedorComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(iXPanelCamposComisionGrupo % 1==0) {
		iXPanelCamposComisionGrupo=0;
		iYPanelCamposComisionGrupo++;
	}
	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionGrupo.gridy = iYPanelCamposComisionGrupo;
	this.gridBagConstraintsComisionGrupo.gridx = iXPanelCamposComisionGrupo++;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionGrupo.add(this.jPanelid_lineaComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(iXPanelCamposComisionGrupo % 1==0) {
		iXPanelCamposComisionGrupo=0;
		iYPanelCamposComisionGrupo++;
	}
	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionGrupo.gridy = iYPanelCamposComisionGrupo;
	this.gridBagConstraintsComisionGrupo.gridx = iXPanelCamposComisionGrupo++;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionGrupo.add(this.jPanelid_linea_grupoComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(iXPanelCamposComisionGrupo % 1==0) {
		iXPanelCamposComisionGrupo=0;
		iYPanelCamposComisionGrupo++;
	}
	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionGrupo.gridy = iYPanelCamposComisionGrupo;
	this.gridBagConstraintsComisionGrupo.gridx = iXPanelCamposComisionGrupo++;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionGrupo.add(this.jPanelid_estado_comisionComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(iXPanelCamposComisionGrupo % 1==0) {
		iXPanelCamposComisionGrupo=0;
		iYPanelCamposComisionGrupo++;
	}
	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionGrupo.gridy = iYPanelCamposComisionGrupo;
	this.gridBagConstraintsComisionGrupo.gridx = iXPanelCamposComisionGrupo++;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionGrupo.add(this.jPanelporcentajeComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(iXPanelCamposComisionGrupo % 1==0) {
		iXPanelCamposComisionGrupo=0;
		iYPanelCamposComisionGrupo++;
	}
	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionGrupo.gridy = iYPanelCamposComisionGrupo;
	this.gridBagConstraintsComisionGrupo.gridx = iXPanelCamposComisionGrupo++;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComisionGrupo.add(this.jPaneldescripcionComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(iXPanelCamposComisionGrupo % 1==0) {
		iXPanelCamposComisionGrupo=0;
		iYPanelCamposComisionGrupo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComisionGrupo.gridy = iYPanelCamposOcultosComisionGrupo;
	this.gridBagConstraintsComisionGrupo.gridx = iXPanelCamposOcultosComisionGrupo++;
	this.gridBagConstraintsComisionGrupo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComisionGrupo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComisionGrupo.add(this.jPanelid_empresaComisionGrupo, this.gridBagConstraintsComisionGrupo);



	if(iXPanelCamposOcultosComisionGrupo % 1==0) {
		iXPanelCamposOcultosComisionGrupo=0;
		iYPanelCamposOcultosComisionGrupo++;
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
			
		GridBagLayout gridaBagLayoutAccionesComisionGrupo= new GridBagLayout();
		this.jPanelAccionesComisionGrupo.setLayout(gridaBagLayoutAccionesComisionGrupo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComisionGrupo= new GridBagLayout();
		this.jPanelAccionesFormularioComisionGrupo.setLayout(gridaBagLayoutAccionesFormularioComisionGrupo);
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionGrupo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionGrupo.add(this.jComboBoxTiposAccionesFormularioComisionGrupo, this.gridBagConstraintsComisionGrupo);

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComisionGrupo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComisionGrupo.add(this.jCheckBoxPostAccionNuevoComisionGrupo, this.gridBagConstraintsComisionGrupo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionGrupo.add(this.jCheckBoxPostAccionSinCerrarComisionGrupo, this.gridBagConstraintsComisionGrupo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsComisionGrupo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioComisionGrupo.add(this.jCheckBoxPostAccionSinMensajeComisionGrupo, this.gridBagConstraintsComisionGrupo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx = iPosXAccion++;
			
		this.jPanelAccionesComisionGrupo.add(this.jButtonModificarComisionGrupo, this.gridBagConstraintsComisionGrupo);							

		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComisionGrupo.gridy = 0;
		this.gridBagConstraintsComisionGrupo.gridx =iPosXAccion++;
			
		this.jPanelAccionesComisionGrupo.add(this.jButtonEliminarComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
			
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = 0;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionGrupo.add(this.jButtonActualizarComisionGrupo, this.gridBagConstraintsComisionGrupo);


		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = 0;		
		this.gridBagConstraintsComisionGrupo.gridx = iPosXAccion++;
		
		this.jPanelAccionesComisionGrupo.add(this.jButtonGuardarCambiosComisionGrupo, this.gridBagConstraintsComisionGrupo);	
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = 0;		
		this.gridBagConstraintsComisionGrupo.gridx =iPosXAccion++;
		
		this.jPanelAccionesComisionGrupo.add(this.jButtonCancelarComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComisionGrupo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComisionGrupo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();						
			this.gridBagConstraintsComisionGrupo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComisionGrupo.gridx = 0;		
			//this.gridBagConstraintsComisionGrupo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComisionGrupo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComisionGrupo.gridx =0;
		this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComisionGrupo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComisionGrupo, this.gridBagConstraintsComisionGrupo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComisionGrupoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComisionGrupo = new ComisionGrupoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comision Grupo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Comision Grupo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comision Grupo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComisionGrupoModel comisiongrupoModel=new ComisionGrupoModel(this);
			
			//SI USARA CLASE INTERNA
			//ComisionGrupoModel.ComisionGrupoFocusTraversalPolicy comisiongrupoFocusTraversalPolicy = comisiongrupoModel.new ComisionGrupoFocusTraversalPolicy(this);
			
			//comisiongrupoFocusTraversalPolicy.setcomisiongrupoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comisiongrupoModel);
			
			
			this.jContentPaneDetalleComisionGrupo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComisionGrupo = new GridBagLayout();	
			this.jContentPaneDetalleComisionGrupo.setLayout(gridaBagLayoutDetalleComisionGrupo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComisionGrupo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
				this.gridBagConstraintsComisionGrupo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComisionGrupo.gridx = 0;
					
				
				this.jContentPaneDetalleComisionGrupo.add(jTtoolBarDetalleComisionGrupo, gridBagConstraintsComisionGrupo);								
				
}
			
			this.jScrollPanelDatosEdicionComisionGrupo=   new JScrollPane(jContentPaneDetalleComisionGrupo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionGrupo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionGrupo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionGrupo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComisionGrupo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComisionGrupo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionGrupo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComisionGrupo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComisionGrupo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComisionGrupo.gridx = 0;
	        
			this.jContentPaneDetalleComisionGrupo.add(jPanelCamposComisionGrupo, gridBagConstraintsComisionGrupo);
			
			
			
			
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
						&& comisiongrupoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComisionGrupo= new GridBagConstraints();
						this.gridBagConstraintsComisionGrupo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComisionGrupo.gridx = 0;
						this.jContentPaneDetalleComisionGrupo.add(this.jTabbedPaneRelacionesComisionGrupo, this.gridBagConstraintsComisionGrupo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComisionGrupo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComisionGrupo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
					this.gridBagConstraintsComisionGrupo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComisionGrupo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComisionGrupo.gridx = 0;
					
				
					this.jContentPaneDetalleComisionGrupo.add(jPanelCamposOcultosComisionGrupo, gridBagConstraintsComisionGrupo);
				
					this.jPanelCamposOcultosComisionGrupo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComisionGrupo.gridx = 0;
	        this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComisionGrupo.add(this.jPanelAccionesFormularioComisionGrupo, this.gridBagConstraintsComisionGrupo);							
			
			
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
	        this.gridBagConstraintsComisionGrupo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComisionGrupo.gridx = 0;
	        
			
			this.jContentPaneDetalleComisionGrupo.add(this.jPanelAccionesComisionGrupo, this.gridBagConstraintsComisionGrupo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComisionGrupo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComisionGrupo=   new JScrollPane(this.jPanelCamposComisionGrupo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComisionGrupo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionGrupo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComisionGrupo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComisionGrupo.gridx = 0;
			this.gridBagConstraintsComisionGrupo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComisionGrupo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComisionGrupo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComisionGrupo, this.gridBagConstraintsComisionGrupo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionGrupo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComisionGrupo, this.gridBagConstraintsComisionGrupo);			
			
			this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
			this.gridBagConstraintsComisionGrupo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComisionGrupo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComisionGrupo, this.gridBagConstraintsComisionGrupo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionGrupo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComisionGrupo, this.gridBagConstraintsComisionGrupo);
			
			
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComisionGrupo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComisionGrupo, this.gridBagConstraintsComisionGrupo);
		
			
		this.gridBagConstraintsComisionGrupo = new GridBagConstraints();
		this.gridBagConstraintsComisionGrupo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComisionGrupo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComisionGrupo, this.gridBagConstraintsComisionGrupo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComisionGrupo;//jContentPane;
		
		return jScrollPanelDatosEdicionComisionGrupo;
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
