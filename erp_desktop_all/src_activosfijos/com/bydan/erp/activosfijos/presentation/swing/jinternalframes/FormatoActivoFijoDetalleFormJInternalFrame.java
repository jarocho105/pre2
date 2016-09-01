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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.FormatoActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class FormatoActivoFijoDetalleFormJInternalFrame extends FormatoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFormatoActivoFijo;
	
	protected JMenuBar jmenuBarDetalleFormatoActivoFijo;
	
	protected JMenu jmenuDetalleFormatoActivoFijo;
	protected JMenu jmenuDetalleArchivoFormatoActivoFijo;
	protected JMenu jmenuDetalleAccionesFormatoActivoFijo;
	protected JMenu jmenuDetalleDatosFormatoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormatoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsFormatoActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormatoActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleFormatoActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected FormatoBeanSwingJInternalFrame formato2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato2="";
	
	public FormatoActivoFijoSessionBean formatoactivofijoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public FormatoSessionBean formato2SessionBean;	
	
	public FormatoActivoFijoLogic formatoactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosFormatoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionFormatoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralFormatoActivoFijo;
	
	protected JPanel jPanelCamposFormatoActivoFijo;    
	protected JPanel jPanelCamposOcultosFormatoActivoFijo;    	
	protected JPanel jPanelAccionesFormatoActivoFijo;
	protected JPanel jPanelAccionesFormularioFormatoActivoFijo;
    
	
	
	protected Integer iXPanelCamposFormatoActivoFijo=0;
	protected Integer iYPanelCamposFormatoActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosFormatoActivoFijo=0;
	protected Integer iYPanelCamposOcultosFormatoActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormatoActivoFijo;
	public JButton jButtonModificarFormatoActivoFijo;
	public JButton jButtonActualizarFormatoActivoFijo;
    public JButton jButtonEliminarFormatoActivoFijo;
	public JButton jButtonCancelarFormatoActivoFijo;
    public JButton jButtonGuardarCambiosFormatoActivoFijo;
	public JButton jButtonGuardarCambiosTablaFormatoActivoFijo;
	protected JButton jButtonCerrarFormatoActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionFormatoActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormatoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormatoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormatoActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormatoActivoFijo;
	protected JButton jButtonModificarToolBarFormatoActivoFijo;
	protected JButton jButtonActualizarToolBarFormatoActivoFijo;
    protected JButton jButtonEliminarToolBarFormatoActivoFijo;
	protected JButton jButtonCancelarToolBarFormatoActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarFormatoActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarFormatoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarFormatoActivoFijo;
	protected JButton jButtonCerrarToolBarFormatoActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarFormatoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormatoActivoFijo;
	protected JMenuItem jMenuItemModificarFormatoActivoFijo;
	protected JMenuItem jMenuItemActualizarFormatoActivoFijo;
    protected JMenuItem jMenuItemEliminarFormatoActivoFijo;
	protected JMenuItem jMenuItemCancelarFormatoActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosFormatoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormatoActivoFijo;
	protected JMenuItem jMenuItemCerrarFormatoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarFormatoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormatoActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionFormatoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormatoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarFormatoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormatoActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormatoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormatoActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormatoActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormatoActivoFijo;
	public JLabel jLabelIdFormatoActivoFijo;
	public JLabel jLabelidFormatoActivoFijo;
	public JButton jButtonidFormatoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormatoActivoFijo;
	public JLabel jLabelid_empresaFormatoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormatoActivoFijo;
	public JButton jButtonid_empresaFormatoActivoFijo= new JButtonMe();
	public JButton jButtonid_empresaFormatoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresaFormatoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoFormatoActivoFijo;
	public JLabel jLabelid_formatoFormatoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFormatoActivoFijo;
	public JButton jButtonid_formatoFormatoActivoFijo= new JButtonMe();
	public JButton jButtonid_formatoFormatoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_formatoFormatoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_formato2FormatoActivoFijo;
	public JLabel jLabelid_formato2FormatoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato2FormatoActivoFijo;
	public JButton jButtonid_formato2FormatoActivoFijo= new JButtonMe();
	public JButton jButtonid_formato2FormatoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_formato2FormatoActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormatoActivoFijo;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FormatoActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormatoActivoFijo=new JPanel();
				this.jPanelAccionesFormularioFormatoActivoFijo=new JPanel();
				this.jmenuBarDetalleFormatoActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleFormatoActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FormatoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormatoActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FormatoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormatoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormatoActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormatoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFormatoActivoFijo() {
		return this.jButtonActualizarToolBarFormatoActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarFormatoActivoFijo() {
		return this.jButtonEliminarToolBarFormatoActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarFormatoActivoFijo() {
		return this.jButtonCancelarToolBarFormatoActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionFormatoActivoFijo() {
		return this.jButtonProcesarInformacionFormatoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormatoActivoFijo)	{
		this.jButtonProcesarInformacionFormatoActivoFijo = jButtonProcesarInformacionFormatoActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormatoActivoFijo() {
		return this.jComboBoxTiposAccionesFormatoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormatoActivoFijo(
			JComboBox jComboBoxTiposRelacionesFormatoActivoFijo) {
		this.jComboBoxTiposRelacionesFormatoActivoFijo = jComboBoxTiposRelacionesFormatoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormatoActivoFijo(
			JComboBox jComboBoxTiposAccionesFormatoActivoFijo) {
		this.jComboBoxTiposAccionesFormatoActivoFijo = jComboBoxTiposAccionesFormatoActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormatoActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioFormatoActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormatoActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioFormatoActivoFijo) {
		this.jComboBoxTiposAccionesFormularioFormatoActivoFijo = jComboBoxTiposAccionesFormularioFormatoActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formatoactivofijoSessionBean=new FormatoActivoFijoSessionBean();
		
		this.formatoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formatoactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormatoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormatoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormatoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formatos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		FormatoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormatoActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormatoActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarFormatoActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormatoActivoFijo,this.jTtoolBarDetalleFormatoActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormatoActivoFijo,this.jTtoolBarDetalleFormatoActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormatoActivoFijo,this.jTtoolBarDetalleFormatoActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormatoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormatoActivoFijo,this.jTtoolBarDetalleFormatoActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormatoActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormatoActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormatoActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormatoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormatoActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormatoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormatoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormatoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormatoActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormatoActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormatoActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormatoActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormatoActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormatoActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormatoActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormatoActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormatoActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormatoActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormatoActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormatoActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormatoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormatoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormatoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormatoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormatoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormatoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormatoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormatoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormatoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormatoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormatoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormatoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormatoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormatoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormatoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormatoActivoFijo.add(this.jMenuItemDetalleCerrarFormatoActivoFijo);
		
		this.jmenuDetalleAccionesFormatoActivoFijo.add(this.jMenuItemActualizarFormatoActivoFijo);
		this.jmenuDetalleAccionesFormatoActivoFijo.add(this.jMenuItemEliminarFormatoActivoFijo);
		this.jmenuDetalleAccionesFormatoActivoFijo.add(this.jMenuItemCancelarFormatoActivoFijo);		
		
		//this.jmenuDetalleDatosFormatoActivoFijo.add(this.jMenuItemDetalleAbrirOrderByFormatoActivoFijo);				
		this.jmenuDetalleDatosFormatoActivoFijo.add(this.jMenuItemDetalleMostarOcultarFormatoActivoFijo);				
				
		//this.jmenuDetalleAccionesFormatoActivoFijo.add(this.jMenuItemGuardarCambiosFormatoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormatoActivoFijo.add(this.jmenuDetalleArchivoFormatoActivoFijo);		
		this.jmenuBarDetalleFormatoActivoFijo.add(this.jmenuDetalleAccionesFormatoActivoFijo);		
		this.jmenuBarDetalleFormatoActivoFijo.add(this.jmenuDetalleDatosFormatoActivoFijo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormatoActivoFijo);				
	}
	
	
	public void inicializarElementosCamposFormatoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormatoActivoFijo = new JLabelMe();
		jLabelIdFormatoActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormatoActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormatoActivoFijo.setToolTipText(FormatoActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormatoActivoFijo= new GridBagLayout();

		this.jPanelidFormatoActivoFijo.setLayout(this.gridaBagLayoutFormatoActivoFijo);

		jLabelidFormatoActivoFijo = new JLabel();
		jLabelidFormatoActivoFijo.setText("Id");

		jLabelidFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysFormatoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormatoActivoFijo = new JLabelMe();
		this.jLabelid_empresaFormatoActivoFijo.setText(""+FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormatoActivoFijo.setToolTipText("Empresa");
		this.jLabelid_empresaFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormatoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormatoActivoFijo.setToolTipText(FormatoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormatoActivoFijo = new GridBagLayout();
		this.jPanelid_empresaFormatoActivoFijo.setLayout(this.gridaBagLayoutFormatoActivoFijo);


		jComboBoxid_empresaFormatoActivoFijo= new JComboBoxMe();
		jComboBoxid_empresaFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormatoActivoFijo.setEnabled(false);

		this.jButtonid_empresaFormatoActivoFijo= new JButtonMe();
		this.jButtonid_empresaFormatoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormatoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormatoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormatoActivoFijo.setText("Buscar");
		this.jButtonid_empresaFormatoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormatoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormatoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormatoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoActivoFijo"));

		this.jButtonid_empresaFormatoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresaFormatoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormatoActivoFijoBusqueda.setText("U");
		this.jButtonid_empresaFormatoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormatoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormatoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormatoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoActivoFijoBusqueda"));

		if(this.formatoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormatoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresaFormatoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresaFormatoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormatoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormatoActivoFijoUpdate.setText("U");
		this.jButtonid_empresaFormatoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormatoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormatoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormatoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormatoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormatoActivoFijoUpdate"));



					
		this.jLabelid_formatoFormatoActivoFijo = new JLabelMe();
		this.jLabelid_formatoFormatoActivoFijo.setText(""+FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoFormatoActivoFijo.setToolTipText("Formato");
		this.jLabelid_formatoFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoFormatoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoFormatoActivoFijo.setToolTipText(FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutFormatoActivoFijo = new GridBagLayout();
		this.jPanelid_formatoFormatoActivoFijo.setLayout(this.gridaBagLayoutFormatoActivoFijo);


		jComboBoxid_formatoFormatoActivoFijo= new JComboBoxMe();
		jComboBoxid_formatoFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoFormatoActivoFijo= new JButtonMe();
		this.jButtonid_formatoFormatoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoFormatoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoFormatoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoFormatoActivoFijo.setText("Buscar");
		this.jButtonid_formatoFormatoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoFormatoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoFormatoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoFormatoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoFormatoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoFormatoActivoFijo"));

		this.jButtonid_formatoFormatoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_formatoFormatoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoFormatoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoFormatoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoFormatoActivoFijoBusqueda.setText("U");
		this.jButtonid_formatoFormatoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoFormatoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoFormatoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoFormatoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoFormatoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoFormatoActivoFijoBusqueda"));

		if(this.formatoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoFormatoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_formatoFormatoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_formatoFormatoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoFormatoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoFormatoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoFormatoActivoFijoUpdate.setText("U");
		this.jButtonid_formatoFormatoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoFormatoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoFormatoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoFormatoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoFormatoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoFormatoActivoFijoUpdate"));



					
		this.jLabelid_formato2FormatoActivoFijo = new JLabelMe();
		this.jLabelid_formato2FormatoActivoFijo.setText(""+FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2+" : *");
		this.jLabelid_formato2FormatoActivoFijo.setToolTipText("Formato2");
		this.jLabelid_formato2FormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato2FormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato2FormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato2FormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato2FormatoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato2FormatoActivoFijo.setToolTipText(FormatoActivoFijoConstantesFunciones.LABEL_IDFORMATO2);
		this.gridaBagLayoutFormatoActivoFijo = new GridBagLayout();
		this.jPanelid_formato2FormatoActivoFijo.setLayout(this.gridaBagLayoutFormatoActivoFijo);


		jComboBoxid_formato2FormatoActivoFijo= new JComboBoxMe();
		jComboBoxid_formato2FormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato2FormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato2FormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato2FormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato2FormatoActivoFijo= new JButtonMe();
		this.jButtonid_formato2FormatoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato2FormatoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato2FormatoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato2FormatoActivoFijo.setText("Buscar");
		this.jButtonid_formato2FormatoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato2FormatoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato2FormatoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato2FormatoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato2FormatoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato2FormatoActivoFijo"));

		this.jButtonid_formato2FormatoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_formato2FormatoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato2FormatoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato2FormatoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato2FormatoActivoFijoBusqueda.setText("U");
		this.jButtonid_formato2FormatoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato2FormatoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato2FormatoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato2FormatoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato2FormatoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato2FormatoActivoFijoBusqueda"));

		if(this.formatoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato2FormatoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_formato2FormatoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_formato2FormatoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato2FormatoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato2FormatoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato2FormatoActivoFijoUpdate.setText("U");
		this.jButtonid_formato2FormatoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato2FormatoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato2FormatoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato2FormatoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato2FormatoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato2FormatoActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleFormatoActivoFijo = new FormatoActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Formatos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormatoActivoFijo= new GridBagLayout();
		

		
		String sToolTipFormatoActivoFijo="";
		sToolTipFormatoActivoFijo=FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormatoActivoFijo+="(ActivosFijos.FormatoActivoFijo)";
		}
		
		if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormatoActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormatoActivoFijo = new JButtonMe();
		this.jButtonModificarFormatoActivoFijo = new JButtonMe();
        this.jButtonActualizarFormatoActivoFijo = new JButtonMe();
        this.jButtonEliminarFormatoActivoFijo = new JButtonMe();
        this.jButtonCancelarFormatoActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosFormatoActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormatoActivoFijo = new JButtonMe();
		this.jButtonCerrarFormatoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosFormatoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormatoActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralFormatoActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Formatos";
		
		if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formatoss" + this.sPath));
		} else {
			this.jScrollPanelDatosFormatoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormatoActivoFijo.setName("jPanelCamposFormatoActivoFijo"); 

		this.jPanelCamposOcultosFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormatoActivoFijo.setName("jPanelCamposOcultosFormatoActivoFijo"); 

        this.jPanelAccionesFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormatoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormatoActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormatoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormatoActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormatoActivoFijo.setText("Nuevo");
		this.jButtonModificarFormatoActivoFijo.setText("Editar");
        this.jButtonActualizarFormatoActivoFijo.setText("Actualizar");
        this.jButtonEliminarFormatoActivoFijo.setText("Eliminar");
        this.jButtonCancelarFormatoActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosFormatoActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormatoActivoFijo.setText("Guardar");
		this.jButtonCerrarFormatoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormatoActivoFijo,"nuevo_button","Nuevo",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormatoActivoFijo,"modificar_button","Editar",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormatoActivoFijo,"actualizar_button","Actualizar",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormatoActivoFijo,"eliminar_button","Eliminar",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormatoActivoFijo,"cancelar_button","Cancelar",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormatoActivoFijo,"guardarcambios_button","Guardar",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormatoActivoFijo,"guardarcambiostabla_button","Guardar",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormatoActivoFijo,"cerrar_button","Salir",this.formatoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormatoActivoFijo.setToolTipText("Nuevo"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormatoActivoFijo.setToolTipText("Editar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormatoActivoFijo.setToolTipText("Actualizar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormatoActivoFijo.setToolTipText("Eliminar)"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormatoActivoFijo.setToolTipText("Cancelar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormatoActivoFijo.setToolTipText("Guardar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormatoActivoFijo.setToolTipText("Guardar"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormatoActivoFijo.setToolTipText("Salir"+" "+FormatoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormatoActivoFijo";
		inputMap = this.jButtonNuevoFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormatoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormatoActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormatoActivoFijo";
		inputMap = this.jButtonActualizarFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormatoActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarFormatoActivoFijo";
		inputMap = this.jButtonEliminarFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormatoActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarFormatoActivoFijo";
		inputMap = this.jButtonCancelarFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormatoActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarFormatoActivoFijo";
		inputMap = this.jButtonCerrarFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormatoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormatoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaFormatoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormatoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormatoActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormatoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormatoActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormatoActivoFijo.setToolTipText("Nuevo FormatoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormatoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormatoActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormatoActivoFijo.setToolTipText("Sin Cerrar Ventana FormatoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormatoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormatoActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormatoActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFormatoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormatoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesFormatoActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFormatoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormatoActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormatoActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormatoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesFormatoActivoFijo.setText("Acciones");		
		this.jLabelAccionesFormatoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormatoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormatoActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormatoActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormatoActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesFormatoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormatoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFormatoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormatoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFormatoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormatoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormatoActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormatoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormatoActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormatoActivoFijo = new GridBagLayout();
		
		this.jPanelCamposFormatoActivoFijo.setLayout(gridaBagLayoutCamposFormatoActivoFijo);
		this.jPanelCamposOcultosFormatoActivoFijo.setLayout(gridaBagLayoutCamposOcultosFormatoActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
	this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
	this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
	this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormatoActivoFijo.add(jLabelIdFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);



	this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
	this.gridBagConstraintsFormatoActivoFijo.gridx = 1;
	this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
	this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormatoActivoFijo.add(jLabelidFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);


	this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
	this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
	this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
	this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormatoActivoFijo.add(jLabelid_empresaFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
		this.gridBagConstraintsFormatoActivoFijo.gridx = 2;
		this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
		this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormatoActivoFijo.add(jButtonid_empresaFormatoActivoFijoBusqueda, this.gridBagConstraintsFormatoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
		this.gridBagConstraintsFormatoActivoFijo.gridx = 3;
		this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
		this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormatoActivoFijo.add(jButtonid_empresaFormatoActivoFijoUpdate, this.gridBagConstraintsFormatoActivoFijo);
	}

	this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
	this.gridBagConstraintsFormatoActivoFijo.gridx = 1;
	this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
	this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormatoActivoFijo.add(jComboBoxid_empresaFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);


	this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
	this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
	this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
	this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoFormatoActivoFijo.add(jLabelid_formatoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
		this.gridBagConstraintsFormatoActivoFijo.gridx = 2;
		this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
		this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoFormatoActivoFijo.add(jButtonid_formatoFormatoActivoFijoBusqueda, this.gridBagConstraintsFormatoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
		this.gridBagConstraintsFormatoActivoFijo.gridx = 3;
		this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
		this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoFormatoActivoFijo.add(jButtonid_formatoFormatoActivoFijoUpdate, this.gridBagConstraintsFormatoActivoFijo);
	}

	this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
	this.gridBagConstraintsFormatoActivoFijo.gridx = 1;
	this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
	this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoFormatoActivoFijo.add(jComboBoxid_formatoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);


	this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
	this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
	this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
	this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato2FormatoActivoFijo.add(jLabelid_formato2FormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
		this.gridBagConstraintsFormatoActivoFijo.gridx = 2;
		this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
		this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato2FormatoActivoFijo.add(jButtonid_formato2FormatoActivoFijoBusqueda, this.gridBagConstraintsFormatoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
		this.gridBagConstraintsFormatoActivoFijo.gridx = 3;
		this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
		this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato2FormatoActivoFijo.add(jButtonid_formato2FormatoActivoFijoUpdate, this.gridBagConstraintsFormatoActivoFijo);
	}

	this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
	this.gridBagConstraintsFormatoActivoFijo.gridx = 1;
	this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
	this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato2FormatoActivoFijo.add(jComboBoxid_formato2FormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoActivoFijo.gridy = iYPanelCamposFormatoActivoFijo;
	this.gridBagConstraintsFormatoActivoFijo.gridx = iXPanelCamposFormatoActivoFijo++;
	this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoActivoFijo.add(this.jPanelidFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);



	if(iXPanelCamposFormatoActivoFijo % 1==0) {
		iXPanelCamposFormatoActivoFijo=0;
		iYPanelCamposFormatoActivoFijo++;
	}
	this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoActivoFijo.gridy = iYPanelCamposFormatoActivoFijo;
	this.gridBagConstraintsFormatoActivoFijo.gridx = iXPanelCamposFormatoActivoFijo++;
	this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoActivoFijo.add(this.jPanelid_formatoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);



	if(iXPanelCamposFormatoActivoFijo % 1==0) {
		iXPanelCamposFormatoActivoFijo=0;
		iYPanelCamposFormatoActivoFijo++;
	}
	this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoActivoFijo.gridy = iYPanelCamposFormatoActivoFijo;
	this.gridBagConstraintsFormatoActivoFijo.gridx = iXPanelCamposFormatoActivoFijo++;
	this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormatoActivoFijo.add(this.jPanelid_formato2FormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);



	if(iXPanelCamposFormatoActivoFijo % 1==0) {
		iXPanelCamposFormatoActivoFijo=0;
		iYPanelCamposFormatoActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormatoActivoFijo.gridy = iYPanelCamposOcultosFormatoActivoFijo;
	this.gridBagConstraintsFormatoActivoFijo.gridx = iXPanelCamposOcultosFormatoActivoFijo++;
	this.gridBagConstraintsFormatoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormatoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormatoActivoFijo.add(this.jPanelid_empresaFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);



	if(iXPanelCamposOcultosFormatoActivoFijo % 1==0) {
		iXPanelCamposOcultosFormatoActivoFijo=0;
		iYPanelCamposOcultosFormatoActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormatoActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormatoActivoFijo.setLayout(gridaBagLayoutAccionesFormatoActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormatoActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioFormatoActivoFijo.setLayout(gridaBagLayoutAccionesFormularioFormatoActivoFijo);
		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormatoActivoFijo.add(this.jComboBoxTiposAccionesFormularioFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);

		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormatoActivoFijo.add(this.jCheckBoxPostAccionNuevoFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormatoActivoFijo.add(this.jCheckBoxPostAccionSinCerrarFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formatoactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formatoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormatoActivoFijo.add(this.jCheckBoxPostAccionSinMensajeFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormatoActivoFijo.add(this.jButtonModificarFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);							

		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormatoActivoFijo.gridy = 0;
		this.gridBagConstraintsFormatoActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormatoActivoFijo.add(this.jButtonEliminarFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		
			
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = 0;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormatoActivoFijo.add(this.jButtonActualizarFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);


		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = 0;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormatoActivoFijo.add(this.jButtonGuardarCambiosFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);	
		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = 0;		
		this.gridBagConstraintsFormatoActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormatoActivoFijo.add(this.jButtonCancelarFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormatoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormatoActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formatoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormatoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsFormatoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormatoActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormatoActivoFijo.gridx =0;
		this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormatoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormatoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormatoActivoFijo = new FormatoActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Formatos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Formatos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formatos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormatoActivoFijoModel formatoactivofijoModel=new FormatoActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//FormatoActivoFijoModel.FormatoActivoFijoFocusTraversalPolicy formatoactivofijoFocusTraversalPolicy = formatoactivofijoModel.new FormatoActivoFijoFocusTraversalPolicy(this);
			
			//formatoactivofijoFocusTraversalPolicy.setformatoactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(formatoactivofijoModel);
			
			
			this.jContentPaneDetalleFormatoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormatoActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleFormatoActivoFijo.setLayout(gridaBagLayoutDetalleFormatoActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormatoActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleFormatoActivoFijo.add(jTtoolBarDetalleFormatoActivoFijo, gridBagConstraintsFormatoActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionFormatoActivoFijo=   new JScrollPane(jContentPaneDetalleFormatoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormatoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormatoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormatoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormatoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleFormatoActivoFijo.add(jPanelCamposFormatoActivoFijo, gridBagConstraintsFormatoActivoFijo);
			
			
			
			
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
						&& formatoactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.formatoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormatoActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
						this.jContentPaneDetalleFormatoActivoFijo.add(this.jTabbedPaneRelacionesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormatoActivoFijo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormatoActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsFormatoActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleFormatoActivoFijo.add(jPanelCamposOcultosFormatoActivoFijo, gridBagConstraintsFormatoActivoFijo);
				
					this.jPanelCamposOcultosFormatoActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
	        this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormatoActivoFijo.add(this.jPanelAccionesFormularioFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);							
			
			
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleFormatoActivoFijo.add(this.jPanelAccionesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormatoActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormatoActivoFijo=   new JScrollPane(this.jPanelCamposFormatoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormatoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormatoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
			this.gridBagConstraintsFormatoActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormatoActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormatoActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);			
			
			this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsFormatoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
			
			
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormatoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		
			
		this.gridBagConstraintsFormatoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsFormatoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormatoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormatoActivoFijo, this.gridBagConstraintsFormatoActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormatoActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionFormatoActivoFijo;
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
