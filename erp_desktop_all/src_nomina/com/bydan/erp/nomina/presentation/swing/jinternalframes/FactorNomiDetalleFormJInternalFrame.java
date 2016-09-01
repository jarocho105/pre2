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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.FactorNomiConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class FactorNomiDetalleFormJInternalFrame extends FactorNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFactorNomi;
	
	protected JMenuBar jmenuBarDetalleFactorNomi;
	
	protected JMenu jmenuDetalleFactorNomi;
	protected JMenu jmenuDetalleArchivoFactorNomi;
	protected JMenu jmenuDetalleAccionesFactorNomi;
	protected JMenu jmenuDetalleDatosFactorNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFactorNomi;	
	protected GridBagConstraints gridBagConstraintsFactorNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FactorNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleFactorNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public FactorNomiSessionBean factornomiSessionBean;
	
	

	public FormatoNomiFactorNomiBeanSwingJInternalFrame formatonomifactornomiBeanSwingJInternalFrame=null;
	public FormatoNomiFactorNomiBeanSwingJInternalFrame formatonomifactornomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormatoNomiFactorNomi=false;
	public FormatoNomiFactorNomiSessionBean formatonomifactornomiSessionBean;

	public PreguntaNomiBeanSwingJInternalFrame preguntanomiBeanSwingJInternalFrame=null;
	public PreguntaNomiBeanSwingJInternalFrame preguntanomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePreguntaNomi=false;
	public PreguntaNomiSessionBean preguntanomiSessionBean;

	public FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame=null;
	public FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormatoNomiPreguntaNomi=false;
	public FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public FactorNomiLogic factornomiLogic;
	
	public JScrollPane jScrollPanelDatosFactorNomi;
	public JScrollPane jScrollPanelDatosEdicionFactorNomi;
	public JScrollPane jScrollPanelDatosGeneralFactorNomi;
	
	protected JPanel jPanelCamposFactorNomi;    
	protected JPanel jPanelCamposOcultosFactorNomi;    	
	protected JPanel jPanelAccionesFactorNomi;
	protected JPanel jPanelAccionesFormularioFactorNomi;
    
	
	
	protected Integer iXPanelCamposFactorNomi=0;
	protected Integer iYPanelCamposFactorNomi=0;
	
	protected Integer iXPanelCamposOcultosFactorNomi=0;
	protected Integer iYPanelCamposOcultosFactorNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFactorNomi;
	public JButton jButtonModificarFactorNomi;
	public JButton jButtonActualizarFactorNomi;
    public JButton jButtonEliminarFactorNomi;
	public JButton jButtonCancelarFactorNomi;
    public JButton jButtonGuardarCambiosFactorNomi;
	public JButton jButtonGuardarCambiosTablaFactorNomi;
	protected JButton jButtonCerrarFactorNomi;
	
	
	protected JButton jButtonProcesarInformacionFactorNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFactorNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFactorNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFactorNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFactorNomi;
	protected JButton jButtonModificarToolBarFactorNomi;
	protected JButton jButtonActualizarToolBarFactorNomi;
    protected JButton jButtonEliminarToolBarFactorNomi;
	protected JButton jButtonCancelarToolBarFactorNomi;
    protected JButton jButtonGuardarCambiosToolBarFactorNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarFactorNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarFactorNomi;
	protected JButton jButtonCerrarToolBarFactorNomi;
	
	protected JButton jButtonProcesarInformacionToolBarFactorNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFactorNomi;
	protected JMenuItem jMenuItemModificarFactorNomi;
	protected JMenuItem jMenuItemActualizarFactorNomi;
    protected JMenuItem jMenuItemEliminarFactorNomi;
	protected JMenuItem jMenuItemCancelarFactorNomi;
    protected JMenuItem jMenuItemGuardarCambiosFactorNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaFactorNomi;
	protected JMenuItem jMenuItemCerrarFactorNomi;
	protected JMenuItem jMenuItemDetalleCerrarFactorNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarFactorNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionFactorNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFactorNomi;
	protected JMenuItem jMenuItemMostrarOcultarFactorNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFactorNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFactorNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFactorNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFactorNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFactorNomi;
	public JLabel jLabelIdFactorNomi;
	public JLabel jLabelidFactorNomi;
	public JButton jButtonidFactorNomiBusqueda= new JButtonMe();

	public JPanel jPanelnombreFactorNomi;
	public JLabel jLabelnombreFactorNomi;
	public JTextArea jTextAreanombreFactorNomi;
	public JScrollPane jscrollPanenombreFactorNomi;
	public JButton jButtonnombreFactorNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFactorNomi;
	public JLabel jLabelid_empresaFactorNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFactorNomi;
	public JButton jButtonid_empresaFactorNomi= new JButtonMe();
	public JButton jButtonid_empresaFactorNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaFactorNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFactorNomi;
	
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
	
	public FactorNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFactorNomi=new JPanel();
				this.jPanelAccionesFormularioFactorNomi=new JPanel();
				this.jmenuBarDetalleFactorNomi=new JMenuBar();
				this.jTtoolBarDetalleFactorNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FactorNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FactorNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FactorNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FactorNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FactorNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FactorNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFactorNomi() {
		return this.jButtonActualizarToolBarFactorNomi;
	}
	
	public JButton getjButtonEliminarToolBarFactorNomi() {
		return this.jButtonEliminarToolBarFactorNomi;
	}
	
	public JButton getjButtonCancelarToolBarFactorNomi() {
		return this.jButtonCancelarToolBarFactorNomi;
	}		
	
	public JButton getjButtonProcesarInformacionFactorNomi() {
		return this.jButtonProcesarInformacionFactorNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFactorNomi)	{
		this.jButtonProcesarInformacionFactorNomi = jButtonProcesarInformacionFactorNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFactorNomi() {
		return this.jComboBoxTiposAccionesFactorNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFactorNomi(
			JComboBox jComboBoxTiposRelacionesFactorNomi) {
		this.jComboBoxTiposRelacionesFactorNomi = jComboBoxTiposRelacionesFactorNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFactorNomi(
			JComboBox jComboBoxTiposAccionesFactorNomi) {
		this.jComboBoxTiposAccionesFactorNomi = jComboBoxTiposAccionesFactorNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFactorNomi() {
		return this.jComboBoxTiposAccionesFormularioFactorNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFactorNomi(
			JComboBox jComboBoxTiposAccionesFormularioFactorNomi) {
		this.jComboBoxTiposAccionesFormularioFactorNomi = jComboBoxTiposAccionesFormularioFactorNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.factornomiSessionBean=new FactorNomiSessionBean();
		
		this.factornomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.factornomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.factornomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
		//this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
		//this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FactorNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factor Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
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
	
		FactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFactorNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFactorNomi=new JButtonMe();
				this.jButtonModificarToolBarFactorNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFactorNomi,this.jTtoolBarDetalleFactorNomi,
							"actualizar","actualizar","Actualizar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFactorNomi,this.jTtoolBarDetalleFactorNomi,
							"eliminar","eliminar","Eliminar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFactorNomi,this.jTtoolBarDetalleFactorNomi,
							"cancelar","cancelar","Cancelar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFactorNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFactorNomi,this.jTtoolBarDetalleFactorNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFactorNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFactorNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFactorNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFactorNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFactorNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFactorNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFactorNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFactorNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFactorNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFactorNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFactorNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFactorNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFactorNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFactorNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFactorNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFactorNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFactorNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFactorNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFactorNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFactorNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFactorNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFactorNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFactorNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFactorNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFactorNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFactorNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFactorNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFactorNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFactorNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFactorNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFactorNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFactorNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFactorNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFactorNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFactorNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFactorNomi.add(this.jMenuItemDetalleCerrarFactorNomi);
		
		this.jmenuDetalleAccionesFactorNomi.add(this.jMenuItemActualizarFactorNomi);
		this.jmenuDetalleAccionesFactorNomi.add(this.jMenuItemEliminarFactorNomi);
		this.jmenuDetalleAccionesFactorNomi.add(this.jMenuItemCancelarFactorNomi);		
		
		//this.jmenuDetalleDatosFactorNomi.add(this.jMenuItemDetalleAbrirOrderByFactorNomi);				
		this.jmenuDetalleDatosFactorNomi.add(this.jMenuItemDetalleMostarOcultarFactorNomi);				
				
		//this.jmenuDetalleAccionesFactorNomi.add(this.jMenuItemGuardarCambiosFactorNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFactorNomi.add(this.jmenuDetalleArchivoFactorNomi);		
		this.jmenuBarDetalleFactorNomi.add(this.jmenuDetalleAccionesFactorNomi);		
		this.jmenuBarDetalleFactorNomi.add(this.jmenuDetalleDatosFactorNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFactorNomi.add(this.jmenuDetalleFactorNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFactorNomi);				
	}
	
	
	public void inicializarElementosCamposFactorNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFactorNomi = new JLabelMe();
		jLabelIdFactorNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFactorNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFactorNomi.setToolTipText(FactorNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFactorNomi= new GridBagLayout();

		this.jPanelidFactorNomi.setLayout(this.gridaBagLayoutFactorNomi);

		jLabelidFactorNomi = new JLabel();
		jLabelidFactorNomi.setText("Id");

		jLabelidFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreFactorNomi = new JLabelMe();
		this.jLabelnombreFactorNomi.setText(""+FactorNomiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreFactorNomi.setToolTipText("Nombre");
		this.jLabelnombreFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreFactorNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreFactorNomi.setToolTipText(FactorNomiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutFactorNomi = new GridBagLayout();
		this.jPanelnombreFactorNomi.setLayout(this.gridaBagLayoutFactorNomi);


		jTextAreanombreFactorNomi= new JTextAreaMe();
		jTextAreanombreFactorNomi.setEnabled(false);
		jTextAreanombreFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFactorNomi.setLineWrap(true);
		jTextAreanombreFactorNomi.setWrapStyleWord(true);
		jTextAreanombreFactorNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreFactorNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreFactorNomi = new JScrollPane(jTextAreanombreFactorNomi);
		jscrollPanenombreFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreFactorNomiBusqueda= new JButtonMe();
		this.jButtonnombreFactorNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFactorNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFactorNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreFactorNomiBusqueda.setText("U");
		this.jButtonnombreFactorNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreFactorNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreFactorNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreFactorNomiBusqueda"));

		if(this.factornomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreFactorNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFactorNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFactorNomi = new JLabelMe();
		this.jLabelid_empresaFactorNomi.setText(""+FactorNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFactorNomi.setToolTipText("Empresa");
		this.jLabelid_empresaFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFactorNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFactorNomi.setToolTipText(FactorNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFactorNomi = new GridBagLayout();
		this.jPanelid_empresaFactorNomi.setLayout(this.gridaBagLayoutFactorNomi);


		jComboBoxid_empresaFactorNomi= new JComboBoxMe();
		jComboBoxid_empresaFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFactorNomi.setEnabled(false);

		this.jButtonid_empresaFactorNomi= new JButtonMe();
		this.jButtonid_empresaFactorNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFactorNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFactorNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFactorNomi.setText("Buscar");
		this.jButtonid_empresaFactorNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFactorNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFactorNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFactorNomi"));

		this.jButtonid_empresaFactorNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaFactorNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFactorNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFactorNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFactorNomiBusqueda.setText("U");
		this.jButtonid_empresaFactorNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFactorNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFactorNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFactorNomiBusqueda"));

		if(this.factornomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFactorNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaFactorNomiUpdate= new JButtonMe();
		this.jButtonid_empresaFactorNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFactorNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFactorNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFactorNomiUpdate.setText("U");
		this.jButtonid_empresaFactorNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFactorNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFactorNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFactorNomiUpdate"));



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
		//this.jInternalFrameDetalleFactorNomi = new FactorNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Factor Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFactorNomi= new GridBagLayout();
		

		
		String sToolTipFactorNomi="";
		sToolTipFactorNomi=FactorNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFactorNomi+="(Nomina.FactorNomi)";
		}
		
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipFactorNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFactorNomi = new JButtonMe();
		this.jButtonModificarFactorNomi = new JButtonMe();
        this.jButtonActualizarFactorNomi = new JButtonMe();
        this.jButtonEliminarFactorNomi = new JButtonMe();
        this.jButtonCancelarFactorNomi = new JButtonMe();
        this.jButtonGuardarCambiosFactorNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaFactorNomi = new JButtonMe();
		this.jButtonCerrarFactorNomi = new JButtonMe();
		
		this.jScrollPanelDatosFactorNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionFactorNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralFactorNomi = new JScrollPane();
				
		
		
		this.jPanelCamposFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Factor Nomi";
		
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factor Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosFactorNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFactorNomi.setName("jPanelCamposFactorNomi"); 

		this.jPanelCamposOcultosFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFactorNomi.setName("jPanelCamposOcultosFactorNomi"); 

        this.jPanelAccionesFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFactorNomi.setToolTipText("Acciones");
        this.jPanelAccionesFactorNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFactorNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFactorNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFactorNomi.setText("Nuevo");
		this.jButtonModificarFactorNomi.setText("Editar");
        this.jButtonActualizarFactorNomi.setText("Actualizar");
        this.jButtonEliminarFactorNomi.setText("Eliminar");
        this.jButtonCancelarFactorNomi.setText("Cancelar");
        this.jButtonGuardarCambiosFactorNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaFactorNomi.setText("Guardar");
		this.jButtonCerrarFactorNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFactorNomi,"nuevo_button","Nuevo",this.factornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFactorNomi,"modificar_button","Editar",this.factornomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFactorNomi,"actualizar_button","Actualizar",this.factornomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFactorNomi,"eliminar_button","Eliminar",this.factornomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFactorNomi,"cancelar_button","Cancelar",this.factornomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFactorNomi,"guardarcambios_button","Guardar",this.factornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFactorNomi,"guardarcambiostabla_button","Guardar",this.factornomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFactorNomi,"cerrar_button","Salir",this.factornomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFactorNomi.setToolTipText("Nuevo"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFactorNomi.setToolTipText("Editar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFactorNomi.setToolTipText("Actualizar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFactorNomi.setToolTipText("Eliminar)"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFactorNomi.setToolTipText("Cancelar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFactorNomi.setToolTipText("Guardar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFactorNomi.setToolTipText("Guardar"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFactorNomi.setToolTipText("Salir"+" "+FactorNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFactorNomi";
		inputMap = this.jButtonNuevoFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFactorNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFactorNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFactorNomi";
		inputMap = this.jButtonActualizarFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFactorNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarFactorNomi";
		inputMap = this.jButtonEliminarFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFactorNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarFactorNomi";
		inputMap = this.jButtonCancelarFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFactorNomi"));
		
		//CERRAR		
		sMapKey = "CerrarFactorNomi";
		inputMap = this.jButtonCerrarFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFactorNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFactorNomi";
		inputMap = this.jButtonGuardarCambiosTablaFactorNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFactorNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFactorNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFactorNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFactorNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFactorNomi.setToolTipText("Nuevo FactorNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFactorNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFactorNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFactorNomi.setToolTipText("Sin Cerrar Ventana FactorNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFactorNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFactorNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFactorNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFactorNomi.setText("Accion");
		this.jComboBoxTiposAccionesFactorNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFactorNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFactorNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFactorNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFactorNomi = new JLabelMe();
		
		this.jLabelAccionesFactorNomi.setText("Acciones");		
		this.jLabelAccionesFactorNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFactorNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFactorNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFactorNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFactorNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFactorNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesFactorNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFactorNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFactorNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFactorNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFactorNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFactorNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFactorNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFactorNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFactorNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFactorNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFactorNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFactorNomi = new GridBagLayout();
		
		this.jPanelCamposFactorNomi.setLayout(gridaBagLayoutCamposFactorNomi);
		this.jPanelCamposOcultosFactorNomi.setLayout(gridaBagLayoutCamposOcultosFactorNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactorNomi.gridy = 0;
	this.gridBagConstraintsFactorNomi.gridx = 0;
	this.gridBagConstraintsFactorNomi.ipadx = 0;
	this.gridBagConstraintsFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFactorNomi.add(jLabelIdFactorNomi, this.gridBagConstraintsFactorNomi);



	this.gridBagConstraintsFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactorNomi.gridy = 0;
	this.gridBagConstraintsFactorNomi.gridx = 1;
	this.gridBagConstraintsFactorNomi.ipadx = 0;
	this.gridBagConstraintsFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFactorNomi.add(jLabelidFactorNomi, this.gridBagConstraintsFactorNomi);


	this.gridBagConstraintsFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactorNomi.gridy = 0;
	this.gridBagConstraintsFactorNomi.gridx = 0;
	this.gridBagConstraintsFactorNomi.ipadx = 0;
	this.gridBagConstraintsFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFactorNomi.add(jLabelid_empresaFactorNomi, this.gridBagConstraintsFactorNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactorNomi.gridy = 0;
		this.gridBagConstraintsFactorNomi.gridx = 2;
		this.gridBagConstraintsFactorNomi.ipadx = 0;
		this.gridBagConstraintsFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFactorNomi.add(jButtonid_empresaFactorNomiBusqueda, this.gridBagConstraintsFactorNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactorNomi.gridy = 0;
		this.gridBagConstraintsFactorNomi.gridx = 3;
		this.gridBagConstraintsFactorNomi.ipadx = 0;
		this.gridBagConstraintsFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFactorNomi.add(jButtonid_empresaFactorNomiUpdate, this.gridBagConstraintsFactorNomi);
	}

	this.gridBagConstraintsFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactorNomi.gridy = 0;
	this.gridBagConstraintsFactorNomi.gridx = 1;
	this.gridBagConstraintsFactorNomi.ipadx = 0;
	this.gridBagConstraintsFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFactorNomi.add(jComboBoxid_empresaFactorNomi, this.gridBagConstraintsFactorNomi);


	this.gridBagConstraintsFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactorNomi.gridy = 0;
	this.gridBagConstraintsFactorNomi.gridx = 0;
	this.gridBagConstraintsFactorNomi.ipadx = 0;
	this.gridBagConstraintsFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreFactorNomi.add(jLabelnombreFactorNomi, this.gridBagConstraintsFactorNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		//this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactorNomi.gridy = 0;
		this.gridBagConstraintsFactorNomi.gridx = 2;
		this.gridBagConstraintsFactorNomi.ipadx = 0;
		this.gridBagConstraintsFactorNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreFactorNomi.add(jButtonnombreFactorNomiBusqueda, this.gridBagConstraintsFactorNomi);
	}

	this.gridBagConstraintsFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactorNomi.gridy = 0;
	this.gridBagConstraintsFactorNomi.gridx = 1;
	this.gridBagConstraintsFactorNomi.ipadx = 0;
	this.gridBagConstraintsFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreFactorNomi.add(jscrollPanenombreFactorNomi, this.gridBagConstraintsFactorNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactorNomi.gridy = iYPanelCamposFactorNomi;
	this.gridBagConstraintsFactorNomi.gridx = iXPanelCamposFactorNomi++;
	this.gridBagConstraintsFactorNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactorNomi.add(this.jPanelidFactorNomi, this.gridBagConstraintsFactorNomi);



	if(iXPanelCamposFactorNomi % 1==0) {
		iXPanelCamposFactorNomi=0;
		iYPanelCamposFactorNomi++;
	}
	this.gridBagConstraintsFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactorNomi.gridy = iYPanelCamposFactorNomi;
	this.gridBagConstraintsFactorNomi.gridx = iXPanelCamposFactorNomi++;
	this.gridBagConstraintsFactorNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactorNomi.add(this.jPanelnombreFactorNomi, this.gridBagConstraintsFactorNomi);



	if(iXPanelCamposFactorNomi % 1==0) {
		iXPanelCamposFactorNomi=0;
		iYPanelCamposFactorNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFactorNomi = new GridBagConstraints();
	this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactorNomi.gridy = iYPanelCamposOcultosFactorNomi;
	this.gridBagConstraintsFactorNomi.gridx = iXPanelCamposOcultosFactorNomi++;
	this.gridBagConstraintsFactorNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactorNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactorNomi.add(this.jPanelid_empresaFactorNomi, this.gridBagConstraintsFactorNomi);



	if(iXPanelCamposOcultosFactorNomi % 1==0) {
		iXPanelCamposOcultosFactorNomi=0;
		iYPanelCamposOcultosFactorNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesFactorNomi= new GridBagLayout();
		this.jPanelAccionesFactorNomi.setLayout(gridaBagLayoutAccionesFactorNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFactorNomi= new GridBagLayout();
		this.jPanelAccionesFormularioFactorNomi.setLayout(gridaBagLayoutAccionesFormularioFactorNomi);
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFactorNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFactorNomi.add(this.jComboBoxTiposAccionesFormularioFactorNomi, this.gridBagConstraintsFactorNomi);

		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFactorNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFactorNomi.add(this.jCheckBoxPostAccionNuevoFactorNomi, this.gridBagConstraintsFactorNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.factornomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFactorNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFactorNomi.add(this.jCheckBoxPostAccionSinCerrarFactorNomi, this.gridBagConstraintsFactorNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.factornomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFactorNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFactorNomi.add(this.jCheckBoxPostAccionSinMensajeFactorNomi, this.gridBagConstraintsFactorNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactorNomi.gridy = 0;
		this.gridBagConstraintsFactorNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesFactorNomi.add(this.jButtonModificarFactorNomi, this.gridBagConstraintsFactorNomi);							

		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactorNomi.gridy = 0;
		this.gridBagConstraintsFactorNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesFactorNomi.add(this.jButtonEliminarFactorNomi, this.gridBagConstraintsFactorNomi);
		
			
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = 0;		
		this.gridBagConstraintsFactorNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesFactorNomi.add(this.jButtonActualizarFactorNomi, this.gridBagConstraintsFactorNomi);


		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = 0;		
		this.gridBagConstraintsFactorNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesFactorNomi.add(this.jButtonGuardarCambiosFactorNomi, this.gridBagConstraintsFactorNomi);	
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = 0;		
		this.gridBagConstraintsFactorNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesFactorNomi.add(this.jButtonCancelarFactorNomi, this.gridBagConstraintsFactorNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFactorNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFactorNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.factornomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();						
			this.gridBagConstraintsFactorNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFactorNomi.gridx = 0;		
			//this.gridBagConstraintsFactorNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFactorNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFactorNomi.gridx =0;
		this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFactorNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFactorNomi, this.gridBagConstraintsFactorNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FactorNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFactorNomi = new FactorNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Factor Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Factor Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Factor Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FactorNomiModel factornomiModel=new FactorNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//FactorNomiModel.FactorNomiFocusTraversalPolicy factornomiFocusTraversalPolicy = factornomiModel.new FactorNomiFocusTraversalPolicy(this);
			
			//factornomiFocusTraversalPolicy.setfactornomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(factornomiModel);
			
			
			this.jContentPaneDetalleFactorNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFactorNomi = new GridBagLayout();	
			this.jContentPaneDetalleFactorNomi.setLayout(gridaBagLayoutDetalleFactorNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFactorNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFactorNomi = new GridBagConstraints();
				this.gridBagConstraintsFactorNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFactorNomi.gridx = 0;
					
				
				this.jContentPaneDetalleFactorNomi.add(jTtoolBarDetalleFactorNomi, gridBagConstraintsFactorNomi);								
				
}
			
			this.jScrollPanelDatosEdicionFactorNomi=   new JScrollPane(jContentPaneDetalleFactorNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFactorNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFactorNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFactorNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFactorNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFactorNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFactorNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFactorNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFactorNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFactorNomi.gridx = 0;
	        
			this.jContentPaneDetalleFactorNomi.add(jPanelCamposFactorNomi, gridBagConstraintsFactorNomi);
			
			
			
			
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
						&& factornomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomiFactorNomi(this.puedeCargarPorParteFormatoNomiFactorNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomiPreguntaNomi(this.puedeCargarPorParteFormatoNomiPreguntaNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePreguntaNomi(this.puedeCargarPorPartePreguntaNomi,false,-1);
					
					if(this.factornomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFactorNomi= new GridBagConstraints();
						this.gridBagConstraintsFactorNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFactorNomi.gridx = 0;
						this.jContentPaneDetalleFactorNomi.add(this.jTabbedPaneRelacionesFactorNomi, this.gridBagConstraintsFactorNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFactorNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomiFactorNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomiPreguntaNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePreguntaNomi(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFactorNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFactorNomi = new GridBagConstraints();
					this.gridBagConstraintsFactorNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFactorNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFactorNomi.gridx = 0;
					
				
					this.jContentPaneDetalleFactorNomi.add(jPanelCamposOcultosFactorNomi, gridBagConstraintsFactorNomi);
				
					this.jPanelCamposOcultosFactorNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsFactorNomi.gridx = 0;
	        this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFactorNomi.add(this.jPanelAccionesFormularioFactorNomi, this.gridBagConstraintsFactorNomi);							
			
			
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
	        this.gridBagConstraintsFactorNomi.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsFactorNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleFactorNomi.add(this.jPanelAccionesFactorNomi, this.gridBagConstraintsFactorNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFactorNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFactorNomi=   new JScrollPane(this.jPanelCamposFactorNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFactorNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFactorNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFactorNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFactorNomi.gridx = 0;
			this.gridBagConstraintsFactorNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFactorNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFactorNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFactorNomi, this.gridBagConstraintsFactorNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFactorNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFactorNomi, this.gridBagConstraintsFactorNomi);			
			
			this.gridBagConstraintsFactorNomi = new GridBagConstraints();
			this.gridBagConstraintsFactorNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFactorNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFactorNomi, this.gridBagConstraintsFactorNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactorNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFactorNomi, this.gridBagConstraintsFactorNomi);
			
			
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactorNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFactorNomi, this.gridBagConstraintsFactorNomi);
		
			
		this.gridBagConstraintsFactorNomi = new GridBagConstraints();
		this.gridBagConstraintsFactorNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFactorNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFactorNomi, this.gridBagConstraintsFactorNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFactorNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionFactorNomi;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormatoNomiFactorNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
		this.formatonomifactornomiSessionBean.setConGuardarRelaciones(false);
		this.formatonomifactornomiSessionBean.setEsGuardarRelacionado(true);

		this.formatonomifactornomiBeanSwingJInternalFrame=null;//new FormatoNomiFactorNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formatonomifactornomiBeanSwingJInternalFramePopup=new FormatoNomiFactorNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formatonomifactornomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {

				FormatoNomiFactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL=FactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormatoNomiFactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formatonomifactornomiSessionBean.setEsGuardarRelacionado(true);

				this.formatonomifactornomiBeanSwingJInternalFrame=new FormatoNomiFactorNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formatonomifactornomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formatonomifactornomiBeanSwingJInternalFrame.setformatonomifactornomiSessionBean(this.formatonomifactornomiSessionBean);

				//this.gridBagConstraintsFactorNomi = new GridBagConstraints();
				//this.gridBagConstraintsFactorNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFactorNomi.gridx = 0;
				//this.jContentPaneDetalleFactorNomi.add(this.formatonomifactornomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFactorNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFactorNomi.add("Formato Nomi Factor Nomis",this.formatonomifactornomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFactorNomi.setComponentAt(iIndexTab,this.formatonomifactornomiBeanSwingJInternalFrame.getContentPane());
				}

				//FormatoNomiFactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formatonomifactornomiSessionBean.setEsGuardarRelacionado(false);
				this.formatonomifactornomiBeanSwingJInternalFrame=null;//new FormatoNomiFactorNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormatoNomiFactorNomi) {
					this.jTabbedPaneRelacionesFactorNomi.add("Formato Nomi Factor Nomis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFormatoNomiPreguntaNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
		this.formatonomipreguntanomiSessionBean.setConGuardarRelaciones(false);
		this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(true);

		this.formatonomipreguntanomiBeanSwingJInternalFrame=null;//new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formatonomipreguntanomiBeanSwingJInternalFramePopup=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formatonomipreguntanomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {

				FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL=FactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormatoNomiPreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(true);

				this.formatonomipreguntanomiBeanSwingJInternalFrame=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formatonomipreguntanomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formatonomipreguntanomiBeanSwingJInternalFrame.setformatonomipreguntanomiSessionBean(this.formatonomipreguntanomiSessionBean);

				//this.gridBagConstraintsFactorNomi = new GridBagConstraints();
				//this.gridBagConstraintsFactorNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFactorNomi.gridx = 0;
				//this.jContentPaneDetalleFactorNomi.add(this.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFactorNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFactorNomi.add("Formato Nomi Pregunta Nomis",this.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFactorNomi.setComponentAt(iIndexTab,this.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane());
				}

				//FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(false);
				this.formatonomipreguntanomiBeanSwingJInternalFrame=null;//new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormatoNomiPreguntaNomi) {
					this.jTabbedPaneRelacionesFactorNomi.add("Formato Nomi Pregunta Nomis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePreguntaNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.preguntanomiSessionBean=new PreguntaNomiSessionBean();
		this.preguntanomiSessionBean.setConGuardarRelaciones(false);
		this.preguntanomiSessionBean.setEsGuardarRelacionado(true);

		this.preguntanomiBeanSwingJInternalFrame=null;//new PreguntaNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.preguntanomiBeanSwingJInternalFramePopup=new PreguntaNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.preguntanomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.preguntanomiSessionBean.getEsGuardarRelacionado()) {

				PreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL=FactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				PreguntaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FactorNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.preguntanomiSessionBean.setEsGuardarRelacionado(true);

				this.preguntanomiBeanSwingJInternalFrame=new PreguntaNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.preguntanomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.preguntanomiBeanSwingJInternalFrame.setpreguntanomiSessionBean(this.preguntanomiSessionBean);

				//this.gridBagConstraintsFactorNomi = new GridBagConstraints();
				//this.gridBagConstraintsFactorNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFactorNomi.gridx = 0;
				//this.jContentPaneDetalleFactorNomi.add(this.preguntanomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFactorNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFactorNomi.add("Pregunta Nomis",this.preguntanomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFactorNomi.setComponentAt(iIndexTab,this.preguntanomiBeanSwingJInternalFrame.getContentPane());
				}

				//PreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.preguntanomiSessionBean.setEsGuardarRelacionado(false);
				this.preguntanomiBeanSwingJInternalFrame=null;//new PreguntaNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.preguntanomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePreguntaNomi) {
					this.jTabbedPaneRelacionesFactorNomi.add("Pregunta Nomis",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormatoNomiFactorNomiBeanSwingJInternalFrame(List<FactorNomi> factornomis,FactorNomi factornomi,FormatoNomiFactorNomiBeanSwingJInternalFrame formatonomifactornomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formatonomifactornomiBeanSwingJInternalFrame=new FormatoNomiFactorNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formatonomifactornomiBeanSwingJInternalFrame.getFormatoNomiFactorNomiLogic().setConnexion(this.factornomiLogic.getConnexion());

					formatonomifactornomiBeanSwingJInternalFrame.setfactornomisForeignKey(factornomis);
					formatonomifactornomiBeanSwingJInternalFrame.setfactornomiForeignKey(factornomi);
					formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.setisBusquedaDesdeForeignKeySesionFactorNomi(true);
					formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.setlidFactorNomiActual(factornomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formatonomifactornomiBeanSwingJInternalFrame.cargarCombosForeignKeyFormatoNomiFactorNomi(formatonomifactornomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					formatonomifactornomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaFactorNomi(true);
					formatonomifactornomiBeanSwingJInternalFrame.setid_factor_nomiFK_IdFactorNomi(factornomi.getId());

					if(!this.conCargarFormDetalle) {
						formatonomifactornomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formatonomifactornomiBeanSwingJInternalFrame.setSelectedItemCombosFrameFactorNomiForeignKey(factornomi,1,false,true,true);
					formatonomifactornomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formatonomifactornomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdFactorNomi");
					formatonomifactornomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFactorNomi");
					formatonomifactornomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiFactorNomi(true);
					formatonomifactornomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("n",formatonomifactornomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, formatonomifactornomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formatonomifactornomiBeanSwingJInternalFrame.setAutoscrolls(true);
					formatonomifactornomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formatonomifactornomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiFactorNomi("relacionado");
					} else {
						formatonomifactornomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiFactorNomi("no_relacionado");
					}

					formatonomifactornomiBeanSwingJInternalFrame.getjButtonRecargarInformacionFormatoNomiFactorNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPreguntaNomiBeanSwingJInternalFrame(List<FactorNomi> factornomis,FactorNomi factornomi,PreguntaNomiBeanSwingJInternalFrame preguntanomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//preguntanomiBeanSwingJInternalFrame=new PreguntaNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					preguntanomiBeanSwingJInternalFrame.getPreguntaNomiLogic().setConnexion(this.factornomiLogic.getConnexion());

					preguntanomiBeanSwingJInternalFrame.setfactornomisForeignKey(factornomis);
					preguntanomiBeanSwingJInternalFrame.setfactornomiForeignKey(factornomi);
					preguntanomiBeanSwingJInternalFrame.preguntanomiSessionBean.setisBusquedaDesdeForeignKeySesionFactorNomi(true);
					preguntanomiBeanSwingJInternalFrame.preguntanomiSessionBean.setlidFactorNomiActual(factornomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					preguntanomiBeanSwingJInternalFrame.cargarCombosForeignKeyPreguntaNomi(preguntanomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					preguntanomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaFactorNomi(true);
					preguntanomiBeanSwingJInternalFrame.setid_factor_nomiFK_IdFactorNomi(factornomi.getId());

					if(!this.conCargarFormDetalle) {
						preguntanomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					preguntanomiBeanSwingJInternalFrame.setSelectedItemCombosFrameFactorNomiForeignKey(factornomi,1,false,true,true);
					preguntanomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					preguntanomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdFactorNomi");
					preguntanomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFactorNomi");
					preguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaPreguntaNomi(true);
					preguntanomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPreguntaNomi("n",preguntanomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, preguntanomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					preguntanomiBeanSwingJInternalFrame.setAutoscrolls(true);
					preguntanomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						preguntanomiBeanSwingJInternalFrame.actualizarEstadoPanelsPreguntaNomi("relacionado");
					} else {
						preguntanomiBeanSwingJInternalFrame.actualizarEstadoPanelsPreguntaNomi("no_relacionado");
					}

					preguntanomiBeanSwingJInternalFrame.getjButtonRecargarInformacionPreguntaNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormatoNomiPreguntaNomiBeanSwingJInternalFrame(List<FactorNomi> factornomis,FactorNomi factornomi,FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formatonomipreguntanomiBeanSwingJInternalFrame=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formatonomipreguntanomiBeanSwingJInternalFrame.getFormatoNomiPreguntaNomiLogic().setConnexion(this.factornomiLogic.getConnexion());

					formatonomipreguntanomiBeanSwingJInternalFrame.setfactornomisForeignKey(factornomis);
					formatonomipreguntanomiBeanSwingJInternalFrame.setfactornomiForeignKey(factornomi);
					formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setisBusquedaDesdeForeignKeySesionFactorNomi(true);
					formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setlidFactorNomiActual(factornomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formatonomipreguntanomiBeanSwingJInternalFrame.cargarCombosForeignKeyFormatoNomiPreguntaNomi(formatonomipreguntanomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					formatonomipreguntanomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaFactorNomi(true);
					formatonomipreguntanomiBeanSwingJInternalFrame.setid_factor_nomiFK_IdFactorNomi(factornomi.getId());

					if(!this.conCargarFormDetalle) {
						formatonomipreguntanomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formatonomipreguntanomiBeanSwingJInternalFrame.setSelectedItemCombosFrameFactorNomiForeignKey(factornomi,1,false,true,true);
					formatonomipreguntanomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formatonomipreguntanomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdFactorNomi");
					formatonomipreguntanomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFactorNomi");
					formatonomipreguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(true);
					formatonomipreguntanomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("n",formatonomipreguntanomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, formatonomipreguntanomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formatonomipreguntanomiBeanSwingJInternalFrame.setAutoscrolls(true);
					formatonomipreguntanomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formatonomipreguntanomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiPreguntaNomi("relacionado");
					} else {
						formatonomipreguntanomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiPreguntaNomi("no_relacionado");
					}

					formatonomipreguntanomiBeanSwingJInternalFrame.getjButtonRecargarInformacionFormatoNomiPreguntaNomi().setVisible(false);

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
