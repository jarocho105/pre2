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
package com.bydan.erp.sris.presentation.swing.jinternalframes;




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

import com.bydan.erp.sris.util.DocumentoAnuladoConstantesFunciones;
import com.bydan.erp.sris.util.DocumentoAnuladoParameterReturnGeneral;
//import com.bydan.erp.sris.util.DocumentoAnuladoParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.DocumentoAnuladoBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.sris.resources.reportes.AuxiliarReportes;


import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DocumentoAnuladoBeanSwingJInternalFrame extends DocumentoAnuladoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DocumentoAnuladoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DocumentoAnulado> documentoanuladoValidator = new ClassValidator<DocumentoAnulado>(DocumentoAnulado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DocumentoAnulado documentoanulado;	
	public DocumentoAnulado documentoanuladoAux;
	public DocumentoAnulado documentoanuladoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DocumentoAnulado documentoanuladoTotales;
	public Long idDocumentoAnuladoActual;
	public Long iIdNuevoDocumentoAnulado=0L;
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

	public String sFinalQueryComboPeriodoDeclara="";

	public List<PeriodoDeclara> periododeclarasForeignKey;

	public List<PeriodoDeclara> getperiododeclarasForeignKey() {
		return periododeclarasForeignKey;
	}

	public void setperiododeclarasForeignKey(List<PeriodoDeclara> periododeclarasForeignKey) {
		this.periododeclarasForeignKey = periododeclarasForeignKey;
	}

	//OBJETO FK ACTUAL
	public PeriodoDeclara periododeclaraForeignKey;

	public PeriodoDeclara getperiododeclaraForeignKey() {
		return periododeclaraForeignKey;
	}

	public void setperiododeclaraForeignKey(PeriodoDeclara periododeclaraForeignKey) {
		this.periododeclaraForeignKey = periododeclaraForeignKey;
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

	public String sFinalQueryComboTipoComprobante="";

	public List<TipoComprobante> tipocomprobantesForeignKey;

	public List<TipoComprobante> gettipocomprobantesForeignKey() {
		return tipocomprobantesForeignKey;
	}

	public void settipocomprobantesForeignKey(List<TipoComprobante> tipocomprobantesForeignKey) {
		this.tipocomprobantesForeignKey = tipocomprobantesForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoComprobante tipocomprobanteForeignKey;

	public TipoComprobante gettipocomprobanteForeignKey() {
		return tipocomprobanteForeignKey;
	}

	public void settipocomprobanteForeignKey(TipoComprobante tipocomprobanteForeignKey) {
		this.tipocomprobanteForeignKey = tipocomprobanteForeignKey;
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
	
	public Boolean isPermisoTodoDocumentoAnulado;
	public Boolean isPermisoNuevoDocumentoAnulado;
	public Boolean isPermisoActualizarDocumentoAnulado;
	public Boolean isPermisoActualizarOriginalDocumentoAnulado;
	public Boolean isPermisoEliminarDocumentoAnulado;
	public Boolean isPermisoGuardarCambiosDocumentoAnulado;
	public Boolean isPermisoConsultaDocumentoAnulado;
	public Boolean isPermisoBusquedaDocumentoAnulado;
	public Boolean isPermisoReporteDocumentoAnulado;
	public Boolean isPermisoPaginacionMedioDocumentoAnulado;
	public Boolean isPermisoPaginacionAltoDocumentoAnulado;
	public Boolean isPermisoPaginacionTodoDocumentoAnulado;
	public Boolean isPermisoCopiarDocumentoAnulado;
	public Boolean isPermisoVerFormDocumentoAnulado;
	public Boolean isPermisoDuplicarDocumentoAnulado;
	public Boolean isPermisoOrdenDocumentoAnulado;
	
	
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
	
	public DocumentoAnuladoParameterReturnGeneral documentoanuladoReturnGeneral;
	public DocumentoAnuladoParameterReturnGeneral documentoanuladoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDocumentoAnulado=false;
	public Boolean esParaAccionDesdeFormularioDocumentoAnulado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DocumentoAnuladoSessionBeanAdditional documentoanuladoSessionBeanAdditional=null;
	
	public DocumentoAnuladoSessionBeanAdditional getDocumentoAnuladoSessionBeanAdditional() {
		return this.documentoanuladoSessionBeanAdditional;
	}
	
	public void setDocumentoAnuladoSessionBeanAdditional(DocumentoAnuladoSessionBeanAdditional documentoanuladoSessionBeanAdditional) {
		try {
			this.documentoanuladoSessionBeanAdditional=documentoanuladoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DocumentoAnuladoBeanSwingJInternalFrameAdditional documentoanuladoBeanSwingJInternalFrameAdditional=null;
	//public class DocumentoAnuladoBeanSwingJInternalFrame
	
	public DocumentoAnuladoBeanSwingJInternalFrameAdditional getDocumentoAnuladoBeanSwingJInternalFrameAdditional() {
		return this.documentoanuladoBeanSwingJInternalFrameAdditional;
	}
	
	public void setDocumentoAnuladoBeanSwingJInternalFrameAdditional(DocumentoAnuladoBeanSwingJInternalFrameAdditional documentoanuladoBeanSwingJInternalFrameAdditional) {
		try {
			this.documentoanuladoBeanSwingJInternalFrameAdditional=documentoanuladoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DocumentoAnuladoLogic documentoanuladoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DocumentoAnulado documentoanuladoBean;
	public DocumentoAnuladoConstantesFunciones documentoanuladoConstantesFunciones;
	//public DocumentoAnuladoParameterReturnGeneral documentoanuladoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public PeriodoDeclaraLogic periododeclaraLogic;
	public ModuloLogic moduloLogic;
	public TipoComprobanteLogic tipocomprobanteLogic;
	
	//PARAMETROS
	
	
	//public List<DocumentoAnulado> documentoanulados;	
	//public List<DocumentoAnulado> documentoanuladosEliminados;
	//public List<DocumentoAnulado> documentoanuladosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDocumentoAnulado=false;
	public Boolean isVisibilidadCeldaDuplicarDocumentoAnulado=true;
	public Boolean isVisibilidadCeldaCopiarDocumentoAnulado=true;
	public Boolean isVisibilidadCeldaVerFormDocumentoAnulado=true;
	public Boolean isVisibilidadCeldaOrdenDocumentoAnulado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=false;
	public Boolean isVisibilidadCeldaModificarDocumentoAnulado=false;
	public Boolean isVisibilidadCeldaActualizarDocumentoAnulado=false;
	public Boolean isVisibilidadCeldaEliminarDocumentoAnulado=false;
	public Boolean isVisibilidadCeldaCancelarDocumentoAnulado=false;
	public Boolean isVisibilidadCeldaGuardarDocumentoAnulado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDocumentoAnulado=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdPeriodoDeclara=false;
	public Boolean isVisibilidadFK_IdTipoComprobante=false;
	
	public Long getiIdNuevoDocumentoAnulado() {
		return this.iIdNuevoDocumentoAnulado;
	}

	public void setiIdNuevoDocumentoAnulado(Long iIdNuevoDocumentoAnulado) {
		this.iIdNuevoDocumentoAnulado = iIdNuevoDocumentoAnulado;
	}
	
	public Long getidDocumentoAnuladoActual() {
		return this.idDocumentoAnuladoActual;
	}

	public void setidDocumentoAnuladoActual(Long idDocumentoAnuladoActual) {
		this.idDocumentoAnuladoActual = idDocumentoAnuladoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DocumentoAnulado getdocumentoanulado() {
		return this.documentoanulado;
	}

	public void setdocumentoanulado(DocumentoAnulado documentoanulado) {
		this.documentoanulado = documentoanulado;
	}
	
	public DocumentoAnulado getdocumentoanuladoAux() {
		return this.documentoanuladoAux;
	}

	public void setdocumentoanuladoAux(DocumentoAnulado documentoanuladoAux) {
		this.documentoanuladoAux = documentoanuladoAux;
	}				
	
	public DocumentoAnulado getdocumentoanuladoAnterior() {
		return this.documentoanuladoAnterior;
	}

	public void setdocumentoanuladoAnterior(DocumentoAnulado documentoanuladoAnterior) {
		this.documentoanuladoAnterior = documentoanuladoAnterior;
	}	
	
	public DocumentoAnulado getdocumentoanuladoTotales() {
		return this.documentoanuladoTotales;
	}

	public void setdocumentoanuladoTotales(DocumentoAnulado documentoanuladoTotales) {
		this.documentoanuladoTotales = documentoanuladoTotales;
	}	
	
	public DocumentoAnulado getdocumentoanuladoBean() {
		return this.documentoanuladoBean;
	}

	public void setdocumentoanuladoBean(DocumentoAnulado documentoanuladoBean) {
		this.documentoanuladoBean = documentoanuladoBean;
	}	
	
	public DocumentoAnuladoParameterReturnGeneral getdocumentoanuladoReturnGeneral() {
		return this.documentoanuladoReturnGeneral;
	}

	public void setdocumentoanuladoReturnGeneral(DocumentoAnuladoParameterReturnGeneral documentoanuladoReturnGeneral) {
		this.documentoanuladoReturnGeneral = documentoanuladoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_periodo_declaraFK_IdPeriodoDeclara=-1L;

	public Long getid_periodo_declaraFK_IdPeriodoDeclara() {
		return this.id_periodo_declaraFK_IdPeriodoDeclara;
	}

	public void setid_periodo_declaraFK_IdPeriodoDeclara(Long id_periodo_declaraFK_IdPeriodoDeclara) {
		this.id_periodo_declaraFK_IdPeriodoDeclara = id_periodo_declaraFK_IdPeriodoDeclara;
	}

	public Long id_tipo_comprobanteFK_IdTipoComprobante=-1L;

	public Long getid_tipo_comprobanteFK_IdTipoComprobante() {
		return this.id_tipo_comprobanteFK_IdTipoComprobante;
	}

	public void setid_tipo_comprobanteFK_IdTipoComprobante(Long id_tipo_comprobanteFK_IdTipoComprobante) {
		this.id_tipo_comprobanteFK_IdTipoComprobante = id_tipo_comprobanteFK_IdTipoComprobante;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DocumentoAnuladoLogic getDocumentoAnuladoLogic()	{		
		return documentoanuladoLogic;
	}

	public void setDocumentoAnuladoLogic(DocumentoAnuladoLogic documentoanuladoLogic) {
		this.documentoanuladoLogic = documentoanuladoLogic;
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
	
	public Boolean getIsEsNuevoDocumentoAnulado() {
		return isEsNuevoDocumentoAnulado;
	}

	public void setIsEsNuevoDocumentoAnulado(Boolean isEsNuevoDocumentoAnulado) {
		this.isEsNuevoDocumentoAnulado = isEsNuevoDocumentoAnulado;
	}

	public Boolean getEsParaAccionDesdeFormularioDocumentoAnulado() {
		return esParaAccionDesdeFormularioDocumentoAnulado;
	}
	
	public void setEsParaAccionDesdeFormularioDocumentoAnulado(Boolean esParaAccionDesdeFormularioDocumentoAnulado) {
		this.esParaAccionDesdeFormularioDocumentoAnulado = esParaAccionDesdeFormularioDocumentoAnulado;
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

			if(this.documentoanuladoSessionBean==null) {
				this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
			}

			if(!this.documentoanuladoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(documentoanuladoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosPeriodoDeclarasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoDeclaraLogic periododeclaraLogic=new PeriodoDeclaraLogic();

			//periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingKeyData(true);

			if(this.documentoanuladoSessionBean==null) {
				this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
			}

			if(!this.documentoanuladoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingKeyData(true);

					periododeclaraLogic.getTodosPeriodoDeclarasWithConnection(sFinalQuery,new Pagination());

					this.periododeclarasForeignKey=periododeclaraLogic.getPeriodoDeclaras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodoDeclara(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periododeclaraLogic.getEntityWithConnection(documentoanuladoSessionBean.getlidPeriodoDeclaraActual());
					this.periododeclarasForeignKey.add(periododeclaraLogic.getPeriodoDeclara());
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

			if(this.documentoanuladoSessionBean==null) {
				this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
			}

			if(!this.documentoanuladoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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
					moduloLogic.getEntityWithConnection(documentoanuladoSessionBean.getlidModuloActual());
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

	public void cargarCombosTipoComprobantesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocomprobantesForeignKey=new ArrayList<TipoComprobante>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoComprobanteLogic tipocomprobanteLogic=new TipoComprobanteLogic();

			//tipocomprobanteLogic.getTipoComprobanteDataAccess().setIsForForeingKeyData(true);

			if(this.documentoanuladoSessionBean==null) {
				this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
			}

			if(!this.documentoanuladoSessionBean.getisBusquedaDesdeForeignKeySesionTipoComprobante()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocomprobanteLogic.getTipoComprobanteDataAccess().setIsForForeingKeyData(true);

					tipocomprobanteLogic.getTodosTipoComprobantesWithConnection(sFinalQuery,new Pagination());

					this.tipocomprobantesForeignKey=tipocomprobanteLogic.getTipoComprobantes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoComprobante(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomprobanteLogic.getEntityWithConnection(documentoanuladoSessionBean.getlidTipoComprobanteActual());
					this.tipocomprobantesForeignKey.add(tipocomprobanteLogic.getTipoComprobante());
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

					if(this.documentoanulado!=null) {
						this.documentoanulado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
						this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDocumentoAnulado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
						if(this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDocumentoAnuladoGenerico)throws Exception
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
				jComboBoxid_empresaDocumentoAnuladoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDocumentoAnuladoGenerico!=null && jComboBoxid_empresaDocumentoAnuladoGenerico.getItemCount()>0) {
					jComboBoxid_empresaDocumentoAnuladoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoDeclaraForeignKey(Long idPeriodoDeclaraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periododeclaraTemp!=null) {

					if(this.documentoanulado!=null) {
						this.documentoanulado.setPeriodoDeclara(periododeclaraTemp);
					}

					if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
						this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.setSelectedItem(periododeclaraTemp);
					}
				} else {
					//jComboBoxid_periodo_declaraDocumentoAnulado.setSelectedItem(periododeclaraTemp);
					if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
						if(this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPeriodoDeclara") || sFormularioTipoBusqueda.equals("Todos")){
					if(periododeclaraTemp!=null && jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado!=null) {
						jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setSelectedItem(periododeclaraTemp);
					} else {
						if(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado!=null) {
							//jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setSelectedItem(periododeclaraTemp);
							if(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.getItemCount()>0) {
								jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setSelectedIndex(0);
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

	public String getActualPeriodoDeclaraForeignKeyDescripcion(Long idPeriodoDeclaraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}


			sDescripcion=PeriodoDeclaraConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclaraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoDeclaraForeignKeyGenerico(Long idPeriodoDeclaraSeleccionado,JComboBox jComboBoxid_periodo_declaraDocumentoAnuladoGenerico)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}

			if(periododeclaraTemp!=null) {
				jComboBoxid_periodo_declaraDocumentoAnuladoGenerico.setSelectedItem(periododeclaraTemp);
			} else {
				if(jComboBoxid_periodo_declaraDocumentoAnuladoGenerico!=null && jComboBoxid_periodo_declaraDocumentoAnuladoGenerico.getItemCount()>0) {
					jComboBoxid_periodo_declaraDocumentoAnuladoGenerico.setSelectedIndex(0);
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

					if(this.documentoanulado!=null) {
						this.documentoanulado.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
						this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloDocumentoAnulado.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
						if(this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.setSelectedIndex(0);
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
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloDocumentoAnuladoGenerico)throws Exception
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
				jComboBoxid_moduloDocumentoAnuladoGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloDocumentoAnuladoGenerico!=null && jComboBoxid_moduloDocumentoAnuladoGenerico.getItemCount()>0) {
					jComboBoxid_moduloDocumentoAnuladoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoComprobanteForeignKey(Long idTipoComprobanteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoComprobante  tipocomprobanteTemp=null;

			for(TipoComprobante tipocomprobanteAux:tipocomprobantesForeignKey) {
				if(tipocomprobanteAux.getId()!=null && tipocomprobanteAux.getId().equals(idTipoComprobanteSeleccionado)) {
					tipocomprobanteTemp=tipocomprobanteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocomprobanteTemp!=null) {

					if(this.documentoanulado!=null) {
						this.documentoanulado.setTipoComprobante(tipocomprobanteTemp);
					}

					if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
						this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.setSelectedItem(tipocomprobanteTemp);
					}
				} else {
					//jComboBoxid_tipo_comprobanteDocumentoAnulado.setSelectedItem(tipocomprobanteTemp);
					if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
						if(this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoComprobante") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocomprobanteTemp!=null && jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado!=null) {
						jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setSelectedItem(tipocomprobanteTemp);
					} else {
						if(jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado!=null) {
							//jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setSelectedItem(tipocomprobanteTemp);
							if(jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.getItemCount()>0) {
								jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setSelectedIndex(0);
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

	public String getActualTipoComprobanteForeignKeyDescripcion(Long idTipoComprobanteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoComprobante  tipocomprobanteTemp=null;

			for(TipoComprobante tipocomprobanteAux:tipocomprobantesForeignKey) {
				if(tipocomprobanteAux.getId()!=null && tipocomprobanteAux.getId().equals(idTipoComprobanteSeleccionado)) {
					tipocomprobanteTemp=tipocomprobanteAux;
					break;
				}
			}


			sDescripcion=TipoComprobanteConstantesFunciones.getTipoComprobanteDescripcion(tipocomprobanteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoComprobanteForeignKeyGenerico(Long idTipoComprobanteSeleccionado,JComboBox jComboBoxid_tipo_comprobanteDocumentoAnuladoGenerico)throws Exception
	{
		try
		{
			TipoComprobante  tipocomprobanteTemp=null;

			for(TipoComprobante tipocomprobanteAux:tipocomprobantesForeignKey) {
				if(tipocomprobanteAux.getId()!=null && tipocomprobanteAux.getId().equals(idTipoComprobanteSeleccionado)) {
					tipocomprobanteTemp=tipocomprobanteAux;
					break;
				}
			}

			if(tipocomprobanteTemp!=null) {
				jComboBoxid_tipo_comprobanteDocumentoAnuladoGenerico.setSelectedItem(tipocomprobanteTemp);
			} else {
				if(jComboBoxid_tipo_comprobanteDocumentoAnuladoGenerico!=null && jComboBoxid_tipo_comprobanteDocumentoAnuladoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_comprobanteDocumentoAnuladoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DocumentoAnulado documentoanulado,JComboBox jComboBoxid_empresaDocumentoAnuladoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDocumentoAnuladoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDocumentoAnuladoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				documentoanulado.setid_empresa(empresaAux.getId());
				documentoanulado.setempresa_descripcion(DocumentoAnuladoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				documentoanulado.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoDeclaraForeignKey(DocumentoAnulado documentoanulado,JComboBox jComboBoxid_periodo_declaraDocumentoAnuladoGenerico)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraAux=new PeriodoDeclara();

			if(jComboBoxid_periodo_declaraDocumentoAnuladoGenerico==null) {
				periododeclaraAux=(PeriodoDeclara)this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.getSelectedItem();
			} else {
				periododeclaraAux=(PeriodoDeclara)jComboBoxid_periodo_declaraDocumentoAnuladoGenerico.getSelectedItem();
			}

			if(periododeclaraAux!=null && periododeclaraAux.getId()!=null) {
				documentoanulado.setid_periodo_declara(periododeclaraAux.getId());
				documentoanulado.setperiododeclara_descripcion(DocumentoAnuladoConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclaraAux));
				documentoanulado.setPeriodoDeclara(periododeclaraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(DocumentoAnulado documentoanulado,JComboBox jComboBoxid_moduloDocumentoAnuladoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloDocumentoAnuladoGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloDocumentoAnuladoGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				documentoanulado.setid_modulo(moduloAux.getId());
				documentoanulado.setmodulo_descripcion(DocumentoAnuladoConstantesFunciones.getModuloDescripcion(moduloAux));
				documentoanulado.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoComprobanteForeignKey(DocumentoAnulado documentoanulado,JComboBox jComboBoxid_tipo_comprobanteDocumentoAnuladoGenerico)throws Exception
	{
		try
		{
			TipoComprobante  tipocomprobanteAux=new TipoComprobante();

			if(jComboBoxid_tipo_comprobanteDocumentoAnuladoGenerico==null) {
				tipocomprobanteAux=(TipoComprobante)this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.getSelectedItem();
			} else {
				tipocomprobanteAux=(TipoComprobante)jComboBoxid_tipo_comprobanteDocumentoAnuladoGenerico.getSelectedItem();
			}

			if(tipocomprobanteAux!=null && tipocomprobanteAux.getId()!=null) {
				documentoanulado.setid_tipo_comprobante(tipocomprobanteAux.getId());
				documentoanulado.settipocomprobante_descripcion(DocumentoAnuladoConstantesFunciones.getTipoComprobanteDescripcion(tipocomprobanteAux));
				documentoanulado.setTipoComprobante(tipocomprobanteAux);			}
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

					if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { 
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { 
					}

					if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodoDeclarasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodoDeclara=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { 
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.removeAllItems();

							for(PeriodoDeclara periododeclara:this.periododeclarasForeignKey) {
								this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.addItem(periododeclara);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { 
					}

					if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPeriodoDeclara") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.removeAllItems();

							for(PeriodoDeclara periododeclara:this.periododeclarasForeignKey) {
								this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.addItem(periododeclara);
							}
						}

						if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { 
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { 
					}

					if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoComprobantesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoComprobante=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { 
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.removeAllItems();

							for(TipoComprobante tipocomprobante:this.tipocomprobantesForeignKey) {
								this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.addItem(tipocomprobante);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { 
					}

					if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoComprobante") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.removeAllItems();

							for(TipoComprobante tipocomprobante:this.tipocomprobantesForeignKey) {
								this.jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.addItem(tipocomprobante);
							}
						}

						if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoDeclaraForeignKey(PeriodoDeclara periododeclara,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.setSelectedItem(periododeclara);
						}
					} else {
						if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setSelectedItem(periododeclara);
						} else {
							this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoComprobanteForeignKey(TipoComprobante tipocomprobante,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.setSelectedItem(tipocomprobante);
						}
					} else {
						if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setSelectedItem(tipocomprobante);
						} else {
							this.jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDocumentoAnulado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DocumentoAnuladoConstantesFunciones.refrescarForeignKeysDescripcionesDocumentoAnulado(this.documentoanuladoLogic.getDocumentoAnulados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DocumentoAnuladoConstantesFunciones.refrescarForeignKeysDescripcionesDocumentoAnulado(this.documentoanulados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(PeriodoDeclara.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(TipoComprobante.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//documentoanuladoLogic.setDocumentoAnulados(this.documentoanulados);
			documentoanuladoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DocumentoAnuladoParameterReturnGeneral getDocumentoAnuladoParameterGeneral() {
		return this.documentoanuladoParameterGeneral;
	}
	
	public void setDocumentoAnuladoParameterGeneral(DocumentoAnuladoParameterReturnGeneral documentoanuladoParameterGeneral) {
		this.documentoanuladoParameterGeneral = documentoanuladoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDocumentoAnulado() {
		return isPermisoTodoDocumentoAnulado;
	}

	public void setIsPermisoTodoDocumentoAnulado(Boolean isPermisoTodoDocumentoAnulado) {
		this.isPermisoTodoDocumentoAnulado = isPermisoTodoDocumentoAnulado;
	}

	public Boolean getIsPermisoNuevoDocumentoAnulado() {
		return isPermisoNuevoDocumentoAnulado;
	}

	public void setIsPermisoNuevoDocumentoAnulado(Boolean isPermisoNuevoDocumentoAnulado) {
		this.isPermisoNuevoDocumentoAnulado = isPermisoNuevoDocumentoAnulado;
	}

	public Boolean getIsPermisoActualizarDocumentoAnulado() {
		return isPermisoActualizarDocumentoAnulado;
	}

	public void setIsPermisoActualizarDocumentoAnulado(Boolean isPermisoActualizarDocumentoAnulado) {
		this.isPermisoActualizarDocumentoAnulado = isPermisoActualizarDocumentoAnulado;
	}

	public Boolean getIsPermisoEliminarDocumentoAnulado() {
		return isPermisoEliminarDocumentoAnulado;
	}

	public void setIsPermisoEliminarDocumentoAnulado(Boolean isPermisoEliminarDocumentoAnulado) {
		this.isPermisoEliminarDocumentoAnulado = isPermisoEliminarDocumentoAnulado;
	}

	public Boolean getIsPermisoGuardarCambiosDocumentoAnulado() {
		return isPermisoGuardarCambiosDocumentoAnulado;
	}

	public void setIsPermisoGuardarCambiosDocumentoAnulado(Boolean isPermisoGuardarCambiosDocumentoAnulado) {
		this.isPermisoGuardarCambiosDocumentoAnulado = isPermisoGuardarCambiosDocumentoAnulado;
	}
	
	public Boolean getIsPermisoConsultaDocumentoAnulado() {
		return isPermisoConsultaDocumentoAnulado;
	}

	public void setIsPermisoConsultaDocumentoAnulado(Boolean isPermisoConsultaDocumentoAnulado) {
		this.isPermisoConsultaDocumentoAnulado = isPermisoConsultaDocumentoAnulado;
	}

	public Boolean getIsPermisoBusquedaDocumentoAnulado() {
		return isPermisoBusquedaDocumentoAnulado;
	}

	public void setIsPermisoBusquedaDocumentoAnulado(Boolean isPermisoBusquedaDocumentoAnulado) {
		this.isPermisoBusquedaDocumentoAnulado = isPermisoBusquedaDocumentoAnulado;
	}

	public Boolean getIsPermisoReporteDocumentoAnulado() {
		return isPermisoReporteDocumentoAnulado;
	}

	public void setIsPermisoReporteDocumentoAnulado(Boolean isPermisoReporteDocumentoAnulado) {
		this.isPermisoReporteDocumentoAnulado = isPermisoReporteDocumentoAnulado;
	}
	
	public Boolean getIsPermisoPaginacionMedioDocumentoAnulado() {
		return isPermisoPaginacionMedioDocumentoAnulado;
	}

	public void setIsPermisoPaginacionMedioDocumentoAnulado(Boolean isPermisoPaginacionMedioDocumentoAnulado) {
		this.isPermisoPaginacionMedioDocumentoAnulado = isPermisoPaginacionMedioDocumentoAnulado;
	}
	
	public Boolean getIsPermisoPaginacionTodoDocumentoAnulado() {
		return isPermisoPaginacionTodoDocumentoAnulado;
	}

	public void setIsPermisoPaginacionTodoDocumentoAnulado(Boolean isPermisoPaginacionTodoDocumentoAnulado) {
		this.isPermisoPaginacionTodoDocumentoAnulado = isPermisoPaginacionTodoDocumentoAnulado;
	}
	
	public Boolean getIsPermisoPaginacionAltoDocumentoAnulado() {
		return isPermisoPaginacionAltoDocumentoAnulado;
	}

	public void setIsPermisoPaginacionAltoDocumentoAnulado(Boolean isPermisoPaginacionAltoDocumentoAnulado) {
		this.isPermisoPaginacionAltoDocumentoAnulado = isPermisoPaginacionAltoDocumentoAnulado;
	}
	
	public Boolean getIsPermisoCopiarDocumentoAnulado() {
		return isPermisoCopiarDocumentoAnulado;
	}

	public void setIsPermisoCopiarDocumentoAnulado(Boolean isPermisoCopiarDocumentoAnulado) {
		this.isPermisoCopiarDocumentoAnulado = isPermisoCopiarDocumentoAnulado;
	}
	
	public Boolean getIsPermisoVerFormDocumentoAnulado() {
		return isPermisoVerFormDocumentoAnulado;
	}

	public void setIsPermisoVerFormDocumentoAnulado(Boolean isPermisoVerFormDocumentoAnulado) {
		this.isPermisoVerFormDocumentoAnulado = isPermisoVerFormDocumentoAnulado;
	}
	
	public Boolean getIsPermisoDuplicarDocumentoAnulado() {
		return isPermisoDuplicarDocumentoAnulado;
	}

	public void setIsPermisoDuplicarDocumentoAnulado(Boolean isPermisoDuplicarDocumentoAnulado) {
		this.isPermisoDuplicarDocumentoAnulado = isPermisoDuplicarDocumentoAnulado;
	}
	
	public Boolean getIsPermisoOrdenDocumentoAnulado() {
		return isPermisoOrdenDocumentoAnulado;
	}

	public void setIsPermisoOrdenDocumentoAnulado(Boolean isPermisoOrdenDocumentoAnulado) {
		this.isPermisoOrdenDocumentoAnulado = isPermisoOrdenDocumentoAnulado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDocumentoAnulado() {
		return isVisibilidadCeldaNuevoDocumentoAnulado;
	}

	public void setIsVisibilidadCeldaNuevoDocumentoAnulado(Boolean isVisibilidadCeldaNuevoDocumentoAnulado) {
		this.isVisibilidadCeldaNuevoDocumentoAnulado = isVisibilidadCeldaNuevoDocumentoAnulado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDocumentoAnulado() {
		return isVisibilidadCeldaDuplicarDocumentoAnulado;
	}

	public void setIsVisibilidadCeldaDuplicarDocumentoAnulado(Boolean isVisibilidadCeldaDuplicarDocumentoAnulado) {
		this.isVisibilidadCeldaDuplicarDocumentoAnulado = isVisibilidadCeldaDuplicarDocumentoAnulado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDocumentoAnulado() {
		return isVisibilidadCeldaCopiarDocumentoAnulado;
	}

	public void setIsVisibilidadCeldaCopiarDocumentoAnulado(Boolean isVisibilidadCeldaCopiarDocumentoAnulado) {
		this.isVisibilidadCeldaCopiarDocumentoAnulado = isVisibilidadCeldaCopiarDocumentoAnulado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDocumentoAnulado() {
		return isVisibilidadCeldaVerFormDocumentoAnulado;
	}

	public void setIsVisibilidadCeldaVerFormDocumentoAnulado(Boolean isVisibilidadCeldaVerFormDocumentoAnulado) {
		this.isVisibilidadCeldaVerFormDocumentoAnulado = isVisibilidadCeldaVerFormDocumentoAnulado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDocumentoAnulado() {
		return isVisibilidadCeldaOrdenDocumentoAnulado;
	}

	public void setIsVisibilidadCeldaOrdenDocumentoAnulado(Boolean isVisibilidadCeldaOrdenDocumentoAnulado) {
		this.isVisibilidadCeldaOrdenDocumentoAnulado = isVisibilidadCeldaOrdenDocumentoAnulado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDocumentoAnulado() {
		return isVisibilidadCeldaNuevoRelacionesDocumentoAnulado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDocumentoAnulado(Boolean isVisibilidadCeldaNuevoRelacionesDocumentoAnulado) {
		this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado = isVisibilidadCeldaNuevoRelacionesDocumentoAnulado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDocumentoAnulado() {
		return isVisibilidadCeldaModificarDocumentoAnulado;
	}

	public void setIsVisibilidadCeldaModificarDocumentoAnulado(Boolean isVisibilidadCeldaModificarDocumentoAnulado) {
		this.isVisibilidadCeldaModificarDocumentoAnulado = isVisibilidadCeldaModificarDocumentoAnulado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDocumentoAnulado() {
		return isVisibilidadCeldaActualizarDocumentoAnulado;
	}

	public void setIsVisibilidadCeldaActualizarDocumentoAnulado(Boolean isVisibilidadCeldaActualizarDocumentoAnulado) {
		this.isVisibilidadCeldaActualizarDocumentoAnulado = isVisibilidadCeldaActualizarDocumentoAnulado;
	}

	public Boolean getIsVisibilidadCeldaEliminarDocumentoAnulado() {
		return isVisibilidadCeldaEliminarDocumentoAnulado;
	}

	public void setIsVisibilidadCeldaEliminarDocumentoAnulado(Boolean isVisibilidadCeldaEliminarDocumentoAnulado) {
		this.isVisibilidadCeldaEliminarDocumentoAnulado = isVisibilidadCeldaEliminarDocumentoAnulado;
	}

	public Boolean getIsVisibilidadCeldaCancelarDocumentoAnulado() {
		return isVisibilidadCeldaCancelarDocumentoAnulado;
	}

	public void setIsVisibilidadCeldaCancelarDocumentoAnulado(Boolean isVisibilidadCeldaCancelarDocumentoAnulado) {
		this.isVisibilidadCeldaCancelarDocumentoAnulado = isVisibilidadCeldaCancelarDocumentoAnulado;
	}

	public Boolean getIsVisibilidadCeldaGuardarDocumentoAnulado() {
		return isVisibilidadCeldaGuardarDocumentoAnulado;
	}

	public void setIsVisibilidadCeldaGuardarDocumentoAnulado(Boolean isVisibilidadCeldaGuardarDocumentoAnulado) {
		this.isVisibilidadCeldaGuardarDocumentoAnulado = isVisibilidadCeldaGuardarDocumentoAnulado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDocumentoAnulado() {
		return isVisibilidadCeldaGuardarCambiosDocumentoAnulado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDocumentoAnulado(Boolean isVisibilidadCeldaGuardarCambiosDocumentoAnulado) {
		this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado = isVisibilidadCeldaGuardarCambiosDocumentoAnulado;
	}
		
	public DocumentoAnuladoSessionBean getdocumentoanuladoSessionBean() {
		return this.documentoanuladoSessionBean;
	}
	
	public void setdocumentoanuladoSessionBean(DocumentoAnuladoSessionBean documentoanuladoSessionBean) {
		this.documentoanuladoSessionBean=documentoanuladoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdPeriodoDeclara() {
		return this.isVisibilidadFK_IdPeriodoDeclara;
	}

	public void setisVisibilidadFK_IdPeriodoDeclara(Boolean isVisibilidadFK_IdPeriodoDeclara) {
		this.isVisibilidadFK_IdPeriodoDeclara=isVisibilidadFK_IdPeriodoDeclara;
	}

	public Boolean getisVisibilidadFK_IdTipoComprobante() {
		return this.isVisibilidadFK_IdTipoComprobante;
	}

	public void setisVisibilidadFK_IdTipoComprobante(Boolean isVisibilidadFK_IdTipoComprobante) {
		this.isVisibilidadFK_IdTipoComprobante=isVisibilidadFK_IdTipoComprobante;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(DocumentoAnulado documentoanulado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(documentoanulado,null);
				this.setActualParaGuardarPeriodoDeclaraForeignKey(documentoanulado,null);
				this.setActualParaGuardarModuloForeignKey(documentoanulado,null);
				this.setActualParaGuardarTipoComprobanteForeignKey(documentoanulado,null);
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
	
	public void bugActualizarReferenciaActual(DocumentoAnulado documentoanulado,DocumentoAnulado documentoanuladoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDocumentoAnulado(documentoanulado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		documentoanuladoAux.setId(documentoanulado.getId());
		documentoanuladoAux.setVersionRow(documentoanulado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDocumentoAnulado();
		
			int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = documentoanuladoValidator.getInvalidValues(this.documentoanulado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			documentoanuladoLogic.setDatosCliente(datosCliente);
			documentoanuladoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				documentoanuladoAux=new  DocumentoAnulado();
				
				documentoanuladoAux.setIsNew(true);
				documentoanuladoAux.setIsChanged(true);
				
				documentoanuladoAux.setDocumentoAnuladoOriginal(this.documentoanulado);
				
				documentoanuladoAux.setId(this.documentoanulado.getId());	
				documentoanuladoAux.setVersionRow(this.documentoanulado.getVersionRow());	
				documentoanuladoAux.setid_empresa(this.documentoanulado.getid_empresa());	
				documentoanuladoAux.setid_periodo_declara(this.documentoanulado.getid_periodo_declara());	
				documentoanuladoAux.setid_modulo(this.documentoanulado.getid_modulo());	
				documentoanuladoAux.setid_tipo_comprobante(this.documentoanulado.getid_tipo_comprobante());	
				documentoanuladoAux.setnumero(this.documentoanulado.getnumero());	
				documentoanuladoAux.setserie(this.documentoanulado.getserie());	
				documentoanuladoAux.setautorizacion(this.documentoanulado.getautorizacion());	
				documentoanuladoAux.setfecha_anulacion(this.documentoanulado.getfecha_anulacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.documentoanuladoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(documentoanuladoAux,documentoanuladoLogic.getDocumentoAnulados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(documentoanuladoAux,documentoanulados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.documentoanuladoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladoLogic.saveDocumentoAnulados();//WithConnection
						//documentoanuladoLogic.getSetVersionRowDocumentoAnulados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.documentoanulado,documentoanuladoAux);
					
					this.refrescarForeignKeysDescripcionesDocumentoAnulado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								documentoanuladoLogic.saveDocumentoAnuladoRelaciones(documentoanuladoAux);//WithConnection
								//documentoanuladoLogic.getSetVersionRowDocumentoAnulados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.documentoanulado,documentoanuladoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.documentoanuladoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(documentoanuladoAux,documentoanuladoLogic.getDocumentoAnulados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(documentoanuladoAux,documentoanulados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.documentoanulado,documentoanuladoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				documentoanuladoAux=new  DocumentoAnulado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado() 
					|| (this.documentoanuladoSessionBean.getEsGuardarRelacionado() && this.documentoanulado.getId()>=0)) {
						
					documentoanuladoAux.setIsNew(false);
				}
				
				documentoanuladoAux.setIsDeleted(false);
			
				documentoanuladoAux.setId(this.documentoanulado.getId());	
				documentoanuladoAux.setVersionRow(this.documentoanulado.getVersionRow());	
				documentoanuladoAux.setid_empresa(this.documentoanulado.getid_empresa());	
				documentoanuladoAux.setid_periodo_declara(this.documentoanulado.getid_periodo_declara());	
				documentoanuladoAux.setid_modulo(this.documentoanulado.getid_modulo());	
				documentoanuladoAux.setid_tipo_comprobante(this.documentoanulado.getid_tipo_comprobante());	
				documentoanuladoAux.setnumero(this.documentoanulado.getnumero());	
				documentoanuladoAux.setserie(this.documentoanulado.getserie());	
				documentoanuladoAux.setautorizacion(this.documentoanulado.getautorizacion());	
				documentoanuladoAux.setfecha_anulacion(this.documentoanulado.getfecha_anulacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(documentoanuladoAux,documentoanuladoLogic.getDocumentoAnulados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(documentoanuladoAux,documentoanulados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.documentoanuladoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladoLogic.saveDocumentoAnulados();//WithConnection
						//documentoanuladoLogic.getSetVersionRowDocumentoAnulados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.documentoanulado,documentoanuladoAux);
					
					this.refrescarForeignKeysDescripcionesDocumentoAnulado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								documentoanuladoLogic.saveDocumentoAnuladoRelaciones(documentoanuladoAux);//WithConnection
								//documentoanuladoLogic.getSetVersionRowDocumentoAnulados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.documentoanulado,documentoanuladoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.documentoanuladoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(documentoanuladoAux,documentoanuladoLogic.getDocumentoAnulados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(documentoanuladoAux,documentoanulados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.documentoanulado,documentoanuladoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				documentoanuladoAux=new  DocumentoAnulado();
				
				documentoanuladoAux.setIsNew(false);
				documentoanuladoAux.setIsChanged(false);
				
				documentoanuladoAux.setIsDeleted(true);
				
				documentoanuladoAux.setId(this.documentoanulado.getId());	
				documentoanuladoAux.setVersionRow(this.documentoanulado.getVersionRow());	
				documentoanuladoAux.setid_empresa(this.documentoanulado.getid_empresa());	
				documentoanuladoAux.setid_periodo_declara(this.documentoanulado.getid_periodo_declara());	
				documentoanuladoAux.setid_modulo(this.documentoanulado.getid_modulo());	
				documentoanuladoAux.setid_tipo_comprobante(this.documentoanulado.getid_tipo_comprobante());	
				documentoanuladoAux.setnumero(this.documentoanulado.getnumero());	
				documentoanuladoAux.setserie(this.documentoanulado.getserie());	
				documentoanuladoAux.setautorizacion(this.documentoanulado.getautorizacion());	
				documentoanuladoAux.setfecha_anulacion(this.documentoanulado.getfecha_anulacion());	
				
				if(this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.documentoanuladoAux.getId()>=0) {	
						this.documentoanuladosEliminados.add(documentoanuladoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(documentoanuladoAux,documentoanuladoLogic.getDocumentoAnulados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(documentoanuladoAux,documentoanulados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.documentoanuladoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladoLogic.saveDocumentoAnulados();//WithConnection
						//documentoanuladoLogic.getSetVersionRowDocumentoAnulados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								documentoanuladoLogic.saveDocumentoAnuladoRelaciones(documentoanuladoAux);//WithConnection
								//documentoanuladoLogic.getSetVersionRowDocumentoAnulados();//WithConnection
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
							if(this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.documentoanuladoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(documentoanuladoAux,documentoanuladoLogic.getDocumentoAnulados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(documentoanuladoAux,documentoanulados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.getDocumentoAnulados().addAll(this.documentoanuladosEliminados);
					
					documentoanuladoLogic.saveDocumentoAnulados();//WithConnection
					//documentoanuladoLogic.getSetVersionRowDocumentoAnulados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDocumentoAnulado();
				
				this.documentoanuladosEliminados= new ArrayList<DocumentoAnulado>();		
			}
			
			if(this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Documento Anulado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Documento Anulado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.documentoanulado=documentoanuladoAux;
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
      		//this.finishProcessDocumentoAnulado();
      	}
		
	}	
	
	public void actualizarRelaciones(DocumentoAnulado documentoanuladoLocal) throws Exception {
		
		if(this.documentoanuladoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DocumentoAnulado documentoanuladoLocal) throws Exception {	
		if(this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				documentoanuladoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDeclaraDetalleFormJInternalFrame.class)) {
				PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrameLocal=(PeriodoDeclaraBeanSwingJInternalFrame) ((PeriodoDeclaraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periododeclaraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodoDeclara(periododeclaraBeanSwingJInternalFrameLocal.getperiododeclara(),true);
				periododeclaraBeanSwingJInternalFrameLocal.actualizarLista(periododeclaraBeanSwingJInternalFrameLocal.periododeclara,this.periododeclarasForeignKey);

				periododeclaraBeanSwingJInternalFrameLocal.actualizarRelaciones(periododeclaraBeanSwingJInternalFrameLocal.periododeclara);

				documentoanuladoLocal.setPeriodoDeclara(periododeclaraBeanSwingJInternalFrameLocal.periododeclara);

				this.addItemDefectoCombosForeignKeyPeriodoDeclara();
				this.cargarCombosFramePeriodoDeclarasForeignKey("Formulario");
				this.setActualPeriodoDeclaraForeignKey(periododeclaraBeanSwingJInternalFrameLocal.periododeclara.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				documentoanuladoLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoComprobanteDetalleFormJInternalFrame.class)) {
				TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrameLocal=(TipoComprobanteBeanSwingJInternalFrame) ((TipoComprobanteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocomprobanteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoComprobante(tipocomprobanteBeanSwingJInternalFrameLocal.gettipocomprobante(),true);
				tipocomprobanteBeanSwingJInternalFrameLocal.actualizarLista(tipocomprobanteBeanSwingJInternalFrameLocal.tipocomprobante,this.tipocomprobantesForeignKey);

				tipocomprobanteBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocomprobanteBeanSwingJInternalFrameLocal.tipocomprobante);

				documentoanuladoLocal.setTipoComprobante(tipocomprobanteBeanSwingJInternalFrameLocal.tipocomprobante);

				this.addItemDefectoCombosForeignKeyTipoComprobante();
				this.cargarCombosFrameTipoComprobantesForeignKey("Formulario");
				this.setActualTipoComprobanteForeignKey(tipocomprobanteBeanSwingJInternalFrameLocal.tipocomprobante.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDocumentoAnuladoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = documentoanuladoValidator.getInvalidValues(this.documentoanulado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DocumentoAnulado documentoanulado,List<DocumentoAnulado> documentoanulados) throws Exception {
		try	{		
			DocumentoAnuladoConstantesFunciones.actualizarLista(documentoanulado,documentoanulados,this.documentoanuladoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DocumentoAnulado documentoanulado,List<DocumentoAnulado> documentoanulados) throws Exception {
		try	{			
			DocumentoAnuladoConstantesFunciones.actualizarSelectedLista(documentoanulado,documentoanulados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DocumentoAnulado> documentoanuladosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				documentoanuladosLocal=this.documentoanuladoLogic.getDocumentoAnulados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				documentoanuladosLocal=this.documentoanulados;
			}
			//ARCHITECTURE
		
			for(DocumentoAnulado documentoanuladoLocal:documentoanuladosLocal) {
				if(this.permiteMantenimiento(documentoanuladoLocal) && documentoanuladoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DocumentoAnuladoConstantesFunciones.getDocumentoAnuladoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DocumentoAnuladoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelid_empresaDocumentoAnulado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DocumentoAnuladoConstantesFunciones.IDPERIODODECLARA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelid_periodo_declaraDocumentoAnulado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DocumentoAnuladoConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelid_moduloDocumentoAnulado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DocumentoAnuladoConstantesFunciones.IDTIPOCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelid_tipo_comprobanteDocumentoAnulado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DocumentoAnuladoConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelnumeroDocumentoAnulado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DocumentoAnuladoConstantesFunciones.SERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelserieDocumentoAnulado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DocumentoAnuladoConstantesFunciones.AUTORIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelautorizacionDocumentoAnulado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DocumentoAnuladoConstantesFunciones.FECHAANULACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelfecha_anulacionDocumentoAnulado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelid_empresaDocumentoAnulado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelid_periodo_declaraDocumentoAnulado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelid_moduloDocumentoAnulado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelid_tipo_comprobanteDocumentoAnulado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelnumeroDocumentoAnulado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelserieDocumentoAnulado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelautorizacionDocumentoAnulado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelfecha_anulacionDocumentoAnulado,"");
		
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
		this.iIdNuevoDocumentoAnulado--;	
		
		
		this.documentoanuladoAux=new DocumentoAnulado();
		
		this.documentoanuladoAux.setId(this.iIdNuevoDocumentoAnulado);
		this.documentoanuladoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.documentoanuladoLogic.getDocumentoAnulados().add(this.documentoanuladoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.documentoanulados.add(this.documentoanuladoAux);
		}
		//ARCHITECTURE
		
		this.documentoanulado=this.documentoanuladoAux;
		
		if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDocumentoAnulado(this.documentoanulado);
			this.setVariablesObjetoActualToFormularioForeignKeyDocumentoAnulado(this.documentoanulado);
		}
				
		//this.setDefaultControlesDocumentoAnulado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDocumentoAnulado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDocumentoAnulado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDocumentoAnulado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDocumentoAnulado(this.documentoanuladoBean,this.documentoanulado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.documentoanuladoSessionBean.getConGuardarRelaciones()) {
			classes=DocumentoAnuladoConstantesFunciones.getClassesRelationshipsOfDocumentoAnulado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.documentoanuladoReturnGeneral=documentoanuladoLogic.procesarEventosDocumentoAnuladosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.documentoanuladoLogic.getDocumentoAnulados(),this.documentoanulado,this.documentoanuladoParameterGeneral,this.isEsNuevoDocumentoAnulado,classes);//this.documentoanuladoLogic.getDocumentoAnulado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDocumentoAnulado(this.documentoanuladoReturnGeneral,this.documentoanuladoBean,false);
		
		if(this.documentoanuladoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDocumentoAnulado(this.documentoanuladoReturnGeneral.getDocumentoAnulado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDocumentoAnulado(this.documentoanuladoReturnGeneral.getDocumentoAnulado());
		}
		
		if(this.documentoanuladoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDocumentoAnulado(this.documentoanuladoReturnGeneral.getDocumentoAnulado(),classes);//this.documentoanuladoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDocumentoAnulado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDocumentoAnulado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.RecargarFormDocumentoAnulado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDocumentoAnulado(false);
						
			if(documentoanuladoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDocumentoAnulado();
			}
			
			this.actualizarVisualTableDatosDocumentoAnulado();
			
			this.jTableDatosDocumentoAnulado.setRowSelectionInterval(this.getIndiceNuevoDocumentoAnulado(), this.getIndiceNuevoDocumentoAnulado());
			
			this.seleccionarFilaTablaDocumentoAnuladoActual();
						
			this.actualizarEstadoCeldasBotonesDocumentoAnulado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDocumentoAnulado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldnumeroDocumentoAnulado.setEnabled(isHabilitar && this.documentoanuladoConstantesFunciones.activarnumeroDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldserieDocumentoAnulado.setEnabled(isHabilitar && this.documentoanuladoConstantesFunciones.activarserieDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldautorizacionDocumentoAnulado.setEnabled(isHabilitar && this.documentoanuladoConstantesFunciones.activarautorizacionDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jDateChooserfecha_anulacionDocumentoAnulado.setEnabled(isHabilitar && this.documentoanuladoConstantesFunciones.activarfecha_anulacionDocumentoAnulado);	
		//
		this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.setEnabled(isHabilitar && this.documentoanuladoConstantesFunciones.activarid_empresaDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.setEnabled(isHabilitar && this.documentoanuladoConstantesFunciones.activarid_periodo_declaraDocumentoAnulado);//
		this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.setEnabled(isHabilitar && this.documentoanuladoConstantesFunciones.activarid_moduloDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.setEnabled(isHabilitar && this.documentoanuladoConstantesFunciones.activarid_tipo_comprobanteDocumentoAnulado);
	};
	
	public void setDefaultControlesDocumentoAnulado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDocumentoAnulado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.documentoanuladoSessionBean.setConGuardarRelaciones(true);			
			this.documentoanuladoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDocumentoAnulado.jTabbedPaneRelacionesDocumentoAnulado.setVisible(true);
			
					
		} else {
			//this.documentoanuladoSessionBean.setConGuardarRelaciones(false);			
			this.documentoanuladoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDocumentoAnulado.jTabbedPaneRelacionesDocumentoAnulado.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDocumentoAnulado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DocumentoAnulado documentoanuladoAux:this.documentoanuladoLogic.getDocumentoAnulados()) {
				if(documentoanuladoAux.getId().equals(this.iIdNuevoDocumentoAnulado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DocumentoAnulado documentoanuladoAux:this.documentoanulados) {
				if(documentoanuladoAux.getId().equals(this.iIdNuevoDocumentoAnulado)) {
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
	
	public int getIndiceActualDocumentoAnulado(DocumentoAnulado documentoanulado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DocumentoAnulado documentoanuladoAux:this.documentoanuladoLogic.getDocumentoAnulados()) {
				if(documentoanuladoAux.getId().equals(documentoanulado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DocumentoAnulado documentoanuladoAux:this.documentoanulados) {
				if(documentoanuladoAux.getId().equals(documentoanulado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDocumentoAnulado(DocumentoAnulado documentoanuladoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DocumentoAnulado documentoanuladoAux:this.documentoanuladoLogic.getDocumentoAnulados()) {
				if(documentoanuladoAux.getDocumentoAnuladoOriginal().getId().equals(documentoanuladoOriginal.getId())) {
					existe=true;
					documentoanuladoOriginal.setId(documentoanuladoAux.getId());
					documentoanuladoOriginal.setVersionRow(documentoanuladoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DocumentoAnulado documentoanuladoAux:this.documentoanulados) {
				if(documentoanuladoAux.getDocumentoAnuladoOriginal().getId().equals(documentoanuladoOriginal.getId())) {
					existe=true;
					documentoanuladoOriginal.setId(documentoanuladoAux.getId());
					documentoanuladoOriginal.setVersionRow(documentoanuladoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDocumentoAnulado(Boolean esParaCancelar) throws Exception {
		documentoanuladosAux=new ArrayList<DocumentoAnulado>();
		documentoanuladoAux=new DocumentoAnulado();
		
		if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DocumentoAnulado documentoanuladoAux:this.documentoanuladoLogic.getDocumentoAnulados()) {
					if(documentoanuladoAux.getId()<0) {
						documentoanuladosAux.add(documentoanuladoAux);
					}		
				}
				this.iIdNuevoDocumentoAnulado=0L;
				this.documentoanuladoLogic.getDocumentoAnulados().removeAll(documentoanuladosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DocumentoAnulado documentoanuladoAux:this.documentoanulados) {
					if(documentoanuladoAux.getId()<0) {
						documentoanuladosAux.add(documentoanuladoAux);
					}		
				}
				this.iIdNuevoDocumentoAnulado=0L;
				this.documentoanulados.removeAll(documentoanuladosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDocumentoAnulado 
					&& this.documentoanuladoLogic.getDocumentoAnulados().size()>0
					) {
					documentoanuladoAux=this.documentoanuladoLogic.getDocumentoAnulados().get(this.documentoanuladoLogic.getDocumentoAnulados().size() - 1);
				
					if(documentoanuladoAux.getId()<0) {
						this.documentoanuladoLogic.getDocumentoAnulados().remove(documentoanuladoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDocumentoAnulado && this.documentoanulados.size()>0) {
					documentoanuladoAux=this.documentoanulados.get(this.documentoanulados.size() - 1);
				
					if(documentoanuladoAux.getId()<0) {
						this.documentoanulados.remove(documentoanuladoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDocumentoAnulado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(documentoanulado.getId()<0) {
				this.documentoanuladoLogic.getDocumentoAnulados().remove(this.documentoanulado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(documentoanulado.getId()<0) {
				this.documentoanulados.remove(this.documentoanulado);
			}
		}			
	}
	
	public void setEstadosInicialesDocumentoAnulado(List<DocumentoAnulado> documentoanuladosAux) throws Exception {
		DocumentoAnuladoConstantesFunciones.setEstadosInicialesDocumentoAnulado(documentoanuladosAux);
	}
	
	public void setEstadosInicialesDocumentoAnulado(DocumentoAnulado documentoanuladoAux) throws Exception {
		DocumentoAnuladoConstantesFunciones.setEstadosInicialesDocumentoAnulado(documentoanuladoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDocumentoAnuladoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDocumentoAnulado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDocumentoAnuladoActual()) {
				if(!this.isEsNuevoDocumentoAnulado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDocumentoAnulado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDocumentoAnulado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDocumentoAnuladoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Documento Anulado ?", "MANTENIMIENTO DE Documento Anulado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDocumentoAnulado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DocumentoAnulado documentoanulado) throws Exception {
		DocumentoAnuladoConstantesFunciones.seleccionarAsignar(this.documentoanulado,documentoanulado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDocumentoAnulado=this.isPermisoActualizarOriginalDocumentoAnulado;
			
			
			this.seleccionarAsignar(documentoanulado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DocumentoAnuladoConstantesFunciones.quitarEspaciosDocumentoAnulado(this.documentoanulado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDocumentoAnulado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.documentoanuladoSessionBean.setsFuncionBusquedaRapida(this.documentoanuladoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDocumentoAnulado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDocumentoAnulado(esParaCancelar);				
				this.cancelarNuevoDocumentoAnulado(esParaCancelar);								
			}
			
			this.documentoanulado=new DocumentoAnulado();
			
			this.inicializarDocumentoAnulado();
			
			this.actualizarEstadoCeldasBotonesDocumentoAnulado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDocumentoAnulado() throws Exception {
		try {
			DocumentoAnuladoConstantesFunciones.inicializarDocumentoAnulado(this.documentoanulado);
			
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
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.documentoanuladoLogic.getDocumentoAnulados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDocumentoAnulados(String sAccionBusqueda,List<DocumentoAnulado> documentoanuladosParaReportes) throws Exception {
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
					sPathReporteFinal="DocumentoAnulado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DocumentoAnuladoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DocumentoAnuladoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DocumentoAnulado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Documento Anulados");		
		parameters.put("busquedapor", DocumentoAnuladoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDocumentoAnulado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DocumentoAnuladoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DocumentoAnuladoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDocumentoAnulado=new JRBeanArrayDataSource(DocumentoAnuladoJInternalFrame.TraerDocumentoAnuladoBeans(documentoanuladosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDocumentoAnulado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DocumentoAnuladoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DocumentoAnuladoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DocumentoAnuladoBean.TraerDocumentoAnuladoBeans(documentoanuladosParaReportes).toArray()));
							
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
				this.generarExcelReporteDocumentoAnulados(sAccionBusqueda,sTipoArchivoReporte,documentoanuladosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDocumentoAnulados(sAccionBusqueda,sTipoArchivoReporte,documentoanuladosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDocumentoAnuladoActionPerformed(null);
					//this.generarExcelReporteDocumentoAnulados(sAccionBusqueda,sTipoArchivoReporte,documentoanuladosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDocumentoAnulados(sAccionBusqueda,sTipoArchivoReporte,documentoanuladosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDocumentoAnulados(sAccionBusqueda,sTipoArchivoReporte,documentoanuladosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDocumentoAnulados(sAccionBusqueda,sTipoArchivoReporte,documentoanuladosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDocumentoAnulados(String sAccionBusqueda,String sTipoArchivoReporte,List<DocumentoAnulado> documentoanuladosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"documentoanulado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DocumentoAnulados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDocumentoAnulado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DocumentoAnulado documentoanulado : documentoanuladosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DocumentoAnuladoConstantesFunciones.generarExcelReporteDataDocumentoAnulado("NORMAL",row,workbook,documentoanulado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Documento Anulado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDocumentoAnulado(String sTipo,Row row,Workbook workbook) {
		
		DocumentoAnuladoConstantesFunciones.generarExcelReporteHeaderDocumentoAnulado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDocumentoAnulados(String sAccionBusqueda,String sTipoArchivoReporte,List<DocumentoAnulado> documentoanuladosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"documentoanulado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DocumentoAnulados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DocumentoAnulado documentoanulado : documentoanuladosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DocumentoAnuladoConstantesFunciones.getDocumentoAnuladoDescripcion(documentoanulado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(documentoanulado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(documentoanulado.getperiododeclara_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(documentoanulado.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(documentoanulado.gettipocomprobante_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DocumentoAnuladoConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(documentoanulado.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DocumentoAnuladoConstantesFunciones.LABEL_SERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_SERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(documentoanulado.getserie());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(documentoanulado.getautorizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(documentoanulado.getfecha_anulacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Documento Anulado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDocumentoAnulados(String sAccionBusqueda,String sTipoArchivoReporte,List<DocumentoAnulado> documentoanuladosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DocumentoAnulado> documentoanuladosRespaldo=null;
		
		classes=DocumentoAnuladoConstantesFunciones.getClassesRelationshipsOfDocumentoAnulado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.documentoanuladoLogic.setDatosCliente(this.datosCliente);
		this.documentoanuladoLogic.setDatosDeep(this.datosDeep);
		this.documentoanuladoLogic.setIsConDeep(true);
		
		documentoanuladosRespaldo=this.documentoanuladoLogic.getDocumentoAnulados();
		
		this.documentoanuladoLogic.setDocumentoAnulados(documentoanuladosParaReportes);	
		this.documentoanuladoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		documentoanuladosParaReportes=this.documentoanuladoLogic.getDocumentoAnulados();
		this.documentoanuladoLogic.setDocumentoAnulados(documentoanuladosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"documentoanulado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DocumentoAnulados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDocumentoAnulado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DocumentoAnulado documentoanulado : documentoanuladosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDocumentoAnulado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DocumentoAnuladoConstantesFunciones.generarExcelReporteDataDocumentoAnulado("NORMAL",row,workbook,documentoanulado,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DocumentoAnuladoConstantesFunciones.getDocumentoAnuladoDescripcion(documentoanulado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Documento Anulado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDocumentoAnulado() throws Exception {		
		this.startProcessDocumentoAnulado(true);
	}
	
	public void startProcessDocumentoAnulado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDocumentoAnulado ,this.jPanelParametrosReportesDocumentoAnulado, this.jScrollPanelDatosDocumentoAnulado,this.jPanelPaginacionDocumentoAnulado, this.jScrollPanelDatosEdicionDocumentoAnulado, this.jPanelAccionesDocumentoAnulado,this.jPanelAccionesFormularioDocumentoAnulado,this.jmenuBarDocumentoAnulado,this.jmenuBarDetalleDocumentoAnulado,this.jTtoolBarDocumentoAnulado,this.jTtoolBarDetalleDocumentoAnulado);		
		
		final JTabbedPane jTabbedPaneBusquedasDocumentoAnulado=this.jTabbedPaneBusquedasDocumentoAnulado; 
		
		final JPanel jPanelParametrosReportesDocumentoAnulado=this.jPanelParametrosReportesDocumentoAnulado;
		//final JScrollPane jScrollPanelDatosDocumentoAnulado=this.jScrollPanelDatosDocumentoAnulado;
		final JTable jTableDatosDocumentoAnulado=this.jTableDatosDocumentoAnulado;		
		final JPanel jPanelPaginacionDocumentoAnulado=this.jPanelPaginacionDocumentoAnulado;
		//final JScrollPane jScrollPanelDatosEdicionDocumentoAnulado=this.jScrollPanelDatosEdicionDocumentoAnulado;
		final JPanel jPanelAccionesDocumentoAnulado=this.jPanelAccionesDocumentoAnulado;
		
		JPanel jPanelCamposAuxiliarDocumentoAnulado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDocumentoAnulado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			jPanelCamposAuxiliarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jPanelCamposDocumentoAnulado;
			jPanelAccionesFormularioAuxiliarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jPanelAccionesFormularioDocumentoAnulado;
		}
		
		final JPanel jPanelCamposDocumentoAnulado=jPanelCamposAuxiliarDocumentoAnulado;
		final JPanel jPanelAccionesFormularioDocumentoAnulado=jPanelAccionesFormularioAuxiliarDocumentoAnulado;
		
		
		final JMenuBar jmenuBarDocumentoAnulado=this.jmenuBarDocumentoAnulado;
		final JToolBar jTtoolBarDocumentoAnulado=this.jTtoolBarDocumentoAnulado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDocumentoAnulado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDocumentoAnulado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			jmenuBarDetalleAuxiliarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jmenuBarDetalleDocumentoAnulado;
			jTtoolBarDetalleAuxiliarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jTtoolBarDetalleDocumentoAnulado;
		}
		
		final JMenuBar jmenuBarDetalleDocumentoAnulado=jmenuBarDetalleAuxiliarDocumentoAnulado;
		final JToolBar jTtoolBarDetalleDocumentoAnulado=jTtoolBarDetalleAuxiliarDocumentoAnulado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDocumentoAnulado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDocumentoAnulado;
			processRunnable.jTableDatos=jTableDatosDocumentoAnulado;
			processRunnable.jPanelCampos=jPanelCamposDocumentoAnulado;
			processRunnable.jPanelPaginacion=jPanelPaginacionDocumentoAnulado;
			processRunnable.jPanelAcciones=jPanelAccionesDocumentoAnulado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDocumentoAnulado;
			
			
			processRunnable.jmenuBar=jmenuBarDocumentoAnulado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDocumentoAnulado;
			processRunnable.jTtoolBar=jTtoolBarDocumentoAnulado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDocumentoAnulado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDocumentoAnulado ,jPanelParametrosReportesDocumentoAnulado,jTableDatosDocumentoAnulado, /*jScrollPanelDatosDocumentoAnulado,*/jPanelCamposDocumentoAnulado,jPanelPaginacionDocumentoAnulado, /*jScrollPanelDatosEdicionDocumentoAnulado,*/ jPanelAccionesDocumentoAnulado,jPanelAccionesFormularioDocumentoAnulado,jmenuBarDocumentoAnulado,jmenuBarDetalleDocumentoAnulado,jTtoolBarDocumentoAnulado,jTtoolBarDetalleDocumentoAnulado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDocumentoAnulado ,jPanelParametrosReportesDocumentoAnulado, jScrollPanelDatosDocumentoAnulado,jPanelPaginacionDocumentoAnulado, jScrollPanelDatosEdicionDocumentoAnulado, jPanelAccionesDocumentoAnulado,jPanelAccionesFormularioDocumentoAnulado,jmenuBarDocumentoAnulado,jmenuBarDetalleDocumentoAnulado,jTtoolBarDocumentoAnulado,jTtoolBarDetalleDocumentoAnulado);
						
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
	
	public void finishProcessDocumentoAnulado() {// throws Exception 
		this.finishProcessDocumentoAnulado(true);
	}
	
	public void finishProcessDocumentoAnulado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDocumentoAnulado ,this.jPanelParametrosReportesDocumentoAnulado, this.jScrollPanelDatosDocumentoAnulado,this.jPanelPaginacionDocumentoAnulado, this.jScrollPanelDatosEdicionDocumentoAnulado, this.jPanelAccionesDocumentoAnulado,this.jPanelAccionesFormularioDocumentoAnulado,this.jmenuBarDocumentoAnulado,this.jmenuBarDetalleDocumentoAnulado,this.jTtoolBarDocumentoAnulado,this.jTtoolBarDetalleDocumentoAnulado);		
		
		final JTabbedPane jTabbedPaneBusquedasDocumentoAnulado=this.jTabbedPaneBusquedasDocumentoAnulado; 
		
		final JPanel jPanelParametrosReportesDocumentoAnulado=this.jPanelParametrosReportesDocumentoAnulado;
		//final JScrollPane jScrollPanelDatosDocumentoAnulado=this.jScrollPanelDatosDocumentoAnulado;
		final JTable jTableDatosDocumentoAnulado=this.jTableDatosDocumentoAnulado;		
		final JPanel jPanelPaginacionDocumentoAnulado=this.jPanelPaginacionDocumentoAnulado;
		//final JScrollPane jScrollPanelDatosEdicionDocumentoAnulado=this.jScrollPanelDatosEdicionDocumentoAnulado;
		final JPanel jPanelAccionesDocumentoAnulado=this.jPanelAccionesDocumentoAnulado;
		
		JPanel jPanelCamposAuxiliarDocumentoAnulado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDocumentoAnulado=new JPanel();
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			jPanelCamposAuxiliarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jPanelCamposDocumentoAnulado;
			jPanelAccionesFormularioAuxiliarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jPanelAccionesFormularioDocumentoAnulado;
		}
		
		final JPanel jPanelCamposDocumentoAnulado=jPanelCamposAuxiliarDocumentoAnulado;
		final JPanel jPanelAccionesFormularioDocumentoAnulado=jPanelAccionesFormularioAuxiliarDocumentoAnulado;
		
		
		final JMenuBar jmenuBarDocumentoAnulado=this.jmenuBarDocumentoAnulado;		
		final JToolBar jTtoolBarDocumentoAnulado=this.jTtoolBarDocumentoAnulado;
				
		JMenuBar jmenuBarDetalleAuxiliarDocumentoAnulado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDocumentoAnulado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			jmenuBarDetalleAuxiliarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jmenuBarDetalleDocumentoAnulado;
			jTtoolBarDetalleAuxiliarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jTtoolBarDetalleDocumentoAnulado;		
		}
		
		final JMenuBar jmenuBarDetalleDocumentoAnulado=jmenuBarDetalleAuxiliarDocumentoAnulado;
		final JToolBar jTtoolBarDetalleDocumentoAnulado=jTtoolBarDetalleAuxiliarDocumentoAnulado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDocumentoAnulado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDocumentoAnulado;
			processRunnable.jTableDatos=jTableDatosDocumentoAnulado;
			processRunnable.jPanelCampos=jPanelCamposDocumentoAnulado;
			processRunnable.jPanelPaginacion=jPanelPaginacionDocumentoAnulado;
			processRunnable.jPanelAcciones=jPanelAccionesDocumentoAnulado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDocumentoAnulado;
			
			
			processRunnable.jmenuBar=jmenuBarDocumentoAnulado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDocumentoAnulado;
			processRunnable.jTtoolBar=jTtoolBarDocumentoAnulado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDocumentoAnulado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDocumentoAnulado ,jPanelParametrosReportesDocumentoAnulado, jTableDatosDocumentoAnulado,/*jScrollPanelDatosDocumentoAnulado,*/jPanelCamposDocumentoAnulado,jPanelPaginacionDocumentoAnulado, /*jScrollPanelDatosEdicionDocumentoAnulado,*/ jPanelAccionesDocumentoAnulado,jPanelAccionesFormularioDocumentoAnulado,jmenuBarDocumentoAnulado,jmenuBarDetalleDocumentoAnulado,jTtoolBarDocumentoAnulado,jTtoolBarDetalleDocumentoAnulado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDocumentoAnulado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDocumentoAnulado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDocumentoAnulado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDocumentoAnulado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDocumentoAnulado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDocumentoAnulado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDocumentoAnulado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDocumentoAnulado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDocumentoAnulado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.documentoanuladoConstantesFunciones.getsFinalQueryDocumentoAnulado();
		String  finalQueryPaginacionTodos=this.documentoanuladoConstantesFunciones.getsFinalQueryDocumentoAnulado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DocumentoAnuladoConstantesFunciones.getArrayColumnasGlobalesNoDocumentoAnulado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DocumentoAnuladoConstantesFunciones.getArrayColumnasGlobalesDocumentoAnulado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DocumentoAnuladoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.documentoanuladosEliminados= new ArrayList<DocumentoAnulado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDocumentoAnulado();
		
				///*DocumentoAnuladoSessionBean*/this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
			
			if(this.documentoanuladoSessionBean==null) {
				this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
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
					this.iNumeroPaginacion=DocumentoAnuladoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DocumentoAnuladoConstantesFunciones.getClassesForeignKeysOfDocumentoAnulado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/documentoanulado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			documentoanuladosAux= new ArrayList<DocumentoAnulado>();
			
				
			documentoanuladoLogic.setDatosCliente(this.datosCliente);
			documentoanuladoLogic.setDatosDeep(this.datosDeep);
			documentoanuladoLogic.setIsConDeep(true);
			
			
			documentoanuladoLogic.getDocumentoAnuladoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					documentoanuladoLogic.getTodosDocumentoAnulados(finalQueryGlobal,pagination);
					
					//documentoanuladoLogic.getTodosDocumentoAnuladosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(documentoanuladoLogic.getDocumentoAnulados()==null|| documentoanuladoLogic.getDocumentoAnulados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							documentoanuladosAux= new ArrayList<DocumentoAnulado>();
							documentoanuladosAux.addAll(documentoanuladoLogic.getDocumentoAnulados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							documentoanuladosAux= new ArrayList<DocumentoAnulado>();
							documentoanuladosAux.addAll(documentoanulados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							documentoanuladoLogic.getTodosDocumentoAnulados(finalQueryGlobal+"",this.pagination);												
							
							//documentoanuladoLogic.getTodosDocumentoAnuladosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDocumentoAnulados("Todos",documentoanuladoLogic.getDocumentoAnulados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							documentoanuladoLogic.setDocumentoAnulados(new ArrayList<DocumentoAnulado>());					
							documentoanuladoLogic.getDocumentoAnulados().addAll(documentoanuladosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							documentoanulados=new ArrayList<DocumentoAnulado>();
							documentoanulados.addAll(documentoanuladosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDocumentoAnulado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDocumentoAnulado=this.idActual;
				
				} else if(this.idDocumentoAnuladoActual!=null && this.idDocumentoAnuladoActual!=0L) {
					idDocumentoAnulado=idDocumentoAnuladoActual;
				}
				
					
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndicePorId(idDocumentoAnulado);
				
				this.documentoanulados=new ArrayList<DocumentoAnulado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					documentoanuladoLogic.getEntity(idDocumentoAnulado);
					
					//documentoanuladoLogic.getEntityWithConnection(idDocumentoAnulado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					documentoanuladoLogic.setDocumentoAnulados(new ArrayList<DocumentoAnulado>());
					documentoanuladoLogic.getDocumentoAnulados().add(documentoanuladoLogic.getDocumentoAnulado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.documentoanulados=new ArrayList<DocumentoAnulado>();
					this.documentoanulados.add(documentoanulado);
				}
				
				if(documentoanuladoLogic.getDocumentoAnulado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					documentoanuladoLogic.getDocumentoAnuladosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=documentoanuladoLogic.getDocumentoAnulados()==null||documentoanuladoLogic.getDocumentoAnulados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=documentoanulados==null|| documentoanulados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladosAux=new ArrayList<DocumentoAnulado>();
						documentoanuladosAux.addAll(documentoanuladoLogic.getDocumentoAnulados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							documentoanuladosAux=new ArrayList<DocumentoAnulado>();
							documentoanuladosAux.addAll(documentoanulados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							documentoanuladoLogic.getDocumentoAnuladosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDocumentoAnulados("FK_IdEmpresa",documentoanuladoLogic.getDocumentoAnulados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDocumentoAnulados("FK_IdEmpresa",documentoanulados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladoLogic.setDocumentoAnulados(new ArrayList<DocumentoAnulado>());
						documentoanuladoLogic.getDocumentoAnulados().addAll(documentoanuladosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							documentoanulados=new ArrayList<DocumentoAnulado>();
							documentoanulados.addAll(documentoanuladosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					documentoanuladoLogic.getDocumentoAnuladosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=documentoanuladoLogic.getDocumentoAnulados()==null||documentoanuladoLogic.getDocumentoAnulados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=documentoanulados==null|| documentoanulados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladosAux=new ArrayList<DocumentoAnulado>();
						documentoanuladosAux.addAll(documentoanuladoLogic.getDocumentoAnulados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							documentoanuladosAux=new ArrayList<DocumentoAnulado>();
							documentoanuladosAux.addAll(documentoanulados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							documentoanuladoLogic.getDocumentoAnuladosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDocumentoAnulados("FK_IdModulo",documentoanuladoLogic.getDocumentoAnulados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDocumentoAnulados("FK_IdModulo",documentoanulados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladoLogic.setDocumentoAnulados(new ArrayList<DocumentoAnulado>());
						documentoanuladoLogic.getDocumentoAnulados().addAll(documentoanuladosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							documentoanulados=new ArrayList<DocumentoAnulado>();
							documentoanulados.addAll(documentoanuladosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodoDeclara")) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					documentoanuladoLogic.getDocumentoAnuladosFK_IdPeriodoDeclara(finalQueryGlobal,pagination,id_periodo_declaraFK_IdPeriodoDeclara);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=documentoanuladoLogic.getDocumentoAnulados()==null||documentoanuladoLogic.getDocumentoAnulados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=documentoanulados==null|| documentoanulados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladosAux=new ArrayList<DocumentoAnulado>();
						documentoanuladosAux.addAll(documentoanuladoLogic.getDocumentoAnulados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							documentoanuladosAux=new ArrayList<DocumentoAnulado>();
							documentoanuladosAux.addAll(documentoanulados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							documentoanuladoLogic.getDocumentoAnuladosFK_IdPeriodoDeclara(finalQueryGlobal,pagination,id_periodo_declaraFK_IdPeriodoDeclara);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDocumentoAnulados("FK_IdPeriodoDeclara",documentoanuladoLogic.getDocumentoAnulados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDocumentoAnulados("FK_IdPeriodoDeclara",documentoanulados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladoLogic.setDocumentoAnulados(new ArrayList<DocumentoAnulado>());
						documentoanuladoLogic.getDocumentoAnulados().addAll(documentoanuladosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							documentoanulados=new ArrayList<DocumentoAnulado>();
							documentoanulados.addAll(documentoanuladosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoComprobante")) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdTipoComprobante(id_tipo_comprobanteFK_IdTipoComprobante);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					documentoanuladoLogic.getDocumentoAnuladosFK_IdTipoComprobante(finalQueryGlobal,pagination,id_tipo_comprobanteFK_IdTipoComprobante);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdTipoComprobante(id_tipo_comprobanteFK_IdTipoComprobante);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdTipoComprobante(id_tipo_comprobanteFK_IdTipoComprobante);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=documentoanuladoLogic.getDocumentoAnulados()==null||documentoanuladoLogic.getDocumentoAnulados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=documentoanulados==null|| documentoanulados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladosAux=new ArrayList<DocumentoAnulado>();
						documentoanuladosAux.addAll(documentoanuladoLogic.getDocumentoAnulados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							documentoanuladosAux=new ArrayList<DocumentoAnulado>();
							documentoanuladosAux.addAll(documentoanulados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							documentoanuladoLogic.getDocumentoAnuladosFK_IdTipoComprobante(finalQueryGlobal,pagination,id_tipo_comprobanteFK_IdTipoComprobante);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdTipoComprobante(id_tipo_comprobanteFK_IdTipoComprobante);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DocumentoAnuladoConstantesFunciones.getDetalleIndiceFK_IdTipoComprobante(id_tipo_comprobanteFK_IdTipoComprobante);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDocumentoAnulados("FK_IdTipoComprobante",documentoanuladoLogic.getDocumentoAnulados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDocumentoAnulados("FK_IdTipoComprobante",documentoanulados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladoLogic.setDocumentoAnulados(new ArrayList<DocumentoAnulado>());
						documentoanuladoLogic.getDocumentoAnulados().addAll(documentoanuladosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							documentoanulados=new ArrayList<DocumentoAnulado>();
							documentoanulados.addAll(documentoanuladosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDocumentoAnulado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDocumentoAnulado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=documentoanuladoLogic.getDocumentoAnulados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=documentoanulados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=documentoanuladoLogic.getDocumentoAnulados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=documentoanulados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DocumentoAnulado documentoanulado) {
		Boolean permite=true;
		
		if(this.documentoanulado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DocumentoAnuladoConstantesFunciones.getOrderByListaDocumentoAnulado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DocumentoAnuladoConstantesFunciones.getOrderByListaDocumentoAnulado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DocumentoAnulado documentoanulado:documentoanuladoLogic.getDocumentoAnulados()) {
				if(documentoanulado.getsType().equals(Constantes2.S_TOTALES)) {
					documentoanuladoTotales=documentoanulado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DocumentoAnulado documentoanulado:this.documentoanulados) {
				if(documentoanulado.getsType().equals(Constantes2.S_TOTALES)) {
					documentoanuladoTotales=documentoanulado;
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
			this.documentoanuladoAux=new DocumentoAnulado();
			this.documentoanuladoAux.setsType(Constantes2.S_TOTALES);
			this.documentoanuladoAux.setIsNew(false);
			this.documentoanuladoAux.setIsChanged(false);
			this.documentoanuladoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DocumentoAnuladoConstantesFunciones.TotalizarValoresFilaDocumentoAnulado(this.documentoanuladoLogic.getDocumentoAnulados(),this.documentoanuladoAux);
				
				this.documentoanuladoLogic.getDocumentoAnulados().add(this.documentoanuladoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DocumentoAnuladoConstantesFunciones.TotalizarValoresFilaDocumentoAnulado(this.documentoanulados,this.documentoanuladoAux);
				
				this.documentoanulados.add(this.documentoanuladoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		documentoanuladoTotales=new DocumentoAnulado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.documentoanuladoLogic.getDocumentoAnulados().remove(documentoanuladoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.documentoanulados.remove(documentoanuladoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		documentoanuladoTotales=new DocumentoAnulado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DocumentoAnulado documentoanulado:documentoanuladoLogic.getDocumentoAnulados()) {
				if(documentoanulado.getsType().equals(Constantes2.S_TOTALES)) {
					documentoanuladoTotales=documentoanulado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DocumentoAnuladoConstantesFunciones.TotalizarValoresFilaDocumentoAnulado(this.documentoanuladoLogic.getDocumentoAnulados(),documentoanuladoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DocumentoAnulado documentoanulado:this.documentoanulados) {
				if(documentoanulado.getsType().equals(Constantes2.S_TOTALES)) {
					documentoanuladoTotales=documentoanulado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DocumentoAnuladoConstantesFunciones.TotalizarValoresFilaDocumentoAnulado(this.documentoanulados,documentoanuladoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDocumentoAnuladosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDocumentoAnuladosFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDocumentoAnuladosFK_IdPeriodoDeclara()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodoDeclara";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDocumentoAnuladosFK_IdTipoComprobante()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoComprobante";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDocumentoAnuladosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					documentoanuladoLogic.getDocumentoAnuladosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDocumentoAnuladosFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					documentoanuladoLogic.getDocumentoAnuladosFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDocumentoAnuladosFK_IdPeriodoDeclara(String sFinalQuery,Long id_periodo_declara)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					documentoanuladoLogic.getDocumentoAnuladosFK_IdPeriodoDeclara(sFinalQuery,this.pagination,id_periodo_declara);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDocumentoAnuladosFK_IdTipoComprobante(String sFinalQuery,Long id_tipo_comprobante)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					documentoanuladoLogic.getDocumentoAnuladosFK_IdTipoComprobante(sFinalQuery,this.pagination,id_tipo_comprobante);
				
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
	
	public void inicializarPermisosDocumentoAnulado() {
		this.isPermisoTodoDocumentoAnulado=false;
		this.isPermisoNuevoDocumentoAnulado=false;
		this.isPermisoActualizarDocumentoAnulado=false;
		this.isPermisoActualizarOriginalDocumentoAnulado=false;
		this.isPermisoEliminarDocumentoAnulado=false;
		this.isPermisoGuardarCambiosDocumentoAnulado=false;
		this.isPermisoConsultaDocumentoAnulado=false;
		this.isPermisoBusquedaDocumentoAnulado=false;
		this.isPermisoReporteDocumentoAnulado=false;		
		this.isPermisoOrdenDocumentoAnulado=false;		
		this.isPermisoPaginacionMedioDocumentoAnulado=false;		
		this.isPermisoPaginacionAltoDocumentoAnulado=false;
		this.isPermisoPaginacionTodoDocumentoAnulado=false;
		this.isPermisoCopiarDocumentoAnulado=false;		
		this.isPermisoVerFormDocumentoAnulado=false;		
		this.isPermisoDuplicarDocumentoAnulado=false;		
		this.isPermisoOrdenDocumentoAnulado=false;		
	}
	
	public void setPermisosUsuarioDocumentoAnulado(Boolean isPermiso) {
		this.isPermisoTodoDocumentoAnulado=isPermiso;
		this.isPermisoNuevoDocumentoAnulado=isPermiso;
		this.isPermisoActualizarDocumentoAnulado=isPermiso;
		this.isPermisoActualizarOriginalDocumentoAnulado=isPermiso;
		this.isPermisoEliminarDocumentoAnulado=isPermiso;
		this.isPermisoGuardarCambiosDocumentoAnulado=isPermiso;
		this.isPermisoConsultaDocumentoAnulado=isPermiso;
		this.isPermisoBusquedaDocumentoAnulado=isPermiso;
		this.isPermisoReporteDocumentoAnulado=isPermiso;
		this.isPermisoOrdenDocumentoAnulado=isPermiso;		
		this.isPermisoPaginacionMedioDocumentoAnulado=isPermiso;		
		this.isPermisoPaginacionAltoDocumentoAnulado=isPermiso;		
		this.isPermisoPaginacionTodoDocumentoAnulado=isPermiso;		
		this.isPermisoCopiarDocumentoAnulado=isPermiso;		
		this.isPermisoVerFormDocumentoAnulado=isPermiso;		
		this.isPermisoDuplicarDocumentoAnulado=isPermiso;
		this.isPermisoOrdenDocumentoAnulado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDocumentoAnulado(Boolean isPermiso) {
		//this.isPermisoTodoDocumentoAnulado=isPermiso;
		this.isPermisoNuevoDocumentoAnulado=isPermiso;
		this.isPermisoActualizarDocumentoAnulado=isPermiso;
		this.isPermisoActualizarOriginalDocumentoAnulado=isPermiso;
		this.isPermisoEliminarDocumentoAnulado=isPermiso;
		this.isPermisoGuardarCambiosDocumentoAnulado=isPermiso;
		//this.isPermisoConsultaDocumentoAnulado=isPermiso;
		//this.isPermisoBusquedaDocumentoAnulado=isPermiso;
		//this.isPermisoReporteDocumentoAnulado=isPermiso;
		//this.isPermisoOrdenDocumentoAnulado=isPermiso;		
		//this.isPermisoPaginacionMedioDocumentoAnulado=isPermiso;		
		//this.isPermisoPaginacionAltoDocumentoAnulado=isPermiso;		
		//this.isPermisoPaginacionTodoDocumentoAnulado=isPermiso;		
		//this.isPermisoCopiarDocumentoAnulado=isPermiso;		
		//this.isPermisoDuplicarDocumentoAnulado=isPermiso;
		//this.isPermisoOrdenDocumentoAnulado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDocumentoAnuladoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DocumentoAnuladoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDocumentoAnulado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDocumentoAnuladoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDocumentoAnuladoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDocumentoAnuladoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDocumentoAnuladoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDocumentoAnulado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DocumentoAnuladoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DocumentoAnuladoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDocumentoAnulado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDocumentoAnulado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDocumentoAnulado=this.isPermisoActualizarDocumentoAnulado;
			this.isPermisoEliminarDocumentoAnulado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDocumentoAnulado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDocumentoAnulado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDocumentoAnulado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDocumentoAnulado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDocumentoAnulado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDocumentoAnulado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDocumentoAnulado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDocumentoAnulado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDocumentoAnulado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDocumentoAnulado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDocumentoAnulado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDocumentoAnulado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDocumentoAnulado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDocumentoAnulado.setToolTipText(this.jTableDatosDocumentoAnulado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDocumentoAnulado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDocumentoAnulado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DocumentoAnuladoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DocumentoAnuladoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDocumentoAnulado() throws Exception {
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
	public void inicializarCombosForeignKeyDocumentoAnuladoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.periododeclarasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.tipocomprobantesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDocumentoAnuladoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DocumentoAnuladoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDocumentoAnuladoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoDeclaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoComprobanteListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPeriodoDeclaraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periododeclarasForeignKey==null||this.periododeclarasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoDeclaraConstantesFunciones.getArrayColumnasGlobalesPeriodoDeclara(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoDeclaraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoDeclaraConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodoDeclarasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyTipoComprobanteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocomprobantesForeignKey==null||this.tipocomprobantesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoComprobanteConstantesFunciones.getArrayColumnasGlobalesTipoComprobante(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoComprobanteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoComprobanteConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoComprobantesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDocumentoAnuladoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DocumentoAnuladoParameterReturnGeneral documentoanuladoReturnGeneral=new DocumentoAnuladoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.documentoanuladoConstantesFunciones.cargarid_empresaDocumentoAnulado)
					 || (this.esRecargarFks && this.documentoanuladoConstantesFunciones.cargarid_empresaDocumentoAnulado)) {

					if(!this.documentoanuladoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+documentoanuladoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalPeriodoDeclara="";

				if(((this.periododeclarasForeignKey==null||this.periododeclarasForeignKey.size()<=0) && this.documentoanuladoConstantesFunciones.cargarid_periodo_declaraDocumentoAnulado)
					 || (this.esRecargarFks && this.documentoanuladoConstantesFunciones.cargarid_periodo_declaraDocumentoAnulado)) {

					if(!this.documentoanuladoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoDeclaraConstantesFunciones.getArrayColumnasGlobalesPeriodoDeclara(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodoDeclara=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoDeclaraConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodoDeclara=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodoDeclara, "");
						finalQueryGlobalPeriodoDeclara+=PeriodoDeclaraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodoDeclarasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodoDeclara=" WHERE " + ConstantesSql.ID + "="+documentoanuladoSessionBean.getlidPeriodoDeclaraActual();
					}
				} else {
					finalQueryGlobalPeriodoDeclara="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.documentoanuladoConstantesFunciones.cargarid_moduloDocumentoAnulado)
					 || (this.esRecargarFks && this.documentoanuladoConstantesFunciones.cargarid_moduloDocumentoAnulado)) {

					if(!this.documentoanuladoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+documentoanuladoSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTipoComprobante="";

				if(((this.tipocomprobantesForeignKey==null||this.tipocomprobantesForeignKey.size()<=0) && this.documentoanuladoConstantesFunciones.cargarid_tipo_comprobanteDocumentoAnulado)
					 || (this.esRecargarFks && this.documentoanuladoConstantesFunciones.cargarid_tipo_comprobanteDocumentoAnulado)) {

					if(!this.documentoanuladoSessionBean.getisBusquedaDesdeForeignKeySesionTipoComprobante()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoComprobanteConstantesFunciones.getArrayColumnasGlobalesTipoComprobante(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoComprobante=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoComprobanteConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoComprobante=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoComprobante, "");
						finalQueryGlobalTipoComprobante+=TipoComprobanteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoComprobantesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoComprobante=" WHERE " + ConstantesSql.ID + "="+documentoanuladoSessionBean.getlidTipoComprobanteActual();
					}
				} else {
					finalQueryGlobalTipoComprobante="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				documentoanuladoReturnGeneral=documentoanuladoLogic.cargarCombosLoteForeignKeyDocumentoAnulado(finalQueryGlobalEmpresa,finalQueryGlobalPeriodoDeclara,finalQueryGlobalModulo,finalQueryGlobalTipoComprobante);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=documentoanuladoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalPeriodoDeclara.equals("NONE")) {
				this.periododeclarasForeignKey=documentoanuladoReturnGeneral.getperiododeclarasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=documentoanuladoReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTipoComprobante.equals("NONE")) {
				this.tipocomprobantesForeignKey=documentoanuladoReturnGeneral.gettipocomprobantesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDocumentoAnulado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyPeriodoDeclara();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTipoComprobante();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.documentoanuladoSessionBean==null) {
				this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
			}

			if(!this.documentoanuladoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyPeriodoDeclara()throws Exception {
		try {

			if(!this.documentoanuladoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {
				PeriodoDeclara periododeclara=new PeriodoDeclara();
				PeriodoDeclaraConstantesFunciones.setPeriodoDeclaraDescripcion(periododeclara,Constantes.SMENSAJE_ESCOJA_OPCION);
				periododeclara.setId(null);

				if(!PeriodoDeclaraConstantesFunciones.ExisteEnLista(this.periododeclarasForeignKey,periododeclara,true)) {

					this.periododeclarasForeignKey.add(0,periododeclara);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.documentoanuladoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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

	public void addItemDefectoCombosForeignKeyTipoComprobante()throws Exception {
		try {

			if(!this.documentoanuladoSessionBean.getisBusquedaDesdeForeignKeySesionTipoComprobante()) {
				TipoComprobante tipocomprobante=new TipoComprobante();
				TipoComprobanteConstantesFunciones.setTipoComprobanteDescripcion(tipocomprobante,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocomprobante.setId(null);

				if(!TipoComprobanteConstantesFunciones.ExisteEnLista(this.tipocomprobantesForeignKey,tipocomprobante,true)) {

					this.tipocomprobantesForeignKey.add(0,tipocomprobante);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDocumentoAnulado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDocumentoAnulado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDocumentoAnulado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualModuloForeignKey(this.moduloActual.getId(),false,"Formulario");
			
			
				this.documentoanulado.setfecha_anulacion(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDocumentoAnulado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDocumentoAnulado(DocumentoAnulado documentoanulado)throws Exception {	
		try {
			
			this.setActualPeriodoDeclaraForeignKey(documentoanulado.getid_periodo_declara(),false,"Formulario");
			this.setActualTipoComprobanteForeignKey(documentoanulado.getid_tipo_comprobante(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDocumentoAnulado(DocumentoAnulado documentoanulado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDocumentoAnulado()throws Exception {	
		try {
			
			this.setActualPeriodoDeclaraForeignKey(this.documentoanuladoConstantesFunciones.getid_periodo_declara(),false,"Formulario");
			this.setActualTipoComprobanteForeignKey(this.documentoanuladoConstantesFunciones.getid_tipo_comprobante(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDocumentoAnulado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDocumentoAnulado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDocumentoAnulado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDocumentoAnulado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDocumentoAnulado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFramePeriodoDeclarasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTipoComprobantesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDocumentoAnulado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodoDeclarasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoComprobantesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDocumentoAnulado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public DocumentoAnuladoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DocumentoAnuladoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DocumentoAnuladoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean(); 
		this.documentoanuladoConstantesFunciones=new DocumentoAnuladoConstantesFunciones(); 
		this.documentoanuladoBean=new DocumentoAnulado();//(this.documentoanuladoConstantesFunciones); 		
		this.documentoanuladoReturnGeneral=new DocumentoAnuladoParameterReturnGeneral(); 
		
		this.documentoanuladoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.documentoanuladoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DocumentoAnuladoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DocumentoAnuladoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DocumentoAnuladoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDocumentoAnulado(true);
			
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
			
			this.documentoanuladoConstantesFunciones=new DocumentoAnuladoConstantesFunciones(); 
			this.documentoanuladoBean=new DocumentoAnulado();//this.documentoanuladoConstantesFunciones); 			
			this.documentoanuladoReturnGeneral=new DocumentoAnuladoParameterReturnGeneral(); 
		
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Documento Anulado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.documentoanulado=new DocumentoAnulado();
			this.documentoanulados = new ArrayList<DocumentoAnulado>();
			this.documentoanuladosAux = new ArrayList<DocumentoAnulado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic=new DocumentoAnuladoLogic();
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}
			
			//this.documentoanuladoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.documentoanuladoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDocumentoAnulado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDocumentoAnulado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDocumentoAnulado);	
					}
					
					if(this.jInternalFrameImportacionDocumentoAnulado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDocumentoAnulado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDocumentoAnulado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDocumentoAnulado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDocumentoAnulado);
				this.jInternalFrameDetalleFormDocumentoAnulado.setVisible(false);
				this.jInternalFrameDetalleFormDocumentoAnulado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDocumentoAnulado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDocumentoAnulado);
					this.jInternalFrameReporteDinamicoDocumentoAnulado.setVisible(false);
					this.jInternalFrameReporteDinamicoDocumentoAnulado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDocumentoAnulado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDocumentoAnulado);
					this.jInternalFrameImportacionDocumentoAnulado.setVisible(false);
					this.jInternalFrameImportacionDocumentoAnulado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDocumentoAnulado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDocumentoAnulado);
					this.jInternalFrameOrderByDocumentoAnulado.setVisible(false);
					this.jInternalFrameOrderByDocumentoAnulado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDocumentoAnuladoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DocumentoAnuladoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.documentoanuladoReturnGeneral=new DocumentoAnuladoParameterReturnGeneral();
			
			this.documentoanuladoParameterGeneral=new DocumentoAnuladoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.documentoanuladoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DocumentoAnuladoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DocumentoAnuladoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.documentoanuladoSessionBean.getEsGuardarRelacionado(),this.documentoanuladoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DocumentoAnuladoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.documentoanuladoSessionBean.getEsGuardarRelacionado(),this.documentoanuladoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDocumentoAnulado=false;
			this.isVisibilidadCeldaDuplicarDocumentoAnulado=true;
			this.isVisibilidadCeldaCopiarDocumentoAnulado=true;
			this.isVisibilidadCeldaVerFormDocumentoAnulado=true;
			this.isVisibilidadCeldaOrdenDocumentoAnulado=true;
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=false;
			this.isVisibilidadCeldaModificarDocumentoAnulado=false;
			this.isVisibilidadCeldaActualizarDocumentoAnulado=false;
			this.isVisibilidadCeldaEliminarDocumentoAnulado=false;
			this.isVisibilidadCeldaCancelarDocumentoAnulado=false;
			this.isVisibilidadCeldaGuardarDocumentoAnulado=false;
			this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdPeriodoDeclara=true;
			this.isVisibilidadFK_IdTipoComprobante=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDocumentoAnulado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDocumentoAnulado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDocumentoAnulado(false);
			
			this.setPermisosUsuarioDocumentoAnulado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado() 
				|| (this.documentoanuladoSessionBean.getEsGuardarRelacionado() && this.documentoanuladoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDocumentoAnuladoClasesRelacionadas();
			}
			
			if(this.documentoanuladoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDocumentoAnuladoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDocumentoAnulado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDocumentoAnulado();
			}
			
			if(!this.isPermisoBusquedaDocumentoAnulado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDocumentoAnulado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDocumentoAnulado,this.isPermisoPaginacionMedioDocumentoAnulado,this.isPermisoPaginacionTodoDocumentoAnulado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DocumentoAnuladoConstantesFunciones.getTiposSeleccionarDocumentoAnulado());
				
				this.tiposColumnasSelect=DocumentoAnuladoConstantesFunciones.getTiposSeleccionarDocumentoAnulado(true);
				
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
			//if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDocumentoAnulado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDocumentoAnulado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDocumentoAnulado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDocumentoAnulado() ;
			
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
			this.periododeclaraLogic=new PeriodoDeclaraLogic();
			this.moduloLogic=new ModuloLogic();
			this.tipocomprobanteLogic=new TipoComprobanteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				documentoanuladoImplementable= (DocumentoAnuladoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DocumentoAnuladoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				documentoanuladoImplementableHome= (DocumentoAnuladoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DocumentoAnuladoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.documentoanulados= new ArrayList<DocumentoAnulado>();
			this.documentoanuladosEliminados= new ArrayList<DocumentoAnulado>();
						
			this.isEsNuevoDocumentoAnulado=false;
			this.esParaAccionDesdeFormularioDocumentoAnulado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.tipocomprobantesForeignKey=new ArrayList<TipoComprobante>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDocumentoAnulado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDocumentoAnulado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DocumentoAnuladoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDocumentoAnulado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDocumentoAnulado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDocumentoAnulado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDocumentoAnulado();
			}
			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDocumentoAnulado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDocumentoAnulado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDocumentoAnulado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDocumentoAnulado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DocumentoAnulado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDocumentoAnulado() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDocumentoAnulado")) {
				iIndex=this.jInternalFrameDetalleFormDocumentoAnulado.jTabbedPaneRelacionesDocumentoAnulado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDocumentoAnulado.jTabbedPaneRelacionesDocumentoAnulado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDocumentoAnulado();	
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
	
	public void cargarCombosForeignKeyDocumentoAnulado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDocumentoAnulado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDocumentoAnulado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDocumentoAnuladoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDocumentoAnulado();
		
		this.cargarCombosFrameForeignKeyDocumentoAnulado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDocumentoAnulado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDocumentoAnulado();
		}
	}
	
	

	public void cargarCombosForeignKeyPeriodoDeclara(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPeriodoDeclaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPeriodoDeclara();
				this.cargarCombosFramePeriodoDeclarasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPeriodoDeclara(this.periododeclarasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoComprobante(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoComprobanteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoComprobante();
				this.cargarCombosFrameTipoComprobantesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoComprobante(this.tipocomprobantesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDocumentoAnuladoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.documentoanuladoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDocumentoAnulado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			
			
			if(jTableDatosDocumentoAnulado.getRowCount()>=1) {
				jTableDatosDocumentoAnulado.removeRowSelectionInterval(0, jTableDatosDocumentoAnulado.getRowCount()-1);						
			}
			
			this.isEsNuevoDocumentoAnulado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDocumentoAnulado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDocumentoAnulado(true);			
			//this.documentoanulado=new DocumentoAnulado();
			//this.documentoanulado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDocumentoAnulado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDocumentoAnulado() ;
			
			if(DocumentoAnuladoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDocumentoAnulado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.documentoanulado);	
			this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);				
			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			
			if(this.documentoanuladoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DocumentoAnulado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDocumentoAnuladoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDocumentoAnulado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDocumentoAnulado.getSelectedRows().length;			
			}
			
			documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDocumentoAnulado--;			
				//DocumentoAnulado documentoanuladoAux= new DocumentoAnulado();			
				//documentoanuladoAux.setId(this.iIdNuevoDocumentoAnulado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DocumentoAnulado documentoanuladoOrigen=new DocumentoAnulado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DocumentoAnulado documentoanuladoOrigen : documentoanuladosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							documentoanuladoOrigen =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							documentoanuladoOrigen =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDocumentoAnulado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.documentoanulado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDocumentoAnulado(documentoanuladoOrigen,this.documentoanulado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.documentoanuladoLogic.getDocumentoAnulados().add(this.documentoanuladoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.documentoanulados.add(this.documentoanuladoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDocumentoAnulado(false);
				
				this.jTableDatosDocumentoAnulado.setRowSelectionInterval(this.getIndiceNuevoDocumentoAnulado(), this.getIndiceNuevoDocumentoAnulado());
				
				int iLastRow =  this.jTableDatosDocumentoAnulado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDocumentoAnulado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDocumentoAnulado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDocumentoAnulado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();									
		
			DocumentoAnulado documentoanuladoOrigen=new DocumentoAnulado();
			DocumentoAnulado documentoanuladoDestino=new DocumentoAnulado();
				
			documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDocumentoAnulado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || documentoanuladosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDocumentoAnulado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladoOrigen =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						documentoanuladoOrigen =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						documentoanuladoDestino =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						documentoanuladoDestino =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				documentoanuladoOrigen =documentoanuladosSeleccionados.get(0);
				documentoanuladoDestino =documentoanuladosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDocumentoAnulado(documentoanuladoOrigen,documentoanuladoDestino,true,false);
				
				documentoanuladoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(documentoanuladoDestino,documentoanuladoLogic.getDocumentoAnulados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(documentoanuladoDestino,documentoanulados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDocumentoAnulado(false);
				
				//this.jTableDatosDocumentoAnulado.setRowSelectionInterval(this.getIndiceNuevoDocumentoAnulado(), this.getIndiceNuevoDocumentoAnulado());
				
				int iLastRow =  this.jTableDatosDocumentoAnulado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDocumentoAnulado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDocumentoAnulado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDocumentoAnulado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDocumentoAnulado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDocumentoAnulado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDocumentoAnulado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDocumentoAnulado.setVisible(!isVisible);
			this.jPanelPaginacionDocumentoAnulado.setVisible(!isVisible);
			this.jPanelAccionesDocumentoAnulado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDocumentoAnulado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDocumentoAnulado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDocumentoAnulado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDocumentoAnulado();
			
			this.abrirFrameOrderByDocumentoAnulado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDocumentoAnulado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDocumentoAnulado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDocumentoAnulado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDocumentoAnulado.isMaximum()) {
					this.jInternalFrameDetalleFormDocumentoAnulado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDocumentoAnulado.setSize(this.jInternalFrameDetalleFormDocumentoAnulado.iWidthFormulario,this.jInternalFrameDetalleFormDocumentoAnulado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDocumentoAnulado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDocumentoAnulado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDocumentoAnulado.isMaximum()) {
						this.jInternalFrameDetalleFormDocumentoAnulado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDocumentoAnulado.jContentPaneDetalleDocumentoAnulado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDocumentoAnulado.jTabbedPaneRelacionesDocumentoAnulado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDocumentoAnulado.jContentPaneDetalleDocumentoAnulado.getWidth(),DocumentoAnuladoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDocumentoAnulado.jTabbedPaneRelacionesDocumentoAnulado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDocumentoAnulado.jContentPaneDetalleDocumentoAnulado.getWidth(),DocumentoAnuladoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDocumentoAnulado.jTabbedPaneRelacionesDocumentoAnulado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDocumentoAnulado.jContentPaneDetalleDocumentoAnulado.getWidth(),DocumentoAnuladoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDocumentoAnulado.setVisible(true);
	        this.jInternalFrameDetalleFormDocumentoAnulado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDocumentoAnulado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDocumentoAnulado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDocumentoAnulado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDocumentoAnulado,false,this);
				} else {
					this.jInternalFrameOrderByDocumentoAnulado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDocumentoAnulado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDocumentoAnulado);
				this.jInternalFrameOrderByDocumentoAnulado.setVisible(false);
				this.jInternalFrameOrderByDocumentoAnulado.setSelected(false);
				
				this.jInternalFrameOrderByDocumentoAnulado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDocumentoAnulado"));
				
				this.inicializarActualizarBindingTablaOrderByDocumentoAnulado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDocumentoAnulado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDocumentoAnulado==null) {
				
				this.jInternalFrameImportacionDocumentoAnulado=new ImportacionJInternalFrame(DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDocumentoAnulado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDocumentoAnulado);
				this.jInternalFrameImportacionDocumentoAnulado.setVisible(false);
				this.jInternalFrameImportacionDocumentoAnulado.setSelected(false);


				this.jInternalFrameImportacionDocumentoAnulado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDocumentoAnulado"));
				this.jInternalFrameImportacionDocumentoAnulado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDocumentoAnulado"));
				this.jInternalFrameImportacionDocumentoAnulado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDocumentoAnulado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDocumentoAnulado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDocumentoAnulado==null) {
				this.jInternalFrameReporteDinamicoDocumentoAnulado=new ReporteDinamicoJInternalFrame(DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDocumentoAnulado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDocumentoAnulado);
				this.jInternalFrameReporteDinamicoDocumentoAnulado.setVisible(false);
				this.jInternalFrameReporteDinamicoDocumentoAnulado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDocumentoAnulado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDocumentoAnulado"));
				this.jInternalFrameReporteDinamicoDocumentoAnulado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDocumentoAnulado"));
				this.jInternalFrameReporteDinamicoDocumentoAnulado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDocumentoAnulado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDocumentoAnulado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDocumentoAnulado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDocumentoAnulado);
			
	       	this.jInternalFrameDetalleFormDocumentoAnulado.setVisible(false);
	        this.jInternalFrameDetalleFormDocumentoAnulado.setSelected(false);
			
			//this.jInternalFrameDetalleFormDocumentoAnulado.dispose();
			//this.jInternalFrameDetalleFormDocumentoAnulado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDocumentoAnulado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDocumentoAnulado.setVisible(true);
	        this.jInternalFrameReporteDinamicoDocumentoAnulado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDocumentoAnulado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDocumentoAnulado.setVisible(true);
	        this.jInternalFrameImportacionDocumentoAnulado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDocumentoAnulado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDocumentoAnulado.setVisible(true);
	        this.jInternalFrameOrderByDocumentoAnulado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDocumentoAnulado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDocumentoAnulado.setVisible(false);
	        this.jInternalFrameOrderByDocumentoAnulado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDocumentoAnulado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDocumentoAnulado.setVisible(false);
	        this.jInternalFrameReporteDinamicoDocumentoAnulado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDocumentoAnulado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDocumentoAnulado.setVisible(false);
	        this.jInternalFrameImportacionDocumentoAnulado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDocumentoAnulado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDocumentoAnulado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDocumentoAnulado(true);
			//this.isEsNuevoDocumentoAnulado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDocumentoAnulado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDocumentoAnulado(false) ;
			
			if(documentoanuladoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DocumentoAnuladoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDocumentoAnulado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDocumentoAnulado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDocumentoAnuladoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDocumentoAnulado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDocumentoAnulado(true);
			//this.isEsNuevoDocumentoAnulado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.documentoanulado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDocumentoAnulado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDocumentoAnulado(false) ;
			
			if(DocumentoAnuladoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDocumentoAnulado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDocumentoAnulado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaPeriodoDeclara(List<PeriodoDeclara> periododeclarasForeignKey)throws Exception{
		TableColumn tableColumnPeriodoDeclara=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA));
		TableCellEditor tableCellEditorPeriodoDeclara =tableColumnPeriodoDeclara.getCellEditor();

		PeriodoDeclaraTableCell periododeclaraTableCellFk=(PeriodoDeclaraTableCell)tableCellEditorPeriodoDeclara;

		if(periododeclaraTableCellFk!=null) {
			periododeclaraTableCellFk.setperiododeclarasForeignKey(periododeclarasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDocumentoAnulado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periododeclaraTableCellFk.setRowActual(intSelectedRow);
			//periododeclaraTableCellFk.setperiododeclarasForeignKeyActual(periododeclarasForeignKey);
		//}


		if(periododeclaraTableCellFk!=null) {
			periododeclaraTableCellFk.RecargarPeriodoDeclarasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	public void recargarComboTablaTipoComprobante(List<TipoComprobante> tipocomprobantesForeignKey)throws Exception{
		TableColumn tableColumnTipoComprobante=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE));
		TableCellEditor tableCellEditorTipoComprobante =tableColumnTipoComprobante.getCellEditor();

		TipoComprobanteTableCell tipocomprobanteTableCellFk=(TipoComprobanteTableCell)tableCellEditorTipoComprobante;

		if(tipocomprobanteTableCellFk!=null) {
			tipocomprobanteTableCellFk.settipocomprobantesForeignKey(tipocomprobantesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDocumentoAnulado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocomprobanteTableCellFk.setRowActual(intSelectedRow);
			//tipocomprobanteTableCellFk.settipocomprobantesForeignKeyActual(tipocomprobantesForeignKey);
		//}


		if(tipocomprobanteTableCellFk!=null) {
			tipocomprobanteTableCellFk.RecargarTipoComprobantesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDocumentoAnulado(false);
			
			//if(!this.isEsNuevoDocumentoAnulado) {								
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
				
			}
			
			if(this.permiteMantenimiento(this.documentoanulado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDocumentoAnulado=true;
					this.inicializarActualizarBindingTablaDocumentoAnulado(false);
					this.isEsNuevoDocumentoAnulado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDocumentoAnulado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDocumentoAnulado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDocumentoAnulado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDocumentoAnulado(false);
				
				this.habilitarDeshabilitarControlesDocumentoAnulado(false);
			
												
				
				if(DocumentoAnuladoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDocumentoAnulado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDocumentoAnuladoActionPerformed(evt,documentoanuladoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDocumentoAnulado(this.documentoanulado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDocumentoAnulado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,documentoanuladoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.documentoanulado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DocumentoAnulado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DocumentoAnulado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				this.documentoanulado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				this.documentoanulado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.documentoanulado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DocumentoAnuladoModel) this.jTableDatosDocumentoAnulado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDocumentoAnulado=true;
				this.inicializarActualizarBindingTablaDocumentoAnulado(false);
				this.isEsNuevoDocumentoAnulado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDocumentoAnulado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDocumentoAnulado(false);
				
				this.habilitarDeshabilitarControlesDocumentoAnulado(false);
				
				
				
				if(DocumentoAnuladoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDocumentoAnulado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDocumentoAnulado.getRowCount()>=1) {
				jTableDatosDocumentoAnulado.removeRowSelectionInterval(0, jTableDatosDocumentoAnulado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDocumentoAnulado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDocumentoAnulado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDocumentoAnulado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDocumentoAnulado(false) ;
			
			this.isEsNuevoDocumentoAnulado=false;
			
			if(DocumentoAnuladoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDocumentoAnulado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDocumentoAnulado(false);
				
				//SI ES MANUAL
				if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDocumentoAnulado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDocumentoAnulado--;			
			//DocumentoAnulado documentoanuladoAux= new DocumentoAnulado();			
			//documentoanuladoAux.setId(this.iIdNuevoDocumentoAnulado);
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDocumentoAnulado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
			
			this.documentoanulado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.documentoanuladoLogic.getDocumentoAnulados().add(this.documentoanuladoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.documentoanulados.add(this.documentoanuladoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDocumentoAnulado(false);
			
			this.jTableDatosDocumentoAnulado.setRowSelectionInterval(this.getIndiceNuevoDocumentoAnulado(), this.getIndiceNuevoDocumentoAnulado());
			
			int iLastRow =  this.jTableDatosDocumentoAnulado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDocumentoAnulado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDocumentoAnulado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDocumentoAnulado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDocumentoAnulado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDocumentoAnulado(false);
			
			//SI ES MANUAL
			if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDocumentoAnulado();
			}
			
			//this.abrirFrameTreeDocumentoAnulado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Documento AnuladoS ?", "MANTENIMIENTO DE Documento Anulado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDocumentoAnulado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDocumentoAnulado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.documentoanuladoReturnGeneral=documentoanuladoLogic.procesarImportacionDocumentoAnuladosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.documentoanuladoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDocumentoAnuladoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDocumentoAnulado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDocumentoAnulado.setFileImportacion(this.jInternalFrameImportacionDocumentoAnulado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDocumentoAnulado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDocumentoAnulado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDocumentoAnulado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDocumentoAnulado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();		

		documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDocumentoAnulado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDocumentoAnulado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DocumentoAnuladoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DocumentoAnuladoBaseDesign.jrxml";
			
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
			
			this.generarReporteDocumentoAnulados("Todos",documentoanuladosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Documento Anulado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PeriodoDeclara_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PeriodoDeclara_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PeriodoDeclara_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PeriodoDeclara_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_SERIE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rie_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_torizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_torizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_torizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_torizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaAnulacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaAnulacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaAnulacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaAnulacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDocumentoAnulado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDocumentoAnulado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDocumentoAnulado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA:
					sNombreCampoCategoria="id_periodo_declara";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE:
					sNombreCampoCategoria="id_tipo_comprobante";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoria="serie";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION:
					sNombreCampoCategoria="autorizacion";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION:
					sNombreCampoCategoria="fecha_anulacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDocumentoAnulado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA:
					sNombreCampoCategoriaValor="id_periodo_declara";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE:
					sNombreCampoCategoriaValor="id_tipo_comprobante";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoriaValor="serie";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION:
					sNombreCampoCategoriaValor="autorizacion";
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION:
					sNombreCampoCategoriaValor="fecha_anulacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo Declara",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo_declara");
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_comprobante");
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_SERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"serie");
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Autorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"autorizacion");
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Anulacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_anulacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();		
		
		documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"documentoanulado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DocumentoAnulados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DocumentoAnulado documentoanulado:documentoanuladosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(documentoanulado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA);
					iRow++;

					for(DocumentoAnulado documentoanulado:documentoanuladosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(documentoanulado.getperiododeclara_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(DocumentoAnulado documentoanulado:documentoanuladosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(documentoanulado.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
					iRow++;

					for(DocumentoAnulado documentoanulado:documentoanuladosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(documentoanulado.gettipocomprobante_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(DocumentoAnulado documentoanulado:documentoanuladosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(documentoanulado.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_SERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_SERIE);
					iRow++;

					for(DocumentoAnulado documentoanulado:documentoanuladosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(documentoanulado.getserie());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION);
					iRow++;

					for(DocumentoAnulado documentoanulado:documentoanuladosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(documentoanulado.getautorizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION);
					iRow++;

					for(DocumentoAnulado documentoanulado:documentoanuladosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(documentoanulado.getfecha_anulacion());
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
			//	this.getFilaCabeceraExportarExcelDocumentoAnulado(row);				
			//	iRow++;
			//}				
			
			//for(DocumentoAnulado documentoanuladoAux:documentoanuladosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDocumentoAnulado(documentoanuladoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Documento Anulado",JOptionPane.INFORMATION_MESSAGE);
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
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDocumentoAnulado(false);
			
			//SI ES MANUAL
			if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDocumentoAnulado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDocumentoAnulado(false);
			
			//SI ES MANUAL
			if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDocumentoAnulado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDocumentoAnulado(false);
			
			//SI ES MANUAL
			if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDocumentoAnulado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDocumentoAnulado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDocumentoAnulado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDocumentoAnulado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDocumentoAnulado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDocumentoAnulado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDocumentoAnulado.setMinimumSize(dimensionMinimum);
		this.jTableDatosDocumentoAnulado.setMaximumSize(dimensionMaximum);
		this.jTableDatosDocumentoAnulado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDocumentoAnulado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDocumentoAnulado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDocumentoAnulado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDocumentoAnulado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDocumentoAnulado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDocumentoAnulado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDocumentoAnulado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDocumentoAnulado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDocumentoAnulado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDocumentoAnulado();
		
		this.inicializarActualizarBindingBotonesManualDocumentoAnulado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDocumentoAnulado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDocumentoAnulado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDocumentoAnulado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDocumentoAnulado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDocumentoAnulado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDocumentoAnulado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDocumentoAnulado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDocumentoAnulado.jCheckBoxPostAccionNuevoDocumentoAnulado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDocumentoAnulado.jCheckBoxPostAccionSinCerrarDocumentoAnulado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDocumentoAnulado.jCheckBoxPostAccionSinMensajeDocumentoAnulado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDocumentoAnulado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDocumentoAnulado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDocumentoAnulado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
				this.jInternalFrameDetalleFormDocumentoAnulado.jCheckBoxPostAccionNuevoDocumentoAnulado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDocumentoAnulado.jCheckBoxPostAccionSinCerrarDocumentoAnulado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDocumentoAnulado.jCheckBoxPostAccionSinMensajeDocumentoAnulado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDocumentoAnulado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDocumentoAnulado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDocumentoAnulado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDocumentoAnulado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDocumentoAnulado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDocumentoAnulado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDocumentoAnulado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDocumentoAnulado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDocumentoAnulado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDocumentoAnulado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDocumentoAnulado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDocumentoAnulado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDocumentoAnulado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDocumentoAnulado(Boolean esInicializar) throws Exception {
		try	{	
			if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDocumentoAnulado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDocumentoAnulado() throws Exception {
		try	{
			if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDocumentoAnulado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDocumentoAnulado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDocumentoAnulado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDocumentoAnulado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDocumentoAnulado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDocumentoAnulado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDocumentoAnulado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDocumentoAnulado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDocumentoAnulado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDocumentoAnulado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDocumentoAnulado.addItem(reporte);
			}
			
			
			if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDocumentoAnulado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDocumentoAnulado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDocumentoAnulado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDocumentoAnulado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDocumentoAnulado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDocumentoAnulado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDocumentoAnulado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDocumentoAnulado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDocumentoAnulado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDocumentoAnulado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDocumentoAnulado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDocumentoAnulado!=null) {
				this.jInternalFrameReporteDinamicoDocumentoAnulado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDocumentoAnulado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDocumentoAnulado!=null) {
				this.jInternalFrameReporteDinamicoDocumentoAnulado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDocumentoAnulado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDocumentoAnulado!=null) {
				
				if(this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDocumentoAnulado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDocumentoAnulado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.getSelectedItem()!=null){this.id_periodo_declaraFK_IdPeriodoDeclara=((PeriodoDeclara)this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraDocumentoAnulado.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.getSelectedItem()!=null){this.id_tipo_comprobanteFK_IdTipoComprobante=((TipoComprobante)this.jComboBoxid_tipo_comprobanteFK_IdTipoComprobanteDocumentoAnulado.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDocumentoAnulado(Boolean esInicializar) throws Exception {				
		if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDocumentoAnulado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDocumentoAnulado() throws Exception {
		this.inicializarActualizarBindingTablaDocumentoAnulado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDocumentoAnulado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDocumentoAnuladoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnuladoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDocumentoAnulado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=documentoanuladoLogic.getDocumentoAnulados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=documentoanulados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDocumentoAnulado.setModel(new DocumentoAnuladoModel(this.documentoanuladoLogic.getDocumentoAnulados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDocumentoAnulado.setModel(new DocumentoAnuladoModel(this.documentoanulados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDocumentoAnulado!=null && this.jInternalFrameOrderByDocumentoAnulado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDocumentoAnulado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO,documentoanuladoConstantesFunciones.resaltarSeleccionarDocumentoAnulado,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO,documentoanuladoConstantesFunciones.resaltarSeleccionarDocumentoAnulado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,DocumentoAnuladoConstantesFunciones.LABEL_ID));

		if(this.documentoanuladoConstantesFunciones.mostraridDocumentoAnulado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DocumentoAnuladoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.documentoanuladoConstantesFunciones.resaltaridDocumentoAnulado,this.documentoanuladoConstantesFunciones.activaridDocumentoAnulado,this,true,"idDocumentoAnulado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.documentoanuladoConstantesFunciones.resaltaridDocumentoAnulado,this.documentoanuladoConstantesFunciones.activaridDocumentoAnulado,this,true,"idDocumentoAnulado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.documentoanuladoConstantesFunciones.mostrarid_empresaDocumentoAnulado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.documentoanuladoConstantesFunciones.resaltarid_empresaDocumentoAnulado,this,this.documentoanuladoConstantesFunciones.activarid_empresaDocumentoAnulado));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.documentoanuladoConstantesFunciones.resaltarid_empresaDocumentoAnulado,this,this.documentoanuladoConstantesFunciones.activarid_empresaDocumentoAnulado,false,"id_empresaDocumentoAnulado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA));

		if(this.documentoanuladoConstantesFunciones.mostrarid_periodo_declaraDocumentoAnulado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PeriodoDeclaraTableCell(this.periododeclarasForeignKey,this.documentoanuladoConstantesFunciones.resaltarid_periodo_declaraDocumentoAnulado,this,this.documentoanuladoConstantesFunciones.activarid_periodo_declaraDocumentoAnulado));
			tableColumn.setCellEditor(new PeriodoDeclaraTableCell(this.periododeclarasForeignKey,this.documentoanuladoConstantesFunciones.resaltarid_periodo_declaraDocumentoAnulado,this,this.documentoanuladoConstantesFunciones.activarid_periodo_declaraDocumentoAnulado,true,"id_periodo_declaraDocumentoAnulado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO));

		if(this.documentoanuladoConstantesFunciones.mostrarid_moduloDocumentoAnulado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.documentoanuladoConstantesFunciones.resaltarid_moduloDocumentoAnulado,this,this.documentoanuladoConstantesFunciones.activarid_moduloDocumentoAnulado));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.documentoanuladoConstantesFunciones.resaltarid_moduloDocumentoAnulado,this,this.documentoanuladoConstantesFunciones.activarid_moduloDocumentoAnulado,false,"id_moduloDocumentoAnulado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE));

		if(this.documentoanuladoConstantesFunciones.mostrarid_tipo_comprobanteDocumentoAnulado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoComprobanteTableCell(this.tipocomprobantesForeignKey,this.documentoanuladoConstantesFunciones.resaltarid_tipo_comprobanteDocumentoAnulado,this,this.documentoanuladoConstantesFunciones.activarid_tipo_comprobanteDocumentoAnulado));
			tableColumn.setCellEditor(new TipoComprobanteTableCell(this.tipocomprobantesForeignKey,this.documentoanuladoConstantesFunciones.resaltarid_tipo_comprobanteDocumentoAnulado,this,this.documentoanuladoConstantesFunciones.activarid_tipo_comprobanteDocumentoAnulado,true,"id_tipo_comprobanteDocumentoAnulado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,DocumentoAnuladoConstantesFunciones.LABEL_NUMERO));

		if(this.documentoanuladoConstantesFunciones.mostrarnumeroDocumentoAnulado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DocumentoAnuladoConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.documentoanuladoConstantesFunciones.resaltarnumeroDocumentoAnulado,this.documentoanuladoConstantesFunciones.activarnumeroDocumentoAnulado,this,true,"numeroDocumentoAnulado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.documentoanuladoConstantesFunciones.resaltarnumeroDocumentoAnulado,this.documentoanuladoConstantesFunciones.activarnumeroDocumentoAnulado,this,true,"numeroDocumentoAnulado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,DocumentoAnuladoConstantesFunciones.LABEL_SERIE));

		if(this.documentoanuladoConstantesFunciones.mostrarserieDocumentoAnulado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DocumentoAnuladoConstantesFunciones.LABEL_SERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.documentoanuladoConstantesFunciones.resaltarserieDocumentoAnulado,this.documentoanuladoConstantesFunciones.activarserieDocumentoAnulado,this,true,"serieDocumentoAnulado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.documentoanuladoConstantesFunciones.resaltarserieDocumentoAnulado,this.documentoanuladoConstantesFunciones.activarserieDocumentoAnulado,this,true,"serieDocumentoAnulado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION));

		if(this.documentoanuladoConstantesFunciones.mostrarautorizacionDocumentoAnulado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.documentoanuladoConstantesFunciones.resaltarautorizacionDocumentoAnulado,this.documentoanuladoConstantesFunciones.activarautorizacionDocumentoAnulado,this,true,"autorizacionDocumentoAnulado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.documentoanuladoConstantesFunciones.resaltarautorizacionDocumentoAnulado,this.documentoanuladoConstantesFunciones.activarautorizacionDocumentoAnulado,this,true,"autorizacionDocumentoAnulado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION));

		if(this.documentoanuladoConstantesFunciones.mostrarfecha_anulacionDocumentoAnulado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.documentoanuladoConstantesFunciones.resaltarfecha_anulacionDocumentoAnulado,this.documentoanuladoConstantesFunciones.activarfecha_anulacionDocumentoAnulado,this,true,"fecha_anulacionDocumentoAnulado","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.documentoanuladoConstantesFunciones.resaltarfecha_anulacionDocumentoAnulado,this.documentoanuladoConstantesFunciones.activarfecha_anulacionDocumentoAnulado,this,true,"fecha_anulacionDocumentoAnulado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DocumentoAnuladoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.documentoanuladoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.documentoanuladoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDocumentoAnulado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.documentoanuladoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.documentoanuladoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDocumentoAnulado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.documentoanuladoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.documentoanuladoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDocumentoAnulado.addColumn(tableColumn);
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
			
			this.jTableDatosDocumentoAnulado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDocumentoAnulado.moveColumn(this.jTableDatosDocumentoAnulado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDocumentoAnulado.moveColumn(this.jTableDatosDocumentoAnulado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDocumentoAnulado.moveColumn(this.jTableDatosDocumentoAnulado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDocumentoAnulado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDocumentoAnulado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDocumentoAnulado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDocumentoAnulado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDocumentoAnulado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDocumentoAnulado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDocumentoAnulado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=documentoanuladoLogic.getDocumentoAnulados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=documentoanulados.size()-1;
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
		//this.jTableDatosDocumentoAnulado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDocumentoAnulado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDocumentoAnulado();
			
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
				
				//this.isEsNuevoDocumentoAnulado=false;
					
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			
				if(this.documentoanuladoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDocumentoAnulado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDocumentoAnulado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDocumentoAnulado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.documentoanulado.getsType().equals("DUPLICADO")
				   || this.documentoanulado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDocumentoAnulado=true;
				
				} else {
					this.isEsNuevoDocumentoAnulado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
					if(this.documentoanulado.getId()>=0 && !this.documentoanulado.getIsNew()) {						
						this.isEsNuevoDocumentoAnulado=false;
						
					} else {
						this.isEsNuevoDocumentoAnulado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDocumentoAnulado(esRelaciones);						
				
				this.seleccionarDocumentoAnulado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.documentoanulado.getId()<0) {
					this.isEsNuevoDocumentoAnulado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDocumentoAnulado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDocumentoAnulado(evt,rowIndex);
				}	
				
				if(this.documentoanuladoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DocumentoAnulado: " + this.dDif); 
					}
				}								
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDocumentoAnulado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.documentoanulado)) {
					if(this.documentoanulado.getId()>0) {
						this.documentoanulado.setIsDeleted(true);
						
						this.documentoanuladosEliminados.add(this.documentoanulado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.documentoanuladoLogic.getDocumentoAnulados().remove(this.documentoanulado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.documentoanulados.remove(this.documentoanulado);				
					}
					
					
					((DocumentoAnuladoModel) this.jTableDatosDocumentoAnulado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDocumentoAnulado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDocumentoAnulado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDocumentoAnulado) {
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDocumentoAnulado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDocumentoAnulado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDocumentoAnulado(this.documentoanulado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.documentoanuladoConstantesFunciones.cargarid_empresaDocumentoAnulado || this.documentoanuladoConstantesFunciones.event_dependid_empresaDocumentoAnulado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.documentoanulado.getid_empresa());
									//this.inicializarActualizarBindingDocumentoAnulado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(documentoanulado.getEmpresa()!=null) {
							this.empresasForeignKey.add(documentoanulado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.documentoanulado.getid_empresa(),false,"Formulario");

					//PeriodoDeclara
					if(!this.documentoanuladoConstantesFunciones.cargarid_periodo_declaraDocumentoAnulado || this.documentoanuladoConstantesFunciones.event_dependid_periodo_declaraDocumentoAnulado) {
						//this.cargarCombosPeriodoDeclarasForeignKeyLista(" where id="+this.documentoanulado.getid_periodo_declara());
									//this.inicializarActualizarBindingDocumentoAnulado(false,false);
						this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>();

						if(documentoanulado.getPeriodoDeclara()!=null) {
							this.periododeclarasForeignKey.add(documentoanulado.getPeriodoDeclara());
						}

						this.addItemDefectoCombosForeignKeyPeriodoDeclara();
						this.cargarCombosFramePeriodoDeclarasForeignKey("Todos");
					}
					this.setActualPeriodoDeclaraForeignKey(this.documentoanulado.getid_periodo_declara(),false,"Formulario");

					//Modulo
					if(!this.documentoanuladoConstantesFunciones.cargarid_moduloDocumentoAnulado || this.documentoanuladoConstantesFunciones.event_dependid_moduloDocumentoAnulado) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.documentoanulado.getid_modulo());
									//this.inicializarActualizarBindingDocumentoAnulado(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(documentoanulado.getModulo()!=null) {
							this.modulosForeignKey.add(documentoanulado.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.documentoanulado.getid_modulo(),false,"Formulario");

					//TipoComprobante
					if(!this.documentoanuladoConstantesFunciones.cargarid_tipo_comprobanteDocumentoAnulado || this.documentoanuladoConstantesFunciones.event_dependid_tipo_comprobanteDocumentoAnulado) {
						//this.cargarCombosTipoComprobantesForeignKeyLista(" where id="+this.documentoanulado.getid_tipo_comprobante());
									//this.inicializarActualizarBindingDocumentoAnulado(false,false);
						this.tipocomprobantesForeignKey=new ArrayList<TipoComprobante>();

						if(documentoanulado.getTipoComprobante()!=null) {
							this.tipocomprobantesForeignKey.add(documentoanulado.getTipoComprobante());
						}

						this.addItemDefectoCombosForeignKeyTipoComprobante();
						this.cargarCombosFrameTipoComprobantesForeignKey("Todos");
					}
					this.setActualTipoComprobanteForeignKey(this.documentoanulado.getid_tipo_comprobante(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDocumentoAnulado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDocumentoAnulado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDocumentoAnulado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDocumentoAnulado(DocumentoAnulado documentoanulado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDocumentoAnulado(documentoanulado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDocumentoAnulado(DocumentoAnulado documentoanulado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDocumentoAnulado(documentoanulado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDocumentoAnulado(documentoanulado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDocumentoAnulado(documentoanulado);
	}
	
	public void setVariablesObjetoActualToFormularioDocumentoAnulado(DocumentoAnulado documentoanulado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDocumentoAnulado.jLabelidDocumentoAnulado.setText(documentoanulado.getId().toString());
			this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldnumeroDocumentoAnulado.setText(documentoanulado.getnumero());
			this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldserieDocumentoAnulado.setText(documentoanulado.getserie());
			this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldautorizacionDocumentoAnulado.setText(documentoanulado.getautorizacion());
			this.jInternalFrameDetalleFormDocumentoAnulado.jDateChooserfecha_anulacionDocumentoAnulado.setDate(documentoanulado.getfecha_anulacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DocumentoAnulado documentoanuladoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,documentoanuladoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DocumentoAnulado documentoanuladoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				documentoanuladoLocal=this.documentoanulado;
			} else {
				documentoanuladoLocal=this.documentoanuladoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(documentoanuladoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDocumentoAnulado(documentoanuladoLocal,true);
					
					if(documentoanuladoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(documentoanuladoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(documentoanuladoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDocumentoAnulado(DocumentoAnulado documentoanulado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDocumentoAnulado(documentoanulado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(documentoanulado);
	}
	
	public void setVariablesFormularioToObjetoActualDocumentoAnulado(DocumentoAnulado documentoanulado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDocumentoAnulado(documentoanulado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDocumentoAnulado(DocumentoAnulado documentoanulado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDocumentoAnulado.jLabelidDocumentoAnulado.getText()==null || this.jInternalFrameDetalleFormDocumentoAnulado.jLabelidDocumentoAnulado.getText()=="" || this.jInternalFrameDetalleFormDocumentoAnulado.jLabelidDocumentoAnulado.getText()=="Id") {
				this.jInternalFrameDetalleFormDocumentoAnulado.jLabelidDocumentoAnulado.setText("0");
			}

			if(conColumnasBase) {documentoanulado.setId(Long.parseLong(this.jInternalFrameDetalleFormDocumentoAnulado.jLabelidDocumentoAnulado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DocumentoAnuladoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelIdDocumentoAnulado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			documentoanulado.setnumero(this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldnumeroDocumentoAnulado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DocumentoAnuladoConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelnumeroDocumentoAnulado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			documentoanulado.setserie(this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldserieDocumentoAnulado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DocumentoAnuladoConstantesFunciones.LABEL_SERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelserieDocumentoAnulado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			documentoanulado.setautorizacion(this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldautorizacionDocumentoAnulado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelautorizacionDocumentoAnulado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			documentoanulado.setfecha_anulacion(this.jInternalFrameDetalleFormDocumentoAnulado.jDateChooserfecha_anulacionDocumentoAnulado.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDocumentoAnulado.jLabelfecha_anulacionDocumentoAnulado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDocumentoAnulado(DocumentoAnulado documentoanuladoBean,DocumentoAnulado documentoanulado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && documentoanuladoBean.getid_periodo_declara()!=null && !documentoanuladoBean.getid_periodo_declara().equals(-1L))) {documentoanulado.setid_periodo_declara(documentoanuladoBean.getid_periodo_declara());}
			if(conDefault || (!conDefault && documentoanuladoBean.getid_tipo_comprobante()!=null && !documentoanuladoBean.getid_tipo_comprobante().equals(-1L))) {documentoanulado.setid_tipo_comprobante(documentoanuladoBean.getid_tipo_comprobante());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDocumentoAnulado(DocumentoAnulado documentoanuladoOrigen,DocumentoAnulado documentoanulado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && documentoanuladoOrigen.getId()!=null && !documentoanuladoOrigen.getId().equals(0L))) {documentoanulado.setId(documentoanuladoOrigen.getId());}}
			if(conDefault || (!conDefault && documentoanuladoOrigen.getid_periodo_declara()!=null && !documentoanuladoOrigen.getid_periodo_declara().equals(-1L))) {documentoanulado.setid_periodo_declara(documentoanuladoOrigen.getid_periodo_declara());}
			if(conDefault || (!conDefault && documentoanuladoOrigen.getid_tipo_comprobante()!=null && !documentoanuladoOrigen.getid_tipo_comprobante().equals(-1L))) {documentoanulado.setid_tipo_comprobante(documentoanuladoOrigen.getid_tipo_comprobante());}
			if(conDefault || (!conDefault && documentoanuladoOrigen.getnumero()!=null && !documentoanuladoOrigen.getnumero().equals(""))) {documentoanulado.setnumero(documentoanuladoOrigen.getnumero());}
			if(conDefault || (!conDefault && documentoanuladoOrigen.getserie()!=null && !documentoanuladoOrigen.getserie().equals(""))) {documentoanulado.setserie(documentoanuladoOrigen.getserie());}
			if(conDefault || (!conDefault && documentoanuladoOrigen.getautorizacion()!=null && !documentoanuladoOrigen.getautorizacion().equals(""))) {documentoanulado.setautorizacion(documentoanuladoOrigen.getautorizacion());}
			if(conDefault || (!conDefault && documentoanuladoOrigen.getfecha_anulacion()!=null && !documentoanuladoOrigen.getfecha_anulacion().equals(new Date()))) {documentoanulado.setfecha_anulacion(documentoanuladoOrigen.getfecha_anulacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDocumentoAnulado(DocumentoAnulado documentoanulado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDocumentoAnulado.jLabelidDocumentoAnulado.setText(documentoanulado.getId().toString());
			this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldnumeroDocumentoAnulado.setText(documentoanulado.getnumero());
			this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldserieDocumentoAnulado.setText(documentoanulado.getserie());
			this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldautorizacionDocumentoAnulado.setText(documentoanulado.getautorizacion());
			this.jInternalFrameDetalleFormDocumentoAnulado.jDateChooserfecha_anulacionDocumentoAnulado.setDate(documentoanulado.getfecha_anulacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDocumentoAnulado(DocumentoAnuladoBean documentoanuladoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDocumentoAnulado.jLabelidDocumentoAnulado.setText(documentoanuladoBean.getId().toString());
			this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldnumeroDocumentoAnulado.setText(documentoanuladoBean.getnumero());
			this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldserieDocumentoAnulado.setText(documentoanuladoBean.getserie());
			this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldautorizacionDocumentoAnulado.setText(documentoanuladoBean.getautorizacion());
			this.jInternalFrameDetalleFormDocumentoAnulado.jDateChooserfecha_anulacionDocumentoAnulado.setDate(documentoanuladoBean.getfecha_anulacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDocumentoAnulado(DocumentoAnuladoParameterReturnGeneral documentoanuladoReturnGeneral,DocumentoAnuladoBean documentoanuladoBean,Boolean conDefault) throws Exception { 
		try {
			DocumentoAnulado documentoanuladoLocal=new DocumentoAnulado();
			
			documentoanuladoLocal=documentoanuladoReturnGeneral.getDocumentoAnulado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && documentoanuladoLocal.getId()!=null && !documentoanuladoLocal.getId().equals(0L))) {documentoanuladoBean.setId(documentoanuladoLocal.getId());}}
			if(conDefault || (!conDefault && documentoanuladoLocal.getid_periodo_declara()!=null && !documentoanuladoLocal.getid_periodo_declara().equals(-1L))) {documentoanuladoBean.setid_periodo_declara(documentoanuladoLocal.getid_periodo_declara());}
			if(conDefault || (!conDefault && documentoanuladoLocal.getid_tipo_comprobante()!=null && !documentoanuladoLocal.getid_tipo_comprobante().equals(-1L))) {documentoanuladoBean.setid_tipo_comprobante(documentoanuladoLocal.getid_tipo_comprobante());}
			if(conDefault || (!conDefault && documentoanuladoLocal.getnumero()!=null && !documentoanuladoLocal.getnumero().equals(""))) {documentoanuladoBean.setnumero(documentoanuladoLocal.getnumero());}
			if(conDefault || (!conDefault && documentoanuladoLocal.getserie()!=null && !documentoanuladoLocal.getserie().equals(""))) {documentoanuladoBean.setserie(documentoanuladoLocal.getserie());}
			if(conDefault || (!conDefault && documentoanuladoLocal.getautorizacion()!=null && !documentoanuladoLocal.getautorizacion().equals(""))) {documentoanuladoBean.setautorizacion(documentoanuladoLocal.getautorizacion());}
			if(conDefault || (!conDefault && documentoanuladoLocal.getfecha_anulacion()!=null && !documentoanuladoLocal.getfecha_anulacion().equals(new Date()))) {documentoanuladoBean.setfecha_anulacion(documentoanuladoLocal.getfecha_anulacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDocumentoAnuladoGenerico(Long idDocumentoAnuladoSeleccionado,JComboBox jComboBoxDocumentoAnulado,List<DocumentoAnulado> documentoanuladosLocal)throws Exception {
		try {
			DocumentoAnulado  documentoanuladoTemp=null;

			for(DocumentoAnulado documentoanuladoAux:documentoanuladosLocal) {
				if(documentoanuladoAux.getId()!=null && documentoanuladoAux.getId().equals(idDocumentoAnuladoSeleccionado)) {
					documentoanuladoTemp=documentoanuladoAux;
					break;
				}
			}

			jComboBoxDocumentoAnulado.setSelectedItem(documentoanuladoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDocumentoAnuladoGenerico(JComboBox jComboBoxDocumentoAnulado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDocumentoAnulado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDocumentoAnulado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDocumentoAnulado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDocumentoAnulado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			documentoanulado=(DocumentoAnulado) documentoanuladoLogic.getDocumentoAnulados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			documentoanulado =(DocumentoAnulado) documentoanulados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!documentoanulado.getIsNew() && !documentoanulado.getIsChanged() && !documentoanulado.getIsDeleted()) {
				sDescripcion=documentoanulado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=documentoanulado.getempresa_descripcion();
			}
		}

		if(sTipo.equals("PeriodoDeclara")) {
			//sDescripcion=this.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value);
			if(!documentoanulado.getIsNew() && !documentoanulado.getIsChanged() && !documentoanulado.getIsDeleted()) {
				sDescripcion=documentoanulado.getperiododeclara_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value);
				sDescripcion=documentoanulado.getperiododeclara_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!documentoanulado.getIsNew() && !documentoanulado.getIsChanged() && !documentoanulado.getIsDeleted()) {
				sDescripcion=documentoanulado.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=documentoanulado.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoComprobante")) {
			//sDescripcion=this.getActualTipoComprobanteForeignKeyDescripcion((Long)value);
			if(!documentoanulado.getIsNew() && !documentoanulado.getIsChanged() && !documentoanulado.getIsDeleted()) {
				sDescripcion=documentoanulado.gettipocomprobante_descripcion();
			} else {
				//sDescripcion=this.getActualTipoComprobanteForeignKeyDescripcion((Long)value);
				sDescripcion=documentoanulado.gettipocomprobante_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DocumentoAnulado documentoanuladoRow=new DocumentoAnulado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			documentoanuladoRow=(DocumentoAnulado) documentoanuladoLogic.getDocumentoAnulados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			documentoanuladoRow=(DocumentoAnulado) documentoanulados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDocumentoAnulado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDocumentoAnulado.setVisible((this.isVisibilidadCeldaNuevoDocumentoAnulado && this.isPermisoNuevoDocumentoAnulado));			
			this.jButtonDuplicarDocumentoAnulado.setVisible((this.isVisibilidadCeldaDuplicarDocumentoAnulado && this.isPermisoDuplicarDocumentoAnulado));			
			this.jButtonCopiarDocumentoAnulado.setVisible((this.isVisibilidadCeldaCopiarDocumentoAnulado && this.isPermisoCopiarDocumentoAnulado));
			this.jButtonVerFormDocumentoAnulado.setVisible((this.isVisibilidadCeldaVerFormDocumentoAnulado && this.isPermisoVerFormDocumentoAnulado));
			
			this.jButtonAbrirOrderByDocumentoAnulado.setVisible((this.isVisibilidadCeldaOrdenDocumentoAnulado && this.isPermisoOrdenDocumentoAnulado));			
			
			this.jButtonNuevoRelacionesDocumentoAnulado.setVisible((this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado && this.isPermisoNuevoDocumentoAnulado));			
			this.jButtonNuevoGuardarCambiosDocumentoAnulado.setVisible((this.isVisibilidadCeldaNuevoDocumentoAnulado && this.isPermisoNuevoDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado));
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonModificarDocumentoAnulado.setVisible((this.isVisibilidadCeldaModificarDocumentoAnulado && this.isPermisoActualizarDocumentoAnulado));	
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonActualizarDocumentoAnulado.setVisible((this.isVisibilidadCeldaActualizarDocumentoAnulado && this.isPermisoActualizarDocumentoAnulado));	
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonEliminarDocumentoAnulado.setVisible((this.isVisibilidadCeldaEliminarDocumentoAnulado && this.isPermisoEliminarDocumentoAnulado));
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonCancelarDocumentoAnulado.setVisible(this.isVisibilidadCeldaCancelarDocumentoAnulado);							
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonGuardarCambiosDocumentoAnulado.setVisible((this.isVisibilidadCeldaGuardarDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado));			
			
			}
						
			this.jButtonGuardarCambiosTablaDocumentoAnulado.setVisible((this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDocumentoAnulado.setVisible((this.isVisibilidadCeldaNuevoDocumentoAnulado && this.isPermisoNuevoDocumentoAnulado));						
			this.jButtonDuplicarToolBarDocumentoAnulado.setVisible((this.isVisibilidadCeldaDuplicarDocumentoAnulado && this.isPermisoDuplicarDocumentoAnulado));						
			this.jButtonCopiarToolBarDocumentoAnulado.setVisible((this.isVisibilidadCeldaCopiarDocumentoAnulado && this.isPermisoCopiarDocumentoAnulado));			
			this.jButtonVerFormToolBarDocumentoAnulado.setVisible((this.isVisibilidadCeldaVerFormDocumentoAnulado && this.isPermisoVerFormDocumentoAnulado));			
			this.jButtonAbrirOrderByToolBarDocumentoAnulado.setVisible((this.isVisibilidadCeldaOrdenDocumentoAnulado && this.isPermisoOrdenDocumentoAnulado));
			this.jButtonNuevoRelacionesToolBarDocumentoAnulado.setVisible((this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado && this.isPermisoNuevoDocumentoAnulado));			
			this.jButtonNuevoGuardarCambiosToolBarDocumentoAnulado.setVisible((this.isVisibilidadCeldaNuevoDocumentoAnulado && this.isPermisoNuevoDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado));			
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonModificarToolBarDocumentoAnulado.setVisible((this.isVisibilidadCeldaModificarDocumentoAnulado && this.isPermisoActualizarDocumentoAnulado));	
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonActualizarToolBarDocumentoAnulado.setVisible((this.isVisibilidadCeldaActualizarDocumentoAnulado  && this.isPermisoActualizarDocumentoAnulado));	
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonEliminarToolBarDocumentoAnulado.setVisible((this.isVisibilidadCeldaEliminarDocumentoAnulado && this.isPermisoEliminarDocumentoAnulado));
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonCancelarToolBarDocumentoAnulado.setVisible(this.isVisibilidadCeldaCancelarDocumentoAnulado);				
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonGuardarCambiosToolBarDocumentoAnulado.setVisible((this.isVisibilidadCeldaGuardarDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDocumentoAnulado.setVisible((this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDocumentoAnulado.setVisible((this.isVisibilidadCeldaNuevoDocumentoAnulado && this.isPermisoNuevoDocumentoAnulado));			
			this.jMenuItemDuplicarDocumentoAnulado.setVisible((this.isVisibilidadCeldaDuplicarDocumentoAnulado && this.isPermisoDuplicarDocumentoAnulado));			
			this.jMenuItemCopiarDocumentoAnulado.setVisible((this.isVisibilidadCeldaCopiarDocumentoAnulado && this.isPermisoCopiarDocumentoAnulado));			
			this.jMenuItemVerFormDocumentoAnulado.setVisible((this.isVisibilidadCeldaVerFormDocumentoAnulado && this.isPermisoVerFormDocumentoAnulado));			
			this.jMenuItemAbrirOrderByDocumentoAnulado.setVisible((this.isVisibilidadCeldaOrdenDocumentoAnulado && this.isPermisoOrdenDocumentoAnulado));			
			//this.jMenuItemMostrarOcultarDocumentoAnulado.setVisible((this.isVisibilidadCeldaOrdenDocumentoAnulado && this.isPermisoOrdenDocumentoAnulado));
			this.jMenuItemDetalleAbrirOrderByDocumentoAnulado.setVisible((this.isVisibilidadCeldaOrdenDocumentoAnulado && this.isPermisoOrdenDocumentoAnulado));			
			//this.jMenuItemDetalleMostrarOcultarDocumentoAnulado.setVisible((this.isVisibilidadCeldaOrdenDocumentoAnulado && this.isPermisoOrdenDocumentoAnulado));			
			this.jMenuItemNuevoRelacionesDocumentoAnulado.setVisible((this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado && this.isPermisoNuevoDocumentoAnulado));			
			this.jMenuItemNuevoGuardarCambiosDocumentoAnulado.setVisible((this.isVisibilidadCeldaNuevoDocumentoAnulado && this.isPermisoNuevoDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado));									
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemModificarDocumentoAnulado.setVisible((this.isVisibilidadCeldaModificarDocumentoAnulado && this.isPermisoActualizarDocumentoAnulado));	
			this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemActualizarDocumentoAnulado.setVisible((this.isVisibilidadCeldaActualizarDocumentoAnulado && this.isPermisoActualizarDocumentoAnulado));	
			this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemEliminarDocumentoAnulado.setVisible((this.isVisibilidadCeldaEliminarDocumentoAnulado && this.isPermisoEliminarDocumentoAnulado));
			this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemCancelarDocumentoAnulado.setVisible(this.isVisibilidadCeldaCancelarDocumentoAnulado);				
			}
			
			this.jMenuItemGuardarCambiosDocumentoAnulado.setVisible((this.isVisibilidadCeldaGuardarDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado));						
			this.jMenuItemGuardarCambiosTablaDocumentoAnulado.setVisible((this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDocumentoAnulado=this.jButtonNuevoDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaDuplicarDocumentoAnulado=this.jButtonDuplicarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaCopiarDocumentoAnulado=this.jButtonCopiarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaVerFormDocumentoAnulado=this.jButtonVerFormDocumentoAnulado.isVisible();
			
			this.isVisibilidadCeldaOrdenDocumentoAnulado=this.jButtonAbrirOrderByDocumentoAnulado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=this.jButtonNuevoRelacionesDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaModificarDocumentoAnulado=this.jButtonModificarDocumentoAnulado.isVisible();
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			this.isVisibilidadCeldaActualizarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jButtonActualizarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaEliminarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jButtonEliminarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaCancelarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jButtonCancelarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaGuardarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jButtonGuardarCambiosDocumentoAnulado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=this.jButtonGuardarCambiosTablaDocumentoAnulado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDocumentoAnulado=this.jButtonNuevoToolBarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=this.jButtonNuevoRelacionesToolBarDocumentoAnulado.isVisible();
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			this.isVisibilidadCeldaModificarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jButtonModificarToolBarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaActualizarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jButtonActualizarToolBarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaEliminarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jButtonEliminarToolBarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaCancelarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jButtonCancelarToolBarDocumentoAnulado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDocumentoAnulado=this.jButtonGuardarCambiosToolBarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=this.jButtonGuardarCambiosTablaToolBarDocumentoAnulado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDocumentoAnulado=this.jMenuItemNuevoDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=this.jMenuItemNuevoRelacionesDocumentoAnulado.isVisible();
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			this.isVisibilidadCeldaModificarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemModificarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaActualizarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemActualizarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaEliminarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemEliminarDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaCancelarDocumentoAnulado=this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemCancelarDocumentoAnulado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDocumentoAnulado=this.jMenuItemGuardarCambiosDocumentoAnulado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=this.jMenuItemGuardarCambiosTablaDocumentoAnulado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDocumentoAnulado(Boolean esInicializar) {
		if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.documentoanuladoSessionBean.getConGuardarRelaciones()) {
				//if(this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDocumentoAnulado();
			}
			
			this.inicializarActualizarBindingBotonesManualDocumentoAnulado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDocumentoAnulado() {
		this.jButtonNuevoDocumentoAnulado.setVisible(this.isPermisoNuevoDocumentoAnulado);			
		this.jButtonDuplicarDocumentoAnulado.setVisible(this.isPermisoDuplicarDocumentoAnulado);			
		this.jButtonCopiarDocumentoAnulado.setVisible(this.isPermisoCopiarDocumentoAnulado);			
		this.jButtonVerFormDocumentoAnulado.setVisible(this.isPermisoVerFormDocumentoAnulado);			
		
		this.jButtonAbrirOrderByDocumentoAnulado.setVisible(this.isPermisoOrdenDocumentoAnulado);					
		
		this.jButtonNuevoRelacionesDocumentoAnulado.setVisible(this.isPermisoNuevoDocumentoAnulado);			
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonModificarDocumentoAnulado.setVisible(this.isPermisoActualizarDocumentoAnulado);	
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonActualizarDocumentoAnulado.setVisible(this.isPermisoActualizarDocumentoAnulado);	
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonEliminarDocumentoAnulado.setVisible(this.isPermisoEliminarDocumentoAnulado);
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonCancelarDocumentoAnulado.setVisible(this.isVisibilidadCeldaCancelarDocumentoAnulado);						
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonGuardarCambiosDocumentoAnulado.setVisible(this.isPermisoGuardarCambiosDocumentoAnulado);							
		}
		
		this.jButtonGuardarCambiosTablaDocumentoAnulado.setVisible(this.isPermisoActualizarDocumentoAnulado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDocumentoAnulado() {
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonModificarDocumentoAnulado.setVisible(this.isPermisoActualizarDocumentoAnulado);	
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonActualizarDocumentoAnulado.setVisible(this.isPermisoActualizarDocumentoAnulado);	
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonEliminarDocumentoAnulado.setVisible(this.isPermisoEliminarDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonCancelarDocumentoAnulado.setVisible(this.isVisibilidadCeldaCancelarDocumentoAnulado);							
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonGuardarCambiosDocumentoAnulado.setVisible((this.isVisibilidadCeldaGuardarDocumentoAnulado && this.isPermisoGuardarCambiosDocumentoAnulado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDocumentoAnulado() {
		if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDocumentoAnulado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDocumentoAnulado() {
	}
	
	public void jTableDatosDocumentoAnuladoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDocumentoAnulado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDocumentoAnuladoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.documentoanulado==null) {
						this.documentoanulado = new DocumentoAnulado();
					}

					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
				}

				if(this.documentoanulado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.documentoanulado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDocumentoAnulado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDocumentoAnuladoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDocumentoAnulado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDocumentoAnulado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDocumentoAnulado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.documentoanuladoLogic.getConnexion());

				if(this.documentoanulado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.documentoanulado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDocumentoAnulado=(TitledBorder)this.jScrollPanelDatosDocumentoAnulado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDocumentoAnulado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDocumentoAnuladoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.documentoanulado==null) {
						this.documentoanulado = new DocumentoAnulado();
					}

					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
				}

				if(this.documentoanulado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.documentoanulado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDocumentoAnulado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodo_declaraDocumentoAnuladoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiododeclara=true;

			idTienePermisoperiododeclara=this.tienePermisosUsuarioEnPaginaWebDocumentoAnulado(PeriodoDeclaraConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiododeclara) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDocumentoAnulado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDocumentoAnulado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);

				this.periododeclaraBeanSwingJInternalFrame=new PeriodoDeclaraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periododeclaraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periododeclaraBeanSwingJInternalFrame.getPeriodoDeclaraLogic().setConnexion(this.documentoanuladoLogic.getConnexion());

				if(this.documentoanulado.getid_periodo_declara()!=null) {
					this.periododeclaraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periododeclaraBeanSwingJInternalFrame.setIdActual(this.documentoanulado.getid_periodo_declara());
					this.periododeclaraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periododeclaraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periododeclaraBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodoDeclara();
				}

				JInternalFrameBase jinternalFrame =this.periododeclaraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDocumentoAnulado=(TitledBorder)this.jScrollPanelDatosDocumentoAnulado.getBorder();
				TitledBorder titledBorderperiododeclara=(TitledBorder)this.periododeclaraBeanSwingJInternalFrame.jScrollPanelDatosPeriodoDeclara.getBorder();

				titledBorderperiododeclara.setTitle(titledBorderDocumentoAnulado.getTitle() + " -> Periodo Declara");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodo_declaraDocumentoAnuladoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.documentoanulado==null) {
						this.documentoanulado = new DocumentoAnulado();
					}

					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
				}

				if(this.documentoanulado.getid_periodo_declara()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo_declara = "+this.documentoanulado.getid_periodo_declara().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDocumentoAnulado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloDocumentoAnuladoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebDocumentoAnulado(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDocumentoAnulado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDocumentoAnulado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.documentoanuladoLogic.getConnexion());

				if(this.documentoanulado.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.documentoanulado.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDocumentoAnulado=(TitledBorder)this.jScrollPanelDatosDocumentoAnulado.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderDocumentoAnulado.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloDocumentoAnuladoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.documentoanulado==null) {
						this.documentoanulado = new DocumentoAnulado();
					}

					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
				}

				if(this.documentoanulado.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.documentoanulado.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDocumentoAnulado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_comprobanteDocumentoAnuladoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocomprobante=true;

			idTienePermisotipocomprobante=this.tienePermisosUsuarioEnPaginaWebDocumentoAnulado(TipoComprobanteConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocomprobante) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDocumentoAnulado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDocumentoAnulado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);

				this.tipocomprobanteBeanSwingJInternalFrame=new TipoComprobanteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocomprobanteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocomprobanteBeanSwingJInternalFrame.getTipoComprobanteLogic().setConnexion(this.documentoanuladoLogic.getConnexion());

				if(this.documentoanulado.getid_tipo_comprobante()!=null) {
					this.tipocomprobanteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocomprobanteBeanSwingJInternalFrame.setIdActual(this.documentoanulado.getid_tipo_comprobante());
					this.tipocomprobanteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocomprobanteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocomprobanteBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoComprobante();
				}

				JInternalFrameBase jinternalFrame =this.tipocomprobanteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDocumentoAnulado=(TitledBorder)this.jScrollPanelDatosDocumentoAnulado.getBorder();
				TitledBorder titledBordertipocomprobante=(TitledBorder)this.tipocomprobanteBeanSwingJInternalFrame.jScrollPanelDatosTipoComprobante.getBorder();

				titledBordertipocomprobante.setTitle(titledBorderDocumentoAnulado.getTitle() + " -> Tipo Comprobante");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_comprobanteDocumentoAnuladoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.documentoanulado==null) {
						this.documentoanulado = new DocumentoAnulado();
					}

					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
				}

				if(this.documentoanulado.getid_tipo_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_comprobante = "+this.documentoanulado.getid_tipo_comprobante().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDocumentoAnulado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroDocumentoAnuladoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.documentoanulado==null) {
						this.documentoanulado = new DocumentoAnulado();
					}

					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
				}

				if(this.documentoanulado.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.documentoanulado.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDocumentoAnulado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonserieDocumentoAnuladoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.documentoanulado==null) {
						this.documentoanulado = new DocumentoAnulado();
					}

					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
				}

				if(this.documentoanulado.getserie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where serie like '%"+this.documentoanulado.getserie()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDocumentoAnulado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonautorizacionDocumentoAnuladoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.documentoanulado==null) {
						this.documentoanulado = new DocumentoAnulado();
					}

					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
				}

				if(this.documentoanulado.getautorizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where autorizacion like '%"+this.documentoanulado.getautorizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDocumentoAnulado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_anulacionDocumentoAnuladoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.getdocumentoanulado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.documentoanulado==null) {
						this.documentoanulado = new DocumentoAnulado();
					}

					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);
				}

				if(this.documentoanulado.getfecha_anulacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_anulacion = '"+Funciones2.getStringPostgresDate(this.documentoanulado.getfecha_anulacion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDocumentoAnulado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDocumentoAnulado(false,false);

			this.getDocumentoAnuladosFK_IdEmpresa();

			this.inicializarActualizarBindingDocumentoAnulado(false);

			//if(DocumentoAnuladoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDocumentoAnulado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDocumentoAnulado(false,false);

			this.getDocumentoAnuladosFK_IdModulo();

			this.inicializarActualizarBindingDocumentoAnulado(false);

			//if(DocumentoAnuladoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDocumentoAnulado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDeclaraDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDocumentoAnulado(false,false);

			this.getDocumentoAnuladosFK_IdPeriodoDeclara();

			this.inicializarActualizarBindingDocumentoAnulado(false);

			//if(DocumentoAnuladoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDocumentoAnulado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoComprobanteDocumentoAnuladoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDocumentoAnulado(false,false);

			this.getDocumentoAnuladosFK_IdTipoComprobante();

			this.inicializarActualizarBindingDocumentoAnulado(false);

			//if(DocumentoAnuladoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDocumentoAnulado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.documentoanuladoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDocumentoAnulado() {
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
			this.jInternalFrameDetalleFormDocumentoAnulado.setVisible(false);	    			
			this.jInternalFrameDetalleFormDocumentoAnulado.dispose();
			this.jInternalFrameDetalleFormDocumentoAnulado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDocumentoAnulado!=null) {
			this.jInternalFrameReporteDinamicoDocumentoAnulado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDocumentoAnulado.dispose();
			this.jInternalFrameReporteDinamicoDocumentoAnulado=null;
		}
		
		if(this.jInternalFrameImportacionDocumentoAnulado!=null) {
			this.jInternalFrameImportacionDocumentoAnulado.setVisible(false);	    			
			this.jInternalFrameImportacionDocumentoAnulado.dispose();
			this.jInternalFrameImportacionDocumentoAnulado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDocumentoAnulado();
			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			
			
			if(sTipo.equals("NuevoDocumentoAnulado")) {
				jButtonNuevoDocumentoAnuladoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDocumentoAnulado")) {
				jButtonDuplicarDocumentoAnuladoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDocumentoAnulado")) {
				jButtonCopiarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("VerFormDocumentoAnulado")) {
				jButtonVerFormDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDocumentoAnulado")) {
				jButtonNuevoDocumentoAnuladoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDocumentoAnulado")) {
				jButtonDuplicarDocumentoAnuladoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDocumentoAnulado")) {
				jButtonNuevoDocumentoAnuladoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDocumentoAnulado")) {
				jButtonDuplicarDocumentoAnuladoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDocumentoAnulado")) {
				jButtonNuevoDocumentoAnuladoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDocumentoAnulado")) {
				jButtonNuevoDocumentoAnuladoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDocumentoAnulado")) {
				jButtonNuevoDocumentoAnuladoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDocumentoAnulado")) {
				jButtonModificarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDocumentoAnulado")) {
				jButtonModificarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDocumentoAnulado")) {
				jButtonModificarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDocumentoAnulado")) {
				jButtonActualizarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDocumentoAnulado")) {
				jButtonActualizarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDocumentoAnulado")) {
				jButtonActualizarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("EliminarDocumentoAnulado")) {
				jButtonEliminarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDocumentoAnulado")) {
				jButtonEliminarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDocumentoAnulado")) {
				jButtonEliminarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("CancelarDocumentoAnulado")) {
				jButtonCancelarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDocumentoAnulado")) {
				jButtonCancelarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDocumentoAnulado")) {
				jButtonCancelarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("CerrarDocumentoAnulado")) {
				jButtonCerrarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDocumentoAnulado")) {
				jButtonCerrarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDocumentoAnulado")) {
				jButtonCerrarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDocumentoAnulado")) {
				jButtonMostrarOcultarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDocumentoAnulado")) {
				jButtonCancelarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDocumentoAnulado")) {
				jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDocumentoAnulado")) {
				jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDocumentoAnulado")) {
				jButtonCopiarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDocumentoAnulado")) {
				jButtonVerFormDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDocumentoAnulado")) {
				jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDocumentoAnulado")) {
				jButtonCopiarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDocumentoAnulado")) {
				jButtonVerFormDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDocumentoAnulado")) {
				jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDocumentoAnulado")) {
				jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDocumentoAnulado")) {
				jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDocumentoAnulado")) {
				jButtonRecargarInformacionDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDocumentoAnulado")) {
				jButtonRecargarInformacionDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDocumentoAnulado")) {
				jButtonRecargarInformacionDocumentoAnuladoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDocumentoAnulado")) {
				jButtonAnterioresDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDocumentoAnulado")) {
				jButtonAnterioresDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDocumentoAnulado")) {
				jButtonAnterioresDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDocumentoAnulado")) {
				jButtonSiguientesDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDocumentoAnulado")) {
				jButtonSiguientesDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDocumentoAnulado")) {
				jButtonSiguientesDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDocumentoAnulado") || sTipo.equals("MenuItemDetalleAbrirOrderByDocumentoAnulado")) {
				jButtonAbrirOrderByDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDocumentoAnulado") || sTipo.equals("MenuItemDetalleMostrarOcultarDocumentoAnulado")) {
				jButtonMostrarOcultarDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDocumentoAnulado")) {
				jButtonNuevoGuardarCambiosDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDocumentoAnulado")) {
				jButtonNuevoGuardarCambiosDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDocumentoAnulado")) {
				jButtonNuevoGuardarCambiosDocumentoAnuladoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDocumentoAnulado")) {
				jButtonCerrarReporteDinamicoDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDocumentoAnulado")) {
				jButtonGenerarReporteDinamicoDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDocumentoAnulado")) {
				
				jButtonGenerarExcelReporteDinamicoDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDocumentoAnulado")) {
				jButtonCerrarImportacionDocumentoAnuladoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDocumentoAnulado")) {
				
				jButtonGenerarImportacionDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDocumentoAnulado")) {
				
				jButtonAbrirImportacionDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDocumentoAnulado")) {
				jComboBoxTiposAccionesDocumentoAnuladoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDocumentoAnulado")) {
				jComboBoxTiposRelacionesDocumentoAnuladoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDocumentoAnulado")) {
				jComboBoxTiposAccionesDocumentoAnuladoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDocumentoAnulado")) {
				
				jComboBoxTiposSeleccionarDocumentoAnuladoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDocumentoAnulado")) {
				jTextFieldValorCampoGeneralDocumentoAnuladoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDocumentoAnulado")) {
				jButtonAbrirOrderByDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDocumentoAnulado")) {
				jButtonAbrirOrderByDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDocumentoAnulado")) {
				jButtonCerrarOrderByDocumentoAnuladoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDocumentoAnuladoBusqueda")) {
				this.jButtonidDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDocumentoAnuladoUpdate")) {
				this.jButtonid_empresaDocumentoAnuladoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDocumentoAnuladoBusqueda")) {
				this.jButtonid_empresaDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodo_declaraDocumentoAnuladoUpdate")) {
				this.jButtonid_periodo_declaraDocumentoAnuladoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodo_declaraDocumentoAnuladoBusqueda")) {
				this.jButtonid_periodo_declaraDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloDocumentoAnuladoUpdate")) {
				this.jButtonid_moduloDocumentoAnuladoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloDocumentoAnuladoBusqueda")) {
				this.jButtonid_moduloDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_comprobanteDocumentoAnuladoUpdate")) {
				this.jButtonid_tipo_comprobanteDocumentoAnuladoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_comprobanteDocumentoAnuladoBusqueda")) {
				this.jButtonid_tipo_comprobanteDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroDocumentoAnuladoBusqueda")) {
				this.jButtonnumeroDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieDocumentoAnuladoBusqueda")) {
				this.jButtonserieDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("autorizacionDocumentoAnuladoBusqueda")) {
				this.jButtonautorizacionDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_anulacionDocumentoAnuladoBusqueda")) {
				this.jButtonfecha_anulacionDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPeriodoDeclaraDocumentoAnulado")) {
				this.jButtonFK_IdPeriodoDeclaraDocumentoAnuladoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoComprobanteDocumentoAnulado")) {
				this.jButtonFK_IdTipoComprobanteDocumentoAnuladoActionPerformed(evt);
			}
			
			;
			
			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDocumentoAnulado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDocumentoAnuladoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				


				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DocumentoAnulado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DocumentoAnulado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DocumentoAnulado documentoanuladoLocal=null;
			
			if(!this.getEsControlTabla()) {
				documentoanuladoLocal=this.documentoanulado;
			} else {
				documentoanuladoLocal=this.documentoanuladoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
							
				
				


				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DocumentoAnulado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DocumentoAnulado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDocumentoAnuladoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
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
			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			
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
			
			


			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDocumentoAnuladoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
								
						
				


				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DocumentoAnulado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DocumentoAnulado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
								
				
				


				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DocumentoAnulado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DocumentoAnulado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDocumentoAnuladoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDocumentoAnuladoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDocumentoAnuladoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
							
				
				


				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DocumentoAnulado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DocumentoAnulado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDocumentoAnuladoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
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
			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			
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
			
			


			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDocumentoAnuladoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
								
				
				


				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DocumentoAnulado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DocumentoAnulado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDocumentoAnuladoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDocumentoAnuladoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDocumentoAnuladoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDocumentoAnulado")) {
					jCheckBoxSeleccionarTodosDocumentoAnuladoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDocumentoAnulado")) {
					jCheckBoxSeleccionadosDocumentoAnuladoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDocumentoAnulado")) {
					
				}
				
				


				
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DocumentoAnulado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DocumentoAnulado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
												
				
				


				
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DocumentoAnulado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DocumentoAnulado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDocumentoAnuladoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDocumentoAnuladoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
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
			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
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
			
			


			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDocumentoAnuladoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DocumentoAnulado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DocumentoAnulado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.documentoanulado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.documentoanulado);
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
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
				
				


				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DocumentoAnulado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DocumentoAnulado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDocumentoAnuladoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.documentoanuladoAnterior =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDocumentoAnulado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDocumentoAnuladoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDocumentoAnulado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.documentoanulado =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.documentoanulado =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.documentoanulado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDocumentoAnulado")) {
				
				}
				
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDocumentoAnulado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDocumentoAnulado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDocumentoAnulado")) {
			
			}
			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDocumentoAnulado();
			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			
			if(sTipo.equals("NuevoDocumentoAnulado")) {
				jButtonNuevoDocumentoAnuladoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDocumentoAnulado")) {
				jButtonDuplicarDocumentoAnuladoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDocumentoAnulado")) {
				jButtonCopiarDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDocumentoAnulado")) {
				jButtonVerFormDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDocumentoAnulado")) {
				jButtonNuevoDocumentoAnuladoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDocumentoAnulado")) {
				jButtonModificarDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDocumentoAnulado")) {
				jButtonActualizarDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDocumentoAnulado")) {
				jButtonEliminarDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDocumentoAnulado")) {
				jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDocumentoAnulado")) {
				jButtonCancelarDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDocumentoAnulado")) {
				jButtonCerrarDocumentoAnuladoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDocumentoAnulado")) {
				jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDocumentoAnulado")) {
				jButtonNuevoGuardarCambiosDocumentoAnuladoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDocumentoAnulado")) {
				jButtonAbrirOrderByDocumentoAnuladoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDocumentoAnulado")) {
				jButtonRecargarInformacionDocumentoAnuladoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDocumentoAnulado")) {
				jButtonAnterioresDocumentoAnuladoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDocumentoAnulado")) {
				jButtonSiguientesDocumentoAnuladoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDocumentoAnuladoBusqueda")) {
				this.jButtonidDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDocumentoAnuladoUpdate")) {
				this.jButtonid_empresaDocumentoAnuladoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDocumentoAnuladoBusqueda")) {
				this.jButtonid_empresaDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodo_declaraDocumentoAnuladoUpdate")) {
				this.jButtonid_periodo_declaraDocumentoAnuladoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodo_declaraDocumentoAnuladoBusqueda")) {
				this.jButtonid_periodo_declaraDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloDocumentoAnuladoUpdate")) {
				this.jButtonid_moduloDocumentoAnuladoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloDocumentoAnuladoBusqueda")) {
				this.jButtonid_moduloDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_comprobanteDocumentoAnuladoUpdate")) {
				this.jButtonid_tipo_comprobanteDocumentoAnuladoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_comprobanteDocumentoAnuladoBusqueda")) {
				this.jButtonid_tipo_comprobanteDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroDocumentoAnuladoBusqueda")) {
				this.jButtonnumeroDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieDocumentoAnuladoBusqueda")) {
				this.jButtonserieDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("autorizacionDocumentoAnuladoBusqueda")) {
				this.jButtonautorizacionDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_anulacionDocumentoAnuladoBusqueda")) {
				this.jButtonfecha_anulacionDocumentoAnuladoBusquedaActionPerformed(evt);
			}
			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDocumentoAnulado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDocumentoAnulado")) {
				closingInternalFrameDocumentoAnulado();
				
			} else if(sTipo.equals("jButtonCancelarDocumentoAnulado")) {
				JInternalFrameBase jInternalFrameDetalleFormDocumentoAnulado = (JInternalFrameBase)evt.getSource();
	            	
	            DocumentoAnuladoBeanSwingJInternalFrame jInternalFrameParent=(DocumentoAnuladoBeanSwingJInternalFrame)jInternalFrameDetalleFormDocumentoAnulado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDocumentoAnuladoActionPerformed(null);
			}
			
			DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.documentoanulado,new Object(),this.documentoanuladoParameterGeneral,this.documentoanuladoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDocumentoAnulado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDocumentoAnulado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDocumentoAnulado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.documentoanulado)) {
			if(!esControlTabla) {
				if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);			
				}
				
				if(this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDocumentoAnulado(this.documentoanulado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.documentoanuladoReturnGeneral=documentoanuladoLogic.procesarEventosDocumentoAnuladosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.documentoanuladoLogic.getDocumentoAnulados(),this.documentoanulado,this.documentoanuladoParameterGeneral,this.isEsNuevoDocumentoAnulado,classes);//this.documentoanuladoLogic.getDocumentoAnulado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDocumentoAnulado(this.documentoanuladoReturnGeneral,this.documentoanuladoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDocumentoAnulado(classes,this.documentoanuladoReturnGeneral,this.documentoanuladoBean,false);
					}
						
					if(this.documentoanuladoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDocumentoAnulado(this.documentoanuladoReturnGeneral.getDocumentoAnulado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDocumentoAnulado(this.documentoanuladoReturnGeneral.getDocumentoAnulado());	
					}
						
					if(this.documentoanuladoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDocumentoAnulado(this.documentoanuladoReturnGeneral.getDocumentoAnulado(),classes);//this.documentoanuladoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDocumentoAnulado(this.documentoanulado,classes);//this.documentoanuladoBean);									
				}
			
				if(DocumentoAnuladoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDocumentoAnulado(this.documentoanulado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDocumentoAnulado(this.documentoanulado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.documentoanuladoAnterior!=null) {
						this.documentoanulado=this.documentoanuladoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.documentoanuladoReturnGeneral=documentoanuladoLogic.procesarEventosDocumentoAnuladosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.documentoanuladoLogic.getDocumentoAnulados(),this.documentoanulado,this.documentoanuladoParameterGeneral,this.isEsNuevoDocumentoAnulado,classes);//this.documentoanuladoLogic.getDocumentoAnulado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.documentoanuladoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.documentoanuladoReturnGeneral.getDocumentoAnulado(),documentoanuladoLogic.getDocumentoAnulados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.documentoanuladoReturnGeneral.getDocumentoAnulado(),this.documentoanulados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDocumentoAnulado.repaint();
				
				//((AbstractTableModel) this.jTableDatosDocumentoAnulado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDocumentoAnulado();
			}
		}
	}
	
	public void actualizarVisualTableDatosDocumentoAnulado() throws Exception {
		
		DocumentoAnuladoModel documentoanuladoModel=(DocumentoAnuladoModel)this.jTableDatosDocumentoAnulado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			documentoanuladoModel.documentoanulados=this.documentoanuladoLogic.getDocumentoAnulados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			documentoanuladoModel.documentoanulados=this.documentoanulados;
		}
		
		
		((DocumentoAnuladoModel) this.jTableDatosDocumentoAnulado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDocumentoAnulado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdocumentoanuladoAnterior(),this.documentoanuladoLogic.getDocumentoAnulados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdocumentoanuladoAnterior(),this.documentoanulados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDocumentoAnulado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDocumentoAnulado(DocumentoAnulado documentoanulado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
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
										
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.documentoanulado,new Object(),generalEntityParameterGeneral,this.documentoanuladoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.documentoanuladoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DocumentoAnuladoConstantesFunciones.getClassesRelationshipsOfDocumentoAnulado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DocumentoAnuladoConstantesFunciones.getClassesRelationshipsFromStringsOfDocumentoAnulado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDocumentoAnulado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DocumentoAnuladoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.documentoanulado,new Object(),generalEntityParameterGeneral,this.documentoanuladoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDocumentoAnulado(DocumentoAnuladoBean documentoanuladoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDocumentoAnulado(ArrayList<Classe> classes,DocumentoAnuladoReturnGeneral documentoanuladoReturnGeneral,DocumentoAnuladoBean documentoanuladoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDocumentoAnulado(DocumentoAnulado documentoanulado,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.documentoanulado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDocumentoAnulado = new DocumentoAnuladoDetalleFormJInternalFrame(jDesktopPane,this.documentoanuladoSessionBean.getConGuardarRelaciones(),this.documentoanuladoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.setVisible(false);
		this.jInternalFrameDetalleFormDocumentoAnulado.setSelected(false);						
		
		this.jInternalFrameDetalleFormDocumentoAnulado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDocumentoAnulado.documentoanuladoLogic=this.documentoanuladoLogic;
		
		this.cargarCombosFrameForeignKeyDocumentoAnulado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDocumentoAnulado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDocumentoAnulado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDocumentoAnulado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDocumentoAnulado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDocumentoAnulado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDocumentoAnulado"));
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonModificarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"ModificarDocumentoAnulado"));

		
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonModificarToolBarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"ModificarToolBarDocumentoAnulado"));
					
		this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemModificarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"MenuItemModificarDocumentoAnulado"));		
		
		
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonActualizarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"ActualizarDocumentoAnulado"));
		
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonActualizarToolBarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDocumentoAnulado"));
						
		this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemActualizarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDocumentoAnulado"));		
		
		
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonEliminarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"EliminarDocumentoAnulado"));
		
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonEliminarToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"EliminarToolBarDocumentoAnulado"));
								
		this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemEliminarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDocumentoAnulado"));		
		
		
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonCancelarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"CancelarDocumentoAnulado"));
		
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonCancelarToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"CancelarToolBarDocumentoAnulado"));
					
		this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemCancelarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDocumentoAnulado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemDetalleCerrarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDocumentoAnulado"));		
		
		
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonGuardarCambiosToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDocumentoAnulado"));
		
		
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonGuardarCambiosToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDocumentoAnulado"));
		
		
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDocumentoAnulado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonidDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"idDocumentoAnuladoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_empresaDocumentoAnuladoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDocumentoAnuladoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_empresaDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDocumentoAnuladoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_periodo_declaraDocumentoAnuladoUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraDocumentoAnuladoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_periodo_declaraDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraDocumentoAnuladoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_moduloDocumentoAnuladoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloDocumentoAnuladoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_moduloDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloDocumentoAnuladoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_tipo_comprobanteDocumentoAnuladoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteDocumentoAnuladoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteDocumentoAnuladoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonnumeroDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"numeroDocumentoAnuladoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonserieDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"serieDocumentoAnuladoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonautorizacionDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"autorizacionDocumentoAnuladoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonfecha_anulacionDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_anulacionDocumentoAnuladoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDocumentoAnulado.jTabbedPaneRelacionesDocumentoAnulado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDocumentoAnulado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDocumentoAnulado"));
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDocumentoAnulado"));
		}
		
		this.jTableDatosDocumentoAnulado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDocumentoAnulado"));
		
		this.jTableDatosDocumentoAnulado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDocumentoAnulado"));
		
		this.jButtonNuevoDocumentoAnulado.addActionListener(new ButtonActionListener(this,"NuevoDocumentoAnulado"));
		
		this.jButtonDuplicarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"DuplicarDocumentoAnulado"));
		
		this.jButtonCopiarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"CopiarDocumentoAnulado"));
		
		this.jButtonVerFormDocumentoAnulado.addActionListener(new ButtonActionListener(this,"VerFormDocumentoAnulado"));
		
		
		this.jButtonNuevoToolBarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"NuevoToolBarDocumentoAnulado"));
			
		this.jButtonDuplicarToolBarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDocumentoAnulado"));
			
		this.jMenuItemNuevoDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDocumentoAnulado"));
			
		this.jMenuItemDuplicarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDocumentoAnulado"));		
		
		
		this.jButtonNuevoRelacionesDocumentoAnulado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDocumentoAnulado"));
		
		
		this.jButtonNuevoRelacionesToolBarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDocumentoAnulado"));
			
		this.jMenuItemNuevoRelacionesDocumentoAnulado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDocumentoAnulado"));		
		
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonModificarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"ModificarDocumentoAnulado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonModificarToolBarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"ModificarToolBarDocumentoAnulado"));
			
			this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemModificarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"MenuItemModificarDocumentoAnulado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonActualizarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"ActualizarDocumentoAnulado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonActualizarToolBarDocumentoAnulado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDocumentoAnulado"));
				
			this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemActualizarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDocumentoAnulado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonEliminarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"EliminarDocumentoAnulado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonEliminarToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"EliminarToolBarDocumentoAnulado"));
						
			this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemEliminarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDocumentoAnulado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonCancelarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"CancelarDocumentoAnulado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonCancelarToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"CancelarToolBarDocumentoAnulado"));
			
			this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemCancelarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDocumentoAnulado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDocumentoAnulado"));		
		
		
		this.jButtonCerrarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"CerrarDocumentoAnulado"));
		
		
		this.jButtonCerrarToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"CerrarToolBarDocumentoAnulado"));
			
		this.jMenuItemCerrarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDocumentoAnulado"));
			
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jMenuItemDetalleCerrarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDocumentoAnulado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonGuardarCambiosDocumentoAnulado.addActionListener (new ButtonActionListener(this,"GuardarCambiosDocumentoAnulado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jButtonGuardarCambiosToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDocumentoAnulado"));
		}
		
		this.jButtonCopiarToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"CopiarToolBarDocumentoAnulado"));
			
		this.jButtonVerFormToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"VerFormToolBarDocumentoAnulado"));
		
		this.jMenuItemGuardarCambiosDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDocumentoAnulado"));
			
		this.jMenuItemCopiarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDocumentoAnulado"));		
		
		this.jMenuItemVerFormDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDocumentoAnulado"));		
		
		
		this.jButtonGuardarCambiosTablaDocumentoAnulado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDocumentoAnulado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDocumentoAnulado"));
			
		this.jMenuItemGuardarCambiosTablaDocumentoAnulado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDocumentoAnulado"));		
		
		
		
		this.jButtonRecargarInformacionDocumentoAnulado.addActionListener (new ButtonActionListener(this,"RecargarInformacionDocumentoAnulado"));
					
		this.jButtonRecargarInformacionToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDocumentoAnulado"));
		
		this.jMenuItemRecargarInformacionDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDocumentoAnulado"));		
		
		
		
		this.jButtonAnterioresDocumentoAnulado.addActionListener (new ButtonActionListener(this,"AnterioresDocumentoAnulado"));
		
		
		this.jButtonAnterioresToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDocumentoAnulado"));
		
		this.jMenuItemAnterioresDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDocumentoAnulado"));		
		
		
		this.jButtonSiguientesDocumentoAnulado.addActionListener (new ButtonActionListener(this,"SiguientesDocumentoAnulado"));
		
		
		this.jButtonSiguientesToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDocumentoAnulado"));
			
		this.jMenuItemSiguientesDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDocumentoAnulado"));
			
		this.jMenuItemAbrirOrderByDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDocumentoAnulado"));
			
		this.jMenuItemMostrarOcultarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDocumentoAnulado"));
			
		this.jMenuItemDetalleAbrirOrderByDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDocumentoAnulado"));
			
		this.jMenuItemDetalleMostarOcultarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDocumentoAnulado"));		
		
		
		this.jButtonNuevoGuardarCambiosDocumentoAnulado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDocumentoAnulado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDocumentoAnulado"));
			
		this.jMenuItemNuevoGuardarCambiosDocumentoAnulado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDocumentoAnulado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDocumentoAnulado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDocumentoAnulado"));

		this.jCheckBoxSeleccionadosDocumentoAnulado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDocumentoAnulado"));
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDocumentoAnulado"));
		}
		
		
		this.jComboBoxTiposRelacionesDocumentoAnulado.addActionListener (new ButtonActionListener(this,"TiposRelacionesDocumentoAnulado"));
			
		this.jComboBoxTiposAccionesDocumentoAnulado.addActionListener (new ButtonActionListener(this,"TiposAccionesDocumentoAnulado"));
					
		this.jComboBoxTiposSeleccionarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDocumentoAnulado"));
			
		this.jTextFieldValorCampoGeneralDocumentoAnulado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDocumentoAnulado"));		
		
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonidDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"idDocumentoAnuladoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_empresaDocumentoAnuladoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDocumentoAnuladoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_empresaDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDocumentoAnuladoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_periodo_declaraDocumentoAnuladoUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraDocumentoAnuladoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_periodo_declaraDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraDocumentoAnuladoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_moduloDocumentoAnuladoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloDocumentoAnuladoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_moduloDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloDocumentoAnuladoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_tipo_comprobanteDocumentoAnuladoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteDocumentoAnuladoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteDocumentoAnuladoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonnumeroDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"numeroDocumentoAnuladoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonserieDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"serieDocumentoAnuladoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonautorizacionDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"autorizacionDocumentoAnuladoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonfecha_anulacionDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_anulacionDocumentoAnuladoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPeriodoDeclaraDocumentoAnulado.addActionListener(new ButtonActionListener(this,"FK_IdPeriodoDeclaraDocumentoAnulado"));

			this.jButtonFK_IdTipoComprobanteDocumentoAnulado.addActionListener(new ButtonActionListener(this,"FK_IdTipoComprobanteDocumentoAnulado"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDocumentoAnulado!=null) {
				this.jInternalFrameReporteDinamicoDocumentoAnulado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDocumentoAnulado"));
				this.jInternalFrameReporteDinamicoDocumentoAnulado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDocumentoAnulado"));
				this.jInternalFrameReporteDinamicoDocumentoAnulado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDocumentoAnulado"));
			}
			
			//this.jButtonCerrarReporteDinamicoDocumentoAnulado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDocumentoAnulado"));				
			//this.jButtonGenerarReporteDinamicoDocumentoAnulado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDocumentoAnulado"));
			//this.jButtonGenerarExcelReporteDinamicoDocumentoAnulado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDocumentoAnulado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDocumentoAnulado!=null) {
				this.jInternalFrameImportacionDocumentoAnulado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDocumentoAnulado"));
				this.jInternalFrameImportacionDocumentoAnulado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDocumentoAnulado"));
				this.jInternalFrameImportacionDocumentoAnulado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDocumentoAnulado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDocumentoAnulado.addActionListener (new ButtonActionListener(this,"AbrirOrderByDocumentoAnulado"));
			
			this.jButtonAbrirOrderByToolBarDocumentoAnulado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDocumentoAnulado"));			
			
			if(this.jInternalFrameOrderByDocumentoAnulado!=null) {
				this.jInternalFrameOrderByDocumentoAnulado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDocumentoAnulado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDocumentoAnulado.jTabbedPaneRelacionesDocumentoAnulado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDocumentoAnulado"));
		
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
            		closingInternalFrameDocumentoAnulado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDocumentoAnulado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDocumentoAnulado = (JInternalFrameBase)event.getSource();
	            	
	            DocumentoAnuladoBeanSwingJInternalFrame jInternalFrameParent=(DocumentoAnuladoBeanSwingJInternalFrame)jInternalFrameDetalleFormDocumentoAnulado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDocumentoAnuladoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDocumentoAnulado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDocumentoAnuladoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDocumentoAnulado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDocumentoAnulado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDocumentoAnuladoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDocumentoAnuladoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDocumentoAnuladoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDocumentoAnulado";
		inputMap = this.jButtonNuevoDocumentoAnulado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDocumentoAnulado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDocumentoAnuladoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDocumentoAnuladoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDocumentoAnuladoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDocumentoAnuladoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDocumentoAnulado";
		inputMap = this.jButtonNuevoRelacionesDocumentoAnulado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDocumentoAnulado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDocumentoAnuladoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDocumentoAnulado";
		inputMap = this.jButtonModificarDocumentoAnulado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDocumentoAnulado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDocumentoAnuladoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDocumentoAnulado";
		inputMap = this.jButtonActualizarDocumentoAnulado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDocumentoAnulado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDocumentoAnuladoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDocumentoAnulado";
		inputMap = this.jButtonEliminarDocumentoAnulado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDocumentoAnulado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDocumentoAnuladoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDocumentoAnulado";
		inputMap = this.jButtonCancelarDocumentoAnulado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDocumentoAnulado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDocumentoAnuladoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDocumentoAnulado";
		inputMap = this.jButtonCerrarDocumentoAnulado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDocumentoAnulado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDocumentoAnuladoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonGuardarCambiosDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDocumentoAnulado";
		inputMap = this.jInternalFrameDetalleFormDocumentoAnulado.jButtonGuardarCambiosDocumentoAnulado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonGuardarCambiosDocumentoAnulado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDocumentoAnuladoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDocumentoAnulado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDocumentoAnuladoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDocumentoAnulado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDocumentoAnuladoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDocumentoAnulado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDocumentoAnuladoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDocumentoAnulado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDocumentoAnuladoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonidDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"idDocumentoAnuladoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_empresaDocumentoAnuladoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDocumentoAnuladoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_empresaDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDocumentoAnuladoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_periodo_declaraDocumentoAnuladoUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraDocumentoAnuladoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_periodo_declaraDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraDocumentoAnuladoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_moduloDocumentoAnuladoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloDocumentoAnuladoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_moduloDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloDocumentoAnuladoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_tipo_comprobanteDocumentoAnuladoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteDocumentoAnuladoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteDocumentoAnuladoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonnumeroDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"numeroDocumentoAnuladoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonserieDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"serieDocumentoAnuladoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonautorizacionDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"autorizacionDocumentoAnuladoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDocumentoAnulado.jButtonfecha_anulacionDocumentoAnuladoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_anulacionDocumentoAnuladoBusqueda"));
		
		
		this.jButtonFK_IdPeriodoDeclaraDocumentoAnulado.addActionListener(new ButtonActionListener(this,"FK_IdPeriodoDeclaraDocumentoAnulado"));

		this.jButtonFK_IdTipoComprobanteDocumentoAnulado.addActionListener(new ButtonActionListener(this,"FK_IdTipoComprobanteDocumentoAnulado"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDocumentoAnulado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDocumentoAnuladoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDocumentoAnuladoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDocumentoAnulado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDocumentoAnulado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DocumentoAnulado documentoanuladoAux:this.documentoanuladoLogic.getDocumentoAnulados()) {
					documentoanuladoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DocumentoAnulado documentoanuladoAux:documentoanulados) {
					documentoanuladoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDocumentoAnuladoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDocumentoAnulado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DocumentoAnulado documentoanuladoAux:this.documentoanuladoLogic.getDocumentoAnulados()) {
						documentoanuladoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DocumentoAnulado documentoanuladoAux:documentoanulados) {
						documentoanuladoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DocumentoAnulado documentoanuladoAux:this.documentoanuladoLogic.getDocumentoAnulados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DocumentoAnulado documentoanuladoAux:documentoanulados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDocumentoAnulado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDocumentoAnulado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDocumentoAnulado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDocumentoAnuladoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDocumentoAnulado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDocumentoAnulado.getSelectedRows();
			
			DocumentoAnulado documentoanuladoLocal=new DocumentoAnulado();
			
			//this.seleccionarTodosDocumentoAnulado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					documentoanuladoLocal =(DocumentoAnulado) this.documentoanuladoLogic.getDocumentoAnulados().toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					documentoanuladoLocal =(DocumentoAnulado) this.documentoanulados.toArray()[this.jTableDatosDocumentoAnulado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				documentoanuladoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DocumentoAnulado documentoanuladoAux:this.documentoanuladoLogic.getDocumentoAnulados()) {
						documentoanuladoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DocumentoAnulado documentoanuladoAux:documentoanulados) {
						documentoanuladoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDocumentoAnulado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDocumentoAnulado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDocumentoAnulado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDocumentoAnulado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDocumentoAnuladoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDocumentoAnuladoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDocumentoAnuladoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDocumentoAnulado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDocumentoAnulado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DocumentoAnulado documentoanuladoAux:this.documentoanuladoLogic.getDocumentoAnulados()) {
				
						if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							documentoanuladoAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							documentoanuladoAux.setserie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION)) {
							existe=true;
							documentoanuladoAux.setautorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION)) {
							existe=true;
							documentoanuladoAux.setfecha_anulacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DocumentoAnulado documentoanuladoAux:documentoanulados) {
					
						if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							documentoanuladoAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							documentoanuladoAux.setserie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION)) {
							existe=true;
							documentoanuladoAux.setautorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION)) {
							existe=true;
							documentoanuladoAux.setfecha_anulacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDocumentoAnulado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDocumentoAnuladoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDocumentoAnulado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDocumentoAnulado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDocumentoAnulado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDocumentoAnulado) {				
					conSplash=true;//false;										
					
					//this.startProcessDocumentoAnulado(conSplash);
				
					this.generarReporteDocumentoAnuladosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDocumentoAnulado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDocumentoAnuladosSeleccionados();
				//this.jComboBoxTiposAccionesDocumentoAnulado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDocumentoAnuladosSeleccionados(false);
				//this.jComboBoxTiposAccionesDocumentoAnulado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDocumentoAnuladosSeleccionados(true);
				//this.jComboBoxTiposAccionesDocumentoAnulado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDocumentoAnulado();
				
				this.exportarDocumentoAnuladosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDocumentoAnulado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDocumentoAnulados();
				//this.importarDocumentoAnulados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDocumentoAnulado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDocumentoAnulado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDocumentoAnuladosSeleccionados();
				//this.jComboBoxTiposAccionesDocumentoAnulado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Documento Anulado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDocumentoAnulado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDocumentoAnulado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDocumentoAnulado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Documento Anulado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDocumentoAnulado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.setSelectedIndex(0);					
				}	
			} 			
			else if(DocumentoAnuladoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDocumentoAnulado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDocumentoAnulado(conSplash);
					
						//this.actualizarParametrosGeneralDocumentoAnulado();
						
						this.generarReporteProcesoAccionDocumentoAnuladosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDocumentoAnulado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DocumentoAnuladoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Documento AnuladoS SELECCIONADOS?", "MANTENIMIENTO DE Documento Anulado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDocumentoAnulado();
				
						this.actualizarParametrosGeneralDocumentoAnulado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.documentoanuladoReturnGeneral=documentoanuladoLogic.procesarAccionDocumentoAnuladosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.documentoanuladoLogic.getDocumentoAnulados(),this.documentoanuladoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDocumentoAnuladoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDocumentoAnulado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDocumentoAnulado();
					
					DocumentoAnuladoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDocumentoAnuladoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDocumentoAnulado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxTiposAccionesFormularioDocumentoAnulado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDocumentoAnulado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDocumentoAnuladoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDocumentoAnulado();
			
			if(this.jInternalFrameDetalleFormDocumentoAnulado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();		
			DocumentoAnulado documentoanulado=new DocumentoAnulado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDocumentoAnulado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDocumentoAnulado.getSelectedItem();
			
			
			
			
			documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(true);
			//this.sTipoAccion;
			
			if(documentoanuladosSeleccionados.size()==1) {
				for(DocumentoAnulado documentoanuladoAux:documentoanuladosSeleccionados) {
					documentoanulado=documentoanuladoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDocumentoAnulado();
			
      		//this.finishProcessDocumentoAnulado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDocumentoAnuladoReturnGeneral() throws Exception {
		if(this.documentoanuladoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.documentoanuladoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.documentoanuladoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.documentoanuladoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.documentoanuladoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.documentoanuladoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDocumentoAnulado(false);
		}
		
		if(this.documentoanuladoReturnGeneral.getConRetornoLista() || this.documentoanuladoReturnGeneral.getConRetornoObjeto()) {
			if(this.documentoanuladoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.documentoanuladoLogic.setDocumentoAnulados(this.documentoanuladoReturnGeneral.getDocumentoAnulados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.documentoanuladoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.documentoanuladoLogic.setDocumentoAnulado(this.documentoanuladoReturnGeneral.getDocumentoAnulado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDocumentoAnulado(false);
		}
	}
	
	public void actualizarParametrosGeneralDocumentoAnulado() throws Exception {
		
		
	}
	
	public ArrayList<DocumentoAnulado> getDocumentoAnuladosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDocumentoAnulado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DocumentoAnulado documentoanuladoAux:documentoanuladoLogic.getDocumentoAnulados()) {
					if(documentoanuladoAux.getIsSelected()) {
						documentoanuladosSeleccionados.add(documentoanuladoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DocumentoAnulado documentoanuladoAux:this.documentoanulados) {
					if(documentoanuladoAux.getIsSelected()) {
						documentoanuladosSeleccionados.add(documentoanuladoAux);				
					}
				}
			}
			
			if(documentoanuladosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						documentoanuladosSeleccionados.addAll(this.documentoanuladoLogic.getDocumentoAnulados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						documentoanuladosSeleccionados.addAll(this.documentoanulados);				
					}
				}
			}
		} else {
			documentoanuladosSeleccionados.add(this.documentoanulado);
		}
		
		return documentoanuladosSeleccionados;
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
	
	public void generarReporteDocumentoAnuladosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDocumentoAnuladosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDocumentoAnuladosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDocumentoAnuladosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDocumentoAnuladosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Documento Anulado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDocumentoAnuladosSeleccionados() throws Exception {
		ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();		
		
		documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDocumentoAnulados("Todos",documentoanuladosSeleccionados);
		
	}	
	
	public void generarReporteNormalDocumentoAnuladosSeleccionados() throws Exception {
		ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();		
		
		documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDocumentoAnulados("Todos",documentoanuladosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDocumentoAnuladosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();
		
		documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDocumentoAnulados("Todos",documentoanuladosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDocumentoAnuladosSeleccionados() throws Exception {
		ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDocumentoAnulado();
		
		
		documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDocumentoAnulado();
		
		
		//this.generarReporteDocumentoAnulados("Todos",documentoanuladosSeleccionados ,documentoanuladoImplementable,documentoanuladoImplementableHome);
	}
	
	public void mostrarImportacionDocumentoAnulados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDocumentoAnulado();
		
		this.abrirFrameImportacionDocumentoAnulado();		
		
			
		//this.generarReporteDocumentoAnulados("Todos",documentoanuladosSeleccionados ,documentoanuladoImplementable,documentoanuladoImplementableHome);
	}
	
	public void importarDocumentoAnulados() throws Exception {		
	
	}
	
	public void exportarDocumentoAnuladosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDocumentoAnuladosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDocumentoAnuladosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDocumentoAnuladosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Documento Anulado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDocumentoAnuladosSeleccionados() throws Exception {
		ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();		
		
		documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"documentoanulado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDocumentoAnulado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DocumentoAnulado documentoanuladoAux:documentoanuladosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDocumentoAnulado(documentoanuladoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//documentoanuladoAux.setsDetalleGeneralEntityReporte(documentoanuladoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Documento Anulado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDocumentoAnulado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DocumentoAnuladoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DocumentoAnuladoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DocumentoAnuladoConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DocumentoAnuladoConstantesFunciones.LABEL_SERIE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDocumentoAnulado(DocumentoAnulado documentoanulado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=documentoanulado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=documentoanulado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=documentoanulado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=documentoanulado.getperiododeclara_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=documentoanulado.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=documentoanulado.gettipocomprobante_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=documentoanulado.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=documentoanulado.getserie();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=documentoanulado.getautorizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=documentoanulado.getfecha_anulacion().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDocumentoAnuladosSeleccionados() throws Exception {
		ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();		
		
		documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"documentoanulado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DocumentoAnulados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDocumentoAnulado(row);				
				iRow++;
			}				
			
			for(DocumentoAnulado documentoanuladoAux:documentoanuladosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDocumentoAnulado(documentoanuladoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Documento Anulado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDocumentoAnuladosSeleccionados() throws Exception {
		ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();		
		
		documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"documentoanulado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("documentoanulados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("documentoanulado");
			//elementRoot.appendChild(element);
		
			for(DocumentoAnulado documentoanuladoAux:documentoanuladosSeleccionados) {
				element = document.createElement("documentoanulado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDocumentoAnulado(documentoanuladoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Documento Anulado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDocumentoAnulado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA);
		cell = row.createCell(iColumn++);cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_SERIE);
		cell = row.createCell(iColumn++);cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDocumentoAnulado(DocumentoAnulado documentoanulado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(documentoanulado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(documentoanulado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(documentoanulado.getperiododeclara_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(documentoanulado.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(documentoanulado.gettipocomprobante_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(documentoanulado.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(documentoanulado.getserie());
		cell = row.createCell(iColumn++);cell.setCellValue(documentoanulado.getautorizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(documentoanulado.getfecha_anulacion());				
	}
	
	public void setFilaDatosExportarXmlDocumentoAnulado(DocumentoAnulado documentoanulado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DocumentoAnuladoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(documentoanulado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DocumentoAnuladoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(documentoanulado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DocumentoAnuladoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(documentoanulado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementperiododeclara_descripcion = document.createElement(DocumentoAnuladoConstantesFunciones.IDPERIODODECLARA);
		elementperiododeclara_descripcion.appendChild(document.createTextNode(documentoanulado.getperiododeclara_descripcion()));
		element.appendChild(elementperiododeclara_descripcion);

		Element elementmodulo_descripcion = document.createElement(DocumentoAnuladoConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(documentoanulado.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementtipocomprobante_descripcion = document.createElement(DocumentoAnuladoConstantesFunciones.IDTIPOCOMPROBANTE);
		elementtipocomprobante_descripcion.appendChild(document.createTextNode(documentoanulado.gettipocomprobante_descripcion()));
		element.appendChild(elementtipocomprobante_descripcion);

		Element elementnumero = document.createElement(DocumentoAnuladoConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(documentoanulado.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementserie = document.createElement(DocumentoAnuladoConstantesFunciones.SERIE);
		elementserie.appendChild(document.createTextNode(documentoanulado.getserie().trim()));
		element.appendChild(elementserie);

		Element elementautorizacion = document.createElement(DocumentoAnuladoConstantesFunciones.AUTORIZACION);
		elementautorizacion.appendChild(document.createTextNode(documentoanulado.getautorizacion().trim()));
		element.appendChild(elementautorizacion);

		Element elementfecha_anulacion = document.createElement(DocumentoAnuladoConstantesFunciones.FECHAANULACION);
		elementfecha_anulacion.appendChild(document.createTextNode(documentoanulado.getfecha_anulacion().toString().trim()));
		element.appendChild(elementfecha_anulacion);
	}
	
	public void generarReporteGroupGenericoDocumentoAnuladosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DocumentoAnulado> documentoanuladosSeleccionados=new ArrayList<DocumentoAnulado>();
		
		documentoanuladosSeleccionados=this.getDocumentoAnuladosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDocumentoAnulado(documentoanuladosSeleccionados);
		
		this.generarReporteDocumentoAnulados("Todos",documentoanuladosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDocumentoAnulado(ArrayList<DocumentoAnulado> documentoanuladosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DocumentoAnulado documentoanuladoAux:documentoanuladosSeleccionados) {
				documentoanuladoAux.setsDetalleGeneralEntityReporte(documentoanuladoAux.toString());
			
				if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					documentoanuladoAux.setsDescripcionGeneralEntityReporte1(documentoanuladoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA)) {
					existe=true;
					documentoanuladoAux.setsDescripcionGeneralEntityReporte1(documentoanuladoAux.getperiododeclara_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					documentoanuladoAux.setsDescripcionGeneralEntityReporte1(documentoanuladoAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE)) {
					existe=true;
					documentoanuladoAux.setsDescripcionGeneralEntityReporte1(documentoanuladoAux.gettipocomprobante_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					documentoanuladoAux.setsDescripcionGeneralEntityReporte1(documentoanuladoAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_SERIE)) {
					existe=true;
					documentoanuladoAux.setsDescripcionGeneralEntityReporte1(documentoanuladoAux.getserie());
				}
				 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION)) {
					existe=true;
					documentoanuladoAux.setsDescripcionGeneralEntityReporte1(documentoanuladoAux.getautorizacion());
				}
				 else if(sTipoSeleccionar.equals(DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION)) {
					existe=true;
					documentoanuladoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(documentoanuladoAux.getfecha_anulacion()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DocumentoAnuladoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDocumentoAnulado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDocumentoAnulado=true;
				this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=true;
				this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=true;
			}
			
			this.isVisibilidadCeldaModificarDocumentoAnulado=false;
			this.isVisibilidadCeldaActualizarDocumentoAnulado=false;
			this.isVisibilidadCeldaEliminarDocumentoAnulado=false;
			this.isVisibilidadCeldaCancelarDocumentoAnulado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=true;
				} else {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDocumentoAnulado=false;
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=false;
			this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=false;
			this.isVisibilidadCeldaModificarDocumentoAnulado=false;
			this.isVisibilidadCeldaActualizarDocumentoAnulado=true;
			this.isVisibilidadCeldaEliminarDocumentoAnulado=false;
			this.isVisibilidadCeldaCancelarDocumentoAnulado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=true;
				} else {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDocumentoAnulado=false;
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=false;
			this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=false;
			this.isVisibilidadCeldaModificarDocumentoAnulado=false;
			this.isVisibilidadCeldaActualizarDocumentoAnulado=true;
			this.isVisibilidadCeldaEliminarDocumentoAnulado=true;
			this.isVisibilidadCeldaCancelarDocumentoAnulado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=true;
				} else {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDocumentoAnulado=false;
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=false;
			this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=false;
			this.isVisibilidadCeldaModificarDocumentoAnulado=false;
			this.isVisibilidadCeldaActualizarDocumentoAnulado=true;
			this.isVisibilidadCeldaEliminarDocumentoAnulado=false;
			this.isVisibilidadCeldaCancelarDocumentoAnulado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=false;
				} else {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDocumentoAnulado=true;
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=true;
			this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=true;
			this.isVisibilidadCeldaModificarDocumentoAnulado=false;
			this.isVisibilidadCeldaActualizarDocumentoAnulado=false;
			this.isVisibilidadCeldaEliminarDocumentoAnulado=false;
			this.isVisibilidadCeldaCancelarDocumentoAnulado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=true;
				} else {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDocumentoAnulado=false;
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=false;
			this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=false;
			this.isVisibilidadCeldaActualizarDocumentoAnulado=false;
			this.isVisibilidadCeldaEliminarDocumentoAnulado=false;
			this.isVisibilidadCeldaCancelarDocumentoAnulado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=false;
				} else {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDocumentoAnulado=false;
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=false;
			this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=false;
			this.isVisibilidadCeldaModificarDocumentoAnulado=true;
			this.isVisibilidadCeldaActualizarDocumentoAnulado=false;
			this.isVisibilidadCeldaEliminarDocumentoAnulado=false;
			this.isVisibilidadCeldaCancelarDocumentoAnulado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=false;
				} else {
					this.isVisibilidadCeldaGuardarDocumentoAnulado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DocumentoAnuladoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDocumentoAnulado=true;
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=true;
			this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=true;
		} else {
			this.actualizarEstadoPanelsDocumentoAnulado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDocumentoAnulado=false;
			//this.isVisibilidadCeldaVerFormDocumentoAnulado=false;
			this.isVisibilidadCeldaDuplicarDocumentoAnulado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!documentoanuladoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=false;
		} else {
			this.isVisibilidadCeldaNuevoDocumentoAnulado=false;
			this.isVisibilidadCeldaGuardarCambiosDocumentoAnulado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(documentoanuladoSessionBean.getEsGuardarRelacionado()) {
			if(!documentoanuladoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=false;												
			}
			
			this.jButtonCerrarDocumentoAnulado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDocumentoAnulado=false;
		}
		
		if(!this.permiteMantenimiento(this.documentoanulado)) {
			this.isVisibilidadCeldaActualizarDocumentoAnulado=false;
			this.isVisibilidadCeldaEliminarDocumentoAnulado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDocumentoAnulado() {
	}
	
	public void actualizarEstadoPanelsDocumentoAnulado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDocumentoAnulado!=null) {
				this.jScrollPanelDatosEdicionDocumentoAnulado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDocumentoAnulado!=null) {
				this.jTabbedPaneBusquedasDocumentoAnulado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDocumentoAnulado!=null) {
				this.jScrollPanelDatosDocumentoAnulado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDocumentoAnulado!=null) {
				this.jPanelPaginacionDocumentoAnulado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDocumentoAnulado!=null) {
				this.jPanelParametrosReportesDocumentoAnulado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDocumentoAnulado!=null) {
				this.jScrollPanelDatosEdicionDocumentoAnulado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDocumentoAnulado!=null) {
				this.jTabbedPaneBusquedasDocumentoAnulado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDocumentoAnulado!=null) {
				this.jScrollPanelDatosDocumentoAnulado.setVisible(false);
			}
			
			if(this.jPanelPaginacionDocumentoAnulado!=null) {
				this.jPanelPaginacionDocumentoAnulado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDocumentoAnulado!=null) {
				this.jPanelParametrosReportesDocumentoAnulado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDocumentoAnulado!=null) {
				this.jScrollPanelDatosEdicionDocumentoAnulado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDocumentoAnulado!=null) {
				this.jTabbedPaneBusquedasDocumentoAnulado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDocumentoAnulado!=null) {
				this.jScrollPanelDatosDocumentoAnulado.setVisible(false);
			}
			
			if(this.jPanelPaginacionDocumentoAnulado!=null) {
				this.jPanelPaginacionDocumentoAnulado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDocumentoAnulado!=null) {
				this.jPanelParametrosReportesDocumentoAnulado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDocumentoAnulado!=null) {
				this.jScrollPanelDatosEdicionDocumentoAnulado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDocumentoAnulado!=null) {
				this.jTabbedPaneBusquedasDocumentoAnulado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDocumentoAnulado!=null) {
				this.jScrollPanelDatosDocumentoAnulado.setVisible(false);
			}
			
			if(this.jPanelPaginacionDocumentoAnulado!=null) {
				this.jPanelPaginacionDocumentoAnulado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDocumentoAnulado!=null) {
				this.jPanelParametrosReportesDocumentoAnulado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDocumentoAnulado!=null) {
				this.jScrollPanelDatosEdicionDocumentoAnulado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDocumentoAnulado!=null) {
				this.jTabbedPaneBusquedasDocumentoAnulado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDocumentoAnulado!=null) {
				this.jScrollPanelDatosDocumentoAnulado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDocumentoAnulado!=null) {
				this.jPanelPaginacionDocumentoAnulado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDocumentoAnulado!=null) {
				this.jPanelParametrosReportesDocumentoAnulado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDocumentoAnulado!=null) {
				this.jScrollPanelDatosEdicionDocumentoAnulado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDocumentoAnulado!=null) {
				this.jTabbedPaneBusquedasDocumentoAnulado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDocumentoAnulado!=null) {
				this.jScrollPanelDatosDocumentoAnulado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDocumentoAnulado!=null) {
				this.jPanelPaginacionDocumentoAnulado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDocumentoAnulado!=null) {
				this.jPanelParametrosReportesDocumentoAnulado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDocumentoAnulado!=null) {
				this.jScrollPanelDatosEdicionDocumentoAnulado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDocumentoAnulado!=null) {
				this.jTabbedPaneBusquedasDocumentoAnulado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDocumentoAnulado!=null) {
				this.jScrollPanelDatosDocumentoAnulado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDocumentoAnulado!=null) {
				this.jPanelPaginacionDocumentoAnulado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDocumentoAnulado!=null) {
				this.jPanelParametrosReportesDocumentoAnulado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDocumentoAnulado!=null) {
					this.jTabbedPaneBusquedasDocumentoAnulado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDocumentoAnulado!=null) {
				this.jPanelParametrosReportesDocumentoAnulado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDocumentoAnulado!=null) {
				this.jTabbedPaneBusquedasDocumentoAnulado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDocumentoAnulado!=null) {
				this.jPanelParametrosReportesDocumentoAnulado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdPeriodoDeclara=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPeriodoDeclara) {this.jTabbedPaneBusquedasDocumentoAnulado.remove(jPanelFK_IdPeriodoDeclaraDocumentoAnulado);}

			this.isVisibilidadFK_IdTipoComprobante=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoComprobante) {this.jTabbedPaneBusquedasDocumentoAnulado.remove(jPanelFK_IdTipoComprobanteDocumentoAnulado);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodoDeclara(Boolean isParaPeriodoDeclara){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoDeclaraNegation=!isParaPeriodoDeclara;

			this.isVisibilidadFK_IdPeriodoDeclara=isParaPeriodoDeclara;
			if(!this.isVisibilidadFK_IdPeriodoDeclara) {this.jTabbedPaneBusquedasDocumentoAnulado.remove(jPanelFK_IdPeriodoDeclaraDocumentoAnulado);}

			this.isVisibilidadFK_IdTipoComprobante=isParaPeriodoDeclaraNegation;
			if(!this.isVisibilidadFK_IdTipoComprobante) {this.jTabbedPaneBusquedasDocumentoAnulado.remove(jPanelFK_IdTipoComprobanteDocumentoAnulado);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadFK_IdPeriodoDeclara=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdPeriodoDeclara) {this.jTabbedPaneBusquedasDocumentoAnulado.remove(jPanelFK_IdPeriodoDeclaraDocumentoAnulado);}

			this.isVisibilidadFK_IdTipoComprobante=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoComprobante) {this.jTabbedPaneBusquedasDocumentoAnulado.remove(jPanelFK_IdTipoComprobanteDocumentoAnulado);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoComprobante(Boolean isParaTipoComprobante){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoComprobanteNegation=!isParaTipoComprobante;

			this.isVisibilidadFK_IdPeriodoDeclara=isParaTipoComprobanteNegation;
			if(!this.isVisibilidadFK_IdPeriodoDeclara) {this.jTabbedPaneBusquedasDocumentoAnulado.remove(jPanelFK_IdPeriodoDeclaraDocumentoAnulado);}

			this.isVisibilidadFK_IdTipoComprobante=isParaTipoComprobante;
			if(!this.isVisibilidadFK_IdTipoComprobante) {this.jTabbedPaneBusquedasDocumentoAnulado.remove(jPanelFK_IdTipoComprobanteDocumentoAnulado);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DocumentoAnuladoSessionBean documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
		
		if(this.documentoanuladoSessionBean==null) {
			this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
		}
		
		this.documentoanuladoSessionBean.setsUltimaBusquedaDocumentoAnulado(this.getsAccionBusqueda());
		this.documentoanuladoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.documentoanuladoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			documentoanuladoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			documentoanuladoSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodoDeclara")) {
			documentoanuladoSessionBean.setid_periodo_declara(this.getid_periodo_declaraFK_IdPeriodoDeclara());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoComprobante")) {
			documentoanuladoSessionBean.setid_tipo_comprobante(this.getid_tipo_comprobanteFK_IdTipoComprobante());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DocumentoAnuladoSessionBean documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
		
		if(this.documentoanuladoSessionBean==null) {
			this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
		}
		
		if(this.documentoanuladoSessionBean.getsUltimaBusquedaDocumentoAnulado()!=null&&!this.documentoanuladoSessionBean.getsUltimaBusquedaDocumentoAnulado().equals("")) {
			this.setsAccionBusqueda(documentoanuladoSessionBean.getsUltimaBusquedaDocumentoAnulado());
			this.setiNumeroPaginacion(documentoanuladoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(documentoanuladoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(documentoanuladoSessionBean.getid_empresa());
				documentoanuladoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(documentoanuladoSessionBean.getid_modulo());
				documentoanuladoSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodoDeclara")) {
				this.setid_periodo_declaraFK_IdPeriodoDeclara(documentoanuladoSessionBean.getid_periodo_declara());
				documentoanuladoSessionBean.setid_periodo_declara(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoComprobante")) {
				this.setid_tipo_comprobanteFK_IdTipoComprobante(documentoanuladoSessionBean.getid_tipo_comprobante());
				documentoanuladoSessionBean.setid_tipo_comprobante(-1L);
			}
		}
		
		this.documentoanuladoSessionBean.setsUltimaBusquedaDocumentoAnulado("");
		this.documentoanuladoSessionBean.setiNumeroPaginacion(DocumentoAnuladoConstantesFunciones.INUMEROPAGINACION);
		this.documentoanuladoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDocumentoAnulado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDocumentoAnulado() {
		this.updateBorderResaltarBusquedasFormularioDocumentoAnulado();
		this.updateVisibilidadBusquedasFormularioDocumentoAnulado();
		this.updateHabilitarBusquedasFormularioDocumentoAnulado();
	}
	
	public void updateBorderResaltarBusquedasFormularioDocumentoAnulado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDocumentoAnulado.getComponents().length>0) {
	

		if(this.documentoanuladoConstantesFunciones.resaltarFK_IdPeriodoDeclaraDocumentoAnulado!=null) {
			index= this.jTabbedPaneBusquedasDocumentoAnulado.indexOfComponent(this.jPanelFK_IdPeriodoDeclaraDocumentoAnulado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDocumentoAnulado.getComponent(index);
				jPanel.setBorder(this.documentoanuladoConstantesFunciones.resaltarFK_IdPeriodoDeclaraDocumentoAnulado);
			}
		}

		if(this.documentoanuladoConstantesFunciones.resaltarFK_IdTipoComprobanteDocumentoAnulado!=null) {
			index= this.jTabbedPaneBusquedasDocumentoAnulado.indexOfComponent(this.jPanelFK_IdTipoComprobanteDocumentoAnulado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDocumentoAnulado.getComponent(index);
				jPanel.setBorder(this.documentoanuladoConstantesFunciones.resaltarFK_IdTipoComprobanteDocumentoAnulado);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDocumentoAnulado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDocumentoAnulado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDocumentoAnulado.indexOfComponent(this.jPanelFK_IdPeriodoDeclaraDocumentoAnulado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDocumentoAnulado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.documentoanuladoConstantesFunciones.mostrarFK_IdPeriodoDeclaraDocumentoAnulado);
			if(!this.documentoanuladoConstantesFunciones.mostrarFK_IdPeriodoDeclaraDocumentoAnulado && index>-1) {
				this.jTabbedPaneBusquedasDocumentoAnulado.remove(index);
			}

			index= this.jTabbedPaneBusquedasDocumentoAnulado.indexOfComponent(this.jPanelFK_IdTipoComprobanteDocumentoAnulado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDocumentoAnulado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.documentoanuladoConstantesFunciones.mostrarFK_IdTipoComprobanteDocumentoAnulado);
			if(!this.documentoanuladoConstantesFunciones.mostrarFK_IdTipoComprobanteDocumentoAnulado && index>-1) {
				this.jTabbedPaneBusquedasDocumentoAnulado.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDocumentoAnulado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDocumentoAnulado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDocumentoAnulado.indexOfComponent(this.jPanelFK_IdPeriodoDeclaraDocumentoAnulado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDocumentoAnulado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.documentoanuladoConstantesFunciones.activarFK_IdPeriodoDeclaraDocumentoAnulado);
				this.jTabbedPaneBusquedasDocumentoAnulado.setEnabledAt(index,this.documentoanuladoConstantesFunciones.activarFK_IdPeriodoDeclaraDocumentoAnulado);
			}

			index= this.jTabbedPaneBusquedasDocumentoAnulado.indexOfComponent(this.jPanelFK_IdTipoComprobanteDocumentoAnulado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDocumentoAnulado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.documentoanuladoConstantesFunciones.activarFK_IdTipoComprobanteDocumentoAnulado);
				this.jTabbedPaneBusquedasDocumentoAnulado.setEnabledAt(index,this.documentoanuladoConstantesFunciones.activarFK_IdTipoComprobanteDocumentoAnulado);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDocumentoAnulado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPeriodoDeclara")) {
			index= this.jTabbedPaneBusquedasDocumentoAnulado.indexOfComponent(this.jPanelFK_IdPeriodoDeclaraDocumentoAnulado);

			this.jTabbedPaneBusquedasDocumentoAnulado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDocumentoAnulado.getComponent(index);

			this.documentoanuladoConstantesFunciones.setResaltarFK_IdPeriodoDeclaraDocumentoAnulado(resaltar);

			jPanel.setBorder(this.documentoanuladoConstantesFunciones.resaltarFK_IdPeriodoDeclaraDocumentoAnulado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoComprobante")) {
			index= this.jTabbedPaneBusquedasDocumentoAnulado.indexOfComponent(this.jPanelFK_IdTipoComprobanteDocumentoAnulado);

			this.jTabbedPaneBusquedasDocumentoAnulado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDocumentoAnulado.getComponent(index);

			this.documentoanuladoConstantesFunciones.setResaltarFK_IdTipoComprobanteDocumentoAnulado(resaltar);

			jPanel.setBorder(this.documentoanuladoConstantesFunciones.resaltarFK_IdTipoComprobanteDocumentoAnulado);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDocumentoAnulado.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDocumentoAnulado() throws Exception {

		if(this.jInternalFrameDetalleFormDocumentoAnulado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDocumentoAnulado();
		this.updateVisibilidadResaltarControlesFormularioDocumentoAnulado();
		this.updateHabilitarResaltarControlesFormularioDocumentoAnulado();
		
	}
	
	public void updateBorderResaltarControlesFormularioDocumentoAnulado() throws Exception {
		if(this.jInternalFrameDetalleFormDocumentoAnulado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.documentoanuladoConstantesFunciones.resaltaridDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado!=null) {this.jInternalFrameDetalleFormDocumentoAnulado.jLabelidDocumentoAnulado.setBorder(this.documentoanuladoConstantesFunciones.resaltaridDocumentoAnulado);}
		if(this.documentoanuladoConstantesFunciones.resaltarid_empresaDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado!=null) {this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.setBorder(this.documentoanuladoConstantesFunciones.resaltarid_empresaDocumentoAnulado);}
		if(this.documentoanuladoConstantesFunciones.resaltarid_periodo_declaraDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado!=null) {this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.setBorder(this.documentoanuladoConstantesFunciones.resaltarid_periodo_declaraDocumentoAnulado);}
		if(this.documentoanuladoConstantesFunciones.resaltarid_moduloDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado!=null) {this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.setBorder(this.documentoanuladoConstantesFunciones.resaltarid_moduloDocumentoAnulado);}
		if(this.documentoanuladoConstantesFunciones.resaltarid_tipo_comprobanteDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado!=null) {this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.setBorder(this.documentoanuladoConstantesFunciones.resaltarid_tipo_comprobanteDocumentoAnulado);}
		if(this.documentoanuladoConstantesFunciones.resaltarnumeroDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado!=null) {this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldnumeroDocumentoAnulado.setBorder(this.documentoanuladoConstantesFunciones.resaltarnumeroDocumentoAnulado);}
		if(this.documentoanuladoConstantesFunciones.resaltarserieDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado!=null) {this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldserieDocumentoAnulado.setBorder(this.documentoanuladoConstantesFunciones.resaltarserieDocumentoAnulado);}
		if(this.documentoanuladoConstantesFunciones.resaltarautorizacionDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado!=null) {this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldautorizacionDocumentoAnulado.setBorder(this.documentoanuladoConstantesFunciones.resaltarautorizacionDocumentoAnulado);}
		if(this.documentoanuladoConstantesFunciones.resaltarfecha_anulacionDocumentoAnulado!=null && this.jInternalFrameDetalleFormDocumentoAnulado!=null) {this.jInternalFrameDetalleFormDocumentoAnulado.jDateChooserfecha_anulacionDocumentoAnulado.setBorder(this.documentoanuladoConstantesFunciones.resaltarfecha_anulacionDocumentoAnulado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDocumentoAnulado() throws Exception {		
		if(this.jInternalFrameDetalleFormDocumentoAnulado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
	
		//this.jInternalFrameDetalleFormDocumentoAnulado.jLabelidDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostraridDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jPanelidDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostraridDocumentoAnulado);
		//this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarid_empresaDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jPanelid_empresaDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarid_empresaDocumentoAnulado);
		//this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarid_periodo_declaraDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jPanelid_periodo_declaraDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarid_periodo_declaraDocumentoAnulado);
		//this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarid_moduloDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jPanelid_moduloDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarid_moduloDocumentoAnulado);
		//this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarid_tipo_comprobanteDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jPanelid_tipo_comprobanteDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarid_tipo_comprobanteDocumentoAnulado);
		//this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldnumeroDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarnumeroDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jPanelnumeroDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarnumeroDocumentoAnulado);
		//this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldserieDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarserieDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jPanelserieDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarserieDocumentoAnulado);
		//this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldautorizacionDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarautorizacionDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jPanelautorizacionDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarautorizacionDocumentoAnulado);
		//this.jInternalFrameDetalleFormDocumentoAnulado.jDateChooserfecha_anulacionDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarfecha_anulacionDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jPanelfecha_anulacionDocumentoAnulado.setVisible(this.documentoanuladoConstantesFunciones.mostrarfecha_anulacionDocumentoAnulado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDocumentoAnulado() throws Exception {
		if(this.jInternalFrameDetalleFormDocumentoAnulado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDocumentoAnulado!=null) {
	
		this.jInternalFrameDetalleFormDocumentoAnulado.jLabelidDocumentoAnulado.setEnabled(this.documentoanuladoConstantesFunciones.activaridDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_empresaDocumentoAnulado.setEnabled(this.documentoanuladoConstantesFunciones.activarid_empresaDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_periodo_declaraDocumentoAnulado.setEnabled(this.documentoanuladoConstantesFunciones.activarid_periodo_declaraDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_moduloDocumentoAnulado.setEnabled(this.documentoanuladoConstantesFunciones.activarid_moduloDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jComboBoxid_tipo_comprobanteDocumentoAnulado.setEnabled(this.documentoanuladoConstantesFunciones.activarid_tipo_comprobanteDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldnumeroDocumentoAnulado.setEnabled(this.documentoanuladoConstantesFunciones.activarnumeroDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldserieDocumentoAnulado.setEnabled(this.documentoanuladoConstantesFunciones.activarserieDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jTextFieldautorizacionDocumentoAnulado.setEnabled(this.documentoanuladoConstantesFunciones.activarautorizacionDocumentoAnulado);
		this.jInternalFrameDetalleFormDocumentoAnulado.jDateChooserfecha_anulacionDocumentoAnulado.setEnabled(this.documentoanuladoConstantesFunciones.activarfecha_anulacionDocumentoAnulado);
		}
	}
	
		
}