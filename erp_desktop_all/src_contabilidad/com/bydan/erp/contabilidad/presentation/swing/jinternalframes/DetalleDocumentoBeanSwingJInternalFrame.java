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

import com.bydan.erp.contabilidad.util.DetalleDocumentoConstantesFunciones;
import com.bydan.erp.contabilidad.util.DetalleDocumentoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.DetalleDocumentoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.DetalleDocumentoBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetalleDocumentoBeanSwingJInternalFrame extends DetalleDocumentoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleDocumentoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleDocumento> detalledocumentoValidator = new ClassValidator<DetalleDocumento>(DetalleDocumento.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleDocumento detalledocumento;	
	public DetalleDocumento detalledocumentoAux;
	public DetalleDocumento detalledocumentoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleDocumento detalledocumentoTotales;
	public Long idDetalleDocumentoActual;
	public Long iIdNuevoDetalleDocumento=0L;
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

	public String sFinalQueryComboTipoTransaccionModulo="";

	public List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey;

	public List<TipoTransaccionModulo> gettipotransaccionmodulosForeignKey() {
		return tipotransaccionmodulosForeignKey;
	}

	public void settipotransaccionmodulosForeignKey(List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey) {
		this.tipotransaccionmodulosForeignKey = tipotransaccionmodulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoTransaccionModulo tipotransaccionmoduloForeignKey;

	public TipoTransaccionModulo gettipotransaccionmoduloForeignKey() {
		return tipotransaccionmoduloForeignKey;
	}

	public void settipotransaccionmoduloForeignKey(TipoTransaccionModulo tipotransaccionmoduloForeignKey) {
		this.tipotransaccionmoduloForeignKey = tipotransaccionmoduloForeignKey;
	}

	public String sFinalQueryComboTipoDetalleDocumento="";

	public List<TipoDetalleDocumento> tipodetalledocumentosForeignKey;

	public List<TipoDetalleDocumento> gettipodetalledocumentosForeignKey() {
		return tipodetalledocumentosForeignKey;
	}

	public void settipodetalledocumentosForeignKey(List<TipoDetalleDocumento> tipodetalledocumentosForeignKey) {
		this.tipodetalledocumentosForeignKey = tipodetalledocumentosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDetalleDocumento tipodetalledocumentoForeignKey;

	public TipoDetalleDocumento gettipodetalledocumentoForeignKey() {
		return tipodetalledocumentoForeignKey;
	}

	public void settipodetalledocumentoForeignKey(TipoDetalleDocumento tipodetalledocumentoForeignKey) {
		this.tipodetalledocumentoForeignKey = tipodetalledocumentoForeignKey;
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
	
	public Boolean isPermisoTodoDetalleDocumento;
	public Boolean isPermisoNuevoDetalleDocumento;
	public Boolean isPermisoActualizarDetalleDocumento;
	public Boolean isPermisoActualizarOriginalDetalleDocumento;
	public Boolean isPermisoEliminarDetalleDocumento;
	public Boolean isPermisoGuardarCambiosDetalleDocumento;
	public Boolean isPermisoConsultaDetalleDocumento;
	public Boolean isPermisoBusquedaDetalleDocumento;
	public Boolean isPermisoReporteDetalleDocumento;
	public Boolean isPermisoPaginacionMedioDetalleDocumento;
	public Boolean isPermisoPaginacionAltoDetalleDocumento;
	public Boolean isPermisoPaginacionTodoDetalleDocumento;
	public Boolean isPermisoCopiarDetalleDocumento;
	public Boolean isPermisoVerFormDetalleDocumento;
	public Boolean isPermisoDuplicarDetalleDocumento;
	public Boolean isPermisoOrdenDetalleDocumento;
	
	
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
	
	public DetalleDocumentoParameterReturnGeneral detalledocumentoReturnGeneral;
	public DetalleDocumentoParameterReturnGeneral detalledocumentoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleDocumento=false;
	public Boolean esParaAccionDesdeFormularioDetalleDocumento=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleDocumentoSessionBeanAdditional detalledocumentoSessionBeanAdditional=null;
	
	public DetalleDocumentoSessionBeanAdditional getDetalleDocumentoSessionBeanAdditional() {
		return this.detalledocumentoSessionBeanAdditional;
	}
	
	public void setDetalleDocumentoSessionBeanAdditional(DetalleDocumentoSessionBeanAdditional detalledocumentoSessionBeanAdditional) {
		try {
			this.detalledocumentoSessionBeanAdditional=detalledocumentoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleDocumentoBeanSwingJInternalFrameAdditional detalledocumentoBeanSwingJInternalFrameAdditional=null;
	//public class DetalleDocumentoBeanSwingJInternalFrame
	
	public DetalleDocumentoBeanSwingJInternalFrameAdditional getDetalleDocumentoBeanSwingJInternalFrameAdditional() {
		return this.detalledocumentoBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleDocumentoBeanSwingJInternalFrameAdditional(DetalleDocumentoBeanSwingJInternalFrameAdditional detalledocumentoBeanSwingJInternalFrameAdditional) {
		try {
			this.detalledocumentoBeanSwingJInternalFrameAdditional=detalledocumentoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleDocumentoLogic detalledocumentoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleDocumento detalledocumentoBean;
	public DetalleDocumentoConstantesFunciones detalledocumentoConstantesFunciones;
	//public DetalleDocumentoParameterReturnGeneral detalledocumentoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ModuloLogic moduloLogic;
	public TipoTransaccionModuloLogic tipotransaccionmoduloLogic;
	public TipoDetalleDocumentoLogic tipodetalledocumentoLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleDocumento> detalledocumentos;	
	//public List<DetalleDocumento> detalledocumentosEliminados;
	//public List<DetalleDocumento> detalledocumentosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleDocumento=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleDocumento=true;
	public Boolean isVisibilidadCeldaCopiarDetalleDocumento=true;
	public Boolean isVisibilidadCeldaVerFormDetalleDocumento=true;
	public Boolean isVisibilidadCeldaOrdenDetalleDocumento=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleDocumento=false;
	public Boolean isVisibilidadCeldaModificarDetalleDocumento=false;
	public Boolean isVisibilidadCeldaActualizarDetalleDocumento=false;
	public Boolean isVisibilidadCeldaEliminarDetalleDocumento=false;
	public Boolean isVisibilidadCeldaCancelarDetalleDocumento=false;
	public Boolean isVisibilidadCeldaGuardarDetalleDocumento=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleDocumento=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion=false;
	public Boolean isVisibilidadFK_IdDetalleDocumento=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdTipoTransaccionModulo=false;
	
	public Long getiIdNuevoDetalleDocumento() {
		return this.iIdNuevoDetalleDocumento;
	}

	public void setiIdNuevoDetalleDocumento(Long iIdNuevoDetalleDocumento) {
		this.iIdNuevoDetalleDocumento = iIdNuevoDetalleDocumento;
	}
	
	public Long getidDetalleDocumentoActual() {
		return this.idDetalleDocumentoActual;
	}

	public void setidDetalleDocumentoActual(Long idDetalleDocumentoActual) {
		this.idDetalleDocumentoActual = idDetalleDocumentoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleDocumento getdetalledocumento() {
		return this.detalledocumento;
	}

	public void setdetalledocumento(DetalleDocumento detalledocumento) {
		this.detalledocumento = detalledocumento;
	}
	
	public DetalleDocumento getdetalledocumentoAux() {
		return this.detalledocumentoAux;
	}

	public void setdetalledocumentoAux(DetalleDocumento detalledocumentoAux) {
		this.detalledocumentoAux = detalledocumentoAux;
	}				
	
	public DetalleDocumento getdetalledocumentoAnterior() {
		return this.detalledocumentoAnterior;
	}

	public void setdetalledocumentoAnterior(DetalleDocumento detalledocumentoAnterior) {
		this.detalledocumentoAnterior = detalledocumentoAnterior;
	}	
	
	public DetalleDocumento getdetalledocumentoTotales() {
		return this.detalledocumentoTotales;
	}

	public void setdetalledocumentoTotales(DetalleDocumento detalledocumentoTotales) {
		this.detalledocumentoTotales = detalledocumentoTotales;
	}	
	
	public DetalleDocumento getdetalledocumentoBean() {
		return this.detalledocumentoBean;
	}

	public void setdetalledocumentoBean(DetalleDocumento detalledocumentoBean) {
		this.detalledocumentoBean = detalledocumentoBean;
	}	
	
	public DetalleDocumentoParameterReturnGeneral getdetalledocumentoReturnGeneral() {
		return this.detalledocumentoReturnGeneral;
	}

	public void setdetalledocumentoReturnGeneral(DetalleDocumentoParameterReturnGeneral detalledocumentoReturnGeneral) {
		this.detalledocumentoReturnGeneral = detalledocumentoReturnGeneral;
	}	
	
	
	public Long id_moduloBusquedaPorIdModuloPorIdTipoTransaccion=-1L;

	public Long getid_moduloBusquedaPorIdModuloPorIdTipoTransaccion() {
		return this.id_moduloBusquedaPorIdModuloPorIdTipoTransaccion;
	}

	public void setid_moduloBusquedaPorIdModuloPorIdTipoTransaccion(Long id_moduloBusquedaPorIdModuloPorIdTipoTransaccion) {
		this.id_moduloBusquedaPorIdModuloPorIdTipoTransaccion = id_moduloBusquedaPorIdModuloPorIdTipoTransaccion;
	}

;
	public Long id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion=null;

	public Long getid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion() {
		return this.id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion;
	}

	public void setid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion(Long id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion) {
		this.id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion = id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion;
	}

	public Long id_tipo_detalle_documentoFK_IdDetalleDocumento=-1L;

	public Long getid_tipo_detalle_documentoFK_IdDetalleDocumento() {
		return this.id_tipo_detalle_documentoFK_IdDetalleDocumento;
	}

	public void setid_tipo_detalle_documentoFK_IdDetalleDocumento(Long id_tipo_detalle_documentoFK_IdDetalleDocumento) {
		this.id_tipo_detalle_documentoFK_IdDetalleDocumento = id_tipo_detalle_documentoFK_IdDetalleDocumento;
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

	public Long id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo=null;

	public Long getid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo() {
		return this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo;
	}

	public void setid_tipo_transaccion_moduloFK_IdTipoTransaccionModulo(Long id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo) {
		this.id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo = id_tipo_transaccion_moduloFK_IdTipoTransaccionModulo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetalleDocumentoLogic getDetalleDocumentoLogic()	{		
		return detalledocumentoLogic;
	}

	public void setDetalleDocumentoLogic(DetalleDocumentoLogic detalledocumentoLogic) {
		this.detalledocumentoLogic = detalledocumentoLogic;
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
	
	public Boolean getIsEsNuevoDetalleDocumento() {
		return isEsNuevoDetalleDocumento;
	}

	public void setIsEsNuevoDetalleDocumento(Boolean isEsNuevoDetalleDocumento) {
		this.isEsNuevoDetalleDocumento = isEsNuevoDetalleDocumento;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleDocumento() {
		return esParaAccionDesdeFormularioDetalleDocumento;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleDocumento(Boolean esParaAccionDesdeFormularioDetalleDocumento) {
		this.esParaAccionDesdeFormularioDetalleDocumento = esParaAccionDesdeFormularioDetalleDocumento;
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

			if(this.detalledocumentoSessionBean==null) {
				this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
			}

			if(!this.detalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detalledocumentoSessionBean.getlidEmpresaActual());
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

			if(this.detalledocumentoSessionBean==null) {
				this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
			}

			if(!this.detalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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
					moduloLogic.getEntityWithConnection(detalledocumentoSessionBean.getlidModuloActual());
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

	public void cargarCombosTipoTransaccionModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoTransaccionModuloLogic tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();

			//tipotransaccionmoduloLogic.getTipoTransaccionModuloDataAccess().setIsForForeingKeyData(true);

			if(this.detalledocumentoSessionBean==null) {
				this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
			}

			if(!this.detalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipotransaccionmoduloLogic.getTipoTransaccionModuloDataAccess().setIsForForeingKeyData(true);

					tipotransaccionmoduloLogic.getTodosTipoTransaccionModulosWithConnection(sFinalQuery,new Pagination());

					this.tipotransaccionmodulosForeignKey=tipotransaccionmoduloLogic.getTipoTransaccionModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoTransaccionModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotransaccionmoduloLogic.getEntityWithConnection(detalledocumentoSessionBean.getlidTipoTransaccionModuloActual());
					this.tipotransaccionmodulosForeignKey.add(tipotransaccionmoduloLogic.getTipoTransaccionModulo());
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

	public void cargarCombosTipoDetalleDocumentosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodetalledocumentosForeignKey=new ArrayList<TipoDetalleDocumento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDetalleDocumentoLogic tipodetalledocumentoLogic=new TipoDetalleDocumentoLogic();

			//tipodetalledocumentoLogic.getTipoDetalleDocumentoDataAccess().setIsForForeingKeyData(true);

			if(this.detalledocumentoSessionBean==null) {
				this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
			}

			if(!this.detalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionTipoDetalleDocumento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipodetalledocumentoLogic.getTipoDetalleDocumentoDataAccess().setIsForForeingKeyData(true);

					tipodetalledocumentoLogic.getTodosTipoDetalleDocumentosWithConnection(sFinalQuery,new Pagination());

					this.tipodetalledocumentosForeignKey=tipodetalledocumentoLogic.getTipoDetalleDocumentos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDetalleDocumento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetalledocumentoLogic.getEntityWithConnection(detalledocumentoSessionBean.getlidTipoDetalleDocumentoActual());
					this.tipodetalledocumentosForeignKey.add(tipodetalledocumentoLogic.getTipoDetalleDocumento());
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

					if(this.detalledocumento!=null) {
						this.detalledocumento.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
						this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleDocumento.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
						if(this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleDocumentoGenerico)throws Exception
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
				jComboBoxid_empresaDetalleDocumentoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleDocumentoGenerico!=null && jComboBoxid_empresaDetalleDocumentoGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleDocumentoGenerico.setSelectedIndex(0);
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

					if(this.detalledocumento!=null) {
						this.detalledocumento.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
						this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloDetalleDocumento.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
						if(this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdTipoTransaccion") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento!=null) {
						jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento!=null) {
							//jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.getItemCount()>0) {
								jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloFK_IdModuloDetalleDocumento!=null) {
						jComboBoxid_moduloFK_IdModuloDetalleDocumento.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloFK_IdModuloDetalleDocumento!=null) {
							//jComboBoxid_moduloFK_IdModuloDetalleDocumento.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloFK_IdModuloDetalleDocumento.getItemCount()>0) {
								jComboBoxid_moduloFK_IdModuloDetalleDocumento.setSelectedIndex(0);
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
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloDetalleDocumentoGenerico)throws Exception
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
				jComboBoxid_moduloDetalleDocumentoGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloDetalleDocumentoGenerico!=null && jComboBoxid_moduloDetalleDocumentoGenerico.getItemCount()>0) {
					jComboBoxid_moduloDetalleDocumentoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoTransaccionModuloForeignKey(Long idTipoTransaccionModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipotransaccionmoduloTemp!=null) {

					if(this.detalledocumento!=null) {
						this.detalledocumento.setTipoTransaccionModulo(tipotransaccionmoduloTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
						this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setSelectedItem(tipotransaccionmoduloTemp);
					}
				} else {
					//jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setSelectedItem(tipotransaccionmoduloTemp);
					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
						if(this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdTipoTransaccion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipotransaccionmoduloTemp!=null && jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento!=null) {
						jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setSelectedItem(tipotransaccionmoduloTemp);
					} else {
						if(jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento!=null) {
							//jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setSelectedItem(tipotransaccionmoduloTemp);
							if(jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.getItemCount()>0) {
								jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setSelectedIndex(0);
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

	public String getActualTipoTransaccionModuloForeignKeyDescripcion(Long idTipoTransaccionModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}


			sDescripcion=TipoTransaccionModuloConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmoduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoTransaccionModuloForeignKeyGenerico(Long idTipoTransaccionModuloSeleccionado,JComboBox jComboBoxid_tipo_transaccion_moduloDetalleDocumentoGenerico)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloTemp=null;

			for(TipoTransaccionModulo tipotransaccionmoduloAux:tipotransaccionmodulosForeignKey) {
				if(tipotransaccionmoduloAux.getId()!=null && tipotransaccionmoduloAux.getId().equals(idTipoTransaccionModuloSeleccionado)) {
					tipotransaccionmoduloTemp=tipotransaccionmoduloAux;
					break;
				}
			}

			if(tipotransaccionmoduloTemp!=null) {
				jComboBoxid_tipo_transaccion_moduloDetalleDocumentoGenerico.setSelectedItem(tipotransaccionmoduloTemp);
			} else {
				if(jComboBoxid_tipo_transaccion_moduloDetalleDocumentoGenerico!=null && jComboBoxid_tipo_transaccion_moduloDetalleDocumentoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_transaccion_moduloDetalleDocumentoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoDetalleDocumentoForeignKey(Long idTipoDetalleDocumentoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDetalleDocumento  tipodetalledocumentoTemp=null;

			for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentosForeignKey) {
				if(tipodetalledocumentoAux.getId()!=null && tipodetalledocumentoAux.getId().equals(idTipoDetalleDocumentoSeleccionado)) {
					tipodetalledocumentoTemp=tipodetalledocumentoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodetalledocumentoTemp!=null) {

					if(this.detalledocumento!=null) {
						this.detalledocumento.setTipoDetalleDocumento(tipodetalledocumentoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
						this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.setSelectedItem(tipodetalledocumentoTemp);
					}
				} else {
					//jComboBoxid_tipo_detalle_documentoDetalleDocumento.setSelectedItem(tipodetalledocumentoTemp);
					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
						if(this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleDocumento") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodetalledocumentoTemp!=null && jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento!=null) {
						jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setSelectedItem(tipodetalledocumentoTemp);
					} else {
						if(jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento!=null) {
							//jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setSelectedItem(tipodetalledocumentoTemp);
							if(jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.getItemCount()>0) {
								jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setSelectedIndex(0);
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

	public String getActualTipoDetalleDocumentoForeignKeyDescripcion(Long idTipoDetalleDocumentoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDetalleDocumento  tipodetalledocumentoTemp=null;

			for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentosForeignKey) {
				if(tipodetalledocumentoAux.getId()!=null && tipodetalledocumentoAux.getId().equals(idTipoDetalleDocumentoSeleccionado)) {
					tipodetalledocumentoTemp=tipodetalledocumentoAux;
					break;
				}
			}


			sDescripcion=TipoDetalleDocumentoConstantesFunciones.getTipoDetalleDocumentoDescripcion(tipodetalledocumentoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDetalleDocumentoForeignKeyGenerico(Long idTipoDetalleDocumentoSeleccionado,JComboBox jComboBoxid_tipo_detalle_documentoDetalleDocumentoGenerico)throws Exception
	{
		try
		{
			TipoDetalleDocumento  tipodetalledocumentoTemp=null;

			for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentosForeignKey) {
				if(tipodetalledocumentoAux.getId()!=null && tipodetalledocumentoAux.getId().equals(idTipoDetalleDocumentoSeleccionado)) {
					tipodetalledocumentoTemp=tipodetalledocumentoAux;
					break;
				}
			}

			if(tipodetalledocumentoTemp!=null) {
				jComboBoxid_tipo_detalle_documentoDetalleDocumentoGenerico.setSelectedItem(tipodetalledocumentoTemp);
			} else {
				if(jComboBoxid_tipo_detalle_documentoDetalleDocumentoGenerico!=null && jComboBoxid_tipo_detalle_documentoDetalleDocumentoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_detalle_documentoDetalleDocumentoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleDocumento detalledocumento,JComboBox jComboBoxid_empresaDetalleDocumentoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleDocumentoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleDocumentoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalledocumento.setid_empresa(empresaAux.getId());
				detalledocumento.setempresa_descripcion(DetalleDocumentoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalledocumento.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(DetalleDocumento detalledocumento,JComboBox jComboBoxid_moduloDetalleDocumentoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloDetalleDocumentoGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloDetalleDocumentoGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				detalledocumento.setid_modulo(moduloAux.getId());
				detalledocumento.setmodulo_descripcion(DetalleDocumentoConstantesFunciones.getModuloDescripcion(moduloAux));
				detalledocumento.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoTransaccionModuloForeignKey(DetalleDocumento detalledocumento,JComboBox jComboBoxid_tipo_transaccion_moduloDetalleDocumentoGenerico)throws Exception
	{
		try
		{
			TipoTransaccionModulo  tipotransaccionmoduloAux=new TipoTransaccionModulo();

			if(jComboBoxid_tipo_transaccion_moduloDetalleDocumentoGenerico==null) {
				tipotransaccionmoduloAux=(TipoTransaccionModulo)this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.getSelectedItem();
			} else {
				tipotransaccionmoduloAux=(TipoTransaccionModulo)jComboBoxid_tipo_transaccion_moduloDetalleDocumentoGenerico.getSelectedItem();
			}

			if(tipotransaccionmoduloAux!=null) {
				detalledocumento.setid_tipo_transaccion_modulo(tipotransaccionmoduloAux.getId());
				detalledocumento.settipotransaccionmodulo_descripcion(DetalleDocumentoConstantesFunciones.getTipoTransaccionModuloDescripcion(tipotransaccionmoduloAux));
				detalledocumento.setTipoTransaccionModulo(tipotransaccionmoduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDetalleDocumentoForeignKey(DetalleDocumento detalledocumento,JComboBox jComboBoxid_tipo_detalle_documentoDetalleDocumentoGenerico)throws Exception
	{
		try
		{
			TipoDetalleDocumento  tipodetalledocumentoAux=new TipoDetalleDocumento();

			if(jComboBoxid_tipo_detalle_documentoDetalleDocumentoGenerico==null) {
				tipodetalledocumentoAux=(TipoDetalleDocumento)this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.getSelectedItem();
			} else {
				tipodetalledocumentoAux=(TipoDetalleDocumento)jComboBoxid_tipo_detalle_documentoDetalleDocumentoGenerico.getSelectedItem();
			}

			if(tipodetalledocumentoAux!=null && tipodetalledocumentoAux.getId()!=null) {
				detalledocumento.setid_tipo_detalle_documento(tipodetalledocumentoAux.getId());
				detalledocumento.settipodetalledocumento_descripcion(DetalleDocumentoConstantesFunciones.getTipoDetalleDocumentoDescripcion(tipodetalledocumentoAux));
				detalledocumento.setTipoDetalleDocumento(tipodetalledocumentoAux);			}
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

					if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { 
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { 
					}

					if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { 
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { 
					}

					if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdTipoTransaccion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.addItem(modulo);
							}
						}

						if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloFK_IdModuloDetalleDocumento.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloFK_IdModuloDetalleDocumento.addItem(modulo);
							}
						}

						if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoTransaccionModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoTransaccionModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { 
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.removeAllItems();

							for(TipoTransaccionModulo tipotransaccionmodulo:this.tipotransaccionmodulosForeignKey) {
								this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.addItem(tipotransaccionmodulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { 
					}

					if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdTipoTransaccion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.removeAllItems();

							for(TipoTransaccionModulo tipotransaccionmodulo:this.tipotransaccionmodulosForeignKey) {
								this.jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.addItem(tipotransaccionmodulo);
							}
						}

						if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDetalleDocumentosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDetalleDocumento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { 
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.removeAllItems();

							for(TipoDetalleDocumento tipodetalledocumento:this.tipodetalledocumentosForeignKey) {
								this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.addItem(tipodetalledocumento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { 
					}

					if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleDocumento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.removeAllItems();

							for(TipoDetalleDocumento tipodetalledocumento:this.tipodetalledocumentosForeignKey) {
								this.jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.addItem(tipodetalledocumento);
							}
						}

						if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloFK_IdModuloDetalleDocumento.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloFK_IdModuloDetalleDocumento.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoTransaccionModuloForeignKey(TipoTransaccionModulo tipotransaccionmodulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setSelectedItem(tipotransaccionmodulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setSelectedItem(tipotransaccionmodulo);
						} else {
							this.jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoDetalleDocumentoForeignKey(TipoDetalleDocumento tipodetalledocumento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.setSelectedItem(tipodetalledocumento);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setSelectedItem(tipodetalledocumento);
						} else {
							this.jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleDocumento() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleDocumentoConstantesFunciones.refrescarForeignKeysDescripcionesDetalleDocumento(this.detalledocumentoLogic.getDetalleDocumentos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleDocumentoConstantesFunciones.refrescarForeignKeysDescripcionesDetalleDocumento(this.detalledocumentos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(TipoTransaccionModulo.class));
		classes.add(new Classe(TipoDetalleDocumento.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalledocumentoLogic.setDetalleDocumentos(this.detalledocumentos);
			detalledocumentoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleDocumentoParameterReturnGeneral getDetalleDocumentoParameterGeneral() {
		return this.detalledocumentoParameterGeneral;
	}
	
	public void setDetalleDocumentoParameterGeneral(DetalleDocumentoParameterReturnGeneral detalledocumentoParameterGeneral) {
		this.detalledocumentoParameterGeneral = detalledocumentoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleDocumento() {
		return isPermisoTodoDetalleDocumento;
	}

	public void setIsPermisoTodoDetalleDocumento(Boolean isPermisoTodoDetalleDocumento) {
		this.isPermisoTodoDetalleDocumento = isPermisoTodoDetalleDocumento;
	}

	public Boolean getIsPermisoNuevoDetalleDocumento() {
		return isPermisoNuevoDetalleDocumento;
	}

	public void setIsPermisoNuevoDetalleDocumento(Boolean isPermisoNuevoDetalleDocumento) {
		this.isPermisoNuevoDetalleDocumento = isPermisoNuevoDetalleDocumento;
	}

	public Boolean getIsPermisoActualizarDetalleDocumento() {
		return isPermisoActualizarDetalleDocumento;
	}

	public void setIsPermisoActualizarDetalleDocumento(Boolean isPermisoActualizarDetalleDocumento) {
		this.isPermisoActualizarDetalleDocumento = isPermisoActualizarDetalleDocumento;
	}

	public Boolean getIsPermisoEliminarDetalleDocumento() {
		return isPermisoEliminarDetalleDocumento;
	}

	public void setIsPermisoEliminarDetalleDocumento(Boolean isPermisoEliminarDetalleDocumento) {
		this.isPermisoEliminarDetalleDocumento = isPermisoEliminarDetalleDocumento;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleDocumento() {
		return isPermisoGuardarCambiosDetalleDocumento;
	}

	public void setIsPermisoGuardarCambiosDetalleDocumento(Boolean isPermisoGuardarCambiosDetalleDocumento) {
		this.isPermisoGuardarCambiosDetalleDocumento = isPermisoGuardarCambiosDetalleDocumento;
	}
	
	public Boolean getIsPermisoConsultaDetalleDocumento() {
		return isPermisoConsultaDetalleDocumento;
	}

	public void setIsPermisoConsultaDetalleDocumento(Boolean isPermisoConsultaDetalleDocumento) {
		this.isPermisoConsultaDetalleDocumento = isPermisoConsultaDetalleDocumento;
	}

	public Boolean getIsPermisoBusquedaDetalleDocumento() {
		return isPermisoBusquedaDetalleDocumento;
	}

	public void setIsPermisoBusquedaDetalleDocumento(Boolean isPermisoBusquedaDetalleDocumento) {
		this.isPermisoBusquedaDetalleDocumento = isPermisoBusquedaDetalleDocumento;
	}

	public Boolean getIsPermisoReporteDetalleDocumento() {
		return isPermisoReporteDetalleDocumento;
	}

	public void setIsPermisoReporteDetalleDocumento(Boolean isPermisoReporteDetalleDocumento) {
		this.isPermisoReporteDetalleDocumento = isPermisoReporteDetalleDocumento;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleDocumento() {
		return isPermisoPaginacionMedioDetalleDocumento;
	}

	public void setIsPermisoPaginacionMedioDetalleDocumento(Boolean isPermisoPaginacionMedioDetalleDocumento) {
		this.isPermisoPaginacionMedioDetalleDocumento = isPermisoPaginacionMedioDetalleDocumento;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleDocumento() {
		return isPermisoPaginacionTodoDetalleDocumento;
	}

	public void setIsPermisoPaginacionTodoDetalleDocumento(Boolean isPermisoPaginacionTodoDetalleDocumento) {
		this.isPermisoPaginacionTodoDetalleDocumento = isPermisoPaginacionTodoDetalleDocumento;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleDocumento() {
		return isPermisoPaginacionAltoDetalleDocumento;
	}

	public void setIsPermisoPaginacionAltoDetalleDocumento(Boolean isPermisoPaginacionAltoDetalleDocumento) {
		this.isPermisoPaginacionAltoDetalleDocumento = isPermisoPaginacionAltoDetalleDocumento;
	}
	
	public Boolean getIsPermisoCopiarDetalleDocumento() {
		return isPermisoCopiarDetalleDocumento;
	}

	public void setIsPermisoCopiarDetalleDocumento(Boolean isPermisoCopiarDetalleDocumento) {
		this.isPermisoCopiarDetalleDocumento = isPermisoCopiarDetalleDocumento;
	}
	
	public Boolean getIsPermisoVerFormDetalleDocumento() {
		return isPermisoVerFormDetalleDocumento;
	}

	public void setIsPermisoVerFormDetalleDocumento(Boolean isPermisoVerFormDetalleDocumento) {
		this.isPermisoVerFormDetalleDocumento = isPermisoVerFormDetalleDocumento;
	}
	
	public Boolean getIsPermisoDuplicarDetalleDocumento() {
		return isPermisoDuplicarDetalleDocumento;
	}

	public void setIsPermisoDuplicarDetalleDocumento(Boolean isPermisoDuplicarDetalleDocumento) {
		this.isPermisoDuplicarDetalleDocumento = isPermisoDuplicarDetalleDocumento;
	}
	
	public Boolean getIsPermisoOrdenDetalleDocumento() {
		return isPermisoOrdenDetalleDocumento;
	}

	public void setIsPermisoOrdenDetalleDocumento(Boolean isPermisoOrdenDetalleDocumento) {
		this.isPermisoOrdenDetalleDocumento = isPermisoOrdenDetalleDocumento;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleDocumento() {
		return isVisibilidadCeldaNuevoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaNuevoDetalleDocumento(Boolean isVisibilidadCeldaNuevoDetalleDocumento) {
		this.isVisibilidadCeldaNuevoDetalleDocumento = isVisibilidadCeldaNuevoDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleDocumento() {
		return isVisibilidadCeldaDuplicarDetalleDocumento;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleDocumento(Boolean isVisibilidadCeldaDuplicarDetalleDocumento) {
		this.isVisibilidadCeldaDuplicarDetalleDocumento = isVisibilidadCeldaDuplicarDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleDocumento() {
		return isVisibilidadCeldaCopiarDetalleDocumento;
	}

	public void setIsVisibilidadCeldaCopiarDetalleDocumento(Boolean isVisibilidadCeldaCopiarDetalleDocumento) {
		this.isVisibilidadCeldaCopiarDetalleDocumento = isVisibilidadCeldaCopiarDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleDocumento() {
		return isVisibilidadCeldaVerFormDetalleDocumento;
	}

	public void setIsVisibilidadCeldaVerFormDetalleDocumento(Boolean isVisibilidadCeldaVerFormDetalleDocumento) {
		this.isVisibilidadCeldaVerFormDetalleDocumento = isVisibilidadCeldaVerFormDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleDocumento() {
		return isVisibilidadCeldaOrdenDetalleDocumento;
	}

	public void setIsVisibilidadCeldaOrdenDetalleDocumento(Boolean isVisibilidadCeldaOrdenDetalleDocumento) {
		this.isVisibilidadCeldaOrdenDetalleDocumento = isVisibilidadCeldaOrdenDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleDocumento() {
		return isVisibilidadCeldaNuevoRelacionesDetalleDocumento;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleDocumento(Boolean isVisibilidadCeldaNuevoRelacionesDetalleDocumento) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento = isVisibilidadCeldaNuevoRelacionesDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleDocumento() {
		return isVisibilidadCeldaModificarDetalleDocumento;
	}

	public void setIsVisibilidadCeldaModificarDetalleDocumento(Boolean isVisibilidadCeldaModificarDetalleDocumento) {
		this.isVisibilidadCeldaModificarDetalleDocumento = isVisibilidadCeldaModificarDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleDocumento() {
		return isVisibilidadCeldaActualizarDetalleDocumento;
	}

	public void setIsVisibilidadCeldaActualizarDetalleDocumento(Boolean isVisibilidadCeldaActualizarDetalleDocumento) {
		this.isVisibilidadCeldaActualizarDetalleDocumento = isVisibilidadCeldaActualizarDetalleDocumento;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleDocumento() {
		return isVisibilidadCeldaEliminarDetalleDocumento;
	}

	public void setIsVisibilidadCeldaEliminarDetalleDocumento(Boolean isVisibilidadCeldaEliminarDetalleDocumento) {
		this.isVisibilidadCeldaEliminarDetalleDocumento = isVisibilidadCeldaEliminarDetalleDocumento;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleDocumento() {
		return isVisibilidadCeldaCancelarDetalleDocumento;
	}

	public void setIsVisibilidadCeldaCancelarDetalleDocumento(Boolean isVisibilidadCeldaCancelarDetalleDocumento) {
		this.isVisibilidadCeldaCancelarDetalleDocumento = isVisibilidadCeldaCancelarDetalleDocumento;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleDocumento() {
		return isVisibilidadCeldaGuardarDetalleDocumento;
	}

	public void setIsVisibilidadCeldaGuardarDetalleDocumento(Boolean isVisibilidadCeldaGuardarDetalleDocumento) {
		this.isVisibilidadCeldaGuardarDetalleDocumento = isVisibilidadCeldaGuardarDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleDocumento() {
		return isVisibilidadCeldaGuardarCambiosDetalleDocumento;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleDocumento(Boolean isVisibilidadCeldaGuardarCambiosDetalleDocumento) {
		this.isVisibilidadCeldaGuardarCambiosDetalleDocumento = isVisibilidadCeldaGuardarCambiosDetalleDocumento;
	}
		
	public DetalleDocumentoSessionBean getdetalledocumentoSessionBean() {
		return this.detalledocumentoSessionBean;
	}
	
	public void setdetalledocumentoSessionBean(DetalleDocumentoSessionBean detalledocumentoSessionBean) {
		this.detalledocumentoSessionBean=detalledocumentoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion() {
		return this.isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion;
	}

	public void setisVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion(Boolean isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion) {
		this.isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion=isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion;
	}

	public Boolean getisVisibilidadFK_IdDetalleDocumento() {
		return this.isVisibilidadFK_IdDetalleDocumento;
	}

	public void setisVisibilidadFK_IdDetalleDocumento(Boolean isVisibilidadFK_IdDetalleDocumento) {
		this.isVisibilidadFK_IdDetalleDocumento=isVisibilidadFK_IdDetalleDocumento;
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

	public Boolean getisVisibilidadFK_IdTipoTransaccionModulo() {
		return this.isVisibilidadFK_IdTipoTransaccionModulo;
	}

	public void setisVisibilidadFK_IdTipoTransaccionModulo(Boolean isVisibilidadFK_IdTipoTransaccionModulo) {
		this.isVisibilidadFK_IdTipoTransaccionModulo=isVisibilidadFK_IdTipoTransaccionModulo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(DetalleDocumento detalledocumento)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detalledocumento,null);
				this.setActualParaGuardarModuloForeignKey(detalledocumento,null);
				this.setActualParaGuardarTipoTransaccionModuloForeignKey(detalledocumento,null);
				this.setActualParaGuardarTipoDetalleDocumentoForeignKey(detalledocumento,null);
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
	
	public void bugActualizarReferenciaActual(DetalleDocumento detalledocumento,DetalleDocumento detalledocumentoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleDocumento(detalledocumento);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalledocumentoAux.setId(detalledocumento.getId());
		detalledocumentoAux.setVersionRow(detalledocumento.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleDocumento();
		
			int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleDocumento(this.detalledocumento,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalledocumentoValidator.getInvalidValues(this.detalledocumento);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalledocumentoLogic.setDatosCliente(datosCliente);
			detalledocumentoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalledocumentoAux=new  DetalleDocumento();
				
				detalledocumentoAux.setIsNew(true);
				detalledocumentoAux.setIsChanged(true);
				
				detalledocumentoAux.setDetalleDocumentoOriginal(this.detalledocumento);
				
				detalledocumentoAux.setId(this.detalledocumento.getId());	
				detalledocumentoAux.setVersionRow(this.detalledocumento.getVersionRow());	
				detalledocumentoAux.setid_empresa(this.detalledocumento.getid_empresa());	
				detalledocumentoAux.setid_modulo(this.detalledocumento.getid_modulo());	
				detalledocumentoAux.setid_tipo_transaccion_modulo(this.detalledocumento.getid_tipo_transaccion_modulo());	
				detalledocumentoAux.setid_tipo_detalle_documento(this.detalledocumento.getid_tipo_detalle_documento());	
				detalledocumentoAux.setnombre(this.detalledocumento.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalledocumentoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalledocumentoAux,detalledocumentoLogic.getDetalleDocumentos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalledocumentoAux,detalledocumentos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalledocumentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentoLogic.saveDetalleDocumentos();//WithConnection
						//detalledocumentoLogic.getSetVersionRowDetalleDocumentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalledocumento,detalledocumentoAux);
					
					this.refrescarForeignKeysDescripcionesDetalleDocumento();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalledocumentoLogic.saveDetalleDocumentoRelaciones(detalledocumentoAux);//WithConnection
								//detalledocumentoLogic.getSetVersionRowDetalleDocumentos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalledocumento,detalledocumentoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalledocumentoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalledocumentoAux,detalledocumentoLogic.getDetalleDocumentos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalledocumentoAux,detalledocumentos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalledocumento,detalledocumentoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalledocumentoAux=new  DetalleDocumento();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado() 
					|| (this.detalledocumentoSessionBean.getEsGuardarRelacionado() && this.detalledocumento.getId()>=0)) {
						
					detalledocumentoAux.setIsNew(false);
				}
				
				detalledocumentoAux.setIsDeleted(false);
			
				detalledocumentoAux.setId(this.detalledocumento.getId());	
				detalledocumentoAux.setVersionRow(this.detalledocumento.getVersionRow());	
				detalledocumentoAux.setid_empresa(this.detalledocumento.getid_empresa());	
				detalledocumentoAux.setid_modulo(this.detalledocumento.getid_modulo());	
				detalledocumentoAux.setid_tipo_transaccion_modulo(this.detalledocumento.getid_tipo_transaccion_modulo());	
				detalledocumentoAux.setid_tipo_detalle_documento(this.detalledocumento.getid_tipo_detalle_documento());	
				detalledocumentoAux.setnombre(this.detalledocumento.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalledocumentoAux,detalledocumentoLogic.getDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalledocumentoAux,detalledocumentos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalledocumentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentoLogic.saveDetalleDocumentos();//WithConnection
						//detalledocumentoLogic.getSetVersionRowDetalleDocumentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalledocumento,detalledocumentoAux);
					
					this.refrescarForeignKeysDescripcionesDetalleDocumento();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalledocumentoLogic.saveDetalleDocumentoRelaciones(detalledocumentoAux);//WithConnection
								//detalledocumentoLogic.getSetVersionRowDetalleDocumentos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalledocumento,detalledocumentoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalledocumentoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalledocumentoAux,detalledocumentoLogic.getDetalleDocumentos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalledocumentoAux,detalledocumentos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalledocumento,detalledocumentoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalledocumentoAux=new  DetalleDocumento();
				
				detalledocumentoAux.setIsNew(false);
				detalledocumentoAux.setIsChanged(false);
				
				detalledocumentoAux.setIsDeleted(true);
				
				detalledocumentoAux.setId(this.detalledocumento.getId());	
				detalledocumentoAux.setVersionRow(this.detalledocumento.getVersionRow());	
				detalledocumentoAux.setid_empresa(this.detalledocumento.getid_empresa());	
				detalledocumentoAux.setid_modulo(this.detalledocumento.getid_modulo());	
				detalledocumentoAux.setid_tipo_transaccion_modulo(this.detalledocumento.getid_tipo_transaccion_modulo());	
				detalledocumentoAux.setid_tipo_detalle_documento(this.detalledocumento.getid_tipo_detalle_documento());	
				detalledocumentoAux.setnombre(this.detalledocumento.getnombre());	
				
				if(this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalledocumentoAux.getId()>=0) {	
						this.detalledocumentosEliminados.add(detalledocumentoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalledocumentoAux,detalledocumentoLogic.getDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalledocumentoAux,detalledocumentos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalledocumentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentoLogic.saveDetalleDocumentos();//WithConnection
						//detalledocumentoLogic.getSetVersionRowDetalleDocumentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalledocumentoLogic.saveDetalleDocumentoRelaciones(detalledocumentoAux);//WithConnection
								//detalledocumentoLogic.getSetVersionRowDetalleDocumentos();//WithConnection
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
							if(this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalledocumentoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalledocumentoAux,detalledocumentoLogic.getDetalleDocumentos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalledocumentoAux,detalledocumentos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.getDetalleDocumentos().addAll(this.detalledocumentosEliminados);
					
					detalledocumentoLogic.saveDetalleDocumentos();//WithConnection
					//detalledocumentoLogic.getSetVersionRowDetalleDocumentos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleDocumento();
				
				this.detalledocumentosEliminados= new ArrayList<DetalleDocumento>();		
			}
			
			if(this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Documento GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalledocumento=detalledocumentoAux;
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
      		//this.finishProcessDetalleDocumento();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleDocumento detalledocumentoLocal) throws Exception {
		
		if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleDocumento detalledocumentoLocal) throws Exception {	
		if(this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalledocumentoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				detalledocumentoLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoTransaccionModuloDetalleFormJInternalFrame.class)) {
				TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrameLocal=(TipoTransaccionModuloBeanSwingJInternalFrame) ((TipoTransaccionModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipotransaccionmoduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoTransaccionModulo(tipotransaccionmoduloBeanSwingJInternalFrameLocal.gettipotransaccionmodulo(),true);
				tipotransaccionmoduloBeanSwingJInternalFrameLocal.actualizarLista(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo,this.tipotransaccionmodulosForeignKey);

				tipotransaccionmoduloBeanSwingJInternalFrameLocal.actualizarRelaciones(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo);

				detalledocumentoLocal.setTipoTransaccionModulo(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo);

				this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
				this.cargarCombosFrameTipoTransaccionModulosForeignKey("Formulario");
				this.setActualTipoTransaccionModuloForeignKey(tipotransaccionmoduloBeanSwingJInternalFrameLocal.tipotransaccionmodulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDetalleDocumentoDetalleFormJInternalFrame.class)) {
				TipoDetalleDocumentoBeanSwingJInternalFrame tipodetalledocumentoBeanSwingJInternalFrameLocal=(TipoDetalleDocumentoBeanSwingJInternalFrame) ((TipoDetalleDocumentoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodetalledocumentoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDetalleDocumento(tipodetalledocumentoBeanSwingJInternalFrameLocal.gettipodetalledocumento(),true);
				tipodetalledocumentoBeanSwingJInternalFrameLocal.actualizarLista(tipodetalledocumentoBeanSwingJInternalFrameLocal.tipodetalledocumento,this.tipodetalledocumentosForeignKey);

				tipodetalledocumentoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodetalledocumentoBeanSwingJInternalFrameLocal.tipodetalledocumento);

				detalledocumentoLocal.setTipoDetalleDocumento(tipodetalledocumentoBeanSwingJInternalFrameLocal.tipodetalledocumento);

				this.addItemDefectoCombosForeignKeyTipoDetalleDocumento();
				this.cargarCombosFrameTipoDetalleDocumentosForeignKey("Formulario");
				this.setActualTipoDetalleDocumentoForeignKey(tipodetalledocumentoBeanSwingJInternalFrameLocal.tipodetalledocumento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleDocumentoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalledocumentoValidator.getInvalidValues(this.detalledocumento);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleDocumento detalledocumento,List<DetalleDocumento> detalledocumentos) throws Exception {
		try	{		
			DetalleDocumentoConstantesFunciones.actualizarLista(detalledocumento,detalledocumentos,this.detalledocumentoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleDocumento detalledocumento,List<DetalleDocumento> detalledocumentos) throws Exception {
		try	{			
			DetalleDocumentoConstantesFunciones.actualizarSelectedLista(detalledocumento,detalledocumentos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleDocumento> detalledocumentosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalledocumentosLocal=this.detalledocumentoLogic.getDetalleDocumentos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalledocumentosLocal=this.detalledocumentos;
			}
			//ARCHITECTURE
		
			for(DetalleDocumento detalledocumentoLocal:detalledocumentosLocal) {
				if(this.permiteMantenimiento(detalledocumentoLocal) && detalledocumentoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleDocumentoConstantesFunciones.getDetalleDocumentoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleDocumentoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDocumento.jLabelid_empresaDetalleDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleDocumentoConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDocumento.jLabelid_moduloDetalleDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleDocumentoConstantesFunciones.IDTIPOTRANSACCIONMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDocumento.jLabelid_tipo_transaccion_moduloDetalleDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleDocumentoConstantesFunciones.IDTIPODETALLEDOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDocumento.jLabelid_tipo_detalle_documentoDetalleDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleDocumentoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDocumento.jLabelnombreDetalleDocumento,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleDocumento.jLabelid_empresaDetalleDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleDocumento.jLabelid_moduloDetalleDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleDocumento.jLabelid_tipo_transaccion_moduloDetalleDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleDocumento.jLabelid_tipo_detalle_documentoDetalleDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleDocumento.jLabelnombreDetalleDocumento,"");
		
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
		this.iIdNuevoDetalleDocumento--;	
		
		
		this.detalledocumentoAux=new DetalleDocumento();
		
		this.detalledocumentoAux.setId(this.iIdNuevoDetalleDocumento);
		this.detalledocumentoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalledocumentoLogic.getDetalleDocumentos().add(this.detalledocumentoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalledocumentos.add(this.detalledocumentoAux);
		}
		//ARCHITECTURE
		
		this.detalledocumento=this.detalledocumentoAux;
		
		if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleDocumento(this.detalledocumento);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleDocumento(this.detalledocumento);
		}
				
		//this.setDefaultControlesDetalleDocumento();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleDocumento();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleDocumento();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleDocumento();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleDocumento(this.detalledocumentoBean,this.detalledocumento,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleDocumentoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {
			classes=DetalleDocumentoConstantesFunciones.getClassesRelationshipsOfDetalleDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalledocumentoReturnGeneral=detalledocumentoLogic.procesarEventosDetalleDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalledocumentoLogic.getDetalleDocumentos(),this.detalledocumento,this.detalledocumentoParameterGeneral,this.isEsNuevoDetalleDocumento,classes);//this.detalledocumentoLogic.getDetalleDocumento()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleDocumento(this.detalledocumentoReturnGeneral,this.detalledocumentoBean,false);
		
		if(this.detalledocumentoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleDocumento(this.detalledocumentoReturnGeneral.getDetalleDocumento());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleDocumento(this.detalledocumentoReturnGeneral.getDetalleDocumento());
		}
		
		if(this.detalledocumentoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleDocumento(this.detalledocumentoReturnGeneral.getDetalleDocumento(),classes);//this.detalledocumentoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleDocumento(this.detalledocumento,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleDocumento();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleDocumento();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.RecargarFormDetalleDocumento(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleDocumento(false);
						
			if(detalledocumentoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleDocumento();
			}
			
			this.actualizarVisualTableDatosDetalleDocumento();
			
			this.jTableDatosDetalleDocumento.setRowSelectionInterval(this.getIndiceNuevoDetalleDocumento(), this.getIndiceNuevoDetalleDocumento());
			
			this.seleccionarFilaTablaDetalleDocumentoActual();
						
			this.actualizarEstadoCeldasBotonesDetalleDocumento("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleDocumento(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleDocumento.jTextFieldnombreDetalleDocumento.setEnabled(isHabilitar && this.detalledocumentoConstantesFunciones.activarnombreDetalleDocumento);	
		//
		this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.setEnabled(isHabilitar && this.detalledocumentoConstantesFunciones.activarid_empresaDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.setEnabled(isHabilitar && this.detalledocumentoConstantesFunciones.activarid_moduloDetalleDocumento);//
		this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setEnabled(isHabilitar && this.detalledocumentoConstantesFunciones.activarid_tipo_transaccion_moduloDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.setEnabled(isHabilitar && this.detalledocumentoConstantesFunciones.activarid_tipo_detalle_documentoDetalleDocumento);
	};
	
	public void setDefaultControlesDetalleDocumento() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleDocumento(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalledocumentoSessionBean.setConGuardarRelaciones(true);			
			this.detalledocumentoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleDocumento.jTabbedPaneRelacionesDetalleDocumento.setVisible(true);
			
					
		} else {
			//this.detalledocumentoSessionBean.setConGuardarRelaciones(false);			
			this.detalledocumentoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleDocumento.jTabbedPaneRelacionesDetalleDocumento.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleDocumento() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleDocumento detalledocumentoAux:this.detalledocumentoLogic.getDetalleDocumentos()) {
				if(detalledocumentoAux.getId().equals(this.iIdNuevoDetalleDocumento)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleDocumento detalledocumentoAux:this.detalledocumentos) {
				if(detalledocumentoAux.getId().equals(this.iIdNuevoDetalleDocumento)) {
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
	
	public int getIndiceActualDetalleDocumento(DetalleDocumento detalledocumento,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleDocumento detalledocumentoAux:this.detalledocumentoLogic.getDetalleDocumentos()) {
				if(detalledocumentoAux.getId().equals(detalledocumento.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleDocumento detalledocumentoAux:this.detalledocumentos) {
				if(detalledocumentoAux.getId().equals(detalledocumento.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleDocumento(DetalleDocumento detalledocumentoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleDocumento detalledocumentoAux:this.detalledocumentoLogic.getDetalleDocumentos()) {
				if(detalledocumentoAux.getDetalleDocumentoOriginal().getId().equals(detalledocumentoOriginal.getId())) {
					existe=true;
					detalledocumentoOriginal.setId(detalledocumentoAux.getId());
					detalledocumentoOriginal.setVersionRow(detalledocumentoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleDocumento detalledocumentoAux:this.detalledocumentos) {
				if(detalledocumentoAux.getDetalleDocumentoOriginal().getId().equals(detalledocumentoOriginal.getId())) {
					existe=true;
					detalledocumentoOriginal.setId(detalledocumentoAux.getId());
					detalledocumentoOriginal.setVersionRow(detalledocumentoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleDocumento(Boolean esParaCancelar) throws Exception {
		detalledocumentosAux=new ArrayList<DetalleDocumento>();
		detalledocumentoAux=new DetalleDocumento();
		
		if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleDocumento detalledocumentoAux:this.detalledocumentoLogic.getDetalleDocumentos()) {
					if(detalledocumentoAux.getId()<0) {
						detalledocumentosAux.add(detalledocumentoAux);
					}		
				}
				this.iIdNuevoDetalleDocumento=0L;
				this.detalledocumentoLogic.getDetalleDocumentos().removeAll(detalledocumentosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleDocumento detalledocumentoAux:this.detalledocumentos) {
					if(detalledocumentoAux.getId()<0) {
						detalledocumentosAux.add(detalledocumentoAux);
					}		
				}
				this.iIdNuevoDetalleDocumento=0L;
				this.detalledocumentos.removeAll(detalledocumentosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleDocumento 
					&& this.detalledocumentoLogic.getDetalleDocumentos().size()>0
					) {
					detalledocumentoAux=this.detalledocumentoLogic.getDetalleDocumentos().get(this.detalledocumentoLogic.getDetalleDocumentos().size() - 1);
				
					if(detalledocumentoAux.getId()<0) {
						this.detalledocumentoLogic.getDetalleDocumentos().remove(detalledocumentoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleDocumento && this.detalledocumentos.size()>0) {
					detalledocumentoAux=this.detalledocumentos.get(this.detalledocumentos.size() - 1);
				
					if(detalledocumentoAux.getId()<0) {
						this.detalledocumentos.remove(detalledocumentoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleDocumento(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalledocumento.getId()<0) {
				this.detalledocumentoLogic.getDetalleDocumentos().remove(this.detalledocumento);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalledocumento.getId()<0) {
				this.detalledocumentos.remove(this.detalledocumento);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleDocumento(List<DetalleDocumento> detalledocumentosAux) throws Exception {
		DetalleDocumentoConstantesFunciones.setEstadosInicialesDetalleDocumento(detalledocumentosAux);
	}
	
	public void setEstadosInicialesDetalleDocumento(DetalleDocumento detalledocumentoAux) throws Exception {
		DetalleDocumentoConstantesFunciones.setEstadosInicialesDetalleDocumento(detalledocumentoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleDocumentoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleDocumentoActual()) {
				if(!this.isEsNuevoDetalleDocumento) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleDocumento=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleDocumentoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Documento ?", "MANTENIMIENTO DE Detalle Documento", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleDocumento detalledocumento) throws Exception {
		DetalleDocumentoConstantesFunciones.seleccionarAsignar(this.detalledocumento,detalledocumento);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleDocumento=this.isPermisoActualizarOriginalDetalleDocumento;
			
			
			this.seleccionarAsignar(detalledocumento);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleDocumentoConstantesFunciones.quitarEspaciosDetalleDocumento(this.detalledocumento,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleDocumento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalledocumentoSessionBean.setsFuncionBusquedaRapida(this.detalledocumentoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleDocumento) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleDocumento(esParaCancelar);				
				this.cancelarNuevoDetalleDocumento(esParaCancelar);								
			}
			
			this.detalledocumento=new DetalleDocumento();
			
			this.inicializarDetalleDocumento();
			
			this.actualizarEstadoCeldasBotonesDetalleDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleDocumento() throws Exception {
		try {
			DetalleDocumentoConstantesFunciones.inicializarDetalleDocumento(this.detalledocumento);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalledocumentoLogic.getDetalleDocumentos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleDocumentos(String sAccionBusqueda,List<DetalleDocumento> detalledocumentosParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleDocumento"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleDocumentoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleDocumentoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleDocumento"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Documentos");		
		parameters.put("busquedapor", DetalleDocumentoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleDocumento=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleDocumentoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleDocumentoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleDocumento=new JRBeanArrayDataSource(DetalleDocumentoJInternalFrame.TraerDetalleDocumentoBeans(detalledocumentosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleDocumento);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleDocumentoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleDocumentoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleDocumentoBean.TraerDetalleDocumentoBeans(detalledocumentosParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleDocumentos(sAccionBusqueda,sTipoArchivoReporte,detalledocumentosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleDocumentos(sAccionBusqueda,sTipoArchivoReporte,detalledocumentosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleDocumentoActionPerformed(null);
					//this.generarExcelReporteDetalleDocumentos(sAccionBusqueda,sTipoArchivoReporte,detalledocumentosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleDocumentos(sAccionBusqueda,sTipoArchivoReporte,detalledocumentosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleDocumentos(sAccionBusqueda,sTipoArchivoReporte,detalledocumentosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleDocumentos(sAccionBusqueda,sTipoArchivoReporte,detalledocumentosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleDocumentos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleDocumento> detalledocumentosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledocumento";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleDocumentos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleDocumento("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleDocumento detalledocumento : detalledocumentosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleDocumentoConstantesFunciones.generarExcelReporteDataDetalleDocumento("NORMAL",row,workbook,detalledocumento,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleDocumento(String sTipo,Row row,Workbook workbook) {
		
		DetalleDocumentoConstantesFunciones.generarExcelReporteHeaderDetalleDocumento(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleDocumentos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleDocumento> detalledocumentosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledocumento_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleDocumentos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleDocumento detalledocumento : detalledocumentosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleDocumentoConstantesFunciones.getDetalleDocumentoDescripcion(detalledocumento));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalledocumento.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleDocumentoConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalledocumento.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalledocumento.gettipotransaccionmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalledocumento.gettipodetalledocumento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleDocumentoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalledocumento.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleDocumentos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleDocumento> detalledocumentosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleDocumento> detalledocumentosRespaldo=null;
		
		classes=DetalleDocumentoConstantesFunciones.getClassesRelationshipsOfDetalleDocumento(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalledocumentoLogic.setDatosCliente(this.datosCliente);
		this.detalledocumentoLogic.setDatosDeep(this.datosDeep);
		this.detalledocumentoLogic.setIsConDeep(true);
		
		detalledocumentosRespaldo=this.detalledocumentoLogic.getDetalleDocumentos();
		
		this.detalledocumentoLogic.setDetalleDocumentos(detalledocumentosParaReportes);	
		this.detalledocumentoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalledocumentosParaReportes=this.detalledocumentoLogic.getDetalleDocumentos();
		this.detalledocumentoLogic.setDetalleDocumentos(detalledocumentosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledocumento_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleDocumentos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleDocumento("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleDocumento detalledocumento : detalledocumentosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleDocumento("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleDocumentoConstantesFunciones.generarExcelReporteDataDetalleDocumento("NORMAL",row,workbook,detalledocumento,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleDocumentoConstantesFunciones.getDetalleDocumentoDescripcion(detalledocumento));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleDocumento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleDocumento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleDocumento.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleDocumento.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleDocumento() throws Exception {		
		this.startProcessDetalleDocumento(true);
	}
	
	public void startProcessDetalleDocumento(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleDocumento ,this.jPanelParametrosReportesDetalleDocumento, this.jScrollPanelDatosDetalleDocumento,this.jPanelPaginacionDetalleDocumento, this.jScrollPanelDatosEdicionDetalleDocumento, this.jPanelAccionesDetalleDocumento,this.jPanelAccionesFormularioDetalleDocumento,this.jmenuBarDetalleDocumento,this.jmenuBarDetalleDetalleDocumento,this.jTtoolBarDetalleDocumento,this.jTtoolBarDetalleDetalleDocumento);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleDocumento=this.jTabbedPaneBusquedasDetalleDocumento; 
		
		final JPanel jPanelParametrosReportesDetalleDocumento=this.jPanelParametrosReportesDetalleDocumento;
		//final JScrollPane jScrollPanelDatosDetalleDocumento=this.jScrollPanelDatosDetalleDocumento;
		final JTable jTableDatosDetalleDocumento=this.jTableDatosDetalleDocumento;		
		final JPanel jPanelPaginacionDetalleDocumento=this.jPanelPaginacionDetalleDocumento;
		//final JScrollPane jScrollPanelDatosEdicionDetalleDocumento=this.jScrollPanelDatosEdicionDetalleDocumento;
		final JPanel jPanelAccionesDetalleDocumento=this.jPanelAccionesDetalleDocumento;
		
		JPanel jPanelCamposAuxiliarDetalleDocumento=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleDocumento=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			jPanelCamposAuxiliarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jPanelCamposDetalleDocumento;
			jPanelAccionesFormularioAuxiliarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jPanelAccionesFormularioDetalleDocumento;
		}
		
		final JPanel jPanelCamposDetalleDocumento=jPanelCamposAuxiliarDetalleDocumento;
		final JPanel jPanelAccionesFormularioDetalleDocumento=jPanelAccionesFormularioAuxiliarDetalleDocumento;
		
		
		final JMenuBar jmenuBarDetalleDocumento=this.jmenuBarDetalleDocumento;
		final JToolBar jTtoolBarDetalleDocumento=this.jTtoolBarDetalleDocumento;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleDocumento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleDocumento=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			jmenuBarDetalleAuxiliarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jmenuBarDetalleDetalleDocumento;
			jTtoolBarDetalleAuxiliarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jTtoolBarDetalleDetalleDocumento;
		}
		
		final JMenuBar jmenuBarDetalleDetalleDocumento=jmenuBarDetalleAuxiliarDetalleDocumento;
		final JToolBar jTtoolBarDetalleDetalleDocumento=jTtoolBarDetalleAuxiliarDetalleDocumento;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleDocumento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleDocumento;
			processRunnable.jTableDatos=jTableDatosDetalleDocumento;
			processRunnable.jPanelCampos=jPanelCamposDetalleDocumento;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleDocumento;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleDocumento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleDocumento;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleDocumento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleDocumento;
			processRunnable.jTtoolBar=jTtoolBarDetalleDocumento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleDocumento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleDocumento ,jPanelParametrosReportesDetalleDocumento,jTableDatosDetalleDocumento, /*jScrollPanelDatosDetalleDocumento,*/jPanelCamposDetalleDocumento,jPanelPaginacionDetalleDocumento, /*jScrollPanelDatosEdicionDetalleDocumento,*/ jPanelAccionesDetalleDocumento,jPanelAccionesFormularioDetalleDocumento,jmenuBarDetalleDocumento,jmenuBarDetalleDetalleDocumento,jTtoolBarDetalleDocumento,jTtoolBarDetalleDetalleDocumento);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleDocumento ,jPanelParametrosReportesDetalleDocumento, jScrollPanelDatosDetalleDocumento,jPanelPaginacionDetalleDocumento, jScrollPanelDatosEdicionDetalleDocumento, jPanelAccionesDetalleDocumento,jPanelAccionesFormularioDetalleDocumento,jmenuBarDetalleDocumento,jmenuBarDetalleDetalleDocumento,jTtoolBarDetalleDocumento,jTtoolBarDetalleDetalleDocumento);
						
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
	
	public void finishProcessDetalleDocumento() {// throws Exception 
		this.finishProcessDetalleDocumento(true);
	}
	
	public void finishProcessDetalleDocumento(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleDocumento ,this.jPanelParametrosReportesDetalleDocumento, this.jScrollPanelDatosDetalleDocumento,this.jPanelPaginacionDetalleDocumento, this.jScrollPanelDatosEdicionDetalleDocumento, this.jPanelAccionesDetalleDocumento,this.jPanelAccionesFormularioDetalleDocumento,this.jmenuBarDetalleDocumento,this.jmenuBarDetalleDetalleDocumento,this.jTtoolBarDetalleDocumento,this.jTtoolBarDetalleDetalleDocumento);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleDocumento=this.jTabbedPaneBusquedasDetalleDocumento; 
		
		final JPanel jPanelParametrosReportesDetalleDocumento=this.jPanelParametrosReportesDetalleDocumento;
		//final JScrollPane jScrollPanelDatosDetalleDocumento=this.jScrollPanelDatosDetalleDocumento;
		final JTable jTableDatosDetalleDocumento=this.jTableDatosDetalleDocumento;		
		final JPanel jPanelPaginacionDetalleDocumento=this.jPanelPaginacionDetalleDocumento;
		//final JScrollPane jScrollPanelDatosEdicionDetalleDocumento=this.jScrollPanelDatosEdicionDetalleDocumento;
		final JPanel jPanelAccionesDetalleDocumento=this.jPanelAccionesDetalleDocumento;
		
		JPanel jPanelCamposAuxiliarDetalleDocumento=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleDocumento=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			jPanelCamposAuxiliarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jPanelCamposDetalleDocumento;
			jPanelAccionesFormularioAuxiliarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jPanelAccionesFormularioDetalleDocumento;
		}
		
		final JPanel jPanelCamposDetalleDocumento=jPanelCamposAuxiliarDetalleDocumento;
		final JPanel jPanelAccionesFormularioDetalleDocumento=jPanelAccionesFormularioAuxiliarDetalleDocumento;
		
		
		final JMenuBar jmenuBarDetalleDocumento=this.jmenuBarDetalleDocumento;		
		final JToolBar jTtoolBarDetalleDocumento=this.jTtoolBarDetalleDocumento;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleDocumento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleDocumento=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			jmenuBarDetalleAuxiliarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jmenuBarDetalleDetalleDocumento;
			jTtoolBarDetalleAuxiliarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jTtoolBarDetalleDetalleDocumento;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleDocumento=jmenuBarDetalleAuxiliarDetalleDocumento;
		final JToolBar jTtoolBarDetalleDetalleDocumento=jTtoolBarDetalleAuxiliarDetalleDocumento;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleDocumento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleDocumento;
			processRunnable.jTableDatos=jTableDatosDetalleDocumento;
			processRunnable.jPanelCampos=jPanelCamposDetalleDocumento;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleDocumento;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleDocumento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleDocumento;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleDocumento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleDocumento;
			processRunnable.jTtoolBar=jTtoolBarDetalleDocumento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleDocumento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleDocumento ,jPanelParametrosReportesDetalleDocumento, jTableDatosDetalleDocumento,/*jScrollPanelDatosDetalleDocumento,*/jPanelCamposDetalleDocumento,jPanelPaginacionDetalleDocumento, /*jScrollPanelDatosEdicionDetalleDocumento,*/ jPanelAccionesDetalleDocumento,jPanelAccionesFormularioDetalleDocumento,jmenuBarDetalleDocumento,jmenuBarDetalleDetalleDocumento,jTtoolBarDetalleDocumento,jTtoolBarDetalleDetalleDocumento));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleDocumento(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleDocumento(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleDocumento(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleDocumento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDocumento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleDocumento,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleDocumento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDocumento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleDocumento,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalledocumentoConstantesFunciones.getsFinalQueryDetalleDocumento();
		String  finalQueryPaginacionTodos=this.detalledocumentoConstantesFunciones.getsFinalQueryDetalleDocumento();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleDocumentoConstantesFunciones.getArrayColumnasGlobalesNoDetalleDocumento(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleDocumentoConstantesFunciones.getArrayColumnasGlobalesDetalleDocumento(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleDocumentoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalledocumentosEliminados= new ArrayList<DetalleDocumento>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleDocumento();
		
				///*DetalleDocumentoSessionBean*/this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
			
			if(this.detalledocumentoSessionBean==null) {
				this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
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
					this.iNumeroPaginacion=DetalleDocumentoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleDocumentoConstantesFunciones.getClassesForeignKeysOfDetalleDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalledocumento."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalledocumentosAux= new ArrayList<DetalleDocumento>();
			
				
			detalledocumentoLogic.setDatosCliente(this.datosCliente);
			detalledocumentoLogic.setDatosDeep(this.datosDeep);
			detalledocumentoLogic.setIsConDeep(true);
			
			
			detalledocumentoLogic.getDetalleDocumentoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalledocumentoLogic.getTodosDetalleDocumentos(finalQueryGlobal,pagination);
					
					//detalledocumentoLogic.getTodosDetalleDocumentosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalledocumentoLogic.getDetalleDocumentos()==null|| detalledocumentoLogic.getDetalleDocumentos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalledocumentosAux= new ArrayList<DetalleDocumento>();
							detalledocumentosAux.addAll(detalledocumentoLogic.getDetalleDocumentos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledocumentosAux= new ArrayList<DetalleDocumento>();
							detalledocumentosAux.addAll(detalledocumentos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalledocumentoLogic.getTodosDetalleDocumentos(finalQueryGlobal+"",this.pagination);												
							
							//detalledocumentoLogic.getTodosDetalleDocumentosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleDocumentos("Todos",detalledocumentoLogic.getDetalleDocumentos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalledocumentoLogic.setDetalleDocumentos(new ArrayList<DetalleDocumento>());					
							detalledocumentoLogic.getDetalleDocumentos().addAll(detalledocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledocumentos=new ArrayList<DetalleDocumento>();
							detalledocumentos.addAll(detalledocumentosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleDocumento=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleDocumento=this.idActual;
				
				} else if(this.idDetalleDocumentoActual!=null && this.idDetalleDocumentoActual!=0L) {
					idDetalleDocumento=idDetalleDocumentoActual;
				}
				
					
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndicePorId(idDetalleDocumento);
				
				this.detalledocumentos=new ArrayList<DetalleDocumento>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalledocumentoLogic.getEntity(idDetalleDocumento);
					
					//detalledocumentoLogic.getEntityWithConnection(idDetalleDocumento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalledocumentoLogic.setDetalleDocumentos(new ArrayList<DetalleDocumento>());
					detalledocumentoLogic.getDetalleDocumentos().add(detalledocumentoLogic.getDetalleDocumento());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalledocumentos=new ArrayList<DetalleDocumento>();
					this.detalledocumentos.add(detalledocumento);
				}
				
				if(detalledocumentoLogic.getDetalleDocumento()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdModuloPorIdTipoTransaccion")) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdTipoTransaccion(id_moduloBusquedaPorIdModuloPorIdTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalledocumentoLogic.getDetalleDocumentosBusquedaPorIdModuloPorIdTipoTransaccion(finalQueryGlobal,pagination,id_moduloBusquedaPorIdModuloPorIdTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdTipoTransaccion(id_moduloBusquedaPorIdModuloPorIdTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdTipoTransaccion(id_moduloBusquedaPorIdModuloPorIdTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalledocumentoLogic.getDetalleDocumentos()==null||detalledocumentoLogic.getDetalleDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalledocumentos==null|| detalledocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentosAux=new ArrayList<DetalleDocumento>();
						detalledocumentosAux.addAll(detalledocumentoLogic.getDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledocumentosAux=new ArrayList<DetalleDocumento>();
							detalledocumentosAux.addAll(detalledocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalledocumentoLogic.getDetalleDocumentosBusquedaPorIdModuloPorIdTipoTransaccion(finalQueryGlobal,pagination,id_moduloBusquedaPorIdModuloPorIdTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdTipoTransaccion(id_moduloBusquedaPorIdModuloPorIdTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdTipoTransaccion(id_moduloBusquedaPorIdModuloPorIdTipoTransaccion,id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleDocumentos("BusquedaPorIdModuloPorIdTipoTransaccion",detalledocumentoLogic.getDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleDocumentos("BusquedaPorIdModuloPorIdTipoTransaccion",detalledocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentoLogic.setDetalleDocumentos(new ArrayList<DetalleDocumento>());
						detalledocumentoLogic.getDetalleDocumentos().addAll(detalledocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledocumentos=new ArrayList<DetalleDocumento>();
							detalledocumentos.addAll(detalledocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDetalleDocumento")) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdDetalleDocumento(id_tipo_detalle_documentoFK_IdDetalleDocumento);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalledocumentoLogic.getDetalleDocumentosFK_IdDetalleDocumento(finalQueryGlobal,pagination,id_tipo_detalle_documentoFK_IdDetalleDocumento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdDetalleDocumento(id_tipo_detalle_documentoFK_IdDetalleDocumento);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdDetalleDocumento(id_tipo_detalle_documentoFK_IdDetalleDocumento);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalledocumentoLogic.getDetalleDocumentos()==null||detalledocumentoLogic.getDetalleDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalledocumentos==null|| detalledocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentosAux=new ArrayList<DetalleDocumento>();
						detalledocumentosAux.addAll(detalledocumentoLogic.getDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledocumentosAux=new ArrayList<DetalleDocumento>();
							detalledocumentosAux.addAll(detalledocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalledocumentoLogic.getDetalleDocumentosFK_IdDetalleDocumento(finalQueryGlobal,pagination,id_tipo_detalle_documentoFK_IdDetalleDocumento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdDetalleDocumento(id_tipo_detalle_documentoFK_IdDetalleDocumento);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdDetalleDocumento(id_tipo_detalle_documentoFK_IdDetalleDocumento);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleDocumentos("FK_IdDetalleDocumento",detalledocumentoLogic.getDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleDocumentos("FK_IdDetalleDocumento",detalledocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentoLogic.setDetalleDocumentos(new ArrayList<DetalleDocumento>());
						detalledocumentoLogic.getDetalleDocumentos().addAll(detalledocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledocumentos=new ArrayList<DetalleDocumento>();
							detalledocumentos.addAll(detalledocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalledocumentoLogic.getDetalleDocumentosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalledocumentoLogic.getDetalleDocumentos()==null||detalledocumentoLogic.getDetalleDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalledocumentos==null|| detalledocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentosAux=new ArrayList<DetalleDocumento>();
						detalledocumentosAux.addAll(detalledocumentoLogic.getDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledocumentosAux=new ArrayList<DetalleDocumento>();
							detalledocumentosAux.addAll(detalledocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalledocumentoLogic.getDetalleDocumentosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleDocumentos("FK_IdEmpresa",detalledocumentoLogic.getDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleDocumentos("FK_IdEmpresa",detalledocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentoLogic.setDetalleDocumentos(new ArrayList<DetalleDocumento>());
						detalledocumentoLogic.getDetalleDocumentos().addAll(detalledocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledocumentos=new ArrayList<DetalleDocumento>();
							detalledocumentos.addAll(detalledocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalledocumentoLogic.getDetalleDocumentosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalledocumentoLogic.getDetalleDocumentos()==null||detalledocumentoLogic.getDetalleDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalledocumentos==null|| detalledocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentosAux=new ArrayList<DetalleDocumento>();
						detalledocumentosAux.addAll(detalledocumentoLogic.getDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledocumentosAux=new ArrayList<DetalleDocumento>();
							detalledocumentosAux.addAll(detalledocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalledocumentoLogic.getDetalleDocumentosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleDocumentos("FK_IdModulo",detalledocumentoLogic.getDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleDocumentos("FK_IdModulo",detalledocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentoLogic.setDetalleDocumentos(new ArrayList<DetalleDocumento>());
						detalledocumentoLogic.getDetalleDocumentos().addAll(detalledocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledocumentos=new ArrayList<DetalleDocumento>();
							detalledocumentos.addAll(detalledocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleDocumento();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleDocumento();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalledocumentoLogic.getDetalleDocumentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalledocumentos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalledocumentoLogic.getDetalleDocumentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalledocumentos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleDocumento detalledocumento) {
		Boolean permite=true;
		
		if(this.detalledocumento.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleDocumentoConstantesFunciones.getOrderByListaDetalleDocumento();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleDocumentoConstantesFunciones.getOrderByListaDetalleDocumento();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleDocumento detalledocumento:detalledocumentoLogic.getDetalleDocumentos()) {
				if(detalledocumento.getsType().equals(Constantes2.S_TOTALES)) {
					detalledocumentoTotales=detalledocumento;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleDocumento detalledocumento:this.detalledocumentos) {
				if(detalledocumento.getsType().equals(Constantes2.S_TOTALES)) {
					detalledocumentoTotales=detalledocumento;
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
			this.detalledocumentoAux=new DetalleDocumento();
			this.detalledocumentoAux.setsType(Constantes2.S_TOTALES);
			this.detalledocumentoAux.setIsNew(false);
			this.detalledocumentoAux.setIsChanged(false);
			this.detalledocumentoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleDocumentoConstantesFunciones.TotalizarValoresFilaDetalleDocumento(this.detalledocumentoLogic.getDetalleDocumentos(),this.detalledocumentoAux);
				
				this.detalledocumentoLogic.getDetalleDocumentos().add(this.detalledocumentoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleDocumentoConstantesFunciones.TotalizarValoresFilaDetalleDocumento(this.detalledocumentos,this.detalledocumentoAux);
				
				this.detalledocumentos.add(this.detalledocumentoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalledocumentoTotales=new DetalleDocumento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalledocumentoLogic.getDetalleDocumentos().remove(detalledocumentoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalledocumentos.remove(detalledocumentoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalledocumentoTotales=new DetalleDocumento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleDocumento detalledocumento:detalledocumentoLogic.getDetalleDocumentos()) {
				if(detalledocumento.getsType().equals(Constantes2.S_TOTALES)) {
					detalledocumentoTotales=detalledocumento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleDocumentoConstantesFunciones.TotalizarValoresFilaDetalleDocumento(this.detalledocumentoLogic.getDetalleDocumentos(),detalledocumentoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleDocumento detalledocumento:this.detalledocumentos) {
				if(detalledocumento.getsType().equals(Constantes2.S_TOTALES)) {
					detalledocumentoTotales=detalledocumento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleDocumentoConstantesFunciones.TotalizarValoresFilaDetalleDocumento(this.detalledocumentos,detalledocumentoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleDocumentosBusquedaPorIdModuloPorIdTipoTransaccion()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdModuloPorIdTipoTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleDocumentosFK_IdDetalleDocumento()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleDocumento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleDocumentosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleDocumentosFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleDocumentosFK_IdTipoTransaccionModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoTransaccionModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleDocumentosBusquedaPorIdModuloPorIdTipoTransaccion(String sFinalQuery,Long id_modulo,Long id_tipo_transaccion_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalledocumentoLogic.getDetalleDocumentosBusquedaPorIdModuloPorIdTipoTransaccion(sFinalQuery,this.pagination,id_modulo,id_tipo_transaccion_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleDocumentosFK_IdDetalleDocumento(String sFinalQuery,Long id_tipo_detalle_documento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalledocumentoLogic.getDetalleDocumentosFK_IdDetalleDocumento(sFinalQuery,this.pagination,id_tipo_detalle_documento);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleDocumentosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalledocumentoLogic.getDetalleDocumentosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleDocumentosFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalledocumentoLogic.getDetalleDocumentosFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleDocumentosFK_IdTipoTransaccionModulo(String sFinalQuery,Long id_tipo_transaccion_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalledocumentoLogic.getDetalleDocumentosFK_IdTipoTransaccionModulo(sFinalQuery,this.pagination,id_tipo_transaccion_modulo);
				
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
	
	public void inicializarPermisosDetalleDocumento() {
		this.isPermisoTodoDetalleDocumento=false;
		this.isPermisoNuevoDetalleDocumento=false;
		this.isPermisoActualizarDetalleDocumento=false;
		this.isPermisoActualizarOriginalDetalleDocumento=false;
		this.isPermisoEliminarDetalleDocumento=false;
		this.isPermisoGuardarCambiosDetalleDocumento=false;
		this.isPermisoConsultaDetalleDocumento=false;
		this.isPermisoBusquedaDetalleDocumento=false;
		this.isPermisoReporteDetalleDocumento=false;		
		this.isPermisoOrdenDetalleDocumento=false;		
		this.isPermisoPaginacionMedioDetalleDocumento=false;		
		this.isPermisoPaginacionAltoDetalleDocumento=false;
		this.isPermisoPaginacionTodoDetalleDocumento=false;
		this.isPermisoCopiarDetalleDocumento=false;		
		this.isPermisoVerFormDetalleDocumento=false;		
		this.isPermisoDuplicarDetalleDocumento=false;		
		this.isPermisoOrdenDetalleDocumento=false;		
	}
	
	public void setPermisosUsuarioDetalleDocumento(Boolean isPermiso) {
		this.isPermisoTodoDetalleDocumento=isPermiso;
		this.isPermisoNuevoDetalleDocumento=isPermiso;
		this.isPermisoActualizarDetalleDocumento=isPermiso;
		this.isPermisoActualizarOriginalDetalleDocumento=isPermiso;
		this.isPermisoEliminarDetalleDocumento=isPermiso;
		this.isPermisoGuardarCambiosDetalleDocumento=isPermiso;
		this.isPermisoConsultaDetalleDocumento=isPermiso;
		this.isPermisoBusquedaDetalleDocumento=isPermiso;
		this.isPermisoReporteDetalleDocumento=isPermiso;
		this.isPermisoOrdenDetalleDocumento=isPermiso;		
		this.isPermisoPaginacionMedioDetalleDocumento=isPermiso;		
		this.isPermisoPaginacionAltoDetalleDocumento=isPermiso;		
		this.isPermisoPaginacionTodoDetalleDocumento=isPermiso;		
		this.isPermisoCopiarDetalleDocumento=isPermiso;		
		this.isPermisoVerFormDetalleDocumento=isPermiso;		
		this.isPermisoDuplicarDetalleDocumento=isPermiso;
		this.isPermisoOrdenDetalleDocumento=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleDocumento(Boolean isPermiso) {
		//this.isPermisoTodoDetalleDocumento=isPermiso;
		this.isPermisoNuevoDetalleDocumento=isPermiso;
		this.isPermisoActualizarDetalleDocumento=isPermiso;
		this.isPermisoActualizarOriginalDetalleDocumento=isPermiso;
		this.isPermisoEliminarDetalleDocumento=isPermiso;
		this.isPermisoGuardarCambiosDetalleDocumento=isPermiso;
		//this.isPermisoConsultaDetalleDocumento=isPermiso;
		//this.isPermisoBusquedaDetalleDocumento=isPermiso;
		//this.isPermisoReporteDetalleDocumento=isPermiso;
		//this.isPermisoOrdenDetalleDocumento=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleDocumento=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleDocumento=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleDocumento=isPermiso;		
		//this.isPermisoCopiarDetalleDocumento=isPermiso;		
		//this.isPermisoDuplicarDetalleDocumento=isPermiso;
		//this.isPermisoOrdenDetalleDocumento=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleDocumentoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleDocumento(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleDocumentoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleDocumentoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleDocumentoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleDocumentoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleDocumento() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleDocumentoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleDocumento=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleDocumento=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleDocumento=this.isPermisoActualizarDetalleDocumento;
			this.isPermisoEliminarDetalleDocumento=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleDocumento=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleDocumento=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleDocumento=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleDocumento=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleDocumento=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleDocumento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleDocumento=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleDocumento=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleDocumento=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleDocumento=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleDocumento=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleDocumento=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleDocumento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleDocumento.setToolTipText(this.jTableDatosDetalleDocumento.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleDocumento(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleDocumento(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleDocumento() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleDocumentoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.tipotransaccionmodulosForeignKey=new ArrayList();
				this.tipodetalledocumentosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleDocumentoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleDocumentoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleDocumentoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoTransaccionModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDetalleDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoTransaccionModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.tipotransaccionmodulosForeignKey==null||this.tipotransaccionmodulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoTransaccionModuloConstantesFunciones.getArrayColumnasGlobalesTipoTransaccionModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTransaccionModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoTransaccionModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoTransaccionModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoDetalleDocumentoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodetalledocumentosForeignKey==null||this.tipodetalledocumentosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDetalleDocumentoConstantesFunciones.getArrayColumnasGlobalesTipoDetalleDocumento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDetalleDocumentoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDetalleDocumentoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDetalleDocumentosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetalleDocumentoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleDocumentoParameterReturnGeneral detalledocumentoReturnGeneral=new DetalleDocumentoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalledocumentoConstantesFunciones.cargarid_empresaDetalleDocumento)
					 || (this.esRecargarFks && this.detalledocumentoConstantesFunciones.cargarid_empresaDetalleDocumento)) {

					if(!this.detalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalledocumentoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.detalledocumentoConstantesFunciones.cargarid_moduloDetalleDocumento)
					 || (this.esRecargarFks && this.detalledocumentoConstantesFunciones.cargarid_moduloDetalleDocumento)) {

					if(!this.detalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+detalledocumentoSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTipoTransaccionModulo="";

				if(cargarCombosDependencia && ((this.tipotransaccionmodulosForeignKey==null||this.tipotransaccionmodulosForeignKey.size()<=0) && this.detalledocumentoConstantesFunciones.cargarid_tipo_transaccion_moduloDetalleDocumento)
					 || (this.esRecargarFks && this.detalledocumentoConstantesFunciones.cargarid_tipo_transaccion_moduloDetalleDocumento)) {

					if(!this.detalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoTransaccionModuloConstantesFunciones.getArrayColumnasGlobalesTipoTransaccionModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoTransaccionModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTransaccionModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoTransaccionModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoTransaccionModulo, "");
						finalQueryGlobalTipoTransaccionModulo+=TipoTransaccionModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoTransaccionModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoTransaccionModulo=" WHERE " + ConstantesSql.ID + "="+detalledocumentoSessionBean.getlidTipoTransaccionModuloActual();
					}
				} else {
					finalQueryGlobalTipoTransaccionModulo="NONE";
				}


				String finalQueryGlobalTipoDetalleDocumento="";

				if(((this.tipodetalledocumentosForeignKey==null||this.tipodetalledocumentosForeignKey.size()<=0) && this.detalledocumentoConstantesFunciones.cargarid_tipo_detalle_documentoDetalleDocumento)
					 || (this.esRecargarFks && this.detalledocumentoConstantesFunciones.cargarid_tipo_detalle_documentoDetalleDocumento)) {

					if(!this.detalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionTipoDetalleDocumento()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoDetalleDocumentoConstantesFunciones.getArrayColumnasGlobalesTipoDetalleDocumento(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoDetalleDocumento=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDetalleDocumentoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoDetalleDocumento=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoDetalleDocumento, "");
						finalQueryGlobalTipoDetalleDocumento+=TipoDetalleDocumentoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoDetalleDocumentosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoDetalleDocumento=" WHERE " + ConstantesSql.ID + "="+detalledocumentoSessionBean.getlidTipoDetalleDocumentoActual();
					}
				} else {
					finalQueryGlobalTipoDetalleDocumento="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalledocumentoReturnGeneral=detalledocumentoLogic.cargarCombosLoteForeignKeyDetalleDocumento(finalQueryGlobalEmpresa,finalQueryGlobalModulo,finalQueryGlobalTipoTransaccionModulo,finalQueryGlobalTipoDetalleDocumento);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalledocumentoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=detalledocumentoReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTipoTransaccionModulo.equals("NONE")) {
				this.tipotransaccionmodulosForeignKey=detalledocumentoReturnGeneral.gettipotransaccionmodulosForeignKey();
			}

			if(!finalQueryGlobalTipoDetalleDocumento.equals("NONE")) {
				this.tipodetalledocumentosForeignKey=detalledocumentoReturnGeneral.gettipodetalledocumentosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleDocumento()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
			this.addItemDefectoCombosForeignKeyTipoDetalleDocumento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detalledocumentoSessionBean==null) {
				this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
			}

			if(!this.detalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.detalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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

	public void addItemDefectoCombosForeignKeyTipoTransaccionModulo()throws Exception {
		try {

			if(!this.detalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionTipoTransaccionModulo()) {
				TipoTransaccionModulo tipotransaccionmodulo=new TipoTransaccionModulo();
				TipoTransaccionModuloConstantesFunciones.setTipoTransaccionModuloDescripcion(tipotransaccionmodulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipotransaccionmodulo.setId(null);

				if(!TipoTransaccionModuloConstantesFunciones.ExisteEnLista(this.tipotransaccionmodulosForeignKey,tipotransaccionmodulo,true)) {

					this.tipotransaccionmodulosForeignKey.add(0,tipotransaccionmodulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoDetalleDocumento()throws Exception {
		try {

			if(!this.detalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionTipoDetalleDocumento()) {
				TipoDetalleDocumento tipodetalledocumento=new TipoDetalleDocumento();
				TipoDetalleDocumentoConstantesFunciones.setTipoDetalleDocumentoDescripcion(tipodetalledocumento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodetalledocumento.setId(null);

				if(!TipoDetalleDocumentoConstantesFunciones.ExisteEnLista(this.tipodetalledocumentosForeignKey,tipodetalledocumento,true)) {

					this.tipodetalledocumentosForeignKey.add(0,tipodetalledocumento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetalleDocumento()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyModulo("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleDocumento(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyModulo(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyModulo(JComboBox jComboBoxModuloGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Modulo moduloLocal=(Modulo)jComboBoxModuloGenerico.getSelectedItem();

			if(moduloLocal!=null  && moduloLocal.getId()!=null  && moduloLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_modulo="+moduloLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboTipoTransaccionModulo=sFinalQueryCombo;

			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();
			this.cargarCombosForeignKeyTipoTransaccionModulo(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyModulo(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
						this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.addItemListener(new ComboBoxItemListener(this,"id_moduloDetalleDocumento"));
						this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.addFocusListener(new ComboBoxFocusListener(this,"id_moduloDetalleDocumento"));
					}
				} else {
					if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
						this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.addActionListener(new ComboBoxActionListener(this,"id_moduloDetalleDocumento"));
						this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.addFocusListener(new ComboBoxFocusListener(this,"id_moduloDetalleDocumento"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento"));

						this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento"));

					} else {
						this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento"));

						this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_moduloFK_IdModuloDetalleDocumento.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_moduloFK_IdModuloDetalleDocumento"));

						this.jComboBoxid_moduloFK_IdModuloDetalleDocumento.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloFK_IdModuloDetalleDocumento"));

					} else {
						this.jComboBoxid_moduloFK_IdModuloDetalleDocumento.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_moduloFK_IdModuloDetalleDocumento"));

						this.jComboBoxid_moduloFK_IdModuloDetalleDocumento.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloFK_IdModuloDetalleDocumento"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyDetalleDocumento()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleDocumento();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleDocumento(DetalleDocumento detalledocumento)throws Exception {	
		try {
			
			this.setActualModuloForeignKey(detalledocumento.getid_modulo(),false,"Formulario");
			this.setActualTipoTransaccionModuloForeignKey(detalledocumento.getid_tipo_transaccion_modulo(),false,"Formulario");
			this.setActualTipoDetalleDocumentoForeignKey(detalledocumento.getid_tipo_detalle_documento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleDocumento(DetalleDocumento detalledocumento,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleDocumento()throws Exception {	
		try {
			
			this.setActualModuloForeignKey(this.detalledocumentoConstantesFunciones.getid_modulo(),false,"Formulario");
			this.setActualTipoTransaccionModuloForeignKey(this.detalledocumentoConstantesFunciones.getid_tipo_transaccion_modulo(),false,"Formulario");
			this.setActualTipoDetalleDocumentoForeignKey(this.detalledocumentoConstantesFunciones.getid_tipo_detalle_documento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleDocumento()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleDocumento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleDocumento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleDocumento()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleDocumento()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTipoTransaccionModulosForeignKey("Todos");
			this.cargarCombosFrameTipoDetalleDocumentosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleDocumento(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDetalleDocumentosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleDocumento()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento!=null && this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento!=null && this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento!=null && this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento!=null && this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	



	public void recargarFormDetalleDocumentoModulo(JComboBox<?> jComboBoxGenericoModulo,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormDetalleDocumentoid_tipo_transaccion_modulo(jComboBoxGenericoModulo,sFormularioTipoBusqueda,"Modulo",false);
	}




	
	



	public void recargarFormDetalleDocumentoid_tipo_transaccion_modulo(JComboBox<?> jComboBoxGenericoTipoTransaccionModulo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Modulo")){
				this.setActualParaGuardarModuloForeignKey(this.detalledocumento,jComboBoxGenericoTipoTransaccionModulo);
			}

			if(this.detalledocumento.getid_modulo()!=null && this.detalledocumento.getid_modulo()!=0L) {
				sFinalQuery+="  WHERE  id_modulo="+this.detalledocumento.getid_modulo();
			} else {
				sFinalQuery+="  WHERE  id_modulo=-1";
			}



			//BUCLE RECURSIVO
			this.setActualTipoTransaccionModuloForeignKey(this.detalledocumento.getid_modulo(),true,sFormularioTipoBusqueda);

			this.cargarCombosTipoTransaccionModulosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public DetalleDocumentoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleDocumentoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleDocumentoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean(); 
		this.detalledocumentoConstantesFunciones=new DetalleDocumentoConstantesFunciones(); 
		this.detalledocumentoBean=new DetalleDocumento();//(this.detalledocumentoConstantesFunciones); 		
		this.detalledocumentoReturnGeneral=new DetalleDocumentoParameterReturnGeneral(); 
		
		this.detalledocumentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalledocumentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleDocumentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleDocumentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleDocumentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleDocumento(true);
			
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
			
			this.detalledocumentoConstantesFunciones=new DetalleDocumentoConstantesFunciones(); 
			this.detalledocumentoBean=new DetalleDocumento();//this.detalledocumentoConstantesFunciones); 			
			this.detalledocumentoReturnGeneral=new DetalleDocumentoParameterReturnGeneral(); 
		
			DetalleDocumentoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Documento Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.detalledocumento=new DetalleDocumento();
			this.detalledocumentos = new ArrayList<DetalleDocumento>();
			this.detalledocumentosAux = new ArrayList<DetalleDocumento>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic=new DetalleDocumentoLogic();
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			//this.detalledocumentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalledocumentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleDocumento);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleDocumento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleDocumento);	
					}
					
					if(this.jInternalFrameImportacionDetalleDocumento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleDocumento);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleDocumento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleDocumento);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleDocumento);
				this.jInternalFrameDetalleFormDetalleDocumento.setVisible(false);
				this.jInternalFrameDetalleFormDetalleDocumento.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleDocumento!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleDocumento);
					this.jInternalFrameReporteDinamicoDetalleDocumento.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleDocumento.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleDocumento!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleDocumento);
					this.jInternalFrameImportacionDetalleDocumento.setVisible(false);
					this.jInternalFrameImportacionDetalleDocumento.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleDocumento!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleDocumento);
					this.jInternalFrameOrderByDetalleDocumento.setVisible(false);
					this.jInternalFrameOrderByDetalleDocumento.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleDocumentoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleDocumentoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalledocumentoReturnGeneral=new DetalleDocumentoParameterReturnGeneral();
			
			this.detalledocumentoParameterGeneral=new DetalleDocumentoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalledocumentoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleDocumentoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalledocumentoSessionBean.getEsGuardarRelacionado(),this.detalledocumentoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleDocumentoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalledocumentoSessionBean.getEsGuardarRelacionado(),this.detalledocumentoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleDocumento=false;
			this.isVisibilidadCeldaDuplicarDetalleDocumento=true;
			this.isVisibilidadCeldaCopiarDetalleDocumento=true;
			this.isVisibilidadCeldaVerFormDetalleDocumento=true;
			this.isVisibilidadCeldaOrdenDetalleDocumento=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=false;
			this.isVisibilidadCeldaModificarDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarDetalleDocumento=false;
			this.isVisibilidadCeldaEliminarDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=false;
			
			
			this.isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion=true;
			this.isVisibilidadFK_IdDetalleDocumento=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdTipoTransaccionModulo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleDocumento();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleDocumento(false);
			
			this.setPermisosUsuarioDetalleDocumento();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado() 
				|| (this.detalledocumentoSessionBean.getEsGuardarRelacionado() && this.detalledocumentoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleDocumentoClasesRelacionadas();
			}
			
			if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleDocumentoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleDocumento();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleDocumento();
			}
			
			if(!this.isPermisoBusquedaDetalleDocumento) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleDocumento.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleDocumento,this.isPermisoPaginacionMedioDetalleDocumento,this.isPermisoPaginacionTodoDetalleDocumento);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleDocumentoConstantesFunciones.getTiposSeleccionarDetalleDocumento());
				
				this.tiposColumnasSelect=DetalleDocumentoConstantesFunciones.getTiposSeleccionarDetalleDocumento(true);
				
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
			//if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleDocumento();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDetalleDocumento(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDetalleDocumento(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleDocumento() ;
			
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
			this.moduloLogic=new ModuloLogic();
			this.tipotransaccionmoduloLogic=new TipoTransaccionModuloLogic();
			this.tipodetalledocumentoLogic=new TipoDetalleDocumentoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detalledocumentoImplementable= (DetalleDocumentoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleDocumentoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalledocumentoImplementableHome= (DetalleDocumentoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleDocumentoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalledocumentos= new ArrayList<DetalleDocumento>();
			this.detalledocumentosEliminados= new ArrayList<DetalleDocumento>();
						
			this.isEsNuevoDetalleDocumento=false;
			this.esParaAccionDesdeFormularioDetalleDocumento=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>() ;
			this.tipodetalledocumentosForeignKey=new ArrayList<TipoDetalleDocumento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleDocumento(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleDocumento();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleDocumentoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleDocumentoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleDocumento(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleDocumento();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleDocumento();
			}
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleDocumento.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleDocumento.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleDocumento.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleDocumento(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleDocumento: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleDocumento() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleDocumento")) {
				iIndex=this.jInternalFrameDetalleFormDetalleDocumento.jTabbedPaneRelacionesDetalleDocumento.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleDocumento.jTabbedPaneRelacionesDetalleDocumento.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleDocumento();	
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
	
	public void cargarCombosForeignKeyDetalleDocumento(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleDocumento(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleDocumento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleDocumentoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleDocumento();
		
		this.cargarCombosFrameForeignKeyDetalleDocumento();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleDocumento();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleDocumento();
		}
	}
	
	

	public void cargarCombosForeignKeyModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaModulo(this.modulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoTransaccionModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoTransaccionModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
				this.cargarCombosFrameTipoTransaccionModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaTipoTransaccionModulo(this.tipotransaccionmodulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoDetalleDocumento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDetalleDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDetalleDocumento();
				this.cargarCombosFrameTipoDetalleDocumentosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaTipoDetalleDocumento(this.tipodetalledocumentosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleDocumentoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			
			
			if(jTableDatosDetalleDocumento.getRowCount()>=1) {
				jTableDatosDetalleDocumento.removeRowSelectionInterval(0, jTableDatosDetalleDocumento.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleDocumento=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleDocumento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleDocumento(true);			
			//this.detalledocumento=new DetalleDocumento();
			//this.detalledocumento.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleDocumento(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleDocumento() ;
			
			if(DetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleDocumento(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalledocumento);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);				
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			
			if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleDocumento: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleDocumentoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleDocumento.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleDocumento.getSelectedRows().length;			
			}
			
			detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleDocumento--;			
				//DetalleDocumento detalledocumentoAux= new DetalleDocumento();			
				//detalledocumentoAux.setId(this.iIdNuevoDetalleDocumento);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleDocumento detalledocumentoOrigen=new DetalleDocumento();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleDocumento detalledocumentoOrigen : detalledocumentosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalledocumentoOrigen =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledocumentoOrigen =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleDocumento();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalledocumento.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleDocumento(detalledocumentoOrigen,this.detalledocumento,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalledocumentoLogic.getDetalleDocumentos().add(this.detalledocumentoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalledocumentos.add(this.detalledocumentoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleDocumento(false);
				
				this.jTableDatosDetalleDocumento.setRowSelectionInterval(this.getIndiceNuevoDetalleDocumento(), this.getIndiceNuevoDetalleDocumento());
				
				int iLastRow =  this.jTableDatosDetalleDocumento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleDocumento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleDocumento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleDocumento(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();									
		
			DetalleDocumento detalledocumentoOrigen=new DetalleDocumento();
			DetalleDocumento detalledocumentoDestino=new DetalleDocumento();
				
			detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleDocumento.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalledocumentosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleDocumento.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentoOrigen =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalledocumentoOrigen =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledocumentoDestino =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalledocumentoDestino =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalledocumentoOrigen =detalledocumentosSeleccionados.get(0);
				detalledocumentoDestino =detalledocumentosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleDocumento(detalledocumentoOrigen,detalledocumentoDestino,true,false);
				
				detalledocumentoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalledocumentoDestino,detalledocumentoLogic.getDetalleDocumentos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalledocumentoDestino,detalledocumentos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleDocumento(false);
				
				//this.jTableDatosDetalleDocumento.setRowSelectionInterval(this.getIndiceNuevoDetalleDocumento(), this.getIndiceNuevoDetalleDocumento());
				
				int iLastRow =  this.jTableDatosDetalleDocumento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleDocumento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleDocumento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleDocumento(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleDocumento.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleDocumento.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleDocumento.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleDocumento.setVisible(!isVisible);
			this.jPanelPaginacionDetalleDocumento.setVisible(!isVisible);
			this.jPanelAccionesDetalleDocumento.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleDocumento();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleDocumento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleDocumento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleDocumento();
			
			this.abrirFrameOrderByDetalleDocumento();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleDocumento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleDocumento(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleDocumento);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleDocumento.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleDocumento.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleDocumento.setSize(this.jInternalFrameDetalleFormDetalleDocumento.iWidthFormulario,this.jInternalFrameDetalleFormDetalleDocumento.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleDocumento.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleDocumento.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleDocumento.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleDocumento.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleDocumento.jContentPaneDetalleDetalleDocumento.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleDocumento.jTabbedPaneRelacionesDetalleDocumento.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleDocumento.jContentPaneDetalleDetalleDocumento.getWidth(),DetalleDocumentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleDocumento.jTabbedPaneRelacionesDetalleDocumento.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleDocumento.jContentPaneDetalleDetalleDocumento.getWidth(),DetalleDocumentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleDocumento.jTabbedPaneRelacionesDetalleDocumento.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleDocumento.jContentPaneDetalleDetalleDocumento.getWidth(),DetalleDocumentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleDocumento.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleDocumento.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleDocumento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleDocumento==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleDocumento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleDocumento,false,this);
				} else {
					this.jInternalFrameOrderByDetalleDocumento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleDocumento,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleDocumento);
				this.jInternalFrameOrderByDetalleDocumento.setVisible(false);
				this.jInternalFrameOrderByDetalleDocumento.setSelected(false);
				
				this.jInternalFrameOrderByDetalleDocumento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleDocumento"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleDocumento();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleDocumento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleDocumento==null) {
				
				this.jInternalFrameImportacionDetalleDocumento=new ImportacionJInternalFrame(DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleDocumento);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleDocumento);
				this.jInternalFrameImportacionDetalleDocumento.setVisible(false);
				this.jInternalFrameImportacionDetalleDocumento.setSelected(false);


				this.jInternalFrameImportacionDetalleDocumento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleDocumento"));
				this.jInternalFrameImportacionDetalleDocumento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleDocumento"));
				this.jInternalFrameImportacionDetalleDocumento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleDocumento"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleDocumento() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleDocumento==null) {
				this.jInternalFrameReporteDinamicoDetalleDocumento=new ReporteDinamicoJInternalFrame(DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleDocumento);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleDocumento);
				this.jInternalFrameReporteDinamicoDetalleDocumento.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleDocumento.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleDocumento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleDocumento"));
				this.jInternalFrameReporteDinamicoDetalleDocumento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleDocumento"));
				this.jInternalFrameReporteDinamicoDetalleDocumento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleDocumento"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleDocumento();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleDocumento() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleDocumento);
			
	       	this.jInternalFrameDetalleFormDetalleDocumento.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleDocumento.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleDocumento.dispose();
			//this.jInternalFrameDetalleFormDetalleDocumento=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleDocumento() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleDocumento.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleDocumento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleDocumento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleDocumento.setVisible(true);
	        this.jInternalFrameImportacionDetalleDocumento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleDocumento() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleDocumento.setVisible(true);
	        this.jInternalFrameOrderByDetalleDocumento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleDocumento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleDocumento.setVisible(false);
	        this.jInternalFrameOrderByDetalleDocumento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleDocumento() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleDocumento.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleDocumento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleDocumento() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleDocumento.setVisible(false);
	        this.jInternalFrameImportacionDetalleDocumento.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleDocumento(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleDocumento(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleDocumento(true);
			//this.isEsNuevoDetalleDocumento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleDocumento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleDocumento(false) ;
			
			if(detalledocumentoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleDocumento(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleDocumento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleDocumentoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleDocumento(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleDocumento(true);
			//this.isEsNuevoDetalleDocumento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalledocumento.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleDocumento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleDocumento(false) ;
			
			if(DetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleDocumento(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleDocumento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaModulo(List<Modulo> modulosForeignKey)throws Exception{
		TableColumn tableColumnModulo=this.jTableDatosDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDocumento,DetalleDocumentoConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleDocumento.getSelectedRow();

		//if(intSelectedRow<=0) {
			//moduloTableCellFk.setRowActual(intSelectedRow);
			//moduloTableCellFk.setmodulosForeignKeyActual(modulosForeignKey);
		//}


		if(moduloTableCellFk!=null) {
			moduloTableCellFk.RecargarModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoTransaccionModulo(List<TipoTransaccionModulo> tipotransaccionmodulosForeignKey)throws Exception{
		TableColumn tableColumnTipoTransaccionModulo=this.jTableDatosDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDocumento,DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO));
		TableCellEditor tableCellEditorTipoTransaccionModulo =tableColumnTipoTransaccionModulo.getCellEditor();

		TipoTransaccionModuloTableCell tipotransaccionmoduloTableCellFk=(TipoTransaccionModuloTableCell)tableCellEditorTipoTransaccionModulo;

		if(tipotransaccionmoduloTableCellFk!=null) {
			tipotransaccionmoduloTableCellFk.settipotransaccionmodulosForeignKey(tipotransaccionmodulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleDocumento.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipotransaccionmoduloTableCellFk.setRowActual(intSelectedRow);
			//tipotransaccionmoduloTableCellFk.settipotransaccionmodulosForeignKeyActual(tipotransaccionmodulosForeignKey);
		//}


		if(tipotransaccionmoduloTableCellFk!=null) {
			tipotransaccionmoduloTableCellFk.RecargarTipoTransaccionModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoDetalleDocumento(List<TipoDetalleDocumento> tipodetalledocumentosForeignKey)throws Exception{
		TableColumn tableColumnTipoDetalleDocumento=this.jTableDatosDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDocumento,DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO));
		TableCellEditor tableCellEditorTipoDetalleDocumento =tableColumnTipoDetalleDocumento.getCellEditor();

		TipoDetalleDocumentoTableCell tipodetalledocumentoTableCellFk=(TipoDetalleDocumentoTableCell)tableCellEditorTipoDetalleDocumento;

		if(tipodetalledocumentoTableCellFk!=null) {
			tipodetalledocumentoTableCellFk.settipodetalledocumentosForeignKey(tipodetalledocumentosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleDocumento.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodetalledocumentoTableCellFk.setRowActual(intSelectedRow);
			//tipodetalledocumentoTableCellFk.settipodetalledocumentosForeignKeyActual(tipodetalledocumentosForeignKey);
		//}


		if(tipodetalledocumentoTableCellFk!=null) {
			tipodetalledocumentoTableCellFk.RecargarTipoDetalleDocumentosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleDocumento(false);
			
			//if(!this.isEsNuevoDetalleDocumento) {								
				int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleDocumento(this.detalledocumento,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
				
			}
			
			if(this.permiteMantenimiento(this.detalledocumento)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleDocumento=true;
					this.inicializarActualizarBindingTablaDetalleDocumento(false);
					this.isEsNuevoDetalleDocumento=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleDocumento=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleDocumento=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleDocumento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleDocumento(false);
				
				this.habilitarDeshabilitarControlesDetalleDocumento(false);
			
												
				
				if(DetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleDocumento();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleDocumentoActionPerformed(evt,detalledocumentoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleDocumento(this.detalledocumento,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleDocumento.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalledocumentoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalledocumento.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleDocumento.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDocumento.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				this.detalledocumento.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				this.detalledocumento.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalledocumento)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleDocumentoModel) this.jTableDatosDetalleDocumento.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleDocumento=true;
				this.inicializarActualizarBindingTablaDetalleDocumento(false);
				this.isEsNuevoDetalleDocumento=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleDocumento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleDocumento(false);
				
				this.habilitarDeshabilitarControlesDetalleDocumento(false);
				
				
				
				if(DetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleDocumento();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleDocumento.getRowCount()>=1) {
				jTableDatosDetalleDocumento.removeRowSelectionInterval(0, jTableDatosDetalleDocumento.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleDocumento(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleDocumento(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleDocumento(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleDocumento(false) ;
			
			this.isEsNuevoDetalleDocumento=false;
			
			if(DetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleDocumento();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleDocumento(false);
				
				//SI ES MANUAL
				if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleDocumento();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleDocumento--;			
			//DetalleDocumento detalledocumentoAux= new DetalleDocumento();			
			//detalledocumentoAux.setId(this.iIdNuevoDetalleDocumento);
			
			if(this.jInternalFrameDetalleFormDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleDocumento();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
			
			this.detalledocumento.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalledocumentoLogic.getDetalleDocumentos().add(this.detalledocumentoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalledocumentos.add(this.detalledocumentoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleDocumento(false);
			
			this.jTableDatosDetalleDocumento.setRowSelectionInterval(this.getIndiceNuevoDetalleDocumento(), this.getIndiceNuevoDetalleDocumento());
			
			int iLastRow =  this.jTableDatosDetalleDocumento.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleDocumento.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleDocumento.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleDocumento(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleDocumento(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleDocumento(false);
			
			//SI ES MANUAL
			if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleDocumento();
			}
			
			//this.abrirFrameTreeDetalleDocumento();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle DocumentoS ?", "MANTENIMIENTO DE Detalle Documento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleDocumento.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleDocumento();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalledocumentoReturnGeneral=detalledocumentoLogic.procesarImportacionDetalleDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalledocumentoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleDocumentoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleDocumento.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleDocumento.setFileImportacion(this.jInternalFrameImportacionDetalleDocumento.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleDocumento.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleDocumento.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleDocumento.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleDocumento.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();		

		detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleDocumento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleDocumento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleDocumentoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleDocumentoBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleDocumentos("Todos",detalledocumentosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleDocumento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleDocumento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoTransaccionModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoTransaccionModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoTransaccionModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoTransaccionModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoDetalleDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoDetalleDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoDetalleDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoDetalleDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleDocumentoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoDetalleDocumento.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleDocumento.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleDocumento.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					sNombreCampoCategoria="id_tipo_transaccion_modulo";
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO:
					sNombreCampoCategoria="id_tipo_detalle_documento";
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleDocumento.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					sNombreCampoCategoriaValor="id_tipo_transaccion_modulo";
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO:
					sNombreCampoCategoriaValor="id_tipo_detalle_documento";
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleDocumento.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleDocumento.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Transaccion Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_transaccion_modulo");
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"T Detalle Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_detalle_documento");
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();		
		
		detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledocumento";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleDocumentos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleDocumento.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleDocumento.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleDocumento detalledocumento:detalledocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalledocumento.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(DetalleDocumento detalledocumento:detalledocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalledocumento.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
					iRow++;

					for(DetalleDocumento detalledocumento:detalledocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalledocumento.gettipotransaccionmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO);
					iRow++;

					for(DetalleDocumento detalledocumento:detalledocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalledocumento.gettipodetalledocumento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleDocumentoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(DetalleDocumento detalledocumento:detalledocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalledocumento.getnombre());
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
			//	this.getFilaCabeceraExportarExcelDetalleDocumento(row);				
			//	iRow++;
			//}				
			
			//for(DetalleDocumento detalledocumentoAux:detalledocumentosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleDocumento(detalledocumentoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleDocumento(false);
			
			//SI ES MANUAL
			if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleDocumento();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleDocumento(false);
			
			//SI ES MANUAL
			if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleDocumento();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleDocumento(false);
			
			//SI ES MANUAL
			if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleDocumento();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleDocumento() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleDocumento.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleDocumento.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleDocumento.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleDocumento.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleDocumento.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleDocumento.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleDocumento.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleDocumento(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleDocumento(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleDocumento(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleDocumento(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleDocumento(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleDocumento(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleDocumento(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleDocumento(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleDocumento() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleDocumento();
		
		this.inicializarActualizarBindingBotonesManualDetalleDocumento(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleDocumento();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleDocumento() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleDocumento(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleDocumento(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleDocumento.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleDocumento.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleDocumento.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleDocumento.jCheckBoxPostAccionNuevoDetalleDocumento.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleDocumento.jCheckBoxPostAccionSinCerrarDetalleDocumento.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleDocumento.jCheckBoxPostAccionSinMensajeDetalleDocumento.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleDocumento.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleDocumento.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleDocumento.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
				this.jInternalFrameDetalleFormDetalleDocumento.jCheckBoxPostAccionNuevoDetalleDocumento.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleDocumento.jCheckBoxPostAccionSinCerrarDetalleDocumento.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleDocumento.jCheckBoxPostAccionSinMensajeDetalleDocumento.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleDocumento.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleDocumento.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleDocumento.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleDocumento!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleDocumento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleDocumento.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleDocumento.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleDocumento.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleDocumento.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleDocumento!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleDocumento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleDocumento.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleDocumento.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleDocumento(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleDocumento(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleDocumento() throws Exception {
		try	{
			if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleDocumento();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleDocumento() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleDocumento() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleDocumento.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleDocumento.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleDocumento.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleDocumento.addItem(reporte);
			}
			
			
			if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleDocumento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleDocumento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleDocumento.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleDocumento.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleDocumento.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleDocumento.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleDocumento();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleDocumento() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleDocumento!=null) {
				this.jInternalFrameReporteDinamicoDetalleDocumento.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleDocumento.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleDocumento!=null) {
				this.jInternalFrameReporteDinamicoDetalleDocumento.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleDocumento.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleDocumento!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleDocumento.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleDocumento.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleDocumento.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleDocumento.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleDocumento.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleDocumento.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleDocumento()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.getSelectedItem()!=null){this.id_moduloBusquedaPorIdModuloPorIdTipoTransaccion=((Modulo)this.jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.getSelectedItem()!=null){this.id_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion=((TipoTransaccionModulo)this.jComboBoxid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.getSelectedItem()!=null){this.id_tipo_detalle_documentoFK_IdDetalleDocumento=((TipoDetalleDocumento)this.jComboBoxid_tipo_detalle_documentoFK_IdDetalleDocumentoDetalleDocumento.getSelectedItem()).getId();}
		if(this.jComboBoxid_moduloFK_IdModuloDetalleDocumento.getSelectedItem()!=null){this.id_moduloFK_IdModulo=((Modulo)this.jComboBoxid_moduloFK_IdModuloDetalleDocumento.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleDocumento(Boolean esInicializar) throws Exception {				
		if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleDocumento();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleDocumento() throws Exception {
		this.inicializarActualizarBindingTablaDetalleDocumento(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleDocumento() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleDocumentoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleDocumentoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleDocumentoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDocumentoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleDocumentoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleDocumentoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleDocumento(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalledocumentoLogic.getDetalleDocumentos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalledocumentos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleDocumento.setModel(new DetalleDocumentoModel(this.detalledocumentoLogic.getDetalleDocumentos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleDocumento.setModel(new DetalleDocumentoModel(this.detalledocumentos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleDocumento!=null && this.jInternalFrameOrderByDetalleDocumento.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleDocumento();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDocumento,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleDocumentoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO,detalledocumentoConstantesFunciones.resaltarSeleccionarDetalleDocumento,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO,detalledocumentoConstantesFunciones.resaltarSeleccionarDetalleDocumento,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDocumento,DetalleDocumentoConstantesFunciones.LABEL_ID));

		if(this.detalledocumentoConstantesFunciones.mostraridDetalleDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleDocumentoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalledocumentoConstantesFunciones.resaltaridDetalleDocumento,this.detalledocumentoConstantesFunciones.activaridDetalleDocumento,this,true,"idDetalleDocumento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalledocumentoConstantesFunciones.resaltaridDetalleDocumento,this.detalledocumentoConstantesFunciones.activaridDetalleDocumento,this,true,"idDetalleDocumento","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDocumento,DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalledocumentoConstantesFunciones.mostrarid_empresaDetalleDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalledocumentoConstantesFunciones.resaltarid_empresaDetalleDocumento,this,this.detalledocumentoConstantesFunciones.activarid_empresaDetalleDocumento));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalledocumentoConstantesFunciones.resaltarid_empresaDetalleDocumento,this,this.detalledocumentoConstantesFunciones.activarid_empresaDetalleDocumento,false,"id_empresaDetalleDocumento","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDocumento,DetalleDocumentoConstantesFunciones.LABEL_IDMODULO));

		if(this.detalledocumentoConstantesFunciones.mostrarid_moduloDetalleDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleDocumentoConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.detalledocumentoConstantesFunciones.resaltarid_moduloDetalleDocumento,this,this.detalledocumentoConstantesFunciones.activarid_moduloDetalleDocumento));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.detalledocumentoConstantesFunciones.resaltarid_moduloDetalleDocumento,this,this.detalledocumentoConstantesFunciones.activarid_moduloDetalleDocumento,true,"id_moduloDetalleDocumento","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDocumento,DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO));

		if(this.detalledocumentoConstantesFunciones.mostrarid_tipo_detalle_documentoDetalleDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoDetalleDocumentoTableCell(this.tipodetalledocumentosForeignKey,this.detalledocumentoConstantesFunciones.resaltarid_tipo_detalle_documentoDetalleDocumento,this,this.detalledocumentoConstantesFunciones.activarid_tipo_detalle_documentoDetalleDocumento));
			tableColumn.setCellEditor(new TipoDetalleDocumentoTableCell(this.tipodetalledocumentosForeignKey,this.detalledocumentoConstantesFunciones.resaltarid_tipo_detalle_documentoDetalleDocumento,this,this.detalledocumentoConstantesFunciones.activarid_tipo_detalle_documentoDetalleDocumento,true,"id_tipo_detalle_documentoDetalleDocumento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDocumento,DetalleDocumentoConstantesFunciones.LABEL_NOMBRE));

		if(this.detalledocumentoConstantesFunciones.mostrarnombreDetalleDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleDocumentoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalledocumentoConstantesFunciones.resaltarnombreDetalleDocumento,this.detalledocumentoConstantesFunciones.activarnombreDetalleDocumento,this,true,"nombreDetalleDocumento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalledocumentoConstantesFunciones.resaltarnombreDetalleDocumento,this.detalledocumentoConstantesFunciones.activarnombreDetalleDocumento,this,true,"nombreDetalleDocumento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalledocumentoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalledocumentoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleDocumento.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalledocumentoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalledocumentoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleDocumento.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalledocumentoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalledocumentoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleDocumento.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleDocumento.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleDocumento.moveColumn(this.jTableDatosDetalleDocumento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleDocumento.moveColumn(this.jTableDatosDetalleDocumento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleDocumento.moveColumn(this.jTableDatosDetalleDocumento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleDocumento.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleDocumento.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleDocumento,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleDocumento.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleDocumento.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleDocumento.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleDocumento.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleDocumento.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalledocumentoLogic.getDetalleDocumentos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalledocumentos.size()-1;
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
		//this.jTableDatosDetalleDocumento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleDocumento();
			
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
				
				//this.isEsNuevoDetalleDocumento=false;
					
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			
				if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleDocumento==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleDocumento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleDocumento.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalledocumento.getsType().equals("DUPLICADO")
				   || this.detalledocumento.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleDocumento=true;
				
				} else {
					this.isEsNuevoDetalleDocumento=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
					if(this.detalledocumento.getId()>=0 && !this.detalledocumento.getIsNew()) {						
						this.isEsNuevoDetalleDocumento=false;
						
					} else {
						this.isEsNuevoDetalleDocumento=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleDocumento(esRelaciones);						
				
				this.seleccionarDetalleDocumento(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalledocumento.getId()<0) {
					this.isEsNuevoDetalleDocumento=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleDocumento(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleDocumento(evt,rowIndex);
				}	
				
				if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleDocumento: " + this.dDif); 
					}
				}								
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleDocumento(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalledocumento)) {
					if(this.detalledocumento.getId()>0) {
						this.detalledocumento.setIsDeleted(true);
						
						this.detalledocumentosEliminados.add(this.detalledocumento);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalledocumentoLogic.getDetalleDocumentos().remove(this.detalledocumento);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalledocumentos.remove(this.detalledocumento);				
					}
					
					
					((DetalleDocumentoModel) this.jTableDatosDetalleDocumento.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleDocumento(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleDocumento(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleDocumento) {
			
			if(this.jInternalFrameDetalleFormDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleDocumento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleDocumento.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleDocumento(this.detalledocumento);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detalledocumentoConstantesFunciones.cargarid_empresaDetalleDocumento || this.detalledocumentoConstantesFunciones.event_dependid_empresaDetalleDocumento) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalledocumento.getid_empresa());
									//this.inicializarActualizarBindingDetalleDocumento(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalledocumento.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalledocumento.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalledocumento.getid_empresa(),false,"Formulario");

					//Modulo
					if(!this.detalledocumentoConstantesFunciones.cargarid_moduloDetalleDocumento || this.detalledocumentoConstantesFunciones.event_dependid_moduloDetalleDocumento) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.detalledocumento.getid_modulo());
									//this.inicializarActualizarBindingDetalleDocumento(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(detalledocumento.getModulo()!=null) {
							this.modulosForeignKey.add(detalledocumento.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.detalledocumento.getid_modulo(),false,"Formulario");

					//TipoTransaccionModulo
					if(!this.detalledocumentoConstantesFunciones.cargarid_tipo_transaccion_moduloDetalleDocumento || this.detalledocumentoConstantesFunciones.event_dependid_tipo_transaccion_moduloDetalleDocumento) {
						//this.cargarCombosTipoTransaccionModulosForeignKeyLista(" where id="+this.detalledocumento.getid_tipo_transaccion_modulo());
									//this.inicializarActualizarBindingDetalleDocumento(false,false);
						this.tipotransaccionmodulosForeignKey=new ArrayList<TipoTransaccionModulo>();

						if(detalledocumento.getTipoTransaccionModulo()!=null) {
							this.tipotransaccionmodulosForeignKey.add(detalledocumento.getTipoTransaccionModulo());
						}

						this.addItemDefectoCombosForeignKeyTipoTransaccionModulo();
						this.cargarCombosFrameTipoTransaccionModulosForeignKey("Todos");
					}
					this.setActualTipoTransaccionModuloForeignKey(this.detalledocumento.getid_tipo_transaccion_modulo(),false,"Formulario");

					//TipoDetalleDocumento
					if(!this.detalledocumentoConstantesFunciones.cargarid_tipo_detalle_documentoDetalleDocumento || this.detalledocumentoConstantesFunciones.event_dependid_tipo_detalle_documentoDetalleDocumento) {
						//this.cargarCombosTipoDetalleDocumentosForeignKeyLista(" where id="+this.detalledocumento.getid_tipo_detalle_documento());
									//this.inicializarActualizarBindingDetalleDocumento(false,false);
						this.tipodetalledocumentosForeignKey=new ArrayList<TipoDetalleDocumento>();

						if(detalledocumento.getTipoDetalleDocumento()!=null) {
							this.tipodetalledocumentosForeignKey.add(detalledocumento.getTipoDetalleDocumento());
						}

						this.addItemDefectoCombosForeignKeyTipoDetalleDocumento();
						this.cargarCombosFrameTipoDetalleDocumentosForeignKey("Todos");
					}
					this.setActualTipoDetalleDocumentoForeignKey(this.detalledocumento.getid_tipo_detalle_documento(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleDocumento("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleDocumento(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleDocumento() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleDocumento(DetalleDocumento detalledocumento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleDocumento(detalledocumento,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleDocumento(DetalleDocumento detalledocumento,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleDocumento(detalledocumento);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleDocumento(detalledocumento,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleDocumento(detalledocumento);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleDocumento(DetalleDocumento detalledocumento) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleDocumento.jLabelidDetalleDocumento.setText(detalledocumento.getId().toString());
			this.jInternalFrameDetalleFormDetalleDocumento.jTextFieldnombreDetalleDocumento.setText(detalledocumento.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleDocumento detalledocumentoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalledocumentoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleDocumento detalledocumentoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalledocumentoLocal=this.detalledocumento;
			} else {
				detalledocumentoLocal=this.detalledocumentoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalledocumentoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleDocumento(detalledocumentoLocal,true);
					
					if(detalledocumentoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalledocumentoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalledocumentoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleDocumento(DetalleDocumento detalledocumento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleDocumento(detalledocumento,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(detalledocumento);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleDocumento(DetalleDocumento detalledocumento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleDocumento(detalledocumento,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleDocumento(DetalleDocumento detalledocumento,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleDocumento.jLabelidDetalleDocumento.getText()==null || this.jInternalFrameDetalleFormDetalleDocumento.jLabelidDetalleDocumento.getText()=="" || this.jInternalFrameDetalleFormDetalleDocumento.jLabelidDetalleDocumento.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleDocumento.jLabelidDetalleDocumento.setText("0");
			}

			if(conColumnasBase) {detalledocumento.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleDocumento.jLabelidDetalleDocumento.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleDocumentoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDocumento.jLabelIdDetalleDocumento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalledocumento.setnombre(this.jInternalFrameDetalleFormDetalleDocumento.jTextFieldnombreDetalleDocumento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleDocumentoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDocumento.jLabelnombreDetalleDocumento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleDocumento(DetalleDocumento detalledocumentoBean,DetalleDocumento detalledocumento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalledocumentoBean.getid_modulo()!=null && !detalledocumentoBean.getid_modulo().equals(-1L))) {detalledocumento.setid_modulo(detalledocumentoBean.getid_modulo());}
			if(conDefault || (!conDefault && detalledocumentoBean.getid_tipo_detalle_documento()!=null && !detalledocumentoBean.getid_tipo_detalle_documento().equals(-1L))) {detalledocumento.setid_tipo_detalle_documento(detalledocumentoBean.getid_tipo_detalle_documento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleDocumento(DetalleDocumento detalledocumentoOrigen,DetalleDocumento detalledocumento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalledocumentoOrigen.getId()!=null && !detalledocumentoOrigen.getId().equals(0L))) {detalledocumento.setId(detalledocumentoOrigen.getId());}}
			if(conDefault || (!conDefault && detalledocumentoOrigen.getid_modulo()!=null && !detalledocumentoOrigen.getid_modulo().equals(-1L))) {detalledocumento.setid_modulo(detalledocumentoOrigen.getid_modulo());}
			if(conDefault || (!conDefault && detalledocumentoOrigen.getid_tipo_transaccion_modulo()!=null && !detalledocumentoOrigen.getid_tipo_transaccion_modulo().equals(null))) {detalledocumento.setid_tipo_transaccion_modulo(detalledocumentoOrigen.getid_tipo_transaccion_modulo());}
			if(conDefault || (!conDefault && detalledocumentoOrigen.getid_tipo_detalle_documento()!=null && !detalledocumentoOrigen.getid_tipo_detalle_documento().equals(-1L))) {detalledocumento.setid_tipo_detalle_documento(detalledocumentoOrigen.getid_tipo_detalle_documento());}
			if(conDefault || (!conDefault && detalledocumentoOrigen.getnombre()!=null && !detalledocumentoOrigen.getnombre().equals(""))) {detalledocumento.setnombre(detalledocumentoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleDocumento(DetalleDocumento detalledocumento) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleDocumento.jLabelidDetalleDocumento.setText(detalledocumento.getId().toString());
			this.jInternalFrameDetalleFormDetalleDocumento.jTextFieldnombreDetalleDocumento.setText(detalledocumento.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleDocumento(DetalleDocumentoBean detalledocumentoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleDocumento.jLabelidDetalleDocumento.setText(detalledocumentoBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleDocumento.jTextFieldnombreDetalleDocumento.setText(detalledocumentoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleDocumento(DetalleDocumentoParameterReturnGeneral detalledocumentoReturnGeneral,DetalleDocumentoBean detalledocumentoBean,Boolean conDefault) throws Exception { 
		try {
			DetalleDocumento detalledocumentoLocal=new DetalleDocumento();
			
			detalledocumentoLocal=detalledocumentoReturnGeneral.getDetalleDocumento();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalledocumentoLocal.getId()!=null && !detalledocumentoLocal.getId().equals(0L))) {detalledocumentoBean.setId(detalledocumentoLocal.getId());}}
			if(conDefault || (!conDefault && detalledocumentoLocal.getid_modulo()!=null && !detalledocumentoLocal.getid_modulo().equals(-1L))) {detalledocumentoBean.setid_modulo(detalledocumentoLocal.getid_modulo());}
			if(conDefault || (!conDefault && detalledocumentoLocal.getid_tipo_detalle_documento()!=null && !detalledocumentoLocal.getid_tipo_detalle_documento().equals(-1L))) {detalledocumentoBean.setid_tipo_detalle_documento(detalledocumentoLocal.getid_tipo_detalle_documento());}
			if(conDefault || (!conDefault && detalledocumentoLocal.getnombre()!=null && !detalledocumentoLocal.getnombre().equals(""))) {detalledocumentoBean.setnombre(detalledocumentoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleDocumentoGenerico(Long idDetalleDocumentoSeleccionado,JComboBox jComboBoxDetalleDocumento,List<DetalleDocumento> detalledocumentosLocal)throws Exception {
		try {
			DetalleDocumento  detalledocumentoTemp=null;

			for(DetalleDocumento detalledocumentoAux:detalledocumentosLocal) {
				if(detalledocumentoAux.getId()!=null && detalledocumentoAux.getId().equals(idDetalleDocumentoSeleccionado)) {
					detalledocumentoTemp=detalledocumentoAux;
					break;
				}
			}

			jComboBoxDetalleDocumento.setSelectedItem(detalledocumentoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleDocumentoGenerico(JComboBox jComboBoxDetalleDocumento,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleDocumento.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleDocumento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleDocumento.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleDocumento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalledocumento=(DetalleDocumento) detalledocumentoLogic.getDetalleDocumentos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalledocumento =(DetalleDocumento) detalledocumentos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalledocumento.getIsNew() && !detalledocumento.getIsChanged() && !detalledocumento.getIsDeleted()) {
				sDescripcion=detalledocumento.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalledocumento.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!detalledocumento.getIsNew() && !detalledocumento.getIsChanged() && !detalledocumento.getIsDeleted()) {
				sDescripcion=detalledocumento.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=detalledocumento.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoTransaccionModulo")) {
			//sDescripcion=this.getActualTipoTransaccionModuloForeignKeyDescripcion((Long)value);
			if(!detalledocumento.getIsNew() && !detalledocumento.getIsChanged() && !detalledocumento.getIsDeleted()) {
				sDescripcion=detalledocumento.gettipotransaccionmodulo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=detalledocumento.gettipotransaccionmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoDetalleDocumento")) {
			//sDescripcion=this.getActualTipoDetalleDocumentoForeignKeyDescripcion((Long)value);
			if(!detalledocumento.getIsNew() && !detalledocumento.getIsChanged() && !detalledocumento.getIsDeleted()) {
				sDescripcion=detalledocumento.gettipodetalledocumento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDetalleDocumentoForeignKeyDescripcion((Long)value);
				sDescripcion=detalledocumento.gettipodetalledocumento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleDocumento detalledocumentoRow=new DetalleDocumento();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalledocumentoRow=(DetalleDocumento) detalledocumentoLogic.getDetalleDocumentos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalledocumentoRow=(DetalleDocumento) detalledocumentos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleDocumento(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoDetalleDocumento && this.isPermisoNuevoDetalleDocumento));			
			this.jButtonDuplicarDetalleDocumento.setVisible((this.isVisibilidadCeldaDuplicarDetalleDocumento && this.isPermisoDuplicarDetalleDocumento));			
			this.jButtonCopiarDetalleDocumento.setVisible((this.isVisibilidadCeldaCopiarDetalleDocumento && this.isPermisoCopiarDetalleDocumento));
			this.jButtonVerFormDetalleDocumento.setVisible((this.isVisibilidadCeldaVerFormDetalleDocumento && this.isPermisoVerFormDetalleDocumento));
			
			this.jButtonAbrirOrderByDetalleDocumento.setVisible((this.isVisibilidadCeldaOrdenDetalleDocumento && this.isPermisoOrdenDetalleDocumento));			
			
			this.jButtonNuevoRelacionesDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento && this.isPermisoNuevoDetalleDocumento));			
			this.jButtonNuevoGuardarCambiosDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoDetalleDocumento && this.isPermisoNuevoDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento));
			
			if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonModificarDetalleDocumento.setVisible((this.isVisibilidadCeldaModificarDetalleDocumento && this.isPermisoActualizarDetalleDocumento));	
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonActualizarDetalleDocumento.setVisible((this.isVisibilidadCeldaActualizarDetalleDocumento && this.isPermisoActualizarDetalleDocumento));	
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonEliminarDetalleDocumento.setVisible((this.isVisibilidadCeldaEliminarDetalleDocumento && this.isPermisoEliminarDetalleDocumento));
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonCancelarDetalleDocumento.setVisible(this.isVisibilidadCeldaCancelarDetalleDocumento);							
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonGuardarCambiosDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoDetalleDocumento && this.isPermisoNuevoDetalleDocumento));						
			this.jButtonDuplicarToolBarDetalleDocumento.setVisible((this.isVisibilidadCeldaDuplicarDetalleDocumento && this.isPermisoDuplicarDetalleDocumento));						
			this.jButtonCopiarToolBarDetalleDocumento.setVisible((this.isVisibilidadCeldaCopiarDetalleDocumento && this.isPermisoCopiarDetalleDocumento));			
			this.jButtonVerFormToolBarDetalleDocumento.setVisible((this.isVisibilidadCeldaVerFormDetalleDocumento && this.isPermisoVerFormDetalleDocumento));			
			this.jButtonAbrirOrderByToolBarDetalleDocumento.setVisible((this.isVisibilidadCeldaOrdenDetalleDocumento && this.isPermisoOrdenDetalleDocumento));
			this.jButtonNuevoRelacionesToolBarDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento && this.isPermisoNuevoDetalleDocumento));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoDetalleDocumento && this.isPermisoNuevoDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento));			
			
			if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonModificarToolBarDetalleDocumento.setVisible((this.isVisibilidadCeldaModificarDetalleDocumento && this.isPermisoActualizarDetalleDocumento));	
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonActualizarToolBarDetalleDocumento.setVisible((this.isVisibilidadCeldaActualizarDetalleDocumento  && this.isPermisoActualizarDetalleDocumento));	
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonEliminarToolBarDetalleDocumento.setVisible((this.isVisibilidadCeldaEliminarDetalleDocumento && this.isPermisoEliminarDetalleDocumento));
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonCancelarToolBarDetalleDocumento.setVisible(this.isVisibilidadCeldaCancelarDetalleDocumento);				
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonGuardarCambiosToolBarDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoDetalleDocumento && this.isPermisoNuevoDetalleDocumento));			
			this.jMenuItemDuplicarDetalleDocumento.setVisible((this.isVisibilidadCeldaDuplicarDetalleDocumento && this.isPermisoDuplicarDetalleDocumento));			
			this.jMenuItemCopiarDetalleDocumento.setVisible((this.isVisibilidadCeldaCopiarDetalleDocumento && this.isPermisoCopiarDetalleDocumento));			
			this.jMenuItemVerFormDetalleDocumento.setVisible((this.isVisibilidadCeldaVerFormDetalleDocumento && this.isPermisoVerFormDetalleDocumento));			
			this.jMenuItemAbrirOrderByDetalleDocumento.setVisible((this.isVisibilidadCeldaOrdenDetalleDocumento && this.isPermisoOrdenDetalleDocumento));			
			//this.jMenuItemMostrarOcultarDetalleDocumento.setVisible((this.isVisibilidadCeldaOrdenDetalleDocumento && this.isPermisoOrdenDetalleDocumento));
			this.jMenuItemDetalleAbrirOrderByDetalleDocumento.setVisible((this.isVisibilidadCeldaOrdenDetalleDocumento && this.isPermisoOrdenDetalleDocumento));			
			//this.jMenuItemDetalleMostrarOcultarDetalleDocumento.setVisible((this.isVisibilidadCeldaOrdenDetalleDocumento && this.isPermisoOrdenDetalleDocumento));			
			this.jMenuItemNuevoRelacionesDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento && this.isPermisoNuevoDetalleDocumento));			
			this.jMenuItemNuevoGuardarCambiosDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoDetalleDocumento && this.isPermisoNuevoDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento));									
			
			if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemModificarDetalleDocumento.setVisible((this.isVisibilidadCeldaModificarDetalleDocumento && this.isPermisoActualizarDetalleDocumento));	
			this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemActualizarDetalleDocumento.setVisible((this.isVisibilidadCeldaActualizarDetalleDocumento && this.isPermisoActualizarDetalleDocumento));	
			this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemEliminarDetalleDocumento.setVisible((this.isVisibilidadCeldaEliminarDetalleDocumento && this.isPermisoEliminarDetalleDocumento));
			this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemCancelarDetalleDocumento.setVisible(this.isVisibilidadCeldaCancelarDetalleDocumento);				
			}
			
			this.jMenuItemGuardarCambiosDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento));						
			this.jMenuItemGuardarCambiosTablaDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleDocumento=this.jButtonNuevoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleDocumento=this.jButtonDuplicarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaCopiarDetalleDocumento=this.jButtonCopiarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaVerFormDetalleDocumento=this.jButtonVerFormDetalleDocumento.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleDocumento=this.jButtonAbrirOrderByDetalleDocumento.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=this.jButtonNuevoRelacionesDetalleDocumento.isVisible();
			this.isVisibilidadCeldaModificarDetalleDocumento=this.jButtonModificarDetalleDocumento.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			this.isVisibilidadCeldaActualizarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jButtonActualizarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaEliminarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jButtonEliminarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaCancelarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jButtonCancelarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaGuardarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jButtonGuardarCambiosDetalleDocumento.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=this.jButtonGuardarCambiosTablaDetalleDocumento.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleDocumento=this.jButtonNuevoToolBarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=this.jButtonNuevoRelacionesToolBarDetalleDocumento.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			this.isVisibilidadCeldaModificarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jButtonModificarToolBarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaActualizarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jButtonActualizarToolBarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaEliminarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jButtonEliminarToolBarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaCancelarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jButtonCancelarToolBarDetalleDocumento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleDocumento=this.jButtonGuardarCambiosToolBarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=this.jButtonGuardarCambiosTablaToolBarDetalleDocumento.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleDocumento=this.jMenuItemNuevoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=this.jMenuItemNuevoRelacionesDetalleDocumento.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			this.isVisibilidadCeldaModificarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemModificarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaActualizarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemActualizarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaEliminarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemEliminarDetalleDocumento.isVisible();
			this.isVisibilidadCeldaCancelarDetalleDocumento=this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemCancelarDetalleDocumento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleDocumento=this.jMenuItemGuardarCambiosDetalleDocumento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=this.jMenuItemGuardarCambiosTablaDetalleDocumento.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleDocumento(Boolean esInicializar) {
		if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {
				//if(this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleDocumento();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleDocumento(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleDocumento() {
		this.jButtonNuevoDetalleDocumento.setVisible(this.isPermisoNuevoDetalleDocumento);			
		this.jButtonDuplicarDetalleDocumento.setVisible(this.isPermisoDuplicarDetalleDocumento);			
		this.jButtonCopiarDetalleDocumento.setVisible(this.isPermisoCopiarDetalleDocumento);			
		this.jButtonVerFormDetalleDocumento.setVisible(this.isPermisoVerFormDetalleDocumento);			
		
		this.jButtonAbrirOrderByDetalleDocumento.setVisible(this.isPermisoOrdenDetalleDocumento);					
		
		this.jButtonNuevoRelacionesDetalleDocumento.setVisible(this.isPermisoNuevoDetalleDocumento);			
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonModificarDetalleDocumento.setVisible(this.isPermisoActualizarDetalleDocumento);	
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonActualizarDetalleDocumento.setVisible(this.isPermisoActualizarDetalleDocumento);	
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonEliminarDetalleDocumento.setVisible(this.isPermisoEliminarDetalleDocumento);
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonCancelarDetalleDocumento.setVisible(this.isVisibilidadCeldaCancelarDetalleDocumento);						
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonGuardarCambiosDetalleDocumento.setVisible(this.isPermisoGuardarCambiosDetalleDocumento);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleDocumento.setVisible(this.isPermisoActualizarDetalleDocumento);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleDocumento() {
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonModificarDetalleDocumento.setVisible(this.isPermisoActualizarDetalleDocumento);	
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonActualizarDetalleDocumento.setVisible(this.isPermisoActualizarDetalleDocumento);	
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonEliminarDetalleDocumento.setVisible(this.isPermisoEliminarDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonCancelarDetalleDocumento.setVisible(this.isVisibilidadCeldaCancelarDetalleDocumento);							
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonGuardarCambiosDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarDetalleDocumento && this.isPermisoGuardarCambiosDetalleDocumento));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleDocumento() {
		if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleDocumento();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleDocumento() {
	}
	
	public void jTableDatosDetalleDocumentoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleDocumento(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.getdetalledocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalledocumento==null) {
						this.detalledocumento = new DetalleDocumento();
					}

					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.detalledocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
				}

				if(this.detalledocumento.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalledocumento.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleDocumentoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleDocumento(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleDocumento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleDocumento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleDocumento(this.getdetalledocumento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalledocumentoLogic.getConnexion());

				if(this.detalledocumento.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalledocumento.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleDocumento=(TitledBorder)this.jScrollPanelDatosDetalleDocumento.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleDocumento.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.getdetalledocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalledocumento==null) {
						this.detalledocumento = new DetalleDocumento();
					}

					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.detalledocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
				}

				if(this.detalledocumento.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalledocumento.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloDetalleDocumentoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebDetalleDocumento(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleDocumento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleDocumento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleDocumento(this.getdetalledocumento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.detalledocumentoLogic.getConnexion());

				if(this.detalledocumento.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.detalledocumento.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleDocumento=(TitledBorder)this.jScrollPanelDatosDetalleDocumento.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderDetalleDocumento.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloDetalleDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.getdetalledocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalledocumento==null) {
						this.detalledocumento = new DetalleDocumento();
					}

					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.detalledocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
				}

				if(this.detalledocumento.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.detalledocumento.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipotransaccionmodulo=true;

			idTienePermisotipotransaccionmodulo=this.tienePermisosUsuarioEnPaginaWebDetalleDocumento(TipoTransaccionModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisotipotransaccionmodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleDocumento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleDocumento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleDocumento(this.getdetalledocumento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);

				this.tipotransaccionmoduloBeanSwingJInternalFrame=new TipoTransaccionModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipotransaccionmoduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipotransaccionmoduloBeanSwingJInternalFrame.getTipoTransaccionModuloLogic().setConnexion(this.detalledocumentoLogic.getConnexion());

				if(this.detalledocumento.getid_tipo_transaccion_modulo()!=null) {
					this.tipotransaccionmoduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipotransaccionmoduloBeanSwingJInternalFrame.setIdActual(this.detalledocumento.getid_tipo_transaccion_modulo());
					this.tipotransaccionmoduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipotransaccionmoduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipotransaccionmoduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoTransaccionModulo();
				}

				JInternalFrameBase jinternalFrame =this.tipotransaccionmoduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleDocumento=(TitledBorder)this.jScrollPanelDatosDetalleDocumento.getBorder();
				TitledBorder titledBordertipotransaccionmodulo=(TitledBorder)this.tipotransaccionmoduloBeanSwingJInternalFrame.jScrollPanelDatosTipoTransaccionModulo.getBorder();

				titledBordertipotransaccionmodulo.setTitle(titledBorderDetalleDocumento.getTitle() + " -> Tipo Transaccion Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_transaccion_moduloDetalleDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.getdetalledocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalledocumento==null) {
						this.detalledocumento = new DetalleDocumento();
					}

					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.detalledocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
				}

				if(this.detalledocumento.getid_tipo_transaccion_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_transaccion_modulo = "+this.detalledocumento.getid_tipo_transaccion_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_detalle_documentoDetalleDocumentoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodetalledocumento=true;

			idTienePermisotipodetalledocumento=this.tienePermisosUsuarioEnPaginaWebDetalleDocumento(TipoDetalleDocumentoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodetalledocumento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleDocumento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleDocumento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleDocumento(this.getdetalledocumento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);

				this.tipodetalledocumentoBeanSwingJInternalFrame=new TipoDetalleDocumentoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodetalledocumentoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodetalledocumentoBeanSwingJInternalFrame.getTipoDetalleDocumentoLogic().setConnexion(this.detalledocumentoLogic.getConnexion());

				if(this.detalledocumento.getid_tipo_detalle_documento()!=null) {
					this.tipodetalledocumentoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodetalledocumentoBeanSwingJInternalFrame.setIdActual(this.detalledocumento.getid_tipo_detalle_documento());
					this.tipodetalledocumentoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodetalledocumentoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodetalledocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDetalleDocumento();
				}

				JInternalFrameBase jinternalFrame =this.tipodetalledocumentoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleDocumento=(TitledBorder)this.jScrollPanelDatosDetalleDocumento.getBorder();
				TitledBorder titledBordertipodetalledocumento=(TitledBorder)this.tipodetalledocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDetalleDocumento.getBorder();

				titledBordertipodetalledocumento.setTitle(titledBorderDetalleDocumento.getTitle() + " -> Tipo Detalle Documento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_detalle_documentoDetalleDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.getdetalledocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalledocumento==null) {
						this.detalledocumento = new DetalleDocumento();
					}

					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.detalledocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
				}

				if(this.detalledocumento.getid_tipo_detalle_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_detalle_documento = "+this.detalledocumento.getid_tipo_detalle_documento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDetalleDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.getdetalledocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalledocumento==null) {
						this.detalledocumento = new DetalleDocumento();
					}

					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.detalledocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);
				}

				if(this.detalledocumento.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.detalledocumento.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleDocumento(false,false);

			this.getDetalleDocumentosBusquedaPorIdModuloPorIdTipoTransaccion();

			this.inicializarActualizarBindingDetalleDocumento(false);

			//if(DetalleDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDetalleDocumentoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleDocumento(false,false);

			this.getDetalleDocumentosFK_IdDetalleDocumento();

			this.inicializarActualizarBindingDetalleDocumento(false);

			//if(DetalleDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleDocumento(false,false);

			this.getDetalleDocumentosFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleDocumento(false);

			//if(DetalleDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleDocumento(false,false);

			this.getDetalleDocumentosFK_IdModulo();

			this.inicializarActualizarBindingDetalleDocumento(false);

			//if(DetalleDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoTransaccionModuloDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleDocumento(false,false);

			this.getDetalleDocumentosFK_IdTipoTransaccionModulo();

			this.inicializarActualizarBindingDetalleDocumento(false);

			//if(DetalleDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleDocumento() {
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
			this.jInternalFrameDetalleFormDetalleDocumento.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleDocumento.dispose();
			this.jInternalFrameDetalleFormDetalleDocumento=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleDocumento!=null) {
			this.jInternalFrameReporteDinamicoDetalleDocumento.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleDocumento.dispose();
			this.jInternalFrameReporteDinamicoDetalleDocumento=null;
		}
		
		if(this.jInternalFrameImportacionDetalleDocumento!=null) {
			this.jInternalFrameImportacionDetalleDocumento.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleDocumento.dispose();
			this.jInternalFrameImportacionDetalleDocumento=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleDocumento();
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleDocumento")) {
				jButtonNuevoDetalleDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleDocumento")) {
				jButtonDuplicarDetalleDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleDocumento")) {
				jButtonCopiarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleDocumento")) {
				jButtonVerFormDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleDocumento")) {
				jButtonNuevoDetalleDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleDocumento")) {
				jButtonDuplicarDetalleDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleDocumento")) {
				jButtonNuevoDetalleDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleDocumento")) {
				jButtonDuplicarDetalleDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleDocumento")) {
				jButtonNuevoDetalleDocumentoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleDocumento")) {
				jButtonNuevoDetalleDocumentoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleDocumento")) {
				jButtonNuevoDetalleDocumentoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleDocumento")) {
				jButtonModificarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleDocumento")) {
				jButtonModificarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleDocumento")) {
				jButtonModificarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleDocumento")) {
				jButtonActualizarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleDocumento")) {
				jButtonActualizarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleDocumento")) {
				jButtonActualizarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleDocumento")) {
				jButtonEliminarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleDocumento")) {
				jButtonEliminarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleDocumento")) {
				jButtonEliminarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleDocumento")) {
				jButtonCancelarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleDocumento")) {
				jButtonCancelarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleDocumento")) {
				jButtonCancelarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleDocumento")) {
				jButtonCerrarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleDocumento")) {
				jButtonCerrarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleDocumento")) {
				jButtonCerrarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleDocumento")) {
				jButtonMostrarOcultarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleDocumento")) {
				jButtonCancelarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleDocumento")) {
				jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleDocumento")) {
				jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleDocumento")) {
				jButtonCopiarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleDocumento")) {
				jButtonVerFormDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleDocumento")) {
				jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleDocumento")) {
				jButtonCopiarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleDocumento")) {
				jButtonVerFormDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleDocumento")) {
				jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleDocumento")) {
				jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleDocumento")) {
				jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleDocumento")) {
				jButtonRecargarInformacionDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleDocumento")) {
				jButtonRecargarInformacionDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleDocumento")) {
				jButtonRecargarInformacionDetalleDocumentoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleDocumento")) {
				jButtonAnterioresDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleDocumento")) {
				jButtonAnterioresDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleDocumento")) {
				jButtonAnterioresDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleDocumento")) {
				jButtonSiguientesDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleDocumento")) {
				jButtonSiguientesDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleDocumento")) {
				jButtonSiguientesDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleDocumento") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleDocumento")) {
				jButtonAbrirOrderByDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleDocumento") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleDocumento")) {
				jButtonMostrarOcultarDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleDocumento")) {
				jButtonNuevoGuardarCambiosDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleDocumento")) {
				jButtonNuevoGuardarCambiosDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleDocumento")) {
				jButtonNuevoGuardarCambiosDetalleDocumentoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleDocumento")) {
				jButtonCerrarReporteDinamicoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleDocumento")) {
				jButtonGenerarReporteDinamicoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleDocumento")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleDocumento")) {
				jButtonCerrarImportacionDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleDocumento")) {
				
				jButtonGenerarImportacionDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleDocumento")) {
				
				jButtonAbrirImportacionDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleDocumento")) {
				jComboBoxTiposAccionesDetalleDocumentoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleDocumento")) {
				jComboBoxTiposRelacionesDetalleDocumentoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleDocumento")) {
				jComboBoxTiposAccionesDetalleDocumentoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleDocumento")) {
				
				jComboBoxTiposSeleccionarDetalleDocumentoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleDocumento")) {
				jTextFieldValorCampoGeneralDetalleDocumentoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleDocumento")) {
				jButtonAbrirOrderByDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleDocumento")) {
				jButtonAbrirOrderByDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleDocumento")) {
				jButtonCerrarOrderByDetalleDocumentoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleDocumentoBusqueda")) {
				this.jButtonidDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleDocumentoUpdate")) {
				this.jButtonid_empresaDetalleDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleDocumentoBusqueda")) {
				this.jButtonid_empresaDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloDetalleDocumentoUpdate")) {
				this.jButtonid_moduloDetalleDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloDetalleDocumentoBusqueda")) {
				this.jButtonid_moduloDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloDetalleDocumentoUpdate")) {
				this.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloDetalleDocumentoBusqueda")) {
				this.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_detalle_documentoDetalleDocumentoUpdate")) {
				this.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_detalle_documentoDetalleDocumentoBusqueda")) {
				this.jButtonid_tipo_detalle_documentoDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDetalleDocumentoBusqueda")) {
				this.jButtonnombreDetalleDocumentoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento")) {
				this.jButtonBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumentoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDetalleDocumentoDetalleDocumento")) {
				this.jButtonFK_IdDetalleDocumentoDetalleDocumentoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdModuloDetalleDocumento")) {
				this.jButtonFK_IdModuloDetalleDocumentoActionPerformed(evt);
			}
			
			;
			
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleDocumento();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDocumentoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				


				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleDocumento detalledocumentoLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalledocumentoLocal=this.detalledocumento;
			} else {
				detalledocumentoLocal=this.detalledocumentoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
							
				
				


				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
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
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			
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
			
			


			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDocumentoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
								
						
				


				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDocumento.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
								
				
				


				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDocumentoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
							
				
				


				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDocumento.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDocumentoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
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
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			
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
			
			


			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDocumentoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
								
				
				


				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDocumentoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDocumentoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleDocumento")) {
					jCheckBoxSeleccionarTodosDetalleDocumentoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleDocumento")) {
					jCheckBoxSeleccionadosDetalleDocumentoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleDocumento")) {
					
				}
				
				


				
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
												
				
				


				
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDocumentoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDocumentoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
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
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
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
			
			


			if(sTipo.equals("id_moduloDetalleDocumento")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento;
				}

				if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleDocumentoConstantesFunciones.getClassesRelationshipsOfDetalleDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleDocumento(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento,"BusquedaPorIdModuloPorIdTipoTransaccion");
				//recargarFormDetalleDocumentoModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento,"BusquedaPorIdModuloPorIdTipoTransaccion");
			}
			 else if(sTipo.equals("jComboBoxid_moduloFK_IdModuloDetalleDocumento")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloFK_IdModuloDetalleDocumento,"FK_IdModulo");
				//recargarFormDetalleDocumentoModulo(jComboBoxid_moduloFK_IdModuloDetalleDocumento,"FK_IdModulo");
			}
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDocumentoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_moduloDetalleDocumento")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento;
				}

				if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleDocumentoConstantesFunciones.getClassesRelationshipsOfDetalleDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleDocumento(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento,"BusquedaPorIdModuloPorIdTipoTransaccion");
				//recargarFormDetalleDocumentoModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento,"BusquedaPorIdModuloPorIdTipoTransaccion");
			}
			 else if(sTipo.equals("jComboBoxid_moduloFK_IdModuloDetalleDocumento")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloFK_IdModuloDetalleDocumento,"FK_IdModulo");
				//recargarFormDetalleDocumentoModulo(jComboBoxid_moduloFK_IdModuloDetalleDocumento,"FK_IdModulo");
			}
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDocumento.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDocumento.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledocumento);
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
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
				
				


			if(sTipo.equals("id_moduloDetalleDocumento")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento;
				}

				if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {
					//classes=DetalleDocumentoConstantesFunciones.getClassesRelationshipsOfDetalleDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormDetalleDocumento(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento,"BusquedaPorIdModuloPorIdTipoTransaccion");
				//recargarFormDetalleDocumentoModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento,"BusquedaPorIdModuloPorIdTipoTransaccion");
			}
			 else if(sTipo.equals("jComboBoxid_moduloFK_IdModuloDetalleDocumento")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloFK_IdModuloDetalleDocumento,"FK_IdModulo");
				//recargarFormDetalleDocumentoModulo(jComboBoxid_moduloFK_IdModuloDetalleDocumento,"FK_IdModulo");
			}
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDocumento.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledocumentoAnterior =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleDocumento")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleDocumentoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleDocumento.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalledocumento =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalledocumento =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalledocumento);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleDocumento")) {
				
				}
				
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleDocumento")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleDocumento.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleDocumento")) {
			
			}
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleDocumento();
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleDocumento")) {
				jButtonNuevoDetalleDocumentoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleDocumento")) {
				jButtonDuplicarDetalleDocumentoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleDocumento")) {
				jButtonCopiarDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleDocumento")) {
				jButtonVerFormDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleDocumento")) {
				jButtonNuevoDetalleDocumentoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleDocumento")) {
				jButtonModificarDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleDocumento")) {
				jButtonActualizarDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleDocumento")) {
				jButtonEliminarDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleDocumento")) {
				jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleDocumento")) {
				jButtonCancelarDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleDocumento")) {
				jButtonCerrarDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleDocumento")) {
				jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleDocumento")) {
				jButtonNuevoGuardarCambiosDetalleDocumentoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleDocumento")) {
				jButtonAbrirOrderByDetalleDocumentoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleDocumento")) {
				jButtonRecargarInformacionDetalleDocumentoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleDocumento")) {
				jButtonAnterioresDetalleDocumentoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleDocumento")) {
				jButtonSiguientesDetalleDocumentoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleDocumentoBusqueda")) {
				this.jButtonidDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleDocumentoUpdate")) {
				this.jButtonid_empresaDetalleDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleDocumentoBusqueda")) {
				this.jButtonid_empresaDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloDetalleDocumentoUpdate")) {
				this.jButtonid_moduloDetalleDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloDetalleDocumentoBusqueda")) {
				this.jButtonid_moduloDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloDetalleDocumentoUpdate")) {
				this.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_transaccion_moduloDetalleDocumentoBusqueda")) {
				this.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_detalle_documentoDetalleDocumentoUpdate")) {
				this.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_detalle_documentoDetalleDocumentoBusqueda")) {
				this.jButtonid_tipo_detalle_documentoDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDetalleDocumentoBusqueda")) {
				this.jButtonnombreDetalleDocumentoBusquedaActionPerformed(evt);
			}
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleDocumento();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleDocumento")) {
				closingInternalFrameDetalleDocumento();
				
			} else if(sTipo.equals("jButtonCancelarDetalleDocumento")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleDocumento = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleDocumentoBeanSwingJInternalFrame jInternalFrameParent=(DetalleDocumentoBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleDocumento.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleDocumentoActionPerformed(null);
			}
			
			DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalledocumento,new Object(),this.detalledocumentoParameterGeneral,this.detalledocumentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleDocumento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleDocumento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleDocumento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalledocumento)) {
			if(!esControlTabla) {
				if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.detalledocumento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);			
				}
				
				if(this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleDocumento(this.detalledocumento,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalledocumentoReturnGeneral=detalledocumentoLogic.procesarEventosDetalleDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalledocumentoLogic.getDetalleDocumentos(),this.detalledocumento,this.detalledocumentoParameterGeneral,this.isEsNuevoDetalleDocumento,classes);//this.detalledocumentoLogic.getDetalleDocumento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleDocumento(this.detalledocumentoReturnGeneral,this.detalledocumentoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleDocumento(classes,this.detalledocumentoReturnGeneral,this.detalledocumentoBean,false);
					}
						
					if(this.detalledocumentoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleDocumento(this.detalledocumentoReturnGeneral.getDetalleDocumento());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleDocumento(this.detalledocumentoReturnGeneral.getDetalleDocumento());	
					}
						
					if(this.detalledocumentoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleDocumento(this.detalledocumentoReturnGeneral.getDetalleDocumento(),classes);//this.detalledocumentoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleDocumento(this.detalledocumento,classes);//this.detalledocumentoBean);									
				}
			
				if(DetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleDocumento(this.detalledocumento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDocumento(this.detalledocumento);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalledocumentoAnterior!=null) {
						this.detalledocumento=this.detalledocumentoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalledocumentoReturnGeneral=detalledocumentoLogic.procesarEventosDetalleDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalledocumentoLogic.getDetalleDocumentos(),this.detalledocumento,this.detalledocumentoParameterGeneral,this.isEsNuevoDetalleDocumento,classes);//this.detalledocumentoLogic.getDetalleDocumento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalledocumentoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalledocumentoReturnGeneral.getDetalleDocumento(),detalledocumentoLogic.getDetalleDocumentos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalledocumentoReturnGeneral.getDetalleDocumento(),this.detalledocumentos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleDocumento.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleDocumento.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleDocumento();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleDocumento() throws Exception {
		
		DetalleDocumentoModel detalledocumentoModel=(DetalleDocumentoModel)this.jTableDatosDetalleDocumento.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalledocumentoModel.detalledocumentos=this.detalledocumentoLogic.getDetalleDocumentos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalledocumentoModel.detalledocumentos=this.detalledocumentos;
		}
		
		
		((DetalleDocumentoModel) this.jTableDatosDetalleDocumento.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleDocumento() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalledocumentoAnterior(),this.detalledocumentoLogic.getDetalleDocumentos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalledocumentoAnterior(),this.detalledocumentos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleDocumento();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleDocumento(DetalleDocumento detalledocumento,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
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
										
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalledocumento,new Object(),generalEntityParameterGeneral,this.detalledocumentoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleDocumentoConstantesFunciones.getClassesRelationshipsOfDetalleDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleDocumentoConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleDocumento(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleDocumento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalledocumento,new Object(),generalEntityParameterGeneral,this.detalledocumentoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleDocumento(DetalleDocumentoBean detalledocumentoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleDocumento(ArrayList<Classe> classes,DetalleDocumentoReturnGeneral detalledocumentoReturnGeneral,DetalleDocumentoBean detalledocumentoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleDocumento(DetalleDocumento detalledocumento,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalledocumento)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleDocumento = new DetalleDocumentoDetalleFormJInternalFrame(jDesktopPane,this.detalledocumentoSessionBean.getConGuardarRelaciones(),this.detalledocumentoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.setVisible(false);
		this.jInternalFrameDetalleFormDetalleDocumento.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleDocumento.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleDocumento.detalledocumentoLogic=this.detalledocumentoLogic;
		
		this.cargarCombosFrameForeignKeyDetalleDocumento("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleDocumento();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleDocumento();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleDocumento("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleDocumento();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleDocumento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleDocumento"));
		
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonModificarDetalleDocumento.addActionListener(new ButtonActionListener(this,"ModificarDetalleDocumento"));

		
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonModificarToolBarDetalleDocumento.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleDocumento"));
					
		this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemModificarDetalleDocumento.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleDocumento"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonActualizarDetalleDocumento.addActionListener (new ButtonActionListener(this,"ActualizarDetalleDocumento"));
		
		
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonActualizarToolBarDetalleDocumento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleDocumento"));
						
		this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemActualizarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleDocumento"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonEliminarDetalleDocumento.addActionListener (new ButtonActionListener(this,"EliminarDetalleDocumento"));
		
		
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonEliminarToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleDocumento"));
								
		this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemEliminarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleDocumento"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonCancelarDetalleDocumento.addActionListener (new ButtonActionListener(this,"CancelarDetalleDocumento"));
		
		
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonCancelarToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleDocumento"));
					
		this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemCancelarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleDocumento"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemDetalleCerrarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleDocumento"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonGuardarCambiosToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleDocumento"));
		
		
		
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonGuardarCambiosToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleDocumento"));
		
		
		
		this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleDocumento"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonidDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_empresaDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_empresaDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_moduloDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_moduloDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_detalle_documentoDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_detalle_documentoDetalleDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonnombreDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleDocumentoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleDocumento.jTabbedPaneRelacionesDetalleDocumento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleDocumento"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleDocumento"));
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleDocumento"));
		}
		
		this.jTableDatosDetalleDocumento.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleDocumento"));
		
		this.jTableDatosDetalleDocumento.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleDocumento"));
		
		this.jButtonNuevoDetalleDocumento.addActionListener(new ButtonActionListener(this,"NuevoDetalleDocumento"));
		
		this.jButtonDuplicarDetalleDocumento.addActionListener(new ButtonActionListener(this,"DuplicarDetalleDocumento"));
		
		this.jButtonCopiarDetalleDocumento.addActionListener(new ButtonActionListener(this,"CopiarDetalleDocumento"));
		
		this.jButtonVerFormDetalleDocumento.addActionListener(new ButtonActionListener(this,"VerFormDetalleDocumento"));
		
		
		this.jButtonNuevoToolBarDetalleDocumento.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleDocumento"));
			
		this.jButtonDuplicarToolBarDetalleDocumento.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleDocumento"));
			
		this.jMenuItemNuevoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleDocumento"));
			
		this.jMenuItemDuplicarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleDocumento"));		
		
		
		this.jButtonNuevoRelacionesDetalleDocumento.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleDocumento"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleDocumento.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleDocumento"));
			
		this.jMenuItemNuevoRelacionesDetalleDocumento.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleDocumento"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonModificarDetalleDocumento.addActionListener(new ButtonActionListener(this,"ModificarDetalleDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonModificarToolBarDetalleDocumento.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleDocumento"));
			
			this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemModificarDetalleDocumento.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleDocumento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonActualizarDetalleDocumento.addActionListener (new ButtonActionListener(this,"ActualizarDetalleDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonActualizarToolBarDetalleDocumento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleDocumento"));
				
			this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemActualizarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleDocumento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonEliminarDetalleDocumento.addActionListener (new ButtonActionListener(this,"EliminarDetalleDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonEliminarToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleDocumento"));
						
			this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemEliminarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleDocumento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonCancelarDetalleDocumento.addActionListener (new ButtonActionListener(this,"CancelarDetalleDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonCancelarToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleDocumento"));
			
			this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemCancelarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleDocumento"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleDocumento"));		
		
		
		this.jButtonCerrarDetalleDocumento.addActionListener (new ButtonActionListener(this,"CerrarDetalleDocumento"));
		
		
		this.jButtonCerrarToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleDocumento"));
			
		this.jMenuItemCerrarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleDocumento"));
			
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jMenuItemDetalleCerrarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleDocumento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonGuardarCambiosDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jButtonGuardarCambiosToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleDocumento"));
		}
		
		this.jButtonCopiarToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleDocumento"));
			
		this.jButtonVerFormToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleDocumento"));
		
		this.jMenuItemGuardarCambiosDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleDocumento"));
			
		this.jMenuItemCopiarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleDocumento"));		
		
		this.jMenuItemVerFormDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleDocumento"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleDocumento"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleDocumento"));
			
		this.jMenuItemGuardarCambiosTablaDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleDocumento"));		
		
		
		
		this.jButtonRecargarInformacionDetalleDocumento.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleDocumento"));
					
		this.jButtonRecargarInformacionToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleDocumento"));
		
		this.jMenuItemRecargarInformacionDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleDocumento"));		
		
		
		
		this.jButtonAnterioresDetalleDocumento.addActionListener (new ButtonActionListener(this,"AnterioresDetalleDocumento"));
		
		
		this.jButtonAnterioresToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleDocumento"));
		
		this.jMenuItemAnterioresDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleDocumento"));		
		
		
		this.jButtonSiguientesDetalleDocumento.addActionListener (new ButtonActionListener(this,"SiguientesDetalleDocumento"));
		
		
		this.jButtonSiguientesToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleDocumento"));
			
		this.jMenuItemSiguientesDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleDocumento"));
			
		this.jMenuItemAbrirOrderByDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleDocumento"));
			
		this.jMenuItemMostrarOcultarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleDocumento"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleDocumento"));
			
		this.jMenuItemDetalleMostarOcultarDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleDocumento"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleDocumento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleDocumento"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleDocumento"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleDocumento"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleDocumento.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleDocumento"));

		this.jCheckBoxSeleccionadosDetalleDocumento.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleDocumento"));
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleDocumento"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleDocumento.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleDocumento"));
			
		this.jComboBoxTiposAccionesDetalleDocumento.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleDocumento"));
					
		this.jComboBoxTiposSeleccionarDetalleDocumento.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleDocumento"));
			
		this.jTextFieldValorCampoGeneralDetalleDocumento.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleDocumento"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonidDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_empresaDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_empresaDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_moduloDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_moduloDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_detalle_documentoDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_detalle_documentoDetalleDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonnombreDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleDocumentoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.addActionListener(new ButtonActionListener(this,"BusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento"));

			this.jButtonFK_IdDetalleDocumentoDetalleDocumento.addActionListener(new ButtonActionListener(this,"FK_IdDetalleDocumentoDetalleDocumento"));

			this.jButtonFK_IdModuloDetalleDocumento.addActionListener(new ButtonActionListener(this,"FK_IdModuloDetalleDocumento"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleDocumento!=null) {
				this.jInternalFrameReporteDinamicoDetalleDocumento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleDocumento"));
				this.jInternalFrameReporteDinamicoDetalleDocumento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleDocumento"));
				this.jInternalFrameReporteDinamicoDetalleDocumento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleDocumento"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleDocumento.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleDocumento"));				
			//this.jButtonGenerarReporteDinamicoDetalleDocumento.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleDocumento"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleDocumento.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleDocumento"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleDocumento!=null) {
				this.jInternalFrameImportacionDetalleDocumento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleDocumento"));
				this.jInternalFrameImportacionDetalleDocumento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleDocumento"));
				this.jInternalFrameImportacionDetalleDocumento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleDocumento"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleDocumento.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleDocumento"));
			
			this.jButtonAbrirOrderByToolBarDetalleDocumento.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleDocumento"));			
			
			if(this.jInternalFrameOrderByDetalleDocumento!=null) {
				this.jInternalFrameOrderByDetalleDocumento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleDocumento"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDocumento.jTabbedPaneRelacionesDetalleDocumento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleDocumento"));
		
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
            		closingInternalFrameDetalleDocumento();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleDocumento.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleDocumento = (JInternalFrameBase)event.getSource();
	            	
	            DetalleDocumentoBeanSwingJInternalFrame jInternalFrameParent=(DetalleDocumentoBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleDocumento.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleDocumentoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleDocumento.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleDocumentoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleDocumento.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleDocumento.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleDocumentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleDocumentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleDocumentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleDocumento";
		inputMap = this.jButtonNuevoDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleDocumentoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleDocumentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleDocumentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleDocumentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleDocumento";
		inputMap = this.jButtonNuevoRelacionesDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleDocumentoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleDocumento";
		inputMap = this.jButtonModificarDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleDocumento";
		inputMap = this.jButtonActualizarDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleDocumento";
		inputMap = this.jButtonEliminarDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleDocumento";
		inputMap = this.jButtonCancelarDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleDocumento";
		inputMap = this.jButtonCerrarDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonGuardarCambiosDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleDocumento";
		inputMap = this.jInternalFrameDetalleFormDetalleDocumento.jButtonGuardarCambiosDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonGuardarCambiosDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleDocumento.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleDocumentoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleDocumento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleDocumentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleDocumento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleDocumentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleDocumento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleDocumentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonidDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_empresaDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_empresaDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_moduloDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_moduloDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_transaccion_moduloDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_detalle_documentoDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_detalle_documentoDetalleDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDocumento.jButtonnombreDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleDocumentoBusqueda"));
		
		
		this.jButtonBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento.addActionListener(new ButtonActionListener(this,"BusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento"));

		this.jButtonFK_IdDetalleDocumentoDetalleDocumento.addActionListener(new ButtonActionListener(this,"FK_IdDetalleDocumentoDetalleDocumento"));

		this.jButtonFK_IdModuloDetalleDocumento.addActionListener(new ButtonActionListener(this,"FK_IdModuloDetalleDocumento"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleDocumentoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleDocumento.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleDocumento(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleDocumento detalledocumentoAux:this.detalledocumentoLogic.getDetalleDocumentos()) {
					detalledocumentoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleDocumento detalledocumentoAux:detalledocumentos) {
					detalledocumentoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleDocumentoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleDocumento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleDocumento detalledocumentoAux:this.detalledocumentoLogic.getDetalleDocumentos()) {
						detalledocumentoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleDocumento detalledocumentoAux:detalledocumentos) {
						detalledocumentoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleDocumento detalledocumentoAux:this.detalledocumentoLogic.getDetalleDocumentos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleDocumento detalledocumentoAux:detalledocumentos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleDocumento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleDocumento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleDocumento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleDocumento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleDocumentoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleDocumento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleDocumento.getSelectedRows();
			
			DetalleDocumento detalledocumentoLocal=new DetalleDocumento();
			
			//this.seleccionarTodosDetalleDocumento(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalledocumentoLocal =(DetalleDocumento) this.detalledocumentoLogic.getDetalleDocumentos().toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalledocumentoLocal =(DetalleDocumento) this.detalledocumentos.toArray()[this.jTableDatosDetalleDocumento.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalledocumentoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleDocumento detalledocumentoAux:this.detalledocumentoLogic.getDetalleDocumentos()) {
						detalledocumentoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleDocumento detalledocumentoAux:detalledocumentos) {
						detalledocumentoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleDocumento(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleDocumento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleDocumento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleDocumento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleDocumentoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleDocumentoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleDocumentoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleDocumento(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleDocumento.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleDocumento detalledocumentoAux:this.detalledocumentoLogic.getDetalleDocumentos()) {
				
						if(sTipoSeleccionar.equals(DetalleDocumentoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							detalledocumentoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleDocumento detalledocumentoAux:detalledocumentos) {
					
						if(sTipoSeleccionar.equals(DetalleDocumentoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							detalledocumentoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleDocumento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleDocumentoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleDocumento(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleDocumento=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleDocumento.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleDocumento) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleDocumento(conSplash);
				
					this.generarReporteDetalleDocumentosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleDocumento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleDocumentosSeleccionados();
				//this.jComboBoxTiposAccionesDetalleDocumento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleDocumentosSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleDocumento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleDocumentosSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleDocumento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleDocumento();
				
				this.exportarDetalleDocumentosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleDocumento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleDocumentos();
				//this.importarDetalleDocumentos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleDocumento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleDocumento();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleDocumentosSeleccionados();
				//this.jComboBoxTiposAccionesDetalleDocumento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Documento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleDocumento();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleDocumento)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleDocumento(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleDocumento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleDocumentoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleDocumento) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleDocumento(conSplash);
					
						//this.actualizarParametrosGeneralDetalleDocumento();
						
						this.generarReporteProcesoAccionDetalleDocumentosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleDocumento.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleDocumentoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle DocumentoS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Documento", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleDocumento();
				
						this.actualizarParametrosGeneralDetalleDocumento();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalledocumentoReturnGeneral=detalledocumentoLogic.procesarAccionDetalleDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalledocumentoLogic.getDetalleDocumentos(),this.detalledocumentoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleDocumentoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleDocumento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleDocumento();
					
					DetalleDocumentoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleDocumentoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleDocumento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxTiposAccionesFormularioDetalleDocumento.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleDocumento(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleDocumentoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleDocumento();
			
			if(this.jInternalFrameDetalleFormDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();		
			DetalleDocumento detalledocumento=new DetalleDocumento();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleDocumento(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleDocumento.getSelectedItem();
			
			
			
			
			detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalledocumentosSeleccionados.size()==1) {
				for(DetalleDocumento detalledocumentoAux:detalledocumentosSeleccionados) {
					detalledocumento=detalledocumentoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleDocumento();
			
      		//this.finishProcessDetalleDocumento(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleDocumentoReturnGeneral() throws Exception {
		if(this.detalledocumentoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalledocumentoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalledocumentoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalledocumentoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalledocumentoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalledocumentoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleDocumento(false);
		}
		
		if(this.detalledocumentoReturnGeneral.getConRetornoLista() || this.detalledocumentoReturnGeneral.getConRetornoObjeto()) {
			if(this.detalledocumentoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalledocumentoLogic.setDetalleDocumentos(this.detalledocumentoReturnGeneral.getDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalledocumentoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalledocumentoLogic.setDetalleDocumento(this.detalledocumentoReturnGeneral.getDetalleDocumento());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleDocumento(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleDocumento() throws Exception {
		
		
	}
	
	public ArrayList<DetalleDocumento> getDetalleDocumentosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleDocumento) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleDocumento detalledocumentoAux:detalledocumentoLogic.getDetalleDocumentos()) {
					if(detalledocumentoAux.getIsSelected()) {
						detalledocumentosSeleccionados.add(detalledocumentoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleDocumento detalledocumentoAux:this.detalledocumentos) {
					if(detalledocumentoAux.getIsSelected()) {
						detalledocumentosSeleccionados.add(detalledocumentoAux);				
					}
				}
			}
			
			if(detalledocumentosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalledocumentosSeleccionados.addAll(this.detalledocumentoLogic.getDetalleDocumentos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalledocumentosSeleccionados.addAll(this.detalledocumentos);				
					}
				}
			}
		} else {
			detalledocumentosSeleccionados.add(this.detalledocumento);
		}
		
		return detalledocumentosSeleccionados;
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
	
	public void generarReporteDetalleDocumentosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleDocumentosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleDocumentosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleDocumentosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleDocumentosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Documento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleDocumentosSeleccionados() throws Exception {
		ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();		
		
		detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleDocumentos("Todos",detalledocumentosSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleDocumentosSeleccionados() throws Exception {
		ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();		
		
		detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleDocumentos("Todos",detalledocumentosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleDocumentosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();
		
		detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleDocumentos("Todos",detalledocumentosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleDocumentosSeleccionados() throws Exception {
		ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleDocumento();
		
		
		detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleDocumento();
		
		
		//this.generarReporteDetalleDocumentos("Todos",detalledocumentosSeleccionados ,detalledocumentoImplementable,detalledocumentoImplementableHome);
	}
	
	public void mostrarImportacionDetalleDocumentos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleDocumento();
		
		this.abrirFrameImportacionDetalleDocumento();		
		
			
		//this.generarReporteDetalleDocumentos("Todos",detalledocumentosSeleccionados ,detalledocumentoImplementable,detalledocumentoImplementableHome);
	}
	
	public void importarDetalleDocumentos() throws Exception {		
	
	}
	
	public void exportarDetalleDocumentosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleDocumentosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleDocumentosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleDocumentosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Documento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleDocumentosSeleccionados() throws Exception {
		ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();		
		
		detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledocumento."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleDocumento(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleDocumento detalledocumentoAux:detalledocumentosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleDocumento(detalledocumentoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalledocumentoAux.setsDetalleGeneralEntityReporte(detalledocumentoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleDocumento(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleDocumentoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleDocumentoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleDocumentoConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleDocumentoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleDocumento(DetalleDocumento detalledocumento,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalledocumento.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalledocumento.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalledocumento.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalledocumento.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalledocumento.gettipotransaccionmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalledocumento.gettipodetalledocumento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalledocumento.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleDocumentosSeleccionados() throws Exception {
		ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();		
		
		detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledocumento.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleDocumentos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleDocumento(row);				
				iRow++;
			}				
			
			for(DetalleDocumento detalledocumentoAux:detalledocumentosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleDocumento(detalledocumentoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleDocumentosSeleccionados() throws Exception {
		ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();		
		
		detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledocumento.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalledocumentos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalledocumento");
			//elementRoot.appendChild(element);
		
			for(DetalleDocumento detalledocumentoAux:detalledocumentosSeleccionados) {
				element = document.createElement("detalledocumento");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleDocumento(detalledocumentoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleDocumento(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDocumentoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleDocumento(DetalleDocumento detalledocumento,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalledocumento.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalledocumento.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalledocumento.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalledocumento.gettipotransaccionmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalledocumento.gettipodetalledocumento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalledocumento.getnombre());				
	}
	
	public void setFilaDatosExportarXmlDetalleDocumento(DetalleDocumento detalledocumento,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleDocumentoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalledocumento.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleDocumentoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalledocumento.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetalleDocumentoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalledocumento.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementmodulo_descripcion = document.createElement(DetalleDocumentoConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(detalledocumento.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementtipotransaccionmodulo_descripcion = document.createElement(DetalleDocumentoConstantesFunciones.IDTIPOTRANSACCIONMODULO);
		elementtipotransaccionmodulo_descripcion.appendChild(document.createTextNode(detalledocumento.gettipotransaccionmodulo_descripcion()));
		element.appendChild(elementtipotransaccionmodulo_descripcion);

		Element elementtipodetalledocumento_descripcion = document.createElement(DetalleDocumentoConstantesFunciones.IDTIPODETALLEDOCUMENTO);
		elementtipodetalledocumento_descripcion.appendChild(document.createTextNode(detalledocumento.gettipodetalledocumento_descripcion()));
		element.appendChild(elementtipodetalledocumento_descripcion);

		Element elementnombre = document.createElement(DetalleDocumentoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(detalledocumento.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoDetalleDocumentosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleDocumento> detalledocumentosSeleccionados=new ArrayList<DetalleDocumento>();
		
		detalledocumentosSeleccionados=this.getDetalleDocumentosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleDocumento(detalledocumentosSeleccionados);
		
		this.generarReporteDetalleDocumentos("Todos",detalledocumentosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleDocumento(ArrayList<DetalleDocumento> detalledocumentosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleDocumento detalledocumentoAux:detalledocumentosSeleccionados) {
				detalledocumentoAux.setsDetalleGeneralEntityReporte(detalledocumentoAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalledocumentoAux.setsDescripcionGeneralEntityReporte1(detalledocumentoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleDocumentoConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					detalledocumentoAux.setsDescripcionGeneralEntityReporte1(detalledocumentoAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO)) {
					existe=true;
					detalledocumentoAux.setsDescripcionGeneralEntityReporte1(detalledocumentoAux.gettipotransaccionmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO)) {
					existe=true;
					detalledocumentoAux.setsDescripcionGeneralEntityReporte1(detalledocumentoAux.gettipodetalledocumento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleDocumentoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					detalledocumentoAux.setsDescripcionGeneralEntityReporte1(detalledocumentoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleDocumento(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleDocumento=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarDetalleDocumento=false;
			this.isVisibilidadCeldaEliminarDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarDetalleDocumento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDocumento=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDocumento=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=false;
			this.isVisibilidadCeldaModificarDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarDetalleDocumento=true;
			this.isVisibilidadCeldaEliminarDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarDetalleDocumento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDocumento=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDocumento=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=false;
			this.isVisibilidadCeldaModificarDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarDetalleDocumento=true;
			this.isVisibilidadCeldaEliminarDetalleDocumento=true;
			this.isVisibilidadCeldaCancelarDetalleDocumento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDocumento=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDocumento=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=false;
			this.isVisibilidadCeldaModificarDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarDetalleDocumento=true;
			this.isVisibilidadCeldaEliminarDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarDetalleDocumento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDocumento=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDocumento=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleDocumento=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=true;
			this.isVisibilidadCeldaModificarDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarDetalleDocumento=false;
			this.isVisibilidadCeldaEliminarDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarDetalleDocumento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDocumento=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDocumento=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarDetalleDocumento=false;
			this.isVisibilidadCeldaEliminarDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarDetalleDocumento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDocumento=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDocumento=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=false;
			this.isVisibilidadCeldaModificarDetalleDocumento=true;
			this.isVisibilidadCeldaActualizarDetalleDocumento=false;
			this.isVisibilidadCeldaEliminarDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarDetalleDocumento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDocumento=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDocumento=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleDocumentoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleDocumento=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=true;
		} else {
			this.actualizarEstadoPanelsDetalleDocumento(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleDocumento=false;
			//this.isVisibilidadCeldaVerFormDetalleDocumento=false;
			this.isVisibilidadCeldaDuplicarDetalleDocumento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalledocumentoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDocumento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalledocumentoSessionBean.getEsGuardarRelacionado()) {
			if(!detalledocumentoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=false;												
			}
			
			this.jButtonCerrarDetalleDocumento.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleDocumento=false;
		}
		
		if(!this.permiteMantenimiento(this.detalledocumento)) {
			this.isVisibilidadCeldaActualizarDetalleDocumento=false;
			this.isVisibilidadCeldaEliminarDetalleDocumento=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleDocumento() {
	}
	
	public void actualizarEstadoPanelsDetalleDocumento(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionDetalleDocumento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasDetalleDocumento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleDocumento!=null) {
				this.jScrollPanelDatosDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleDocumento!=null) {
				this.jPanelPaginacionDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleDocumento!=null) {
				this.jPanelParametrosReportesDetalleDocumento.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionDetalleDocumento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasDetalleDocumento.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleDocumento!=null) {
				this.jScrollPanelDatosDetalleDocumento.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleDocumento!=null) {
				this.jPanelPaginacionDetalleDocumento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleDocumento!=null) {
				this.jPanelParametrosReportesDetalleDocumento.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionDetalleDocumento.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasDetalleDocumento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleDocumento!=null) {
				this.jScrollPanelDatosDetalleDocumento.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleDocumento!=null) {
				this.jPanelPaginacionDetalleDocumento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleDocumento!=null) {
				this.jPanelParametrosReportesDetalleDocumento.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionDetalleDocumento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasDetalleDocumento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleDocumento!=null) {
				this.jScrollPanelDatosDetalleDocumento.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleDocumento!=null) {
				this.jPanelPaginacionDetalleDocumento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleDocumento!=null) {
				this.jPanelParametrosReportesDetalleDocumento.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionDetalleDocumento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasDetalleDocumento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleDocumento!=null) {
				this.jScrollPanelDatosDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleDocumento!=null) {
				this.jPanelPaginacionDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleDocumento!=null) {
				this.jPanelParametrosReportesDetalleDocumento.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionDetalleDocumento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasDetalleDocumento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleDocumento!=null) {
				this.jScrollPanelDatosDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleDocumento!=null) {
				this.jPanelPaginacionDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleDocumento!=null) {
				this.jPanelParametrosReportesDetalleDocumento.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionDetalleDocumento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasDetalleDocumento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleDocumento!=null) {
				this.jScrollPanelDatosDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleDocumento!=null) {
				this.jPanelPaginacionDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleDocumento!=null) {
				this.jPanelParametrosReportesDetalleDocumento.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleDocumento!=null) {
					this.jTabbedPaneBusquedasDetalleDocumento.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleDocumento!=null) {
				this.jPanelParametrosReportesDetalleDocumento.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasDetalleDocumento.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleDocumento!=null) {
				this.jPanelParametrosReportesDetalleDocumento.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion) {this.jTabbedPaneBusquedasDetalleDocumento.remove(jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);}

			this.isVisibilidadFK_IdDetalleDocumento=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleDocumento) {this.jTabbedPaneBusquedasDetalleDocumento.remove(jPanelFK_IdDetalleDocumentoDetalleDocumento);}

			this.isVisibilidadFK_IdModulo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasDetalleDocumento.remove(jPanelFK_IdModuloDetalleDocumento);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion=isParaModulo;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion) {this.jTabbedPaneBusquedasDetalleDocumento.remove(jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);}

			this.isVisibilidadFK_IdDetalleDocumento=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdDetalleDocumento) {this.jTabbedPaneBusquedasDetalleDocumento.remove(jPanelFK_IdDetalleDocumentoDetalleDocumento);}

			this.isVisibilidadFK_IdModulo=isParaModulo;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasDetalleDocumento.remove(jPanelFK_IdModuloDetalleDocumento);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoTransaccionModulo(Boolean isParaTipoTransaccionModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoTransaccionModuloNegation=!isParaTipoTransaccionModulo;

			this.isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion=isParaTipoTransaccionModulo;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion) {this.jTabbedPaneBusquedasDetalleDocumento.remove(jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);}

			this.isVisibilidadFK_IdDetalleDocumento=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadFK_IdDetalleDocumento) {this.jTabbedPaneBusquedasDetalleDocumento.remove(jPanelFK_IdDetalleDocumentoDetalleDocumento);}

			this.isVisibilidadFK_IdModulo=isParaTipoTransaccionModuloNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasDetalleDocumento.remove(jPanelFK_IdModuloDetalleDocumento);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDetalleDocumento(Boolean isParaTipoDetalleDocumento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDetalleDocumentoNegation=!isParaTipoDetalleDocumento;

			this.isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion=isParaTipoDetalleDocumentoNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdTipoTransaccion) {this.jTabbedPaneBusquedasDetalleDocumento.remove(jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);}

			this.isVisibilidadFK_IdDetalleDocumento=isParaTipoDetalleDocumento;
			if(!this.isVisibilidadFK_IdDetalleDocumento) {this.jTabbedPaneBusquedasDetalleDocumento.remove(jPanelFK_IdDetalleDocumentoDetalleDocumento);}

			this.isVisibilidadFK_IdModulo=isParaTipoDetalleDocumentoNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasDetalleDocumento.remove(jPanelFK_IdModuloDetalleDocumento);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleDocumentoSessionBean detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
		
		if(this.detalledocumentoSessionBean==null) {
			this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
		}
		
		this.detalledocumentoSessionBean.setsUltimaBusquedaDetalleDocumento(this.getsAccionBusqueda());
		this.detalledocumentoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalledocumentoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdModuloPorIdTipoTransaccion")) {
			detalledocumentoSessionBean.setid_modulo(this.getid_moduloBusquedaPorIdModuloPorIdTipoTransaccion());	
			detalledocumentoSessionBean.setid_tipo_transaccion_modulo(this.getid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDetalleDocumento")) {
			detalledocumentoSessionBean.setid_tipo_detalle_documento(this.getid_tipo_detalle_documentoFK_IdDetalleDocumento());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalledocumentoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			detalledocumentoSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleDocumentoSessionBean detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
		
		if(this.detalledocumentoSessionBean==null) {
			this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
		}
		
		if(this.detalledocumentoSessionBean.getsUltimaBusquedaDetalleDocumento()!=null&&!this.detalledocumentoSessionBean.getsUltimaBusquedaDetalleDocumento().equals("")) {
			this.setsAccionBusqueda(detalledocumentoSessionBean.getsUltimaBusquedaDetalleDocumento());
			this.setiNumeroPaginacion(detalledocumentoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalledocumentoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdModuloPorIdTipoTransaccion")) {
				this.setid_moduloBusquedaPorIdModuloPorIdTipoTransaccion(detalledocumentoSessionBean.getid_modulo());
				detalledocumentoSessionBean.setid_modulo(-1L);
				this.setid_tipo_transaccion_moduloBusquedaPorIdModuloPorIdTipoTransaccion(detalledocumentoSessionBean.getid_tipo_transaccion_modulo());
				detalledocumentoSessionBean.setid_tipo_transaccion_modulo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleDocumento")) {
				this.setid_tipo_detalle_documentoFK_IdDetalleDocumento(detalledocumentoSessionBean.getid_tipo_detalle_documento());
				detalledocumentoSessionBean.setid_tipo_detalle_documento(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalledocumentoSessionBean.getid_empresa());
				detalledocumentoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(detalledocumentoSessionBean.getid_modulo());
				detalledocumentoSessionBean.setid_modulo(-1L);
			}
		}
		
		this.detalledocumentoSessionBean.setsUltimaBusquedaDetalleDocumento("");
		this.detalledocumentoSessionBean.setiNumeroPaginacion(DetalleDocumentoConstantesFunciones.INUMEROPAGINACION);
		this.detalledocumentoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleDocumento(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleDocumento() {
		this.updateBorderResaltarBusquedasFormularioDetalleDocumento();
		this.updateVisibilidadBusquedasFormularioDetalleDocumento();
		this.updateHabilitarBusquedasFormularioDetalleDocumento();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleDocumento() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleDocumento.getComponents().length>0) {
	

		if(this.detalledocumentoConstantesFunciones.resaltarBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento!=null) {
			index= this.jTabbedPaneBusquedasDetalleDocumento.indexOfComponent(this.jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDocumento.getComponent(index);
				jPanel.setBorder(this.detalledocumentoConstantesFunciones.resaltarBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);
			}
		}

		if(this.detalledocumentoConstantesFunciones.resaltarFK_IdDetalleDocumentoDetalleDocumento!=null) {
			index= this.jTabbedPaneBusquedasDetalleDocumento.indexOfComponent(this.jPanelFK_IdDetalleDocumentoDetalleDocumento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDocumento.getComponent(index);
				jPanel.setBorder(this.detalledocumentoConstantesFunciones.resaltarFK_IdDetalleDocumentoDetalleDocumento);
			}
		}

		if(this.detalledocumentoConstantesFunciones.resaltarFK_IdModuloDetalleDocumento!=null) {
			index= this.jTabbedPaneBusquedasDetalleDocumento.indexOfComponent(this.jPanelFK_IdModuloDetalleDocumento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDocumento.getComponent(index);
				jPanel.setBorder(this.detalledocumentoConstantesFunciones.resaltarFK_IdModuloDetalleDocumento);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleDocumento() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleDocumento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleDocumento.indexOfComponent(this.jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDocumento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalledocumentoConstantesFunciones.mostrarBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);
			if(!this.detalledocumentoConstantesFunciones.mostrarBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento && index>-1) {
				this.jTabbedPaneBusquedasDetalleDocumento.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleDocumento.indexOfComponent(this.jPanelFK_IdDetalleDocumentoDetalleDocumento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDocumento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalledocumentoConstantesFunciones.mostrarFK_IdDetalleDocumentoDetalleDocumento);
			if(!this.detalledocumentoConstantesFunciones.mostrarFK_IdDetalleDocumentoDetalleDocumento && index>-1) {
				this.jTabbedPaneBusquedasDetalleDocumento.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleDocumento.indexOfComponent(this.jPanelFK_IdModuloDetalleDocumento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDocumento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalledocumentoConstantesFunciones.mostrarFK_IdModuloDetalleDocumento);
			if(!this.detalledocumentoConstantesFunciones.mostrarFK_IdModuloDetalleDocumento && index>-1) {
				this.jTabbedPaneBusquedasDetalleDocumento.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleDocumento() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleDocumento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleDocumento.indexOfComponent(this.jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDocumento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalledocumentoConstantesFunciones.activarBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);
				this.jTabbedPaneBusquedasDetalleDocumento.setEnabledAt(index,this.detalledocumentoConstantesFunciones.activarBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);
			}

			index= this.jTabbedPaneBusquedasDetalleDocumento.indexOfComponent(this.jPanelFK_IdDetalleDocumentoDetalleDocumento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDocumento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalledocumentoConstantesFunciones.activarFK_IdDetalleDocumentoDetalleDocumento);
				this.jTabbedPaneBusquedasDetalleDocumento.setEnabledAt(index,this.detalledocumentoConstantesFunciones.activarFK_IdDetalleDocumentoDetalleDocumento);
			}

			index= this.jTabbedPaneBusquedasDetalleDocumento.indexOfComponent(this.jPanelFK_IdModuloDetalleDocumento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDocumento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalledocumentoConstantesFunciones.activarFK_IdModuloDetalleDocumento);
				this.jTabbedPaneBusquedasDetalleDocumento.setEnabledAt(index,this.detalledocumentoConstantesFunciones.activarFK_IdModuloDetalleDocumento);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleDocumento(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdModuloPorIdTipoTransaccion")) {
			index= this.jTabbedPaneBusquedasDetalleDocumento.indexOfComponent(this.jPanelBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);

			this.jTabbedPaneBusquedasDetalleDocumento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDocumento.getComponent(index);

			this.detalledocumentoConstantesFunciones.setResaltarBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento(resaltar);

			jPanel.setBorder(this.detalledocumentoConstantesFunciones.resaltarBusquedaPorIdModuloPorIdTipoTransaccionDetalleDocumento);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDetalleDocumento")) {
			index= this.jTabbedPaneBusquedasDetalleDocumento.indexOfComponent(this.jPanelFK_IdDetalleDocumentoDetalleDocumento);

			this.jTabbedPaneBusquedasDetalleDocumento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDocumento.getComponent(index);

			this.detalledocumentoConstantesFunciones.setResaltarFK_IdDetalleDocumentoDetalleDocumento(resaltar);

			jPanel.setBorder(this.detalledocumentoConstantesFunciones.resaltarFK_IdDetalleDocumentoDetalleDocumento);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdModulo")) {
			index= this.jTabbedPaneBusquedasDetalleDocumento.indexOfComponent(this.jPanelFK_IdModuloDetalleDocumento);

			this.jTabbedPaneBusquedasDetalleDocumento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDocumento.getComponent(index);

			this.detalledocumentoConstantesFunciones.setResaltarFK_IdModuloDetalleDocumento(resaltar);

			jPanel.setBorder(this.detalledocumentoConstantesFunciones.resaltarFK_IdModuloDetalleDocumento);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleDocumento.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleDocumento() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleDocumento();
		this.updateVisibilidadResaltarControlesFormularioDetalleDocumento();
		this.updateHabilitarResaltarControlesFormularioDetalleDocumento();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleDocumento() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalledocumentoConstantesFunciones.resaltaridDetalleDocumento!=null && this.jInternalFrameDetalleFormDetalleDocumento!=null) {this.jInternalFrameDetalleFormDetalleDocumento.jLabelidDetalleDocumento.setBorder(this.detalledocumentoConstantesFunciones.resaltaridDetalleDocumento);}
		if(this.detalledocumentoConstantesFunciones.resaltarid_empresaDetalleDocumento!=null && this.jInternalFrameDetalleFormDetalleDocumento!=null) {this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.setBorder(this.detalledocumentoConstantesFunciones.resaltarid_empresaDetalleDocumento);}
		if(this.detalledocumentoConstantesFunciones.resaltarid_moduloDetalleDocumento!=null && this.jInternalFrameDetalleFormDetalleDocumento!=null) {this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.setBorder(this.detalledocumentoConstantesFunciones.resaltarid_moduloDetalleDocumento);}
		if(this.detalledocumentoConstantesFunciones.resaltarid_tipo_transaccion_moduloDetalleDocumento!=null && this.jInternalFrameDetalleFormDetalleDocumento!=null) {this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setBorder(this.detalledocumentoConstantesFunciones.resaltarid_tipo_transaccion_moduloDetalleDocumento);}
		if(this.detalledocumentoConstantesFunciones.resaltarid_tipo_detalle_documentoDetalleDocumento!=null && this.jInternalFrameDetalleFormDetalleDocumento!=null) {this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.setBorder(this.detalledocumentoConstantesFunciones.resaltarid_tipo_detalle_documentoDetalleDocumento);}
		if(this.detalledocumentoConstantesFunciones.resaltarnombreDetalleDocumento!=null && this.jInternalFrameDetalleFormDetalleDocumento!=null) {this.jInternalFrameDetalleFormDetalleDocumento.jTextFieldnombreDetalleDocumento.setBorder(this.detalledocumentoConstantesFunciones.resaltarnombreDetalleDocumento);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleDocumento() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
	
		//this.jInternalFrameDetalleFormDetalleDocumento.jLabelidDetalleDocumento.setVisible(this.detalledocumentoConstantesFunciones.mostraridDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jPanelidDetalleDocumento.setVisible(this.detalledocumentoConstantesFunciones.mostraridDetalleDocumento);
		//this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.setVisible(this.detalledocumentoConstantesFunciones.mostrarid_empresaDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jPanelid_empresaDetalleDocumento.setVisible(this.detalledocumentoConstantesFunciones.mostrarid_empresaDetalleDocumento);
		//this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.setVisible(this.detalledocumentoConstantesFunciones.mostrarid_moduloDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jPanelid_moduloDetalleDocumento.setVisible(this.detalledocumentoConstantesFunciones.mostrarid_moduloDetalleDocumento);
		//this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setVisible(this.detalledocumentoConstantesFunciones.mostrarid_tipo_transaccion_moduloDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jPanelid_tipo_transaccion_moduloDetalleDocumento.setVisible(this.detalledocumentoConstantesFunciones.mostrarid_tipo_transaccion_moduloDetalleDocumento);
		//this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.setVisible(this.detalledocumentoConstantesFunciones.mostrarid_tipo_detalle_documentoDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jPanelid_tipo_detalle_documentoDetalleDocumento.setVisible(this.detalledocumentoConstantesFunciones.mostrarid_tipo_detalle_documentoDetalleDocumento);
		//this.jInternalFrameDetalleFormDetalleDocumento.jTextFieldnombreDetalleDocumento.setVisible(this.detalledocumentoConstantesFunciones.mostrarnombreDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jPanelnombreDetalleDocumento.setVisible(this.detalledocumentoConstantesFunciones.mostrarnombreDetalleDocumento);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleDocumento() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleDocumento!=null) {
	
		this.jInternalFrameDetalleFormDetalleDocumento.jLabelidDetalleDocumento.setEnabled(this.detalledocumentoConstantesFunciones.activaridDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_empresaDetalleDocumento.setEnabled(this.detalledocumentoConstantesFunciones.activarid_empresaDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_moduloDetalleDocumento.setEnabled(this.detalledocumentoConstantesFunciones.activarid_moduloDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setEnabled(this.detalledocumentoConstantesFunciones.activarid_tipo_transaccion_moduloDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jComboBoxid_tipo_detalle_documentoDetalleDocumento.setEnabled(this.detalledocumentoConstantesFunciones.activarid_tipo_detalle_documentoDetalleDocumento);
		this.jInternalFrameDetalleFormDetalleDocumento.jTextFieldnombreDetalleDocumento.setEnabled(this.detalledocumentoConstantesFunciones.activarnombreDetalleDocumento);
		}
	}
	
		
}