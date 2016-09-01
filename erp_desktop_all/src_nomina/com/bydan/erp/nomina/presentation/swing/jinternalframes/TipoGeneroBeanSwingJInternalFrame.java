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




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.nomina.util.TipoGeneroConstantesFunciones;
import com.bydan.erp.nomina.util.TipoGeneroParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoGeneroParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoGeneroBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoGeneroBeanSwingJInternalFrame extends TipoGeneroJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoGeneroBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoGenero> tipogeneroValidator = new ClassValidator<TipoGenero>(TipoGenero.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoGenero tipogenero;	
	public TipoGenero tipogeneroAux;
	public TipoGenero tipogeneroAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoGenero tipogeneroTotales;
	public Long idTipoGeneroActual;
	public Long iIdNuevoTipoGenero=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosCargaFamiliar_NM=false;

	public Boolean getIsTienePermisosCargaFamiliar_NM() {
		return isTienePermisosCargaFamiliar_NM;
	}

	public void setIsTienePermisosCargaFamiliar_NM(Boolean isTienePermisosCargaFamiliar_NM) {
		this.isTienePermisosCargaFamiliar_NM= isTienePermisosCargaFamiliar_NM;
	}


	public Boolean isTienePermisosSubCliente=false;

	public Boolean getIsTienePermisosSubCliente() {
		return isTienePermisosSubCliente;
	}

	public void setIsTienePermisosSubCliente(Boolean isTienePermisosSubCliente) {
		this.isTienePermisosSubCliente= isTienePermisosSubCliente;
	}


	public Boolean isTienePermisosEmpleado=false;

	public Boolean getIsTienePermisosEmpleado() {
		return isTienePermisosEmpleado;
	}

	public void setIsTienePermisosEmpleado(Boolean isTienePermisosEmpleado) {
		this.isTienePermisosEmpleado= isTienePermisosEmpleado;
	}


	public Boolean isTienePermisosParametroCarteraDefecto=false;

	public Boolean getIsTienePermisosParametroCarteraDefecto() {
		return isTienePermisosParametroCarteraDefecto;
	}

	public void setIsTienePermisosParametroCarteraDefecto(Boolean isTienePermisosParametroCarteraDefecto) {
		this.isTienePermisosParametroCarteraDefecto= isTienePermisosParametroCarteraDefecto;
	}


	public Boolean isTienePermisosCargaFamiliar=false;

	public Boolean getIsTienePermisosCargaFamiliar() {
		return isTienePermisosCargaFamiliar;
	}

	public void setIsTienePermisosCargaFamiliar(Boolean isTienePermisosCargaFamiliar) {
		this.isTienePermisosCargaFamiliar= isTienePermisosCargaFamiliar;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoTipoGenero;
	public Boolean isPermisoNuevoTipoGenero;
	public Boolean isPermisoActualizarTipoGenero;
	public Boolean isPermisoActualizarOriginalTipoGenero;
	public Boolean isPermisoEliminarTipoGenero;
	public Boolean isPermisoGuardarCambiosTipoGenero;
	public Boolean isPermisoConsultaTipoGenero;
	public Boolean isPermisoBusquedaTipoGenero;
	public Boolean isPermisoReporteTipoGenero;
	public Boolean isPermisoPaginacionMedioTipoGenero;
	public Boolean isPermisoPaginacionAltoTipoGenero;
	public Boolean isPermisoPaginacionTodoTipoGenero;
	public Boolean isPermisoCopiarTipoGenero;
	public Boolean isPermisoVerFormTipoGenero;
	public Boolean isPermisoDuplicarTipoGenero;
	public Boolean isPermisoOrdenTipoGenero;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public TipoGeneroParameterReturnGeneral tipogeneroReturnGeneral;
	public TipoGeneroParameterReturnGeneral tipogeneroParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public CargaFamiliar_NMLogic cargafamiliar_nmLogic=null;

	public CargaFamiliar_NMLogic getCargaFamiliar_NMLogic() {
		return cargafamiliar_nmLogic;
	}

	public void setCargaFamiliar_NMLogic(CargaFamiliar_NMLogic cargafamiliar_nmLogic) {
		this.cargafamiliar_nmLogic = cargafamiliar_nmLogic;
	}


	public SubClienteLogic subclienteLogic=null;

	public SubClienteLogic getSubClienteLogic() {
		return subclienteLogic;
	}

	public void setSubClienteLogic(SubClienteLogic subclienteLogic) {
		this.subclienteLogic = subclienteLogic;
	}


	public EmpleadoLogic empleadoLogic=null;

	public EmpleadoLogic getEmpleadoLogic() {
		return empleadoLogic;
	}

	public void setEmpleadoLogic(EmpleadoLogic empleadoLogic) {
		this.empleadoLogic = empleadoLogic;
	}


	public ParametroCarteraDefectoLogic parametrocarteradefectoLogic=null;

	public ParametroCarteraDefectoLogic getParametroCarteraDefectoLogic() {
		return parametrocarteradefectoLogic;
	}

	public void setParametroCarteraDefectoLogic(ParametroCarteraDefectoLogic parametrocarteradefectoLogic) {
		this.parametrocarteradefectoLogic = parametrocarteradefectoLogic;
	}


	public CargaFamiliarLogic cargafamiliarLogic=null;

	public CargaFamiliarLogic getCargaFamiliarLogic() {
		return cargafamiliarLogic;
	}

	public void setCargaFamiliarLogic(CargaFamiliarLogic cargafamiliarLogic) {
		this.cargafamiliarLogic = cargafamiliarLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoGenero=false;
	public Boolean esParaAccionDesdeFormularioTipoGenero=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoGeneroLogic tipogeneroLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoGenero tipogeneroBean;
	public TipoGeneroConstantesFunciones tipogeneroConstantesFunciones;
	//public TipoGeneroParameterReturnGeneral tipogeneroReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoGenero> tipogeneros;	
	//public List<TipoGenero> tipogenerosEliminados;
	//public List<TipoGenero> tipogenerosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoGenero=false;
	public Boolean isVisibilidadCeldaDuplicarTipoGenero=true;
	public Boolean isVisibilidadCeldaCopiarTipoGenero=true;
	public Boolean isVisibilidadCeldaVerFormTipoGenero=true;
	public Boolean isVisibilidadCeldaOrdenTipoGenero=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoGenero=false;
	public Boolean isVisibilidadCeldaModificarTipoGenero=false;
	public Boolean isVisibilidadCeldaActualizarTipoGenero=false;
	public Boolean isVisibilidadCeldaEliminarTipoGenero=false;
	public Boolean isVisibilidadCeldaCancelarTipoGenero=false;
	public Boolean isVisibilidadCeldaGuardarTipoGenero=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoGenero=false;	
	
	
	
	public Long getiIdNuevoTipoGenero() {
		return this.iIdNuevoTipoGenero;
	}

	public void setiIdNuevoTipoGenero(Long iIdNuevoTipoGenero) {
		this.iIdNuevoTipoGenero = iIdNuevoTipoGenero;
	}
	
	public Long getidTipoGeneroActual() {
		return this.idTipoGeneroActual;
	}

	public void setidTipoGeneroActual(Long idTipoGeneroActual) {
		this.idTipoGeneroActual = idTipoGeneroActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoGenero gettipogenero() {
		return this.tipogenero;
	}

	public void settipogenero(TipoGenero tipogenero) {
		this.tipogenero = tipogenero;
	}
	
	public TipoGenero gettipogeneroAux() {
		return this.tipogeneroAux;
	}

	public void settipogeneroAux(TipoGenero tipogeneroAux) {
		this.tipogeneroAux = tipogeneroAux;
	}				
	
	public TipoGenero gettipogeneroAnterior() {
		return this.tipogeneroAnterior;
	}

	public void settipogeneroAnterior(TipoGenero tipogeneroAnterior) {
		this.tipogeneroAnterior = tipogeneroAnterior;
	}	
	
	public TipoGenero gettipogeneroTotales() {
		return this.tipogeneroTotales;
	}

	public void settipogeneroTotales(TipoGenero tipogeneroTotales) {
		this.tipogeneroTotales = tipogeneroTotales;
	}	
	
	public TipoGenero gettipogeneroBean() {
		return this.tipogeneroBean;
	}

	public void settipogeneroBean(TipoGenero tipogeneroBean) {
		this.tipogeneroBean = tipogeneroBean;
	}	
	
	public TipoGeneroParameterReturnGeneral gettipogeneroReturnGeneral() {
		return this.tipogeneroReturnGeneral;
	}

	public void settipogeneroReturnGeneral(TipoGeneroParameterReturnGeneral tipogeneroReturnGeneral) {
		this.tipogeneroReturnGeneral = tipogeneroReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoGeneroLogic getTipoGeneroLogic()	{		
		return tipogeneroLogic;
	}

	public void setTipoGeneroLogic(TipoGeneroLogic tipogeneroLogic) {
		this.tipogeneroLogic = tipogeneroLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoTipoGenero() {
		return isEsNuevoTipoGenero;
	}

	public void setIsEsNuevoTipoGenero(Boolean isEsNuevoTipoGenero) {
		this.isEsNuevoTipoGenero = isEsNuevoTipoGenero;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoGenero() {
		return esParaAccionDesdeFormularioTipoGenero;
	}
	
	public void setEsParaAccionDesdeFormularioTipoGenero(Boolean esParaAccionDesdeFormularioTipoGenero) {
		this.esParaAccionDesdeFormularioTipoGenero = esParaAccionDesdeFormularioTipoGenero;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoGenero() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoGeneroConstantesFunciones.refrescarForeignKeysDescripcionesTipoGenero(this.tipogeneroLogic.getTipoGeneros());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoGeneroConstantesFunciones.refrescarForeignKeysDescripcionesTipoGenero(this.tipogeneros);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipogeneroLogic.setTipoGeneros(this.tipogeneros);
			tipogeneroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public TipoGeneroParameterReturnGeneral getTipoGeneroParameterGeneral() {
		return this.tipogeneroParameterGeneral;
	}
	
	public void setTipoGeneroParameterGeneral(TipoGeneroParameterReturnGeneral tipogeneroParameterGeneral) {
		this.tipogeneroParameterGeneral = tipogeneroParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoTipoGenero() {
		return isPermisoTodoTipoGenero;
	}

	public void setIsPermisoTodoTipoGenero(Boolean isPermisoTodoTipoGenero) {
		this.isPermisoTodoTipoGenero = isPermisoTodoTipoGenero;
	}

	public Boolean getIsPermisoNuevoTipoGenero() {
		return isPermisoNuevoTipoGenero;
	}

	public void setIsPermisoNuevoTipoGenero(Boolean isPermisoNuevoTipoGenero) {
		this.isPermisoNuevoTipoGenero = isPermisoNuevoTipoGenero;
	}

	public Boolean getIsPermisoActualizarTipoGenero() {
		return isPermisoActualizarTipoGenero;
	}

	public void setIsPermisoActualizarTipoGenero(Boolean isPermisoActualizarTipoGenero) {
		this.isPermisoActualizarTipoGenero = isPermisoActualizarTipoGenero;
	}

	public Boolean getIsPermisoEliminarTipoGenero() {
		return isPermisoEliminarTipoGenero;
	}

	public void setIsPermisoEliminarTipoGenero(Boolean isPermisoEliminarTipoGenero) {
		this.isPermisoEliminarTipoGenero = isPermisoEliminarTipoGenero;
	}

	public Boolean getIsPermisoGuardarCambiosTipoGenero() {
		return isPermisoGuardarCambiosTipoGenero;
	}

	public void setIsPermisoGuardarCambiosTipoGenero(Boolean isPermisoGuardarCambiosTipoGenero) {
		this.isPermisoGuardarCambiosTipoGenero = isPermisoGuardarCambiosTipoGenero;
	}
	
	public Boolean getIsPermisoConsultaTipoGenero() {
		return isPermisoConsultaTipoGenero;
	}

	public void setIsPermisoConsultaTipoGenero(Boolean isPermisoConsultaTipoGenero) {
		this.isPermisoConsultaTipoGenero = isPermisoConsultaTipoGenero;
	}

	public Boolean getIsPermisoBusquedaTipoGenero() {
		return isPermisoBusquedaTipoGenero;
	}

	public void setIsPermisoBusquedaTipoGenero(Boolean isPermisoBusquedaTipoGenero) {
		this.isPermisoBusquedaTipoGenero = isPermisoBusquedaTipoGenero;
	}

	public Boolean getIsPermisoReporteTipoGenero() {
		return isPermisoReporteTipoGenero;
	}

	public void setIsPermisoReporteTipoGenero(Boolean isPermisoReporteTipoGenero) {
		this.isPermisoReporteTipoGenero = isPermisoReporteTipoGenero;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoGenero() {
		return isPermisoPaginacionMedioTipoGenero;
	}

	public void setIsPermisoPaginacionMedioTipoGenero(Boolean isPermisoPaginacionMedioTipoGenero) {
		this.isPermisoPaginacionMedioTipoGenero = isPermisoPaginacionMedioTipoGenero;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoGenero() {
		return isPermisoPaginacionTodoTipoGenero;
	}

	public void setIsPermisoPaginacionTodoTipoGenero(Boolean isPermisoPaginacionTodoTipoGenero) {
		this.isPermisoPaginacionTodoTipoGenero = isPermisoPaginacionTodoTipoGenero;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoGenero() {
		return isPermisoPaginacionAltoTipoGenero;
	}

	public void setIsPermisoPaginacionAltoTipoGenero(Boolean isPermisoPaginacionAltoTipoGenero) {
		this.isPermisoPaginacionAltoTipoGenero = isPermisoPaginacionAltoTipoGenero;
	}
	
	public Boolean getIsPermisoCopiarTipoGenero() {
		return isPermisoCopiarTipoGenero;
	}

	public void setIsPermisoCopiarTipoGenero(Boolean isPermisoCopiarTipoGenero) {
		this.isPermisoCopiarTipoGenero = isPermisoCopiarTipoGenero;
	}
	
	public Boolean getIsPermisoVerFormTipoGenero() {
		return isPermisoVerFormTipoGenero;
	}

	public void setIsPermisoVerFormTipoGenero(Boolean isPermisoVerFormTipoGenero) {
		this.isPermisoVerFormTipoGenero = isPermisoVerFormTipoGenero;
	}
	
	public Boolean getIsPermisoDuplicarTipoGenero() {
		return isPermisoDuplicarTipoGenero;
	}

	public void setIsPermisoDuplicarTipoGenero(Boolean isPermisoDuplicarTipoGenero) {
		this.isPermisoDuplicarTipoGenero = isPermisoDuplicarTipoGenero;
	}
	
	public Boolean getIsPermisoOrdenTipoGenero() {
		return isPermisoOrdenTipoGenero;
	}

	public void setIsPermisoOrdenTipoGenero(Boolean isPermisoOrdenTipoGenero) {
		this.isPermisoOrdenTipoGenero = isPermisoOrdenTipoGenero;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoTipoGenero() {
		return isVisibilidadCeldaNuevoTipoGenero;
	}

	public void setIsVisibilidadCeldaNuevoTipoGenero(Boolean isVisibilidadCeldaNuevoTipoGenero) {
		this.isVisibilidadCeldaNuevoTipoGenero = isVisibilidadCeldaNuevoTipoGenero;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoGenero() {
		return isVisibilidadCeldaDuplicarTipoGenero;
	}

	public void setIsVisibilidadCeldaDuplicarTipoGenero(Boolean isVisibilidadCeldaDuplicarTipoGenero) {
		this.isVisibilidadCeldaDuplicarTipoGenero = isVisibilidadCeldaDuplicarTipoGenero;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoGenero() {
		return isVisibilidadCeldaCopiarTipoGenero;
	}

	public void setIsVisibilidadCeldaCopiarTipoGenero(Boolean isVisibilidadCeldaCopiarTipoGenero) {
		this.isVisibilidadCeldaCopiarTipoGenero = isVisibilidadCeldaCopiarTipoGenero;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoGenero() {
		return isVisibilidadCeldaVerFormTipoGenero;
	}

	public void setIsVisibilidadCeldaVerFormTipoGenero(Boolean isVisibilidadCeldaVerFormTipoGenero) {
		this.isVisibilidadCeldaVerFormTipoGenero = isVisibilidadCeldaVerFormTipoGenero;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoGenero() {
		return isVisibilidadCeldaOrdenTipoGenero;
	}

	public void setIsVisibilidadCeldaOrdenTipoGenero(Boolean isVisibilidadCeldaOrdenTipoGenero) {
		this.isVisibilidadCeldaOrdenTipoGenero = isVisibilidadCeldaOrdenTipoGenero;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoGenero() {
		return isVisibilidadCeldaNuevoRelacionesTipoGenero;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoGenero(Boolean isVisibilidadCeldaNuevoRelacionesTipoGenero) {
		this.isVisibilidadCeldaNuevoRelacionesTipoGenero = isVisibilidadCeldaNuevoRelacionesTipoGenero;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoGenero() {
		return isVisibilidadCeldaModificarTipoGenero;
	}

	public void setIsVisibilidadCeldaModificarTipoGenero(Boolean isVisibilidadCeldaModificarTipoGenero) {
		this.isVisibilidadCeldaModificarTipoGenero = isVisibilidadCeldaModificarTipoGenero;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoGenero() {
		return isVisibilidadCeldaActualizarTipoGenero;
	}

	public void setIsVisibilidadCeldaActualizarTipoGenero(Boolean isVisibilidadCeldaActualizarTipoGenero) {
		this.isVisibilidadCeldaActualizarTipoGenero = isVisibilidadCeldaActualizarTipoGenero;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoGenero() {
		return isVisibilidadCeldaEliminarTipoGenero;
	}

	public void setIsVisibilidadCeldaEliminarTipoGenero(Boolean isVisibilidadCeldaEliminarTipoGenero) {
		this.isVisibilidadCeldaEliminarTipoGenero = isVisibilidadCeldaEliminarTipoGenero;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoGenero() {
		return isVisibilidadCeldaCancelarTipoGenero;
	}

	public void setIsVisibilidadCeldaCancelarTipoGenero(Boolean isVisibilidadCeldaCancelarTipoGenero) {
		this.isVisibilidadCeldaCancelarTipoGenero = isVisibilidadCeldaCancelarTipoGenero;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoGenero() {
		return isVisibilidadCeldaGuardarTipoGenero;
	}

	public void setIsVisibilidadCeldaGuardarTipoGenero(Boolean isVisibilidadCeldaGuardarTipoGenero) {
		this.isVisibilidadCeldaGuardarTipoGenero = isVisibilidadCeldaGuardarTipoGenero;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoGenero() {
		return isVisibilidadCeldaGuardarCambiosTipoGenero;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoGenero(Boolean isVisibilidadCeldaGuardarCambiosTipoGenero) {
		this.isVisibilidadCeldaGuardarCambiosTipoGenero = isVisibilidadCeldaGuardarCambiosTipoGenero;
	}
		
	public TipoGeneroSessionBean gettipogeneroSessionBean() {
		return this.tipogeneroSessionBean;
	}
	
	public void settipogeneroSessionBean(TipoGeneroSessionBean tipogeneroSessionBean) {
		this.tipogeneroSessionBean=tipogeneroSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoGenero(TipoGenero tipogenero)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(TipoGenero tipogenero,TipoGenero tipogeneroAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoGenero(tipogenero);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipogeneroAux.setId(tipogenero.getId());
		tipogeneroAux.setVersionRow(tipogenero.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoGenero();
		
			int intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoGeneroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipogeneroValidator.getInvalidValues(this.tipogenero);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipogeneroLogic.setDatosCliente(datosCliente);
			tipogeneroLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipogeneroAux=new  TipoGenero();
				
				tipogeneroAux.setIsNew(true);
				tipogeneroAux.setIsChanged(true);
				
				tipogeneroAux.setTipoGeneroOriginal(this.tipogenero);
				
				tipogeneroAux.setId(this.tipogenero.getId());	
				tipogeneroAux.setVersionRow(this.tipogenero.getVersionRow());	
				tipogeneroAux.setcodigo(this.tipogenero.getcodigo());	
				tipogeneroAux.setnombre(this.tipogenero.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogeneroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogeneroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipogeneroAux,tipogeneroLogic.getTipoGeneros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogeneroAux,tipogeneros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipogeneroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogeneroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogeneroLogic.saveTipoGeneros();//WithConnection
						//tipogeneroLogic.getSetVersionRowTipoGeneros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogenero,tipogeneroAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogeneroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipogeneroAux=new  TipoGenero();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipogeneroSessionBean.getEsGuardarRelacionado() 
					|| (this.tipogeneroSessionBean.getEsGuardarRelacionado() && this.tipogenero.getId()>=0)) {
						
					tipogeneroAux.setIsNew(false);
				}
				
				tipogeneroAux.setIsDeleted(false);
			
				tipogeneroAux.setId(this.tipogenero.getId());	
				tipogeneroAux.setVersionRow(this.tipogenero.getVersionRow());	
				tipogeneroAux.setcodigo(this.tipogenero.getcodigo());	
				tipogeneroAux.setnombre(this.tipogenero.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogeneroAux,tipogeneroLogic.getTipoGeneros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogeneroAux,tipogeneros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipogeneroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogeneroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogeneroLogic.saveTipoGeneros();//WithConnection
						//tipogeneroLogic.getSetVersionRowTipoGeneros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogenero,tipogeneroAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogeneroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipogeneroAux=new  TipoGenero();
				
				tipogeneroAux.setIsNew(false);
				tipogeneroAux.setIsChanged(false);
				
				tipogeneroAux.setIsDeleted(true);
				
				tipogeneroAux.setId(this.tipogenero.getId());	
				tipogeneroAux.setVersionRow(this.tipogenero.getVersionRow());	
				tipogeneroAux.setcodigo(this.tipogenero.getcodigo());	
				tipogeneroAux.setnombre(this.tipogenero.getnombre());	
				
				if(this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipogeneroAux.getId()>=0) {	
						this.tipogenerosEliminados.add(tipogeneroAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipogeneroAux,tipogeneroLogic.getTipoGeneros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogeneroAux,tipogeneros);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipogeneroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogeneroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogeneroLogic.saveTipoGeneros();//WithConnection
						//tipogeneroLogic.getSetVersionRowTipoGeneros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogeneroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogeneroAux.setClientes(this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogeneroAux.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());

							if(this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogeneroAux.setSubClientes(this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());

							if(this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogeneroAux.setEmpleados(this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogeneroAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());

							if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogeneroAux.setCargaFamiliars(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipogeneroSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipogeneroSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipogeneroAux,tipogeneroLogic.getTipoGeneros());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipogeneroAux,tipogeneros);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.getTipoGeneros().addAll(this.tipogenerosEliminados);
					
					tipogeneroLogic.saveTipoGeneros();//WithConnection
					//tipogeneroLogic.getSetVersionRowTipoGeneros();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipogenerosEliminados= new ArrayList<TipoGenero>();		
			}
			
			if(this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Genero GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Genero",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipogenero=tipogeneroAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessTipoGenero();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoGenero tipogeneroLocal) throws Exception {
		
		if(this.tipogeneroSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipogeneroLocal.setClientes(this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				tipogeneroLocal.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				tipogeneroLocal.setSubClientes(this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());
				tipogeneroLocal.setEmpleados(this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
				tipogeneroLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
				tipogeneroLocal.setCargaFamiliars(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
			
			} else {
			
				tipogeneroLocal.setClientes(this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.clientes);
				tipogeneroLocal.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms);
				tipogeneroLocal.setSubClientes(this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.subclientes);
				tipogeneroLocal.setEmpleados(this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.empleados);
				tipogeneroLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos);
				tipogeneroLocal.setCargaFamiliars(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.cargafamiliars);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoGenero tipogeneroLocal) throws Exception {	
		if(this.tipogeneroSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoGeneroActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipogeneroValidator.getInvalidValues(this.tipogenero);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoGenero tipogenero,List<TipoGenero> tipogeneros) throws Exception {
		try	{		
			TipoGeneroConstantesFunciones.actualizarLista(tipogenero,tipogeneros,this.tipogeneroSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoGenero tipogenero,List<TipoGenero> tipogeneros) throws Exception {
		try	{			
			TipoGeneroConstantesFunciones.actualizarSelectedLista(tipogenero,tipogeneros);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoGenero> tipogenerosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipogenerosLocal=this.tipogeneroLogic.getTipoGeneros();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipogenerosLocal=this.tipogeneros;
			}
			//ARCHITECTURE
		
			for(TipoGenero tipogeneroLocal:tipogenerosLocal) {
				if(this.permiteMantenimiento(tipogeneroLocal) && tipogeneroLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+TipoGeneroConstantesFunciones.getTipoGeneroLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoGeneroConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGenero.jLabelcodigoTipoGenero,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGeneroConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGenero.jLabelnombreTipoGenero,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGenero.jLabelcodigoTipoGenero,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGenero.jLabelnombreTipoGenero,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.tipogenero==null) {
				this.tipogenero= new TipoGenero();
			}

			if(this.tipogeneroSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGenero
				this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);

				this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.getcliente().setTipoGenero(this.tipogenero);
			}

			return;
		}
		 else  if(sTipo.equals("CargaFamiliar_NM")) {
			if(this.tipogenero==null) {
				this.tipogenero= new TipoGenero();
			}

			if(this.tipogeneroSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGenero
				this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);

				this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.getcargafamiliar_nm().setTipoGenero(this.tipogenero);
			}

			return;
		}
		 else  if(sTipo.equals("SubCliente")) {
			if(this.tipogenero==null) {
				this.tipogenero= new TipoGenero();
			}

			if(this.tipogeneroSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGenero
				this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);

				this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.getsubcliente().setTipoGenero(this.tipogenero);
			}

			return;
		}
		 else  if(sTipo.equals("Empleado")) {
			if(this.tipogenero==null) {
				this.tipogenero= new TipoGenero();
			}

			if(this.tipogeneroSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGenero
				this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);

				this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.getempleado().setTipoGenero(this.tipogenero);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroCarteraDefecto")) {
			if(this.tipogenero==null) {
				this.tipogenero= new TipoGenero();
			}

			if(this.tipogeneroSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGenero
				this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);

				this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.getparametrocarteradefecto().setTipoGenero(this.tipogenero);
			}

			return;
		}
		 else  if(sTipo.equals("CargaFamiliar")) {
			if(this.tipogenero==null) {
				this.tipogenero= new TipoGenero();
			}

			if(this.tipogeneroSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGenero
				this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);

				this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.getcargafamiliar().setTipoGenero(this.tipogenero);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoGenero--;	
		
		
		this.tipogeneroAux=new TipoGenero();
		
		this.tipogeneroAux.setId(this.iIdNuevoTipoGenero);
		this.tipogeneroAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogeneroLogic.getTipoGeneros().add(this.tipogeneroAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipogeneros.add(this.tipogeneroAux);
		}
		//ARCHITECTURE
		
		this.tipogenero=this.tipogeneroAux;
		
		if(TipoGeneroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoGenero(this.tipogenero);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGenero(this.tipogenero);
		}
				
		//this.setDefaultControlesTipoGenero();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoGenero();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoGenero();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGenero();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGenero(this.tipogeneroBean,this.tipogenero,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoGeneroConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipogeneroSessionBean.getConGuardarRelaciones()) {
			classes=TipoGeneroConstantesFunciones.getClassesRelationshipsOfTipoGenero(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipogeneroReturnGeneral=tipogeneroLogic.procesarEventosTipoGenerosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogeneroLogic.getTipoGeneros(),this.tipogenero,this.tipogeneroParameterGeneral,this.isEsNuevoTipoGenero,classes);//this.tipogeneroLogic.getTipoGenero()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoGenero(this.tipogeneroReturnGeneral,this.tipogeneroBean,false);
		
		if(this.tipogeneroReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGenero(this.tipogeneroReturnGeneral.getTipoGenero());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoGenero(this.tipogeneroReturnGeneral.getTipoGenero());
		}
		
		if(this.tipogeneroReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoGenero(this.tipogeneroReturnGeneral.getTipoGenero(),classes);//this.tipogeneroBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoGenero();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoGenero();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoGenero(false);
						
			if(tipogeneroSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() && CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargaFamiliar_NMActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado() && SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.getEsGuardarRelacionado() && CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargaFamiliarActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoGeneroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGenero();
			}
			
			this.actualizarVisualTableDatosTipoGenero();
			
			this.jTableDatosTipoGenero.setRowSelectionInterval(this.getIndiceNuevoTipoGenero(), this.getIndiceNuevoTipoGenero());
			
			this.seleccionarFilaTablaTipoGeneroActual();
						
			this.actualizarEstadoCeldasBotonesTipoGenero("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoGenero(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoGenero.jTextFieldcodigoTipoGenero.setEnabled(isHabilitar && this.tipogeneroConstantesFunciones.activarcodigoTipoGenero);
		this.jInternalFrameDetalleFormTipoGenero.jTextAreanombreTipoGenero.setEnabled(isHabilitar && this.tipogeneroConstantesFunciones.activarnombreTipoGenero);	
		
	};
	
	public void setDefaultControlesTipoGenero() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoGenero(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipogeneroSessionBean.setConGuardarRelaciones(true);			
			this.tipogeneroSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipogeneroSessionBean.setConGuardarRelaciones(false);			
			this.tipogeneroSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoGenero() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGenero tipogeneroAux:this.tipogeneroLogic.getTipoGeneros()) {
				if(tipogeneroAux.getId().equals(this.iIdNuevoTipoGenero)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGenero tipogeneroAux:this.tipogeneros) {
				if(tipogeneroAux.getId().equals(this.iIdNuevoTipoGenero)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualTipoGenero(TipoGenero tipogenero,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGenero tipogeneroAux:this.tipogeneroLogic.getTipoGeneros()) {
				if(tipogeneroAux.getId().equals(tipogenero.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGenero tipogeneroAux:this.tipogeneros) {
				if(tipogeneroAux.getId().equals(tipogenero.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalTipoGenero(TipoGenero tipogeneroOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGenero tipogeneroAux:this.tipogeneroLogic.getTipoGeneros()) {
				if(tipogeneroAux.getTipoGeneroOriginal().getId().equals(tipogeneroOriginal.getId())) {
					existe=true;
					tipogeneroOriginal.setId(tipogeneroAux.getId());
					tipogeneroOriginal.setVersionRow(tipogeneroAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGenero tipogeneroAux:this.tipogeneros) {
				if(tipogeneroAux.getTipoGeneroOriginal().getId().equals(tipogeneroOriginal.getId())) {
					existe=true;
					tipogeneroOriginal.setId(tipogeneroAux.getId());
					tipogeneroOriginal.setVersionRow(tipogeneroAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoGenero(Boolean esParaCancelar) throws Exception {
		tipogenerosAux=new ArrayList<TipoGenero>();
		tipogeneroAux=new TipoGenero();
		
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGenero tipogeneroAux:this.tipogeneroLogic.getTipoGeneros()) {
					if(tipogeneroAux.getId()<0) {
						tipogenerosAux.add(tipogeneroAux);
					}		
				}
				this.iIdNuevoTipoGenero=0L;
				this.tipogeneroLogic.getTipoGeneros().removeAll(tipogenerosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGenero tipogeneroAux:this.tipogeneros) {
					if(tipogeneroAux.getId()<0) {
						tipogenerosAux.add(tipogeneroAux);
					}		
				}
				this.iIdNuevoTipoGenero=0L;
				this.tipogeneros.removeAll(tipogenerosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoGenero 
					&& this.tipogeneroLogic.getTipoGeneros().size()>0
					) {
					tipogeneroAux=this.tipogeneroLogic.getTipoGeneros().get(this.tipogeneroLogic.getTipoGeneros().size() - 1);
				
					if(tipogeneroAux.getId()<0) {
						this.tipogeneroLogic.getTipoGeneros().remove(tipogeneroAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoGenero && this.tipogeneros.size()>0) {
					tipogeneroAux=this.tipogeneros.get(this.tipogeneros.size() - 1);
				
					if(tipogeneroAux.getId()<0) {
						this.tipogeneros.remove(tipogeneroAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoGenero(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipogenero.getId()<0) {
				this.tipogeneroLogic.getTipoGeneros().remove(this.tipogenero);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipogenero.getId()<0) {
				this.tipogeneros.remove(this.tipogenero);
			}
		}			
	}
	
	public void setEstadosInicialesTipoGenero(List<TipoGenero> tipogenerosAux) throws Exception {
		TipoGeneroConstantesFunciones.setEstadosInicialesTipoGenero(tipogenerosAux);
	}
	
	public void setEstadosInicialesTipoGenero(TipoGenero tipogeneroAux) throws Exception {
		TipoGeneroConstantesFunciones.setEstadosInicialesTipoGenero(tipogeneroAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoGeneroActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoGenero("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoGeneroActual()) {
				if(!this.isEsNuevoTipoGenero) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoGenero("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoGenero=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoGeneroActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Genero ?", "MANTENIMIENTO DE Tipo Genero", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoGenero("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoGenero tipogenero) throws Exception {
		TipoGeneroConstantesFunciones.seleccionarAsignar(this.tipogenero,tipogenero);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoGenero=this.isPermisoActualizarOriginalTipoGenero;
			
			
			this.seleccionarAsignar(tipogenero);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGeneroConstantesFunciones.quitarEspaciosTipoGenero(this.tipogenero,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoGenero("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipogeneroSessionBean.setsFuncionBusquedaRapida(this.tipogeneroSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoGenero) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoGenero(esParaCancelar);				
				this.cancelarNuevoTipoGenero(esParaCancelar);								
			}
			
			this.tipogenero=new TipoGenero();
			
			this.inicializarTipoGenero();
			
			this.actualizarEstadoCeldasBotonesTipoGenero("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoGenero() throws Exception {
		try {
			TipoGeneroConstantesFunciones.inicializarTipoGenero(this.tipogenero);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipogeneroLogic.getTipoGeneros().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoGeneros(String sAccionBusqueda,List<TipoGenero> tipogenerosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="TipoGenero"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoGeneroMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoGeneroMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoGenero"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Tipo Generoes");		
		parameters.put("busquedapor", TipoGeneroConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(CargaFamiliar_NM.class));
			classes.add(new Classe(SubCliente.class));
			classes.add(new Classe(Empleado.class));
			classes.add(new Classe(ParametroCarteraDefecto.class));
			classes.add(new Classe(CargaFamiliar.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoGeneroLogic tipogeneroLogicAuxiliar=new TipoGeneroLogic();
					tipogeneroLogicAuxiliar.setDatosCliente(tipogeneroLogic.getDatosCliente());				
					tipogeneroLogicAuxiliar.setTipoGeneros(tipogenerosParaReportes);
					
					tipogeneroLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoGeneroWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipogenerosParaReportes=tipogeneroLogicAuxiliar.getTipoGeneros();
					
					//tipogeneroLogic.getNewConnexionToDeep();
					
					//for (TipoGenero tipogenero:tipogenerosParaReportes) {
					//	tipogeneroLogic.deepLoad(tipogenero, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipogeneroLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipogeneroLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileCargaFamiliar_NM = AuxiliarReportes.class.getResourceAsStream("CargaFamiliar_NMDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cargafamiliar_nm", reportFileCargaFamiliar_NM);

			InputStream reportFileSubCliente = AuxiliarReportes.class.getResourceAsStream("SubClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_subcliente", reportFileSubCliente);

			InputStream reportFileEmpleado = AuxiliarReportes.class.getResourceAsStream("EmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleado", reportFileEmpleado);

			InputStream reportFileParametroCarteraDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroCarteraDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocarteradefecto", reportFileParametroCarteraDefecto);

			InputStream reportFileCargaFamiliar = AuxiliarReportes.class.getResourceAsStream("CargaFamiliarDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cargafamiliar", reportFileCargaFamiliar);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoGenero=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoGeneroConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoGeneroConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoGenero=new JRBeanArrayDataSource(TipoGeneroJInternalFrame.TraerTipoGeneroBeans(tipogenerosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoGenero);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoGeneroConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoGeneroConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoGeneroBean.TraerTipoGeneroBeans(tipogenerosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteTipoGeneros(sAccionBusqueda,sTipoArchivoReporte,tipogenerosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoGeneros(sAccionBusqueda,sTipoArchivoReporte,tipogenerosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoGeneroActionPerformed(null);
					//this.generarExcelReporteTipoGeneros(sAccionBusqueda,sTipoArchivoReporte,tipogenerosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoGeneros(sAccionBusqueda,sTipoArchivoReporte,tipogenerosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoGeneros(sAccionBusqueda,sTipoArchivoReporte,tipogenerosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoGeneros(sAccionBusqueda,sTipoArchivoReporte,tipogenerosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoGeneros(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGenero> tipogenerosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogenero";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGeneros");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGenero("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoGenero tipogenero : tipogenerosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoGeneroConstantesFunciones.generarExcelReporteDataTipoGenero("NORMAL",row,workbook,tipogenero,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Genero",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoGenero(String sTipo,Row row,Workbook workbook) {
		
		TipoGeneroConstantesFunciones.generarExcelReporteHeaderTipoGenero(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoGeneros(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGenero> tipogenerosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogenero_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGeneros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoGenero tipogenero : tipogenerosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoGeneroConstantesFunciones.getTipoGeneroDescripcion(tipogenero));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGeneroConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGeneroConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogenero.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGeneroConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGeneroConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogenero.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Genero",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoGeneros(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGenero> tipogenerosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoGenero> tipogenerosRespaldo=null;
		
		classes=TipoGeneroConstantesFunciones.getClassesRelationshipsOfTipoGenero(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipogeneroLogic.setDatosCliente(this.datosCliente);
		this.tipogeneroLogic.setDatosDeep(this.datosDeep);
		this.tipogeneroLogic.setIsConDeep(true);
		
		tipogenerosRespaldo=this.tipogeneroLogic.getTipoGeneros();
		
		this.tipogeneroLogic.setTipoGeneros(tipogenerosParaReportes);	
		this.tipogeneroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipogenerosParaReportes=this.tipogeneroLogic.getTipoGeneros();
		this.tipogeneroLogic.setTipoGeneros(tipogenerosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogenero_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGeneros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGenero("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoGenero tipogenero : tipogenerosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoGenero("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoGeneroConstantesFunciones.generarExcelReporteDataTipoGenero("NORMAL",row,workbook,tipogenero,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogenero.getClientes()!=null && tipogenero.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(tipogenero.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : tipogenero.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CargaFamiliar_NM
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogenero.getCargaFamiliar_NMs()!=null && tipogenero.getCargaFamiliar_NMs().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CargaFamiliar_NMConstantesFunciones.generarExcelReporteHeaderCargaFamiliar_NM("RELACIONADO",row,workbook);
				}

				if(tipogenero.getCargaFamiliar_NMs()!=null) {
					i2=0;
					for(CargaFamiliar_NM cargafamiliar_nm : tipogenero.getCargaFamiliar_NMs()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CargaFamiliar_NMConstantesFunciones.generarExcelReporteDataCargaFamiliar_NM("RELACIONADO",row,workbook,cargafamiliar_nm,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//SubCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SubClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogenero.getSubClientes()!=null && tipogenero.getSubClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SubClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SubClienteConstantesFunciones.generarExcelReporteHeaderSubCliente("RELACIONADO",row,workbook);
				}

				if(tipogenero.getSubClientes()!=null) {
					i2=0;
					for(SubCliente subcliente : tipogenero.getSubClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SubClienteConstantesFunciones.generarExcelReporteDataSubCliente("RELACIONADO",row,workbook,subcliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Empleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogenero.getEmpleados()!=null && tipogenero.getEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoConstantesFunciones.generarExcelReporteHeaderEmpleado("RELACIONADO",row,workbook);
				}

				if(tipogenero.getEmpleados()!=null) {
					i2=0;
					for(Empleado empleado : tipogenero.getEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoConstantesFunciones.generarExcelReporteDataEmpleado("RELACIONADO",row,workbook,empleado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroCarteraDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogenero.getParametroCarteraDefectos()!=null && tipogenero.getParametroCarteraDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroCarteraDefectoConstantesFunciones.generarExcelReporteHeaderParametroCarteraDefecto("RELACIONADO",row,workbook);
				}

				if(tipogenero.getParametroCarteraDefectos()!=null) {
					i2=0;
					for(ParametroCarteraDefecto parametrocarteradefecto : tipogenero.getParametroCarteraDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroCarteraDefectoConstantesFunciones.generarExcelReporteDataParametroCarteraDefecto("RELACIONADO",row,workbook,parametrocarteradefecto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CargaFamiliar
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogenero.getCargaFamiliars()!=null && tipogenero.getCargaFamiliars().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CargaFamiliarConstantesFunciones.generarExcelReporteHeaderCargaFamiliar("RELACIONADO",row,workbook);
				}

				if(tipogenero.getCargaFamiliars()!=null) {
					i2=0;
					for(CargaFamiliar cargafamiliar : tipogenero.getCargaFamiliars()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CargaFamiliarConstantesFunciones.generarExcelReporteDataCargaFamiliar("RELACIONADO",row,workbook,cargafamiliar,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoGeneroConstantesFunciones.getTipoGeneroDescripcion(tipogenero));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Genero",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGenero.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGenero.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGenero.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGenero.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoGenero() throws Exception {		
		this.startProcessTipoGenero(true);
	}
	
	public void startProcessTipoGenero(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoGenero, this.jScrollPanelDatosTipoGenero,this.jPanelPaginacionTipoGenero, this.jScrollPanelDatosEdicionTipoGenero, this.jPanelAccionesTipoGenero,this.jPanelAccionesFormularioTipoGenero,this.jmenuBarTipoGenero,this.jmenuBarDetalleTipoGenero,this.jTtoolBarTipoGenero,this.jTtoolBarDetalleTipoGenero);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGenero=null; 
		
		final JPanel jPanelParametrosReportesTipoGenero=this.jPanelParametrosReportesTipoGenero;
		//final JScrollPane jScrollPanelDatosTipoGenero=this.jScrollPanelDatosTipoGenero;
		final JTable jTableDatosTipoGenero=this.jTableDatosTipoGenero;		
		final JPanel jPanelPaginacionTipoGenero=this.jPanelPaginacionTipoGenero;
		//final JScrollPane jScrollPanelDatosEdicionTipoGenero=this.jScrollPanelDatosEdicionTipoGenero;
		final JPanel jPanelAccionesTipoGenero=this.jPanelAccionesTipoGenero;
		
		JPanel jPanelCamposAuxiliarTipoGenero=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoGenero=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) {
			jPanelCamposAuxiliarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jPanelCamposTipoGenero;
			jPanelAccionesFormularioAuxiliarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jPanelAccionesFormularioTipoGenero;
		}
		
		final JPanel jPanelCamposTipoGenero=jPanelCamposAuxiliarTipoGenero;
		final JPanel jPanelAccionesFormularioTipoGenero=jPanelAccionesFormularioAuxiliarTipoGenero;
		
		
		final JMenuBar jmenuBarTipoGenero=this.jmenuBarTipoGenero;
		final JToolBar jTtoolBarTipoGenero=this.jTtoolBarTipoGenero;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoGenero=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGenero=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) {
			jmenuBarDetalleAuxiliarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jmenuBarDetalleTipoGenero;
			jTtoolBarDetalleAuxiliarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jTtoolBarDetalleTipoGenero;
		}
		
		final JMenuBar jmenuBarDetalleTipoGenero=jmenuBarDetalleAuxiliarTipoGenero;
		final JToolBar jTtoolBarDetalleTipoGenero=jTtoolBarDetalleAuxiliarTipoGenero;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGenero;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGenero;
			processRunnable.jTableDatos=jTableDatosTipoGenero;
			processRunnable.jPanelCampos=jPanelCamposTipoGenero;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGenero;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGenero;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGenero;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGenero;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGenero;
			processRunnable.jTtoolBar=jTtoolBarTipoGenero;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGenero;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGenero ,jPanelParametrosReportesTipoGenero,jTableDatosTipoGenero, /*jScrollPanelDatosTipoGenero,*/jPanelCamposTipoGenero,jPanelPaginacionTipoGenero, /*jScrollPanelDatosEdicionTipoGenero,*/ jPanelAccionesTipoGenero,jPanelAccionesFormularioTipoGenero,jmenuBarTipoGenero,jmenuBarDetalleTipoGenero,jTtoolBarTipoGenero,jTtoolBarDetalleTipoGenero);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoGenero, jScrollPanelDatosTipoGenero,jPanelPaginacionTipoGenero, jScrollPanelDatosEdicionTipoGenero, jPanelAccionesTipoGenero,jPanelAccionesFormularioTipoGenero,jmenuBarTipoGenero,jmenuBarDetalleTipoGenero,jTtoolBarTipoGenero,jTtoolBarDetalleTipoGenero);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessTipoGenero() {// throws Exception 
		this.finishProcessTipoGenero(true);
	}
	
	public void finishProcessTipoGenero(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoGenero, this.jScrollPanelDatosTipoGenero,this.jPanelPaginacionTipoGenero, this.jScrollPanelDatosEdicionTipoGenero, this.jPanelAccionesTipoGenero,this.jPanelAccionesFormularioTipoGenero,this.jmenuBarTipoGenero,this.jmenuBarDetalleTipoGenero,this.jTtoolBarTipoGenero,this.jTtoolBarDetalleTipoGenero);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGenero=null; 
		
		final JPanel jPanelParametrosReportesTipoGenero=this.jPanelParametrosReportesTipoGenero;
		//final JScrollPane jScrollPanelDatosTipoGenero=this.jScrollPanelDatosTipoGenero;
		final JTable jTableDatosTipoGenero=this.jTableDatosTipoGenero;		
		final JPanel jPanelPaginacionTipoGenero=this.jPanelPaginacionTipoGenero;
		//final JScrollPane jScrollPanelDatosEdicionTipoGenero=this.jScrollPanelDatosEdicionTipoGenero;
		final JPanel jPanelAccionesTipoGenero=this.jPanelAccionesTipoGenero;
		
		JPanel jPanelCamposAuxiliarTipoGenero=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoGenero=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) {
			jPanelCamposAuxiliarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jPanelCamposTipoGenero;
			jPanelAccionesFormularioAuxiliarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jPanelAccionesFormularioTipoGenero;
		}
		
		final JPanel jPanelCamposTipoGenero=jPanelCamposAuxiliarTipoGenero;
		final JPanel jPanelAccionesFormularioTipoGenero=jPanelAccionesFormularioAuxiliarTipoGenero;
		
		
		final JMenuBar jmenuBarTipoGenero=this.jmenuBarTipoGenero;		
		final JToolBar jTtoolBarTipoGenero=this.jTtoolBarTipoGenero;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoGenero=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGenero=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) {
			jmenuBarDetalleAuxiliarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jmenuBarDetalleTipoGenero;
			jTtoolBarDetalleAuxiliarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jTtoolBarDetalleTipoGenero;		
		}
		
		final JMenuBar jmenuBarDetalleTipoGenero=jmenuBarDetalleAuxiliarTipoGenero;
		final JToolBar jTtoolBarDetalleTipoGenero=jTtoolBarDetalleAuxiliarTipoGenero;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGenero;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGenero;
			processRunnable.jTableDatos=jTableDatosTipoGenero;
			processRunnable.jPanelCampos=jPanelCamposTipoGenero;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGenero;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGenero;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGenero;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGenero;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGenero;
			processRunnable.jTtoolBar=jTtoolBarTipoGenero;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGenero;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoGenero ,jPanelParametrosReportesTipoGenero, jTableDatosTipoGenero,/*jScrollPanelDatosTipoGenero,*/jPanelCamposTipoGenero,jPanelPaginacionTipoGenero, /*jScrollPanelDatosEdicionTipoGenero,*/ jPanelAccionesTipoGenero,jPanelAccionesFormularioTipoGenero,jmenuBarTipoGenero,jmenuBarDetalleTipoGenero,jTtoolBarTipoGenero,jTtoolBarDetalleTipoGenero));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoGenero(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoGenero(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoGenero(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoGenero(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoGenero,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoGenero,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoGenero(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoGenero,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoGenero,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipogeneroConstantesFunciones.getsFinalQueryTipoGenero();
		String  finalQueryPaginacionTodos=this.tipogeneroConstantesFunciones.getsFinalQueryTipoGenero();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=TipoGeneroConstantesFunciones.getArrayColumnasGlobalesNoTipoGenero(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoGeneroConstantesFunciones.getArrayColumnasGlobalesTipoGenero(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoGeneroConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipogenerosEliminados= new ArrayList<TipoGenero>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoGenero();
		
				///*TipoGeneroSessionBean*/this.tipogeneroSessionBean=new TipoGeneroSessionBean();
			
			if(this.tipogeneroSessionBean==null) {
				this.tipogeneroSessionBean=new TipoGeneroSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=TipoGeneroConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoGeneroConstantesFunciones.getClassesForeignKeysOfTipoGenero(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipogenero."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipogenerosAux= new ArrayList<TipoGenero>();
			
				
			tipogeneroLogic.setDatosCliente(this.datosCliente);
			tipogeneroLogic.setDatosDeep(this.datosDeep);
			tipogeneroLogic.setIsConDeep(true);
			
			
			tipogeneroLogic.getTipoGeneroDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipogeneroLogic.getTodosTipoGeneros(finalQueryGlobal,pagination);
					
					//tipogeneroLogic.getTodosTipoGenerosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipogeneroLogic.getTipoGeneros()==null|| tipogeneroLogic.getTipoGeneros().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogenerosAux= new ArrayList<TipoGenero>();
							tipogenerosAux.addAll(tipogeneroLogic.getTipoGeneros());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogenerosAux= new ArrayList<TipoGenero>();
							tipogenerosAux.addAll(tipogeneros);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogeneroLogic.getTodosTipoGeneros(finalQueryGlobal+"",this.pagination);												
							
							//tipogeneroLogic.getTodosTipoGenerosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoGeneros("Todos",tipogeneroLogic.getTipoGeneros() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogeneroLogic.setTipoGeneros(new ArrayList<TipoGenero>());					
							tipogeneroLogic.getTipoGeneros().addAll(tipogenerosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogeneros=new ArrayList<TipoGenero>();
							tipogeneros.addAll(tipogenerosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoGenero=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoGenero=this.idActual;
				
				} else if(this.idTipoGeneroActual!=null && this.idTipoGeneroActual!=0L) {
					idTipoGenero=idTipoGeneroActual;
				}
				
					
				this.sDetalleReporte=TipoGeneroConstantesFunciones.getDetalleIndicePorId(idTipoGenero);
				
				this.tipogeneros=new ArrayList<TipoGenero>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipogeneroLogic.getEntity(idTipoGenero);
					
					//tipogeneroLogic.getEntityWithConnection(idTipoGenero);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogeneroLogic.setTipoGeneros(new ArrayList<TipoGenero>());
					tipogeneroLogic.getTipoGeneros().add(tipogeneroLogic.getTipoGenero());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogeneros=new ArrayList<TipoGenero>();
					this.tipogeneros.add(tipogenero);
				}
				
				if(tipogeneroLogic.getTipoGenero()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoGenero();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoGenero();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogeneroLogic.getTipoGeneros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogeneros.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogeneroLogic.getTipoGeneros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogeneros.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoGenero tipogenero) {
		Boolean permite=true;
		
		if(this.tipogenero.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoGeneroConstantesFunciones.getOrderByListaTipoGenero();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoGeneroConstantesFunciones.getOrderByListaTipoGenero();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGenero tipogenero:tipogeneroLogic.getTipoGeneros()) {
				if(tipogenero.getsType().equals(Constantes2.S_TOTALES)) {
					tipogeneroTotales=tipogenero;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGenero tipogenero:this.tipogeneros) {
				if(tipogenero.getsType().equals(Constantes2.S_TOTALES)) {
					tipogeneroTotales=tipogenero;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.tipogeneroAux=new TipoGenero();
			this.tipogeneroAux.setsType(Constantes2.S_TOTALES);
			this.tipogeneroAux.setIsNew(false);
			this.tipogeneroAux.setIsChanged(false);
			this.tipogeneroAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoGeneroConstantesFunciones.TotalizarValoresFilaTipoGenero(this.tipogeneroLogic.getTipoGeneros(),this.tipogeneroAux);
				
				this.tipogeneroLogic.getTipoGeneros().add(this.tipogeneroAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoGeneroConstantesFunciones.TotalizarValoresFilaTipoGenero(this.tipogeneros,this.tipogeneroAux);
				
				this.tipogeneros.add(this.tipogeneroAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipogeneroTotales=new TipoGenero();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogeneroLogic.getTipoGeneros().remove(tipogeneroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogeneros.remove(tipogeneroTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipogeneroTotales=new TipoGenero();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGenero tipogenero:tipogeneroLogic.getTipoGeneros()) {
				if(tipogenero.getsType().equals(Constantes2.S_TOTALES)) {
					tipogeneroTotales=tipogenero;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGeneroConstantesFunciones.TotalizarValoresFilaTipoGenero(this.tipogeneroLogic.getTipoGeneros(),tipogeneroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGenero tipogenero:this.tipogeneros) {
				if(tipogenero.getsType().equals(Constantes2.S_TOTALES)) {
					tipogeneroTotales=tipogenero;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGeneroConstantesFunciones.TotalizarValoresFilaTipoGenero(this.tipogeneros,tipogeneroTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	
	
	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosTipoGenero() {
		this.isPermisoTodoTipoGenero=false;
		this.isPermisoNuevoTipoGenero=false;
		this.isPermisoActualizarTipoGenero=false;
		this.isPermisoActualizarOriginalTipoGenero=false;
		this.isPermisoEliminarTipoGenero=false;
		this.isPermisoGuardarCambiosTipoGenero=false;
		this.isPermisoConsultaTipoGenero=false;
		this.isPermisoBusquedaTipoGenero=false;
		this.isPermisoReporteTipoGenero=false;		
		this.isPermisoOrdenTipoGenero=false;		
		this.isPermisoPaginacionMedioTipoGenero=false;		
		this.isPermisoPaginacionAltoTipoGenero=false;
		this.isPermisoPaginacionTodoTipoGenero=false;
		this.isPermisoCopiarTipoGenero=false;		
		this.isPermisoVerFormTipoGenero=false;		
		this.isPermisoDuplicarTipoGenero=false;		
		this.isPermisoOrdenTipoGenero=false;		
	}
	
	public void setPermisosUsuarioTipoGenero(Boolean isPermiso) {
		this.isPermisoTodoTipoGenero=isPermiso;
		this.isPermisoNuevoTipoGenero=isPermiso;
		this.isPermisoActualizarTipoGenero=isPermiso;
		this.isPermisoActualizarOriginalTipoGenero=isPermiso;
		this.isPermisoEliminarTipoGenero=isPermiso;
		this.isPermisoGuardarCambiosTipoGenero=isPermiso;
		this.isPermisoConsultaTipoGenero=isPermiso;
		this.isPermisoBusquedaTipoGenero=isPermiso;
		this.isPermisoReporteTipoGenero=isPermiso;
		this.isPermisoOrdenTipoGenero=isPermiso;		
		this.isPermisoPaginacionMedioTipoGenero=isPermiso;		
		this.isPermisoPaginacionAltoTipoGenero=isPermiso;		
		this.isPermisoPaginacionTodoTipoGenero=isPermiso;		
		this.isPermisoCopiarTipoGenero=isPermiso;		
		this.isPermisoVerFormTipoGenero=isPermiso;		
		this.isPermisoDuplicarTipoGenero=isPermiso;
		this.isPermisoOrdenTipoGenero=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoGenero(Boolean isPermiso) {
		//this.isPermisoTodoTipoGenero=isPermiso;
		this.isPermisoNuevoTipoGenero=isPermiso;
		this.isPermisoActualizarTipoGenero=isPermiso;
		this.isPermisoActualizarOriginalTipoGenero=isPermiso;
		this.isPermisoEliminarTipoGenero=isPermiso;
		this.isPermisoGuardarCambiosTipoGenero=isPermiso;
		//this.isPermisoConsultaTipoGenero=isPermiso;
		//this.isPermisoBusquedaTipoGenero=isPermiso;
		//this.isPermisoReporteTipoGenero=isPermiso;
		//this.isPermisoOrdenTipoGenero=isPermiso;		
		//this.isPermisoPaginacionMedioTipoGenero=isPermiso;		
		//this.isPermisoPaginacionAltoTipoGenero=isPermiso;		
		//this.isPermisoPaginacionTodoTipoGenero=isPermiso;		
		//this.isPermisoCopiarTipoGenero=isPermiso;		
		//this.isPermisoDuplicarTipoGenero=isPermiso;
		//this.isPermisoOrdenTipoGenero=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoGeneroClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(SubClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CargaFamiliarConstantesFunciones.SNOMBREOPCION);
		
		if(TipoGeneroJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionTipoGeneroClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCargaFamiliar_NM=false;
		this.isTienePermisosCargaFamiliar_NM=this.verificarGetPermisosUsuarioOpcionTipoGeneroClaseRelacionada(this.opcionsRelacionadas,CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosSubCliente=false;
		this.isTienePermisosSubCliente=this.verificarGetPermisosUsuarioOpcionTipoGeneroClaseRelacionada(this.opcionsRelacionadas,SubClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosEmpleado=false;
		this.isTienePermisosEmpleado=this.verificarGetPermisosUsuarioOpcionTipoGeneroClaseRelacionada(this.opcionsRelacionadas,EmpleadoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroCarteraDefecto=false;
		this.isTienePermisosParametroCarteraDefecto=this.verificarGetPermisosUsuarioOpcionTipoGeneroClaseRelacionada(this.opcionsRelacionadas,ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCargaFamiliar=false;
		this.isTienePermisosCargaFamiliar=this.verificarGetPermisosUsuarioOpcionTipoGeneroClaseRelacionada(this.opcionsRelacionadas,CargaFamiliarConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoGenero(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoGeneroClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosCargaFamiliar_NM=conPermiso;
		this.isTienePermisosSubCliente=conPermiso;
		this.isTienePermisosEmpleado=conPermiso;
		this.isTienePermisosParametroCarteraDefecto=conPermiso;
		this.isTienePermisosCargaFamiliar=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoGeneroClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoGeneroClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoGeneroClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormTipoGenero!=null && this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.remove(this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCargaFamiliar_NM && this.jInternalFrameDetalleFormTipoGenero!=null && this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.remove(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosSubCliente && this.jInternalFrameDetalleFormTipoGenero!=null && this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.remove(this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosEmpleado && this.jInternalFrameDetalleFormTipoGenero!=null && this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.remove(this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroCarteraDefecto && this.jInternalFrameDetalleFormTipoGenero!=null && this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.remove(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCargaFamiliar && this.jInternalFrameDetalleFormTipoGenero!=null && this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.remove(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoGenero() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoGeneroJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoGeneroConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoGenero=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoGenero=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoGenero=this.isPermisoActualizarTipoGenero;
			this.isPermisoEliminarTipoGenero=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoGenero=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoGenero=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoGenero=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoGenero=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoGenero=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGenero=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoGenero=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoGenero=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoGenero=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoGenero=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoGenero=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoGenero=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGenero=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoGenero.setToolTipText(this.jTableDatosTipoGenero.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoGenero(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoGenero(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoGeneroJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(TipoGeneroJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioTipoGenero() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.tipogeneroConstantesFunciones.mostrarClienteTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCargaFamiliar_NM && this.tipogeneroConstantesFunciones.mostrarCargaFamiliar_NMTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Carga Familiar_ N M");
			reporte.setsDescripcion("Carga Familiar_ N M");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSubCliente && this.tipogeneroConstantesFunciones.mostrarSubClienteTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Sub Cliente");
			reporte.setsDescripcion("Sub Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosEmpleado && this.tipogeneroConstantesFunciones.mostrarEmpleadoTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado");
			reporte.setsDescripcion("Empleado");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroCarteraDefecto && this.tipogeneroConstantesFunciones.mostrarParametroCarteraDefectoTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Cartera Defecto");
			reporte.setsDescripcion("Parametro Cartera Defecto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCargaFamiliar && this.tipogeneroConstantesFunciones.mostrarCargaFamiliarTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Carga Familiar");
			reporte.setsDescripcion("Carga Familiar");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyTipoGeneroListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoGeneroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoGeneroJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoGeneroListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoGeneroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoGenero()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoGenero()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoGenero(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoGenero()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGenero();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoGenero(TipoGenero tipogenero)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoGenero(TipoGenero tipogenero,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoGenero()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGenero()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoGenero()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoGenero()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoGenero()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoGenero()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoGenero(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoGenero()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoGeneroBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoGeneroBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGeneroBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipogeneroSessionBean=new TipoGeneroSessionBean(); 
		this.tipogeneroConstantesFunciones=new TipoGeneroConstantesFunciones(); 
		this.tipogeneroBean=new TipoGenero();//(this.tipogeneroConstantesFunciones); 		
		this.tipogeneroReturnGeneral=new TipoGeneroParameterReturnGeneral(); 
		
		this.tipogeneroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogeneroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoGeneroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoGeneroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoGeneroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoGenero(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.tipogeneroConstantesFunciones=new TipoGeneroConstantesFunciones(); 
			this.tipogeneroBean=new TipoGenero();//this.tipogeneroConstantesFunciones); 			
			this.tipogeneroReturnGeneral=new TipoGeneroParameterReturnGeneral(); 
		
			TipoGeneroBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Genero Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipogenero=new TipoGenero();
			this.tipogeneros = new ArrayList<TipoGenero>();
			this.tipogenerosAux = new ArrayList<TipoGenero>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic=new TipoGeneroLogic();
				this.tipogeneroLogic.getNewConnexionToDeep("");
			}
			
			//this.tipogeneroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipogeneroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoGenero);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoGenero!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGenero);	
					}
					
					if(this.jInternalFrameImportacionTipoGenero!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGenero);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoGenero!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoGenero);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoGenero!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGenero);
				this.jInternalFrameDetalleFormTipoGenero.setVisible(false);
				this.jInternalFrameDetalleFormTipoGenero.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoGenero!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGenero);
					this.jInternalFrameReporteDinamicoTipoGenero.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoGenero.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoGenero!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoGenero);
					this.jInternalFrameImportacionTipoGenero.setVisible(false);
					this.jInternalFrameImportacionTipoGenero.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoGenero!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoGenero);
					this.jInternalFrameOrderByTipoGenero.setVisible(false);
					this.jInternalFrameOrderByTipoGenero.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoGeneroActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoGeneroConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.tipogeneroReturnGeneral=new TipoGeneroParameterReturnGeneral();
			
			this.tipogeneroParameterGeneral=new TipoGeneroParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipogeneroLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(TipoGeneroJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(SubClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CargaFamiliarConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGeneroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogeneroSessionBean.getEsGuardarRelacionado(),this.tipogeneroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGeneroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogeneroSessionBean.getEsGuardarRelacionado(),this.tipogeneroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoTipoGenero=false;
			this.isVisibilidadCeldaDuplicarTipoGenero=true;
			this.isVisibilidadCeldaCopiarTipoGenero=true;
			this.isVisibilidadCeldaVerFormTipoGenero=true;
			this.isVisibilidadCeldaOrdenTipoGenero=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=false;
			this.isVisibilidadCeldaModificarTipoGenero=false;
			this.isVisibilidadCeldaActualizarTipoGenero=false;
			this.isVisibilidadCeldaEliminarTipoGenero=false;
			this.isVisibilidadCeldaCancelarTipoGenero=false;
			this.isVisibilidadCeldaGuardarTipoGenero=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGenero=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoGenero("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoGenero();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoGenero(false);
			
			this.setPermisosUsuarioTipoGenero();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogeneroSessionBean.getEsGuardarRelacionado() 
				|| (this.tipogeneroSessionBean.getEsGuardarRelacionado() && this.tipogeneroSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoGeneroClasesRelacionadas();
			}
			
			if(this.tipogeneroSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoGeneroClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoGeneroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoGenero();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoGenero();
			}
			
			if(!this.isPermisoBusquedaTipoGenero) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoGenero,this.isPermisoPaginacionMedioTipoGenero,this.isPermisoPaginacionTodoTipoGenero);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoGeneroConstantesFunciones.getTiposSeleccionarTipoGenero());
				
				this.tiposColumnasSelect=TipoGeneroConstantesFunciones.getTiposSeleccionarTipoGenero(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoGenero();				
				//this.tiposRelacionesSelect=TipoGeneroConstantesFunciones.getTiposRelacionesTipoGenero(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoGenero();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoGenero(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoGenero(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGenero() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.clienteLogic=new ClienteLogic();
			this.cargafamiliar_nmLogic=new CargaFamiliar_NMLogic();
			this.subclienteLogic=new SubClienteLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.parametrocarteradefectoLogic=new ParametroCarteraDefectoLogic();
			this.cargafamiliarLogic=new CargaFamiliarLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipogeneroImplementable= (TipoGeneroImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGeneroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipogeneroImplementableHome= (TipoGeneroImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGeneroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipogeneros= new ArrayList<TipoGenero>();
			this.tipogenerosEliminados= new ArrayList<TipoGenero>();
						
			this.isEsNuevoTipoGenero=false;
			this.esParaAccionDesdeFormularioTipoGenero=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoGenero(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoGenero();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoGeneroConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoGenero("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoGenero(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoGenero!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoGenero();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoGenero();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoGenero(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoGenero: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoGenero() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SubClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SubClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoGenero")) {
				iIndex=this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();	
				
				

				if(sTitle.equals("Carga Familiar_ N Mes")) {
					if(!CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGenero();

						this.cargarParteTabPanelRelacionadaCargaFamiliar_NM(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Carga Familiares")) {
					if(!CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGenero();

						this.cargarParteTabPanelRelacionadaCargaFamiliar(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGenero();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Empleados")) {
					if(!EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGenero();

						this.cargarParteTabPanelRelacionadaEmpleado(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Cartera Defectos")) {
					if(!ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGenero();

						this.cargarParteTabPanelRelacionadaParametroCarteraDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Sub Clientes")) {
					if(!SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGenero();

						this.cargarParteTabPanelRelacionadaSubCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoGenero();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCargaFamiliar_NM(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGenero.cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(false,true,iIndex);
		this.jButtonCargaFamiliar_NMActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCargaFamiliar_NM();

		//this.jTabbedPaneRelacionesTipoGenero.updateUI();
		//this.jTabbedPaneRelacionesTipoGenero.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGenero.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCargaFamiliar(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGenero.cargarSessionConBeanSwingJInternalFrameCargaFamiliar(false,true,iIndex);
		this.jButtonCargaFamiliarActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCargaFamiliar();

		//this.jTabbedPaneRelacionesTipoGenero.updateUI();
		//this.jTabbedPaneRelacionesTipoGenero.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGenero.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGenero.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesTipoGenero.updateUI();
		//this.jTabbedPaneRelacionesTipoGenero.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGenero.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGenero.cargarSessionConBeanSwingJInternalFrameEmpleado(false,true,iIndex);
		this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleado();

		//this.jTabbedPaneRelacionesTipoGenero.updateUI();
		//this.jTabbedPaneRelacionesTipoGenero.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGenero.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroCarteraDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGenero.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(false,true,iIndex);
		this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();

		//this.jTabbedPaneRelacionesTipoGenero.updateUI();
		//this.jTabbedPaneRelacionesTipoGenero.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGenero.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSubCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGenero.cargarSessionConBeanSwingJInternalFrameSubCliente(false,true,iIndex);
		this.jButtonSubClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSubCliente();

		//this.jTabbedPaneRelacionesTipoGenero.updateUI();
		//this.jTabbedPaneRelacionesTipoGenero.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGenero.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosTipoGenero.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CargaFamiliar_NM")) {
				int row=this.jTableDatosTipoGenero.getSelectedRow();
				jButtonCargaFamiliar_NMActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SubCliente")) {
				int row=this.jTableDatosTipoGenero.getSelectedRow();
				jButtonSubClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Empleado")) {
				int row=this.jTableDatosTipoGenero.getSelectedRow();
				jButtonEmpleadoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroCarteraDefecto")) {
				int row=this.jTableDatosTipoGenero.getSelectedRow();
				jButtonParametroCarteraDefectoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CargaFamiliar")) {
				int row=this.jTableDatosTipoGenero.getSelectedRow();
				jButtonCargaFamiliarActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.tipogeneroConstantesFunciones.mostrarClienteTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(tipogeneroConstantesFunciones.resaltarClienteTipoGenero!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogeneroConstantesFunciones.resaltarClienteTipoGenero);
						}

						jmenuItem.setEnabled(this.tipogeneroConstantesFunciones.activarClienteTipoGenero);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormTipoGenero.jmenuDetalleTipoGenero.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Carga Familiar_ N M")) {

					if(this.isTienePermisosCargaFamiliar_NM && this.tipogeneroConstantesFunciones.mostrarCargaFamiliar_NMTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Carga Familiar_ N Mes"+"("+CargaFamiliar_NMConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Carga Familiar_ N Mes");

						if(tipogeneroConstantesFunciones.resaltarCargaFamiliar_NMTipoGenero!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogeneroConstantesFunciones.resaltarCargaFamiliar_NMTipoGenero);
						}

						jmenuItem.setEnabled(this.tipogeneroConstantesFunciones.activarCargaFamiliar_NMTipoGenero);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CargaFamiliar_NM"));

						

						this.jInternalFrameDetalleFormTipoGenero.jmenuDetalleTipoGenero.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Sub Cliente")) {

					if(this.isTienePermisosSubCliente && this.tipogeneroConstantesFunciones.mostrarSubClienteTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Sub Clientes"+"("+SubClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Sub Clientes");

						if(tipogeneroConstantesFunciones.resaltarSubClienteTipoGenero!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogeneroConstantesFunciones.resaltarSubClienteTipoGenero);
						}

						jmenuItem.setEnabled(this.tipogeneroConstantesFunciones.activarSubClienteTipoGenero);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SubCliente"));

						

						this.jInternalFrameDetalleFormTipoGenero.jmenuDetalleTipoGenero.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Empleado")) {

					if(this.isTienePermisosEmpleado && this.tipogeneroConstantesFunciones.mostrarEmpleadoTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleados"+"("+EmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleados");

						if(tipogeneroConstantesFunciones.resaltarEmpleadoTipoGenero!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogeneroConstantesFunciones.resaltarEmpleadoTipoGenero);
						}

						jmenuItem.setEnabled(this.tipogeneroConstantesFunciones.activarEmpleadoTipoGenero);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Empleado"));

						

						this.jInternalFrameDetalleFormTipoGenero.jmenuDetalleTipoGenero.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Cartera Defecto")) {

					if(this.isTienePermisosParametroCarteraDefecto && this.tipogeneroConstantesFunciones.mostrarParametroCarteraDefectoTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Cartera Defectos"+"("+ParametroCarteraDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Cartera Defectos");

						if(tipogeneroConstantesFunciones.resaltarParametroCarteraDefectoTipoGenero!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogeneroConstantesFunciones.resaltarParametroCarteraDefectoTipoGenero);
						}

						jmenuItem.setEnabled(this.tipogeneroConstantesFunciones.activarParametroCarteraDefectoTipoGenero);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroCarteraDefecto"));

						

						this.jInternalFrameDetalleFormTipoGenero.jmenuDetalleTipoGenero.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Carga Familiar")) {

					if(this.isTienePermisosCargaFamiliar && this.tipogeneroConstantesFunciones.mostrarCargaFamiliarTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Carga Familiares"+"("+CargaFamiliarConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Carga Familiares");

						if(tipogeneroConstantesFunciones.resaltarCargaFamiliarTipoGenero!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogeneroConstantesFunciones.resaltarCargaFamiliarTipoGenero);
						}

						jmenuItem.setEnabled(this.tipogeneroConstantesFunciones.activarCargaFamiliarTipoGenero);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CargaFamiliar"));

						

						this.jInternalFrameDetalleFormTipoGenero.jmenuDetalleTipoGenero.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoGenero(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoGenero(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoGenero(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoGeneroListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoGenero();
		
		this.cargarCombosFrameForeignKeyTipoGenero();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoGenero();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoGenero();
		}
	}
	
	
	
	public void jButtonNuevoTipoGeneroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipogeneroSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoGenero==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			
			
			if(jTableDatosTipoGenero.getRowCount()>=1) {
				jTableDatosTipoGenero.removeRowSelectionInterval(0, jTableDatosTipoGenero.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoGenero=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoGenero(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoGenero(true);			
			//this.tipogenero=new TipoGenero();
			//this.tipogenero.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGenero(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGenero() ;
			
			if(TipoGeneroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGenero(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipogenero);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);				
			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			
			if(this.tipogeneroSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoGenero: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoGeneroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoGenero.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoGenero.getSelectedRows().length;			
			}
			
			tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoGenero--;			
				//TipoGenero tipogeneroAux= new TipoGenero();			
				//tipogeneroAux.setId(this.iIdNuevoTipoGenero);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoGenero tipogeneroOrigen=new TipoGenero();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoGenero tipogeneroOrigen : tipogenerosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipogeneroOrigen =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogeneroOrigen =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoGenero();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipogenero.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoGenero(tipogeneroOrigen,this.tipogenero,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogeneroLogic.getTipoGeneros().add(this.tipogeneroAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogeneros.add(this.tipogeneroAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoGenero(false);
				
				this.jTableDatosTipoGenero.setRowSelectionInterval(this.getIndiceNuevoTipoGenero(), this.getIndiceNuevoTipoGenero());
				
				int iLastRow =  this.jTableDatosTipoGenero.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGenero.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGenero.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGenero(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoGeneroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();									
		
			TipoGenero tipogeneroOrigen=new TipoGenero();
			TipoGenero tipogeneroDestino=new TipoGenero();
				
			tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoGenero.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipogenerosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoGenero.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogeneroOrigen =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogeneroOrigen =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogeneroDestino =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogeneroDestino =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipogeneroOrigen =tipogenerosSeleccionados.get(0);
				tipogeneroDestino =tipogenerosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoGenero(tipogeneroOrigen,tipogeneroDestino,true,false);
				
				tipogeneroDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogeneroDestino,tipogeneroLogic.getTipoGeneros());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogeneroDestino,tipogeneros);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoGenero(false);
				
				//this.jTableDatosTipoGenero.setRowSelectionInterval(this.getIndiceNuevoTipoGenero(), this.getIndiceNuevoTipoGenero());
				
				int iLastRow =  this.jTableDatosTipoGenero.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGenero.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGenero.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGenero(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoGeneroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGenero==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoGenero.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoGeneroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoGenero.isVisible();
			
			
			this.jPanelParametrosReportesTipoGenero.setVisible(!isVisible);
			this.jPanelPaginacionTipoGenero.setVisible(!isVisible);
			this.jPanelAccionesTipoGenero.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoGeneroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoGenero();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoGeneroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoGenero();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoGeneroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoGenero();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoGeneroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoGenero();
			
			this.abrirFrameOrderByTipoGenero();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoGeneroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoGenero();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoGenero(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGenero);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoGenero.isMaximum()) {
					this.jInternalFrameDetalleFormTipoGenero.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoGenero.setSize(this.jInternalFrameDetalleFormTipoGenero.iWidthFormulario,this.jInternalFrameDetalleFormTipoGenero.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoGenero.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoGenero.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoGenero.isMaximum()) {
						this.jInternalFrameDetalleFormTipoGenero.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoGenero.jContentPaneDetalleTipoGenero.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoGenero.jContentPaneDetalleTipoGenero.getWidth(),TipoGeneroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoGenero.jContentPaneDetalleTipoGenero.getWidth(),TipoGeneroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoGenero.jContentPaneDetalleTipoGenero.getWidth(),TipoGeneroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCargaFamiliar_NM();
					}

					if(CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCargaFamiliar();
					}

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleado();
					}

					if(ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();
					}

					if(SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSubCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoGenero.setVisible(true);
	        this.jInternalFrameDetalleFormTipoGenero.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoGenero() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoGenero==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoGenero=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGenero,false,this);
				} else {
					this.jInternalFrameOrderByTipoGenero=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGenero,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoGenero);
				this.jInternalFrameOrderByTipoGenero.setVisible(false);
				this.jInternalFrameOrderByTipoGenero.setSelected(false);
				
				this.jInternalFrameOrderByTipoGenero.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGenero"));
				
				this.inicializarActualizarBindingTablaOrderByTipoGenero();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoGenero() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoGenero==null) {
				
				this.jInternalFrameImportacionTipoGenero=new ImportacionJInternalFrame(TipoGeneroConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGenero);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoGenero);
				this.jInternalFrameImportacionTipoGenero.setVisible(false);
				this.jInternalFrameImportacionTipoGenero.setSelected(false);


				this.jInternalFrameImportacionTipoGenero.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGenero"));
				this.jInternalFrameImportacionTipoGenero.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGenero"));
				this.jInternalFrameImportacionTipoGenero.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGenero"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoGenero() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoGenero==null) {
				this.jInternalFrameReporteDinamicoTipoGenero=new ReporteDinamicoJInternalFrame(TipoGeneroConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGenero);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGenero);
				this.jInternalFrameReporteDinamicoTipoGenero.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoGenero.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoGenero.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGenero"));
				this.jInternalFrameReporteDinamicoTipoGenero.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGenero"));
				this.jInternalFrameReporteDinamicoTipoGenero.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGenero"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGenero();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCargaFamiliar_NM() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGenero.jContentPaneDetalleTipoGenero.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCargaFamiliar() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGenero.jContentPaneDetalleTipoGenero.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGenero.jContentPaneDetalleTipoGenero.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGenero.jContentPaneDetalleTipoGenero.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroCarteraDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGenero.jContentPaneDetalleTipoGenero.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSubCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGenero.jContentPaneDetalleTipoGenero.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoGenero() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGenero);
			
	       	this.jInternalFrameDetalleFormTipoGenero.setVisible(false);
	        this.jInternalFrameDetalleFormTipoGenero.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoGenero.dispose();
			//this.jInternalFrameDetalleFormTipoGenero=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoGenero() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoGenero.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoGenero.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoGenero() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoGenero.setVisible(true);
	        this.jInternalFrameImportacionTipoGenero.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoGenero() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoGenero.setVisible(true);
	        this.jInternalFrameOrderByTipoGenero.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoGenero() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoGenero.setVisible(false);
	        this.jInternalFrameOrderByTipoGenero.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoGenero() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoGenero.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoGenero.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoGenero() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoGenero.setVisible(false);
	        this.jInternalFrameImportacionTipoGenero.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoGeneroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoGenero(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoGenero(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoGenero(true);
			//this.isEsNuevoTipoGenero=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoGenero("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGenero(false) ;
			
			if(tipogeneroSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() && CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargaFamiliar_NMActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado() && SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.getEsGuardarRelacionado() && CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargaFamiliarActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoGeneroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGenero(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGenero(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoGeneroActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoGenero(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGenero==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoGenero(true);
			//this.isEsNuevoTipoGenero=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipogenero.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoGenero("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoGenero(false) ;
			
			if(TipoGeneroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGenero(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGenero(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoGeneroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoGenero(false);
			
			//if(!this.isEsNuevoTipoGenero) {								
				int intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoGeneroJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);
				
			}
			
			if(this.permiteMantenimiento(this.tipogenero)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoGenero=true;
					this.inicializarActualizarBindingTablaTipoGenero(false);
					this.isEsNuevoTipoGenero=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoGenero=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoGenero=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGenero(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGenero(false);
				
				this.habilitarDeshabilitarControlesTipoGenero(false);
			
												
				
				if(TipoGeneroJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoGenero();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoGeneroActionPerformed(evt,tipogeneroSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoGenero(this.tipogenero,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoGenero.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipogeneroSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipogenero.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoGenero.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGenero.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoGeneroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				this.tipogenero.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				this.tipogenero.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipogenero)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoGeneroModel) this.jTableDatosTipoGenero.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoGenero=true;
				this.inicializarActualizarBindingTablaTipoGenero(false);
				this.isEsNuevoTipoGenero=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGenero(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGenero(false);
				
				this.habilitarDeshabilitarControlesTipoGenero(false);
				
				
				
				if(TipoGeneroJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoGenero();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoGeneroActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoGenero.getRowCount()>=1) {
				jTableDatosTipoGenero.removeRowSelectionInterval(0, jTableDatosTipoGenero.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoGenero(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoGenero(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGenero(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGenero(false) ;
			
			this.isEsNuevoTipoGenero=false;
			
			if(TipoGeneroJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoGenero();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoGeneroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoGenero(false);
				
				//SI ES MANUAL
				if(TipoGeneroJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoGenero();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoGeneroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoGenero--;			
			//TipoGenero tipogeneroAux= new TipoGenero();			
			//tipogeneroAux.setId(this.iIdNuevoTipoGenero);
			
			if(this.jInternalFrameDetalleFormTipoGenero==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoGenero();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);
			
			this.tipogenero.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipogeneroLogic.getTipoGeneros().add(this.tipogeneroAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipogeneros.add(this.tipogeneroAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoGenero(false);
			
			this.jTableDatosTipoGenero.setRowSelectionInterval(this.getIndiceNuevoTipoGenero(), this.getIndiceNuevoTipoGenero());
			
			int iLastRow =  this.jTableDatosTipoGenero.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoGenero.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoGenero.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoGenero(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoGeneroActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoGenero(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGenero(false);
			
			//SI ES MANUAL
			if(TipoGeneroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGenero();
			}
			
			//this.abrirFrameTreeTipoGenero();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoGeneroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo GeneroES ?", "MANTENIMIENTO DE Tipo Genero", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoGenero.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoGenero();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipogeneroReturnGeneral=tipogeneroLogic.procesarImportacionTipoGenerosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipogeneroParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoGeneroReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoGeneroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoGenero.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoGenero.setFileImportacion(this.jInternalFrameImportacionTipoGenero.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoGenero.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoGenero.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoGenero.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoGenero.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoGeneroActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();		

		tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGenero.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGenero.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoGeneroBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoGeneroBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteTipoGeneros("Todos",tipogenerosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Genero",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGenero.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGenero.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGeneroConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGeneroConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoTipoGenero.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGenero.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGenero.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoGeneroConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoGeneroConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoGenero.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoGeneroConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoGeneroConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoGenero.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGenero.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGeneroConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoGeneroConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoTipoGeneroActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();		
		
		tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogenero";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("TipoGeneros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoGenero.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGenero.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoGeneroConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGeneroConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoGenero tipogenero:tipogenerosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogenero.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGeneroConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGeneroConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoGenero tipogenero:tipogenerosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogenero.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelTipoGenero(row);				
			//	iRow++;
			//}				
			
			//for(TipoGenero tipogeneroAux:tipogenerosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoGenero(tipogeneroAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Genero",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGenero(false);
			
			//SI ES MANUAL
			if(TipoGeneroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGenero();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoGeneroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGenero(false);
			
			//SI ES MANUAL
			if(TipoGeneroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGenero();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoGeneroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGenero(false);
			
			//SI ES MANUAL
			if(TipoGeneroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGenero();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogeneroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoGenero() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoGenero.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoGenero.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoGenero.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoGenero.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoGenero.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoGenero.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoGenero.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoGenero(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoGenero(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoGenero(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoGenero(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoGenero(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoGenero(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGenero(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoGenero(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoGeneroJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoGeneroJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoGenero() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoGenero();
		
		this.inicializarActualizarBindingBotonesManualTipoGenero(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGenero();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGenero() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGenero(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGenero(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoGenero.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoGenero.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoGenero.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoGenero!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoGenero.jCheckBoxPostAccionNuevoTipoGenero.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoGenero.jCheckBoxPostAccionSinCerrarTipoGenero.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoGenero.jCheckBoxPostAccionSinMensajeTipoGenero.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoGenero.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoGenero.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoGenero.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoGenero!=null) {
				this.jInternalFrameDetalleFormTipoGenero.jCheckBoxPostAccionNuevoTipoGenero.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoGenero.jCheckBoxPostAccionSinCerrarTipoGenero.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoGenero.jCheckBoxPostAccionSinMensajeTipoGenero.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoGenero.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoGenero.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoGenero!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoGenero.jComboBoxTiposAccionesFormularioTipoGenero.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoGenero.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoGenero!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGenero.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoGenero.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoGenero.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoGenero.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoGenero.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoGenero!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGenero.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoGenero.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoGenero.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoGenero(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoGeneroJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGenero(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoGenero() throws Exception {
		try	{
			if(TipoGeneroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGenero();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGenero() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoGenero.jComboBoxTiposAccionesFormularioTipoGenero.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoGenero.jComboBoxTiposAccionesFormularioTipoGenero.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGenero() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoGenero.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoGenero.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoGenero.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoGenero.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoGenero.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoGenero.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoGenero.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoGenero.addItem(reporte);
			}
			
			
			if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoGenero.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoGenero.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoGenero.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoGenero.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoGenero.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoGenero.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoGenero.jComboBoxTiposAccionesFormularioTipoGenero.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoGenero.jComboBoxTiposAccionesFormularioTipoGenero.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoGenero.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoGenero.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoGenero.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGenero();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGenero() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGenero!=null) {
				this.jInternalFrameReporteDinamicoTipoGenero.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGenero.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGenero!=null) {
				this.jInternalFrameReporteDinamicoTipoGenero.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGenero.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoGenero!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoGenero.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGenero.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGenero.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoGenero.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGenero.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGenero.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoGenero()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoGenero(Boolean esInicializar) throws Exception {				
		if(TipoGeneroJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGenero();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoGenero() throws Exception {
		this.inicializarActualizarBindingTablaTipoGenero(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoGenero() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoGeneroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoGeneroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoGeneroOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGeneroOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoGeneroPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoGeneroPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoGenero(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipogeneroLogic.getTipoGeneros().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipogeneros.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoGeneroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoGenero.setModel(new TipoGeneroModel(this.tipogeneroLogic.getTipoGeneros(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoGenero.setModel(new TipoGeneroModel(this.tipogeneros,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoGenero!=null && this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoGenero();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoGenero.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGenero,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoGeneroPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO,tipogeneroConstantesFunciones.resaltarSeleccionarTipoGenero,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO,tipogeneroConstantesFunciones.resaltarSeleccionarTipoGenero,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoGenero.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGenero,TipoGeneroConstantesFunciones.LABEL_ID));

		if(this.tipogeneroConstantesFunciones.mostraridTipoGenero && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGeneroConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipogeneroConstantesFunciones.resaltaridTipoGenero,this.tipogeneroConstantesFunciones.activaridTipoGenero,this,true,"idTipoGenero","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogeneroConstantesFunciones.resaltaridTipoGenero,this.tipogeneroConstantesFunciones.activaridTipoGenero,this,true,"idTipoGenero","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGenero.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGenero,TipoGeneroConstantesFunciones.LABEL_CODIGO));

		if(this.tipogeneroConstantesFunciones.mostrarcodigoTipoGenero && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGeneroConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogeneroConstantesFunciones.resaltarcodigoTipoGenero,this.tipogeneroConstantesFunciones.activarcodigoTipoGenero,this,true,"codigoTipoGenero","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogeneroConstantesFunciones.resaltarcodigoTipoGenero,this.tipogeneroConstantesFunciones.activarcodigoTipoGenero,this,true,"codigoTipoGenero","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGeneroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGenero.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGenero,TipoGeneroConstantesFunciones.LABEL_NOMBRE));

		if(this.tipogeneroConstantesFunciones.mostrarnombreTipoGenero && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGeneroConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogeneroConstantesFunciones.resaltarnombreTipoGenero,this.tipogeneroConstantesFunciones.activarnombreTipoGenero,this,true,"nombreTipoGenero","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogeneroConstantesFunciones.resaltarnombreTipoGenero,this.tipogeneroConstantesFunciones.activarnombreTipoGenero,this,true,"nombreTipoGenero","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGeneroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.tipogeneroConstantesFunciones.mostrarClienteTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(tipogeneroConstantesFunciones.resaltarClienteTipoGenero,this,this.tipogeneroConstantesFunciones.activarClienteTipoGenero));
				tableColumn.setCellEditor(new ClienteTableCell(tipogeneroConstantesFunciones.resaltarClienteTipoGenero,this,this.tipogeneroConstantesFunciones.activarClienteTipoGenero));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGenero.addColumn(tableColumn);
			}

			if(this.isTienePermisosCargaFamiliar_NM && this.tipogeneroConstantesFunciones.mostrarCargaFamiliar_NMTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Carga Familiar_ N Mes");
				tableColumn.setHeaderValue("Carga Familiar_ N Mes");
				tableColumn.setCellRenderer(new CargaFamiliar_NMTableCell(tipogeneroConstantesFunciones.resaltarCargaFamiliar_NMTipoGenero,this,this.tipogeneroConstantesFunciones.activarCargaFamiliar_NMTipoGenero));
				tableColumn.setCellEditor(new CargaFamiliar_NMTableCell(tipogeneroConstantesFunciones.resaltarCargaFamiliar_NMTipoGenero,this,this.tipogeneroConstantesFunciones.activarCargaFamiliar_NMTipoGenero));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGenero.addColumn(tableColumn);
			}

			if(this.isTienePermisosSubCliente && this.tipogeneroConstantesFunciones.mostrarSubClienteTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Sub Clientes");
				tableColumn.setHeaderValue("Sub Clientes");
				tableColumn.setCellRenderer(new SubClienteTableCell(tipogeneroConstantesFunciones.resaltarSubClienteTipoGenero,this,this.tipogeneroConstantesFunciones.activarSubClienteTipoGenero));
				tableColumn.setCellEditor(new SubClienteTableCell(tipogeneroConstantesFunciones.resaltarSubClienteTipoGenero,this,this.tipogeneroConstantesFunciones.activarSubClienteTipoGenero));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGenero.addColumn(tableColumn);
			}

			if(this.isTienePermisosEmpleado && this.tipogeneroConstantesFunciones.mostrarEmpleadoTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleados");
				tableColumn.setHeaderValue("Empleados");
				tableColumn.setCellRenderer(new EmpleadoTableCell(tipogeneroConstantesFunciones.resaltarEmpleadoTipoGenero,this,this.tipogeneroConstantesFunciones.activarEmpleadoTipoGenero));
				tableColumn.setCellEditor(new EmpleadoTableCell(tipogeneroConstantesFunciones.resaltarEmpleadoTipoGenero,this,this.tipogeneroConstantesFunciones.activarEmpleadoTipoGenero));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGenero.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroCarteraDefecto && this.tipogeneroConstantesFunciones.mostrarParametroCarteraDefectoTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Cartera Defectos");
				tableColumn.setHeaderValue("Parametro Cartera Defectos");
				tableColumn.setCellRenderer(new ParametroCarteraDefectoTableCell(tipogeneroConstantesFunciones.resaltarParametroCarteraDefectoTipoGenero,this,this.tipogeneroConstantesFunciones.activarParametroCarteraDefectoTipoGenero));
				tableColumn.setCellEditor(new ParametroCarteraDefectoTableCell(tipogeneroConstantesFunciones.resaltarParametroCarteraDefectoTipoGenero,this,this.tipogeneroConstantesFunciones.activarParametroCarteraDefectoTipoGenero));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGenero.addColumn(tableColumn);
			}

			if(this.isTienePermisosCargaFamiliar && this.tipogeneroConstantesFunciones.mostrarCargaFamiliarTipoGenero && !TipoGeneroConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Carga Familiares");
				tableColumn.setHeaderValue("Carga Familiares");
				tableColumn.setCellRenderer(new CargaFamiliarTableCell(tipogeneroConstantesFunciones.resaltarCargaFamiliarTipoGenero,this,this.tipogeneroConstantesFunciones.activarCargaFamiliarTipoGenero));
				tableColumn.setCellEditor(new CargaFamiliarTableCell(tipogeneroConstantesFunciones.resaltarCargaFamiliarTipoGenero,this,this.tipogeneroConstantesFunciones.activarCargaFamiliarTipoGenero));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGenero.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogeneroSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogeneroSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGenero.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogeneroSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogeneroSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGenero.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoGenero && this.isPermisoGuardarCambiosTipoGenero) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipogeneroSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipogeneroSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoGenero.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipogeneroSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoGenero.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosTipoGenero.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGenero && this.isPermisoGuardarCambiosTipoGenero) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipogeneroSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGenero && this.isPermisoGuardarCambiosTipoGenero) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoGenero.moveColumn(this.jTableDatosTipoGenero.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoGenero.moveColumn(this.jTableDatosTipoGenero.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipogeneroSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoGenero.moveColumn(this.jTableDatosTipoGenero.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoGenero.moveColumn(this.jTableDatosTipoGenero.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoGenero.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoGenero.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoGenero,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoGeneroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoGenero.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoGenero.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoGeneroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoGeneroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoGenero.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoGenero.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoGenero.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=tipogeneroLogic.getTipoGeneros().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipogeneros.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosTipoGenero.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoGenero.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoGenero();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoTipoGenero=false;
					
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			
				if(this.tipogeneroSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoGenero==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGenero.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGenero.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipogenero.getsType().equals("DUPLICADO")
				   || this.tipogenero.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoGenero=true;
				
				} else {
					this.isEsNuevoTipoGenero=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
					if(this.tipogenero.getId()>=0 && !this.tipogenero.getIsNew()) {						
						this.isEsNuevoTipoGenero=false;
						
					} else {
						this.isEsNuevoTipoGenero=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoGenero(esRelaciones);						
				
				this.seleccionarTipoGenero(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipogenero.getId()<0) {
					this.isEsNuevoTipoGenero=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoGenero(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoGenero(evt,rowIndex);
				}	
				
				if(this.tipogeneroSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoGenero: " + this.dDif); 
					}
				}								
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoGenero(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipogenero)) {
					if(this.tipogenero.getId()>0) {
						this.tipogenero.setIsDeleted(true);
						
						this.tipogenerosEliminados.add(this.tipogenero);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogeneroLogic.getTipoGeneros().remove(this.tipogenero);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogeneros.remove(this.tipogenero);				
					}
					
					
					((TipoGeneroModel) this.jTableDatosTipoGenero.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGenero(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoGenero(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoGenero) {
			
			if(this.jInternalFrameDetalleFormTipoGenero==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGenero.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGenero.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoGeneroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoGenero(this.tipogenero);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoGenero("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoGenero(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGenero() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGenero(TipoGenero tipogenero) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoGenero(tipogenero,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGenero(TipoGenero tipogenero,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoGenero(tipogenero);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoGenero(tipogenero,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoGenero(tipogenero);
	}
	
	public void setVariablesObjetoActualToFormularioTipoGenero(TipoGenero tipogenero) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoGenero==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoGenero.jTextFieldidTipoGenero.setText(tipogenero.getId().toString());
			this.jInternalFrameDetalleFormTipoGenero.jTextFieldcodigoTipoGenero.setText(tipogenero.getcodigo());
			this.jInternalFrameDetalleFormTipoGenero.jTextAreanombreTipoGenero.setText(tipogenero.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoGenero tipogeneroLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipogeneroLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoGenero tipogeneroLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipogeneroLocal=this.tipogenero;
			} else {
				tipogeneroLocal=this.tipogeneroAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipogeneroLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoGenero(tipogeneroLocal,true);
					
					if(tipogeneroSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipogeneroLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipogeneroLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoGenero(TipoGenero tipogenero,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGenero(tipogenero,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(tipogenero);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGenero(TipoGenero tipogenero,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGenero(tipogenero,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGenero(TipoGenero tipogenero,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoGenero==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoGenero.jTextFieldidTipoGenero.getText()==null || this.jInternalFrameDetalleFormTipoGenero.jTextFieldidTipoGenero.getText()=="" || this.jInternalFrameDetalleFormTipoGenero.jTextFieldidTipoGenero.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoGenero.jTextFieldidTipoGenero.setText("0");
			}

			if(conColumnasBase) {tipogenero.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoGenero.jTextFieldidTipoGenero.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGeneroConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGenero.jLabelIdTipoGenero,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogenero.setcodigo(this.jInternalFrameDetalleFormTipoGenero.jTextFieldcodigoTipoGenero.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGeneroConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGenero.jLabelcodigoTipoGenero,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogenero.setnombre(this.jInternalFrameDetalleFormTipoGenero.jTextAreanombreTipoGenero.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGeneroConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGenero.jLabelnombreTipoGenero,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGenero(TipoGenero tipogeneroBean,TipoGenero tipogenero,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoGenero(TipoGenero tipogeneroOrigen,TipoGenero tipogenero,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogeneroOrigen.getId()!=null && !tipogeneroOrigen.getId().equals(0L))) {tipogenero.setId(tipogeneroOrigen.getId());}}
			if(conDefault || (!conDefault && tipogeneroOrigen.getcodigo()!=null && !tipogeneroOrigen.getcodigo().equals(""))) {tipogenero.setcodigo(tipogeneroOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipogeneroOrigen.getnombre()!=null && !tipogeneroOrigen.getnombre().equals(""))) {tipogenero.setnombre(tipogeneroOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGenero(TipoGenero tipogenero) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGenero.jTextFieldidTipoGenero.setText(tipogenero.getId().toString());
			this.jInternalFrameDetalleFormTipoGenero.jTextFieldcodigoTipoGenero.setText(tipogenero.getcodigo());
			this.jInternalFrameDetalleFormTipoGenero.jTextAreanombreTipoGenero.setText(tipogenero.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGenero(TipoGeneroBean tipogeneroBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGenero.jTextFieldidTipoGenero.setText(tipogeneroBean.getId().toString());
			this.jInternalFrameDetalleFormTipoGenero.jTextFieldcodigoTipoGenero.setText(tipogeneroBean.getcodigo());
			this.jInternalFrameDetalleFormTipoGenero.jTextAreanombreTipoGenero.setText(tipogeneroBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoGenero(TipoGeneroParameterReturnGeneral tipogeneroReturnGeneral,TipoGeneroBean tipogeneroBean,Boolean conDefault) throws Exception { 
		try {
			TipoGenero tipogeneroLocal=new TipoGenero();
			
			tipogeneroLocal=tipogeneroReturnGeneral.getTipoGenero();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogeneroLocal.getId()!=null && !tipogeneroLocal.getId().equals(0L))) {tipogeneroBean.setId(tipogeneroLocal.getId());}}
			if(conDefault || (!conDefault && tipogeneroLocal.getcodigo()!=null && !tipogeneroLocal.getcodigo().equals(""))) {tipogeneroBean.setcodigo(tipogeneroLocal.getcodigo());}
			if(conDefault || (!conDefault && tipogeneroLocal.getnombre()!=null && !tipogeneroLocal.getnombre().equals(""))) {tipogeneroBean.setnombre(tipogeneroLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoGeneroGenerico(Long idTipoGeneroSeleccionado,JComboBox jComboBoxTipoGenero,List<TipoGenero> tipogenerosLocal)throws Exception {
		try {
			TipoGenero  tipogeneroTemp=null;

			for(TipoGenero tipogeneroAux:tipogenerosLocal) {
				if(tipogeneroAux.getId()!=null && tipogeneroAux.getId().equals(idTipoGeneroSeleccionado)) {
					tipogeneroTemp=tipogeneroAux;
					break;
				}
			}

			jComboBoxTipoGenero.setSelectedItem(tipogeneroTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoGeneroGenerico(JComboBox jComboBoxTipoGenero,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxTipoGenero.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGenero.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoGenero.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGenero.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGenero.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoGenero.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGenero.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoGenero.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoGenero.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoGenero.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CargaFamiliar_NM")) {
			jButtonCargaFamiliar_NMActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("SubCliente")) {
			jButtonSubClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Empleado")) {
			jButtonEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroCarteraDefecto")) {
			jButtonParametroCarteraDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CargaFamiliar")) {
			jButtonCargaFamiliarActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogenero=(TipoGenero) tipogeneroLogic.getTipoGeneros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogenero =(TipoGenero) tipogeneros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoGenero tipogeneroRow=new TipoGenero();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogeneroRow=(TipoGenero) tipogeneroLogic.getTipoGeneros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogeneroRow=(TipoGenero) tipogeneros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGenero tipogenero) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGenero==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogenero = (TipoGenero)this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogenero = (TipoGenero)this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogenero!=null) {
						this.tipogenero = tipogenero;
					} else {
						this.tipogenero = new TipoGenero();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.tipogenero)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame;
					}

					List<TipoGenero> tipogeneros=new ArrayList<TipoGenero>();
					tipogeneros.add(this.tipogenero);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGenero.cargarClienteBeanSwingJInternalFrame(tipogeneros,this.tipogenero,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGenero=(TitledBorder)this.jScrollPanelDatosTipoGenero.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderTipoGenero.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogeneroSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCargaFamiliar_NMActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGenero tipogenero) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGenero==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogenero = (TipoGenero)this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogenero = (TipoGenero)this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogenero!=null) {
						this.tipogenero = tipogenero;
					} else {
						this.tipogenero = new TipoGenero();
					}
				}

				if(this.isTienePermisosCargaFamiliar_NM && this.permiteMantenimiento(this.tipogenero)) {
					CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFramePopup=new CargaFamiliar_NMBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cargafamiliar_nmBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFramePopup;
					} else {
						cargafamiliar_nmBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame;
					}

					List<TipoGenero> tipogeneros=new ArrayList<TipoGenero>();
					tipogeneros.add(this.tipogenero);
					if(!esRelacionado) {
						//cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setConGuardarRelaciones(false);
						//cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cargafamiliar_nmBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGenero.cargarCargaFamiliar_NMBeanSwingJInternalFrame(tipogeneros,this.tipogenero,cargafamiliar_nmBeanSwingJInternalFrame,/*conInicializar,*/cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.getConGuardarRelaciones(),cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
					cargafamiliar_nmBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar_NM("no_relacionado");

						cargafamiliar_nmBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CargaFamiliar_NMConstantesFunciones.ITAMANIOFILATABLA + (CargaFamiliar_NMConstantesFunciones.ITAMANIOFILATABLA/2));

						cargafamiliar_nmBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGenero=(TitledBorder)this.jScrollPanelDatosTipoGenero.getBorder();
						TitledBorder titledBorderCargaFamiliar_NM=(TitledBorder)cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.getBorder();

						titledBorderCargaFamiliar_NM.setTitle(titledBorderTipoGenero.getTitle() + " -> Carga Familiar_ N M");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cargafamiliar_nmBeanSwingJInternalFrame);
						}

						cargafamiliar_nmBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cargafamiliar_nmBeanSwingJInternalFrame);

						cargafamiliar_nmBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogeneroSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Carga Familiar_ N M",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonSubClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGenero tipogenero) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGenero==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogenero = (TipoGenero)this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogenero = (TipoGenero)this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogenero!=null) {
						this.tipogenero = tipogenero;
					} else {
						this.tipogenero = new TipoGenero();
					}
				}

				if(this.isTienePermisosSubCliente && this.permiteMantenimiento(this.tipogenero)) {
					SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						subclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFramePopup;
					} else {
						subclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame;
					}

					List<TipoGenero> tipogeneros=new ArrayList<TipoGenero>();
					tipogeneros.add(this.tipogenero);
					if(!esRelacionado) {
						//subclienteBeanSwingJInternalFrame.subclienteSessionBean.setConGuardarRelaciones(false);
						//subclienteBeanSwingJInternalFrame.subclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					subclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGenero.cargarSubClienteBeanSwingJInternalFrame(tipogeneros,this.tipogenero,subclienteBeanSwingJInternalFrame,/*conInicializar,*/subclienteBeanSwingJInternalFrame.subclienteSessionBean.getConGuardarRelaciones(),subclienteBeanSwingJInternalFrame.subclienteSessionBean.getEsGuardarRelacionado());
					subclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");

						subclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SubClienteConstantesFunciones.ITAMANIOFILATABLA + (SubClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						subclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGenero=(TitledBorder)this.jScrollPanelDatosTipoGenero.getBorder();
						TitledBorder titledBorderSubCliente=(TitledBorder)subclienteBeanSwingJInternalFrame.jScrollPanelDatosSubCliente.getBorder();

						titledBorderSubCliente.setTitle(titledBorderTipoGenero.getTitle() + " -> Sub Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,subclienteBeanSwingJInternalFrame);
						}

						subclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(subclienteBeanSwingJInternalFrame);

						subclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogeneroSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Sub Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGenero tipogenero) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGenero==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogenero = (TipoGenero)this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogenero = (TipoGenero)this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogenero!=null) {
						this.tipogenero = tipogenero;
					} else {
						this.tipogenero = new TipoGenero();
					}
				}

				if(this.isTienePermisosEmpleado && this.permiteMantenimiento(this.tipogenero)) {
					EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFramePopup;
					} else {
						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame;
					}

					List<TipoGenero> tipogeneros=new ArrayList<TipoGenero>();
					tipogeneros.add(this.tipogenero);
					if(!esRelacionado) {
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setConGuardarRelaciones(false);
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGenero.cargarEmpleadoBeanSwingJInternalFrame(tipogeneros,this.tipogenero,empleadoBeanSwingJInternalFrame,/*conInicializar,*/empleadoBeanSwingJInternalFrame.empleadoSessionBean.getConGuardarRelaciones(),empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado());
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");

						empleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGenero=(TitledBorder)this.jScrollPanelDatosTipoGenero.getBorder();
						TitledBorder titledBorderEmpleado=(TitledBorder)empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

						titledBorderEmpleado.setTitle(titledBorderTipoGenero.getTitle() + " -> Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoBeanSwingJInternalFrame);
						}

						empleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoBeanSwingJInternalFrame);

						empleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogeneroSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroCarteraDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGenero tipogenero) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGenero==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogenero = (TipoGenero)this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogenero = (TipoGenero)this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogenero!=null) {
						this.tipogenero = tipogenero;
					} else {
						this.tipogenero = new TipoGenero();
					}
				}

				if(this.isTienePermisosParametroCarteraDefecto && this.permiteMantenimiento(this.tipogenero)) {
					ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFramePopup;
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame;
					}

					List<TipoGenero> tipogeneros=new ArrayList<TipoGenero>();
					tipogeneros.add(this.tipogenero);
					if(!esRelacionado) {
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGenero.cargarParametroCarteraDefectoBeanSwingJInternalFrame(tipogeneros,this.tipogenero,parametrocarteradefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getConGuardarRelaciones(),parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");

						parametrocarteradefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocarteradefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGenero=(TitledBorder)this.jScrollPanelDatosTipoGenero.getBorder();
						TitledBorder titledBorderParametroCarteraDefecto=(TitledBorder)parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getBorder();

						titledBorderParametroCarteraDefecto.setTitle(titledBorderTipoGenero.getTitle() + " -> Parametro Cartera Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocarteradefectoBeanSwingJInternalFrame);
						}

						parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocarteradefectoBeanSwingJInternalFrame);

						parametrocarteradefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogeneroSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Cartera Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCargaFamiliarActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGenero tipogenero) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGenero==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogenero = (TipoGenero)this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogenero = (TipoGenero)this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogenero!=null) {
						this.tipogenero = tipogenero;
					} else {
						this.tipogenero = new TipoGenero();
					}
				}

				if(this.isTienePermisosCargaFamiliar && this.permiteMantenimiento(this.tipogenero)) {
					CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFramePopup=new CargaFamiliarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cargafamiliarBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFramePopup;
					} else {
						cargafamiliarBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame;
					}

					List<TipoGenero> tipogeneros=new ArrayList<TipoGenero>();
					tipogeneros.add(this.tipogenero);
					if(!esRelacionado) {
						//cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setConGuardarRelaciones(false);
						//cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cargafamiliarBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGenero.cargarCargaFamiliarBeanSwingJInternalFrame(tipogeneros,this.tipogenero,cargafamiliarBeanSwingJInternalFrame,/*conInicializar,*/cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.getConGuardarRelaciones(),cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.getEsGuardarRelacionado());
					cargafamiliarBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cargafamiliarBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar("no_relacionado");

						cargafamiliarBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CargaFamiliarConstantesFunciones.ITAMANIOFILATABLA + (CargaFamiliarConstantesFunciones.ITAMANIOFILATABLA/2));

						cargafamiliarBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGenero=(TitledBorder)this.jScrollPanelDatosTipoGenero.getBorder();
						TitledBorder titledBorderCargaFamiliar=(TitledBorder)cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.getBorder();

						titledBorderCargaFamiliar.setTitle(titledBorderTipoGenero.getTitle() + " -> Carga Familiar");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cargafamiliarBeanSwingJInternalFrame);
						}

						cargafamiliarBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cargafamiliarBeanSwingJInternalFrame);

						cargafamiliarBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogeneroSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Carga Familiar",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoGenero(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoGenero.setVisible((this.isVisibilidadCeldaNuevoTipoGenero && this.isPermisoNuevoTipoGenero));			
			this.jButtonDuplicarTipoGenero.setVisible((this.isVisibilidadCeldaDuplicarTipoGenero && this.isPermisoDuplicarTipoGenero));			
			this.jButtonCopiarTipoGenero.setVisible((this.isVisibilidadCeldaCopiarTipoGenero && this.isPermisoCopiarTipoGenero));
			this.jButtonVerFormTipoGenero.setVisible((this.isVisibilidadCeldaVerFormTipoGenero && this.isPermisoVerFormTipoGenero));
			
			this.jButtonAbrirOrderByTipoGenero.setVisible((this.isVisibilidadCeldaOrdenTipoGenero && this.isPermisoOrdenTipoGenero));			
			
			this.jButtonNuevoRelacionesTipoGenero.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGenero && this.isPermisoNuevoTipoGenero));			
			this.jButtonNuevoGuardarCambiosTipoGenero.setVisible((this.isVisibilidadCeldaNuevoTipoGenero && this.isPermisoNuevoTipoGenero && this.isPermisoGuardarCambiosTipoGenero));
			
			if(this.jInternalFrameDetalleFormTipoGenero!=null) {
			this.jInternalFrameDetalleFormTipoGenero.jButtonModificarTipoGenero.setVisible((this.isVisibilidadCeldaModificarTipoGenero && this.isPermisoActualizarTipoGenero));	
			this.jInternalFrameDetalleFormTipoGenero.jButtonActualizarTipoGenero.setVisible((this.isVisibilidadCeldaActualizarTipoGenero && this.isPermisoActualizarTipoGenero));	
			this.jInternalFrameDetalleFormTipoGenero.jButtonEliminarTipoGenero.setVisible((this.isVisibilidadCeldaEliminarTipoGenero && this.isPermisoEliminarTipoGenero));
			this.jInternalFrameDetalleFormTipoGenero.jButtonCancelarTipoGenero.setVisible(this.isVisibilidadCeldaCancelarTipoGenero);							
			this.jInternalFrameDetalleFormTipoGenero.jButtonGuardarCambiosTipoGenero.setVisible((this.isVisibilidadCeldaGuardarTipoGenero && this.isPermisoGuardarCambiosTipoGenero));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoGenero.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGenero && this.isPermisoGuardarCambiosTipoGenero));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoGenero.setVisible((this.isVisibilidadCeldaNuevoTipoGenero && this.isPermisoNuevoTipoGenero));						
			this.jButtonDuplicarToolBarTipoGenero.setVisible((this.isVisibilidadCeldaDuplicarTipoGenero && this.isPermisoDuplicarTipoGenero));						
			this.jButtonCopiarToolBarTipoGenero.setVisible((this.isVisibilidadCeldaCopiarTipoGenero && this.isPermisoCopiarTipoGenero));			
			this.jButtonVerFormToolBarTipoGenero.setVisible((this.isVisibilidadCeldaVerFormTipoGenero && this.isPermisoVerFormTipoGenero));			
			this.jButtonAbrirOrderByToolBarTipoGenero.setVisible((this.isVisibilidadCeldaOrdenTipoGenero && this.isPermisoOrdenTipoGenero));
			this.jButtonNuevoRelacionesToolBarTipoGenero.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGenero && this.isPermisoNuevoTipoGenero));			
			this.jButtonNuevoGuardarCambiosToolBarTipoGenero.setVisible((this.isVisibilidadCeldaNuevoTipoGenero && this.isPermisoNuevoTipoGenero && this.isPermisoGuardarCambiosTipoGenero));			
			
			if(this.jInternalFrameDetalleFormTipoGenero!=null) {
			this.jInternalFrameDetalleFormTipoGenero.jButtonModificarToolBarTipoGenero.setVisible((this.isVisibilidadCeldaModificarTipoGenero && this.isPermisoActualizarTipoGenero));	
			this.jInternalFrameDetalleFormTipoGenero.jButtonActualizarToolBarTipoGenero.setVisible((this.isVisibilidadCeldaActualizarTipoGenero  && this.isPermisoActualizarTipoGenero));	
			this.jInternalFrameDetalleFormTipoGenero.jButtonEliminarToolBarTipoGenero.setVisible((this.isVisibilidadCeldaEliminarTipoGenero && this.isPermisoEliminarTipoGenero));
			this.jInternalFrameDetalleFormTipoGenero.jButtonCancelarToolBarTipoGenero.setVisible(this.isVisibilidadCeldaCancelarTipoGenero);				
			this.jInternalFrameDetalleFormTipoGenero.jButtonGuardarCambiosToolBarTipoGenero.setVisible((this.isVisibilidadCeldaGuardarTipoGenero && this.isPermisoGuardarCambiosTipoGenero));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoGenero.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGenero && this.isPermisoGuardarCambiosTipoGenero));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoGenero.setVisible((this.isVisibilidadCeldaNuevoTipoGenero && this.isPermisoNuevoTipoGenero));			
			this.jMenuItemDuplicarTipoGenero.setVisible((this.isVisibilidadCeldaDuplicarTipoGenero && this.isPermisoDuplicarTipoGenero));			
			this.jMenuItemCopiarTipoGenero.setVisible((this.isVisibilidadCeldaCopiarTipoGenero && this.isPermisoCopiarTipoGenero));			
			this.jMenuItemVerFormTipoGenero.setVisible((this.isVisibilidadCeldaVerFormTipoGenero && this.isPermisoVerFormTipoGenero));			
			this.jMenuItemAbrirOrderByTipoGenero.setVisible((this.isVisibilidadCeldaOrdenTipoGenero && this.isPermisoOrdenTipoGenero));			
			//this.jMenuItemMostrarOcultarTipoGenero.setVisible((this.isVisibilidadCeldaOrdenTipoGenero && this.isPermisoOrdenTipoGenero));
			this.jMenuItemDetalleAbrirOrderByTipoGenero.setVisible((this.isVisibilidadCeldaOrdenTipoGenero && this.isPermisoOrdenTipoGenero));			
			//this.jMenuItemDetalleMostrarOcultarTipoGenero.setVisible((this.isVisibilidadCeldaOrdenTipoGenero && this.isPermisoOrdenTipoGenero));			
			this.jMenuItemNuevoRelacionesTipoGenero.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGenero && this.isPermisoNuevoTipoGenero));			
			this.jMenuItemNuevoGuardarCambiosTipoGenero.setVisible((this.isVisibilidadCeldaNuevoTipoGenero && this.isPermisoNuevoTipoGenero && this.isPermisoGuardarCambiosTipoGenero));									
			
			if(this.jInternalFrameDetalleFormTipoGenero!=null) {
			this.jInternalFrameDetalleFormTipoGenero.jMenuItemModificarTipoGenero.setVisible((this.isVisibilidadCeldaModificarTipoGenero && this.isPermisoActualizarTipoGenero));	
			this.jInternalFrameDetalleFormTipoGenero.jMenuItemActualizarTipoGenero.setVisible((this.isVisibilidadCeldaActualizarTipoGenero && this.isPermisoActualizarTipoGenero));	
			this.jInternalFrameDetalleFormTipoGenero.jMenuItemEliminarTipoGenero.setVisible((this.isVisibilidadCeldaEliminarTipoGenero && this.isPermisoEliminarTipoGenero));
			this.jInternalFrameDetalleFormTipoGenero.jMenuItemCancelarTipoGenero.setVisible(this.isVisibilidadCeldaCancelarTipoGenero);				
			}
			
			this.jMenuItemGuardarCambiosTipoGenero.setVisible((this.isVisibilidadCeldaGuardarTipoGenero && this.isPermisoGuardarCambiosTipoGenero));						
			this.jMenuItemGuardarCambiosTablaTipoGenero.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGenero && this.isPermisoGuardarCambiosTipoGenero));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoGenero=this.jButtonNuevoTipoGenero.isVisible();
			this.isVisibilidadCeldaDuplicarTipoGenero=this.jButtonDuplicarTipoGenero.isVisible();
			this.isVisibilidadCeldaCopiarTipoGenero=this.jButtonCopiarTipoGenero.isVisible();
			this.isVisibilidadCeldaVerFormTipoGenero=this.jButtonVerFormTipoGenero.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoGenero=this.jButtonAbrirOrderByTipoGenero.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=this.jButtonNuevoRelacionesTipoGenero.isVisible();
			this.isVisibilidadCeldaModificarTipoGenero=this.jButtonModificarTipoGenero.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGenero!=null) {
			this.isVisibilidadCeldaActualizarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jButtonActualizarTipoGenero.isVisible();
			this.isVisibilidadCeldaEliminarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jButtonEliminarTipoGenero.isVisible();
			this.isVisibilidadCeldaCancelarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jButtonCancelarTipoGenero.isVisible();
			this.isVisibilidadCeldaGuardarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jButtonGuardarCambiosTipoGenero.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoGenero=this.jButtonGuardarCambiosTablaTipoGenero.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoGenero=this.jButtonNuevoToolBarTipoGenero.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=this.jButtonNuevoRelacionesToolBarTipoGenero.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGenero!=null) {
			this.isVisibilidadCeldaModificarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jButtonModificarToolBarTipoGenero.isVisible();
			this.isVisibilidadCeldaActualizarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jButtonActualizarToolBarTipoGenero.isVisible();
			this.isVisibilidadCeldaEliminarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jButtonEliminarToolBarTipoGenero.isVisible();
			this.isVisibilidadCeldaCancelarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jButtonCancelarToolBarTipoGenero.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGenero=this.jButtonGuardarCambiosToolBarTipoGenero.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGenero=this.jButtonGuardarCambiosTablaToolBarTipoGenero.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoGenero=this.jMenuItemNuevoTipoGenero.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=this.jMenuItemNuevoRelacionesTipoGenero.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGenero!=null) {
			this.isVisibilidadCeldaModificarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jMenuItemModificarTipoGenero.isVisible();
			this.isVisibilidadCeldaActualizarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jMenuItemActualizarTipoGenero.isVisible();
			this.isVisibilidadCeldaEliminarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jMenuItemEliminarTipoGenero.isVisible();
			this.isVisibilidadCeldaCancelarTipoGenero=this.jInternalFrameDetalleFormTipoGenero.jMenuItemCancelarTipoGenero.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGenero=this.jMenuItemGuardarCambiosTipoGenero.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGenero=this.jMenuItemGuardarCambiosTablaTipoGenero.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoGenero(Boolean esInicializar) {
		if(TipoGeneroJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipogeneroSessionBean.getConGuardarRelaciones()) {
				//if(this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGenero();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoGenero(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoGenero() {
		this.jButtonNuevoTipoGenero.setVisible(this.isPermisoNuevoTipoGenero);			
		this.jButtonDuplicarTipoGenero.setVisible(this.isPermisoDuplicarTipoGenero);			
		this.jButtonCopiarTipoGenero.setVisible(this.isPermisoCopiarTipoGenero);			
		this.jButtonVerFormTipoGenero.setVisible(this.isPermisoVerFormTipoGenero);			
		
		this.jButtonAbrirOrderByTipoGenero.setVisible(this.isPermisoOrdenTipoGenero);					
		
		this.jButtonNuevoRelacionesTipoGenero.setVisible(this.isPermisoNuevoTipoGenero);			
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jButtonModificarTipoGenero.setVisible(this.isPermisoActualizarTipoGenero);	
			this.jInternalFrameDetalleFormTipoGenero.jButtonActualizarTipoGenero.setVisible(this.isPermisoActualizarTipoGenero);	
			this.jInternalFrameDetalleFormTipoGenero.jButtonEliminarTipoGenero.setVisible(this.isPermisoEliminarTipoGenero);
			this.jInternalFrameDetalleFormTipoGenero.jButtonCancelarTipoGenero.setVisible(this.isVisibilidadCeldaCancelarTipoGenero);						
			this.jInternalFrameDetalleFormTipoGenero.jButtonGuardarCambiosTipoGenero.setVisible(this.isPermisoGuardarCambiosTipoGenero);							
		}
		
		this.jButtonGuardarCambiosTablaTipoGenero.setVisible(this.isPermisoActualizarTipoGenero);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGenero() {
		this.jInternalFrameDetalleFormTipoGenero.jButtonModificarTipoGenero.setVisible(this.isPermisoActualizarTipoGenero);	
		this.jInternalFrameDetalleFormTipoGenero.jButtonActualizarTipoGenero.setVisible(this.isPermisoActualizarTipoGenero);	
		this.jInternalFrameDetalleFormTipoGenero.jButtonEliminarTipoGenero.setVisible(this.isPermisoEliminarTipoGenero);
		this.jInternalFrameDetalleFormTipoGenero.jButtonCancelarTipoGenero.setVisible(this.isVisibilidadCeldaCancelarTipoGenero);							
		this.jInternalFrameDetalleFormTipoGenero.jButtonGuardarCambiosTipoGenero.setVisible((this.isVisibilidadCeldaGuardarTipoGenero && this.isPermisoGuardarCambiosTipoGenero));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoGenero() {
		if(TipoGeneroJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoGenero();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoGenero() {
	}
	
	public void jTableDatosTipoGeneroListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoGenero(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoGeneroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGenero(this.gettipogenero(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogenero==null) {
						this.tipogenero = new TipoGenero();
					}

					this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);
				}

				if(this.tipogenero.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipogenero.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGenero(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoGeneroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGenero(this.gettipogenero(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogenero==null) {
						this.tipogenero = new TipoGenero();
					}

					this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);
				}

				if(this.tipogenero.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipogenero.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGenero(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoGeneroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGenero(this.gettipogenero(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogenero==null) {
						this.tipogenero = new TipoGenero();
					}

					this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);
				}

				if(this.tipogenero.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipogenero.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGenero(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoGenero() {
		if(this.jInternalFrameDetalleFormTipoGenero!=null) {
		

		if(this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) {
			this.jInternalFrameDetalleFormTipoGenero.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoGenero.dispose();
			this.jInternalFrameDetalleFormTipoGenero=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoGenero!=null) {
			this.jInternalFrameReporteDinamicoTipoGenero.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoGenero.dispose();
			this.jInternalFrameReporteDinamicoTipoGenero=null;
		}
		
		if(this.jInternalFrameImportacionTipoGenero!=null) {
			this.jInternalFrameImportacionTipoGenero.setVisible(false);	    			
			this.jInternalFrameImportacionTipoGenero.dispose();
			this.jInternalFrameImportacionTipoGenero=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoGenero();
			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoGenero")) {
				jButtonNuevoTipoGeneroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoGenero")) {
				jButtonDuplicarTipoGeneroActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoGenero")) {
				jButtonCopiarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoGenero")) {
				jButtonVerFormTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoGenero")) {
				jButtonNuevoTipoGeneroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoGenero")) {
				jButtonDuplicarTipoGeneroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoGenero")) {
				jButtonNuevoTipoGeneroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoGenero")) {
				jButtonDuplicarTipoGeneroActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoGenero")) {
				jButtonNuevoTipoGeneroActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoGenero")) {
				jButtonNuevoTipoGeneroActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoGenero")) {
				jButtonNuevoTipoGeneroActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoGenero")) {
				jButtonModificarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoGenero")) {
				jButtonModificarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoGenero")) {
				jButtonModificarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoGenero")) {
				jButtonActualizarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoGenero")) {
				jButtonActualizarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoGenero")) {
				jButtonActualizarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoGenero")) {
				jButtonEliminarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoGenero")) {
				jButtonEliminarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoGenero")) {
				jButtonEliminarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoGenero")) {
				jButtonCancelarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoGenero")) {
				jButtonCancelarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoGenero")) {
				jButtonCancelarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoGenero")) {
				jButtonCerrarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoGenero")) {
				jButtonCerrarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoGenero")) {
				jButtonCerrarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoGenero")) {
				jButtonMostrarOcultarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoGenero")) {
				jButtonCancelarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoGenero")) {
				jButtonGuardarCambiosTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoGenero")) {
				jButtonGuardarCambiosTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoGenero")) {
				jButtonCopiarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoGenero")) {
				jButtonVerFormTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoGenero")) {
				jButtonGuardarCambiosTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoGenero")) {
				jButtonCopiarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoGenero")) {
				jButtonVerFormTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoGenero")) {
				jButtonGuardarCambiosTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoGenero")) {
				jButtonGuardarCambiosTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoGenero")) {
				jButtonGuardarCambiosTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoGenero")) {
				jButtonRecargarInformacionTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoGenero")) {
				jButtonRecargarInformacionTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoGenero")) {
				jButtonRecargarInformacionTipoGeneroActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoGenero")) {
				jButtonAnterioresTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoGenero")) {
				jButtonAnterioresTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoGenero")) {
				jButtonAnterioresTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoGenero")) {
				jButtonSiguientesTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoGenero")) {
				jButtonSiguientesTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoGenero")) {
				jButtonSiguientesTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoGenero") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoGenero")) {
				jButtonAbrirOrderByTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoGenero") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoGenero")) {
				jButtonMostrarOcultarTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGenero")) {
				jButtonNuevoGuardarCambiosTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoGenero")) {
				jButtonNuevoGuardarCambiosTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoGenero")) {
				jButtonNuevoGuardarCambiosTipoGeneroActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoGenero")) {
				jButtonCerrarReporteDinamicoTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoGenero")) {
				jButtonGenerarReporteDinamicoTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoGenero")) {
				
				jButtonGenerarExcelReporteDinamicoTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoGenero")) {
				jButtonCerrarImportacionTipoGeneroActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoGenero")) {
				
				jButtonGenerarImportacionTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoGenero")) {
				
				jButtonAbrirImportacionTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoGenero")) {
				jComboBoxTiposAccionesTipoGeneroActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoGenero")) {
				jComboBoxTiposRelacionesTipoGeneroActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoGenero")) {
				jComboBoxTiposAccionesTipoGeneroActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoGenero")) {
				
				jComboBoxTiposSeleccionarTipoGeneroActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoGenero")) {
				jTextFieldValorCampoGeneralTipoGeneroActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoGenero")) {
				jButtonAbrirOrderByTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoGenero")) {
				jButtonAbrirOrderByTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoGenero")) {
				jButtonCerrarOrderByTipoGeneroActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGeneroBusqueda")) {
				this.jButtonidTipoGeneroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoGeneroBusqueda")) {
				this.jButtoncodigoTipoGeneroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGeneroBusqueda")) {
				this.jButtonnombreTipoGeneroBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoGenero();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGeneroActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				


				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGenero.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGenero.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoGenero tipogeneroLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipogeneroLocal=this.tipogenero;
			} else {
				tipogeneroLocal=this.tipogeneroAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
							
				
				


				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGenero.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGenero.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGeneroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroAnterior =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogeneroAnterior =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGeneroActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
								
						
				


				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGenero.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGenero.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
								
				
				


				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGenero.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGenero.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGeneroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroAnterior =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogeneroAnterior =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGeneroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroAnterior =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogeneroAnterior =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGeneroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
							
				
				


				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGenero.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGenero.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGeneroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogeneroAnterior =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogeneroAnterior =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGeneroActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
								
				
				


				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGenero.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGenero.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGeneroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroAnterior =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogeneroAnterior =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGeneroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGeneroActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoGenero")) {
					jCheckBoxSeleccionarTodosTipoGeneroItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoGenero")) {
					jCheckBoxSeleccionadosTipoGeneroItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoGenero")) {
					
				}
				
				


				
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGenero.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGenero.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
												
				
				


				
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGenero.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGenero.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGeneroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogeneroAnterior =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogeneroAnterior =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGeneroActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGeneroActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGenero.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGenero.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogenero);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogenero);
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGenero.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGenero.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGeneroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogeneroAnterior =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogeneroAnterior =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoGenero")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoGeneroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoGenero.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipogenero =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipogenero =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipogenero);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoGenero")) {
				
				}
				
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoGenero")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoGenero.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoGenero")) {
			
			}
			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoGenero();
			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			
			if(sTipo.equals("NuevoTipoGenero")) {
				jButtonNuevoTipoGeneroActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoGenero")) {
				jButtonDuplicarTipoGeneroActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoGenero")) {
				jButtonCopiarTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoGenero")) {
				jButtonVerFormTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoGenero")) {
				jButtonNuevoTipoGeneroActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoGenero")) {
				jButtonModificarTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoGenero")) {
				jButtonActualizarTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoGenero")) {
				jButtonEliminarTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoGenero")) {
				jButtonGuardarCambiosTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoGenero")) {
				jButtonCancelarTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoGenero")) {
				jButtonCerrarTipoGeneroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoGenero")) {
				jButtonGuardarCambiosTipoGeneroActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGenero")) {
				jButtonNuevoGuardarCambiosTipoGeneroActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoGenero")) {
				jButtonAbrirOrderByTipoGeneroActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoGenero")) {
				jButtonRecargarInformacionTipoGeneroActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoGenero")) {
				jButtonAnterioresTipoGeneroActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoGenero")) {
				jButtonSiguientesTipoGeneroActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGeneroBusqueda")) {
				this.jButtonidTipoGeneroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoGeneroBusqueda")) {
				this.jButtoncodigoTipoGeneroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGeneroBusqueda")) {
				this.jButtonnombreTipoGeneroBusquedaActionPerformed(evt);
			}
			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoGenero();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoGenero")) {
				closingInternalFrameTipoGenero();
				
			} else if(sTipo.equals("jButtonCancelarTipoGenero")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoGenero = (JInternalFrameBase)evt.getSource();
	            	
	            TipoGeneroBeanSwingJInternalFrame jInternalFrameParent=(TipoGeneroBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGenero.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoGeneroActionPerformed(null);
			}
			
			TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogenero,new Object(),this.tipogeneroParameterGeneral,this.tipogeneroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoGenero(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoGenero(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoGenero(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipogenero)) {
			if(!esControlTabla) {
				if(TipoGeneroJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);			
				}
				
				if(this.tipogeneroSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoGenero(this.tipogenero,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogeneroReturnGeneral=tipogeneroLogic.procesarEventosTipoGenerosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogeneroLogic.getTipoGeneros(),this.tipogenero,this.tipogeneroParameterGeneral,this.isEsNuevoTipoGenero,classes);//this.tipogeneroLogic.getTipoGenero()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoGenero(this.tipogeneroReturnGeneral,this.tipogeneroBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipogeneroSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoGenero(classes,this.tipogeneroReturnGeneral,this.tipogeneroBean,false);
					}
						
					if(this.tipogeneroReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoGenero(this.tipogeneroReturnGeneral.getTipoGenero());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoGenero(this.tipogeneroReturnGeneral.getTipoGenero());	
					}
						
					if(this.tipogeneroReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoGenero(this.tipogeneroReturnGeneral.getTipoGenero(),classes);//this.tipogeneroBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoGenero(this.tipogenero,classes);//this.tipogeneroBean);									
				}
			
				if(TipoGeneroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoGenero(this.tipogenero,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGenero(this.tipogenero);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipogeneroAnterior!=null) {
						this.tipogenero=this.tipogeneroAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogeneroReturnGeneral=tipogeneroLogic.procesarEventosTipoGenerosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogeneroLogic.getTipoGeneros(),this.tipogenero,this.tipogeneroParameterGeneral,this.isEsNuevoTipoGenero,classes);//this.tipogeneroLogic.getTipoGenero()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogeneroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogeneroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipogeneroReturnGeneral.getTipoGenero(),tipogeneroLogic.getTipoGeneros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipogeneroReturnGeneral.getTipoGenero(),this.tipogeneros);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoGenero.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoGenero.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoGenero();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoGenero() throws Exception {
		
		TipoGeneroModel tipogeneroModel=(TipoGeneroModel)this.jTableDatosTipoGenero.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogeneroModel.tipogeneros=this.tipogeneroLogic.getTipoGeneros();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipogeneroModel.tipogeneros=this.tipogeneros;
		}
		
		
		((TipoGeneroModel) this.jTableDatosTipoGenero.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoGenero() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipogeneroAnterior(),this.tipogeneroLogic.getTipoGeneros());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipogeneroAnterior(),this.tipogeneros);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoGenero();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoGenero(TipoGenero tipogenero,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(tipogenero.getClientes());
					this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar_NM.class)) {
					this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.setCargaFamiliar_NMs(tipogenero.getCargaFamiliar_NMs());
					this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(tipogenero.getSubClientes());
					this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(tipogenero.getEmpleados());
					this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(tipogenero.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar.class)) {
					this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.setCargaFamiliars(tipogenero.getCargaFamiliars());
					this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogenero,new Object(),generalEntityParameterGeneral,this.tipogeneroReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipogeneroSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoGeneroConstantesFunciones.getClassesRelationshipsOfTipoGenero(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoGeneroConstantesFunciones.getClassesRelationshipsFromStringsOfTipoGenero(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoGenero(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoGeneroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogenero,new Object(),generalEntityParameterGeneral,this.tipogeneroReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoGenero(TipoGeneroBean tipogeneroBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(tipogenero.getClientes());
					this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar_NM.class)) {
					this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.setCargaFamiliar_NMs(tipogenero.getCargaFamiliar_NMs());
					this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.subclienteLogic.setSubClientes(tipogenero.getSubClientes());
					this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(tipogenero.getEmpleados());
					this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(tipogenero.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar.class)) {
					this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.setCargaFamiliars(tipogenero.getCargaFamiliars());
					this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoGenero(ArrayList<Classe> classes,TipoGeneroReturnGeneral tipogeneroReturnGeneral,TipoGeneroBean tipogeneroBean,Boolean conDefault) throws Exception {
		
			this.tipogeneroBean.setClientes(tipogeneroReturnGeneral.getTipoGenero().getClientes());
			this.tipogeneroBean.setCargaFamiliar_NMs(tipogeneroReturnGeneral.getTipoGenero().getCargaFamiliar_NMs());
			this.tipogeneroBean.setSubClientes(tipogeneroReturnGeneral.getTipoGenero().getSubClientes());
			this.tipogeneroBean.setEmpleados(tipogeneroReturnGeneral.getTipoGenero().getEmpleados());
			this.tipogeneroBean.setParametroCarteraDefectos(tipogeneroReturnGeneral.getTipoGenero().getParametroCarteraDefectos());
			this.tipogeneroBean.setCargaFamiliars(tipogeneroReturnGeneral.getTipoGenero().getCargaFamiliars());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoGenero(TipoGenero tipogenero,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					tipogenero.setClientes(this.jInternalFrameDetalleFormTipoGenero.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar_NM.class)) {
					tipogenero.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubCliente.class)) {
					tipogenero.setSubClientes(this.jInternalFrameDetalleFormTipoGenero.subclienteBeanSwingJInternalFrame.subclienteLogic.getSubClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					tipogenero.setEmpleados(this.jInternalFrameDetalleFormTipoGenero.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					tipogenero.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar.class)) {
					tipogenero.setCargaFamiliars(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipogenero)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoGenero = new TipoGeneroDetalleFormJInternalFrame(jDesktopPane,this.tipogeneroSessionBean.getConGuardarRelaciones(),this.tipogeneroSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGenero);
		this.jInternalFrameDetalleFormTipoGenero.setVisible(false);
		this.jInternalFrameDetalleFormTipoGenero.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoGenero.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoGenero.tipogeneroLogic=this.tipogeneroLogic;
		
		this.cargarCombosFrameForeignKeyTipoGenero("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGenero();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGenero();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoGenero("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoGenero();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoGenero.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGenero"));
		
		this.jInternalFrameDetalleFormTipoGenero.jButtonModificarTipoGenero.addActionListener(new ButtonActionListener(this,"ModificarTipoGenero"));

		
		this.jInternalFrameDetalleFormTipoGenero.jButtonModificarToolBarTipoGenero.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGenero"));
					
		this.jInternalFrameDetalleFormTipoGenero.jMenuItemModificarTipoGenero.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGenero"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGenero.jButtonActualizarTipoGenero.addActionListener (new ButtonActionListener(this,"ActualizarTipoGenero"));
		
		
		this.jInternalFrameDetalleFormTipoGenero.jButtonActualizarToolBarTipoGenero.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGenero"));
						
		this.jInternalFrameDetalleFormTipoGenero.jMenuItemActualizarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGenero"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGenero.jButtonEliminarTipoGenero.addActionListener (new ButtonActionListener(this,"EliminarTipoGenero"));
		
		
		this.jInternalFrameDetalleFormTipoGenero.jButtonEliminarToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGenero"));
								
		this.jInternalFrameDetalleFormTipoGenero.jMenuItemEliminarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGenero"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGenero.jButtonCancelarTipoGenero.addActionListener (new ButtonActionListener(this,"CancelarTipoGenero"));
		
		
		this.jInternalFrameDetalleFormTipoGenero.jButtonCancelarToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGenero"));
					
		this.jInternalFrameDetalleFormTipoGenero.jMenuItemCancelarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGenero"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoGenero.jMenuItemDetalleCerrarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGenero"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGenero.jButtonGuardarCambiosToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGenero"));
		
		
		
		this.jInternalFrameDetalleFormTipoGenero.jButtonGuardarCambiosToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGenero"));
		
		
		
		this.jInternalFrameDetalleFormTipoGenero.jComboBoxTiposAccionesFormularioTipoGenero.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGenero"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGenero.jButtonidTipoGeneroBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGeneroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGenero.jButtoncodigoTipoGeneroBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGeneroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGenero.jButtonnombreTipoGeneroBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGeneroBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGenero"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoGenero"));
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGenero"));
		}
		
		this.jTableDatosTipoGenero.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoGenero"));
		
		this.jTableDatosTipoGenero.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoGenero"));
		
		this.jButtonNuevoTipoGenero.addActionListener(new ButtonActionListener(this,"NuevoTipoGenero"));
		
		this.jButtonDuplicarTipoGenero.addActionListener(new ButtonActionListener(this,"DuplicarTipoGenero"));
		
		this.jButtonCopiarTipoGenero.addActionListener(new ButtonActionListener(this,"CopiarTipoGenero"));
		
		this.jButtonVerFormTipoGenero.addActionListener(new ButtonActionListener(this,"VerFormTipoGenero"));
		
		
		this.jButtonNuevoToolBarTipoGenero.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoGenero"));
			
		this.jButtonDuplicarToolBarTipoGenero.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoGenero"));
			
		this.jMenuItemNuevoTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoGenero"));
			
		this.jMenuItemDuplicarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoGenero"));		
		
		
		this.jButtonNuevoRelacionesTipoGenero.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoGenero"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoGenero.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoGenero"));
			
		this.jMenuItemNuevoRelacionesTipoGenero.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoGenero"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jButtonModificarTipoGenero.addActionListener(new ButtonActionListener(this,"ModificarTipoGenero"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jButtonModificarToolBarTipoGenero.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGenero"));
			
			this.jInternalFrameDetalleFormTipoGenero.jMenuItemModificarTipoGenero.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGenero"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoGenero.jButtonActualizarTipoGenero.addActionListener (new ButtonActionListener(this,"ActualizarTipoGenero"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jButtonActualizarToolBarTipoGenero.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGenero"));
				
			this.jInternalFrameDetalleFormTipoGenero.jMenuItemActualizarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGenero"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jButtonEliminarTipoGenero.addActionListener (new ButtonActionListener(this,"EliminarTipoGenero"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jButtonEliminarToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGenero"));
						
			this.jInternalFrameDetalleFormTipoGenero.jMenuItemEliminarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGenero"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jButtonCancelarTipoGenero.addActionListener (new ButtonActionListener(this,"CancelarTipoGenero"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jButtonCancelarToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGenero"));
			
			this.jInternalFrameDetalleFormTipoGenero.jMenuItemCancelarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGenero"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoGenero"));		
		
		
		this.jButtonCerrarTipoGenero.addActionListener (new ButtonActionListener(this,"CerrarTipoGenero"));
		
		
		this.jButtonCerrarToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoGenero"));
			
		this.jMenuItemCerrarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoGenero"));
			
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jMenuItemDetalleCerrarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGenero"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jButtonGuardarCambiosTipoGenero.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoGenero"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jButtonGuardarCambiosToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGenero"));
		}
		
		this.jButtonCopiarToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoGenero"));
			
		this.jButtonVerFormToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoGenero"));
		
		this.jMenuItemGuardarCambiosTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoGenero"));
			
		this.jMenuItemCopiarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoGenero"));		
		
		this.jMenuItemVerFormTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoGenero"));		
		
		
		this.jButtonGuardarCambiosTablaTipoGenero.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGenero"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoGenero"));
			
		this.jMenuItemGuardarCambiosTablaTipoGenero.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGenero"));		
		
		
		
		this.jButtonRecargarInformacionTipoGenero.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoGenero"));
					
		this.jButtonRecargarInformacionToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoGenero"));
		
		this.jMenuItemRecargarInformacionTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoGenero"));		
		
		
		
		this.jButtonAnterioresTipoGenero.addActionListener (new ButtonActionListener(this,"AnterioresTipoGenero"));
		
		
		this.jButtonAnterioresToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoGenero"));
		
		this.jMenuItemAnterioresTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoGenero"));		
		
		
		this.jButtonSiguientesTipoGenero.addActionListener (new ButtonActionListener(this,"SiguientesTipoGenero"));
		
		
		this.jButtonSiguientesToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoGenero"));
			
		this.jMenuItemSiguientesTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoGenero"));
			
		this.jMenuItemAbrirOrderByTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoGenero"));
			
		this.jMenuItemMostrarOcultarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoGenero"));
			
		this.jMenuItemDetalleAbrirOrderByTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoGenero"));
			
		this.jMenuItemDetalleMostarOcultarTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoGenero"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoGenero.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoGenero"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoGenero"));
			
		this.jMenuItemNuevoGuardarCambiosTipoGenero.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoGenero"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoGenero.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoGenero"));

		this.jCheckBoxSeleccionadosTipoGenero.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoGenero"));
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jComboBoxTiposAccionesFormularioTipoGenero.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGenero"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoGenero.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoGenero"));
			
		this.jComboBoxTiposAccionesTipoGenero.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoGenero"));
					
		this.jComboBoxTiposSeleccionarTipoGenero.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoGenero"));
			
		this.jTextFieldValorCampoGeneralTipoGenero.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoGenero"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGenero.jButtonidTipoGeneroBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGeneroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGenero.jButtoncodigoTipoGeneroBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGeneroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGenero.jButtonnombreTipoGeneroBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGeneroBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoGenero!=null) {
				this.jInternalFrameReporteDinamicoTipoGenero.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGenero"));
				this.jInternalFrameReporteDinamicoTipoGenero.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGenero"));
				this.jInternalFrameReporteDinamicoTipoGenero.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGenero"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoGenero.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGenero"));				
			//this.jButtonGenerarReporteDinamicoTipoGenero.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGenero"));
			//this.jButtonGenerarExcelReporteDinamicoTipoGenero.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGenero"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoGenero!=null) {
				this.jInternalFrameImportacionTipoGenero.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGenero"));
				this.jInternalFrameImportacionTipoGenero.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGenero"));
				this.jInternalFrameImportacionTipoGenero.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGenero"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoGenero.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoGenero"));
			
			this.jButtonAbrirOrderByToolBarTipoGenero.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoGenero"));			
			
			if(this.jInternalFrameOrderByTipoGenero!=null) {
				this.jInternalFrameOrderByTipoGenero.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGenero"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoGenero!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGenero.jTabbedPaneRelacionesTipoGenero.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGenero"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameTipoGenero();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoGenero.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoGenero = (JInternalFrameBase)event.getSource();
	            	
	            TipoGeneroBeanSwingJInternalFrame jInternalFrameParent=(TipoGeneroBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGenero.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoGeneroActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoGenero.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoGeneroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoGenero.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoGenero.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGeneroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGeneroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGeneroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoGenero";
		inputMap = this.jButtonNuevoTipoGenero.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoGenero.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGeneroActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGeneroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGeneroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGeneroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoGenero";
		inputMap = this.jButtonNuevoRelacionesTipoGenero.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoGenero.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGeneroActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoGenero";
		inputMap = this.jButtonModificarTipoGenero.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoGenero.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoGeneroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoGenero";
		inputMap = this.jButtonActualizarTipoGenero.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoGenero.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoGeneroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoGenero";
		inputMap = this.jButtonEliminarTipoGenero.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoGenero.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoGeneroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoGenero";
		inputMap = this.jButtonCancelarTipoGenero.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoGenero.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoGeneroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoGenero";
		inputMap = this.jButtonCerrarTipoGenero.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoGenero.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoGeneroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoGenero.jButtonGuardarCambiosTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoGenero";
		inputMap = this.jInternalFrameDetalleFormTipoGenero.jButtonGuardarCambiosTipoGenero.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoGenero.jButtonGuardarCambiosTipoGenero.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoGeneroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoGenero.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoGeneroItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoGenero.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoGeneroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoGenero.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoGeneroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoGenero.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoGeneroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGenero.jButtonidTipoGeneroBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGeneroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGenero.jButtoncodigoTipoGeneroBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGeneroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGenero.jButtonnombreTipoGeneroBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGeneroBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoGenero.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoGeneroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoGeneroActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoGenero.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoGenero(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoGenero tipogeneroAux:this.tipogeneroLogic.getTipoGeneros()) {
					tipogeneroAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGenero tipogeneroAux:tipogeneros) {
					tipogeneroAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoGeneroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGenero(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGenero tipogeneroAux:this.tipogeneroLogic.getTipoGeneros()) {
						tipogeneroAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGenero tipogeneroAux:tipogeneros) {
						tipogeneroAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoGenero tipogeneroAux:this.tipogeneroLogic.getTipoGeneros()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGenero tipogeneroAux:tipogeneros) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGenero(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGenero.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGenero.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGenero,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoGeneroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGenero(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoGenero.getSelectedRows();
			
			TipoGenero tipogeneroLocal=new TipoGenero();
			
			//this.seleccionarTodosTipoGenero(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogeneroLocal =(TipoGenero) this.tipogeneroLogic.getTipoGeneros().toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipogeneroLocal =(TipoGenero) this.tipogeneros.toArray()[this.jTableDatosTipoGenero.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipogeneroLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGenero tipogeneroAux:this.tipogeneroLogic.getTipoGeneros()) {
						tipogeneroAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGenero tipogeneroAux:tipogeneros) {
						tipogeneroAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoGenero(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGenero.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGenero.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGenero,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoGeneroItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoGeneroParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoGeneroActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoGenero(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoGenero.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGenero tipogeneroAux:this.tipogeneroLogic.getTipoGeneros()) {
				
						if(sTipoSeleccionar.equals(TipoGeneroConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipogeneroAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGeneroConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogeneroAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGenero tipogeneroAux:tipogeneros) {
					
						if(sTipoSeleccionar.equals(TipoGeneroConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipogeneroAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGeneroConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogeneroAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGenero(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoGeneroActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoGenero(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoGenero=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoGenero.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoGenero.jComboBoxTiposAccionesFormularioTipoGenero.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoGenero) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoGenero(conSplash);
				
					this.generarReporteTipoGenerosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGenero.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGenero.jComboBoxTiposAccionesFormularioTipoGenero.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoGenerosSeleccionados();
				//this.jComboBoxTiposAccionesTipoGenero.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGenerosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoGenero.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGenerosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoGenero.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGenero();
				
				this.exportarTipoGenerosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGenero.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGenero.jComboBoxTiposAccionesFormularioTipoGenero.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoGeneros();
				//this.importarTipoGeneros();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGenero.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGenero.jComboBoxTiposAccionesFormularioTipoGenero.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGenero();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoGenerosSeleccionados();
				//this.jComboBoxTiposAccionesTipoGenero.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Genero", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoGenero();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoGenero)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoGenero(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Genero",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGenero.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGenero.jComboBoxTiposAccionesFormularioTipoGenero.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoGenero();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoGenero(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoGeneroActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoGenero();
			
			if(this.jInternalFrameDetalleFormTipoGenero==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();		
			TipoGenero tipogenero=new TipoGenero();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoGenero(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoGenero.getSelectedItem();
			
			
			
			
			tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipogenerosSeleccionados.size()==1) {
				for(TipoGenero tipogeneroAux:tipogenerosSeleccionados) {
					tipogenero=tipogeneroAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,tipogenero);
				}
				else if(this.sTipoRelacion.equals("Carga Familiar_ N M")) {
					jButtonCargaFamiliar_NMActionPerformed(null,rowIndex,true,false,tipogenero);
				}
				else if(this.sTipoRelacion.equals("Sub Cliente")) {
					jButtonSubClienteActionPerformed(null,rowIndex,true,false,tipogenero);
				}
				else if(this.sTipoRelacion.equals("Empleado")) {
					jButtonEmpleadoActionPerformed(null,rowIndex,true,false,tipogenero);
				}
				else if(this.sTipoRelacion.equals("Parametro Cartera Defecto")) {
					jButtonParametroCarteraDefectoActionPerformed(null,rowIndex,true,false,tipogenero);
				}
				else if(this.sTipoRelacion.equals("Carga Familiar")) {
					jButtonCargaFamiliarActionPerformed(null,rowIndex,true,false,tipogenero);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoGenero();
			
      		//this.finishProcessTipoGenero(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoGeneroReturnGeneral() throws Exception {
		if(this.tipogeneroReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipogeneroReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipogeneroReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipogeneroReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipogeneroReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipogeneroReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoGenero(false);
		}
		
		if(this.tipogeneroReturnGeneral.getConRetornoLista() || this.tipogeneroReturnGeneral.getConRetornoObjeto()) {
			if(this.tipogeneroReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogeneroLogic.setTipoGeneros(this.tipogeneroReturnGeneral.getTipoGeneros());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipogeneroReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogeneroLogic.setTipoGenero(this.tipogeneroReturnGeneral.getTipoGenero());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoGenero(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoGenero() throws Exception {
		
		
	}
	
	public ArrayList<TipoGenero> getTipoGenerosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoGenero) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoGenero tipogeneroAux:tipogeneroLogic.getTipoGeneros()) {
					if(tipogeneroAux.getIsSelected()) {
						tipogenerosSeleccionados.add(tipogeneroAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGenero tipogeneroAux:this.tipogeneros) {
					if(tipogeneroAux.getIsSelected()) {
						tipogenerosSeleccionados.add(tipogeneroAux);				
					}
				}
			}
			
			if(tipogenerosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipogenerosSeleccionados.addAll(this.tipogeneroLogic.getTipoGeneros());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipogenerosSeleccionados.addAll(this.tipogeneros);				
					}
				}
			}
		} else {
			tipogenerosSeleccionados.add(this.tipogenero);
		}
		
		return tipogenerosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteTipoGenerosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoGenerosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoGenerosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGenerosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGenerosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoGenerosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Genero",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoGenerosSeleccionados() throws Exception {
		ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();		
		
		tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoGeneros("Todos",tipogenerosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoGenerosSeleccionados() throws Exception {
		ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();		
		
		tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoGeneros("Todos",tipogenerosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoGenerosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();
		
		tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoGeneros("Todos",tipogenerosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoGenerosSeleccionados() throws Exception {
		ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoGenero();
		
		
		tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoGenero();
		
		
		//this.generarReporteTipoGeneros("Todos",tipogenerosSeleccionados ,tipogeneroImplementable,tipogeneroImplementableHome);
	}
	
	public void mostrarImportacionTipoGeneros() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoGenero();
		
		this.abrirFrameImportacionTipoGenero();		
		
			
		//this.generarReporteTipoGeneros("Todos",tipogenerosSeleccionados ,tipogeneroImplementable,tipogeneroImplementableHome);
	}
	
	public void importarTipoGeneros() throws Exception {		
	
	}
	
	public void exportarTipoGenerosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoGenerosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoGenerosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoGenerosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Genero",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoGenerosSeleccionados() throws Exception {
		ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();		
		
		tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogenero."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoGenero(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoGenero tipogeneroAux:tipogenerosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoGenero(tipogeneroAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipogeneroAux.setsDetalleGeneralEntityReporte(tipogeneroAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Genero",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoGenero(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoGeneroConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGeneroConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGeneroConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGeneroConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoGenero(TipoGenero tipogenero,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipogenero.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogenero.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogenero.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogenero.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoGenerosSeleccionados() throws Exception {
		ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();		
		
		tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogenero.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoGeneros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoGenero(row);				
				iRow++;
			}				
			
			for(TipoGenero tipogeneroAux:tipogenerosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoGenero(tipogeneroAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Genero",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoGenerosSeleccionados() throws Exception {
		ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();		
		
		tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogenero.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipogeneros");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipogenero");
			//elementRoot.appendChild(element);
		
			for(TipoGenero tipogeneroAux:tipogenerosSeleccionados) {
				element = document.createElement("tipogenero");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoGenero(tipogeneroAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Genero",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoGenero(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGeneroConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGeneroConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoGeneroConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGeneroConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoGenero(TipoGenero tipogenero,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipogenero.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogenero.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogenero.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoGenero(TipoGenero tipogenero,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoGeneroConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipogenero.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoGeneroConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipogenero.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoGeneroConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipogenero.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoGeneroConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipogenero.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoGenerosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoGenero> tipogenerosSeleccionados=new ArrayList<TipoGenero>();
		
		tipogenerosSeleccionados=this.getTipoGenerosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoTipoGenero(tipogenerosSeleccionados);
		
		this.generarReporteTipoGeneros("Todos",tipogenerosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoGenero(ArrayList<TipoGenero> tipogenerosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoGenero tipogeneroAux:tipogenerosSeleccionados) {
				tipogeneroAux.setsDetalleGeneralEntityReporte(tipogeneroAux.toString());
			
				if(sTipoSeleccionar.equals(TipoGeneroConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipogeneroAux.setsDescripcionGeneralEntityReporte1(tipogeneroAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoGeneroConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipogeneroAux.setsDescripcionGeneralEntityReporte1(tipogeneroAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGeneroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoGenero(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoGenero=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoGenero=true;
				this.isVisibilidadCeldaGuardarCambiosTipoGenero=true;
			}
			
			this.isVisibilidadCeldaModificarTipoGenero=false;
			this.isVisibilidadCeldaActualizarTipoGenero=false;
			this.isVisibilidadCeldaEliminarTipoGenero=false;
			this.isVisibilidadCeldaCancelarTipoGenero=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGenero=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGenero=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoGenero=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGenero=false;
			this.isVisibilidadCeldaModificarTipoGenero=false;
			this.isVisibilidadCeldaActualizarTipoGenero=true;
			this.isVisibilidadCeldaEliminarTipoGenero=false;
			this.isVisibilidadCeldaCancelarTipoGenero=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGenero=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGenero=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoGenero=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGenero=false;
			this.isVisibilidadCeldaModificarTipoGenero=false;
			this.isVisibilidadCeldaActualizarTipoGenero=true;
			this.isVisibilidadCeldaEliminarTipoGenero=true;
			this.isVisibilidadCeldaCancelarTipoGenero=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGenero=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGenero=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoGenero=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGenero=false;
			this.isVisibilidadCeldaModificarTipoGenero=false;
			this.isVisibilidadCeldaActualizarTipoGenero=true;
			this.isVisibilidadCeldaEliminarTipoGenero=false;
			this.isVisibilidadCeldaCancelarTipoGenero=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGenero=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGenero=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoGenero=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGenero=true;
			this.isVisibilidadCeldaModificarTipoGenero=false;
			this.isVisibilidadCeldaActualizarTipoGenero=false;
			this.isVisibilidadCeldaEliminarTipoGenero=false;
			this.isVisibilidadCeldaCancelarTipoGenero=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGenero=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGenero=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoGenero=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGenero=false;
			this.isVisibilidadCeldaActualizarTipoGenero=false;
			this.isVisibilidadCeldaEliminarTipoGenero=false;
			this.isVisibilidadCeldaCancelarTipoGenero=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGenero=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGenero=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoGenero=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGenero=false;
			this.isVisibilidadCeldaModificarTipoGenero=true;
			this.isVisibilidadCeldaActualizarTipoGenero=false;
			this.isVisibilidadCeldaEliminarTipoGenero=false;
			this.isVisibilidadCeldaCancelarTipoGenero=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGenero=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGenero=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoGeneroJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoGenero=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGenero=true;
		} else {
			this.actualizarEstadoPanelsTipoGenero(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoGenero=false;
			//this.isVisibilidadCeldaVerFormTipoGenero=false;
			this.isVisibilidadCeldaDuplicarTipoGenero=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipogeneroSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoGenero=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGenero=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipogeneroSessionBean.getEsGuardarRelacionado()) {
			if(!tipogeneroSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoGenero=false;												
			}
			
			this.jButtonCerrarTipoGenero.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGenero=false;
		}
		
		if(!this.permiteMantenimiento(this.tipogenero)) {
			this.isVisibilidadCeldaActualizarTipoGenero=false;
			this.isVisibilidadCeldaEliminarTipoGenero=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGenero() {
		this.isVisibilidadCeldaNuevoTipoGenero=false;
		this.isVisibilidadCeldaGuardarCambiosTipoGenero=false;
	}
	
	public void actualizarEstadoPanelsTipoGenero(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoGenero!=null) {
				this.jScrollPanelDatosEdicionTipoGenero.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGenero!=null) {
				this.jScrollPanelDatosTipoGenero.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGenero!=null) {
				this.jPanelPaginacionTipoGenero.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGenero!=null) {
				this.jPanelParametrosReportesTipoGenero.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoGenero!=null) {
				this.jScrollPanelDatosEdicionTipoGenero.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoGenero!=null) {
				this.jScrollPanelDatosTipoGenero.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGenero!=null) {
				this.jPanelPaginacionTipoGenero.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGenero!=null) {
				this.jPanelParametrosReportesTipoGenero.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoGenero!=null) {
				this.jScrollPanelDatosEdicionTipoGenero.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoGenero!=null) {
				this.jScrollPanelDatosTipoGenero.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGenero!=null) {
				this.jPanelPaginacionTipoGenero.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGenero!=null) {
				this.jPanelParametrosReportesTipoGenero.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoGenero!=null) {
				this.jScrollPanelDatosEdicionTipoGenero.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGenero!=null) {
				this.jScrollPanelDatosTipoGenero.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGenero!=null) {
				this.jPanelPaginacionTipoGenero.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGenero!=null) {
				this.jPanelParametrosReportesTipoGenero.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoGenero!=null) {
				this.jScrollPanelDatosEdicionTipoGenero.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGenero!=null) {
				this.jScrollPanelDatosTipoGenero.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGenero!=null) {
				this.jPanelPaginacionTipoGenero.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGenero!=null) {
				this.jPanelParametrosReportesTipoGenero.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoGenero!=null) {
				this.jScrollPanelDatosEdicionTipoGenero.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoGenero!=null) {
				this.jScrollPanelDatosTipoGenero.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGenero!=null) {
				this.jPanelPaginacionTipoGenero.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGenero!=null) {
				this.jPanelParametrosReportesTipoGenero.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoGenero!=null) {
				this.jScrollPanelDatosEdicionTipoGenero.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoGenero!=null) {
				this.jScrollPanelDatosTipoGenero.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGenero!=null) {
				this.jPanelPaginacionTipoGenero.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGenero!=null) {
				this.jPanelParametrosReportesTipoGenero.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoGeneroParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.tipogeneroSessionBean==null) {
				this.tipogeneroSessionBean=new TipoGeneroSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGenero.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGenero.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGenero.clienteSessionBean.setsPathNavegacionActual(tipogeneroSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGenero.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormTipoGenero.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGenero.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormTipoGenero.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(TipoGeneroConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGenero.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoGenero(true);
			this.jInternalFrameDetalleFormTipoGenero.clienteSessionBean.setlidTipoGeneroActual(this.idTipoGeneroActual);

			tipogeneroSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGenero(true);
			tipogeneroSessionBean.setlIdTipoGeneroActualForeignKey(this.idTipoGeneroActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoGeneroParaCargaFamiliar_NMes() throws Exception {
		Boolean isPaginaPopupCargaFamiliar_NM=false;

		try {

			if(this.tipogeneroSessionBean==null) {
				this.tipogeneroSessionBean=new TipoGeneroSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmSessionBean.setsPathNavegacionActual(tipogeneroSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCargaFamiliar_NM=this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM(true);
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM(TipoGeneroConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmSessionBean.setisBusquedaDesdeForeignKeySesionTipoGenero(true);
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliar_nmSessionBean.setlidTipoGeneroActual(this.idTipoGeneroActual);

			tipogeneroSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGenero(true);
			tipogeneroSessionBean.setlIdTipoGeneroActualForeignKey(this.idTipoGeneroActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoGeneroParaSubClientes() throws Exception {
		Boolean isPaginaPopupSubCliente=false;

		try {

			if(this.tipogeneroSessionBean==null) {
				this.tipogeneroSessionBean=new TipoGeneroSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGenero.subclienteSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGenero.subclienteSessionBean=new SubClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGenero.subclienteSessionBean.setsPathNavegacionActual(tipogeneroSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SubClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGenero.subclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSubCliente=this.jInternalFrameDetalleFormTipoGenero.subclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGenero.subclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSubCliente(true);
			this.jInternalFrameDetalleFormTipoGenero.subclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSubCliente(TipoGeneroConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGenero.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoGenero(true);
			this.jInternalFrameDetalleFormTipoGenero.subclienteSessionBean.setlidTipoGeneroActual(this.idTipoGeneroActual);

			tipogeneroSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGenero(true);
			tipogeneroSessionBean.setlIdTipoGeneroActualForeignKey(this.idTipoGeneroActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoGeneroParaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(this.tipogeneroSessionBean==null) {
				this.tipogeneroSessionBean=new TipoGeneroSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGenero.empleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGenero.empleadoSessionBean=new EmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGenero.empleadoSessionBean.setsPathNavegacionActual(tipogeneroSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGenero.empleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleado=this.jInternalFrameDetalleFormTipoGenero.empleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGenero.empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			this.jInternalFrameDetalleFormTipoGenero.empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(TipoGeneroConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGenero.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoGenero(true);
			this.jInternalFrameDetalleFormTipoGenero.empleadoSessionBean.setlidTipoGeneroActual(this.idTipoGeneroActual);

			tipogeneroSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGenero(true);
			tipogeneroSessionBean.setlIdTipoGeneroActualForeignKey(this.idTipoGeneroActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoGeneroParaParametroCarteraDefectos() throws Exception {
		Boolean isPaginaPopupParametroCarteraDefecto=false;

		try {

			if(this.tipogeneroSessionBean==null) {
				this.tipogeneroSessionBean=new TipoGeneroSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoSessionBean.setsPathNavegacionActual(tipogeneroSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroCarteraDefecto=this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(true);
			this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(TipoGeneroConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoGenero(true);
			this.jInternalFrameDetalleFormTipoGenero.parametrocarteradefectoSessionBean.setlidTipoGeneroActual(this.idTipoGeneroActual);

			tipogeneroSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGenero(true);
			tipogeneroSessionBean.setlIdTipoGeneroActualForeignKey(this.idTipoGeneroActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoGeneroParaCargaFamiliares() throws Exception {
		Boolean isPaginaPopupCargaFamiliar=false;

		try {

			if(this.tipogeneroSessionBean==null) {
				this.tipogeneroSessionBean=new TipoGeneroSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGenero.cargafamiliarSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGenero.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGenero.cargafamiliarSessionBean.setsPathNavegacionActual(tipogeneroSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliarSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCargaFamiliar=this.jInternalFrameDetalleFormTipoGenero.cargafamiliarSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliarSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar(true);
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliarSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar(TipoGeneroConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliarSessionBean.setisBusquedaDesdeForeignKeySesionTipoGenero(true);
			this.jInternalFrameDetalleFormTipoGenero.cargafamiliarSessionBean.setlidTipoGeneroActual(this.idTipoGeneroActual);

			tipogeneroSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGenero(true);
			tipogeneroSessionBean.setlIdTipoGeneroActualForeignKey(this.idTipoGeneroActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoGeneroSessionBean tipogeneroSessionBean=new TipoGeneroSessionBean();
		
		if(this.tipogeneroSessionBean==null) {
			this.tipogeneroSessionBean=new TipoGeneroSessionBean();
		}
		
		this.tipogeneroSessionBean.setsUltimaBusquedaTipoGenero(this.getsAccionBusqueda());
		this.tipogeneroSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipogeneroSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoGeneroSessionBean tipogeneroSessionBean=new TipoGeneroSessionBean();
		
		if(this.tipogeneroSessionBean==null) {
			this.tipogeneroSessionBean=new TipoGeneroSessionBean();
		}
		
		if(this.tipogeneroSessionBean.getsUltimaBusquedaTipoGenero()!=null&&!this.tipogeneroSessionBean.getsUltimaBusquedaTipoGenero().equals("")) {
			this.setsAccionBusqueda(tipogeneroSessionBean.getsUltimaBusquedaTipoGenero());
			this.setiNumeroPaginacion(tipogeneroSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipogeneroSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipogeneroSessionBean.setsUltimaBusquedaTipoGenero("");
		this.tipogeneroSessionBean.setiNumeroPaginacion(TipoGeneroConstantesFunciones.INUMEROPAGINACION);
		this.tipogeneroSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoGenero(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoGenero() {
		this.updateBorderResaltarBusquedasFormularioTipoGenero();
		this.updateVisibilidadBusquedasFormularioTipoGenero();
		this.updateHabilitarBusquedasFormularioTipoGenero();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoGenero() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoGenero() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoGenero() {
	}
	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioTipoGenero() throws Exception {

		if(this.jInternalFrameDetalleFormTipoGenero==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoGenero();
		this.updateVisibilidadResaltarControlesFormularioTipoGenero();
		this.updateHabilitarResaltarControlesFormularioTipoGenero();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoGenero() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGenero==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipogeneroConstantesFunciones.resaltaridTipoGenero!=null && this.jInternalFrameDetalleFormTipoGenero!=null) {this.jInternalFrameDetalleFormTipoGenero.jTextFieldidTipoGenero.setBorder(this.tipogeneroConstantesFunciones.resaltaridTipoGenero);}
		if(this.tipogeneroConstantesFunciones.resaltarcodigoTipoGenero!=null && this.jInternalFrameDetalleFormTipoGenero!=null) {this.jInternalFrameDetalleFormTipoGenero.jTextFieldcodigoTipoGenero.setBorder(this.tipogeneroConstantesFunciones.resaltarcodigoTipoGenero);}
		if(this.tipogeneroConstantesFunciones.resaltarnombreTipoGenero!=null && this.jInternalFrameDetalleFormTipoGenero!=null) {this.jInternalFrameDetalleFormTipoGenero.jTextAreanombreTipoGenero.setBorder(this.tipogeneroConstantesFunciones.resaltarnombreTipoGenero);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoGenero() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoGenero==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) {
	
		//this.jInternalFrameDetalleFormTipoGenero.jTextFieldidTipoGenero.setVisible(this.tipogeneroConstantesFunciones.mostraridTipoGenero);
		this.jInternalFrameDetalleFormTipoGenero.jPanelidTipoGenero.setVisible(this.tipogeneroConstantesFunciones.mostraridTipoGenero);
		//this.jInternalFrameDetalleFormTipoGenero.jTextFieldcodigoTipoGenero.setVisible(this.tipogeneroConstantesFunciones.mostrarcodigoTipoGenero);
		this.jInternalFrameDetalleFormTipoGenero.jPanelcodigoTipoGenero.setVisible(this.tipogeneroConstantesFunciones.mostrarcodigoTipoGenero);
		//this.jInternalFrameDetalleFormTipoGenero.jTextAreanombreTipoGenero.setVisible(this.tipogeneroConstantesFunciones.mostrarnombreTipoGenero);
		this.jInternalFrameDetalleFormTipoGenero.jPanelnombreTipoGenero.setVisible(this.tipogeneroConstantesFunciones.mostrarnombreTipoGenero);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoGenero() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGenero==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGenero!=null) {
	
		this.jInternalFrameDetalleFormTipoGenero.jTextFieldidTipoGenero.setEnabled(this.tipogeneroConstantesFunciones.activaridTipoGenero);
		this.jInternalFrameDetalleFormTipoGenero.jTextFieldcodigoTipoGenero.setEnabled(this.tipogeneroConstantesFunciones.activarcodigoTipoGenero);
		this.jInternalFrameDetalleFormTipoGenero.jTextAreanombreTipoGenero.setEnabled(this.tipogeneroConstantesFunciones.activarnombreTipoGenero);
		}
	}
	
		
}