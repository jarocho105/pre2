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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.ParametroGenericoConstantesFunciones;
import com.bydan.erp.facturacion.util.ParametroGenericoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.ParametroGenericoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.ParametroGenericoBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ParametroGenericoBeanSwingJInternalFrame extends ParametroGenericoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroGenericoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroGenerico> parametrogenericoValidator = new ClassValidator<ParametroGenerico>(ParametroGenerico.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroGenerico parametrogenerico;	
	public ParametroGenerico parametrogenericoAux;
	public ParametroGenerico parametrogenericoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroGenerico parametrogenericoTotales;
	public Long idParametroGenericoActual;
	public Long iIdNuevoParametroGenerico=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

	public String sFinalQueryComboTransaccion="";

	public List<Transaccion> transaccionsForeignKey;

	public List<Transaccion> gettransaccionsForeignKey() {
		return transaccionsForeignKey;
	}

	public void settransaccionsForeignKey(List<Transaccion> transaccionsForeignKey) {
		this.transaccionsForeignKey = transaccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionForeignKey;

	public Transaccion gettransaccionForeignKey() {
		return transaccionForeignKey;
	}

	public void settransaccionForeignKey(Transaccion transaccionForeignKey) {
		this.transaccionForeignKey = transaccionForeignKey;
	}

	public String sFinalQueryComboTransaccionRecibo="";

	public List<Transaccion> transaccionrecibosForeignKey;

	public List<Transaccion> gettransaccionrecibosForeignKey() {
		return transaccionrecibosForeignKey;
	}

	public void settransaccionrecibosForeignKey(List<Transaccion> transaccionrecibosForeignKey) {
		this.transaccionrecibosForeignKey = transaccionrecibosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionreciboForeignKey;

	public Transaccion gettransaccionreciboForeignKey() {
		return transaccionreciboForeignKey;
	}

	public void settransaccionreciboForeignKey(Transaccion transaccionreciboForeignKey) {
		this.transaccionreciboForeignKey = transaccionreciboForeignKey;
	}

	public String sFinalQueryComboBodega="";

	public List<Bodega> bodegasForeignKey;

	public List<Bodega> getbodegasForeignKey() {
		return bodegasForeignKey;
	}

	public void setbodegasForeignKey(List<Bodega> bodegasForeignKey) {
		this.bodegasForeignKey = bodegasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegaForeignKey;

	public Bodega getbodegaForeignKey() {
		return bodegaForeignKey;
	}

	public void setbodegaForeignKey(Bodega bodegaForeignKey) {
		this.bodegaForeignKey = bodegaForeignKey;
	}

	public String sFinalQueryComboServicio="";

	public List<Servicio> serviciosForeignKey;

	public List<Servicio> getserviciosForeignKey() {
		return serviciosForeignKey;
	}

	public void setserviciosForeignKey(List<Servicio> serviciosForeignKey) {
		this.serviciosForeignKey = serviciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Servicio servicioForeignKey;

	public Servicio getservicioForeignKey() {
		return servicioForeignKey;
	}

	public void setservicioForeignKey(Servicio servicioForeignKey) {
		this.servicioForeignKey = servicioForeignKey;
	}

	public String sFinalQueryComboFormato="";

	public List<Formato> formatosForeignKey;

	public List<Formato> getformatosForeignKey() {
		return formatosForeignKey;
	}

	public void setformatosForeignKey(List<Formato> formatosForeignKey) {
		this.formatosForeignKey = formatosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formatoForeignKey;

	public Formato getformatoForeignKey() {
		return formatoForeignKey;
	}

	public void setformatoForeignKey(Formato formatoForeignKey) {
		this.formatoForeignKey = formatoForeignKey;
	}

	public String sFinalQueryComboFormatoRecibo="";

	public List<Formato> formatorecibosForeignKey;

	public List<Formato> getformatorecibosForeignKey() {
		return formatorecibosForeignKey;
	}

	public void setformatorecibosForeignKey(List<Formato> formatorecibosForeignKey) {
		this.formatorecibosForeignKey = formatorecibosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formatoreciboForeignKey;

	public Formato getformatoreciboForeignKey() {
		return formatoreciboForeignKey;
	}

	public void setformatoreciboForeignKey(Formato formatoreciboForeignKey) {
		this.formatoreciboForeignKey = formatoreciboForeignKey;
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
	
	public Boolean isPermisoTodoParametroGenerico;
	public Boolean isPermisoNuevoParametroGenerico;
	public Boolean isPermisoActualizarParametroGenerico;
	public Boolean isPermisoActualizarOriginalParametroGenerico;
	public Boolean isPermisoEliminarParametroGenerico;
	public Boolean isPermisoGuardarCambiosParametroGenerico;
	public Boolean isPermisoConsultaParametroGenerico;
	public Boolean isPermisoBusquedaParametroGenerico;
	public Boolean isPermisoReporteParametroGenerico;
	public Boolean isPermisoPaginacionMedioParametroGenerico;
	public Boolean isPermisoPaginacionAltoParametroGenerico;
	public Boolean isPermisoPaginacionTodoParametroGenerico;
	public Boolean isPermisoCopiarParametroGenerico;
	public Boolean isPermisoVerFormParametroGenerico;
	public Boolean isPermisoDuplicarParametroGenerico;
	public Boolean isPermisoOrdenParametroGenerico;
	
	
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
	
	public ParametroGenericoParameterReturnGeneral parametrogenericoReturnGeneral;
	public ParametroGenericoParameterReturnGeneral parametrogenericoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroGenerico=false;
	public Boolean esParaAccionDesdeFormularioParametroGenerico=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroGenericoSessionBeanAdditional parametrogenericoSessionBeanAdditional=null;
	
	public ParametroGenericoSessionBeanAdditional getParametroGenericoSessionBeanAdditional() {
		return this.parametrogenericoSessionBeanAdditional;
	}
	
	public void setParametroGenericoSessionBeanAdditional(ParametroGenericoSessionBeanAdditional parametrogenericoSessionBeanAdditional) {
		try {
			this.parametrogenericoSessionBeanAdditional=parametrogenericoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroGenericoBeanSwingJInternalFrameAdditional parametrogenericoBeanSwingJInternalFrameAdditional=null;
	//public class ParametroGenericoBeanSwingJInternalFrame
	
	public ParametroGenericoBeanSwingJInternalFrameAdditional getParametroGenericoBeanSwingJInternalFrameAdditional() {
		return this.parametrogenericoBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroGenericoBeanSwingJInternalFrameAdditional(ParametroGenericoBeanSwingJInternalFrameAdditional parametrogenericoBeanSwingJInternalFrameAdditional) {
		try {
			this.parametrogenericoBeanSwingJInternalFrameAdditional=parametrogenericoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroGenericoLogic parametrogenericoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroGenerico parametrogenericoBean;
	public ParametroGenericoConstantesFunciones parametrogenericoConstantesFunciones;
	//public ParametroGenericoParameterReturnGeneral parametrogenericoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ModuloLogic moduloLogic;
	public TransaccionLogic transaccionLogic;
	public TransaccionLogic transaccionreciboLogic;
	public BodegaLogic bodegaLogic;
	public ServicioLogic servicioLogic;
	public FormatoLogic formatoLogic;
	public FormatoLogic formatoreciboLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroGenerico> parametrogenericos;	
	//public List<ParametroGenerico> parametrogenericosEliminados;
	//public List<ParametroGenerico> parametrogenericosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroGenerico=false;
	public Boolean isVisibilidadCeldaDuplicarParametroGenerico=true;
	public Boolean isVisibilidadCeldaCopiarParametroGenerico=true;
	public Boolean isVisibilidadCeldaVerFormParametroGenerico=true;
	public Boolean isVisibilidadCeldaOrdenParametroGenerico=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroGenerico=false;
	public Boolean isVisibilidadCeldaModificarParametroGenerico=false;
	public Boolean isVisibilidadCeldaActualizarParametroGenerico=false;
	public Boolean isVisibilidadCeldaEliminarParametroGenerico=false;
	public Boolean isVisibilidadCeldaCancelarParametroGenerico=false;
	public Boolean isVisibilidadCeldaGuardarParametroGenerico=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroGenerico=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFormato=false;
	public Boolean isVisibilidadFK_IdFormatoRecibo=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdServicio=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	public Boolean isVisibilidadFK_IdTransaccionRecibo=false;
	
	public Long getiIdNuevoParametroGenerico() {
		return this.iIdNuevoParametroGenerico;
	}

	public void setiIdNuevoParametroGenerico(Long iIdNuevoParametroGenerico) {
		this.iIdNuevoParametroGenerico = iIdNuevoParametroGenerico;
	}
	
	public Long getidParametroGenericoActual() {
		return this.idParametroGenericoActual;
	}

	public void setidParametroGenericoActual(Long idParametroGenericoActual) {
		this.idParametroGenericoActual = idParametroGenericoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroGenerico getparametrogenerico() {
		return this.parametrogenerico;
	}

	public void setparametrogenerico(ParametroGenerico parametrogenerico) {
		this.parametrogenerico = parametrogenerico;
	}
	
	public ParametroGenerico getparametrogenericoAux() {
		return this.parametrogenericoAux;
	}

	public void setparametrogenericoAux(ParametroGenerico parametrogenericoAux) {
		this.parametrogenericoAux = parametrogenericoAux;
	}				
	
	public ParametroGenerico getparametrogenericoAnterior() {
		return this.parametrogenericoAnterior;
	}

	public void setparametrogenericoAnterior(ParametroGenerico parametrogenericoAnterior) {
		this.parametrogenericoAnterior = parametrogenericoAnterior;
	}	
	
	public ParametroGenerico getparametrogenericoTotales() {
		return this.parametrogenericoTotales;
	}

	public void setparametrogenericoTotales(ParametroGenerico parametrogenericoTotales) {
		this.parametrogenericoTotales = parametrogenericoTotales;
	}	
	
	public ParametroGenerico getparametrogenericoBean() {
		return this.parametrogenericoBean;
	}

	public void setparametrogenericoBean(ParametroGenerico parametrogenericoBean) {
		this.parametrogenericoBean = parametrogenericoBean;
	}	
	
	public ParametroGenericoParameterReturnGeneral getparametrogenericoReturnGeneral() {
		return this.parametrogenericoReturnGeneral;
	}

	public void setparametrogenericoReturnGeneral(ParametroGenericoParameterReturnGeneral parametrogenericoReturnGeneral) {
		this.parametrogenericoReturnGeneral = parametrogenericoReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_formatoFK_IdFormato=-1L;

	public Long getid_formatoFK_IdFormato() {
		return this.id_formatoFK_IdFormato;
	}

	public void setid_formatoFK_IdFormato(Long id_formatoFK_IdFormato) {
		this.id_formatoFK_IdFormato = id_formatoFK_IdFormato;
	}

	public Long id_formato_reciboFK_IdFormatoRecibo=null;

	public Long getid_formato_reciboFK_IdFormatoRecibo() {
		return this.id_formato_reciboFK_IdFormatoRecibo;
	}

	public void setid_formato_reciboFK_IdFormatoRecibo(Long id_formato_reciboFK_IdFormatoRecibo) {
		this.id_formato_reciboFK_IdFormatoRecibo = id_formato_reciboFK_IdFormatoRecibo;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_servicioFK_IdServicio=-1L;

	public Long getid_servicioFK_IdServicio() {
		return this.id_servicioFK_IdServicio;
	}

	public void setid_servicioFK_IdServicio(Long id_servicioFK_IdServicio) {
		this.id_servicioFK_IdServicio = id_servicioFK_IdServicio;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_transaccionFK_IdTransaccion=-1L;

	public Long getid_transaccionFK_IdTransaccion() {
		return this.id_transaccionFK_IdTransaccion;
	}

	public void setid_transaccionFK_IdTransaccion(Long id_transaccionFK_IdTransaccion) {
		this.id_transaccionFK_IdTransaccion = id_transaccionFK_IdTransaccion;
	}

	public Long id_transaccion_reciboFK_IdTransaccionRecibo=null;

	public Long getid_transaccion_reciboFK_IdTransaccionRecibo() {
		return this.id_transaccion_reciboFK_IdTransaccionRecibo;
	}

	public void setid_transaccion_reciboFK_IdTransaccionRecibo(Long id_transaccion_reciboFK_IdTransaccionRecibo) {
		this.id_transaccion_reciboFK_IdTransaccionRecibo = id_transaccion_reciboFK_IdTransaccionRecibo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroGenericoLogic getParametroGenericoLogic()	{		
		return parametrogenericoLogic;
	}

	public void setParametroGenericoLogic(ParametroGenericoLogic parametrogenericoLogic) {
		this.parametrogenericoLogic = parametrogenericoLogic;
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
	
	public Boolean getIsEsNuevoParametroGenerico() {
		return isEsNuevoParametroGenerico;
	}

	public void setIsEsNuevoParametroGenerico(Boolean isEsNuevoParametroGenerico) {
		this.isEsNuevoParametroGenerico = isEsNuevoParametroGenerico;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroGenerico() {
		return esParaAccionDesdeFormularioParametroGenerico;
	}
	
	public void setEsParaAccionDesdeFormularioParametroGenerico(Boolean esParaAccionDesdeFormularioParametroGenerico) {
		this.esParaAccionDesdeFormularioParametroGenerico = esParaAccionDesdeFormularioParametroGenerico;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.parametrogenericoSessionBean==null) {
				this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
			}

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(parametrogenericoSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.parametrogenericoSessionBean==null) {
				this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
			}

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(parametrogenericoSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.parametrogenericoSessionBean==null) {
				this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
			}

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(parametrogenericoSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTransaccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionsForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametrogenericoSessionBean==null) {
				this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
			}

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionsForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametrogenericoSessionBean.getlidTransaccionActual());
					this.transaccionsForeignKey.add(transaccionLogic.getTransaccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTransaccionRecibosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionrecibosForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Transaccion transaccionreciboNulo = new Transaccion();

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametrogenericoSessionBean==null) {
				this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
			}

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionRecibo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionreciboLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionrecibosForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.transaccionrecibosForeignKey.add(0, transaccionreciboNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccionRecibo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametrogenericoSessionBean.getlidTransaccionReciboActual());
					this.transaccionrecibosForeignKey.add(transaccionLogic.getTransaccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosBodegasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.parametrogenericoSessionBean==null) {
				this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
			}

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodega(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(parametrogenericoSessionBean.getlidBodegaActual());
					this.bodegasForeignKey.add(bodegaLogic.getBodega());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosServiciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.serviciosForeignKey=new ArrayList<Servicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ServicioLogic servicioLogic=new ServicioLogic();

			//servicioLogic.getServicioDataAccess().setIsForForeingKeyData(true);

			if(this.parametrogenericoSessionBean==null) {
				this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
			}

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionServicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//servicioLogic.getServicioDataAccess().setIsForForeingKeyData(true);

					servicioLogic.getTodosServiciosWithConnection(sFinalQuery,new Pagination());

					this.serviciosForeignKey=servicioLogic.getServicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaServicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					servicioLogic.getEntityWithConnection(parametrogenericoSessionBean.getlidServicioActual());
					this.serviciosForeignKey.add(servicioLogic.getServicio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosFormatosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatosForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.parametrogenericoSessionBean==null) {
				this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
			}

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formatosForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(parametrogenericoSessionBean.getlidFormatoActual());
					this.formatosForeignKey.add(formatoLogic.getFormato());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosFormatoRecibosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatorecibosForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Formato formatoreciboNulo = new Formato();

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.parametrogenericoSessionBean==null) {
				this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
			}

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionFormatoRecibo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatoreciboLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formatorecibosForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.formatorecibosForeignKey.add(0, formatoreciboNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormatoRecibo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(parametrogenericoSessionBean.getlidFormatoReciboActual());
					this.formatorecibosForeignKey.add(formatoLogic.getFormato());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.parametrogenerico!=null) {
						this.parametrogenerico.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroGenerico.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroGenericoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaParametroGenericoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroGenericoGenerico!=null && jComboBoxid_empresaParametroGenericoGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroGenericoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.parametrogenerico!=null) {
						this.parametrogenerico.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalParametroGenerico.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalParametroGenericoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalParametroGenericoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalParametroGenericoGenerico!=null && jComboBoxid_sucursalParametroGenericoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalParametroGenericoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.parametrogenerico!=null) {
						this.parametrogenerico.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloParametroGenerico.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloFK_IdModuloParametroGenerico!=null) {
						jComboBoxid_moduloFK_IdModuloParametroGenerico.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloFK_IdModuloParametroGenerico!=null) {
							//jComboBoxid_moduloFK_IdModuloParametroGenerico.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloFK_IdModuloParametroGenerico.getItemCount()>0) {
								jComboBoxid_moduloFK_IdModuloParametroGenerico.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloParametroGenericoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloParametroGenericoGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloParametroGenericoGenerico!=null && jComboBoxid_moduloParametroGenericoGenerico.getItemCount()>0) {
					jComboBoxid_moduloParametroGenericoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionForeignKey(Long idTransaccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionTemp!=null) {

					if(this.parametrogenerico!=null) {
						this.parametrogenerico.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionParametroGenerico.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTransaccionForeignKeyDescripcion(Long idTransaccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionParametroGenericoGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(transaccionTemp!=null) {
				jComboBoxid_transaccionParametroGenericoGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionParametroGenericoGenerico!=null && jComboBoxid_transaccionParametroGenericoGenerico.getItemCount()>0) {
					jComboBoxid_transaccionParametroGenericoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionReciboForeignKey(Long idTransaccionReciboSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionreciboTemp=null;

			for(Transaccion transaccionreciboAux:transaccionrecibosForeignKey) {
				if(transaccionreciboAux.getId()!=null && transaccionreciboAux.getId().equals(idTransaccionReciboSeleccionado)) {
					transaccionreciboTemp=transaccionreciboAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionreciboTemp!=null) {

					if(this.parametrogenerico!=null) {
						this.parametrogenerico.setTransaccionRecibo(transaccionreciboTemp);
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.setSelectedItem(transaccionreciboTemp);
					}
				} else {
					//jComboBoxid_transaccion_reciboParametroGenerico.setSelectedItem(transaccionreciboTemp);
					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTransaccionReciboForeignKeyDescripcion(Long idTransaccionReciboSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionreciboTemp=null;

			for(Transaccion transaccionreciboAux:transaccionrecibosForeignKey) {
				if(transaccionreciboAux.getId()!=null && transaccionreciboAux.getId().equals(idTransaccionReciboSeleccionado)) {
					transaccionreciboTemp=transaccionreciboAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionreciboTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionReciboForeignKeyGenerico(Long idTransaccionReciboSeleccionado,JComboBox jComboBoxid_transaccion_reciboParametroGenericoGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionreciboTemp=null;

			for(Transaccion transaccionreciboAux:transaccionrecibosForeignKey) {
				if(transaccionreciboAux.getId()!=null && transaccionreciboAux.getId().equals(idTransaccionReciboSeleccionado)) {
					transaccionreciboTemp=transaccionreciboAux;
					break;
				}
			}

			if(transaccionreciboTemp!=null) {
				jComboBoxid_transaccion_reciboParametroGenericoGenerico.setSelectedItem(transaccionreciboTemp);
			} else {
				if(jComboBoxid_transaccion_reciboParametroGenericoGenerico!=null && jComboBoxid_transaccion_reciboParametroGenericoGenerico.getItemCount()>0) {
					jComboBoxid_transaccion_reciboParametroGenericoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaForeignKey(Long idBodegaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegaTemp!=null) {

					if(this.parametrogenerico!=null) {
						this.parametrogenerico.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaParametroGenerico.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaParametroGenerico!=null) {
						jComboBoxid_bodegaFK_IdBodegaParametroGenerico.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaParametroGenerico!=null) {
							//jComboBoxid_bodegaFK_IdBodegaParametroGenerico.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaParametroGenerico.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaParametroGenerico.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualBodegaForeignKeyDescripcion(Long idBodegaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaParametroGenericoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(bodegaTemp!=null) {
				jComboBoxid_bodegaParametroGenericoGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaParametroGenericoGenerico!=null && jComboBoxid_bodegaParametroGenericoGenerico.getItemCount()>0) {
					jComboBoxid_bodegaParametroGenericoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualServicioForeignKey(Long idServicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Servicio  servicioTemp=null;

			for(Servicio servicioAux:serviciosForeignKey) {
				if(servicioAux.getId()!=null && servicioAux.getId().equals(idServicioSeleccionado)) {
					servicioTemp=servicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(servicioTemp!=null) {

					if(this.parametrogenerico!=null) {
						this.parametrogenerico.setServicio(servicioTemp);
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.setSelectedItem(servicioTemp);
					}
				} else {
					//jComboBoxid_servicioParametroGenerico.setSelectedItem(servicioTemp);
					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualServicioForeignKeyDescripcion(Long idServicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Servicio  servicioTemp=null;

			for(Servicio servicioAux:serviciosForeignKey) {
				if(servicioAux.getId()!=null && servicioAux.getId().equals(idServicioSeleccionado)) {
					servicioTemp=servicioAux;
					break;
				}
			}


			sDescripcion=ServicioConstantesFunciones.getServicioDescripcion(servicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualServicioForeignKeyGenerico(Long idServicioSeleccionado,JComboBox jComboBoxid_servicioParametroGenericoGenerico)throws Exception
	{
		try
		{
			Servicio  servicioTemp=null;

			for(Servicio servicioAux:serviciosForeignKey) {
				if(servicioAux.getId()!=null && servicioAux.getId().equals(idServicioSeleccionado)) {
					servicioTemp=servicioAux;
					break;
				}
			}

			if(servicioTemp!=null) {
				jComboBoxid_servicioParametroGenericoGenerico.setSelectedItem(servicioTemp);
			} else {
				if(jComboBoxid_servicioParametroGenericoGenerico!=null && jComboBoxid_servicioParametroGenericoGenerico.getItemCount()>0) {
					jComboBoxid_servicioParametroGenericoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoForeignKey(Long idFormatoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatoTemp!=null) {

					if(this.parametrogenerico!=null) {
						this.parametrogenerico.setFormato(formatoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.setSelectedItem(formatoTemp);
					}
				} else {
					//jComboBoxid_formatoParametroGenerico.setSelectedItem(formatoTemp);
					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualFormatoForeignKeyDescripcion(Long idFormatoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formatoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoForeignKeyGenerico(Long idFormatoSeleccionado,JComboBox jComboBoxid_formatoParametroGenericoGenerico)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(formatoTemp!=null) {
				jComboBoxid_formatoParametroGenericoGenerico.setSelectedItem(formatoTemp);
			} else {
				if(jComboBoxid_formatoParametroGenericoGenerico!=null && jComboBoxid_formatoParametroGenericoGenerico.getItemCount()>0) {
					jComboBoxid_formatoParametroGenericoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoReciboForeignKey(Long idFormatoReciboSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formatoreciboTemp=null;

			for(Formato formatoreciboAux:formatorecibosForeignKey) {
				if(formatoreciboAux.getId()!=null && formatoreciboAux.getId().equals(idFormatoReciboSeleccionado)) {
					formatoreciboTemp=formatoreciboAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatoreciboTemp!=null) {

					if(this.parametrogenerico!=null) {
						this.parametrogenerico.setFormatoRecibo(formatoreciboTemp);
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.setSelectedItem(formatoreciboTemp);
					}
				} else {
					//jComboBoxid_formato_reciboParametroGenerico.setSelectedItem(formatoreciboTemp);
					if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
						if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualFormatoReciboForeignKeyDescripcion(Long idFormatoReciboSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formatoreciboTemp=null;

			for(Formato formatoreciboAux:formatorecibosForeignKey) {
				if(formatoreciboAux.getId()!=null && formatoreciboAux.getId().equals(idFormatoReciboSeleccionado)) {
					formatoreciboTemp=formatoreciboAux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formatoreciboTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoReciboForeignKeyGenerico(Long idFormatoReciboSeleccionado,JComboBox jComboBoxid_formato_reciboParametroGenericoGenerico)throws Exception
	{
		try
		{
			Formato  formatoreciboTemp=null;

			for(Formato formatoreciboAux:formatorecibosForeignKey) {
				if(formatoreciboAux.getId()!=null && formatoreciboAux.getId().equals(idFormatoReciboSeleccionado)) {
					formatoreciboTemp=formatoreciboAux;
					break;
				}
			}

			if(formatoreciboTemp!=null) {
				jComboBoxid_formato_reciboParametroGenericoGenerico.setSelectedItem(formatoreciboTemp);
			} else {
				if(jComboBoxid_formato_reciboParametroGenericoGenerico!=null && jComboBoxid_formato_reciboParametroGenericoGenerico.getItemCount()>0) {
					jComboBoxid_formato_reciboParametroGenericoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroGenerico parametrogenerico,JComboBox jComboBoxid_empresaParametroGenericoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroGenericoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroGenericoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametrogenerico.setid_empresa(empresaAux.getId());
				parametrogenerico.setempresa_descripcion(ParametroGenericoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametrogenerico.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ParametroGenerico parametrogenerico,JComboBox jComboBoxid_sucursalParametroGenericoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalParametroGenericoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalParametroGenericoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				parametrogenerico.setid_sucursal(sucursalAux.getId());
				parametrogenerico.setsucursal_descripcion(ParametroGenericoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				parametrogenerico.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(ParametroGenerico parametrogenerico,JComboBox jComboBoxid_moduloParametroGenericoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloParametroGenericoGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloParametroGenericoGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				parametrogenerico.setid_modulo(moduloAux.getId());
				parametrogenerico.setmodulo_descripcion(ParametroGenericoConstantesFunciones.getModuloDescripcion(moduloAux));
				parametrogenerico.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(ParametroGenerico parametrogenerico,JComboBox jComboBoxid_transaccionParametroGenericoGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionParametroGenericoGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionParametroGenericoGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametrogenerico.setid_transaccion(transaccionAux.getId());
				parametrogenerico.settransaccion_descripcion(ParametroGenericoConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				parametrogenerico.setTransaccion(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionReciboForeignKey(ParametroGenerico parametrogenerico,JComboBox jComboBoxid_transaccion_reciboParametroGenericoGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion_reciboParametroGenericoGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion_reciboParametroGenericoGenerico.getSelectedItem();
			}

			if(transaccionAux!=null) {
				parametrogenerico.setid_transaccion_recibo(transaccionAux.getId());
				parametrogenerico.settransaccionrecibo_descripcion(ParametroGenericoConstantesFunciones.getTransaccionReciboDescripcion(transaccionAux));
				parametrogenerico.setTransaccionRecibo(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ParametroGenerico parametrogenerico,JComboBox jComboBoxid_bodegaParametroGenericoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaParametroGenericoGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaParametroGenericoGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				parametrogenerico.setid_bodega(bodegaAux.getId());
				parametrogenerico.setbodega_descripcion(ParametroGenericoConstantesFunciones.getBodegaDescripcion(bodegaAux));
				parametrogenerico.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarServicioForeignKey(ParametroGenerico parametrogenerico,JComboBox jComboBoxid_servicioParametroGenericoGenerico)throws Exception
	{
		try
		{
			Servicio  servicioAux=new Servicio();

			if(jComboBoxid_servicioParametroGenericoGenerico==null) {
				servicioAux=(Servicio)this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.getSelectedItem();
			} else {
				servicioAux=(Servicio)jComboBoxid_servicioParametroGenericoGenerico.getSelectedItem();
			}

			if(servicioAux!=null && servicioAux.getId()!=null) {
				parametrogenerico.setid_servicio(servicioAux.getId());
				parametrogenerico.setservicio_descripcion(ParametroGenericoConstantesFunciones.getServicioDescripcion(servicioAux));
				parametrogenerico.setServicio(servicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoForeignKey(ParametroGenerico parametrogenerico,JComboBox jComboBoxid_formatoParametroGenericoGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formatoParametroGenericoGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formatoParametroGenericoGenerico.getSelectedItem();
			}

			if(formatoAux!=null && formatoAux.getId()!=null) {
				parametrogenerico.setid_formato(formatoAux.getId());
				parametrogenerico.setformato_descripcion(ParametroGenericoConstantesFunciones.getFormatoDescripcion(formatoAux));
				parametrogenerico.setFormato(formatoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoReciboForeignKey(ParametroGenerico parametrogenerico,JComboBox jComboBoxid_formato_reciboParametroGenericoGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formato_reciboParametroGenericoGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formato_reciboParametroGenericoGenerico.getSelectedItem();
			}

			if(formatoAux!=null) {
				parametrogenerico.setid_formato_recibo(formatoAux.getId());
				parametrogenerico.setformatorecibo_descripcion(ParametroGenericoConstantesFunciones.getFormatoReciboDescripcion(formatoAux));
				parametrogenerico.setFormatoRecibo(formatoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
					}

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
					}

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
					}

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloFK_IdModuloParametroGenerico.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloFK_IdModuloParametroGenerico.addItem(modulo);
							}
						}

						if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
					}

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionRecibosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.removeAllItems();

							for(Transaccion transaccionrecibo:this.transaccionrecibosForeignKey) {
								this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.addItem(transaccionrecibo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
					}

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
					}

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaParametroGenerico.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaParametroGenerico.addItem(bodega);
							}
						}

						if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameServiciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingServicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.removeAllItems();

							for(Servicio servicio:this.serviciosForeignKey) {
								this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.addItem(servicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
					}

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.addItem(formato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
					}

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatoRecibosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.removeAllItems();

							for(Formato formatorecibo:this.formatorecibosForeignKey) {
								this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.addItem(formatorecibo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroGenerico!=null) { 
					}

					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloFK_IdModuloParametroGenerico.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloFK_IdModuloParametroGenerico.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionForeignKey(Transaccion transaccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionReciboForeignKey(Transaccion transaccionrecibo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.setSelectedItem(transaccionrecibo);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaParametroGenerico.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaParametroGenerico.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameServicioForeignKey(Servicio servicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.setSelectedItem(servicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFormatoForeignKey(Formato formato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.setSelectedItem(formato);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFormatoReciboForeignKey(Formato formatorecibo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.setSelectedItem(formatorecibo);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesParametroGenerico() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroGenericoConstantesFunciones.refrescarForeignKeysDescripcionesParametroGenerico(this.parametrogenericoLogic.getParametroGenericos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroGenericoConstantesFunciones.refrescarForeignKeysDescripcionesParametroGenerico(this.parametrogenericos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(Transaccion.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Servicio.class));
		classes.add(new Classe(Formato.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametrogenericoLogic.setParametroGenericos(this.parametrogenericos);
			parametrogenericoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroGenericoParameterReturnGeneral getParametroGenericoParameterGeneral() {
		return this.parametrogenericoParameterGeneral;
	}
	
	public void setParametroGenericoParameterGeneral(ParametroGenericoParameterReturnGeneral parametrogenericoParameterGeneral) {
		this.parametrogenericoParameterGeneral = parametrogenericoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroGenerico() {
		return isPermisoTodoParametroGenerico;
	}

	public void setIsPermisoTodoParametroGenerico(Boolean isPermisoTodoParametroGenerico) {
		this.isPermisoTodoParametroGenerico = isPermisoTodoParametroGenerico;
	}

	public Boolean getIsPermisoNuevoParametroGenerico() {
		return isPermisoNuevoParametroGenerico;
	}

	public void setIsPermisoNuevoParametroGenerico(Boolean isPermisoNuevoParametroGenerico) {
		this.isPermisoNuevoParametroGenerico = isPermisoNuevoParametroGenerico;
	}

	public Boolean getIsPermisoActualizarParametroGenerico() {
		return isPermisoActualizarParametroGenerico;
	}

	public void setIsPermisoActualizarParametroGenerico(Boolean isPermisoActualizarParametroGenerico) {
		this.isPermisoActualizarParametroGenerico = isPermisoActualizarParametroGenerico;
	}

	public Boolean getIsPermisoEliminarParametroGenerico() {
		return isPermisoEliminarParametroGenerico;
	}

	public void setIsPermisoEliminarParametroGenerico(Boolean isPermisoEliminarParametroGenerico) {
		this.isPermisoEliminarParametroGenerico = isPermisoEliminarParametroGenerico;
	}

	public Boolean getIsPermisoGuardarCambiosParametroGenerico() {
		return isPermisoGuardarCambiosParametroGenerico;
	}

	public void setIsPermisoGuardarCambiosParametroGenerico(Boolean isPermisoGuardarCambiosParametroGenerico) {
		this.isPermisoGuardarCambiosParametroGenerico = isPermisoGuardarCambiosParametroGenerico;
	}
	
	public Boolean getIsPermisoConsultaParametroGenerico() {
		return isPermisoConsultaParametroGenerico;
	}

	public void setIsPermisoConsultaParametroGenerico(Boolean isPermisoConsultaParametroGenerico) {
		this.isPermisoConsultaParametroGenerico = isPermisoConsultaParametroGenerico;
	}

	public Boolean getIsPermisoBusquedaParametroGenerico() {
		return isPermisoBusquedaParametroGenerico;
	}

	public void setIsPermisoBusquedaParametroGenerico(Boolean isPermisoBusquedaParametroGenerico) {
		this.isPermisoBusquedaParametroGenerico = isPermisoBusquedaParametroGenerico;
	}

	public Boolean getIsPermisoReporteParametroGenerico() {
		return isPermisoReporteParametroGenerico;
	}

	public void setIsPermisoReporteParametroGenerico(Boolean isPermisoReporteParametroGenerico) {
		this.isPermisoReporteParametroGenerico = isPermisoReporteParametroGenerico;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroGenerico() {
		return isPermisoPaginacionMedioParametroGenerico;
	}

	public void setIsPermisoPaginacionMedioParametroGenerico(Boolean isPermisoPaginacionMedioParametroGenerico) {
		this.isPermisoPaginacionMedioParametroGenerico = isPermisoPaginacionMedioParametroGenerico;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroGenerico() {
		return isPermisoPaginacionTodoParametroGenerico;
	}

	public void setIsPermisoPaginacionTodoParametroGenerico(Boolean isPermisoPaginacionTodoParametroGenerico) {
		this.isPermisoPaginacionTodoParametroGenerico = isPermisoPaginacionTodoParametroGenerico;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroGenerico() {
		return isPermisoPaginacionAltoParametroGenerico;
	}

	public void setIsPermisoPaginacionAltoParametroGenerico(Boolean isPermisoPaginacionAltoParametroGenerico) {
		this.isPermisoPaginacionAltoParametroGenerico = isPermisoPaginacionAltoParametroGenerico;
	}
	
	public Boolean getIsPermisoCopiarParametroGenerico() {
		return isPermisoCopiarParametroGenerico;
	}

	public void setIsPermisoCopiarParametroGenerico(Boolean isPermisoCopiarParametroGenerico) {
		this.isPermisoCopiarParametroGenerico = isPermisoCopiarParametroGenerico;
	}
	
	public Boolean getIsPermisoVerFormParametroGenerico() {
		return isPermisoVerFormParametroGenerico;
	}

	public void setIsPermisoVerFormParametroGenerico(Boolean isPermisoVerFormParametroGenerico) {
		this.isPermisoVerFormParametroGenerico = isPermisoVerFormParametroGenerico;
	}
	
	public Boolean getIsPermisoDuplicarParametroGenerico() {
		return isPermisoDuplicarParametroGenerico;
	}

	public void setIsPermisoDuplicarParametroGenerico(Boolean isPermisoDuplicarParametroGenerico) {
		this.isPermisoDuplicarParametroGenerico = isPermisoDuplicarParametroGenerico;
	}
	
	public Boolean getIsPermisoOrdenParametroGenerico() {
		return isPermisoOrdenParametroGenerico;
	}

	public void setIsPermisoOrdenParametroGenerico(Boolean isPermisoOrdenParametroGenerico) {
		this.isPermisoOrdenParametroGenerico = isPermisoOrdenParametroGenerico;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroGenerico() {
		return isVisibilidadCeldaNuevoParametroGenerico;
	}

	public void setIsVisibilidadCeldaNuevoParametroGenerico(Boolean isVisibilidadCeldaNuevoParametroGenerico) {
		this.isVisibilidadCeldaNuevoParametroGenerico = isVisibilidadCeldaNuevoParametroGenerico;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroGenerico() {
		return isVisibilidadCeldaDuplicarParametroGenerico;
	}

	public void setIsVisibilidadCeldaDuplicarParametroGenerico(Boolean isVisibilidadCeldaDuplicarParametroGenerico) {
		this.isVisibilidadCeldaDuplicarParametroGenerico = isVisibilidadCeldaDuplicarParametroGenerico;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroGenerico() {
		return isVisibilidadCeldaCopiarParametroGenerico;
	}

	public void setIsVisibilidadCeldaCopiarParametroGenerico(Boolean isVisibilidadCeldaCopiarParametroGenerico) {
		this.isVisibilidadCeldaCopiarParametroGenerico = isVisibilidadCeldaCopiarParametroGenerico;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroGenerico() {
		return isVisibilidadCeldaVerFormParametroGenerico;
	}

	public void setIsVisibilidadCeldaVerFormParametroGenerico(Boolean isVisibilidadCeldaVerFormParametroGenerico) {
		this.isVisibilidadCeldaVerFormParametroGenerico = isVisibilidadCeldaVerFormParametroGenerico;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroGenerico() {
		return isVisibilidadCeldaOrdenParametroGenerico;
	}

	public void setIsVisibilidadCeldaOrdenParametroGenerico(Boolean isVisibilidadCeldaOrdenParametroGenerico) {
		this.isVisibilidadCeldaOrdenParametroGenerico = isVisibilidadCeldaOrdenParametroGenerico;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroGenerico() {
		return isVisibilidadCeldaNuevoRelacionesParametroGenerico;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroGenerico(Boolean isVisibilidadCeldaNuevoRelacionesParametroGenerico) {
		this.isVisibilidadCeldaNuevoRelacionesParametroGenerico = isVisibilidadCeldaNuevoRelacionesParametroGenerico;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroGenerico() {
		return isVisibilidadCeldaModificarParametroGenerico;
	}

	public void setIsVisibilidadCeldaModificarParametroGenerico(Boolean isVisibilidadCeldaModificarParametroGenerico) {
		this.isVisibilidadCeldaModificarParametroGenerico = isVisibilidadCeldaModificarParametroGenerico;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroGenerico() {
		return isVisibilidadCeldaActualizarParametroGenerico;
	}

	public void setIsVisibilidadCeldaActualizarParametroGenerico(Boolean isVisibilidadCeldaActualizarParametroGenerico) {
		this.isVisibilidadCeldaActualizarParametroGenerico = isVisibilidadCeldaActualizarParametroGenerico;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroGenerico() {
		return isVisibilidadCeldaEliminarParametroGenerico;
	}

	public void setIsVisibilidadCeldaEliminarParametroGenerico(Boolean isVisibilidadCeldaEliminarParametroGenerico) {
		this.isVisibilidadCeldaEliminarParametroGenerico = isVisibilidadCeldaEliminarParametroGenerico;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroGenerico() {
		return isVisibilidadCeldaCancelarParametroGenerico;
	}

	public void setIsVisibilidadCeldaCancelarParametroGenerico(Boolean isVisibilidadCeldaCancelarParametroGenerico) {
		this.isVisibilidadCeldaCancelarParametroGenerico = isVisibilidadCeldaCancelarParametroGenerico;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroGenerico() {
		return isVisibilidadCeldaGuardarParametroGenerico;
	}

	public void setIsVisibilidadCeldaGuardarParametroGenerico(Boolean isVisibilidadCeldaGuardarParametroGenerico) {
		this.isVisibilidadCeldaGuardarParametroGenerico = isVisibilidadCeldaGuardarParametroGenerico;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroGenerico() {
		return isVisibilidadCeldaGuardarCambiosParametroGenerico;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroGenerico(Boolean isVisibilidadCeldaGuardarCambiosParametroGenerico) {
		this.isVisibilidadCeldaGuardarCambiosParametroGenerico = isVisibilidadCeldaGuardarCambiosParametroGenerico;
	}
		
	public ParametroGenericoSessionBean getparametrogenericoSessionBean() {
		return this.parametrogenericoSessionBean;
	}
	
	public void setparametrogenericoSessionBean(ParametroGenericoSessionBean parametrogenericoSessionBean) {
		this.parametrogenericoSessionBean=parametrogenericoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFormato() {
		return this.isVisibilidadFK_IdFormato;
	}

	public void setisVisibilidadFK_IdFormato(Boolean isVisibilidadFK_IdFormato) {
		this.isVisibilidadFK_IdFormato=isVisibilidadFK_IdFormato;
	}

	public Boolean getisVisibilidadFK_IdFormatoRecibo() {
		return this.isVisibilidadFK_IdFormatoRecibo;
	}

	public void setisVisibilidadFK_IdFormatoRecibo(Boolean isVisibilidadFK_IdFormatoRecibo) {
		this.isVisibilidadFK_IdFormatoRecibo=isVisibilidadFK_IdFormatoRecibo;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdServicio() {
		return this.isVisibilidadFK_IdServicio;
	}

	public void setisVisibilidadFK_IdServicio(Boolean isVisibilidadFK_IdServicio) {
		this.isVisibilidadFK_IdServicio=isVisibilidadFK_IdServicio;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	public Boolean getisVisibilidadFK_IdTransaccionRecibo() {
		return this.isVisibilidadFK_IdTransaccionRecibo;
	}

	public void setisVisibilidadFK_IdTransaccionRecibo(Boolean isVisibilidadFK_IdTransaccionRecibo) {
		this.isVisibilidadFK_IdTransaccionRecibo=isVisibilidadFK_IdTransaccionRecibo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(ParametroGenerico parametrogenerico)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametrogenerico,null);
				this.setActualParaGuardarSucursalForeignKey(parametrogenerico,null);
				this.setActualParaGuardarModuloForeignKey(parametrogenerico,null);
				this.setActualParaGuardarTransaccionForeignKey(parametrogenerico,null);
				this.setActualParaGuardarTransaccionReciboForeignKey(parametrogenerico,null);
				this.setActualParaGuardarBodegaForeignKey(parametrogenerico,null);
				this.setActualParaGuardarServicioForeignKey(parametrogenerico,null);
				this.setActualParaGuardarFormatoForeignKey(parametrogenerico,null);
				this.setActualParaGuardarFormatoReciboForeignKey(parametrogenerico,null);
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
	
	public void bugActualizarReferenciaActual(ParametroGenerico parametrogenerico,ParametroGenerico parametrogenericoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroGenerico(parametrogenerico);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametrogenericoAux.setId(parametrogenerico.getId());
		parametrogenericoAux.setVersionRow(parametrogenerico.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroGenerico();
		
			int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametrogenericoValidator.getInvalidValues(this.parametrogenerico);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametrogenericoLogic.setDatosCliente(datosCliente);
			parametrogenericoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametrogenericoAux=new  ParametroGenerico();
				
				parametrogenericoAux.setIsNew(true);
				parametrogenericoAux.setIsChanged(true);
				
				parametrogenericoAux.setParametroGenericoOriginal(this.parametrogenerico);
				
				parametrogenericoAux.setId(this.parametrogenerico.getId());	
				parametrogenericoAux.setVersionRow(this.parametrogenerico.getVersionRow());	
				parametrogenericoAux.setid_empresa(this.parametrogenerico.getid_empresa());	
				parametrogenericoAux.setid_sucursal(this.parametrogenerico.getid_sucursal());	
				parametrogenericoAux.setid_modulo(this.parametrogenerico.getid_modulo());	
				parametrogenericoAux.setsecuencial(this.parametrogenerico.getsecuencial());	
				parametrogenericoAux.setcodigo(this.parametrogenerico.getcodigo());	
				parametrogenericoAux.setid_transaccion(this.parametrogenerico.getid_transaccion());	
				
				if(this.parametrogenerico.getid_transaccion_recibo()!=null && this.parametrogenerico.getid_transaccion_recibo()>0L) {
					parametrogenericoAux.setid_transaccion_recibo(this.parametrogenerico.getid_transaccion_recibo());
				} else {
					parametrogenericoAux.setid_transaccion_recibo(null);
				}	
				parametrogenericoAux.setid_bodega(this.parametrogenerico.getid_bodega());	
				parametrogenericoAux.setid_servicio(this.parametrogenerico.getid_servicio());	
				parametrogenericoAux.setid_formato(this.parametrogenerico.getid_formato());	
				
				if(this.parametrogenerico.getid_formato_recibo()!=null && this.parametrogenerico.getid_formato_recibo()>0L) {
					parametrogenericoAux.setid_formato_recibo(this.parametrogenerico.getid_formato_recibo());
				} else {
					parametrogenericoAux.setid_formato_recibo(null);
				}	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrogenericoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametrogenericoAux,parametrogenericoLogic.getParametroGenericos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrogenericoAux,parametrogenericos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrogenericoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericoLogic.saveParametroGenericos();//WithConnection
						//parametrogenericoLogic.getSetVersionRowParametroGenericos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrogenerico,parametrogenericoAux);
					
					this.refrescarForeignKeysDescripcionesParametroGenerico();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrogenericoLogic.saveParametroGenericoRelaciones(parametrogenericoAux);//WithConnection
								//parametrogenericoLogic.getSetVersionRowParametroGenericos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrogenerico,parametrogenericoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrogenericoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrogenericoAux,parametrogenericoLogic.getParametroGenericos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrogenericoAux,parametrogenericos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrogenerico,parametrogenericoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametrogenericoAux=new  ParametroGenerico();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado() 
					|| (this.parametrogenericoSessionBean.getEsGuardarRelacionado() && this.parametrogenerico.getId()>=0)) {
						
					parametrogenericoAux.setIsNew(false);
				}
				
				parametrogenericoAux.setIsDeleted(false);
			
				parametrogenericoAux.setId(this.parametrogenerico.getId());	
				parametrogenericoAux.setVersionRow(this.parametrogenerico.getVersionRow());	
				parametrogenericoAux.setid_empresa(this.parametrogenerico.getid_empresa());	
				parametrogenericoAux.setid_sucursal(this.parametrogenerico.getid_sucursal());	
				parametrogenericoAux.setid_modulo(this.parametrogenerico.getid_modulo());	
				parametrogenericoAux.setsecuencial(this.parametrogenerico.getsecuencial());	
				parametrogenericoAux.setcodigo(this.parametrogenerico.getcodigo());	
				parametrogenericoAux.setid_transaccion(this.parametrogenerico.getid_transaccion());	
				
				if(this.parametrogenerico.getid_transaccion_recibo()!=null && this.parametrogenerico.getid_transaccion_recibo()>0L) {
					parametrogenericoAux.setid_transaccion_recibo(this.parametrogenerico.getid_transaccion_recibo());
				} else {
					parametrogenericoAux.setid_transaccion_recibo(null);
				}	
				parametrogenericoAux.setid_bodega(this.parametrogenerico.getid_bodega());	
				parametrogenericoAux.setid_servicio(this.parametrogenerico.getid_servicio());	
				parametrogenericoAux.setid_formato(this.parametrogenerico.getid_formato());	
				
				if(this.parametrogenerico.getid_formato_recibo()!=null && this.parametrogenerico.getid_formato_recibo()>0L) {
					parametrogenericoAux.setid_formato_recibo(this.parametrogenerico.getid_formato_recibo());
				} else {
					parametrogenericoAux.setid_formato_recibo(null);
				}	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrogenericoAux,parametrogenericoLogic.getParametroGenericos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrogenericoAux,parametrogenericos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrogenericoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericoLogic.saveParametroGenericos();//WithConnection
						//parametrogenericoLogic.getSetVersionRowParametroGenericos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrogenerico,parametrogenericoAux);
					
					this.refrescarForeignKeysDescripcionesParametroGenerico();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrogenericoLogic.saveParametroGenericoRelaciones(parametrogenericoAux);//WithConnection
								//parametrogenericoLogic.getSetVersionRowParametroGenericos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrogenerico,parametrogenericoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrogenericoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrogenericoAux,parametrogenericoLogic.getParametroGenericos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrogenericoAux,parametrogenericos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrogenerico,parametrogenericoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametrogenericoAux=new  ParametroGenerico();
				
				parametrogenericoAux.setIsNew(false);
				parametrogenericoAux.setIsChanged(false);
				
				parametrogenericoAux.setIsDeleted(true);
				
				parametrogenericoAux.setId(this.parametrogenerico.getId());	
				parametrogenericoAux.setVersionRow(this.parametrogenerico.getVersionRow());	
				parametrogenericoAux.setid_empresa(this.parametrogenerico.getid_empresa());	
				parametrogenericoAux.setid_sucursal(this.parametrogenerico.getid_sucursal());	
				parametrogenericoAux.setid_modulo(this.parametrogenerico.getid_modulo());	
				parametrogenericoAux.setsecuencial(this.parametrogenerico.getsecuencial());	
				parametrogenericoAux.setcodigo(this.parametrogenerico.getcodigo());	
				parametrogenericoAux.setid_transaccion(this.parametrogenerico.getid_transaccion());	
				
				if(this.parametrogenerico.getid_transaccion_recibo()!=null && this.parametrogenerico.getid_transaccion_recibo()>0L) {
					parametrogenericoAux.setid_transaccion_recibo(this.parametrogenerico.getid_transaccion_recibo());
				} else {
					parametrogenericoAux.setid_transaccion_recibo(null);
				}	
				parametrogenericoAux.setid_bodega(this.parametrogenerico.getid_bodega());	
				parametrogenericoAux.setid_servicio(this.parametrogenerico.getid_servicio());	
				parametrogenericoAux.setid_formato(this.parametrogenerico.getid_formato());	
				
				if(this.parametrogenerico.getid_formato_recibo()!=null && this.parametrogenerico.getid_formato_recibo()>0L) {
					parametrogenericoAux.setid_formato_recibo(this.parametrogenerico.getid_formato_recibo());
				} else {
					parametrogenericoAux.setid_formato_recibo(null);
				}	
				
				if(this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametrogenericoAux.getId()>=0) {	
						this.parametrogenericosEliminados.add(parametrogenericoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametrogenericoAux,parametrogenericoLogic.getParametroGenericos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrogenericoAux,parametrogenericos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrogenericoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericoLogic.saveParametroGenericos();//WithConnection
						//parametrogenericoLogic.getSetVersionRowParametroGenericos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrogenericoLogic.saveParametroGenericoRelaciones(parametrogenericoAux);//WithConnection
								//parametrogenericoLogic.getSetVersionRowParametroGenericos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametrogenericoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametrogenericoAux,parametrogenericoLogic.getParametroGenericos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametrogenericoAux,parametrogenericos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getParametroGenericos().addAll(this.parametrogenericosEliminados);
					
					parametrogenericoLogic.saveParametroGenericos();//WithConnection
					//parametrogenericoLogic.getSetVersionRowParametroGenericos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroGenerico();
				
				this.parametrogenericosEliminados= new ArrayList<ParametroGenerico>();		
			}
			
			if(this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Generico GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Generico",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametrogenerico=parametrogenericoAux;
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
      		//this.finishProcessParametroGenerico();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroGenerico parametrogenericoLocal) throws Exception {
		
		if(this.parametrogenericoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroGenerico parametrogenericoLocal) throws Exception {	
		if(this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametrogenericoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				parametrogenericoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				parametrogenericoLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				parametrogenericoLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionreciboBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionreciboBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionreciboBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionreciboBeanSwingJInternalFrameLocal.actualizarLista(transaccionreciboBeanSwingJInternalFrameLocal.transaccion,this.transaccionrecibosForeignKey);

				transaccionreciboBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionreciboBeanSwingJInternalFrameLocal.transaccion);

				parametrogenericoLocal.setTransaccionRecibo(transaccionreciboBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccionRecibo();
				this.cargarCombosFrameTransaccionRecibosForeignKey("Formulario");
				this.setActualTransaccionReciboForeignKey(transaccionreciboBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				parametrogenericoLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ServicioDetalleFormJInternalFrame.class)) {
				ServicioBeanSwingJInternalFrame servicioBeanSwingJInternalFrameLocal=(ServicioBeanSwingJInternalFrame) ((ServicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				servicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoServicio(servicioBeanSwingJInternalFrameLocal.getservicio(),true);
				servicioBeanSwingJInternalFrameLocal.actualizarLista(servicioBeanSwingJInternalFrameLocal.servicio,this.serviciosForeignKey);

				servicioBeanSwingJInternalFrameLocal.actualizarRelaciones(servicioBeanSwingJInternalFrameLocal.servicio);

				parametrogenericoLocal.setServicio(servicioBeanSwingJInternalFrameLocal.servicio);

				this.addItemDefectoCombosForeignKeyServicio();
				this.cargarCombosFrameServiciosForeignKey("Formulario");
				this.setActualServicioForeignKey(servicioBeanSwingJInternalFrameLocal.servicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formatoBeanSwingJInternalFrameLocal.getformato(),true);
				formatoBeanSwingJInternalFrameLocal.actualizarLista(formatoBeanSwingJInternalFrameLocal.formato,this.formatosForeignKey);

				formatoBeanSwingJInternalFrameLocal.actualizarRelaciones(formatoBeanSwingJInternalFrameLocal.formato);

				parametrogenericoLocal.setFormato(formatoBeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey("Formulario");
				this.setActualFormatoForeignKey(formatoBeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formatoreciboBeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatoreciboBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formatoreciboBeanSwingJInternalFrameLocal.getformato(),true);
				formatoreciboBeanSwingJInternalFrameLocal.actualizarLista(formatoreciboBeanSwingJInternalFrameLocal.formato,this.formatorecibosForeignKey);

				formatoreciboBeanSwingJInternalFrameLocal.actualizarRelaciones(formatoreciboBeanSwingJInternalFrameLocal.formato);

				parametrogenericoLocal.setFormatoRecibo(formatoreciboBeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormatoRecibo();
				this.cargarCombosFrameFormatoRecibosForeignKey("Formulario");
				this.setActualFormatoReciboForeignKey(formatoreciboBeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroGenericoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametrogenericoValidator.getInvalidValues(this.parametrogenerico);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroGenerico parametrogenerico,List<ParametroGenerico> parametrogenericos) throws Exception {
		try	{		
			ParametroGenericoConstantesFunciones.actualizarLista(parametrogenerico,parametrogenericos,this.parametrogenericoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroGenerico parametrogenerico,List<ParametroGenerico> parametrogenericos) throws Exception {
		try	{			
			ParametroGenericoConstantesFunciones.actualizarSelectedLista(parametrogenerico,parametrogenericos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroGenerico> parametrogenericosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametrogenericosLocal=this.parametrogenericoLogic.getParametroGenericos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametrogenericosLocal=this.parametrogenericos;
			}
			//ARCHITECTURE
		
			for(ParametroGenerico parametrogenericoLocal:parametrogenericosLocal) {
				if(this.permiteMantenimiento(parametrogenericoLocal) && parametrogenericoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroGenericoConstantesFunciones.getParametroGenericoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroGenericoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_empresaParametroGenerico,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGenericoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_sucursalParametroGenerico,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGenericoConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_moduloParametroGenerico,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGenericoConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelsecuencialParametroGenerico,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGenericoConstantesFunciones.CONPRESUPUESTOCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelcodigoParametroGenerico,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGenericoConstantesFunciones.IDTRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_transaccionParametroGenerico,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGenericoConstantesFunciones.IDTRANSACCIONRECIBO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_transaccion_reciboParametroGenerico,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGenericoConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_bodegaParametroGenerico,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGenericoConstantesFunciones.IDSERVICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_servicioParametroGenerico,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGenericoConstantesFunciones.IDFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_formatoParametroGenerico,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGenericoConstantesFunciones.IDFORMATORECIBO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_formato_reciboParametroGenerico,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_empresaParametroGenerico,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_sucursalParametroGenerico,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_moduloParametroGenerico,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGenerico.jLabelsecuencialParametroGenerico,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGenerico.jLabelcodigoParametroGenerico,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_transaccionParametroGenerico,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_transaccion_reciboParametroGenerico,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_bodegaParametroGenerico,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_servicioParametroGenerico,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_formatoParametroGenerico,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGenerico.jLabelid_formato_reciboParametroGenerico,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoParametroGenerico--;	
		
		
		this.parametrogenericoAux=new ParametroGenerico();
		
		this.parametrogenericoAux.setId(this.iIdNuevoParametroGenerico);
		this.parametrogenericoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrogenericoLogic.getParametroGenericos().add(this.parametrogenericoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametrogenericos.add(this.parametrogenericoAux);
		}
		//ARCHITECTURE
		
		this.parametrogenerico=this.parametrogenericoAux;
		
		if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroGenerico(this.parametrogenerico);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroGenerico(this.parametrogenerico);
		}
				
		//this.setDefaultControlesParametroGenerico();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroGenerico();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroGenerico();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroGenerico();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroGenerico(this.parametrogenericoBean,this.parametrogenerico,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroGenericoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametrogenericoSessionBean.getConGuardarRelaciones()) {
			classes=ParametroGenericoConstantesFunciones.getClassesRelationshipsOfParametroGenerico(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametrogenericoReturnGeneral=parametrogenericoLogic.procesarEventosParametroGenericosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrogenericoLogic.getParametroGenericos(),this.parametrogenerico,this.parametrogenericoParameterGeneral,this.isEsNuevoParametroGenerico,classes);//this.parametrogenericoLogic.getParametroGenerico()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroGenerico(this.parametrogenericoReturnGeneral,this.parametrogenericoBean,false);
		
		if(this.parametrogenericoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroGenerico(this.parametrogenericoReturnGeneral.getParametroGenerico());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroGenerico(this.parametrogenericoReturnGeneral.getParametroGenerico());
		}
		
		if(this.parametrogenericoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroGenerico(this.parametrogenericoReturnGeneral.getParametroGenerico(),classes);//this.parametrogenericoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroGenerico();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroGenerico();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroGenericoBeanSwingJInternalFrameAdditional.RecargarFormParametroGenerico(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroGenerico(false);
						
			if(parametrogenericoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroGenerico();
			}
			
			this.actualizarVisualTableDatosParametroGenerico();
			
			this.jTableDatosParametroGenerico.setRowSelectionInterval(this.getIndiceNuevoParametroGenerico(), this.getIndiceNuevoParametroGenerico());
			
			this.seleccionarFilaTablaParametroGenericoActual();
						
			this.actualizarEstadoCeldasBotonesParametroGenerico("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroGenerico(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParametroGenerico.jTextFieldsecuencialParametroGenerico.setEnabled(isHabilitar && this.parametrogenericoConstantesFunciones.activarsecuencialParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxcodigoParametroGenerico.setEnabled(isHabilitar && this.parametrogenericoConstantesFunciones.activarcodigoParametroGenerico);	
		//
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.setEnabled(isHabilitar && this.parametrogenericoConstantesFunciones.activarid_empresaParametroGenerico);//
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.setEnabled(isHabilitar && this.parametrogenericoConstantesFunciones.activarid_sucursalParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.setEnabled(isHabilitar && this.parametrogenericoConstantesFunciones.activarid_moduloParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.setEnabled(isHabilitar && this.parametrogenericoConstantesFunciones.activarid_transaccionParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.setEnabled(isHabilitar && this.parametrogenericoConstantesFunciones.activarid_transaccion_reciboParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.setEnabled(isHabilitar && this.parametrogenericoConstantesFunciones.activarid_bodegaParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.setEnabled(isHabilitar && this.parametrogenericoConstantesFunciones.activarid_servicioParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.setEnabled(isHabilitar && this.parametrogenericoConstantesFunciones.activarid_formatoParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.setEnabled(isHabilitar && this.parametrogenericoConstantesFunciones.activarid_formato_reciboParametroGenerico);
	};
	
	public void setDefaultControlesParametroGenerico() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroGenerico(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametrogenericoSessionBean.setConGuardarRelaciones(true);			
			this.parametrogenericoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroGenerico.jTabbedPaneRelacionesParametroGenerico.setVisible(true);
			
					
		} else {
			//this.parametrogenericoSessionBean.setConGuardarRelaciones(false);			
			this.parametrogenericoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroGenerico.jTabbedPaneRelacionesParametroGenerico.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroGenerico() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGenerico parametrogenericoAux:this.parametrogenericoLogic.getParametroGenericos()) {
				if(parametrogenericoAux.getId().equals(this.iIdNuevoParametroGenerico)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGenerico parametrogenericoAux:this.parametrogenericos) {
				if(parametrogenericoAux.getId().equals(this.iIdNuevoParametroGenerico)) {
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
	
	public int getIndiceActualParametroGenerico(ParametroGenerico parametrogenerico,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGenerico parametrogenericoAux:this.parametrogenericoLogic.getParametroGenericos()) {
				if(parametrogenericoAux.getId().equals(parametrogenerico.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGenerico parametrogenericoAux:this.parametrogenericos) {
				if(parametrogenericoAux.getId().equals(parametrogenerico.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroGenerico(ParametroGenerico parametrogenericoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGenerico parametrogenericoAux:this.parametrogenericoLogic.getParametroGenericos()) {
				if(parametrogenericoAux.getParametroGenericoOriginal().getId().equals(parametrogenericoOriginal.getId())) {
					existe=true;
					parametrogenericoOriginal.setId(parametrogenericoAux.getId());
					parametrogenericoOriginal.setVersionRow(parametrogenericoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGenerico parametrogenericoAux:this.parametrogenericos) {
				if(parametrogenericoAux.getParametroGenericoOriginal().getId().equals(parametrogenericoOriginal.getId())) {
					existe=true;
					parametrogenericoOriginal.setId(parametrogenericoAux.getId());
					parametrogenericoOriginal.setVersionRow(parametrogenericoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroGenerico(Boolean esParaCancelar) throws Exception {
		parametrogenericosAux=new ArrayList<ParametroGenerico>();
		parametrogenericoAux=new ParametroGenerico();
		
		if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroGenerico parametrogenericoAux:this.parametrogenericoLogic.getParametroGenericos()) {
					if(parametrogenericoAux.getId()<0) {
						parametrogenericosAux.add(parametrogenericoAux);
					}		
				}
				this.iIdNuevoParametroGenerico=0L;
				this.parametrogenericoLogic.getParametroGenericos().removeAll(parametrogenericosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroGenerico parametrogenericoAux:this.parametrogenericos) {
					if(parametrogenericoAux.getId()<0) {
						parametrogenericosAux.add(parametrogenericoAux);
					}		
				}
				this.iIdNuevoParametroGenerico=0L;
				this.parametrogenericos.removeAll(parametrogenericosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroGenerico 
					&& this.parametrogenericoLogic.getParametroGenericos().size()>0
					) {
					parametrogenericoAux=this.parametrogenericoLogic.getParametroGenericos().get(this.parametrogenericoLogic.getParametroGenericos().size() - 1);
				
					if(parametrogenericoAux.getId()<0) {
						this.parametrogenericoLogic.getParametroGenericos().remove(parametrogenericoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroGenerico && this.parametrogenericos.size()>0) {
					parametrogenericoAux=this.parametrogenericos.get(this.parametrogenericos.size() - 1);
				
					if(parametrogenericoAux.getId()<0) {
						this.parametrogenericos.remove(parametrogenericoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroGenerico(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametrogenerico.getId()<0) {
				this.parametrogenericoLogic.getParametroGenericos().remove(this.parametrogenerico);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametrogenerico.getId()<0) {
				this.parametrogenericos.remove(this.parametrogenerico);
			}
		}			
	}
	
	public void setEstadosInicialesParametroGenerico(List<ParametroGenerico> parametrogenericosAux) throws Exception {
		ParametroGenericoConstantesFunciones.setEstadosInicialesParametroGenerico(parametrogenericosAux);
	}
	
	public void setEstadosInicialesParametroGenerico(ParametroGenerico parametrogenericoAux) throws Exception {
		ParametroGenericoConstantesFunciones.setEstadosInicialesParametroGenerico(parametrogenericoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroGenericoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroGenerico("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroGenericoActual()) {
				if(!this.isEsNuevoParametroGenerico) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroGenerico("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroGenerico=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroGenericoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Generico ?", "MANTENIMIENTO DE Parametro Generico", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroGenerico("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroGenerico parametrogenerico) throws Exception {
		ParametroGenericoConstantesFunciones.seleccionarAsignar(this.parametrogenerico,parametrogenerico);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroGenerico=this.isPermisoActualizarOriginalParametroGenerico;
			
			
			this.seleccionarAsignar(parametrogenerico);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroGenericoConstantesFunciones.quitarEspaciosParametroGenerico(this.parametrogenerico,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroGenerico("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametrogenericoSessionBean.setsFuncionBusquedaRapida(this.parametrogenericoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroGenerico) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroGenerico(esParaCancelar);				
				this.cancelarNuevoParametroGenerico(esParaCancelar);								
			}
			
			this.parametrogenerico=new ParametroGenerico();
			
			this.inicializarParametroGenerico();
			
			this.actualizarEstadoCeldasBotonesParametroGenerico("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroGenerico() throws Exception {
		try {
			ParametroGenericoConstantesFunciones.inicializarParametroGenerico(this.parametrogenerico);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametrogenericoLogic.getParametroGenericos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroGenericos(String sAccionBusqueda,List<ParametroGenerico> parametrogenericosParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroGenerico"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroGenericoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroGenericoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroGenerico"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Genericos");		
		parameters.put("busquedapor", ParametroGenericoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroGenerico=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroGenericoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroGenericoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroGenerico=new JRBeanArrayDataSource(ParametroGenericoJInternalFrame.TraerParametroGenericoBeans(parametrogenericosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroGenerico);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroGenericoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroGenericoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroGenericoBean.TraerParametroGenericoBeans(parametrogenericosParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroGenericos(sAccionBusqueda,sTipoArchivoReporte,parametrogenericosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroGenericos(sAccionBusqueda,sTipoArchivoReporte,parametrogenericosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroGenericoActionPerformed(null);
					//this.generarExcelReporteParametroGenericos(sAccionBusqueda,sTipoArchivoReporte,parametrogenericosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroGenericos(sAccionBusqueda,sTipoArchivoReporte,parametrogenericosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroGenericos(sAccionBusqueda,sTipoArchivoReporte,parametrogenericosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroGenericos(sAccionBusqueda,sTipoArchivoReporte,parametrogenericosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroGenericos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroGenerico> parametrogenericosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogenerico";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroGenericos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroGenerico("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroGenerico parametrogenerico : parametrogenericosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroGenericoConstantesFunciones.generarExcelReporteDataParametroGenerico("NORMAL",row,workbook,parametrogenerico,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Generico",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroGenerico(String sTipo,Row row,Workbook workbook) {
		
		ParametroGenericoConstantesFunciones.generarExcelReporteHeaderParametroGenerico(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroGenericos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroGenerico> parametrogenericosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogenerico_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroGenericos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroGenerico parametrogenerico : parametrogenericosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroGenericoConstantesFunciones.getParametroGenericoDescripcion(parametrogenerico));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogenerico.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogenerico.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGenericoConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogenerico.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogenerico.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametrogenerico.getcodigo()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogenerico.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogenerico.gettransaccionrecibo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGenericoConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogenerico.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogenerico.getservicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGenericoConstantesFunciones.LABEL_IDFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogenerico.getformato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogenerico.getformatorecibo_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Generico",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroGenericos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroGenerico> parametrogenericosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroGenerico> parametrogenericosRespaldo=null;
		
		classes=ParametroGenericoConstantesFunciones.getClassesRelationshipsOfParametroGenerico(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametrogenericoLogic.setDatosCliente(this.datosCliente);
		this.parametrogenericoLogic.setDatosDeep(this.datosDeep);
		this.parametrogenericoLogic.setIsConDeep(true);
		
		parametrogenericosRespaldo=this.parametrogenericoLogic.getParametroGenericos();
		
		this.parametrogenericoLogic.setParametroGenericos(parametrogenericosParaReportes);	
		this.parametrogenericoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametrogenericosParaReportes=this.parametrogenericoLogic.getParametroGenericos();
		this.parametrogenericoLogic.setParametroGenericos(parametrogenericosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogenerico_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroGenericos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroGenerico("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroGenerico parametrogenerico : parametrogenericosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroGenerico("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroGenericoConstantesFunciones.generarExcelReporteDataParametroGenerico("NORMAL",row,workbook,parametrogenerico,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroGenericoConstantesFunciones.getParametroGenericoDescripcion(parametrogenerico));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Generico",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroGenerico.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGenerico.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroGenerico.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGenerico.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroGenerico() throws Exception {		
		this.startProcessParametroGenerico(true);
	}
	
	public void startProcessParametroGenerico(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroGenerico ,this.jPanelParametrosReportesParametroGenerico, this.jScrollPanelDatosParametroGenerico,this.jPanelPaginacionParametroGenerico, this.jScrollPanelDatosEdicionParametroGenerico, this.jPanelAccionesParametroGenerico,this.jPanelAccionesFormularioParametroGenerico,this.jmenuBarParametroGenerico,this.jmenuBarDetalleParametroGenerico,this.jTtoolBarParametroGenerico,this.jTtoolBarDetalleParametroGenerico);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroGenerico=this.jTabbedPaneBusquedasParametroGenerico; 
		
		final JPanel jPanelParametrosReportesParametroGenerico=this.jPanelParametrosReportesParametroGenerico;
		//final JScrollPane jScrollPanelDatosParametroGenerico=this.jScrollPanelDatosParametroGenerico;
		final JTable jTableDatosParametroGenerico=this.jTableDatosParametroGenerico;		
		final JPanel jPanelPaginacionParametroGenerico=this.jPanelPaginacionParametroGenerico;
		//final JScrollPane jScrollPanelDatosEdicionParametroGenerico=this.jScrollPanelDatosEdicionParametroGenerico;
		final JPanel jPanelAccionesParametroGenerico=this.jPanelAccionesParametroGenerico;
		
		JPanel jPanelCamposAuxiliarParametroGenerico=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroGenerico=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			jPanelCamposAuxiliarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jPanelCamposParametroGenerico;
			jPanelAccionesFormularioAuxiliarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jPanelAccionesFormularioParametroGenerico;
		}
		
		final JPanel jPanelCamposParametroGenerico=jPanelCamposAuxiliarParametroGenerico;
		final JPanel jPanelAccionesFormularioParametroGenerico=jPanelAccionesFormularioAuxiliarParametroGenerico;
		
		
		final JMenuBar jmenuBarParametroGenerico=this.jmenuBarParametroGenerico;
		final JToolBar jTtoolBarParametroGenerico=this.jTtoolBarParametroGenerico;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroGenerico=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroGenerico=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			jmenuBarDetalleAuxiliarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jmenuBarDetalleParametroGenerico;
			jTtoolBarDetalleAuxiliarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jTtoolBarDetalleParametroGenerico;
		}
		
		final JMenuBar jmenuBarDetalleParametroGenerico=jmenuBarDetalleAuxiliarParametroGenerico;
		final JToolBar jTtoolBarDetalleParametroGenerico=jTtoolBarDetalleAuxiliarParametroGenerico;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroGenerico;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroGenerico;
			processRunnable.jTableDatos=jTableDatosParametroGenerico;
			processRunnable.jPanelCampos=jPanelCamposParametroGenerico;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroGenerico;
			processRunnable.jPanelAcciones=jPanelAccionesParametroGenerico;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroGenerico;
			
			
			processRunnable.jmenuBar=jmenuBarParametroGenerico;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroGenerico;
			processRunnable.jTtoolBar=jTtoolBarParametroGenerico;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroGenerico;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroGenerico ,jPanelParametrosReportesParametroGenerico,jTableDatosParametroGenerico, /*jScrollPanelDatosParametroGenerico,*/jPanelCamposParametroGenerico,jPanelPaginacionParametroGenerico, /*jScrollPanelDatosEdicionParametroGenerico,*/ jPanelAccionesParametroGenerico,jPanelAccionesFormularioParametroGenerico,jmenuBarParametroGenerico,jmenuBarDetalleParametroGenerico,jTtoolBarParametroGenerico,jTtoolBarDetalleParametroGenerico);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroGenerico ,jPanelParametrosReportesParametroGenerico, jScrollPanelDatosParametroGenerico,jPanelPaginacionParametroGenerico, jScrollPanelDatosEdicionParametroGenerico, jPanelAccionesParametroGenerico,jPanelAccionesFormularioParametroGenerico,jmenuBarParametroGenerico,jmenuBarDetalleParametroGenerico,jTtoolBarParametroGenerico,jTtoolBarDetalleParametroGenerico);
						
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
	
	public void finishProcessParametroGenerico() {// throws Exception 
		this.finishProcessParametroGenerico(true);
	}
	
	public void finishProcessParametroGenerico(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroGenerico ,this.jPanelParametrosReportesParametroGenerico, this.jScrollPanelDatosParametroGenerico,this.jPanelPaginacionParametroGenerico, this.jScrollPanelDatosEdicionParametroGenerico, this.jPanelAccionesParametroGenerico,this.jPanelAccionesFormularioParametroGenerico,this.jmenuBarParametroGenerico,this.jmenuBarDetalleParametroGenerico,this.jTtoolBarParametroGenerico,this.jTtoolBarDetalleParametroGenerico);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroGenerico=this.jTabbedPaneBusquedasParametroGenerico; 
		
		final JPanel jPanelParametrosReportesParametroGenerico=this.jPanelParametrosReportesParametroGenerico;
		//final JScrollPane jScrollPanelDatosParametroGenerico=this.jScrollPanelDatosParametroGenerico;
		final JTable jTableDatosParametroGenerico=this.jTableDatosParametroGenerico;		
		final JPanel jPanelPaginacionParametroGenerico=this.jPanelPaginacionParametroGenerico;
		//final JScrollPane jScrollPanelDatosEdicionParametroGenerico=this.jScrollPanelDatosEdicionParametroGenerico;
		final JPanel jPanelAccionesParametroGenerico=this.jPanelAccionesParametroGenerico;
		
		JPanel jPanelCamposAuxiliarParametroGenerico=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroGenerico=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			jPanelCamposAuxiliarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jPanelCamposParametroGenerico;
			jPanelAccionesFormularioAuxiliarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jPanelAccionesFormularioParametroGenerico;
		}
		
		final JPanel jPanelCamposParametroGenerico=jPanelCamposAuxiliarParametroGenerico;
		final JPanel jPanelAccionesFormularioParametroGenerico=jPanelAccionesFormularioAuxiliarParametroGenerico;
		
		
		final JMenuBar jmenuBarParametroGenerico=this.jmenuBarParametroGenerico;		
		final JToolBar jTtoolBarParametroGenerico=this.jTtoolBarParametroGenerico;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroGenerico=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroGenerico=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			jmenuBarDetalleAuxiliarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jmenuBarDetalleParametroGenerico;
			jTtoolBarDetalleAuxiliarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jTtoolBarDetalleParametroGenerico;		
		}
		
		final JMenuBar jmenuBarDetalleParametroGenerico=jmenuBarDetalleAuxiliarParametroGenerico;
		final JToolBar jTtoolBarDetalleParametroGenerico=jTtoolBarDetalleAuxiliarParametroGenerico;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroGenerico;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroGenerico;
			processRunnable.jTableDatos=jTableDatosParametroGenerico;
			processRunnable.jPanelCampos=jPanelCamposParametroGenerico;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroGenerico;
			processRunnable.jPanelAcciones=jPanelAccionesParametroGenerico;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroGenerico;
			
			
			processRunnable.jmenuBar=jmenuBarParametroGenerico;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroGenerico;
			processRunnable.jTtoolBar=jTtoolBarParametroGenerico;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroGenerico;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroGenerico ,jPanelParametrosReportesParametroGenerico, jTableDatosParametroGenerico,/*jScrollPanelDatosParametroGenerico,*/jPanelCamposParametroGenerico,jPanelPaginacionParametroGenerico, /*jScrollPanelDatosEdicionParametroGenerico,*/ jPanelAccionesParametroGenerico,jPanelAccionesFormularioParametroGenerico,jmenuBarParametroGenerico,jmenuBarDetalleParametroGenerico,jTtoolBarParametroGenerico,jTtoolBarDetalleParametroGenerico));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroGenerico(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroGenerico(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroGenerico(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroGenerico(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroGenerico,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroGenerico,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroGenerico(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroGenerico,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroGenerico,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametrogenericoConstantesFunciones.getsFinalQueryParametroGenerico();
		String  finalQueryPaginacionTodos=this.parametrogenericoConstantesFunciones.getsFinalQueryParametroGenerico();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroGenericoConstantesFunciones.getArrayColumnasGlobalesNoParametroGenerico(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroGenericoConstantesFunciones.getArrayColumnasGlobalesParametroGenerico(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroGenericoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametrogenericosEliminados= new ArrayList<ParametroGenerico>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroGenerico();
		
				///*ParametroGenericoSessionBean*/this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
			
			if(this.parametrogenericoSessionBean==null) {
				this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
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
					this.iNumeroPaginacion=ParametroGenericoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroGenericoConstantesFunciones.getClassesForeignKeysOfParametroGenerico(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametrogenerico."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametrogenericosAux= new ArrayList<ParametroGenerico>();
			
				
			parametrogenericoLogic.setDatosCliente(this.datosCliente);
			parametrogenericoLogic.setDatosDeep(this.datosDeep);
			parametrogenericoLogic.setIsConDeep(true);
			
			
			parametrogenericoLogic.getParametroGenericoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametrogenericoLogic.getTodosParametroGenericos(finalQueryGlobal,pagination);
					
					//parametrogenericoLogic.getTodosParametroGenericosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametrogenericoLogic.getParametroGenericos()==null|| parametrogenericoLogic.getParametroGenericos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrogenericosAux= new ArrayList<ParametroGenerico>();
							parametrogenericosAux.addAll(parametrogenericoLogic.getParametroGenericos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenericosAux= new ArrayList<ParametroGenerico>();
							parametrogenericosAux.addAll(parametrogenericos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrogenericoLogic.getTodosParametroGenericos(finalQueryGlobal+"",this.pagination);												
							
							//parametrogenericoLogic.getTodosParametroGenericosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroGenericos("Todos",parametrogenericoLogic.getParametroGenericos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrogenericoLogic.setParametroGenericos(new ArrayList<ParametroGenerico>());					
							parametrogenericoLogic.getParametroGenericos().addAll(parametrogenericosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenericos=new ArrayList<ParametroGenerico>();
							parametrogenericos.addAll(parametrogenericosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroGenerico=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroGenerico=this.idActual;
				
				} else if(this.idParametroGenericoActual!=null && this.idParametroGenericoActual!=0L) {
					idParametroGenerico=idParametroGenericoActual;
				}
				
					
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndicePorId(idParametroGenerico);
				
				this.parametrogenericos=new ArrayList<ParametroGenerico>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametrogenericoLogic.getEntity(idParametroGenerico);
					
					//parametrogenericoLogic.getEntityWithConnection(idParametroGenerico);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogenericoLogic.setParametroGenericos(new ArrayList<ParametroGenerico>());
					parametrogenericoLogic.getParametroGenericos().add(parametrogenericoLogic.getParametroGenerico());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogenericos=new ArrayList<ParametroGenerico>();
					this.parametrogenericos.add(parametrogenerico);
				}
				
				if(parametrogenericoLogic.getParametroGenerico()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrogenericoLogic.getParametroGenericosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrogenericoLogic.getParametroGenericos()==null||parametrogenericoLogic.getParametroGenericos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrogenericos==null|| parametrogenericos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericosAux=new ArrayList<ParametroGenerico>();
						parametrogenericosAux.addAll(parametrogenericoLogic.getParametroGenericos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenericosAux=new ArrayList<ParametroGenerico>();
							parametrogenericosAux.addAll(parametrogenericos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrogenericoLogic.getParametroGenericosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroGenericos("FK_IdBodega",parametrogenericoLogic.getParametroGenericos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroGenericos("FK_IdBodega",parametrogenericos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericoLogic.setParametroGenericos(new ArrayList<ParametroGenerico>());
						parametrogenericoLogic.getParametroGenericos().addAll(parametrogenericosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenericos=new ArrayList<ParametroGenerico>();
							parametrogenericos.addAll(parametrogenericosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrogenericoLogic.getParametroGenericosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrogenericoLogic.getParametroGenericos()==null||parametrogenericoLogic.getParametroGenericos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrogenericos==null|| parametrogenericos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericosAux=new ArrayList<ParametroGenerico>();
						parametrogenericosAux.addAll(parametrogenericoLogic.getParametroGenericos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenericosAux=new ArrayList<ParametroGenerico>();
							parametrogenericosAux.addAll(parametrogenericos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrogenericoLogic.getParametroGenericosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroGenericos("FK_IdEmpresa",parametrogenericoLogic.getParametroGenericos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroGenericos("FK_IdEmpresa",parametrogenericos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericoLogic.setParametroGenericos(new ArrayList<ParametroGenerico>());
						parametrogenericoLogic.getParametroGenericos().addAll(parametrogenericosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenericos=new ArrayList<ParametroGenerico>();
							parametrogenericos.addAll(parametrogenericosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrogenericoLogic.getParametroGenericosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrogenericoLogic.getParametroGenericos()==null||parametrogenericoLogic.getParametroGenericos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrogenericos==null|| parametrogenericos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericosAux=new ArrayList<ParametroGenerico>();
						parametrogenericosAux.addAll(parametrogenericoLogic.getParametroGenericos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenericosAux=new ArrayList<ParametroGenerico>();
							parametrogenericosAux.addAll(parametrogenericos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrogenericoLogic.getParametroGenericosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroGenericos("FK_IdModulo",parametrogenericoLogic.getParametroGenericos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroGenericos("FK_IdModulo",parametrogenericos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericoLogic.setParametroGenericos(new ArrayList<ParametroGenerico>());
						parametrogenericoLogic.getParametroGenericos().addAll(parametrogenericosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenericos=new ArrayList<ParametroGenerico>();
							parametrogenericos.addAll(parametrogenericosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrogenericoLogic.getParametroGenericosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrogenericoLogic.getParametroGenericos()==null||parametrogenericoLogic.getParametroGenericos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrogenericos==null|| parametrogenericos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericosAux=new ArrayList<ParametroGenerico>();
						parametrogenericosAux.addAll(parametrogenericoLogic.getParametroGenericos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenericosAux=new ArrayList<ParametroGenerico>();
							parametrogenericosAux.addAll(parametrogenericos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrogenericoLogic.getParametroGenericosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGenericoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroGenericos("FK_IdSucursal",parametrogenericoLogic.getParametroGenericos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroGenericos("FK_IdSucursal",parametrogenericos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericoLogic.setParametroGenericos(new ArrayList<ParametroGenerico>());
						parametrogenericoLogic.getParametroGenericos().addAll(parametrogenericosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenericos=new ArrayList<ParametroGenerico>();
							parametrogenericos.addAll(parametrogenericosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroGenerico();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroGenerico();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrogenericoLogic.getParametroGenericos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrogenericos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrogenericoLogic.getParametroGenericos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrogenericos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroGenerico parametrogenerico) {
		Boolean permite=true;
		
		if(this.parametrogenerico.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroGenericoConstantesFunciones.getOrderByListaParametroGenerico();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroGenericoConstantesFunciones.getOrderByListaParametroGenerico();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGenerico parametrogenerico:parametrogenericoLogic.getParametroGenericos()) {
				if(parametrogenerico.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogenericoTotales=parametrogenerico;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGenerico parametrogenerico:this.parametrogenericos) {
				if(parametrogenerico.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogenericoTotales=parametrogenerico;
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
			this.parametrogenericoAux=new ParametroGenerico();
			this.parametrogenericoAux.setsType(Constantes2.S_TOTALES);
			this.parametrogenericoAux.setIsNew(false);
			this.parametrogenericoAux.setIsChanged(false);
			this.parametrogenericoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroGenericoConstantesFunciones.TotalizarValoresFilaParametroGenerico(this.parametrogenericoLogic.getParametroGenericos(),this.parametrogenericoAux);
				
				this.parametrogenericoLogic.getParametroGenericos().add(this.parametrogenericoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroGenericoConstantesFunciones.TotalizarValoresFilaParametroGenerico(this.parametrogenericos,this.parametrogenericoAux);
				
				this.parametrogenericos.add(this.parametrogenericoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametrogenericoTotales=new ParametroGenerico();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrogenericoLogic.getParametroGenericos().remove(parametrogenericoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrogenericos.remove(parametrogenericoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametrogenericoTotales=new ParametroGenerico();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGenerico parametrogenerico:parametrogenericoLogic.getParametroGenericos()) {
				if(parametrogenerico.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogenericoTotales=parametrogenerico;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroGenericoConstantesFunciones.TotalizarValoresFilaParametroGenerico(this.parametrogenericoLogic.getParametroGenericos(),parametrogenericoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGenerico parametrogenerico:this.parametrogenericos) {
				if(parametrogenerico.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogenericoTotales=parametrogenerico;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroGenericoConstantesFunciones.TotalizarValoresFilaParametroGenerico(this.parametrogenericos,parametrogenericoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroGenericosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroGenericosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroGenericosFK_IdFormato()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroGenericosFK_IdFormatoRecibo()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormatoRecibo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroGenericosFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroGenericosFK_IdServicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdServicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroGenericosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroGenericosFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroGenericosFK_IdTransaccionRecibo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccionRecibo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroGenericosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogenericoLogic.getParametroGenericosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroGenericosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogenericoLogic.getParametroGenericosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroGenericosFK_IdFormato(String sFinalQuery,Long id_formato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogenericoLogic.getParametroGenericosFK_IdFormato(sFinalQuery,this.pagination,id_formato);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroGenericosFK_IdFormatoRecibo(String sFinalQuery,Long id_formato_recibo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogenericoLogic.getParametroGenericosFK_IdFormatoRecibo(sFinalQuery,this.pagination,id_formato_recibo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroGenericosFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogenericoLogic.getParametroGenericosFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroGenericosFK_IdServicio(String sFinalQuery,Long id_servicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogenericoLogic.getParametroGenericosFK_IdServicio(sFinalQuery,this.pagination,id_servicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroGenericosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogenericoLogic.getParametroGenericosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroGenericosFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogenericoLogic.getParametroGenericosFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroGenericosFK_IdTransaccionRecibo(String sFinalQuery,Long id_transaccion_recibo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogenericoLogic.getParametroGenericosFK_IdTransaccionRecibo(sFinalQuery,this.pagination,id_transaccion_recibo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
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
	
	public void inicializarPermisosParametroGenerico() {
		this.isPermisoTodoParametroGenerico=false;
		this.isPermisoNuevoParametroGenerico=false;
		this.isPermisoActualizarParametroGenerico=false;
		this.isPermisoActualizarOriginalParametroGenerico=false;
		this.isPermisoEliminarParametroGenerico=false;
		this.isPermisoGuardarCambiosParametroGenerico=false;
		this.isPermisoConsultaParametroGenerico=false;
		this.isPermisoBusquedaParametroGenerico=false;
		this.isPermisoReporteParametroGenerico=false;		
		this.isPermisoOrdenParametroGenerico=false;		
		this.isPermisoPaginacionMedioParametroGenerico=false;		
		this.isPermisoPaginacionAltoParametroGenerico=false;
		this.isPermisoPaginacionTodoParametroGenerico=false;
		this.isPermisoCopiarParametroGenerico=false;		
		this.isPermisoVerFormParametroGenerico=false;		
		this.isPermisoDuplicarParametroGenerico=false;		
		this.isPermisoOrdenParametroGenerico=false;		
	}
	
	public void setPermisosUsuarioParametroGenerico(Boolean isPermiso) {
		this.isPermisoTodoParametroGenerico=isPermiso;
		this.isPermisoNuevoParametroGenerico=isPermiso;
		this.isPermisoActualizarParametroGenerico=isPermiso;
		this.isPermisoActualizarOriginalParametroGenerico=isPermiso;
		this.isPermisoEliminarParametroGenerico=isPermiso;
		this.isPermisoGuardarCambiosParametroGenerico=isPermiso;
		this.isPermisoConsultaParametroGenerico=isPermiso;
		this.isPermisoBusquedaParametroGenerico=isPermiso;
		this.isPermisoReporteParametroGenerico=isPermiso;
		this.isPermisoOrdenParametroGenerico=isPermiso;		
		this.isPermisoPaginacionMedioParametroGenerico=isPermiso;		
		this.isPermisoPaginacionAltoParametroGenerico=isPermiso;		
		this.isPermisoPaginacionTodoParametroGenerico=isPermiso;		
		this.isPermisoCopiarParametroGenerico=isPermiso;		
		this.isPermisoVerFormParametroGenerico=isPermiso;		
		this.isPermisoDuplicarParametroGenerico=isPermiso;
		this.isPermisoOrdenParametroGenerico=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroGenerico(Boolean isPermiso) {
		//this.isPermisoTodoParametroGenerico=isPermiso;
		this.isPermisoNuevoParametroGenerico=isPermiso;
		this.isPermisoActualizarParametroGenerico=isPermiso;
		this.isPermisoActualizarOriginalParametroGenerico=isPermiso;
		this.isPermisoEliminarParametroGenerico=isPermiso;
		this.isPermisoGuardarCambiosParametroGenerico=isPermiso;
		//this.isPermisoConsultaParametroGenerico=isPermiso;
		//this.isPermisoBusquedaParametroGenerico=isPermiso;
		//this.isPermisoReporteParametroGenerico=isPermiso;
		//this.isPermisoOrdenParametroGenerico=isPermiso;		
		//this.isPermisoPaginacionMedioParametroGenerico=isPermiso;		
		//this.isPermisoPaginacionAltoParametroGenerico=isPermiso;		
		//this.isPermisoPaginacionTodoParametroGenerico=isPermiso;		
		//this.isPermisoCopiarParametroGenerico=isPermiso;		
		//this.isPermisoDuplicarParametroGenerico=isPermiso;
		//this.isPermisoOrdenParametroGenerico=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroGenericoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroGenericoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroGenerico(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroGenericoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroGenericoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroGenericoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroGenericoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroGenerico() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroGenericoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroGenericoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroGenerico=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroGenerico=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroGenerico=this.isPermisoActualizarParametroGenerico;
			this.isPermisoEliminarParametroGenerico=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroGenerico=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroGenerico=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroGenerico=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroGenerico=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroGenerico=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroGenerico=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroGenerico=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroGenerico=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroGenerico=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroGenerico=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroGenerico=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroGenerico=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroGenerico=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroGenerico.setToolTipText(this.jTableDatosParametroGenerico.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroGenerico(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroGenerico(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroGenericoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroGenericoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroGenerico() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyParametroGenericoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
				this.transaccionrecibosForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.serviciosForeignKey=new ArrayList();
				this.formatosForeignKey=new ArrayList();
				this.formatorecibosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroGenericoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroGenericoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroGenericoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionReciboListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyServicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoReciboListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionReciboListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionrecibosForeignKey==null||this.transaccionrecibosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionRecibosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodegaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyServicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.serviciosForeignKey==null||this.serviciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ServicioConstantesFunciones.getArrayColumnasGlobalesServicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ServicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ServicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosServiciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoReciboListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatorecibosForeignKey==null||this.formatorecibosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatoRecibosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyParametroGenericoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroGenericoParameterReturnGeneral parametrogenericoReturnGeneral=new ParametroGenericoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametrogenericoConstantesFunciones.cargarid_empresaParametroGenerico)
					 || (this.esRecargarFks && this.parametrogenericoConstantesFunciones.cargarid_empresaParametroGenerico)) {

					if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametrogenericoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.parametrogenericoConstantesFunciones.cargarid_sucursalParametroGenerico)
					 || (this.esRecargarFks && this.parametrogenericoConstantesFunciones.cargarid_sucursalParametroGenerico)) {

					if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+parametrogenericoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.parametrogenericoConstantesFunciones.cargarid_moduloParametroGenerico)
					 || (this.esRecargarFks && this.parametrogenericoConstantesFunciones.cargarid_moduloParametroGenerico)) {

					if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+parametrogenericoSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTransaccion="";

				if(((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0) && this.parametrogenericoConstantesFunciones.cargarid_transaccionParametroGenerico)
					 || (this.esRecargarFks && this.parametrogenericoConstantesFunciones.cargarid_transaccionParametroGenerico)) {

					if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccion=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccion, "");
						finalQueryGlobalTransaccion+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccion=" WHERE " + ConstantesSql.ID + "="+parametrogenericoSessionBean.getlidTransaccionActual();
					}
				} else {
					finalQueryGlobalTransaccion="NONE";
				}


				String finalQueryGlobalTransaccionRecibo="";

				if(((this.transaccionrecibosForeignKey==null||this.transaccionrecibosForeignKey.size()<=0) && this.parametrogenericoConstantesFunciones.cargarid_transaccion_reciboParametroGenerico)
					 || (this.esRecargarFks && this.parametrogenericoConstantesFunciones.cargarid_transaccion_reciboParametroGenerico)) {

					if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionRecibo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccionRecibo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccionRecibo=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccionRecibo, "");
						finalQueryGlobalTransaccionRecibo+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionRecibosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccionRecibo=" WHERE " + ConstantesSql.ID + "="+parametrogenericoSessionBean.getlidTransaccionReciboActual();
					}
				} else {
					finalQueryGlobalTransaccionRecibo="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.parametrogenericoConstantesFunciones.cargarid_bodegaParametroGenerico)
					 || (this.esRecargarFks && this.parametrogenericoConstantesFunciones.cargarid_bodegaParametroGenerico)) {

					if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+parametrogenericoSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalServicio="";

				if(((this.serviciosForeignKey==null||this.serviciosForeignKey.size()<=0) && this.parametrogenericoConstantesFunciones.cargarid_servicioParametroGenerico)
					 || (this.esRecargarFks && this.parametrogenericoConstantesFunciones.cargarid_servicioParametroGenerico)) {

					if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionServicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ServicioConstantesFunciones.getArrayColumnasGlobalesServicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalServicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ServicioConstantesFunciones.TABLENAME);

						finalQueryGlobalServicio=Funciones.GetFinalQueryAppend(finalQueryGlobalServicio, "");
						finalQueryGlobalServicio+=ServicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosServiciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalServicio=" WHERE " + ConstantesSql.ID + "="+parametrogenericoSessionBean.getlidServicioActual();
					}
				} else {
					finalQueryGlobalServicio="NONE";
				}


				String finalQueryGlobalFormato="";

				if(((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0) && this.parametrogenericoConstantesFunciones.cargarid_formatoParametroGenerico)
					 || (this.esRecargarFks && this.parametrogenericoConstantesFunciones.cargarid_formatoParametroGenerico)) {

					if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato, "");
						finalQueryGlobalFormato+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato=" WHERE " + ConstantesSql.ID + "="+parametrogenericoSessionBean.getlidFormatoActual();
					}
				} else {
					finalQueryGlobalFormato="NONE";
				}


				String finalQueryGlobalFormatoRecibo="";

				if(((this.formatorecibosForeignKey==null||this.formatorecibosForeignKey.size()<=0) && this.parametrogenericoConstantesFunciones.cargarid_formato_reciboParametroGenerico)
					 || (this.esRecargarFks && this.parametrogenericoConstantesFunciones.cargarid_formato_reciboParametroGenerico)) {

					if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionFormatoRecibo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormatoRecibo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormatoRecibo=Funciones.GetFinalQueryAppend(finalQueryGlobalFormatoRecibo, "");
						finalQueryGlobalFormatoRecibo+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatoRecibosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormatoRecibo=" WHERE " + ConstantesSql.ID + "="+parametrogenericoSessionBean.getlidFormatoReciboActual();
					}
				} else {
					finalQueryGlobalFormatoRecibo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametrogenericoReturnGeneral=parametrogenericoLogic.cargarCombosLoteForeignKeyParametroGenerico(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalModulo,finalQueryGlobalTransaccion,finalQueryGlobalTransaccionRecibo,finalQueryGlobalBodega,finalQueryGlobalServicio,finalQueryGlobalFormato,finalQueryGlobalFormatoRecibo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametrogenericoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=parametrogenericoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=parametrogenericoReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTransaccion.equals("NONE")) {
				this.transaccionsForeignKey=parametrogenericoReturnGeneral.gettransaccionsForeignKey();
			}

			if(!finalQueryGlobalTransaccionRecibo.equals("NONE")) {
				this.transaccionrecibosForeignKey=parametrogenericoReturnGeneral.gettransaccionrecibosForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=parametrogenericoReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalServicio.equals("NONE")) {
				this.serviciosForeignKey=parametrogenericoReturnGeneral.getserviciosForeignKey();
			}

			if(!finalQueryGlobalFormato.equals("NONE")) {
				this.formatosForeignKey=parametrogenericoReturnGeneral.getformatosForeignKey();
			}

			if(!finalQueryGlobalFormatoRecibo.equals("NONE")) {
				this.formatorecibosForeignKey=parametrogenericoReturnGeneral.getformatorecibosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroGenerico()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTransaccion();
			this.addItemDefectoCombosForeignKeyTransaccionRecibo();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyServicio();
			this.addItemDefectoCombosForeignKeyFormato();
			this.addItemDefectoCombosForeignKeyFormatoRecibo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametrogenericoSessionBean==null) {
				this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
			}

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				Transaccion transaccion=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionsForeignKey,transaccion,true)) {

					this.transaccionsForeignKey.add(0,transaccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccionRecibo()throws Exception {
		try {

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionRecibo()) {
				Transaccion transaccionrecibo=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccionrecibo,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccionrecibo.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionrecibosForeignKey,transaccionrecibo,true)) {

					this.transaccionrecibosForeignKey.add(0,transaccionrecibo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				Bodega bodega=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodega,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodega.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasForeignKey,bodega,true)) {

					this.bodegasForeignKey.add(0,bodega);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyServicio()throws Exception {
		try {

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionServicio()) {
				Servicio servicio=new Servicio();
				ServicioConstantesFunciones.setServicioDescripcion(servicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				servicio.setId(null);

				if(!ServicioConstantesFunciones.ExisteEnLista(this.serviciosForeignKey,servicio,true)) {

					this.serviciosForeignKey.add(0,servicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormato()throws Exception {
		try {

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				Formato formato=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formatosForeignKey,formato,true)) {

					this.formatosForeignKey.add(0,formato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormatoRecibo()throws Exception {
		try {

			if(!this.parametrogenericoSessionBean.getisBusquedaDesdeForeignKeySesionFormatoRecibo()) {
				Formato formatorecibo=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formatorecibo,Constantes.SMENSAJE_ESCOJA_OPCION);
				formatorecibo.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formatorecibosForeignKey,formatorecibo,true)) {

					this.formatorecibosForeignKey.add(0,formatorecibo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyParametroGenerico()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroGenerico(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroGenerico()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroGenerico();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroGenerico(ParametroGenerico parametrogenerico)throws Exception {	
		try {
			
			this.setActualModuloForeignKey(parametrogenerico.getid_modulo(),false,"Formulario");
			this.setActualTransaccionForeignKey(parametrogenerico.getid_transaccion(),false,"Formulario");
			this.setActualTransaccionReciboForeignKey(parametrogenerico.getid_transaccion_recibo(),false,"Formulario");
			this.setActualBodegaForeignKey(parametrogenerico.getid_bodega(),false,"Formulario");
			this.setActualServicioForeignKey(parametrogenerico.getid_servicio(),false,"Formulario");
			this.setActualFormatoForeignKey(parametrogenerico.getid_formato(),false,"Formulario");
			this.setActualFormatoReciboForeignKey(parametrogenerico.getid_formato_recibo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroGenerico(ParametroGenerico parametrogenerico,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroGenerico()throws Exception {	
		try {
			
			this.setActualModuloForeignKey(this.parametrogenericoConstantesFunciones.getid_modulo(),false,"Formulario");
			this.setActualTransaccionForeignKey(this.parametrogenericoConstantesFunciones.getid_transaccion(),false,"Formulario");
			this.setActualTransaccionReciboForeignKey(this.parametrogenericoConstantesFunciones.getid_transaccion_recibo(),false,"Formulario");
			this.setActualBodegaForeignKey(this.parametrogenericoConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualServicioForeignKey(this.parametrogenericoConstantesFunciones.getid_servicio(),false,"Formulario");
			this.setActualFormatoForeignKey(this.parametrogenericoConstantesFunciones.getid_formato(),false,"Formulario");
			this.setActualFormatoReciboForeignKey(this.parametrogenericoConstantesFunciones.getid_formato_recibo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroGenerico()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroGenerico()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroGenerico()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroGenerico()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroGenerico()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");
			this.cargarCombosFrameTransaccionRecibosForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameServiciosForeignKey("Todos");
			this.cargarCombosFrameFormatosForeignKey("Todos");
			this.cargarCombosFrameFormatoRecibosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroGenerico(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionRecibosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameServiciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatoRecibosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroGenerico()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public ParametroGenericoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroGenericoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroGenericoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametrogenericoSessionBean=new ParametroGenericoSessionBean(); 
		this.parametrogenericoConstantesFunciones=new ParametroGenericoConstantesFunciones(); 
		this.parametrogenericoBean=new ParametroGenerico();//(this.parametrogenericoConstantesFunciones); 		
		this.parametrogenericoReturnGeneral=new ParametroGenericoParameterReturnGeneral(); 
		
		this.parametrogenericoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrogenericoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroGenericoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroGenericoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroGenericoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroGenerico(true);
			
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
			
			this.parametrogenericoConstantesFunciones=new ParametroGenericoConstantesFunciones(); 
			this.parametrogenericoBean=new ParametroGenerico();//this.parametrogenericoConstantesFunciones); 			
			this.parametrogenericoReturnGeneral=new ParametroGenericoParameterReturnGeneral(); 
		
			ParametroGenericoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Generico Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parametrogenerico=new ParametroGenerico();
			this.parametrogenericos = new ArrayList<ParametroGenerico>();
			this.parametrogenericosAux = new ArrayList<ParametroGenerico>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic=new ParametroGenericoLogic();
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}
			
			//this.parametrogenericoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametrogenericoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroGenerico);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroGenerico!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroGenerico);	
					}
					
					if(this.jInternalFrameImportacionParametroGenerico!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroGenerico);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroGenerico!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroGenerico);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroGenerico);
				this.jInternalFrameDetalleFormParametroGenerico.setVisible(false);
				this.jInternalFrameDetalleFormParametroGenerico.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroGenerico!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroGenerico);
					this.jInternalFrameReporteDinamicoParametroGenerico.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroGenerico.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroGenerico!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroGenerico);
					this.jInternalFrameImportacionParametroGenerico.setVisible(false);
					this.jInternalFrameImportacionParametroGenerico.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroGenerico!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroGenerico);
					this.jInternalFrameOrderByParametroGenerico.setVisible(false);
					this.jInternalFrameOrderByParametroGenerico.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroGenericoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroGenericoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametrogenericoReturnGeneral=new ParametroGenericoParameterReturnGeneral();
			
			this.parametrogenericoParameterGeneral=new ParametroGenericoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametrogenericoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroGenericoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroGenericoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrogenericoSessionBean.getEsGuardarRelacionado(),this.parametrogenericoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroGenericoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrogenericoSessionBean.getEsGuardarRelacionado(),this.parametrogenericoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroGenerico=false;
			this.isVisibilidadCeldaDuplicarParametroGenerico=true;
			this.isVisibilidadCeldaCopiarParametroGenerico=true;
			this.isVisibilidadCeldaVerFormParametroGenerico=true;
			this.isVisibilidadCeldaOrdenParametroGenerico=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=false;
			this.isVisibilidadCeldaModificarParametroGenerico=false;
			this.isVisibilidadCeldaActualizarParametroGenerico=false;
			this.isVisibilidadCeldaEliminarParametroGenerico=false;
			this.isVisibilidadCeldaCancelarParametroGenerico=false;
			this.isVisibilidadCeldaGuardarParametroGenerico=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGenerico=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFormato=true;
			this.isVisibilidadFK_IdFormatoRecibo=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdServicio=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTransaccion=true;
			this.isVisibilidadFK_IdTransaccionRecibo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroGenerico("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroGenerico();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroGenerico(false);
			
			this.setPermisosUsuarioParametroGenerico();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado() 
				|| (this.parametrogenericoSessionBean.getEsGuardarRelacionado() && this.parametrogenericoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroGenericoClasesRelacionadas();
			}
			
			if(this.parametrogenericoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroGenericoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroGenerico();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroGenerico();
			}
			
			if(!this.isPermisoBusquedaParametroGenerico) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroGenerico.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroGenerico,this.isPermisoPaginacionMedioParametroGenerico,this.isPermisoPaginacionTodoParametroGenerico);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroGenericoConstantesFunciones.getTiposSeleccionarParametroGenerico());
				
				this.tiposColumnasSelect=ParametroGenericoConstantesFunciones.getTiposSeleccionarParametroGenerico(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroGenerico();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroGenerico(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroGenerico(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroGenerico() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.moduloLogic=new ModuloLogic();
			this.transaccionLogic=new TransaccionLogic();
			this.transaccionreciboLogic=new TransaccionLogic();
			this.bodegaLogic=new BodegaLogic();
			this.servicioLogic=new ServicioLogic();
			this.formatoLogic=new FormatoLogic();
			this.formatoreciboLogic=new FormatoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parametrogenericoImplementable= (ParametroGenericoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroGenericoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametrogenericoImplementableHome= (ParametroGenericoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroGenericoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametrogenericos= new ArrayList<ParametroGenerico>();
			this.parametrogenericosEliminados= new ArrayList<ParametroGenerico>();
						
			this.isEsNuevoParametroGenerico=false;
			this.esParaAccionDesdeFormularioParametroGenerico=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			this.transaccionrecibosForeignKey=new ArrayList<Transaccion>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.serviciosForeignKey=new ArrayList<Servicio>() ;
			this.formatosForeignKey=new ArrayList<Formato>() ;
			this.formatorecibosForeignKey=new ArrayList<Formato>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroGenerico(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroGenerico();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroGenericoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroGenericoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroGenerico("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroGenerico(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroGenerico!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroGenerico();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroGenerico();
			}
			
			ParametroGenericoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroGenerico.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroGenerico.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroGenerico.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroGenerico(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroGenerico: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroGenerico() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroGenerico")) {
				iIndex=this.jInternalFrameDetalleFormParametroGenerico.jTabbedPaneRelacionesParametroGenerico.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroGenerico.jTabbedPaneRelacionesParametroGenerico.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroGenerico();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyParametroGenerico(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroGenerico(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroGenerico(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroGenericoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroGenerico();
		
		this.cargarCombosFrameForeignKeyParametroGenerico();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroGenerico();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroGenerico();
		}
	}
	
	

	public void cargarCombosForeignKeyModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaModulo(this.modulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion(this.transaccionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionRecibo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionReciboListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccionRecibo();
				this.cargarCombosFrameTransaccionRecibosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccionRecibo(this.transaccionrecibosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodega(this.bodegasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyServicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyServicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyServicio();
				this.cargarCombosFrameServiciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaServicio(this.serviciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormato(this.formatosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoRecibo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoReciboListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormatoRecibo();
				this.cargarCombosFrameFormatoRecibosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormatoRecibo(this.formatorecibosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoParametroGenericoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametrogenericoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroGenerico==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			
			
			if(jTableDatosParametroGenerico.getRowCount()>=1) {
				jTableDatosParametroGenerico.removeRowSelectionInterval(0, jTableDatosParametroGenerico.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroGenerico=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroGenerico(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroGenerico(true);			
			//this.parametrogenerico=new ParametroGenerico();
			//this.parametrogenerico.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroGenerico(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroGenerico() ;
			
			if(ParametroGenericoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroGenerico(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametrogenerico);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);				
			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			
			if(this.parametrogenericoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroGenerico: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroGenericoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroGenerico.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroGenerico.getSelectedRows().length;			
			}
			
			parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroGenerico--;			
				//ParametroGenerico parametrogenericoAux= new ParametroGenerico();			
				//parametrogenericoAux.setId(this.iIdNuevoParametroGenerico);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroGenerico parametrogenericoOrigen=new ParametroGenerico();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroGenerico parametrogenericoOrigen : parametrogenericosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametrogenericoOrigen =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenericoOrigen =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroGenerico();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametrogenerico.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroGenerico(parametrogenericoOrigen,this.parametrogenerico,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrogenericoLogic.getParametroGenericos().add(this.parametrogenericoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrogenericos.add(this.parametrogenericoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroGenerico(false);
				
				this.jTableDatosParametroGenerico.setRowSelectionInterval(this.getIndiceNuevoParametroGenerico(), this.getIndiceNuevoParametroGenerico());
				
				int iLastRow =  this.jTableDatosParametroGenerico.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroGenerico.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroGenerico.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroGenerico(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroGenericoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();									
		
			ParametroGenerico parametrogenericoOrigen=new ParametroGenerico();
			ParametroGenerico parametrogenericoDestino=new ParametroGenerico();
				
			parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroGenerico.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametrogenericosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroGenerico.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericoOrigen =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrogenericoOrigen =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogenericoDestino =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrogenericoDestino =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametrogenericoOrigen =parametrogenericosSeleccionados.get(0);
				parametrogenericoDestino =parametrogenericosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroGenerico(parametrogenericoOrigen,parametrogenericoDestino,true,false);
				
				parametrogenericoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrogenericoDestino,parametrogenericoLogic.getParametroGenericos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrogenericoDestino,parametrogenericos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroGenerico(false);
				
				//this.jTableDatosParametroGenerico.setRowSelectionInterval(this.getIndiceNuevoParametroGenerico(), this.getIndiceNuevoParametroGenerico());
				
				int iLastRow =  this.jTableDatosParametroGenerico.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroGenerico.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroGenerico.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroGenerico(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroGenericoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroGenerico==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroGenerico.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroGenericoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroGenerico.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroGenerico.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroGenerico.setVisible(!isVisible);
			this.jPanelPaginacionParametroGenerico.setVisible(!isVisible);
			this.jPanelAccionesParametroGenerico.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroGenericoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroGenerico();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroGenericoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroGenerico();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroGenericoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroGenerico();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroGenericoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroGenerico();
			
			this.abrirFrameOrderByParametroGenerico();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroGenericoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroGenerico();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroGenerico(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroGenerico);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroGenerico.isMaximum()) {
					this.jInternalFrameDetalleFormParametroGenerico.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroGenerico.setSize(this.jInternalFrameDetalleFormParametroGenerico.iWidthFormulario,this.jInternalFrameDetalleFormParametroGenerico.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroGenerico.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroGenerico.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroGenerico.isMaximum()) {
						this.jInternalFrameDetalleFormParametroGenerico.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroGenerico.jContentPaneDetalleParametroGenerico.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroGenerico.jTabbedPaneRelacionesParametroGenerico.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroGenerico.jContentPaneDetalleParametroGenerico.getWidth(),ParametroGenericoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroGenerico.jTabbedPaneRelacionesParametroGenerico.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroGenerico.jContentPaneDetalleParametroGenerico.getWidth(),ParametroGenericoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroGenerico.jTabbedPaneRelacionesParametroGenerico.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroGenerico.jContentPaneDetalleParametroGenerico.getWidth(),ParametroGenericoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroGenerico.setVisible(true);
	        this.jInternalFrameDetalleFormParametroGenerico.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroGenerico() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroGenerico==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroGenerico=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGenerico,false,this);
				} else {
					this.jInternalFrameOrderByParametroGenerico=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGenerico,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroGenerico);
				this.jInternalFrameOrderByParametroGenerico.setVisible(false);
				this.jInternalFrameOrderByParametroGenerico.setSelected(false);
				
				this.jInternalFrameOrderByParametroGenerico.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroGenerico"));
				
				this.inicializarActualizarBindingTablaOrderByParametroGenerico();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroGenerico() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroGenerico==null) {
				
				this.jInternalFrameImportacionParametroGenerico=new ImportacionJInternalFrame(ParametroGenericoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroGenerico);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroGenerico);
				this.jInternalFrameImportacionParametroGenerico.setVisible(false);
				this.jInternalFrameImportacionParametroGenerico.setSelected(false);


				this.jInternalFrameImportacionParametroGenerico.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroGenerico"));
				this.jInternalFrameImportacionParametroGenerico.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroGenerico"));
				this.jInternalFrameImportacionParametroGenerico.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroGenerico"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroGenerico() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroGenerico==null) {
				this.jInternalFrameReporteDinamicoParametroGenerico=new ReporteDinamicoJInternalFrame(ParametroGenericoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroGenerico);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroGenerico);
				this.jInternalFrameReporteDinamicoParametroGenerico.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroGenerico.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroGenerico.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroGenerico"));
				this.jInternalFrameReporteDinamicoParametroGenerico.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroGenerico"));
				this.jInternalFrameReporteDinamicoParametroGenerico.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroGenerico"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroGenerico();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroGenerico() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroGenerico);
			
	       	this.jInternalFrameDetalleFormParametroGenerico.setVisible(false);
	        this.jInternalFrameDetalleFormParametroGenerico.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroGenerico.dispose();
			//this.jInternalFrameDetalleFormParametroGenerico=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroGenerico() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroGenerico.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroGenerico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroGenerico() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroGenerico.setVisible(true);
	        this.jInternalFrameImportacionParametroGenerico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroGenerico() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroGenerico.setVisible(true);
	        this.jInternalFrameOrderByParametroGenerico.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroGenerico() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroGenerico.setVisible(false);
	        this.jInternalFrameOrderByParametroGenerico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroGenerico() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroGenerico.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroGenerico.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroGenerico() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroGenerico.setVisible(false);
	        this.jInternalFrameImportacionParametroGenerico.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroGenericoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroGenerico(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroGenerico(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroGenerico(true);
			//this.isEsNuevoParametroGenerico=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroGenerico("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroGenerico(false) ;
			
			if(parametrogenericoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroGenericoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroGenerico(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroGenerico(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroGenericoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroGenerico(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroGenerico==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroGenerico(true);
			//this.isEsNuevoParametroGenerico=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametrogenerico.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroGenerico("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroGenerico(false) ;
			
			if(ParametroGenericoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroGenerico(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroGenerico(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaModulo(List<Modulo> modulosForeignKey)throws Exception{
		TableColumn tableColumnModulo=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroGenerico.getSelectedRow();

		//if(intSelectedRow<=0) {
			//moduloTableCellFk.setRowActual(intSelectedRow);
			//moduloTableCellFk.setmodulosForeignKeyActual(modulosForeignKey);
		//}


		if(moduloTableCellFk!=null) {
			moduloTableCellFk.RecargarModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroGenerico.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccionRecibo(List<Transaccion> transaccionrecibosForeignKey)throws Exception{
		TableColumn tableColumnTransaccionRecibo=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO));
		TableCellEditor tableCellEditorTransaccionRecibo =tableColumnTransaccionRecibo.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccionRecibo;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionrecibosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroGenerico.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionrecibosForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroGenerico.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaServicio(List<Servicio> serviciosForeignKey)throws Exception{
		TableColumn tableColumnServicio=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO));
		TableCellEditor tableCellEditorServicio =tableColumnServicio.getCellEditor();

		ServicioTableCell servicioTableCellFk=(ServicioTableCell)tableCellEditorServicio;

		if(servicioTableCellFk!=null) {
			servicioTableCellFk.setserviciosForeignKey(serviciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroGenerico.getSelectedRow();

		//if(intSelectedRow<=0) {
			//servicioTableCellFk.setRowActual(intSelectedRow);
			//servicioTableCellFk.setserviciosForeignKeyActual(serviciosForeignKey);
		//}


		if(servicioTableCellFk!=null) {
			servicioTableCellFk.RecargarServiciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormato(List<Formato> formatosForeignKey)throws Exception{
		TableColumn tableColumnFormato=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDFORMATO));
		TableCellEditor tableCellEditorFormato =tableColumnFormato.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formatosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroGenerico.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formatosForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFormatoRecibo(List<Formato> formatorecibosForeignKey)throws Exception{
		TableColumn tableColumnFormatoRecibo=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO));
		TableCellEditor tableCellEditorFormatoRecibo =tableColumnFormatoRecibo.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormatoRecibo;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formatorecibosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroGenerico.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formatorecibosForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarParametroGenericoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroGenerico(false);
			
			//if(!this.isEsNuevoParametroGenerico) {								
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				
			}
			
			if(this.permiteMantenimiento(this.parametrogenerico)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroGenerico=true;
					this.inicializarActualizarBindingTablaParametroGenerico(false);
					this.isEsNuevoParametroGenerico=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroGenerico=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroGenerico=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroGenerico(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroGenerico(false);
				
				this.habilitarDeshabilitarControlesParametroGenerico(false);
			
												
				
				if(ParametroGenericoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroGenerico();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroGenericoActionPerformed(evt,parametrogenericoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroGenerico(this.parametrogenerico,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroGenerico.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametrogenericoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametrogenerico.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroGenerico.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGenerico.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroGenericoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				this.parametrogenerico.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				this.parametrogenerico.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametrogenerico)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroGenericoModel) this.jTableDatosParametroGenerico.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroGenerico=true;
				this.inicializarActualizarBindingTablaParametroGenerico(false);
				this.isEsNuevoParametroGenerico=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroGenerico(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroGenerico(false);
				
				this.habilitarDeshabilitarControlesParametroGenerico(false);
				
				
				
				if(ParametroGenericoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroGenerico();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroGenericoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroGenerico.getRowCount()>=1) {
				jTableDatosParametroGenerico.removeRowSelectionInterval(0, jTableDatosParametroGenerico.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroGenerico(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroGenerico(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroGenerico(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroGenerico(false) ;
			
			this.isEsNuevoParametroGenerico=false;
			
			if(ParametroGenericoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroGenerico();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroGenericoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroGenerico(false);
				
				//SI ES MANUAL
				if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroGenerico();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroGenericoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroGenerico--;			
			//ParametroGenerico parametrogenericoAux= new ParametroGenerico();			
			//parametrogenericoAux.setId(this.iIdNuevoParametroGenerico);
			
			if(this.jInternalFrameDetalleFormParametroGenerico==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroGenerico();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
			
			this.parametrogenerico.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametrogenericoLogic.getParametroGenericos().add(this.parametrogenericoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametrogenericos.add(this.parametrogenericoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroGenerico(false);
			
			this.jTableDatosParametroGenerico.setRowSelectionInterval(this.getIndiceNuevoParametroGenerico(), this.getIndiceNuevoParametroGenerico());
			
			int iLastRow =  this.jTableDatosParametroGenerico.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroGenerico.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroGenerico.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroGenerico(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroGenericoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroGenerico(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroGenerico(false);
			
			//SI ES MANUAL
			if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroGenerico();
			}
			
			//this.abrirFrameTreeParametroGenerico();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroGenericoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro GenericoS ?", "MANTENIMIENTO DE Parametro Generico", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroGenerico.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroGenerico();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametrogenericoReturnGeneral=parametrogenericoLogic.procesarImportacionParametroGenericosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametrogenericoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroGenericoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroGenericoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroGenerico.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroGenerico.setFileImportacion(this.jInternalFrameImportacionParametroGenerico.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroGenerico.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroGenerico.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroGenerico.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroGenerico.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroGenericoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();		

		parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroGenerico.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroGenerico.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroGenericoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroGenericoBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroGenericos("Todos",parametrogenericosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Generico",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroGenerico.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGenerico.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nPresupuestoCiudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nPresupuestoCiudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nPresupuestoCiudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nPresupuestoCiudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Transaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Transaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Transaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Transaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TransaccionRecibo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TransaccionRecibo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TransaccionRecibo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TransaccionRecibo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Servicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Servicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Servicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Servicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FormatoRecibo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FormatoRecibo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FormatoRecibo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FormatoRecibo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParametroGenerico.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroGenerico.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroGenerico.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD:
					sNombreCampoCategoria="codigo";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION:
					sNombreCampoCategoria="id_transaccion";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO:
					sNombreCampoCategoria="id_transaccion_recibo";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO:
					sNombreCampoCategoria="id_servicio";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoria="id_formato";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO:
					sNombreCampoCategoria="id_formato_recibo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroGenerico.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION:
					sNombreCampoCategoriaValor="id_transaccion";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO:
					sNombreCampoCategoriaValor="id_transaccion_recibo";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO:
					sNombreCampoCategoriaValor="id_servicio";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoriaValor="id_formato";
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO:
					sNombreCampoCategoriaValor="id_formato_recibo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroGenerico.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGenerico.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Presupuesto Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion");
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion Recibo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion_recibo");
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Servicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_servicio");
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato");
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato Recibo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato_recibo");
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroGenericoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();		
		
		parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogenerico";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroGenericos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroGenerico.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGenerico.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroGenerico parametrogenerico:parametrogenericosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogenerico.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ParametroGenerico parametrogenerico:parametrogenericosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogenerico.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(ParametroGenerico parametrogenerico:parametrogenericosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogenerico.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(ParametroGenerico parametrogenerico:parametrogenericosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogenerico.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD);
					iRow++;

					for(ParametroGenerico parametrogenerico:parametrogenericosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogenerico.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(ParametroGenerico parametrogenerico:parametrogenericosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogenerico.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO);
					iRow++;

					for(ParametroGenerico parametrogenerico:parametrogenericosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogenerico.gettransaccionrecibo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ParametroGenerico parametrogenerico:parametrogenericosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogenerico.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO);
					iRow++;

					for(ParametroGenerico parametrogenerico:parametrogenericosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogenerico.getservicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDFORMATO);
					iRow++;

					for(ParametroGenerico parametrogenerico:parametrogenericosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogenerico.getformato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO);
					iRow++;

					for(ParametroGenerico parametrogenerico:parametrogenericosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogenerico.getformatorecibo_descripcion());
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
			//	this.getFilaCabeceraExportarExcelParametroGenerico(row);				
			//	iRow++;
			//}				
			
			//for(ParametroGenerico parametrogenericoAux:parametrogenericosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroGenerico(parametrogenericoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Generico",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroGenerico(false);
			
			//SI ES MANUAL
			if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroGenerico();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroGenericoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroGenerico(false);
			
			//SI ES MANUAL
			if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroGenerico();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroGenericoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroGenerico(false);
			
			//SI ES MANUAL
			if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroGenerico();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroGenerico() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroGenerico.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroGenerico.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroGenerico.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroGenerico.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroGenerico.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroGenerico.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroGenerico.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroGenerico(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroGenerico(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroGenerico(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroGenerico(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroGenerico(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroGenerico(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroGenerico(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroGenerico(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroGenericoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroGenerico() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroGenerico();
		
		this.inicializarActualizarBindingBotonesManualParametroGenerico(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroGenerico();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroGenerico() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroGenerico(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroGenerico(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroGenerico.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroGenerico.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroGenerico.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxPostAccionNuevoParametroGenerico.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxPostAccionSinCerrarParametroGenerico.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxPostAccionSinMensajeParametroGenerico.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroGenerico.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroGenerico.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroGenerico.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
				this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxPostAccionNuevoParametroGenerico.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxPostAccionSinCerrarParametroGenerico.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxPostAccionSinMensajeParametroGenerico.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroGenerico.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroGenerico.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroGenerico.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroGenerico!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroGenerico.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroGenerico.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroGenerico.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroGenerico.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroGenerico.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroGenerico!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroGenerico.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroGenerico.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroGenerico.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroGenerico(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroGenerico(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroGenerico() throws Exception {
		try	{
			if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroGenerico();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroGenerico() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroGenerico() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroGenerico.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroGenerico.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroGenerico.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroGenerico.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroGenerico.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroGenerico.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroGenerico.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroGenerico.addItem(reporte);
			}
			
			
			if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroGenerico.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroGenerico.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroGenerico.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroGenerico.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroGenerico.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroGenerico.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroGenerico.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroGenerico.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroGenerico.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroGenerico();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroGenerico() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroGenerico!=null) {
				this.jInternalFrameReporteDinamicoParametroGenerico.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroGenerico.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroGenerico!=null) {
				this.jInternalFrameReporteDinamicoParametroGenerico.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroGenerico.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroGenerico!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroGenerico.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroGenerico.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroGenerico.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroGenerico.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroGenerico.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroGenerico.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroGenerico()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaParametroGenerico.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaParametroGenerico.getSelectedItem()).getId();}
		if(this.jComboBoxid_moduloFK_IdModuloParametroGenerico.getSelectedItem()!=null){this.id_moduloFK_IdModulo=((Modulo)this.jComboBoxid_moduloFK_IdModuloParametroGenerico.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroGenerico(Boolean esInicializar) throws Exception {				
		if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroGenerico();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroGenerico() throws Exception {
		this.inicializarActualizarBindingTablaParametroGenerico(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroGenerico() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroGenericoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenericoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroGenerico(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametrogenericoLogic.getParametroGenericos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametrogenericos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroGenerico.setModel(new ParametroGenericoModel(this.parametrogenericoLogic.getParametroGenericos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroGenerico.setModel(new ParametroGenericoModel(this.parametrogenericos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroGenerico!=null && this.jInternalFrameOrderByParametroGenerico.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroGenerico();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO,parametrogenericoConstantesFunciones.resaltarSeleccionarParametroGenerico,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroGenericoConstantesFunciones.SCLASSWEBTITULO,parametrogenericoConstantesFunciones.resaltarSeleccionarParametroGenerico,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_ID));

		if(this.parametrogenericoConstantesFunciones.mostraridParametroGenerico && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGenericoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametrogenericoConstantesFunciones.resaltaridParametroGenerico,this.parametrogenericoConstantesFunciones.activaridParametroGenerico,this,true,"idParametroGenerico","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogenericoConstantesFunciones.resaltaridParametroGenerico,this.parametrogenericoConstantesFunciones.activaridParametroGenerico,this,true,"idParametroGenerico","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametrogenericoConstantesFunciones.mostrarid_empresaParametroGenerico && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_empresaParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_empresaParametroGenerico));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_empresaParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_empresaParametroGenerico,false,"id_empresaParametroGenerico","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.parametrogenericoConstantesFunciones.mostrarid_sucursalParametroGenerico && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_sucursalParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_sucursalParametroGenerico));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_sucursalParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_sucursalParametroGenerico,false,"id_sucursalParametroGenerico","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDMODULO));

		if(this.parametrogenericoConstantesFunciones.mostrarid_moduloParametroGenerico && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGenericoConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_moduloParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_moduloParametroGenerico));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_moduloParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_moduloParametroGenerico,true,"id_moduloParametroGenerico","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL));

		if(this.parametrogenericoConstantesFunciones.mostrarsecuencialParametroGenerico && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrogenericoConstantesFunciones.resaltarsecuencialParametroGenerico,this.parametrogenericoConstantesFunciones.activarsecuencialParametroGenerico,this,true,"secuencialParametroGenerico","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogenericoConstantesFunciones.resaltarsecuencialParametroGenerico,this.parametrogenericoConstantesFunciones.activarsecuencialParametroGenerico,this,true,"secuencialParametroGenerico","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD));

		if(this.parametrogenericoConstantesFunciones.mostrarcodigoParametroGenerico && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametrogenericoConstantesFunciones.resaltarcodigoParametroGenerico,this.parametrogenericoConstantesFunciones.activarcodigoParametroGenerico));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametrogenericoConstantesFunciones.resaltarcodigoParametroGenerico,this.parametrogenericoConstantesFunciones.activarcodigoParametroGenerico,this,true,"codigoParametroGenerico","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION));

		if(this.parametrogenericoConstantesFunciones.mostrarid_transaccionParametroGenerico && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccionsForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_transaccionParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_transaccionParametroGenerico));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccionsForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_transaccionParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_transaccionParametroGenerico,true,"id_transaccionParametroGenerico","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO));

		if(this.parametrogenericoConstantesFunciones.mostrarid_transaccion_reciboParametroGenerico && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccionrecibosForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_transaccion_reciboParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_transaccion_reciboParametroGenerico));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccionrecibosForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_transaccion_reciboParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_transaccion_reciboParametroGenerico,true,"id_transaccion_reciboParametroGenerico","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDBODEGA));

		if(this.parametrogenericoConstantesFunciones.mostrarid_bodegaParametroGenerico && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGenericoConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_bodegaParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_bodegaParametroGenerico));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_bodegaParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_bodegaParametroGenerico,true,"id_bodegaParametroGenerico","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO));

		if(this.parametrogenericoConstantesFunciones.mostrarid_servicioParametroGenerico && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ServicioTableCell(this.serviciosForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_servicioParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_servicioParametroGenerico));
			tableColumn.setCellEditor(new ServicioTableCell(this.serviciosForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_servicioParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_servicioParametroGenerico,true,"id_servicioParametroGenerico","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDFORMATO));

		if(this.parametrogenericoConstantesFunciones.mostrarid_formatoParametroGenerico && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGenericoConstantesFunciones.LABEL_IDFORMATO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formatosForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_formatoParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_formatoParametroGenerico));
			tableColumn.setCellEditor(new FormatoTableCell(this.formatosForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_formatoParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_formatoParametroGenerico,true,"id_formatoParametroGenerico","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO));

		if(this.parametrogenericoConstantesFunciones.mostrarid_formato_reciboParametroGenerico && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formatorecibosForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_formato_reciboParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_formato_reciboParametroGenerico));
			tableColumn.setCellEditor(new FormatoTableCell(this.formatorecibosForeignKey,this.parametrogenericoConstantesFunciones.resaltarid_formato_reciboParametroGenerico,this,this.parametrogenericoConstantesFunciones.activarid_formato_reciboParametroGenerico,true,"id_formato_reciboParametroGenerico","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGenericoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrogenericoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrogenericoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroGenerico.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrogenericoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrogenericoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroGenerico.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametrogenericoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametrogenericoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroGenerico.addColumn(tableColumn);
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
			
			this.jTableDatosParametroGenerico.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroGenerico.moveColumn(this.jTableDatosParametroGenerico.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroGenerico.moveColumn(this.jTableDatosParametroGenerico.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroGenerico.moveColumn(this.jTableDatosParametroGenerico.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroGenerico.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroGenerico.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroGenerico,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroGenerico.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroGenerico.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroGenericoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroGenerico.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroGenerico.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroGenerico.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametrogenericoLogic.getParametroGenericos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametrogenericos.size()-1;
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
		//this.jTableDatosParametroGenerico.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroGenerico.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroGenerico();
			
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
				
				//this.isEsNuevoParametroGenerico=false;
					
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			
				if(this.parametrogenericoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroGenerico==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroGenerico.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroGenerico.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametrogenerico.getsType().equals("DUPLICADO")
				   || this.parametrogenerico.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroGenerico=true;
				
				} else {
					this.isEsNuevoParametroGenerico=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
					if(this.parametrogenerico.getId()>=0 && !this.parametrogenerico.getIsNew()) {						
						this.isEsNuevoParametroGenerico=false;
						
					} else {
						this.isEsNuevoParametroGenerico=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroGenerico(esRelaciones);						
				
				this.seleccionarParametroGenerico(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametrogenerico.getId()<0) {
					this.isEsNuevoParametroGenerico=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroGenerico(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroGenerico(evt,rowIndex);
				}	
				
				if(this.parametrogenericoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroGenerico: " + this.dDif); 
					}
				}								
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroGenerico(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametrogenerico)) {
					if(this.parametrogenerico.getId()>0) {
						this.parametrogenerico.setIsDeleted(true);
						
						this.parametrogenericosEliminados.add(this.parametrogenerico);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrogenericoLogic.getParametroGenericos().remove(this.parametrogenerico);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrogenericos.remove(this.parametrogenerico);				
					}
					
					
					((ParametroGenericoModel) this.jTableDatosParametroGenerico.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroGenerico(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroGenerico(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroGenerico) {
			
			if(this.jInternalFrameDetalleFormParametroGenerico==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroGenerico.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroGenerico.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroGenerico(this.parametrogenerico);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametrogenericoConstantesFunciones.cargarid_empresaParametroGenerico || this.parametrogenericoConstantesFunciones.event_dependid_empresaParametroGenerico) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametrogenerico.getid_empresa());
									//this.inicializarActualizarBindingParametroGenerico(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametrogenerico.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametrogenerico.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametrogenerico.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.parametrogenericoConstantesFunciones.cargarid_sucursalParametroGenerico || this.parametrogenericoConstantesFunciones.event_dependid_sucursalParametroGenerico) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.parametrogenerico.getid_sucursal());
									//this.inicializarActualizarBindingParametroGenerico(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(parametrogenerico.getSucursal()!=null) {
							this.sucursalsForeignKey.add(parametrogenerico.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.parametrogenerico.getid_sucursal(),false,"Formulario");

					//Modulo
					if(!this.parametrogenericoConstantesFunciones.cargarid_moduloParametroGenerico || this.parametrogenericoConstantesFunciones.event_dependid_moduloParametroGenerico) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.parametrogenerico.getid_modulo());
									//this.inicializarActualizarBindingParametroGenerico(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(parametrogenerico.getModulo()!=null) {
							this.modulosForeignKey.add(parametrogenerico.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.parametrogenerico.getid_modulo(),false,"Formulario");

					//Transaccion
					if(!this.parametrogenericoConstantesFunciones.cargarid_transaccionParametroGenerico || this.parametrogenericoConstantesFunciones.event_dependid_transaccionParametroGenerico) {
						//this.cargarCombosTransaccionsForeignKeyLista(" where id="+this.parametrogenerico.getid_transaccion());
									//this.inicializarActualizarBindingParametroGenerico(false,false);
						this.transaccionsForeignKey=new ArrayList<Transaccion>();

						if(parametrogenerico.getTransaccion()!=null) {
							this.transaccionsForeignKey.add(parametrogenerico.getTransaccion());
						}

						this.addItemDefectoCombosForeignKeyTransaccion();
						this.cargarCombosFrameTransaccionsForeignKey("Todos");
					}
					this.setActualTransaccionForeignKey(this.parametrogenerico.getid_transaccion(),false,"Formulario");

					//TransaccionRecibo
					if(!this.parametrogenericoConstantesFunciones.cargarid_transaccion_reciboParametroGenerico || this.parametrogenericoConstantesFunciones.event_dependid_transaccion_reciboParametroGenerico) {
						//this.cargarCombosTransaccionRecibosForeignKeyLista(" where id="+this.parametrogenerico.getid_transaccion_recibo());
									//this.inicializarActualizarBindingParametroGenerico(false,false);
						this.transaccionrecibosForeignKey=new ArrayList<Transaccion>();

						if(parametrogenerico.getTransaccionRecibo()!=null) {
							this.transaccionrecibosForeignKey.add(parametrogenerico.getTransaccionRecibo());
						}

						this.addItemDefectoCombosForeignKeyTransaccionRecibo();
						this.cargarCombosFrameTransaccionRecibosForeignKey("Todos");
					}
					this.setActualTransaccionReciboForeignKey(this.parametrogenerico.getid_transaccion_recibo(),false,"Formulario");

					//Bodega
					if(!this.parametrogenericoConstantesFunciones.cargarid_bodegaParametroGenerico || this.parametrogenericoConstantesFunciones.event_dependid_bodegaParametroGenerico) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.parametrogenerico.getid_bodega());
									//this.inicializarActualizarBindingParametroGenerico(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(parametrogenerico.getBodega()!=null) {
							this.bodegasForeignKey.add(parametrogenerico.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.parametrogenerico.getid_bodega(),false,"Formulario");

					//Servicio
					if(!this.parametrogenericoConstantesFunciones.cargarid_servicioParametroGenerico || this.parametrogenericoConstantesFunciones.event_dependid_servicioParametroGenerico) {
						//this.cargarCombosServiciosForeignKeyLista(" where id="+this.parametrogenerico.getid_servicio());
									//this.inicializarActualizarBindingParametroGenerico(false,false);
						this.serviciosForeignKey=new ArrayList<Servicio>();

						if(parametrogenerico.getServicio()!=null) {
							this.serviciosForeignKey.add(parametrogenerico.getServicio());
						}

						this.addItemDefectoCombosForeignKeyServicio();
						this.cargarCombosFrameServiciosForeignKey("Todos");
					}
					this.setActualServicioForeignKey(this.parametrogenerico.getid_servicio(),false,"Formulario");

					//Formato
					if(!this.parametrogenericoConstantesFunciones.cargarid_formatoParametroGenerico || this.parametrogenericoConstantesFunciones.event_dependid_formatoParametroGenerico) {
						//this.cargarCombosFormatosForeignKeyLista(" where id="+this.parametrogenerico.getid_formato());
									//this.inicializarActualizarBindingParametroGenerico(false,false);
						this.formatosForeignKey=new ArrayList<Formato>();

						if(parametrogenerico.getFormato()!=null) {
							this.formatosForeignKey.add(parametrogenerico.getFormato());
						}

						this.addItemDefectoCombosForeignKeyFormato();
						this.cargarCombosFrameFormatosForeignKey("Todos");
					}
					this.setActualFormatoForeignKey(this.parametrogenerico.getid_formato(),false,"Formulario");

					//FormatoRecibo
					if(!this.parametrogenericoConstantesFunciones.cargarid_formato_reciboParametroGenerico || this.parametrogenericoConstantesFunciones.event_dependid_formato_reciboParametroGenerico) {
						//this.cargarCombosFormatoRecibosForeignKeyLista(" where id="+this.parametrogenerico.getid_formato_recibo());
									//this.inicializarActualizarBindingParametroGenerico(false,false);
						this.formatorecibosForeignKey=new ArrayList<Formato>();

						if(parametrogenerico.getFormatoRecibo()!=null) {
							this.formatorecibosForeignKey.add(parametrogenerico.getFormatoRecibo());
						}

						this.addItemDefectoCombosForeignKeyFormatoRecibo();
						this.cargarCombosFrameFormatoRecibosForeignKey("Todos");
					}
					this.setActualFormatoReciboForeignKey(this.parametrogenerico.getid_formato_recibo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroGenerico("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroGenerico(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroGenerico() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroGenerico(ParametroGenerico parametrogenerico) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroGenerico(parametrogenerico,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroGenerico(ParametroGenerico parametrogenerico,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroGenerico(parametrogenerico);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroGenerico(parametrogenerico,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroGenerico(parametrogenerico);
	}
	
	public void setVariablesObjetoActualToFormularioParametroGenerico(ParametroGenerico parametrogenerico) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroGenerico==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroGenerico.jLabelidParametroGenerico.setText(parametrogenerico.getId().toString());
			this.jInternalFrameDetalleFormParametroGenerico.jTextFieldsecuencialParametroGenerico.setText(parametrogenerico.getsecuencial());
			this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxcodigoParametroGenerico.setSelected(parametrogenerico.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroGenerico parametrogenericoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametrogenericoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroGenerico parametrogenericoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametrogenericoLocal=this.parametrogenerico;
			} else {
				parametrogenericoLocal=this.parametrogenericoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametrogenericoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroGenerico(parametrogenericoLocal,true);
					
					if(parametrogenericoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametrogenericoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametrogenericoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroGenerico(ParametroGenerico parametrogenerico,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroGenerico(parametrogenerico,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(parametrogenerico);
	}
	
	public void setVariablesFormularioToObjetoActualParametroGenerico(ParametroGenerico parametrogenerico,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroGenerico(parametrogenerico,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroGenerico(ParametroGenerico parametrogenerico,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroGenerico==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroGenerico.jLabelidParametroGenerico.getText()==null || this.jInternalFrameDetalleFormParametroGenerico.jLabelidParametroGenerico.getText()=="" || this.jInternalFrameDetalleFormParametroGenerico.jLabelidParametroGenerico.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroGenerico.jLabelidParametroGenerico.setText("0");
			}

			if(conColumnasBase) {parametrogenerico.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroGenerico.jLabelidParametroGenerico.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGenericoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelIdParametroGenerico,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogenerico.setsecuencial(this.jInternalFrameDetalleFormParametroGenerico.jTextFieldsecuencialParametroGenerico.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelsecuencialParametroGenerico,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogenerico.setcodigo(this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxcodigoParametroGenerico.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGenerico.jLabelcodigoParametroGenerico,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroGenerico(ParametroGenerico parametrogenericoBean,ParametroGenerico parametrogenerico,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parametrogenericoBean.getid_modulo()!=null && !parametrogenericoBean.getid_modulo().equals(-1L))) {parametrogenerico.setid_modulo(parametrogenericoBean.getid_modulo());}
			if(conDefault || (!conDefault && parametrogenericoBean.getid_transaccion()!=null && !parametrogenericoBean.getid_transaccion().equals(-1L))) {parametrogenerico.setid_transaccion(parametrogenericoBean.getid_transaccion());}
			if(conDefault || (!conDefault && parametrogenericoBean.getid_transaccion_recibo()!=null && !parametrogenericoBean.getid_transaccion_recibo().equals(null))) {parametrogenerico.setid_transaccion_recibo(parametrogenericoBean.getid_transaccion_recibo());}
			if(conDefault || (!conDefault && parametrogenericoBean.getid_bodega()!=null && !parametrogenericoBean.getid_bodega().equals(-1L))) {parametrogenerico.setid_bodega(parametrogenericoBean.getid_bodega());}
			if(conDefault || (!conDefault && parametrogenericoBean.getid_servicio()!=null && !parametrogenericoBean.getid_servicio().equals(-1L))) {parametrogenerico.setid_servicio(parametrogenericoBean.getid_servicio());}
			if(conDefault || (!conDefault && parametrogenericoBean.getid_formato()!=null && !parametrogenericoBean.getid_formato().equals(-1L))) {parametrogenerico.setid_formato(parametrogenericoBean.getid_formato());}
			if(conDefault || (!conDefault && parametrogenericoBean.getid_formato_recibo()!=null && !parametrogenericoBean.getid_formato_recibo().equals(null))) {parametrogenerico.setid_formato_recibo(parametrogenericoBean.getid_formato_recibo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroGenerico(ParametroGenerico parametrogenericoOrigen,ParametroGenerico parametrogenerico,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrogenericoOrigen.getId()!=null && !parametrogenericoOrigen.getId().equals(0L))) {parametrogenerico.setId(parametrogenericoOrigen.getId());}}
			if(conDefault || (!conDefault && parametrogenericoOrigen.getid_modulo()!=null && !parametrogenericoOrigen.getid_modulo().equals(-1L))) {parametrogenerico.setid_modulo(parametrogenericoOrigen.getid_modulo());}
			if(conDefault || (!conDefault && parametrogenericoOrigen.getsecuencial()!=null && !parametrogenericoOrigen.getsecuencial().equals(""))) {parametrogenerico.setsecuencial(parametrogenericoOrigen.getsecuencial());}
			if(conDefault || (!conDefault && parametrogenericoOrigen.getcodigo()!=null && !parametrogenericoOrigen.getcodigo().equals(false))) {parametrogenerico.setcodigo(parametrogenericoOrigen.getcodigo());}
			if(conDefault || (!conDefault && parametrogenericoOrigen.getid_transaccion()!=null && !parametrogenericoOrigen.getid_transaccion().equals(-1L))) {parametrogenerico.setid_transaccion(parametrogenericoOrigen.getid_transaccion());}
			if(conDefault || (!conDefault && parametrogenericoOrigen.getid_transaccion_recibo()!=null && !parametrogenericoOrigen.getid_transaccion_recibo().equals(null))) {parametrogenerico.setid_transaccion_recibo(parametrogenericoOrigen.getid_transaccion_recibo());}
			if(conDefault || (!conDefault && parametrogenericoOrigen.getid_bodega()!=null && !parametrogenericoOrigen.getid_bodega().equals(-1L))) {parametrogenerico.setid_bodega(parametrogenericoOrigen.getid_bodega());}
			if(conDefault || (!conDefault && parametrogenericoOrigen.getid_servicio()!=null && !parametrogenericoOrigen.getid_servicio().equals(-1L))) {parametrogenerico.setid_servicio(parametrogenericoOrigen.getid_servicio());}
			if(conDefault || (!conDefault && parametrogenericoOrigen.getid_formato()!=null && !parametrogenericoOrigen.getid_formato().equals(-1L))) {parametrogenerico.setid_formato(parametrogenericoOrigen.getid_formato());}
			if(conDefault || (!conDefault && parametrogenericoOrigen.getid_formato_recibo()!=null && !parametrogenericoOrigen.getid_formato_recibo().equals(null))) {parametrogenerico.setid_formato_recibo(parametrogenericoOrigen.getid_formato_recibo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroGenerico(ParametroGenerico parametrogenerico) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroGenerico.jLabelidParametroGenerico.setText(parametrogenerico.getId().toString());
			this.jInternalFrameDetalleFormParametroGenerico.jTextFieldsecuencialParametroGenerico.setText(parametrogenerico.getsecuencial());
			this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxcodigoParametroGenerico.setSelected(parametrogenerico.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroGenerico(ParametroGenericoBean parametrogenericoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroGenerico.jLabelidParametroGenerico.setText(parametrogenericoBean.getId().toString());
			this.jInternalFrameDetalleFormParametroGenerico.jTextFieldsecuencialParametroGenerico.setText(parametrogenericoBean.getsecuencial());
			this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxcodigoParametroGenerico.setSelected(parametrogenericoBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroGenerico(ParametroGenericoParameterReturnGeneral parametrogenericoReturnGeneral,ParametroGenericoBean parametrogenericoBean,Boolean conDefault) throws Exception { 
		try {
			ParametroGenerico parametrogenericoLocal=new ParametroGenerico();
			
			parametrogenericoLocal=parametrogenericoReturnGeneral.getParametroGenerico();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrogenericoLocal.getId()!=null && !parametrogenericoLocal.getId().equals(0L))) {parametrogenericoBean.setId(parametrogenericoLocal.getId());}}
			if(conDefault || (!conDefault && parametrogenericoLocal.getid_modulo()!=null && !parametrogenericoLocal.getid_modulo().equals(-1L))) {parametrogenericoBean.setid_modulo(parametrogenericoLocal.getid_modulo());}
			if(conDefault || (!conDefault && parametrogenericoLocal.getsecuencial()!=null && !parametrogenericoLocal.getsecuencial().equals(""))) {parametrogenericoBean.setsecuencial(parametrogenericoLocal.getsecuencial());}
			if(conDefault || (!conDefault && parametrogenericoLocal.getcodigo()!=null && !parametrogenericoLocal.getcodigo().equals(false))) {parametrogenericoBean.setcodigo(parametrogenericoLocal.getcodigo());}
			if(conDefault || (!conDefault && parametrogenericoLocal.getid_transaccion()!=null && !parametrogenericoLocal.getid_transaccion().equals(-1L))) {parametrogenericoBean.setid_transaccion(parametrogenericoLocal.getid_transaccion());}
			if(conDefault || (!conDefault && parametrogenericoLocal.getid_transaccion_recibo()!=null && !parametrogenericoLocal.getid_transaccion_recibo().equals(null))) {parametrogenericoBean.setid_transaccion_recibo(parametrogenericoLocal.getid_transaccion_recibo());}
			if(conDefault || (!conDefault && parametrogenericoLocal.getid_bodega()!=null && !parametrogenericoLocal.getid_bodega().equals(-1L))) {parametrogenericoBean.setid_bodega(parametrogenericoLocal.getid_bodega());}
			if(conDefault || (!conDefault && parametrogenericoLocal.getid_servicio()!=null && !parametrogenericoLocal.getid_servicio().equals(-1L))) {parametrogenericoBean.setid_servicio(parametrogenericoLocal.getid_servicio());}
			if(conDefault || (!conDefault && parametrogenericoLocal.getid_formato()!=null && !parametrogenericoLocal.getid_formato().equals(-1L))) {parametrogenericoBean.setid_formato(parametrogenericoLocal.getid_formato());}
			if(conDefault || (!conDefault && parametrogenericoLocal.getid_formato_recibo()!=null && !parametrogenericoLocal.getid_formato_recibo().equals(null))) {parametrogenericoBean.setid_formato_recibo(parametrogenericoLocal.getid_formato_recibo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroGenericoGenerico(Long idParametroGenericoSeleccionado,JComboBox jComboBoxParametroGenerico,List<ParametroGenerico> parametrogenericosLocal)throws Exception {
		try {
			ParametroGenerico  parametrogenericoTemp=null;

			for(ParametroGenerico parametrogenericoAux:parametrogenericosLocal) {
				if(parametrogenericoAux.getId()!=null && parametrogenericoAux.getId().equals(idParametroGenericoSeleccionado)) {
					parametrogenericoTemp=parametrogenericoAux;
					break;
				}
			}

			jComboBoxParametroGenerico.setSelectedItem(parametrogenericoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroGenericoGenerico(JComboBox jComboBoxParametroGenerico,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroGenerico.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroGenerico.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroGenerico.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroGenerico.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroGenerico.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroGenerico.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrogenerico=(ParametroGenerico) parametrogenericoLogic.getParametroGenericos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrogenerico =(ParametroGenerico) parametrogenericos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametrogenerico.getIsNew() && !parametrogenerico.getIsChanged() && !parametrogenerico.getIsDeleted()) {
				sDescripcion=parametrogenerico.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrogenerico.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!parametrogenerico.getIsNew() && !parametrogenerico.getIsChanged() && !parametrogenerico.getIsDeleted()) {
				sDescripcion=parametrogenerico.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=parametrogenerico.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!parametrogenerico.getIsNew() && !parametrogenerico.getIsChanged() && !parametrogenerico.getIsDeleted()) {
				sDescripcion=parametrogenerico.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=parametrogenerico.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!parametrogenerico.getIsNew() && !parametrogenerico.getIsChanged() && !parametrogenerico.getIsDeleted()) {
				sDescripcion=parametrogenerico.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=parametrogenerico.gettransaccion_descripcion();
			}
		}

		if(sTipo.equals("TransaccionRecibo")) {
			//sDescripcion=this.getActualTransaccionReciboForeignKeyDescripcion((Long)value);
			if(!parametrogenerico.getIsNew() && !parametrogenerico.getIsChanged() && !parametrogenerico.getIsDeleted()) {
				sDescripcion=parametrogenerico.gettransaccionrecibo_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionReciboForeignKeyDescripcion((Long)value);
				sDescripcion=parametrogenerico.gettransaccionrecibo_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!parametrogenerico.getIsNew() && !parametrogenerico.getIsChanged() && !parametrogenerico.getIsDeleted()) {
				sDescripcion=parametrogenerico.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrogenerico.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Servicio")) {
			//sDescripcion=this.getActualServicioForeignKeyDescripcion((Long)value);
			if(!parametrogenerico.getIsNew() && !parametrogenerico.getIsChanged() && !parametrogenerico.getIsDeleted()) {
				sDescripcion=parametrogenerico.getservicio_descripcion();
			} else {
				//sDescripcion=this.getActualServicioForeignKeyDescripcion((Long)value);
				sDescripcion=parametrogenerico.getservicio_descripcion();
			}
		}

		if(sTipo.equals("Formato")) {
			//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
			if(!parametrogenerico.getIsNew() && !parametrogenerico.getIsChanged() && !parametrogenerico.getIsDeleted()) {
				sDescripcion=parametrogenerico.getformato_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
				sDescripcion=parametrogenerico.getformato_descripcion();
			}
		}

		if(sTipo.equals("FormatoRecibo")) {
			//sDescripcion=this.getActualFormatoReciboForeignKeyDescripcion((Long)value);
			if(!parametrogenerico.getIsNew() && !parametrogenerico.getIsChanged() && !parametrogenerico.getIsDeleted()) {
				sDescripcion=parametrogenerico.getformatorecibo_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoReciboForeignKeyDescripcion((Long)value);
				sDescripcion=parametrogenerico.getformatorecibo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroGenerico parametrogenericoRow=new ParametroGenerico();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrogenericoRow=(ParametroGenerico) parametrogenericoLogic.getParametroGenericos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrogenericoRow=(ParametroGenerico) parametrogenericos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroGenerico(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroGenerico.setVisible((this.isVisibilidadCeldaNuevoParametroGenerico && this.isPermisoNuevoParametroGenerico));			
			this.jButtonDuplicarParametroGenerico.setVisible((this.isVisibilidadCeldaDuplicarParametroGenerico && this.isPermisoDuplicarParametroGenerico));			
			this.jButtonCopiarParametroGenerico.setVisible((this.isVisibilidadCeldaCopiarParametroGenerico && this.isPermisoCopiarParametroGenerico));
			this.jButtonVerFormParametroGenerico.setVisible((this.isVisibilidadCeldaVerFormParametroGenerico && this.isPermisoVerFormParametroGenerico));
			
			this.jButtonAbrirOrderByParametroGenerico.setVisible((this.isVisibilidadCeldaOrdenParametroGenerico && this.isPermisoOrdenParametroGenerico));			
			
			this.jButtonNuevoRelacionesParametroGenerico.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroGenerico && this.isPermisoNuevoParametroGenerico));			
			this.jButtonNuevoGuardarCambiosParametroGenerico.setVisible((this.isVisibilidadCeldaNuevoParametroGenerico && this.isPermisoNuevoParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico));
			
			if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			this.jInternalFrameDetalleFormParametroGenerico.jButtonModificarParametroGenerico.setVisible((this.isVisibilidadCeldaModificarParametroGenerico && this.isPermisoActualizarParametroGenerico));	
			this.jInternalFrameDetalleFormParametroGenerico.jButtonActualizarParametroGenerico.setVisible((this.isVisibilidadCeldaActualizarParametroGenerico && this.isPermisoActualizarParametroGenerico));	
			this.jInternalFrameDetalleFormParametroGenerico.jButtonEliminarParametroGenerico.setVisible((this.isVisibilidadCeldaEliminarParametroGenerico && this.isPermisoEliminarParametroGenerico));
			this.jInternalFrameDetalleFormParametroGenerico.jButtonCancelarParametroGenerico.setVisible(this.isVisibilidadCeldaCancelarParametroGenerico);							
			this.jInternalFrameDetalleFormParametroGenerico.jButtonGuardarCambiosParametroGenerico.setVisible((this.isVisibilidadCeldaGuardarParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroGenerico.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroGenerico.setVisible((this.isVisibilidadCeldaNuevoParametroGenerico && this.isPermisoNuevoParametroGenerico));						
			this.jButtonDuplicarToolBarParametroGenerico.setVisible((this.isVisibilidadCeldaDuplicarParametroGenerico && this.isPermisoDuplicarParametroGenerico));						
			this.jButtonCopiarToolBarParametroGenerico.setVisible((this.isVisibilidadCeldaCopiarParametroGenerico && this.isPermisoCopiarParametroGenerico));			
			this.jButtonVerFormToolBarParametroGenerico.setVisible((this.isVisibilidadCeldaVerFormParametroGenerico && this.isPermisoVerFormParametroGenerico));			
			this.jButtonAbrirOrderByToolBarParametroGenerico.setVisible((this.isVisibilidadCeldaOrdenParametroGenerico && this.isPermisoOrdenParametroGenerico));
			this.jButtonNuevoRelacionesToolBarParametroGenerico.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroGenerico && this.isPermisoNuevoParametroGenerico));			
			this.jButtonNuevoGuardarCambiosToolBarParametroGenerico.setVisible((this.isVisibilidadCeldaNuevoParametroGenerico && this.isPermisoNuevoParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico));			
			
			if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			this.jInternalFrameDetalleFormParametroGenerico.jButtonModificarToolBarParametroGenerico.setVisible((this.isVisibilidadCeldaModificarParametroGenerico && this.isPermisoActualizarParametroGenerico));	
			this.jInternalFrameDetalleFormParametroGenerico.jButtonActualizarToolBarParametroGenerico.setVisible((this.isVisibilidadCeldaActualizarParametroGenerico  && this.isPermisoActualizarParametroGenerico));	
			this.jInternalFrameDetalleFormParametroGenerico.jButtonEliminarToolBarParametroGenerico.setVisible((this.isVisibilidadCeldaEliminarParametroGenerico && this.isPermisoEliminarParametroGenerico));
			this.jInternalFrameDetalleFormParametroGenerico.jButtonCancelarToolBarParametroGenerico.setVisible(this.isVisibilidadCeldaCancelarParametroGenerico);				
			this.jInternalFrameDetalleFormParametroGenerico.jButtonGuardarCambiosToolBarParametroGenerico.setVisible((this.isVisibilidadCeldaGuardarParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroGenerico.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroGenerico.setVisible((this.isVisibilidadCeldaNuevoParametroGenerico && this.isPermisoNuevoParametroGenerico));			
			this.jMenuItemDuplicarParametroGenerico.setVisible((this.isVisibilidadCeldaDuplicarParametroGenerico && this.isPermisoDuplicarParametroGenerico));			
			this.jMenuItemCopiarParametroGenerico.setVisible((this.isVisibilidadCeldaCopiarParametroGenerico && this.isPermisoCopiarParametroGenerico));			
			this.jMenuItemVerFormParametroGenerico.setVisible((this.isVisibilidadCeldaVerFormParametroGenerico && this.isPermisoVerFormParametroGenerico));			
			this.jMenuItemAbrirOrderByParametroGenerico.setVisible((this.isVisibilidadCeldaOrdenParametroGenerico && this.isPermisoOrdenParametroGenerico));			
			//this.jMenuItemMostrarOcultarParametroGenerico.setVisible((this.isVisibilidadCeldaOrdenParametroGenerico && this.isPermisoOrdenParametroGenerico));
			this.jMenuItemDetalleAbrirOrderByParametroGenerico.setVisible((this.isVisibilidadCeldaOrdenParametroGenerico && this.isPermisoOrdenParametroGenerico));			
			//this.jMenuItemDetalleMostrarOcultarParametroGenerico.setVisible((this.isVisibilidadCeldaOrdenParametroGenerico && this.isPermisoOrdenParametroGenerico));			
			this.jMenuItemNuevoRelacionesParametroGenerico.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroGenerico && this.isPermisoNuevoParametroGenerico));			
			this.jMenuItemNuevoGuardarCambiosParametroGenerico.setVisible((this.isVisibilidadCeldaNuevoParametroGenerico && this.isPermisoNuevoParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico));									
			
			if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			this.jInternalFrameDetalleFormParametroGenerico.jMenuItemModificarParametroGenerico.setVisible((this.isVisibilidadCeldaModificarParametroGenerico && this.isPermisoActualizarParametroGenerico));	
			this.jInternalFrameDetalleFormParametroGenerico.jMenuItemActualizarParametroGenerico.setVisible((this.isVisibilidadCeldaActualizarParametroGenerico && this.isPermisoActualizarParametroGenerico));	
			this.jInternalFrameDetalleFormParametroGenerico.jMenuItemEliminarParametroGenerico.setVisible((this.isVisibilidadCeldaEliminarParametroGenerico && this.isPermisoEliminarParametroGenerico));
			this.jInternalFrameDetalleFormParametroGenerico.jMenuItemCancelarParametroGenerico.setVisible(this.isVisibilidadCeldaCancelarParametroGenerico);				
			}
			
			this.jMenuItemGuardarCambiosParametroGenerico.setVisible((this.isVisibilidadCeldaGuardarParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico));						
			this.jMenuItemGuardarCambiosTablaParametroGenerico.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroGenerico=this.jButtonNuevoParametroGenerico.isVisible();
			this.isVisibilidadCeldaDuplicarParametroGenerico=this.jButtonDuplicarParametroGenerico.isVisible();
			this.isVisibilidadCeldaCopiarParametroGenerico=this.jButtonCopiarParametroGenerico.isVisible();
			this.isVisibilidadCeldaVerFormParametroGenerico=this.jButtonVerFormParametroGenerico.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroGenerico=this.jButtonAbrirOrderByParametroGenerico.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=this.jButtonNuevoRelacionesParametroGenerico.isVisible();
			this.isVisibilidadCeldaModificarParametroGenerico=this.jButtonModificarParametroGenerico.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			this.isVisibilidadCeldaActualizarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jButtonActualizarParametroGenerico.isVisible();
			this.isVisibilidadCeldaEliminarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jButtonEliminarParametroGenerico.isVisible();
			this.isVisibilidadCeldaCancelarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jButtonCancelarParametroGenerico.isVisible();
			this.isVisibilidadCeldaGuardarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jButtonGuardarCambiosParametroGenerico.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroGenerico=this.jButtonGuardarCambiosTablaParametroGenerico.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroGenerico=this.jButtonNuevoToolBarParametroGenerico.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=this.jButtonNuevoRelacionesToolBarParametroGenerico.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			this.isVisibilidadCeldaModificarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jButtonModificarToolBarParametroGenerico.isVisible();
			this.isVisibilidadCeldaActualizarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jButtonActualizarToolBarParametroGenerico.isVisible();
			this.isVisibilidadCeldaEliminarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jButtonEliminarToolBarParametroGenerico.isVisible();
			this.isVisibilidadCeldaCancelarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jButtonCancelarToolBarParametroGenerico.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroGenerico=this.jButtonGuardarCambiosToolBarParametroGenerico.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroGenerico=this.jButtonGuardarCambiosTablaToolBarParametroGenerico.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroGenerico=this.jMenuItemNuevoParametroGenerico.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=this.jMenuItemNuevoRelacionesParametroGenerico.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			this.isVisibilidadCeldaModificarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jMenuItemModificarParametroGenerico.isVisible();
			this.isVisibilidadCeldaActualizarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jMenuItemActualizarParametroGenerico.isVisible();
			this.isVisibilidadCeldaEliminarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jMenuItemEliminarParametroGenerico.isVisible();
			this.isVisibilidadCeldaCancelarParametroGenerico=this.jInternalFrameDetalleFormParametroGenerico.jMenuItemCancelarParametroGenerico.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroGenerico=this.jMenuItemGuardarCambiosParametroGenerico.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroGenerico=this.jMenuItemGuardarCambiosTablaParametroGenerico.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroGenerico(Boolean esInicializar) {
		if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametrogenericoSessionBean.getConGuardarRelaciones()) {
				//if(this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroGenerico();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroGenerico(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroGenerico() {
		this.jButtonNuevoParametroGenerico.setVisible(this.isPermisoNuevoParametroGenerico);			
		this.jButtonDuplicarParametroGenerico.setVisible(this.isPermisoDuplicarParametroGenerico);			
		this.jButtonCopiarParametroGenerico.setVisible(this.isPermisoCopiarParametroGenerico);			
		this.jButtonVerFormParametroGenerico.setVisible(this.isPermisoVerFormParametroGenerico);			
		
		this.jButtonAbrirOrderByParametroGenerico.setVisible(this.isPermisoOrdenParametroGenerico);					
		
		this.jButtonNuevoRelacionesParametroGenerico.setVisible(this.isPermisoNuevoParametroGenerico);			
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jButtonModificarParametroGenerico.setVisible(this.isPermisoActualizarParametroGenerico);	
			this.jInternalFrameDetalleFormParametroGenerico.jButtonActualizarParametroGenerico.setVisible(this.isPermisoActualizarParametroGenerico);	
			this.jInternalFrameDetalleFormParametroGenerico.jButtonEliminarParametroGenerico.setVisible(this.isPermisoEliminarParametroGenerico);
			this.jInternalFrameDetalleFormParametroGenerico.jButtonCancelarParametroGenerico.setVisible(this.isVisibilidadCeldaCancelarParametroGenerico);						
			this.jInternalFrameDetalleFormParametroGenerico.jButtonGuardarCambiosParametroGenerico.setVisible(this.isPermisoGuardarCambiosParametroGenerico);							
		}
		
		this.jButtonGuardarCambiosTablaParametroGenerico.setVisible(this.isPermisoActualizarParametroGenerico);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroGenerico() {
		this.jInternalFrameDetalleFormParametroGenerico.jButtonModificarParametroGenerico.setVisible(this.isPermisoActualizarParametroGenerico);	
		this.jInternalFrameDetalleFormParametroGenerico.jButtonActualizarParametroGenerico.setVisible(this.isPermisoActualizarParametroGenerico);	
		this.jInternalFrameDetalleFormParametroGenerico.jButtonEliminarParametroGenerico.setVisible(this.isPermisoEliminarParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jButtonCancelarParametroGenerico.setVisible(this.isVisibilidadCeldaCancelarParametroGenerico);							
		this.jInternalFrameDetalleFormParametroGenerico.jButtonGuardarCambiosParametroGenerico.setVisible((this.isVisibilidadCeldaGuardarParametroGenerico && this.isPermisoGuardarCambiosParametroGenerico));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroGenerico() {
		if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroGenerico();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroGenerico() {
	}
	
	public void jTableDatosParametroGenericoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroGenerico(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroGenericoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogenerico==null) {
						this.parametrogenerico = new ParametroGenerico();
					}

					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				}

				if(this.parametrogenerico.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametrogenerico.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGenerico(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroGenericoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroGenerico(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroGenerico.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroGenerico.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametrogenericoLogic.getConnexion());

				if(this.parametrogenerico.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametrogenerico.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroGenerico=(TitledBorder)this.jScrollPanelDatosParametroGenerico.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroGenerico.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroGenericoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogenerico==null) {
						this.parametrogenerico = new ParametroGenerico();
					}

					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				}

				if(this.parametrogenerico.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametrogenerico.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGenerico(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalParametroGenericoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebParametroGenerico(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroGenerico.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroGenerico.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.parametrogenericoLogic.getConnexion());

				if(this.parametrogenerico.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.parametrogenerico.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroGenerico=(TitledBorder)this.jScrollPanelDatosParametroGenerico.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderParametroGenerico.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalParametroGenericoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogenerico==null) {
						this.parametrogenerico = new ParametroGenerico();
					}

					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				}

				if(this.parametrogenerico.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.parametrogenerico.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGenerico(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloParametroGenericoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebParametroGenerico(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroGenerico.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroGenerico.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.parametrogenericoLogic.getConnexion());

				if(this.parametrogenerico.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.parametrogenerico.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroGenerico=(TitledBorder)this.jScrollPanelDatosParametroGenerico.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderParametroGenerico.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloParametroGenericoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogenerico==null) {
						this.parametrogenerico = new ParametroGenerico();
					}

					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				}

				if(this.parametrogenerico.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.parametrogenerico.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGenerico(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialParametroGenericoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogenerico==null) {
						this.parametrogenerico = new ParametroGenerico();
					}

					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				}

				if(this.parametrogenerico.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.parametrogenerico.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGenerico(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoParametroGenericoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogenerico==null) {
						this.parametrogenerico = new ParametroGenerico();
					}

					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				}

				if(this.parametrogenerico.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo = "+this.parametrogenerico.getcodigo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGenerico(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionParametroGenericoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebParametroGenerico(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroGenerico.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroGenerico.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametrogenericoLogic.getConnexion());

				if(this.parametrogenerico.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.parametrogenerico.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroGenerico=(TitledBorder)this.jScrollPanelDatosParametroGenerico.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderParametroGenerico.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionParametroGenericoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogenerico==null) {
						this.parametrogenerico = new ParametroGenerico();
					}

					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				}

				if(this.parametrogenerico.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.parametrogenerico.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGenerico(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion_reciboParametroGenericoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccionrecibo=true;

			idTienePermisotransaccionrecibo=this.tienePermisosUsuarioEnPaginaWebParametroGenerico(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccionrecibo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroGenerico.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroGenerico.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);

				this.transaccionreciboBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionreciboBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionreciboBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametrogenericoLogic.getConnexion());

				if(this.parametrogenerico.getid_transaccion_recibo()!=null) {
					this.transaccionreciboBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionreciboBeanSwingJInternalFrame.setIdActual(this.parametrogenerico.getid_transaccion_recibo());
					this.transaccionreciboBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionreciboBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionreciboBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionreciboBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroGenerico=(TitledBorder)this.jScrollPanelDatosParametroGenerico.getBorder();
				TitledBorder titledBordertransaccionrecibo=(TitledBorder)this.transaccionreciboBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccionrecibo.setTitle(titledBorderParametroGenerico.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion_reciboParametroGenericoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogenerico==null) {
						this.parametrogenerico = new ParametroGenerico();
					}

					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				}

				if(this.parametrogenerico.getid_transaccion_recibo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion_recibo = "+this.parametrogenerico.getid_transaccion_recibo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGenerico(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaParametroGenericoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebParametroGenerico(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroGenerico.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroGenerico.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.parametrogenericoLogic.getConnexion());

				if(this.parametrogenerico.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.parametrogenerico.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroGenerico=(TitledBorder)this.jScrollPanelDatosParametroGenerico.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderParametroGenerico.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaParametroGenericoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogenerico==null) {
						this.parametrogenerico = new ParametroGenerico();
					}

					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				}

				if(this.parametrogenerico.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.parametrogenerico.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGenerico(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_servicioParametroGenericoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoservicio=true;

			idTienePermisoservicio=this.tienePermisosUsuarioEnPaginaWebParametroGenerico(ServicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoservicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroGenerico.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroGenerico.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);

				this.servicioBeanSwingJInternalFrame=new ServicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.servicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.servicioBeanSwingJInternalFrame.getServicioLogic().setConnexion(this.parametrogenericoLogic.getConnexion());

				if(this.parametrogenerico.getid_servicio()!=null) {
					this.servicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.servicioBeanSwingJInternalFrame.setIdActual(this.parametrogenerico.getid_servicio());
					this.servicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.servicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.servicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaServicio();
				}

				JInternalFrameBase jinternalFrame =this.servicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroGenerico=(TitledBorder)this.jScrollPanelDatosParametroGenerico.getBorder();
				TitledBorder titledBorderservicio=(TitledBorder)this.servicioBeanSwingJInternalFrame.jScrollPanelDatosServicio.getBorder();

				titledBorderservicio.setTitle(titledBorderParametroGenerico.getTitle() + " -> Servicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_servicioParametroGenericoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogenerico==null) {
						this.parametrogenerico = new ParametroGenerico();
					}

					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				}

				if(this.parametrogenerico.getid_servicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_servicio = "+this.parametrogenerico.getid_servicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGenerico(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formatoParametroGenericoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato=true;

			idTienePermisoformato=this.tienePermisosUsuarioEnPaginaWebParametroGenerico(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroGenerico.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroGenerico.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);

				this.formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatoBeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.parametrogenericoLogic.getConnexion());

				if(this.parametrogenerico.getid_formato()!=null) {
					this.formatoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatoBeanSwingJInternalFrame.setIdActual(this.parametrogenerico.getid_formato());
					this.formatoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formatoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroGenerico=(TitledBorder)this.jScrollPanelDatosParametroGenerico.getBorder();
				TitledBorder titledBorderformato=(TitledBorder)this.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato.setTitle(titledBorderParametroGenerico.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formatoParametroGenericoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogenerico==null) {
						this.parametrogenerico = new ParametroGenerico();
					}

					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				}

				if(this.parametrogenerico.getid_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato = "+this.parametrogenerico.getid_formato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGenerico(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formato_reciboParametroGenericoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformatorecibo=true;

			idTienePermisoformatorecibo=this.tienePermisosUsuarioEnPaginaWebParametroGenerico(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformatorecibo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroGenerico.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroGenerico.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);

				this.formatoreciboBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatoreciboBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatoreciboBeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.parametrogenericoLogic.getConnexion());

				if(this.parametrogenerico.getid_formato_recibo()!=null) {
					this.formatoreciboBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatoreciboBeanSwingJInternalFrame.setIdActual(this.parametrogenerico.getid_formato_recibo());
					this.formatoreciboBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatoreciboBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatoreciboBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formatoreciboBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroGenerico=(TitledBorder)this.jScrollPanelDatosParametroGenerico.getBorder();
				TitledBorder titledBorderformatorecibo=(TitledBorder)this.formatoreciboBeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformatorecibo.setTitle(titledBorderParametroGenerico.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formato_reciboParametroGenericoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.getparametrogenerico(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogenerico==null) {
						this.parametrogenerico = new ParametroGenerico();
					}

					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);
				}

				if(this.parametrogenerico.getid_formato_recibo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato_recibo = "+this.parametrogenerico.getid_formato_recibo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGenerico(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaParametroGenericoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroGenerico(false,false);

			this.getParametroGenericosFK_IdBodega();

			this.inicializarActualizarBindingParametroGenerico(false);

			//if(ParametroGenericoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroGenerico(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaParametroGenericoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroGenerico(false,false);

			this.getParametroGenericosFK_IdEmpresa();

			this.inicializarActualizarBindingParametroGenerico(false);

			//if(ParametroGenericoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroGenerico(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoParametroGenericoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroGenerico(false,false);

			this.getParametroGenericosFK_IdFormato();

			this.inicializarActualizarBindingParametroGenerico(false);

			//if(ParametroGenericoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroGenerico(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoReciboParametroGenericoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroGenerico(false,false);

			this.getParametroGenericosFK_IdFormatoRecibo();

			this.inicializarActualizarBindingParametroGenerico(false);

			//if(ParametroGenericoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroGenerico(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloParametroGenericoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroGenerico(false,false);

			this.getParametroGenericosFK_IdModulo();

			this.inicializarActualizarBindingParametroGenerico(false);

			//if(ParametroGenericoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroGenerico(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdServicioParametroGenericoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroGenerico(false,false);

			this.getParametroGenericosFK_IdServicio();

			this.inicializarActualizarBindingParametroGenerico(false);

			//if(ParametroGenericoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroGenerico(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalParametroGenericoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroGenerico(false,false);

			this.getParametroGenericosFK_IdSucursal();

			this.inicializarActualizarBindingParametroGenerico(false);

			//if(ParametroGenericoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroGenerico(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionParametroGenericoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroGenerico(false,false);

			this.getParametroGenericosFK_IdTransaccion();

			this.inicializarActualizarBindingParametroGenerico(false);

			//if(ParametroGenericoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroGenerico(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionReciboParametroGenericoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroGenerico(false,false);

			this.getParametroGenericosFK_IdTransaccionRecibo();

			this.inicializarActualizarBindingParametroGenerico(false);

			//if(ParametroGenericoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroGenerico(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogenericoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroGenerico() {
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
			this.jInternalFrameDetalleFormParametroGenerico.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroGenerico.dispose();
			this.jInternalFrameDetalleFormParametroGenerico=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroGenerico!=null) {
			this.jInternalFrameReporteDinamicoParametroGenerico.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroGenerico.dispose();
			this.jInternalFrameReporteDinamicoParametroGenerico=null;
		}
		
		if(this.jInternalFrameImportacionParametroGenerico!=null) {
			this.jInternalFrameImportacionParametroGenerico.setVisible(false);	    			
			this.jInternalFrameImportacionParametroGenerico.dispose();
			this.jInternalFrameImportacionParametroGenerico=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroGenerico();
			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroGenerico")) {
				jButtonNuevoParametroGenericoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroGenerico")) {
				jButtonDuplicarParametroGenericoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroGenerico")) {
				jButtonCopiarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroGenerico")) {
				jButtonVerFormParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroGenerico")) {
				jButtonNuevoParametroGenericoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroGenerico")) {
				jButtonDuplicarParametroGenericoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroGenerico")) {
				jButtonNuevoParametroGenericoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroGenerico")) {
				jButtonDuplicarParametroGenericoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroGenerico")) {
				jButtonNuevoParametroGenericoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroGenerico")) {
				jButtonNuevoParametroGenericoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroGenerico")) {
				jButtonNuevoParametroGenericoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroGenerico")) {
				jButtonModificarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroGenerico")) {
				jButtonModificarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroGenerico")) {
				jButtonModificarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroGenerico")) {
				jButtonActualizarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroGenerico")) {
				jButtonActualizarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroGenerico")) {
				jButtonActualizarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroGenerico")) {
				jButtonEliminarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroGenerico")) {
				jButtonEliminarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroGenerico")) {
				jButtonEliminarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroGenerico")) {
				jButtonCancelarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroGenerico")) {
				jButtonCancelarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroGenerico")) {
				jButtonCancelarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroGenerico")) {
				jButtonCerrarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroGenerico")) {
				jButtonCerrarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroGenerico")) {
				jButtonCerrarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroGenerico")) {
				jButtonMostrarOcultarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroGenerico")) {
				jButtonCancelarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroGenerico")) {
				jButtonGuardarCambiosParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroGenerico")) {
				jButtonGuardarCambiosParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroGenerico")) {
				jButtonCopiarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroGenerico")) {
				jButtonVerFormParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroGenerico")) {
				jButtonGuardarCambiosParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroGenerico")) {
				jButtonCopiarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroGenerico")) {
				jButtonVerFormParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroGenerico")) {
				jButtonGuardarCambiosParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroGenerico")) {
				jButtonGuardarCambiosParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroGenerico")) {
				jButtonGuardarCambiosParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroGenerico")) {
				jButtonRecargarInformacionParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroGenerico")) {
				jButtonRecargarInformacionParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroGenerico")) {
				jButtonRecargarInformacionParametroGenericoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroGenerico")) {
				jButtonAnterioresParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroGenerico")) {
				jButtonAnterioresParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroGenerico")) {
				jButtonAnterioresParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroGenerico")) {
				jButtonSiguientesParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroGenerico")) {
				jButtonSiguientesParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroGenerico")) {
				jButtonSiguientesParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroGenerico") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroGenerico")) {
				jButtonAbrirOrderByParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroGenerico") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroGenerico")) {
				jButtonMostrarOcultarParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroGenerico")) {
				jButtonNuevoGuardarCambiosParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroGenerico")) {
				jButtonNuevoGuardarCambiosParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroGenerico")) {
				jButtonNuevoGuardarCambiosParametroGenericoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroGenerico")) {
				jButtonCerrarReporteDinamicoParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroGenerico")) {
				jButtonGenerarReporteDinamicoParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroGenerico")) {
				
				jButtonGenerarExcelReporteDinamicoParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroGenerico")) {
				jButtonCerrarImportacionParametroGenericoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroGenerico")) {
				
				jButtonGenerarImportacionParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroGenerico")) {
				
				jButtonAbrirImportacionParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroGenerico")) {
				jComboBoxTiposAccionesParametroGenericoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroGenerico")) {
				jComboBoxTiposRelacionesParametroGenericoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroGenerico")) {
				jComboBoxTiposAccionesParametroGenericoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroGenerico")) {
				
				jComboBoxTiposSeleccionarParametroGenericoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroGenerico")) {
				jTextFieldValorCampoGeneralParametroGenericoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroGenerico")) {
				jButtonAbrirOrderByParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroGenerico")) {
				jButtonAbrirOrderByParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroGenerico")) {
				jButtonCerrarOrderByParametroGenericoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroGenericoBusqueda")) {
				this.jButtonidParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroGenericoUpdate")) {
				this.jButtonid_empresaParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroGenericoBusqueda")) {
				this.jButtonid_empresaParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroGenericoUpdate")) {
				this.jButtonid_sucursalParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroGenericoBusqueda")) {
				this.jButtonid_sucursalParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloParametroGenericoUpdate")) {
				this.jButtonid_moduloParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloParametroGenericoBusqueda")) {
				this.jButtonid_moduloParametroGenericoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialParametroGenericoBusqueda")) {
				this.jButtonsecuencialParametroGenericoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoParametroGenericoBusqueda")) {
				this.jButtoncodigoParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionParametroGenericoUpdate")) {
				this.jButtonid_transaccionParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionParametroGenericoBusqueda")) {
				this.jButtonid_transaccionParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_reciboParametroGenericoUpdate")) {
				this.jButtonid_transaccion_reciboParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_reciboParametroGenericoBusqueda")) {
				this.jButtonid_transaccion_reciboParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaParametroGenericoUpdate")) {
				this.jButtonid_bodegaParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaParametroGenericoBusqueda")) {
				this.jButtonid_bodegaParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_servicioParametroGenericoUpdate")) {
				this.jButtonid_servicioParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_servicioParametroGenericoBusqueda")) {
				this.jButtonid_servicioParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoParametroGenericoUpdate")) {
				this.jButtonid_formatoParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoParametroGenericoBusqueda")) {
				this.jButtonid_formatoParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_reciboParametroGenericoUpdate")) {
				this.jButtonid_formato_reciboParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_reciboParametroGenericoBusqueda")) {
				this.jButtonid_formato_reciboParametroGenericoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdBodegaParametroGenerico")) {
				this.jButtonFK_IdBodegaParametroGenericoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdModuloParametroGenerico")) {
				this.jButtonFK_IdModuloParametroGenericoActionPerformed(evt);
			}
			
			;
			
			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroGenerico();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGenericoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				


				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGenerico.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGenerico.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroGenerico parametrogenericoLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametrogenericoLocal=this.parametrogenerico;
			} else {
				parametrogenericoLocal=this.parametrogenericoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
							
				
				


				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGenerico.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGenerico.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGenericoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
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
			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			
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
			
			


			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGenericoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
								
						
				


				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGenerico.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGenerico.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
								
				
				


				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGenerico.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGenerico.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGenericoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGenericoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGenericoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
							
				
				


				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGenerico.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGenerico.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGenericoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
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
			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			
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
			
			


			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGenericoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
								
				
				


				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGenerico.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGenerico.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGenericoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGenericoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGenericoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroGenerico")) {
					jCheckBoxSeleccionarTodosParametroGenericoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroGenerico")) {
					jCheckBoxSeleccionadosParametroGenericoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroGenerico")) {
					
				}
				
				


				
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGenerico.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGenerico.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
												
				
				


				
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGenerico.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGenerico.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGenericoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGenericoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
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
			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
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
			
			


			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGenericoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGenerico.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGenerico.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogenerico);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogenerico);
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
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
				
				


				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGenerico.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGenerico.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGenericoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogenericoAnterior =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroGenerico")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroGenericoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroGenerico.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametrogenerico =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametrogenerico =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametrogenerico);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroGenerico")) {
				
				}
				
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroGenerico")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroGenerico.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroGenerico")) {
			
			}
			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroGenerico();
			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			
			if(sTipo.equals("NuevoParametroGenerico")) {
				jButtonNuevoParametroGenericoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroGenerico")) {
				jButtonDuplicarParametroGenericoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroGenerico")) {
				jButtonCopiarParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroGenerico")) {
				jButtonVerFormParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroGenerico")) {
				jButtonNuevoParametroGenericoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroGenerico")) {
				jButtonModificarParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroGenerico")) {
				jButtonActualizarParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroGenerico")) {
				jButtonEliminarParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroGenerico")) {
				jButtonGuardarCambiosParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroGenerico")) {
				jButtonCancelarParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroGenerico")) {
				jButtonCerrarParametroGenericoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroGenerico")) {
				jButtonGuardarCambiosParametroGenericoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroGenerico")) {
				jButtonNuevoGuardarCambiosParametroGenericoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroGenerico")) {
				jButtonAbrirOrderByParametroGenericoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroGenerico")) {
				jButtonRecargarInformacionParametroGenericoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroGenerico")) {
				jButtonAnterioresParametroGenericoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroGenerico")) {
				jButtonSiguientesParametroGenericoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroGenericoBusqueda")) {
				this.jButtonidParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroGenericoUpdate")) {
				this.jButtonid_empresaParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroGenericoBusqueda")) {
				this.jButtonid_empresaParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroGenericoUpdate")) {
				this.jButtonid_sucursalParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroGenericoBusqueda")) {
				this.jButtonid_sucursalParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloParametroGenericoUpdate")) {
				this.jButtonid_moduloParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloParametroGenericoBusqueda")) {
				this.jButtonid_moduloParametroGenericoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialParametroGenericoBusqueda")) {
				this.jButtonsecuencialParametroGenericoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoParametroGenericoBusqueda")) {
				this.jButtoncodigoParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionParametroGenericoUpdate")) {
				this.jButtonid_transaccionParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionParametroGenericoBusqueda")) {
				this.jButtonid_transaccionParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_reciboParametroGenericoUpdate")) {
				this.jButtonid_transaccion_reciboParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_reciboParametroGenericoBusqueda")) {
				this.jButtonid_transaccion_reciboParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaParametroGenericoUpdate")) {
				this.jButtonid_bodegaParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaParametroGenericoBusqueda")) {
				this.jButtonid_bodegaParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_servicioParametroGenericoUpdate")) {
				this.jButtonid_servicioParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_servicioParametroGenericoBusqueda")) {
				this.jButtonid_servicioParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoParametroGenericoUpdate")) {
				this.jButtonid_formatoParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoParametroGenericoBusqueda")) {
				this.jButtonid_formatoParametroGenericoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_reciboParametroGenericoUpdate")) {
				this.jButtonid_formato_reciboParametroGenericoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_reciboParametroGenericoBusqueda")) {
				this.jButtonid_formato_reciboParametroGenericoBusquedaActionPerformed(evt);
			}
			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroGenerico();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroGenerico")) {
				closingInternalFrameParametroGenerico();
				
			} else if(sTipo.equals("jButtonCancelarParametroGenerico")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroGenerico = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroGenericoBeanSwingJInternalFrame jInternalFrameParent=(ParametroGenericoBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroGenerico.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroGenericoActionPerformed(null);
			}
			
			ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrogenerico,new Object(),this.parametrogenericoParameterGeneral,this.parametrogenericoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroGenerico(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroGenerico(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroGenerico(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametrogenerico)) {
			if(!esControlTabla) {
				if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);			
				}
				
				if(this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroGenerico(this.parametrogenerico,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrogenericoReturnGeneral=parametrogenericoLogic.procesarEventosParametroGenericosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrogenericoLogic.getParametroGenericos(),this.parametrogenerico,this.parametrogenericoParameterGeneral,this.isEsNuevoParametroGenerico,classes);//this.parametrogenericoLogic.getParametroGenerico()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroGenerico(this.parametrogenericoReturnGeneral,this.parametrogenericoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroGenerico(classes,this.parametrogenericoReturnGeneral,this.parametrogenericoBean,false);
					}
						
					if(this.parametrogenericoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroGenerico(this.parametrogenericoReturnGeneral.getParametroGenerico());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroGenerico(this.parametrogenericoReturnGeneral.getParametroGenerico());	
					}
						
					if(this.parametrogenericoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroGenerico(this.parametrogenericoReturnGeneral.getParametroGenerico(),classes);//this.parametrogenericoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroGenerico(this.parametrogenerico,classes);//this.parametrogenericoBean);									
				}
			
				if(ParametroGenericoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroGenerico(this.parametrogenerico,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGenerico(this.parametrogenerico);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametrogenericoAnterior!=null) {
						this.parametrogenerico=this.parametrogenericoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrogenericoReturnGeneral=parametrogenericoLogic.procesarEventosParametroGenericosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrogenericoLogic.getParametroGenericos(),this.parametrogenerico,this.parametrogenericoParameterGeneral,this.isEsNuevoParametroGenerico,classes);//this.parametrogenericoLogic.getParametroGenerico()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrogenericoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrogenericoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametrogenericoReturnGeneral.getParametroGenerico(),parametrogenericoLogic.getParametroGenericos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametrogenericoReturnGeneral.getParametroGenerico(),this.parametrogenericos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroGenerico.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroGenerico.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroGenerico();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroGenerico() throws Exception {
		
		ParametroGenericoModel parametrogenericoModel=(ParametroGenericoModel)this.jTableDatosParametroGenerico.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrogenericoModel.parametrogenericos=this.parametrogenericoLogic.getParametroGenericos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametrogenericoModel.parametrogenericos=this.parametrogenericos;
		}
		
		
		((ParametroGenericoModel) this.jTableDatosParametroGenerico.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroGenerico() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametrogenericoAnterior(),this.parametrogenericoLogic.getParametroGenericos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametrogenericoAnterior(),this.parametrogenericos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroGenerico();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroGenerico(ParametroGenerico parametrogenerico,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
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
										
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrogenerico,new Object(),generalEntityParameterGeneral,this.parametrogenericoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametrogenericoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroGenericoConstantesFunciones.getClassesRelationshipsOfParametroGenerico(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroGenericoConstantesFunciones.getClassesRelationshipsFromStringsOfParametroGenerico(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroGenerico(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroGenericoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrogenerico,new Object(),generalEntityParameterGeneral,this.parametrogenericoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroGenerico(ParametroGenericoBean parametrogenericoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroGenerico(ArrayList<Classe> classes,ParametroGenericoReturnGeneral parametrogenericoReturnGeneral,ParametroGenericoBean parametrogenericoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroGenerico(ParametroGenerico parametrogenerico,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametrogenerico)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroGenerico = new ParametroGenericoDetalleFormJInternalFrame(jDesktopPane,this.parametrogenericoSessionBean.getConGuardarRelaciones(),this.parametrogenericoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.setVisible(false);
		this.jInternalFrameDetalleFormParametroGenerico.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroGenerico.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroGenerico.parametrogenericoLogic=this.parametrogenericoLogic;
		
		this.cargarCombosFrameForeignKeyParametroGenerico("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroGenerico();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroGenerico();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroGenerico("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroGenerico();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroGenerico.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroGenerico"));
		
		this.jInternalFrameDetalleFormParametroGenerico.jButtonModificarParametroGenerico.addActionListener(new ButtonActionListener(this,"ModificarParametroGenerico"));

		
		this.jInternalFrameDetalleFormParametroGenerico.jButtonModificarToolBarParametroGenerico.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroGenerico"));
					
		this.jInternalFrameDetalleFormParametroGenerico.jMenuItemModificarParametroGenerico.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroGenerico"));		
		
		
		
		this.jInternalFrameDetalleFormParametroGenerico.jButtonActualizarParametroGenerico.addActionListener (new ButtonActionListener(this,"ActualizarParametroGenerico"));
		
		
		this.jInternalFrameDetalleFormParametroGenerico.jButtonActualizarToolBarParametroGenerico.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroGenerico"));
						
		this.jInternalFrameDetalleFormParametroGenerico.jMenuItemActualizarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroGenerico"));		
		
		
		
		this.jInternalFrameDetalleFormParametroGenerico.jButtonEliminarParametroGenerico.addActionListener (new ButtonActionListener(this,"EliminarParametroGenerico"));
		
		
		this.jInternalFrameDetalleFormParametroGenerico.jButtonEliminarToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroGenerico"));
								
		this.jInternalFrameDetalleFormParametroGenerico.jMenuItemEliminarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroGenerico"));		
		
		
		
		this.jInternalFrameDetalleFormParametroGenerico.jButtonCancelarParametroGenerico.addActionListener (new ButtonActionListener(this,"CancelarParametroGenerico"));
		
		
		this.jInternalFrameDetalleFormParametroGenerico.jButtonCancelarToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroGenerico"));
					
		this.jInternalFrameDetalleFormParametroGenerico.jMenuItemCancelarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroGenerico"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroGenerico.jMenuItemDetalleCerrarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroGenerico"));		
		
		
		
		this.jInternalFrameDetalleFormParametroGenerico.jButtonGuardarCambiosToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroGenerico"));
		
		
		
		this.jInternalFrameDetalleFormParametroGenerico.jButtonGuardarCambiosToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroGenerico"));
		
		
		
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroGenerico"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonidParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_empresaParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_empresaParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_sucursalParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_sucursalParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_moduloParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_moduloParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloParametroGenericoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonsecuencialParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialParametroGenericoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtoncodigoParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"codigoParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_transaccionParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_transaccionParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_transaccion_reciboParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_reciboParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_transaccion_reciboParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_reciboParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_bodegaParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_bodegaParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_servicioParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_servicioParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_servicioParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_servicioParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_formatoParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_formatoParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_formato_reciboParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_formato_reciboParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_formato_reciboParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_reciboParametroGenericoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroGenerico.jTabbedPaneRelacionesParametroGenerico.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroGenerico"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroGenerico"));
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroGenerico"));
		}
		
		this.jTableDatosParametroGenerico.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroGenerico"));
		
		this.jTableDatosParametroGenerico.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroGenerico"));
		
		this.jButtonNuevoParametroGenerico.addActionListener(new ButtonActionListener(this,"NuevoParametroGenerico"));
		
		this.jButtonDuplicarParametroGenerico.addActionListener(new ButtonActionListener(this,"DuplicarParametroGenerico"));
		
		this.jButtonCopiarParametroGenerico.addActionListener(new ButtonActionListener(this,"CopiarParametroGenerico"));
		
		this.jButtonVerFormParametroGenerico.addActionListener(new ButtonActionListener(this,"VerFormParametroGenerico"));
		
		
		this.jButtonNuevoToolBarParametroGenerico.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroGenerico"));
			
		this.jButtonDuplicarToolBarParametroGenerico.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroGenerico"));
			
		this.jMenuItemNuevoParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroGenerico"));
			
		this.jMenuItemDuplicarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroGenerico"));		
		
		
		this.jButtonNuevoRelacionesParametroGenerico.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroGenerico"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroGenerico.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroGenerico"));
			
		this.jMenuItemNuevoRelacionesParametroGenerico.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroGenerico"));		
		
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jButtonModificarParametroGenerico.addActionListener(new ButtonActionListener(this,"ModificarParametroGenerico"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jButtonModificarToolBarParametroGenerico.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroGenerico"));
			
			this.jInternalFrameDetalleFormParametroGenerico.jMenuItemModificarParametroGenerico.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroGenerico"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroGenerico.jButtonActualizarParametroGenerico.addActionListener (new ButtonActionListener(this,"ActualizarParametroGenerico"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jButtonActualizarToolBarParametroGenerico.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroGenerico"));
				
			this.jInternalFrameDetalleFormParametroGenerico.jMenuItemActualizarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroGenerico"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jButtonEliminarParametroGenerico.addActionListener (new ButtonActionListener(this,"EliminarParametroGenerico"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jButtonEliminarToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroGenerico"));
						
			this.jInternalFrameDetalleFormParametroGenerico.jMenuItemEliminarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroGenerico"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jButtonCancelarParametroGenerico.addActionListener (new ButtonActionListener(this,"CancelarParametroGenerico"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jButtonCancelarToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroGenerico"));
			
			this.jInternalFrameDetalleFormParametroGenerico.jMenuItemCancelarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroGenerico"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroGenerico"));		
		
		
		this.jButtonCerrarParametroGenerico.addActionListener (new ButtonActionListener(this,"CerrarParametroGenerico"));
		
		
		this.jButtonCerrarToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroGenerico"));
			
		this.jMenuItemCerrarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroGenerico"));
			
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jMenuItemDetalleCerrarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroGenerico"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jButtonGuardarCambiosParametroGenerico.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroGenerico"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jButtonGuardarCambiosToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroGenerico"));
		}
		
		this.jButtonCopiarToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroGenerico"));
			
		this.jButtonVerFormToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroGenerico"));
		
		this.jMenuItemGuardarCambiosParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroGenerico"));
			
		this.jMenuItemCopiarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroGenerico"));		
		
		this.jMenuItemVerFormParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroGenerico"));		
		
		
		this.jButtonGuardarCambiosTablaParametroGenerico.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroGenerico"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroGenerico"));
			
		this.jMenuItemGuardarCambiosTablaParametroGenerico.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroGenerico"));		
		
		
		
		this.jButtonRecargarInformacionParametroGenerico.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroGenerico"));
					
		this.jButtonRecargarInformacionToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroGenerico"));
		
		this.jMenuItemRecargarInformacionParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroGenerico"));		
		
		
		
		this.jButtonAnterioresParametroGenerico.addActionListener (new ButtonActionListener(this,"AnterioresParametroGenerico"));
		
		
		this.jButtonAnterioresToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroGenerico"));
		
		this.jMenuItemAnterioresParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroGenerico"));		
		
		
		this.jButtonSiguientesParametroGenerico.addActionListener (new ButtonActionListener(this,"SiguientesParametroGenerico"));
		
		
		this.jButtonSiguientesToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroGenerico"));
			
		this.jMenuItemSiguientesParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroGenerico"));
			
		this.jMenuItemAbrirOrderByParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroGenerico"));
			
		this.jMenuItemMostrarOcultarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroGenerico"));
			
		this.jMenuItemDetalleAbrirOrderByParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroGenerico"));
			
		this.jMenuItemDetalleMostarOcultarParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroGenerico"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroGenerico.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroGenerico"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroGenerico"));
			
		this.jMenuItemNuevoGuardarCambiosParametroGenerico.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroGenerico"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroGenerico.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroGenerico"));

		this.jCheckBoxSeleccionadosParametroGenerico.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroGenerico"));
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroGenerico"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroGenerico.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroGenerico"));
			
		this.jComboBoxTiposAccionesParametroGenerico.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroGenerico"));
					
		this.jComboBoxTiposSeleccionarParametroGenerico.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroGenerico"));
			
		this.jTextFieldValorCampoGeneralParametroGenerico.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroGenerico"));		
		
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonidParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_empresaParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_empresaParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_sucursalParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_sucursalParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_moduloParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_moduloParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloParametroGenericoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonsecuencialParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialParametroGenericoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtoncodigoParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"codigoParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_transaccionParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_transaccionParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_transaccion_reciboParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_reciboParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_transaccion_reciboParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_reciboParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_bodegaParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_bodegaParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_servicioParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_servicioParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_servicioParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_servicioParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_formatoParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_formatoParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_formato_reciboParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_formato_reciboParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_formato_reciboParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_reciboParametroGenericoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaParametroGenerico.addActionListener(new ButtonActionListener(this,"FK_IdBodegaParametroGenerico"));

			this.jButtonFK_IdModuloParametroGenerico.addActionListener(new ButtonActionListener(this,"FK_IdModuloParametroGenerico"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroGenerico!=null) {
				this.jInternalFrameReporteDinamicoParametroGenerico.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroGenerico"));
				this.jInternalFrameReporteDinamicoParametroGenerico.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroGenerico"));
				this.jInternalFrameReporteDinamicoParametroGenerico.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroGenerico"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroGenerico.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroGenerico"));				
			//this.jButtonGenerarReporteDinamicoParametroGenerico.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroGenerico"));
			//this.jButtonGenerarExcelReporteDinamicoParametroGenerico.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroGenerico"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroGenerico!=null) {
				this.jInternalFrameImportacionParametroGenerico.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroGenerico"));
				this.jInternalFrameImportacionParametroGenerico.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroGenerico"));
				this.jInternalFrameImportacionParametroGenerico.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroGenerico"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroGenerico.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroGenerico"));
			
			this.jButtonAbrirOrderByToolBarParametroGenerico.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroGenerico"));			
			
			if(this.jInternalFrameOrderByParametroGenerico!=null) {
				this.jInternalFrameOrderByParametroGenerico.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroGenerico"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGenerico.jTabbedPaneRelacionesParametroGenerico.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroGenerico"));
		
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
            		closingInternalFrameParametroGenerico();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroGenerico.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroGenerico = (JInternalFrameBase)event.getSource();
	            	
	            ParametroGenericoBeanSwingJInternalFrame jInternalFrameParent=(ParametroGenericoBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroGenerico.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroGenericoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroGenerico.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroGenericoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroGenerico.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroGenerico.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGenericoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGenericoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGenericoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroGenerico";
		inputMap = this.jButtonNuevoParametroGenerico.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroGenerico.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroGenericoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGenericoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGenericoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGenericoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroGenerico";
		inputMap = this.jButtonNuevoRelacionesParametroGenerico.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroGenerico.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroGenericoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroGenerico";
		inputMap = this.jButtonModificarParametroGenerico.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroGenerico.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroGenericoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroGenerico";
		inputMap = this.jButtonActualizarParametroGenerico.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroGenerico.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroGenericoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroGenerico";
		inputMap = this.jButtonEliminarParametroGenerico.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroGenerico.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroGenericoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroGenerico";
		inputMap = this.jButtonCancelarParametroGenerico.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroGenerico.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroGenericoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroGenerico";
		inputMap = this.jButtonCerrarParametroGenerico.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroGenerico.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroGenericoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroGenerico.jButtonGuardarCambiosParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroGenerico";
		inputMap = this.jInternalFrameDetalleFormParametroGenerico.jButtonGuardarCambiosParametroGenerico.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroGenerico.jButtonGuardarCambiosParametroGenerico.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroGenericoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroGenerico.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroGenericoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroGenerico.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroGenericoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroGenerico.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroGenericoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroGenerico.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroGenericoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonidParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_empresaParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_empresaParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_sucursalParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_sucursalParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_moduloParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_moduloParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloParametroGenericoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonsecuencialParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialParametroGenericoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtoncodigoParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"codigoParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_transaccionParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_transaccionParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_transaccion_reciboParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_reciboParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_transaccion_reciboParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_reciboParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_bodegaParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_bodegaParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_servicioParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_servicioParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_servicioParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_servicioParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_formatoParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_formatoParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoParametroGenericoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_formato_reciboParametroGenericoUpdate.addActionListener(new ButtonActionListener(this,"id_formato_reciboParametroGenericoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGenerico.jButtonid_formato_reciboParametroGenericoBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_reciboParametroGenericoBusqueda"));
		
		
		this.jButtonFK_IdBodegaParametroGenerico.addActionListener(new ButtonActionListener(this,"FK_IdBodegaParametroGenerico"));

		this.jButtonFK_IdModuloParametroGenerico.addActionListener(new ButtonActionListener(this,"FK_IdModuloParametroGenerico"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroGenerico.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroGenericoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroGenericoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroGenerico.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroGenerico(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroGenerico parametrogenericoAux:this.parametrogenericoLogic.getParametroGenericos()) {
					parametrogenericoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroGenerico parametrogenericoAux:parametrogenericos) {
					parametrogenericoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroGenericoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroGenerico(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroGenerico parametrogenericoAux:this.parametrogenericoLogic.getParametroGenericos()) {
						parametrogenericoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroGenerico parametrogenericoAux:parametrogenericos) {
						parametrogenericoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroGenerico parametrogenericoAux:this.parametrogenericoLogic.getParametroGenericos()) {
					
						if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD)) {
							existe=true;
							parametrogenericoAux.setcodigo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroGenerico parametrogenericoAux:parametrogenericos) {
						
						if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD)) {
							existe=true;
							parametrogenericoAux.setcodigo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroGenerico(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroGenerico.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroGenerico.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroGenericoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroGenerico(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroGenerico.getSelectedRows();
			
			ParametroGenerico parametrogenericoLocal=new ParametroGenerico();
			
			//this.seleccionarTodosParametroGenerico(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogenericoLocal =(ParametroGenerico) this.parametrogenericoLogic.getParametroGenericos().toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametrogenericoLocal =(ParametroGenerico) this.parametrogenericos.toArray()[this.jTableDatosParametroGenerico.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametrogenericoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroGenerico parametrogenericoAux:this.parametrogenericoLogic.getParametroGenericos()) {
						parametrogenericoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroGenerico parametrogenericoAux:parametrogenericos) {
						parametrogenericoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroGenerico(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroGenerico.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroGenerico.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroGenerico,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroGenericoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroGenericoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroGenericoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroGenerico(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroGenerico.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroGenerico parametrogenericoAux:this.parametrogenericoLogic.getParametroGenericos()) {
				
						if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							parametrogenericoAux.setsecuencial(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroGenerico parametrogenericoAux:parametrogenericos) {
					
						if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							parametrogenericoAux.setsecuencial(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroGenerico(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroGenericoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroGenerico(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroGenerico=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroGenerico.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroGenerico) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroGenerico(conSplash);
				
					this.generarReporteParametroGenericosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroGenerico.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroGenericosSeleccionados();
				//this.jComboBoxTiposAccionesParametroGenerico.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroGenericosSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroGenerico.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroGenericosSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroGenerico.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroGenerico();
				
				this.exportarParametroGenericosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroGenerico.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroGenericos();
				//this.importarParametroGenericos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroGenerico.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroGenerico();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroGenericosSeleccionados();
				//this.jComboBoxTiposAccionesParametroGenerico.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Generico", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroGenerico();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroGenerico)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroGenerico(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Generico",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroGenerico.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroGenericoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroGenerico) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroGenerico(conSplash);
					
						//this.actualizarParametrosGeneralParametroGenerico();
						
						this.generarReporteProcesoAccionParametroGenericosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroGenerico.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroGenericoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro GenericoS SELECCIONADOS?", "MANTENIMIENTO DE Parametro Generico", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroGenerico();
				
						this.actualizarParametrosGeneralParametroGenerico();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametrogenericoReturnGeneral=parametrogenericoLogic.procesarAccionParametroGenericosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametrogenericoLogic.getParametroGenericos(),this.parametrogenericoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroGenericoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroGenerico.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroGenerico();
					
					ParametroGenericoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroGenericoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroGenerico.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroGenerico.jComboBoxTiposAccionesFormularioParametroGenerico.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroGenerico(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroGenericoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroGenerico();
			
			if(this.jInternalFrameDetalleFormParametroGenerico==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();		
			ParametroGenerico parametrogenerico=new ParametroGenerico();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroGenerico(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroGenerico.getSelectedItem();
			
			
			
			
			parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametrogenericosSeleccionados.size()==1) {
				for(ParametroGenerico parametrogenericoAux:parametrogenericosSeleccionados) {
					parametrogenerico=parametrogenericoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroGenerico();
			
      		//this.finishProcessParametroGenerico(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroGenericoReturnGeneral() throws Exception {
		if(this.parametrogenericoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametrogenericoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametrogenericoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametrogenericoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametrogenericoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametrogenericoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroGenerico(false);
		}
		
		if(this.parametrogenericoReturnGeneral.getConRetornoLista() || this.parametrogenericoReturnGeneral.getConRetornoObjeto()) {
			if(this.parametrogenericoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrogenericoLogic.setParametroGenericos(this.parametrogenericoReturnGeneral.getParametroGenericos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametrogenericoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrogenericoLogic.setParametroGenerico(this.parametrogenericoReturnGeneral.getParametroGenerico());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroGenerico(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroGenerico() throws Exception {
		
		
	}
	
	public ArrayList<ParametroGenerico> getParametroGenericosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroGenerico) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroGenerico parametrogenericoAux:parametrogenericoLogic.getParametroGenericos()) {
					if(parametrogenericoAux.getIsSelected()) {
						parametrogenericosSeleccionados.add(parametrogenericoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroGenerico parametrogenericoAux:this.parametrogenericos) {
					if(parametrogenericoAux.getIsSelected()) {
						parametrogenericosSeleccionados.add(parametrogenericoAux);				
					}
				}
			}
			
			if(parametrogenericosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametrogenericosSeleccionados.addAll(this.parametrogenericoLogic.getParametroGenericos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametrogenericosSeleccionados.addAll(this.parametrogenericos);				
					}
				}
			}
		} else {
			parametrogenericosSeleccionados.add(this.parametrogenerico);
		}
		
		return parametrogenericosSeleccionados;
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
	
	public void generarReporteParametroGenericosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroGenericosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroGenericosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroGenericosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroGenericosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Generico",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroGenericosSeleccionados() throws Exception {
		ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();		
		
		parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroGenericos("Todos",parametrogenericosSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroGenericosSeleccionados() throws Exception {
		ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();		
		
		parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroGenericos("Todos",parametrogenericosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroGenericosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();
		
		parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroGenericos("Todos",parametrogenericosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroGenericosSeleccionados() throws Exception {
		ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroGenerico();
		
		
		parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroGenerico();
		
		
		//this.generarReporteParametroGenericos("Todos",parametrogenericosSeleccionados ,parametrogenericoImplementable,parametrogenericoImplementableHome);
	}
	
	public void mostrarImportacionParametroGenericos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroGenerico();
		
		this.abrirFrameImportacionParametroGenerico();		
		
			
		//this.generarReporteParametroGenericos("Todos",parametrogenericosSeleccionados ,parametrogenericoImplementable,parametrogenericoImplementableHome);
	}
	
	public void importarParametroGenericos() throws Exception {		
	
	}
	
	public void exportarParametroGenericosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroGenericosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroGenericosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroGenericosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Generico",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroGenericosSeleccionados() throws Exception {
		ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();		
		
		parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogenerico."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroGenerico(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroGenerico parametrogenericoAux:parametrogenericosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroGenerico(parametrogenericoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametrogenericoAux.setsDetalleGeneralEntityReporte(parametrogenericoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Generico",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroGenerico(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_IDFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroGenerico(ParametroGenerico parametrogenerico,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametrogenerico.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogenerico.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogenerico.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogenerico.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogenerico.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogenerico.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogenerico.getcodigo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogenerico.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogenerico.gettransaccionrecibo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogenerico.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogenerico.getservicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogenerico.getformato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogenerico.getformatorecibo_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroGenericosSeleccionados() throws Exception {
		ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();		
		
		parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogenerico.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroGenericos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroGenerico(row);				
				iRow++;
			}				
			
			for(ParametroGenerico parametrogenericoAux:parametrogenericosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroGenerico(parametrogenericoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Generico",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroGenericosSeleccionados() throws Exception {
		ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();		
		
		parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogenerico.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametrogenericos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametrogenerico");
			//elementRoot.appendChild(element);
		
			for(ParametroGenerico parametrogenericoAux:parametrogenericosSeleccionados) {
				element = document.createElement("parametrogenerico");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroGenerico(parametrogenericoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Generico",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroGenerico(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroGenerico(ParametroGenerico parametrogenerico,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogenerico.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogenerico.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogenerico.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogenerico.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogenerico.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogenerico.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogenerico.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogenerico.gettransaccionrecibo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogenerico.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogenerico.getservicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogenerico.getformato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogenerico.getformatorecibo_descripcion());				
	}
	
	public void setFilaDatosExportarXmlParametroGenerico(ParametroGenerico parametrogenerico,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroGenericoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametrogenerico.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroGenericoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametrogenerico.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroGenericoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametrogenerico.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ParametroGenericoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(parametrogenerico.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementmodulo_descripcion = document.createElement(ParametroGenericoConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(parametrogenerico.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementsecuencial = document.createElement(ParametroGenericoConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(parametrogenerico.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementcodigo = document.createElement(ParametroGenericoConstantesFunciones.CONPRESUPUESTOCIUDAD);
		elementcodigo.appendChild(document.createTextNode(parametrogenerico.getcodigo().toString().trim()));
		element.appendChild(elementcodigo);

		Element elementtransaccion_descripcion = document.createElement(ParametroGenericoConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(parametrogenerico.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementtransaccionrecibo_descripcion = document.createElement(ParametroGenericoConstantesFunciones.IDTRANSACCIONRECIBO);
		elementtransaccionrecibo_descripcion.appendChild(document.createTextNode(parametrogenerico.gettransaccionrecibo_descripcion()));
		element.appendChild(elementtransaccionrecibo_descripcion);

		Element elementbodega_descripcion = document.createElement(ParametroGenericoConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(parametrogenerico.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementservicio_descripcion = document.createElement(ParametroGenericoConstantesFunciones.IDSERVICIO);
		elementservicio_descripcion.appendChild(document.createTextNode(parametrogenerico.getservicio_descripcion()));
		element.appendChild(elementservicio_descripcion);

		Element elementformato_descripcion = document.createElement(ParametroGenericoConstantesFunciones.IDFORMATO);
		elementformato_descripcion.appendChild(document.createTextNode(parametrogenerico.getformato_descripcion()));
		element.appendChild(elementformato_descripcion);

		Element elementformatorecibo_descripcion = document.createElement(ParametroGenericoConstantesFunciones.IDFORMATORECIBO);
		elementformatorecibo_descripcion.appendChild(document.createTextNode(parametrogenerico.getformatorecibo_descripcion()));
		element.appendChild(elementformatorecibo_descripcion);
	}
	
	public void generarReporteGroupGenericoParametroGenericosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroGenerico> parametrogenericosSeleccionados=new ArrayList<ParametroGenerico>();
		
		parametrogenericosSeleccionados=this.getParametroGenericosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroGenerico(parametrogenericosSeleccionados);
		
		this.generarReporteParametroGenericos("Todos",parametrogenericosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroGenerico(ArrayList<ParametroGenerico> parametrogenericosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroGenerico parametrogenericoAux:parametrogenericosSeleccionados) {
				parametrogenericoAux.setsDetalleGeneralEntityReporte(parametrogenericoAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametrogenericoAux.setsDescripcionGeneralEntityReporte1(parametrogenericoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					parametrogenericoAux.setsDescripcionGeneralEntityReporte1(parametrogenericoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					parametrogenericoAux.setsDescripcionGeneralEntityReporte1(parametrogenericoAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					parametrogenericoAux.setsDescripcionGeneralEntityReporte1(parametrogenericoAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_CONPRESUPUESTOCIUDAD)) {
					existe=true;
					parametrogenericoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrogenericoAux.getcodigo()));
				}
				 else if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					parametrogenericoAux.setsDescripcionGeneralEntityReporte1(parametrogenericoAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_IDTRANSACCIONRECIBO)) {
					existe=true;
					parametrogenericoAux.setsDescripcionGeneralEntityReporte1(parametrogenericoAux.gettransaccionrecibo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					parametrogenericoAux.setsDescripcionGeneralEntityReporte1(parametrogenericoAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_IDSERVICIO)) {
					existe=true;
					parametrogenericoAux.setsDescripcionGeneralEntityReporte1(parametrogenericoAux.getservicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_IDFORMATO)) {
					existe=true;
					parametrogenericoAux.setsDescripcionGeneralEntityReporte1(parametrogenericoAux.getformato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGenericoConstantesFunciones.LABEL_IDFORMATORECIBO)) {
					existe=true;
					parametrogenericoAux.setsDescripcionGeneralEntityReporte1(parametrogenericoAux.getformatorecibo_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGenericoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroGenerico(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroGenerico=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=true;
				this.isVisibilidadCeldaGuardarCambiosParametroGenerico=true;
			}
			
			this.isVisibilidadCeldaModificarParametroGenerico=false;
			this.isVisibilidadCeldaActualizarParametroGenerico=false;
			this.isVisibilidadCeldaEliminarParametroGenerico=false;
			this.isVisibilidadCeldaCancelarParametroGenerico=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGenerico=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroGenerico=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroGenerico=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGenerico=false;
			this.isVisibilidadCeldaModificarParametroGenerico=false;
			this.isVisibilidadCeldaActualizarParametroGenerico=true;
			this.isVisibilidadCeldaEliminarParametroGenerico=false;
			this.isVisibilidadCeldaCancelarParametroGenerico=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGenerico=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroGenerico=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroGenerico=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGenerico=false;
			this.isVisibilidadCeldaModificarParametroGenerico=false;
			this.isVisibilidadCeldaActualizarParametroGenerico=true;
			this.isVisibilidadCeldaEliminarParametroGenerico=true;
			this.isVisibilidadCeldaCancelarParametroGenerico=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGenerico=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroGenerico=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroGenerico=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGenerico=false;
			this.isVisibilidadCeldaModificarParametroGenerico=false;
			this.isVisibilidadCeldaActualizarParametroGenerico=true;
			this.isVisibilidadCeldaEliminarParametroGenerico=false;
			this.isVisibilidadCeldaCancelarParametroGenerico=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGenerico=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroGenerico=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroGenerico=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=true;
			this.isVisibilidadCeldaGuardarCambiosParametroGenerico=true;
			this.isVisibilidadCeldaModificarParametroGenerico=false;
			this.isVisibilidadCeldaActualizarParametroGenerico=false;
			this.isVisibilidadCeldaEliminarParametroGenerico=false;
			this.isVisibilidadCeldaCancelarParametroGenerico=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGenerico=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroGenerico=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroGenerico=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGenerico=false;
			this.isVisibilidadCeldaActualizarParametroGenerico=false;
			this.isVisibilidadCeldaEliminarParametroGenerico=false;
			this.isVisibilidadCeldaCancelarParametroGenerico=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGenerico=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroGenerico=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroGenerico=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGenerico=false;
			this.isVisibilidadCeldaModificarParametroGenerico=true;
			this.isVisibilidadCeldaActualizarParametroGenerico=false;
			this.isVisibilidadCeldaEliminarParametroGenerico=false;
			this.isVisibilidadCeldaCancelarParametroGenerico=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGenerico=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroGenerico=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroGenericoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroGenerico=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=true;
			this.isVisibilidadCeldaGuardarCambiosParametroGenerico=true;
		} else {
			this.actualizarEstadoPanelsParametroGenerico(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroGenerico=false;
			//this.isVisibilidadCeldaVerFormParametroGenerico=false;
			this.isVisibilidadCeldaDuplicarParametroGenerico=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametrogenericoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroGenerico=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGenerico=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametrogenericoSessionBean.getEsGuardarRelacionado()) {
			if(!parametrogenericoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=false;												
			}
			
			this.jButtonCerrarParametroGenerico.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroGenerico=false;
		}
		
		if(!this.permiteMantenimiento(this.parametrogenerico)) {
			this.isVisibilidadCeldaActualizarParametroGenerico=false;
			this.isVisibilidadCeldaEliminarParametroGenerico=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroGenerico() {
	}
	
	public void actualizarEstadoPanelsParametroGenerico(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroGenerico!=null) {
				this.jScrollPanelDatosEdicionParametroGenerico.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGenerico!=null) {
				this.jTabbedPaneBusquedasParametroGenerico.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroGenerico!=null) {
				this.jScrollPanelDatosParametroGenerico.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroGenerico!=null) {
				this.jPanelPaginacionParametroGenerico.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroGenerico!=null) {
				this.jPanelParametrosReportesParametroGenerico.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroGenerico!=null) {
				this.jScrollPanelDatosEdicionParametroGenerico.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGenerico!=null) {
				this.jTabbedPaneBusquedasParametroGenerico.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroGenerico!=null) {
				this.jScrollPanelDatosParametroGenerico.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroGenerico!=null) {
				this.jPanelPaginacionParametroGenerico.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroGenerico!=null) {
				this.jPanelParametrosReportesParametroGenerico.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroGenerico!=null) {
				this.jScrollPanelDatosEdicionParametroGenerico.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGenerico!=null) {
				this.jTabbedPaneBusquedasParametroGenerico.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroGenerico!=null) {
				this.jScrollPanelDatosParametroGenerico.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroGenerico!=null) {
				this.jPanelPaginacionParametroGenerico.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroGenerico!=null) {
				this.jPanelParametrosReportesParametroGenerico.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroGenerico!=null) {
				this.jScrollPanelDatosEdicionParametroGenerico.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGenerico!=null) {
				this.jTabbedPaneBusquedasParametroGenerico.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroGenerico!=null) {
				this.jScrollPanelDatosParametroGenerico.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroGenerico!=null) {
				this.jPanelPaginacionParametroGenerico.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroGenerico!=null) {
				this.jPanelParametrosReportesParametroGenerico.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroGenerico!=null) {
				this.jScrollPanelDatosEdicionParametroGenerico.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGenerico!=null) {
				this.jTabbedPaneBusquedasParametroGenerico.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroGenerico!=null) {
				this.jScrollPanelDatosParametroGenerico.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroGenerico!=null) {
				this.jPanelPaginacionParametroGenerico.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroGenerico!=null) {
				this.jPanelParametrosReportesParametroGenerico.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroGenerico!=null) {
				this.jScrollPanelDatosEdicionParametroGenerico.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGenerico!=null) {
				this.jTabbedPaneBusquedasParametroGenerico.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroGenerico!=null) {
				this.jScrollPanelDatosParametroGenerico.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroGenerico!=null) {
				this.jPanelPaginacionParametroGenerico.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroGenerico!=null) {
				this.jPanelParametrosReportesParametroGenerico.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroGenerico!=null) {
				this.jScrollPanelDatosEdicionParametroGenerico.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGenerico!=null) {
				this.jTabbedPaneBusquedasParametroGenerico.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroGenerico!=null) {
				this.jScrollPanelDatosParametroGenerico.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroGenerico!=null) {
				this.jPanelPaginacionParametroGenerico.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroGenerico!=null) {
				this.jPanelParametrosReportesParametroGenerico.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroGenerico!=null) {
					this.jTabbedPaneBusquedasParametroGenerico.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroGenerico!=null) {
				this.jPanelParametrosReportesParametroGenerico.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametrogenericoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGenerico!=null) {
				this.jTabbedPaneBusquedasParametroGenerico.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroGenerico!=null) {
				this.jPanelParametrosReportesParametroGenerico.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdBodegaParametroGenerico);}

			this.isVisibilidadFK_IdModulo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdModuloParametroGenerico);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdBodegaParametroGenerico);}

			this.isVisibilidadFK_IdModulo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdModuloParametroGenerico);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadFK_IdBodega=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdBodegaParametroGenerico);}

			this.isVisibilidadFK_IdModulo=isParaModulo;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdModuloParametroGenerico);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadFK_IdBodega=isParaTransaccionNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdBodegaParametroGenerico);}

			this.isVisibilidadFK_IdModulo=isParaTransaccionNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdModuloParametroGenerico);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccionRecibo(Boolean isParaTransaccionRecibo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionReciboNegation=!isParaTransaccionRecibo;

			this.isVisibilidadFK_IdBodega=isParaTransaccionReciboNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdBodegaParametroGenerico);}

			this.isVisibilidadFK_IdModulo=isParaTransaccionReciboNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdModuloParametroGenerico);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdBodegaParametroGenerico);}

			this.isVisibilidadFK_IdModulo=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdModuloParametroGenerico);}
		}
		
	}

	public void setVisibilidadBusquedasParaServicio(Boolean isParaServicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaServicioNegation=!isParaServicio;

			this.isVisibilidadFK_IdBodega=isParaServicioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdBodegaParametroGenerico);}

			this.isVisibilidadFK_IdModulo=isParaServicioNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdModuloParametroGenerico);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormato(Boolean isParaFormato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNegation=!isParaFormato;

			this.isVisibilidadFK_IdBodega=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdBodegaParametroGenerico);}

			this.isVisibilidadFK_IdModulo=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdModuloParametroGenerico);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormatoRecibo(Boolean isParaFormatoRecibo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoReciboNegation=!isParaFormatoRecibo;

			this.isVisibilidadFK_IdBodega=isParaFormatoReciboNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdBodegaParametroGenerico);}

			this.isVisibilidadFK_IdModulo=isParaFormatoReciboNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroGenerico.remove(jPanelFK_IdModuloParametroGenerico);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroGenericoSessionBean parametrogenericoSessionBean=new ParametroGenericoSessionBean();
		
		if(this.parametrogenericoSessionBean==null) {
			this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
		}
		
		this.parametrogenericoSessionBean.setsUltimaBusquedaParametroGenerico(this.getsAccionBusqueda());
		this.parametrogenericoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametrogenericoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			parametrogenericoSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parametrogenericoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			parametrogenericoSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			parametrogenericoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroGenericoSessionBean parametrogenericoSessionBean=new ParametroGenericoSessionBean();
		
		if(this.parametrogenericoSessionBean==null) {
			this.parametrogenericoSessionBean=new ParametroGenericoSessionBean();
		}
		
		if(this.parametrogenericoSessionBean.getsUltimaBusquedaParametroGenerico()!=null&&!this.parametrogenericoSessionBean.getsUltimaBusquedaParametroGenerico().equals("")) {
			this.setsAccionBusqueda(parametrogenericoSessionBean.getsUltimaBusquedaParametroGenerico());
			this.setiNumeroPaginacion(parametrogenericoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametrogenericoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(parametrogenericoSessionBean.getid_bodega());
				parametrogenericoSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parametrogenericoSessionBean.getid_empresa());
				parametrogenericoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(parametrogenericoSessionBean.getid_modulo());
				parametrogenericoSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(parametrogenericoSessionBean.getid_sucursal());
				parametrogenericoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.parametrogenericoSessionBean.setsUltimaBusquedaParametroGenerico("");
		this.parametrogenericoSessionBean.setiNumeroPaginacion(ParametroGenericoConstantesFunciones.INUMEROPAGINACION);
		this.parametrogenericoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroGenerico(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroGenerico() {
		this.updateBorderResaltarBusquedasFormularioParametroGenerico();
		this.updateVisibilidadBusquedasFormularioParametroGenerico();
		this.updateHabilitarBusquedasFormularioParametroGenerico();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroGenerico() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroGenerico.getComponents().length>0) {
	

		if(this.parametrogenericoConstantesFunciones.resaltarFK_IdBodegaParametroGenerico!=null) {
			index= this.jTabbedPaneBusquedasParametroGenerico.indexOfComponent(this.jPanelFK_IdBodegaParametroGenerico);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroGenerico.getComponent(index);
				jPanel.setBorder(this.parametrogenericoConstantesFunciones.resaltarFK_IdBodegaParametroGenerico);
			}
		}

		if(this.parametrogenericoConstantesFunciones.resaltarFK_IdModuloParametroGenerico!=null) {
			index= this.jTabbedPaneBusquedasParametroGenerico.indexOfComponent(this.jPanelFK_IdModuloParametroGenerico);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroGenerico.getComponent(index);
				jPanel.setBorder(this.parametrogenericoConstantesFunciones.resaltarFK_IdModuloParametroGenerico);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroGenerico() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroGenerico.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroGenerico.indexOfComponent(this.jPanelFK_IdBodegaParametroGenerico);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroGenerico.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrogenericoConstantesFunciones.mostrarFK_IdBodegaParametroGenerico);
			if(!this.parametrogenericoConstantesFunciones.mostrarFK_IdBodegaParametroGenerico && index>-1) {
				this.jTabbedPaneBusquedasParametroGenerico.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroGenerico.indexOfComponent(this.jPanelFK_IdModuloParametroGenerico);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroGenerico.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrogenericoConstantesFunciones.mostrarFK_IdModuloParametroGenerico);
			if(!this.parametrogenericoConstantesFunciones.mostrarFK_IdModuloParametroGenerico && index>-1) {
				this.jTabbedPaneBusquedasParametroGenerico.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroGenerico() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroGenerico.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroGenerico.indexOfComponent(this.jPanelFK_IdBodegaParametroGenerico);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroGenerico.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrogenericoConstantesFunciones.activarFK_IdBodegaParametroGenerico);
				this.jTabbedPaneBusquedasParametroGenerico.setEnabledAt(index,this.parametrogenericoConstantesFunciones.activarFK_IdBodegaParametroGenerico);
			}

			index= this.jTabbedPaneBusquedasParametroGenerico.indexOfComponent(this.jPanelFK_IdModuloParametroGenerico);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroGenerico.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrogenericoConstantesFunciones.activarFK_IdModuloParametroGenerico);
				this.jTabbedPaneBusquedasParametroGenerico.setEnabledAt(index,this.parametrogenericoConstantesFunciones.activarFK_IdModuloParametroGenerico);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroGenerico(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasParametroGenerico.indexOfComponent(this.jPanelFK_IdBodegaParametroGenerico);

			this.jTabbedPaneBusquedasParametroGenerico.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroGenerico.getComponent(index);

			this.parametrogenericoConstantesFunciones.setResaltarFK_IdBodegaParametroGenerico(resaltar);

			jPanel.setBorder(this.parametrogenericoConstantesFunciones.resaltarFK_IdBodegaParametroGenerico);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdModulo")) {
			index= this.jTabbedPaneBusquedasParametroGenerico.indexOfComponent(this.jPanelFK_IdModuloParametroGenerico);

			this.jTabbedPaneBusquedasParametroGenerico.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroGenerico.getComponent(index);

			this.parametrogenericoConstantesFunciones.setResaltarFK_IdModuloParametroGenerico(resaltar);

			jPanel.setBorder(this.parametrogenericoConstantesFunciones.resaltarFK_IdModuloParametroGenerico);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParametroGenerico.setBorder(resaltar);
			
		}
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
	
	public void updateControlesFormularioParametroGenerico() throws Exception {

		if(this.jInternalFrameDetalleFormParametroGenerico==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroGenerico();
		this.updateVisibilidadResaltarControlesFormularioParametroGenerico();
		this.updateHabilitarResaltarControlesFormularioParametroGenerico();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroGenerico() throws Exception {
		if(this.jInternalFrameDetalleFormParametroGenerico==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametrogenericoConstantesFunciones.resaltaridParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico!=null) {this.jInternalFrameDetalleFormParametroGenerico.jLabelidParametroGenerico.setBorder(this.parametrogenericoConstantesFunciones.resaltaridParametroGenerico);}
		if(this.parametrogenericoConstantesFunciones.resaltarid_empresaParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico!=null) {this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.setBorder(this.parametrogenericoConstantesFunciones.resaltarid_empresaParametroGenerico);}
		if(this.parametrogenericoConstantesFunciones.resaltarid_sucursalParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico!=null) {this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.setBorder(this.parametrogenericoConstantesFunciones.resaltarid_sucursalParametroGenerico);}
		if(this.parametrogenericoConstantesFunciones.resaltarid_moduloParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico!=null) {this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.setBorder(this.parametrogenericoConstantesFunciones.resaltarid_moduloParametroGenerico);}
		if(this.parametrogenericoConstantesFunciones.resaltarsecuencialParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico!=null) {this.jInternalFrameDetalleFormParametroGenerico.jTextFieldsecuencialParametroGenerico.setBorder(this.parametrogenericoConstantesFunciones.resaltarsecuencialParametroGenerico);}
		if(this.parametrogenericoConstantesFunciones.resaltarcodigoParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico!=null) {this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxcodigoParametroGenerico.setBorderPainted(true);this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxcodigoParametroGenerico.setBorder(this.parametrogenericoConstantesFunciones.resaltarcodigoParametroGenerico);}
		if(this.parametrogenericoConstantesFunciones.resaltarid_transaccionParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico!=null) {this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.setBorder(this.parametrogenericoConstantesFunciones.resaltarid_transaccionParametroGenerico);}
		if(this.parametrogenericoConstantesFunciones.resaltarid_transaccion_reciboParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico!=null) {this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.setBorder(this.parametrogenericoConstantesFunciones.resaltarid_transaccion_reciboParametroGenerico);}
		if(this.parametrogenericoConstantesFunciones.resaltarid_bodegaParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico!=null) {this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.setBorder(this.parametrogenericoConstantesFunciones.resaltarid_bodegaParametroGenerico);}
		if(this.parametrogenericoConstantesFunciones.resaltarid_servicioParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico!=null) {this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.setBorder(this.parametrogenericoConstantesFunciones.resaltarid_servicioParametroGenerico);}
		if(this.parametrogenericoConstantesFunciones.resaltarid_formatoParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico!=null) {this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.setBorder(this.parametrogenericoConstantesFunciones.resaltarid_formatoParametroGenerico);}
		if(this.parametrogenericoConstantesFunciones.resaltarid_formato_reciboParametroGenerico!=null && this.jInternalFrameDetalleFormParametroGenerico!=null) {this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.setBorder(this.parametrogenericoConstantesFunciones.resaltarid_formato_reciboParametroGenerico);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroGenerico() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroGenerico==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
	
		//this.jInternalFrameDetalleFormParametroGenerico.jLabelidParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostraridParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jPanelidParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostraridParametroGenerico);
		//this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_empresaParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jPanelid_empresaParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_empresaParametroGenerico);
		//this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_sucursalParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jPanelid_sucursalParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_sucursalParametroGenerico);
		//this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_moduloParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jPanelid_moduloParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_moduloParametroGenerico);
		//this.jInternalFrameDetalleFormParametroGenerico.jTextFieldsecuencialParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarsecuencialParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jPanelsecuencialParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarsecuencialParametroGenerico);
		//this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxcodigoParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarcodigoParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jPanelcodigoParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarcodigoParametroGenerico);
		//this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_transaccionParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jPanelid_transaccionParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_transaccionParametroGenerico);
		//this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_transaccion_reciboParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jPanelid_transaccion_reciboParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_transaccion_reciboParametroGenerico);
		//this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_bodegaParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jPanelid_bodegaParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_bodegaParametroGenerico);
		//this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_servicioParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jPanelid_servicioParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_servicioParametroGenerico);
		//this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_formatoParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jPanelid_formatoParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_formatoParametroGenerico);
		//this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_formato_reciboParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jPanelid_formato_reciboParametroGenerico.setVisible(this.parametrogenericoConstantesFunciones.mostrarid_formato_reciboParametroGenerico);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroGenerico() throws Exception {
		if(this.jInternalFrameDetalleFormParametroGenerico==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroGenerico!=null) {
	
		this.jInternalFrameDetalleFormParametroGenerico.jLabelidParametroGenerico.setEnabled(this.parametrogenericoConstantesFunciones.activaridParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_empresaParametroGenerico.setEnabled(this.parametrogenericoConstantesFunciones.activarid_empresaParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_sucursalParametroGenerico.setEnabled(this.parametrogenericoConstantesFunciones.activarid_sucursalParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_moduloParametroGenerico.setEnabled(this.parametrogenericoConstantesFunciones.activarid_moduloParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jTextFieldsecuencialParametroGenerico.setEnabled(this.parametrogenericoConstantesFunciones.activarsecuencialParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jCheckBoxcodigoParametroGenerico.setEnabled(this.parametrogenericoConstantesFunciones.activarcodigoParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccionParametroGenerico.setEnabled(this.parametrogenericoConstantesFunciones.activarid_transaccionParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_transaccion_reciboParametroGenerico.setEnabled(this.parametrogenericoConstantesFunciones.activarid_transaccion_reciboParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_bodegaParametroGenerico.setEnabled(this.parametrogenericoConstantesFunciones.activarid_bodegaParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_servicioParametroGenerico.setEnabled(this.parametrogenericoConstantesFunciones.activarid_servicioParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formatoParametroGenerico.setEnabled(this.parametrogenericoConstantesFunciones.activarid_formatoParametroGenerico);
		this.jInternalFrameDetalleFormParametroGenerico.jComboBoxid_formato_reciboParametroGenerico.setEnabled(this.parametrogenericoConstantesFunciones.activarid_formato_reciboParametroGenerico);
		}
	}
	
		
}