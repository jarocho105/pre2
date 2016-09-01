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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.TipoCodigoRetencionSriConstantesFunciones;
import com.bydan.erp.tesoreria.util.TipoCodigoRetencionSriParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TipoCodigoRetencionSriParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TipoCodigoRetencionSriBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
public class TipoCodigoRetencionSriBeanSwingJInternalFrame extends TipoCodigoRetencionSriJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCodigoRetencionSriBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCodigoRetencionSri> tipocodigoretencionsriValidator = new ClassValidator<TipoCodigoRetencionSri>(TipoCodigoRetencionSri.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCodigoRetencionSri tipocodigoretencionsri;	
	public TipoCodigoRetencionSri tipocodigoretencionsriAux;
	public TipoCodigoRetencionSri tipocodigoretencionsriAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCodigoRetencionSri tipocodigoretencionsriTotales;
	public Long idTipoCodigoRetencionSriActual;
	public Long iIdNuevoTipoCodigoRetencionSri=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
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
	
	public Boolean isPermisoTodoTipoCodigoRetencionSri;
	public Boolean isPermisoNuevoTipoCodigoRetencionSri;
	public Boolean isPermisoActualizarTipoCodigoRetencionSri;
	public Boolean isPermisoActualizarOriginalTipoCodigoRetencionSri;
	public Boolean isPermisoEliminarTipoCodigoRetencionSri;
	public Boolean isPermisoGuardarCambiosTipoCodigoRetencionSri;
	public Boolean isPermisoConsultaTipoCodigoRetencionSri;
	public Boolean isPermisoBusquedaTipoCodigoRetencionSri;
	public Boolean isPermisoReporteTipoCodigoRetencionSri;
	public Boolean isPermisoPaginacionMedioTipoCodigoRetencionSri;
	public Boolean isPermisoPaginacionAltoTipoCodigoRetencionSri;
	public Boolean isPermisoPaginacionTodoTipoCodigoRetencionSri;
	public Boolean isPermisoCopiarTipoCodigoRetencionSri;
	public Boolean isPermisoVerFormTipoCodigoRetencionSri;
	public Boolean isPermisoDuplicarTipoCodigoRetencionSri;
	public Boolean isPermisoOrdenTipoCodigoRetencionSri;
	
	
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
	
	public TipoCodigoRetencionSriParameterReturnGeneral tipocodigoretencionsriReturnGeneral;
	public TipoCodigoRetencionSriParameterReturnGeneral tipocodigoretencionsriParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCodigoRetencionSri=false;
	public Boolean esParaAccionDesdeFormularioTipoCodigoRetencionSri=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCodigoRetencionSriLogic tipocodigoretencionsriLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCodigoRetencionSri tipocodigoretencionsriBean;
	public TipoCodigoRetencionSriConstantesFunciones tipocodigoretencionsriConstantesFunciones;
	//public TipoCodigoRetencionSriParameterReturnGeneral tipocodigoretencionsriReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoCodigoRetencionSri> tipocodigoretencionsris;	
	//public List<TipoCodigoRetencionSri> tipocodigoretencionsrisEliminados;
	//public List<TipoCodigoRetencionSri> tipocodigoretencionsrisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCodigoRetencionSri=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCodigoRetencionSri=true;
	public Boolean isVisibilidadCeldaCopiarTipoCodigoRetencionSri=true;
	public Boolean isVisibilidadCeldaVerFormTipoCodigoRetencionSri=true;
	public Boolean isVisibilidadCeldaOrdenTipoCodigoRetencionSri=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=false;
	public Boolean isVisibilidadCeldaModificarTipoCodigoRetencionSri=false;
	public Boolean isVisibilidadCeldaActualizarTipoCodigoRetencionSri=false;
	public Boolean isVisibilidadCeldaEliminarTipoCodigoRetencionSri=false;
	public Boolean isVisibilidadCeldaCancelarTipoCodigoRetencionSri=false;
	public Boolean isVisibilidadCeldaGuardarTipoCodigoRetencionSri=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoCodigoRetencionSri() {
		return this.iIdNuevoTipoCodigoRetencionSri;
	}

	public void setiIdNuevoTipoCodigoRetencionSri(Long iIdNuevoTipoCodigoRetencionSri) {
		this.iIdNuevoTipoCodigoRetencionSri = iIdNuevoTipoCodigoRetencionSri;
	}
	
	public Long getidTipoCodigoRetencionSriActual() {
		return this.idTipoCodigoRetencionSriActual;
	}

	public void setidTipoCodigoRetencionSriActual(Long idTipoCodigoRetencionSriActual) {
		this.idTipoCodigoRetencionSriActual = idTipoCodigoRetencionSriActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCodigoRetencionSri gettipocodigoretencionsri() {
		return this.tipocodigoretencionsri;
	}

	public void settipocodigoretencionsri(TipoCodigoRetencionSri tipocodigoretencionsri) {
		this.tipocodigoretencionsri = tipocodigoretencionsri;
	}
	
	public TipoCodigoRetencionSri gettipocodigoretencionsriAux() {
		return this.tipocodigoretencionsriAux;
	}

	public void settipocodigoretencionsriAux(TipoCodigoRetencionSri tipocodigoretencionsriAux) {
		this.tipocodigoretencionsriAux = tipocodigoretencionsriAux;
	}				
	
	public TipoCodigoRetencionSri gettipocodigoretencionsriAnterior() {
		return this.tipocodigoretencionsriAnterior;
	}

	public void settipocodigoretencionsriAnterior(TipoCodigoRetencionSri tipocodigoretencionsriAnterior) {
		this.tipocodigoretencionsriAnterior = tipocodigoretencionsriAnterior;
	}	
	
	public TipoCodigoRetencionSri gettipocodigoretencionsriTotales() {
		return this.tipocodigoretencionsriTotales;
	}

	public void settipocodigoretencionsriTotales(TipoCodigoRetencionSri tipocodigoretencionsriTotales) {
		this.tipocodigoretencionsriTotales = tipocodigoretencionsriTotales;
	}	
	
	public TipoCodigoRetencionSri gettipocodigoretencionsriBean() {
		return this.tipocodigoretencionsriBean;
	}

	public void settipocodigoretencionsriBean(TipoCodigoRetencionSri tipocodigoretencionsriBean) {
		this.tipocodigoretencionsriBean = tipocodigoretencionsriBean;
	}	
	
	public TipoCodigoRetencionSriParameterReturnGeneral gettipocodigoretencionsriReturnGeneral() {
		return this.tipocodigoretencionsriReturnGeneral;
	}

	public void settipocodigoretencionsriReturnGeneral(TipoCodigoRetencionSriParameterReturnGeneral tipocodigoretencionsriReturnGeneral) {
		this.tipocodigoretencionsriReturnGeneral = tipocodigoretencionsriReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCodigoRetencionSriLogic getTipoCodigoRetencionSriLogic()	{		
		return tipocodigoretencionsriLogic;
	}

	public void setTipoCodigoRetencionSriLogic(TipoCodigoRetencionSriLogic tipocodigoretencionsriLogic) {
		this.tipocodigoretencionsriLogic = tipocodigoretencionsriLogic;
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
	
	public Boolean getIsEsNuevoTipoCodigoRetencionSri() {
		return isEsNuevoTipoCodigoRetencionSri;
	}

	public void setIsEsNuevoTipoCodigoRetencionSri(Boolean isEsNuevoTipoCodigoRetencionSri) {
		this.isEsNuevoTipoCodigoRetencionSri = isEsNuevoTipoCodigoRetencionSri;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCodigoRetencionSri() {
		return esParaAccionDesdeFormularioTipoCodigoRetencionSri;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCodigoRetencionSri(Boolean esParaAccionDesdeFormularioTipoCodigoRetencionSri) {
		this.esParaAccionDesdeFormularioTipoCodigoRetencionSri = esParaAccionDesdeFormularioTipoCodigoRetencionSri;
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
	
	
	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.tipocodigoretencionsriSessionBean==null) {
				this.tipocodigoretencionsriSessionBean=new TipoCodigoRetencionSriSessionBean();
			}

			if(!this.tipocodigoretencionsriSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(tipocodigoretencionsriSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	
	
	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.tipocodigoretencionsri!=null) {
						this.tipocodigoretencionsri.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
						this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoCodigoRetencionSri.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
						if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri!=null) {
						jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri!=null) {
							//jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoCodigoRetencionSriGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisTipoCodigoRetencionSriGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoCodigoRetencionSriGenerico!=null && jComboBoxid_paisTipoCodigoRetencionSriGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoCodigoRetencionSriGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoCodigoRetencionSri tipocodigoretencionsri,JComboBox jComboBoxid_paisTipoCodigoRetencionSriGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoCodigoRetencionSriGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoCodigoRetencionSriGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipocodigoretencionsri.setid_pais(paisAux.getId());
				tipocodigoretencionsri.setpais_descripcion(TipoCodigoRetencionSriConstantesFunciones.getPaisDescripcion(paisAux));
				tipocodigoretencionsri.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { 
							this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { 
					}

					if(!TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.addItem(pais);
							}
						}

						if(!TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
							this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
							this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoCodigoRetencionSri() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCodigoRetencionSriConstantesFunciones.refrescarForeignKeysDescripcionesTipoCodigoRetencionSri(this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCodigoRetencionSriConstantesFunciones.refrescarForeignKeysDescripcionesTipoCodigoRetencionSri(this.tipocodigoretencionsris);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocodigoretencionsriLogic.setTipoCodigoRetencionSris(this.tipocodigoretencionsris);
			tipocodigoretencionsriLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCodigoRetencionSriParameterReturnGeneral getTipoCodigoRetencionSriParameterGeneral() {
		return this.tipocodigoretencionsriParameterGeneral;
	}
	
	public void setTipoCodigoRetencionSriParameterGeneral(TipoCodigoRetencionSriParameterReturnGeneral tipocodigoretencionsriParameterGeneral) {
		this.tipocodigoretencionsriParameterGeneral = tipocodigoretencionsriParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCodigoRetencionSri() {
		return isPermisoTodoTipoCodigoRetencionSri;
	}

	public void setIsPermisoTodoTipoCodigoRetencionSri(Boolean isPermisoTodoTipoCodigoRetencionSri) {
		this.isPermisoTodoTipoCodigoRetencionSri = isPermisoTodoTipoCodigoRetencionSri;
	}

	public Boolean getIsPermisoNuevoTipoCodigoRetencionSri() {
		return isPermisoNuevoTipoCodigoRetencionSri;
	}

	public void setIsPermisoNuevoTipoCodigoRetencionSri(Boolean isPermisoNuevoTipoCodigoRetencionSri) {
		this.isPermisoNuevoTipoCodigoRetencionSri = isPermisoNuevoTipoCodigoRetencionSri;
	}

	public Boolean getIsPermisoActualizarTipoCodigoRetencionSri() {
		return isPermisoActualizarTipoCodigoRetencionSri;
	}

	public void setIsPermisoActualizarTipoCodigoRetencionSri(Boolean isPermisoActualizarTipoCodigoRetencionSri) {
		this.isPermisoActualizarTipoCodigoRetencionSri = isPermisoActualizarTipoCodigoRetencionSri;
	}

	public Boolean getIsPermisoEliminarTipoCodigoRetencionSri() {
		return isPermisoEliminarTipoCodigoRetencionSri;
	}

	public void setIsPermisoEliminarTipoCodigoRetencionSri(Boolean isPermisoEliminarTipoCodigoRetencionSri) {
		this.isPermisoEliminarTipoCodigoRetencionSri = isPermisoEliminarTipoCodigoRetencionSri;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCodigoRetencionSri() {
		return isPermisoGuardarCambiosTipoCodigoRetencionSri;
	}

	public void setIsPermisoGuardarCambiosTipoCodigoRetencionSri(Boolean isPermisoGuardarCambiosTipoCodigoRetencionSri) {
		this.isPermisoGuardarCambiosTipoCodigoRetencionSri = isPermisoGuardarCambiosTipoCodigoRetencionSri;
	}
	
	public Boolean getIsPermisoConsultaTipoCodigoRetencionSri() {
		return isPermisoConsultaTipoCodigoRetencionSri;
	}

	public void setIsPermisoConsultaTipoCodigoRetencionSri(Boolean isPermisoConsultaTipoCodigoRetencionSri) {
		this.isPermisoConsultaTipoCodigoRetencionSri = isPermisoConsultaTipoCodigoRetencionSri;
	}

	public Boolean getIsPermisoBusquedaTipoCodigoRetencionSri() {
		return isPermisoBusquedaTipoCodigoRetencionSri;
	}

	public void setIsPermisoBusquedaTipoCodigoRetencionSri(Boolean isPermisoBusquedaTipoCodigoRetencionSri) {
		this.isPermisoBusquedaTipoCodigoRetencionSri = isPermisoBusquedaTipoCodigoRetencionSri;
	}

	public Boolean getIsPermisoReporteTipoCodigoRetencionSri() {
		return isPermisoReporteTipoCodigoRetencionSri;
	}

	public void setIsPermisoReporteTipoCodigoRetencionSri(Boolean isPermisoReporteTipoCodigoRetencionSri) {
		this.isPermisoReporteTipoCodigoRetencionSri = isPermisoReporteTipoCodigoRetencionSri;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCodigoRetencionSri() {
		return isPermisoPaginacionMedioTipoCodigoRetencionSri;
	}

	public void setIsPermisoPaginacionMedioTipoCodigoRetencionSri(Boolean isPermisoPaginacionMedioTipoCodigoRetencionSri) {
		this.isPermisoPaginacionMedioTipoCodigoRetencionSri = isPermisoPaginacionMedioTipoCodigoRetencionSri;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCodigoRetencionSri() {
		return isPermisoPaginacionTodoTipoCodigoRetencionSri;
	}

	public void setIsPermisoPaginacionTodoTipoCodigoRetencionSri(Boolean isPermisoPaginacionTodoTipoCodigoRetencionSri) {
		this.isPermisoPaginacionTodoTipoCodigoRetencionSri = isPermisoPaginacionTodoTipoCodigoRetencionSri;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCodigoRetencionSri() {
		return isPermisoPaginacionAltoTipoCodigoRetencionSri;
	}

	public void setIsPermisoPaginacionAltoTipoCodigoRetencionSri(Boolean isPermisoPaginacionAltoTipoCodigoRetencionSri) {
		this.isPermisoPaginacionAltoTipoCodigoRetencionSri = isPermisoPaginacionAltoTipoCodigoRetencionSri;
	}
	
	public Boolean getIsPermisoCopiarTipoCodigoRetencionSri() {
		return isPermisoCopiarTipoCodigoRetencionSri;
	}

	public void setIsPermisoCopiarTipoCodigoRetencionSri(Boolean isPermisoCopiarTipoCodigoRetencionSri) {
		this.isPermisoCopiarTipoCodigoRetencionSri = isPermisoCopiarTipoCodigoRetencionSri;
	}
	
	public Boolean getIsPermisoVerFormTipoCodigoRetencionSri() {
		return isPermisoVerFormTipoCodigoRetencionSri;
	}

	public void setIsPermisoVerFormTipoCodigoRetencionSri(Boolean isPermisoVerFormTipoCodigoRetencionSri) {
		this.isPermisoVerFormTipoCodigoRetencionSri = isPermisoVerFormTipoCodigoRetencionSri;
	}
	
	public Boolean getIsPermisoDuplicarTipoCodigoRetencionSri() {
		return isPermisoDuplicarTipoCodigoRetencionSri;
	}

	public void setIsPermisoDuplicarTipoCodigoRetencionSri(Boolean isPermisoDuplicarTipoCodigoRetencionSri) {
		this.isPermisoDuplicarTipoCodigoRetencionSri = isPermisoDuplicarTipoCodigoRetencionSri;
	}
	
	public Boolean getIsPermisoOrdenTipoCodigoRetencionSri() {
		return isPermisoOrdenTipoCodigoRetencionSri;
	}

	public void setIsPermisoOrdenTipoCodigoRetencionSri(Boolean isPermisoOrdenTipoCodigoRetencionSri) {
		this.isPermisoOrdenTipoCodigoRetencionSri = isPermisoOrdenTipoCodigoRetencionSri;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCodigoRetencionSri() {
		return isVisibilidadCeldaNuevoTipoCodigoRetencionSri;
	}

	public void setIsVisibilidadCeldaNuevoTipoCodigoRetencionSri(Boolean isVisibilidadCeldaNuevoTipoCodigoRetencionSri) {
		this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri = isVisibilidadCeldaNuevoTipoCodigoRetencionSri;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCodigoRetencionSri() {
		return isVisibilidadCeldaDuplicarTipoCodigoRetencionSri;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCodigoRetencionSri(Boolean isVisibilidadCeldaDuplicarTipoCodigoRetencionSri) {
		this.isVisibilidadCeldaDuplicarTipoCodigoRetencionSri = isVisibilidadCeldaDuplicarTipoCodigoRetencionSri;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCodigoRetencionSri() {
		return isVisibilidadCeldaCopiarTipoCodigoRetencionSri;
	}

	public void setIsVisibilidadCeldaCopiarTipoCodigoRetencionSri(Boolean isVisibilidadCeldaCopiarTipoCodigoRetencionSri) {
		this.isVisibilidadCeldaCopiarTipoCodigoRetencionSri = isVisibilidadCeldaCopiarTipoCodigoRetencionSri;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCodigoRetencionSri() {
		return isVisibilidadCeldaVerFormTipoCodigoRetencionSri;
	}

	public void setIsVisibilidadCeldaVerFormTipoCodigoRetencionSri(Boolean isVisibilidadCeldaVerFormTipoCodigoRetencionSri) {
		this.isVisibilidadCeldaVerFormTipoCodigoRetencionSri = isVisibilidadCeldaVerFormTipoCodigoRetencionSri;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCodigoRetencionSri() {
		return isVisibilidadCeldaOrdenTipoCodigoRetencionSri;
	}

	public void setIsVisibilidadCeldaOrdenTipoCodigoRetencionSri(Boolean isVisibilidadCeldaOrdenTipoCodigoRetencionSri) {
		this.isVisibilidadCeldaOrdenTipoCodigoRetencionSri = isVisibilidadCeldaOrdenTipoCodigoRetencionSri;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri() {
		return isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri(Boolean isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri = isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCodigoRetencionSri() {
		return isVisibilidadCeldaModificarTipoCodigoRetencionSri;
	}

	public void setIsVisibilidadCeldaModificarTipoCodigoRetencionSri(Boolean isVisibilidadCeldaModificarTipoCodigoRetencionSri) {
		this.isVisibilidadCeldaModificarTipoCodigoRetencionSri = isVisibilidadCeldaModificarTipoCodigoRetencionSri;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCodigoRetencionSri() {
		return isVisibilidadCeldaActualizarTipoCodigoRetencionSri;
	}

	public void setIsVisibilidadCeldaActualizarTipoCodigoRetencionSri(Boolean isVisibilidadCeldaActualizarTipoCodigoRetencionSri) {
		this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri = isVisibilidadCeldaActualizarTipoCodigoRetencionSri;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCodigoRetencionSri() {
		return isVisibilidadCeldaEliminarTipoCodigoRetencionSri;
	}

	public void setIsVisibilidadCeldaEliminarTipoCodigoRetencionSri(Boolean isVisibilidadCeldaEliminarTipoCodigoRetencionSri) {
		this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri = isVisibilidadCeldaEliminarTipoCodigoRetencionSri;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCodigoRetencionSri() {
		return isVisibilidadCeldaCancelarTipoCodigoRetencionSri;
	}

	public void setIsVisibilidadCeldaCancelarTipoCodigoRetencionSri(Boolean isVisibilidadCeldaCancelarTipoCodigoRetencionSri) {
		this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri = isVisibilidadCeldaCancelarTipoCodigoRetencionSri;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCodigoRetencionSri() {
		return isVisibilidadCeldaGuardarTipoCodigoRetencionSri;
	}

	public void setIsVisibilidadCeldaGuardarTipoCodigoRetencionSri(Boolean isVisibilidadCeldaGuardarTipoCodigoRetencionSri) {
		this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri = isVisibilidadCeldaGuardarTipoCodigoRetencionSri;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri() {
		return isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri(Boolean isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri) {
		this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri = isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri;
	}
		
	public TipoCodigoRetencionSriSessionBean gettipocodigoretencionsriSessionBean() {
		return this.tipocodigoretencionsriSessionBean;
	}
	
	public void settipocodigoretencionsriSessionBean(TipoCodigoRetencionSriSessionBean tipocodigoretencionsriSessionBean) {
		this.tipocodigoretencionsriSessionBean=tipocodigoretencionsriSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipocodigoretencionsri,null);
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
	
	public void bugActualizarReferenciaActual(TipoCodigoRetencionSri tipocodigoretencionsri,TipoCodigoRetencionSri tipocodigoretencionsriAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCodigoRetencionSri(tipocodigoretencionsri);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocodigoretencionsriAux.setId(tipocodigoretencionsri.getId());
		tipocodigoretencionsriAux.setVersionRow(tipocodigoretencionsri.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCodigoRetencionSri();
		
			int intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.tipocodigoretencionsri,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocodigoretencionsriValidator.getInvalidValues(this.tipocodigoretencionsri);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocodigoretencionsriLogic.setDatosCliente(datosCliente);
			tipocodigoretencionsriLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocodigoretencionsriAux=new  TipoCodigoRetencionSri();
				
				tipocodigoretencionsriAux.setIsNew(true);
				tipocodigoretencionsriAux.setIsChanged(true);
				
				tipocodigoretencionsriAux.setTipoCodigoRetencionSriOriginal(this.tipocodigoretencionsri);
				
				tipocodigoretencionsriAux.setId(this.tipocodigoretencionsri.getId());	
				tipocodigoretencionsriAux.setVersionRow(this.tipocodigoretencionsri.getVersionRow());	
				tipocodigoretencionsriAux.setid_pais(this.tipocodigoretencionsri.getid_pais());	
				tipocodigoretencionsriAux.setcodigo(this.tipocodigoretencionsri.getcodigo());	
				tipocodigoretencionsriAux.setnombre(this.tipocodigoretencionsri.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocodigoretencionsriAux,tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocodigoretencionsriAux,tipocodigoretencionsris);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigoretencionsriLogic.saveTipoCodigoRetencionSris();//WithConnection
						//tipocodigoretencionsriLogic.getSetVersionRowTipoCodigoRetencionSris();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocodigoretencionsri,tipocodigoretencionsriAux);
					
					this.refrescarForeignKeysDescripcionesTipoCodigoRetencionSri();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocodigoretencionsriAux=new  TipoCodigoRetencionSri();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado() && this.tipocodigoretencionsri.getId()>=0)) {
						
					tipocodigoretencionsriAux.setIsNew(false);
				}
				
				tipocodigoretencionsriAux.setIsDeleted(false);
			
				tipocodigoretencionsriAux.setId(this.tipocodigoretencionsri.getId());	
				tipocodigoretencionsriAux.setVersionRow(this.tipocodigoretencionsri.getVersionRow());	
				tipocodigoretencionsriAux.setid_pais(this.tipocodigoretencionsri.getid_pais());	
				tipocodigoretencionsriAux.setcodigo(this.tipocodigoretencionsri.getcodigo());	
				tipocodigoretencionsriAux.setnombre(this.tipocodigoretencionsri.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocodigoretencionsriAux,tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocodigoretencionsriAux,tipocodigoretencionsris);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigoretencionsriLogic.saveTipoCodigoRetencionSris();//WithConnection
						//tipocodigoretencionsriLogic.getSetVersionRowTipoCodigoRetencionSris();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocodigoretencionsri,tipocodigoretencionsriAux);
					
					this.refrescarForeignKeysDescripcionesTipoCodigoRetencionSri();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocodigoretencionsriAux=new  TipoCodigoRetencionSri();
				
				tipocodigoretencionsriAux.setIsNew(false);
				tipocodigoretencionsriAux.setIsChanged(false);
				
				tipocodigoretencionsriAux.setIsDeleted(true);
				
				tipocodigoretencionsriAux.setId(this.tipocodigoretencionsri.getId());	
				tipocodigoretencionsriAux.setVersionRow(this.tipocodigoretencionsri.getVersionRow());	
				tipocodigoretencionsriAux.setid_pais(this.tipocodigoretencionsri.getid_pais());	
				tipocodigoretencionsriAux.setcodigo(this.tipocodigoretencionsri.getcodigo());	
				tipocodigoretencionsriAux.setnombre(this.tipocodigoretencionsri.getnombre());	
				
				if(this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocodigoretencionsriAux.getId()>=0) {	
						this.tipocodigoretencionsrisEliminados.add(tipocodigoretencionsriAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocodigoretencionsriAux,tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocodigoretencionsriAux,tipocodigoretencionsris);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigoretencionsriLogic.saveTipoCodigoRetencionSris();//WithConnection
						//tipocodigoretencionsriLogic.getSetVersionRowTipoCodigoRetencionSris();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocodigoretencionsriAux,tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocodigoretencionsriAux,tipocodigoretencionsris);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().addAll(this.tipocodigoretencionsrisEliminados);
					
					tipocodigoretencionsriLogic.saveTipoCodigoRetencionSris();//WithConnection
					//tipocodigoretencionsriLogic.getSetVersionRowTipoCodigoRetencionSris();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoCodigoRetencionSri();
				
				this.tipocodigoretencionsrisEliminados= new ArrayList<TipoCodigoRetencionSri>();		
			}
			
			if(this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Codigo Retencion Sri GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Codigo Retencion Sri",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocodigoretencionsri=tipocodigoretencionsriAux;
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
      		//this.finishProcessTipoCodigoRetencionSri();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCodigoRetencionSri tipocodigoretencionsriLocal) throws Exception {
		
		if(this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCodigoRetencionSri tipocodigoretencionsriLocal) throws Exception {	
		if(this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipocodigoretencionsriLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoCodigoRetencionSriActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocodigoretencionsriValidator.getInvalidValues(this.tipocodigoretencionsri);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCodigoRetencionSri tipocodigoretencionsri,List<TipoCodigoRetencionSri> tipocodigoretencionsris) throws Exception {
		try	{		
			TipoCodigoRetencionSriConstantesFunciones.actualizarLista(tipocodigoretencionsri,tipocodigoretencionsris,this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCodigoRetencionSri tipocodigoretencionsri,List<TipoCodigoRetencionSri> tipocodigoretencionsris) throws Exception {
		try	{			
			TipoCodigoRetencionSriConstantesFunciones.actualizarSelectedLista(tipocodigoretencionsri,tipocodigoretencionsris);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCodigoRetencionSri> tipocodigoretencionsrisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocodigoretencionsrisLocal=this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocodigoretencionsrisLocal=this.tipocodigoretencionsris;
			}
			//ARCHITECTURE
		
			for(TipoCodigoRetencionSri tipocodigoretencionsriLocal:tipocodigoretencionsrisLocal) {
				if(this.permiteMantenimiento(tipocodigoretencionsriLocal) && tipocodigoretencionsriLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCodigoRetencionSriConstantesFunciones.getTipoCodigoRetencionSriLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCodigoRetencionSriConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelid_paisTipoCodigoRetencionSri,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCodigoRetencionSriConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelcodigoTipoCodigoRetencionSri,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCodigoRetencionSriConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelnombreTipoCodigoRetencionSri,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelid_paisTipoCodigoRetencionSri,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelcodigoTipoCodigoRetencionSri,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelnombreTipoCodigoRetencionSri,"");
		
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
		this.iIdNuevoTipoCodigoRetencionSri--;	
		
		
		this.tipocodigoretencionsriAux=new TipoCodigoRetencionSri();
		
		this.tipocodigoretencionsriAux.setId(this.iIdNuevoTipoCodigoRetencionSri);
		this.tipocodigoretencionsriAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().add(this.tipocodigoretencionsriAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocodigoretencionsris.add(this.tipocodigoretencionsriAux);
		}
		//ARCHITECTURE
		
		this.tipocodigoretencionsri=this.tipocodigoretencionsriAux;
		
		if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCodigoRetencionSri(this.tipocodigoretencionsri);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCodigoRetencionSri(this.tipocodigoretencionsri);
		}
				
		//this.setDefaultControlesTipoCodigoRetencionSri();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCodigoRetencionSri();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCodigoRetencionSri();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCodigoRetencionSri();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCodigoRetencionSri(this.tipocodigoretencionsriBean,this.tipocodigoretencionsri,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
			classes=TipoCodigoRetencionSriConstantesFunciones.getClassesRelationshipsOfTipoCodigoRetencionSri(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocodigoretencionsriReturnGeneral=tipocodigoretencionsriLogic.procesarEventosTipoCodigoRetencionSrisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris(),this.tipocodigoretencionsri,this.tipocodigoretencionsriParameterGeneral,this.isEsNuevoTipoCodigoRetencionSri,classes);//this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSri()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCodigoRetencionSri(this.tipocodigoretencionsriReturnGeneral,this.tipocodigoretencionsriBean,false);
		
		if(this.tipocodigoretencionsriReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCodigoRetencionSri(this.tipocodigoretencionsriReturnGeneral.getTipoCodigoRetencionSri());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCodigoRetencionSri(this.tipocodigoretencionsriReturnGeneral.getTipoCodigoRetencionSri());
		}
		
		if(this.tipocodigoretencionsriReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCodigoRetencionSri(this.tipocodigoretencionsriReturnGeneral.getTipoCodigoRetencionSri(),classes);//this.tipocodigoretencionsriBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.tipocodigoretencionsri,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCodigoRetencionSri();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCodigoRetencionSri();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false);
						
			if(tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCodigoRetencionSri();
			}
			
			this.actualizarVisualTableDatosTipoCodigoRetencionSri();
			
			this.jTableDatosTipoCodigoRetencionSri.setRowSelectionInterval(this.getIndiceNuevoTipoCodigoRetencionSri(), this.getIndiceNuevoTipoCodigoRetencionSri());
			
			this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
						
			this.actualizarEstadoCeldasBotonesTipoCodigoRetencionSri("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCodigoRetencionSri(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextFieldcodigoTipoCodigoRetencionSri.setEnabled(isHabilitar && this.tipocodigoretencionsriConstantesFunciones.activarcodigoTipoCodigoRetencionSri);
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextAreanombreTipoCodigoRetencionSri.setEnabled(isHabilitar && this.tipocodigoretencionsriConstantesFunciones.activarnombreTipoCodigoRetencionSri);	
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.setEnabled(isHabilitar && this.tipocodigoretencionsriConstantesFunciones.activarid_paisTipoCodigoRetencionSri);
	};
	
	public void setDefaultControlesTipoCodigoRetencionSri() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCodigoRetencionSri(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocodigoretencionsriSessionBean.setConGuardarRelaciones(true);			
			this.tipocodigoretencionsriSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTabbedPaneRelacionesTipoCodigoRetencionSri.setVisible(true);
			
					
		} else {
			//this.tipocodigoretencionsriSessionBean.setConGuardarRelaciones(false);			
			this.tipocodigoretencionsriSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTabbedPaneRelacionesTipoCodigoRetencionSri.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoCodigoRetencionSri() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()) {
				if(tipocodigoretencionsriAux.getId().equals(this.iIdNuevoTipoCodigoRetencionSri)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsris) {
				if(tipocodigoretencionsriAux.getId().equals(this.iIdNuevoTipoCodigoRetencionSri)) {
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
	
	public int getIndiceActualTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()) {
				if(tipocodigoretencionsriAux.getId().equals(tipocodigoretencionsri.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsris) {
				if(tipocodigoretencionsriAux.getId().equals(tipocodigoretencionsri.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsriOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()) {
				if(tipocodigoretencionsriAux.getTipoCodigoRetencionSriOriginal().getId().equals(tipocodigoretencionsriOriginal.getId())) {
					existe=true;
					tipocodigoretencionsriOriginal.setId(tipocodigoretencionsriAux.getId());
					tipocodigoretencionsriOriginal.setVersionRow(tipocodigoretencionsriAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsris) {
				if(tipocodigoretencionsriAux.getTipoCodigoRetencionSriOriginal().getId().equals(tipocodigoretencionsriOriginal.getId())) {
					existe=true;
					tipocodigoretencionsriOriginal.setId(tipocodigoretencionsriAux.getId());
					tipocodigoretencionsriOriginal.setVersionRow(tipocodigoretencionsriAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCodigoRetencionSri(Boolean esParaCancelar) throws Exception {
		tipocodigoretencionsrisAux=new ArrayList<TipoCodigoRetencionSri>();
		tipocodigoretencionsriAux=new TipoCodigoRetencionSri();
		
		if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()) {
					if(tipocodigoretencionsriAux.getId()<0) {
						tipocodigoretencionsrisAux.add(tipocodigoretencionsriAux);
					}		
				}
				this.iIdNuevoTipoCodigoRetencionSri=0L;
				this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().removeAll(tipocodigoretencionsrisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsris) {
					if(tipocodigoretencionsriAux.getId()<0) {
						tipocodigoretencionsrisAux.add(tipocodigoretencionsriAux);
					}		
				}
				this.iIdNuevoTipoCodigoRetencionSri=0L;
				this.tipocodigoretencionsris.removeAll(tipocodigoretencionsrisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCodigoRetencionSri 
					&& this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().size()>0
					) {
					tipocodigoretencionsriAux=this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().get(this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().size() - 1);
				
					if(tipocodigoretencionsriAux.getId()<0) {
						this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().remove(tipocodigoretencionsriAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCodigoRetencionSri && this.tipocodigoretencionsris.size()>0) {
					tipocodigoretencionsriAux=this.tipocodigoretencionsris.get(this.tipocodigoretencionsris.size() - 1);
				
					if(tipocodigoretencionsriAux.getId()<0) {
						this.tipocodigoretencionsris.remove(tipocodigoretencionsriAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCodigoRetencionSri(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocodigoretencionsri.getId()<0) {
				this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().remove(this.tipocodigoretencionsri);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocodigoretencionsri.getId()<0) {
				this.tipocodigoretencionsris.remove(this.tipocodigoretencionsri);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCodigoRetencionSri(List<TipoCodigoRetencionSri> tipocodigoretencionsrisAux) throws Exception {
		TipoCodigoRetencionSriConstantesFunciones.setEstadosInicialesTipoCodigoRetencionSri(tipocodigoretencionsrisAux);
	}
	
	public void setEstadosInicialesTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsriAux) throws Exception {
		TipoCodigoRetencionSriConstantesFunciones.setEstadosInicialesTipoCodigoRetencionSri(tipocodigoretencionsriAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCodigoRetencionSriActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCodigoRetencionSri("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCodigoRetencionSriActual()) {
				if(!this.isEsNuevoTipoCodigoRetencionSri) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCodigoRetencionSri("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCodigoRetencionSri=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCodigoRetencionSriActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Codigo Retencion Sri ?", "MANTENIMIENTO DE Tipo Codigo Retencion Sri", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCodigoRetencionSri("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCodigoRetencionSri tipocodigoretencionsri) throws Exception {
		TipoCodigoRetencionSriConstantesFunciones.seleccionarAsignar(this.tipocodigoretencionsri,tipocodigoretencionsri);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCodigoRetencionSri=this.isPermisoActualizarOriginalTipoCodigoRetencionSri;
			
			
			this.seleccionarAsignar(tipocodigoretencionsri);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCodigoRetencionSriConstantesFunciones.quitarEspaciosTipoCodigoRetencionSri(this.tipocodigoretencionsri,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCodigoRetencionSri("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocodigoretencionsriSessionBean.setsFuncionBusquedaRapida(this.tipocodigoretencionsriSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCodigoRetencionSri) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCodigoRetencionSri(esParaCancelar);				
				this.cancelarNuevoTipoCodigoRetencionSri(esParaCancelar);								
			}
			
			this.tipocodigoretencionsri=new TipoCodigoRetencionSri();
			
			this.inicializarTipoCodigoRetencionSri();
			
			this.actualizarEstadoCeldasBotonesTipoCodigoRetencionSri("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCodigoRetencionSri() throws Exception {
		try {
			TipoCodigoRetencionSriConstantesFunciones.inicializarTipoCodigoRetencionSri(this.tipocodigoretencionsri);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCodigoRetencionSris(String sAccionBusqueda,List<TipoCodigoRetencionSri> tipocodigoretencionsrisParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCodigoRetencionSri"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCodigoRetencionSriMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCodigoRetencionSriMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCodigoRetencionSri"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Codigo Retencion Sris");		
		parameters.put("busquedapor", TipoCodigoRetencionSriConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCodigoRetencionSri=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCodigoRetencionSriConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCodigoRetencionSriConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCodigoRetencionSri=new JRBeanArrayDataSource(TipoCodigoRetencionSriJInternalFrame.TraerTipoCodigoRetencionSriBeans(tipocodigoretencionsrisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCodigoRetencionSri);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCodigoRetencionSriConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCodigoRetencionSriConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCodigoRetencionSriBean.TraerTipoCodigoRetencionSriBeans(tipocodigoretencionsrisParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCodigoRetencionSris(sAccionBusqueda,sTipoArchivoReporte,tipocodigoretencionsrisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCodigoRetencionSris(sAccionBusqueda,sTipoArchivoReporte,tipocodigoretencionsrisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCodigoRetencionSriActionPerformed(null);
					//this.generarExcelReporteTipoCodigoRetencionSris(sAccionBusqueda,sTipoArchivoReporte,tipocodigoretencionsrisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCodigoRetencionSris(sAccionBusqueda,sTipoArchivoReporte,tipocodigoretencionsrisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCodigoRetencionSris(sAccionBusqueda,sTipoArchivoReporte,tipocodigoretencionsrisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCodigoRetencionSris(sAccionBusqueda,sTipoArchivoReporte,tipocodigoretencionsrisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCodigoRetencionSris(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCodigoRetencionSri> tipocodigoretencionsrisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigoretencionsri";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCodigoRetencionSris");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCodigoRetencionSri("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCodigoRetencionSri tipocodigoretencionsri : tipocodigoretencionsrisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCodigoRetencionSriConstantesFunciones.generarExcelReporteDataTipoCodigoRetencionSri("NORMAL",row,workbook,tipocodigoretencionsri,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Codigo Retencion Sri",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCodigoRetencionSri(String sTipo,Row row,Workbook workbook) {
		
		TipoCodigoRetencionSriConstantesFunciones.generarExcelReporteHeaderTipoCodigoRetencionSri(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCodigoRetencionSris(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCodigoRetencionSri> tipocodigoretencionsrisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigoretencionsri_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCodigoRetencionSris");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCodigoRetencionSri tipocodigoretencionsri : tipocodigoretencionsrisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.getTipoCodigoRetencionSriDescripcion(tipocodigoretencionsri));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocodigoretencionsri.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocodigoretencionsri.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocodigoretencionsri.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Codigo Retencion Sri",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCodigoRetencionSris(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCodigoRetencionSri> tipocodigoretencionsrisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCodigoRetencionSri> tipocodigoretencionsrisRespaldo=null;
		
		classes=TipoCodigoRetencionSriConstantesFunciones.getClassesRelationshipsOfTipoCodigoRetencionSri(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocodigoretencionsriLogic.setDatosCliente(this.datosCliente);
		this.tipocodigoretencionsriLogic.setDatosDeep(this.datosDeep);
		this.tipocodigoretencionsriLogic.setIsConDeep(true);
		
		tipocodigoretencionsrisRespaldo=this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris();
		
		this.tipocodigoretencionsriLogic.setTipoCodigoRetencionSris(tipocodigoretencionsrisParaReportes);	
		this.tipocodigoretencionsriLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocodigoretencionsrisParaReportes=this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris();
		this.tipocodigoretencionsriLogic.setTipoCodigoRetencionSris(tipocodigoretencionsrisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigoretencionsri_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCodigoRetencionSris");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCodigoRetencionSri("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCodigoRetencionSri tipocodigoretencionsri : tipocodigoretencionsrisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCodigoRetencionSri("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCodigoRetencionSriConstantesFunciones.generarExcelReporteDataTipoCodigoRetencionSri("NORMAL",row,workbook,tipocodigoretencionsri,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.getTipoCodigoRetencionSriDescripcion(tipocodigoretencionsri));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Codigo Retencion Sri",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCodigoRetencionSri() throws Exception {		
		this.startProcessTipoCodigoRetencionSri(true);
	}
	
	public void startProcessTipoCodigoRetencionSri(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCodigoRetencionSri ,this.jPanelParametrosReportesTipoCodigoRetencionSri, this.jScrollPanelDatosTipoCodigoRetencionSri,this.jPanelPaginacionTipoCodigoRetencionSri, this.jScrollPanelDatosEdicionTipoCodigoRetencionSri, this.jPanelAccionesTipoCodigoRetencionSri,this.jPanelAccionesFormularioTipoCodigoRetencionSri,this.jmenuBarTipoCodigoRetencionSri,this.jmenuBarDetalleTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,this.jTtoolBarDetalleTipoCodigoRetencionSri);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCodigoRetencionSri=this.jTabbedPaneBusquedasTipoCodigoRetencionSri; 
		
		final JPanel jPanelParametrosReportesTipoCodigoRetencionSri=this.jPanelParametrosReportesTipoCodigoRetencionSri;
		//final JScrollPane jScrollPanelDatosTipoCodigoRetencionSri=this.jScrollPanelDatosTipoCodigoRetencionSri;
		final JTable jTableDatosTipoCodigoRetencionSri=this.jTableDatosTipoCodigoRetencionSri;		
		final JPanel jPanelPaginacionTipoCodigoRetencionSri=this.jPanelPaginacionTipoCodigoRetencionSri;
		//final JScrollPane jScrollPanelDatosEdicionTipoCodigoRetencionSri=this.jScrollPanelDatosEdicionTipoCodigoRetencionSri;
		final JPanel jPanelAccionesTipoCodigoRetencionSri=this.jPanelAccionesTipoCodigoRetencionSri;
		
		JPanel jPanelCamposAuxiliarTipoCodigoRetencionSri=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCodigoRetencionSri=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			jPanelCamposAuxiliarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jPanelCamposTipoCodigoRetencionSri;
			jPanelAccionesFormularioAuxiliarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jPanelAccionesFormularioTipoCodigoRetencionSri;
		}
		
		final JPanel jPanelCamposTipoCodigoRetencionSri=jPanelCamposAuxiliarTipoCodigoRetencionSri;
		final JPanel jPanelAccionesFormularioTipoCodigoRetencionSri=jPanelAccionesFormularioAuxiliarTipoCodigoRetencionSri;
		
		
		final JMenuBar jmenuBarTipoCodigoRetencionSri=this.jmenuBarTipoCodigoRetencionSri;
		final JToolBar jTtoolBarTipoCodigoRetencionSri=this.jTtoolBarTipoCodigoRetencionSri;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCodigoRetencionSri=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCodigoRetencionSri=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			jmenuBarDetalleAuxiliarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jmenuBarDetalleTipoCodigoRetencionSri;
			jTtoolBarDetalleAuxiliarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTtoolBarDetalleTipoCodigoRetencionSri;
		}
		
		final JMenuBar jmenuBarDetalleTipoCodigoRetencionSri=jmenuBarDetalleAuxiliarTipoCodigoRetencionSri;
		final JToolBar jTtoolBarDetalleTipoCodigoRetencionSri=jTtoolBarDetalleAuxiliarTipoCodigoRetencionSri;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCodigoRetencionSri;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCodigoRetencionSri;
			processRunnable.jTableDatos=jTableDatosTipoCodigoRetencionSri;
			processRunnable.jPanelCampos=jPanelCamposTipoCodigoRetencionSri;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCodigoRetencionSri;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCodigoRetencionSri;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCodigoRetencionSri;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCodigoRetencionSri;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCodigoRetencionSri;
			processRunnable.jTtoolBar=jTtoolBarTipoCodigoRetencionSri;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCodigoRetencionSri;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCodigoRetencionSri ,jPanelParametrosReportesTipoCodigoRetencionSri,jTableDatosTipoCodigoRetencionSri, /*jScrollPanelDatosTipoCodigoRetencionSri,*/jPanelCamposTipoCodigoRetencionSri,jPanelPaginacionTipoCodigoRetencionSri, /*jScrollPanelDatosEdicionTipoCodigoRetencionSri,*/ jPanelAccionesTipoCodigoRetencionSri,jPanelAccionesFormularioTipoCodigoRetencionSri,jmenuBarTipoCodigoRetencionSri,jmenuBarDetalleTipoCodigoRetencionSri,jTtoolBarTipoCodigoRetencionSri,jTtoolBarDetalleTipoCodigoRetencionSri);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCodigoRetencionSri ,jPanelParametrosReportesTipoCodigoRetencionSri, jScrollPanelDatosTipoCodigoRetencionSri,jPanelPaginacionTipoCodigoRetencionSri, jScrollPanelDatosEdicionTipoCodigoRetencionSri, jPanelAccionesTipoCodigoRetencionSri,jPanelAccionesFormularioTipoCodigoRetencionSri,jmenuBarTipoCodigoRetencionSri,jmenuBarDetalleTipoCodigoRetencionSri,jTtoolBarTipoCodigoRetencionSri,jTtoolBarDetalleTipoCodigoRetencionSri);
						
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
	
	public void finishProcessTipoCodigoRetencionSri() {// throws Exception 
		this.finishProcessTipoCodigoRetencionSri(true);
	}
	
	public void finishProcessTipoCodigoRetencionSri(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCodigoRetencionSri ,this.jPanelParametrosReportesTipoCodigoRetencionSri, this.jScrollPanelDatosTipoCodigoRetencionSri,this.jPanelPaginacionTipoCodigoRetencionSri, this.jScrollPanelDatosEdicionTipoCodigoRetencionSri, this.jPanelAccionesTipoCodigoRetencionSri,this.jPanelAccionesFormularioTipoCodigoRetencionSri,this.jmenuBarTipoCodigoRetencionSri,this.jmenuBarDetalleTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,this.jTtoolBarDetalleTipoCodigoRetencionSri);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCodigoRetencionSri=this.jTabbedPaneBusquedasTipoCodigoRetencionSri; 
		
		final JPanel jPanelParametrosReportesTipoCodigoRetencionSri=this.jPanelParametrosReportesTipoCodigoRetencionSri;
		//final JScrollPane jScrollPanelDatosTipoCodigoRetencionSri=this.jScrollPanelDatosTipoCodigoRetencionSri;
		final JTable jTableDatosTipoCodigoRetencionSri=this.jTableDatosTipoCodigoRetencionSri;		
		final JPanel jPanelPaginacionTipoCodigoRetencionSri=this.jPanelPaginacionTipoCodigoRetencionSri;
		//final JScrollPane jScrollPanelDatosEdicionTipoCodigoRetencionSri=this.jScrollPanelDatosEdicionTipoCodigoRetencionSri;
		final JPanel jPanelAccionesTipoCodigoRetencionSri=this.jPanelAccionesTipoCodigoRetencionSri;
		
		JPanel jPanelCamposAuxiliarTipoCodigoRetencionSri=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCodigoRetencionSri=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			jPanelCamposAuxiliarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jPanelCamposTipoCodigoRetencionSri;
			jPanelAccionesFormularioAuxiliarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jPanelAccionesFormularioTipoCodigoRetencionSri;
		}
		
		final JPanel jPanelCamposTipoCodigoRetencionSri=jPanelCamposAuxiliarTipoCodigoRetencionSri;
		final JPanel jPanelAccionesFormularioTipoCodigoRetencionSri=jPanelAccionesFormularioAuxiliarTipoCodigoRetencionSri;
		
		
		final JMenuBar jmenuBarTipoCodigoRetencionSri=this.jmenuBarTipoCodigoRetencionSri;		
		final JToolBar jTtoolBarTipoCodigoRetencionSri=this.jTtoolBarTipoCodigoRetencionSri;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCodigoRetencionSri=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCodigoRetencionSri=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			jmenuBarDetalleAuxiliarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jmenuBarDetalleTipoCodigoRetencionSri;
			jTtoolBarDetalleAuxiliarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTtoolBarDetalleTipoCodigoRetencionSri;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCodigoRetencionSri=jmenuBarDetalleAuxiliarTipoCodigoRetencionSri;
		final JToolBar jTtoolBarDetalleTipoCodigoRetencionSri=jTtoolBarDetalleAuxiliarTipoCodigoRetencionSri;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCodigoRetencionSri;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCodigoRetencionSri;
			processRunnable.jTableDatos=jTableDatosTipoCodigoRetencionSri;
			processRunnable.jPanelCampos=jPanelCamposTipoCodigoRetencionSri;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCodigoRetencionSri;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCodigoRetencionSri;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCodigoRetencionSri;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCodigoRetencionSri;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCodigoRetencionSri;
			processRunnable.jTtoolBar=jTtoolBarTipoCodigoRetencionSri;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCodigoRetencionSri;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCodigoRetencionSri ,jPanelParametrosReportesTipoCodigoRetencionSri, jTableDatosTipoCodigoRetencionSri,/*jScrollPanelDatosTipoCodigoRetencionSri,*/jPanelCamposTipoCodigoRetencionSri,jPanelPaginacionTipoCodigoRetencionSri, /*jScrollPanelDatosEdicionTipoCodigoRetencionSri,*/ jPanelAccionesTipoCodigoRetencionSri,jPanelAccionesFormularioTipoCodigoRetencionSri,jmenuBarTipoCodigoRetencionSri,jmenuBarDetalleTipoCodigoRetencionSri,jTtoolBarTipoCodigoRetencionSri,jTtoolBarDetalleTipoCodigoRetencionSri));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCodigoRetencionSri(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCodigoRetencionSri(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCodigoRetencionSri(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCodigoRetencionSri(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCodigoRetencionSri,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCodigoRetencionSri,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCodigoRetencionSri(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCodigoRetencionSri,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCodigoRetencionSri,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocodigoretencionsriConstantesFunciones.getsFinalQueryTipoCodigoRetencionSri();
		String  finalQueryPaginacionTodos=this.tipocodigoretencionsriConstantesFunciones.getsFinalQueryTipoCodigoRetencionSri();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCodigoRetencionSriConstantesFunciones.getArrayColumnasGlobalesNoTipoCodigoRetencionSri(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCodigoRetencionSriConstantesFunciones.getArrayColumnasGlobalesTipoCodigoRetencionSri(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCodigoRetencionSriConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocodigoretencionsrisEliminados= new ArrayList<TipoCodigoRetencionSri>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCodigoRetencionSri();
		
				///*TipoCodigoRetencionSriSessionBean*/this.tipocodigoretencionsriSessionBean=new TipoCodigoRetencionSriSessionBean();
			
			if(this.tipocodigoretencionsriSessionBean==null) {
				this.tipocodigoretencionsriSessionBean=new TipoCodigoRetencionSriSessionBean();
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
					this.iNumeroPaginacion=TipoCodigoRetencionSriConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCodigoRetencionSriConstantesFunciones.getClassesForeignKeysOfTipoCodigoRetencionSri(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocodigoretencionsri."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocodigoretencionsrisAux= new ArrayList<TipoCodigoRetencionSri>();
			
				
			tipocodigoretencionsriLogic.setDatosCliente(this.datosCliente);
			tipocodigoretencionsriLogic.setDatosDeep(this.datosDeep);
			tipocodigoretencionsriLogic.setIsConDeep(true);
			
			
			tipocodigoretencionsriLogic.getTipoCodigoRetencionSriDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocodigoretencionsriLogic.getTodosTipoCodigoRetencionSris(finalQueryGlobal,pagination);
					
					//tipocodigoretencionsriLogic.getTodosTipoCodigoRetencionSrisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()==null|| tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocodigoretencionsrisAux= new ArrayList<TipoCodigoRetencionSri>();
							tipocodigoretencionsrisAux.addAll(tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocodigoretencionsrisAux= new ArrayList<TipoCodigoRetencionSri>();
							tipocodigoretencionsrisAux.addAll(tipocodigoretencionsris);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocodigoretencionsriLogic.getTodosTipoCodigoRetencionSris(finalQueryGlobal+"",this.pagination);												
							
							//tipocodigoretencionsriLogic.getTodosTipoCodigoRetencionSrisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCodigoRetencionSris("Todos",tipocodigoretencionsriLogic.getTipoCodigoRetencionSris() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocodigoretencionsriLogic.setTipoCodigoRetencionSris(new ArrayList<TipoCodigoRetencionSri>());					
							tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().addAll(tipocodigoretencionsrisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocodigoretencionsris=new ArrayList<TipoCodigoRetencionSri>();
							tipocodigoretencionsris.addAll(tipocodigoretencionsrisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCodigoRetencionSri=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCodigoRetencionSri=this.idActual;
				
				} else if(this.idTipoCodigoRetencionSriActual!=null && this.idTipoCodigoRetencionSriActual!=0L) {
					idTipoCodigoRetencionSri=idTipoCodigoRetencionSriActual;
				}
				
					
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndicePorId(idTipoCodigoRetencionSri);
				
				this.tipocodigoretencionsris=new ArrayList<TipoCodigoRetencionSri>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocodigoretencionsriLogic.getEntity(idTipoCodigoRetencionSri);
					
					//tipocodigoretencionsriLogic.getEntityWithConnection(idTipoCodigoRetencionSri);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocodigoretencionsriLogic.setTipoCodigoRetencionSris(new ArrayList<TipoCodigoRetencionSri>());
					tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().add(tipocodigoretencionsriLogic.getTipoCodigoRetencionSri());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocodigoretencionsris=new ArrayList<TipoCodigoRetencionSri>();
					this.tipocodigoretencionsris.add(tipocodigoretencionsri);
				}
				
				if(tipocodigoretencionsriLogic.getTipoCodigoRetencionSri()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocodigoretencionsriLogic.getTipoCodigoRetencionSrisBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()==null||tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocodigoretencionsris==null|| tipocodigoretencionsris.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigoretencionsrisAux=new ArrayList<TipoCodigoRetencionSri>();
						tipocodigoretencionsrisAux.addAll(tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocodigoretencionsrisAux=new ArrayList<TipoCodigoRetencionSri>();
							tipocodigoretencionsrisAux.addAll(tipocodigoretencionsris);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocodigoretencionsriLogic.getTipoCodigoRetencionSrisBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCodigoRetencionSris("BusquedaPorCodigo",tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCodigoRetencionSris("BusquedaPorCodigo",tipocodigoretencionsris);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigoretencionsriLogic.setTipoCodigoRetencionSris(new ArrayList<TipoCodigoRetencionSri>());
						tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().addAll(tipocodigoretencionsrisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocodigoretencionsris=new ArrayList<TipoCodigoRetencionSri>();
							tipocodigoretencionsris.addAll(tipocodigoretencionsrisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocodigoretencionsriLogic.getTipoCodigoRetencionSrisBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()==null||tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocodigoretencionsris==null|| tipocodigoretencionsris.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigoretencionsrisAux=new ArrayList<TipoCodigoRetencionSri>();
						tipocodigoretencionsrisAux.addAll(tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocodigoretencionsrisAux=new ArrayList<TipoCodigoRetencionSri>();
							tipocodigoretencionsrisAux.addAll(tipocodigoretencionsris);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocodigoretencionsriLogic.getTipoCodigoRetencionSrisBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCodigoRetencionSris("BusquedaPorNombre",tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCodigoRetencionSris("BusquedaPorNombre",tipocodigoretencionsris);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigoretencionsriLogic.setTipoCodigoRetencionSris(new ArrayList<TipoCodigoRetencionSri>());
						tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().addAll(tipocodigoretencionsrisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocodigoretencionsris=new ArrayList<TipoCodigoRetencionSri>();
							tipocodigoretencionsris.addAll(tipocodigoretencionsrisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocodigoretencionsriLogic.getTipoCodigoRetencionSrisFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()==null||tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocodigoretencionsris==null|| tipocodigoretencionsris.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigoretencionsrisAux=new ArrayList<TipoCodigoRetencionSri>();
						tipocodigoretencionsrisAux.addAll(tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocodigoretencionsrisAux=new ArrayList<TipoCodigoRetencionSri>();
							tipocodigoretencionsrisAux.addAll(tipocodigoretencionsris);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocodigoretencionsriLogic.getTipoCodigoRetencionSrisFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCodigoRetencionSriConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCodigoRetencionSris("FK_IdPais",tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCodigoRetencionSris("FK_IdPais",tipocodigoretencionsris);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigoretencionsriLogic.setTipoCodigoRetencionSris(new ArrayList<TipoCodigoRetencionSri>());
						tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().addAll(tipocodigoretencionsrisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocodigoretencionsris=new ArrayList<TipoCodigoRetencionSri>();
							tipocodigoretencionsris.addAll(tipocodigoretencionsrisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCodigoRetencionSri();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCodigoRetencionSri();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocodigoretencionsris.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocodigoretencionsris.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCodigoRetencionSri tipocodigoretencionsri) {
		Boolean permite=true;
		
		if(this.tipocodigoretencionsri.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCodigoRetencionSriConstantesFunciones.getOrderByListaTipoCodigoRetencionSri();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCodigoRetencionSriConstantesFunciones.getOrderByListaTipoCodigoRetencionSri();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCodigoRetencionSri tipocodigoretencionsri:tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()) {
				if(tipocodigoretencionsri.getsType().equals(Constantes2.S_TOTALES)) {
					tipocodigoretencionsriTotales=tipocodigoretencionsri;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCodigoRetencionSri tipocodigoretencionsri:this.tipocodigoretencionsris) {
				if(tipocodigoretencionsri.getsType().equals(Constantes2.S_TOTALES)) {
					tipocodigoretencionsriTotales=tipocodigoretencionsri;
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
			this.tipocodigoretencionsriAux=new TipoCodigoRetencionSri();
			this.tipocodigoretencionsriAux.setsType(Constantes2.S_TOTALES);
			this.tipocodigoretencionsriAux.setIsNew(false);
			this.tipocodigoretencionsriAux.setIsChanged(false);
			this.tipocodigoretencionsriAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCodigoRetencionSriConstantesFunciones.TotalizarValoresFilaTipoCodigoRetencionSri(this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris(),this.tipocodigoretencionsriAux);
				
				this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().add(this.tipocodigoretencionsriAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCodigoRetencionSriConstantesFunciones.TotalizarValoresFilaTipoCodigoRetencionSri(this.tipocodigoretencionsris,this.tipocodigoretencionsriAux);
				
				this.tipocodigoretencionsris.add(this.tipocodigoretencionsriAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocodigoretencionsriTotales=new TipoCodigoRetencionSri();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().remove(tipocodigoretencionsriTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocodigoretencionsris.remove(tipocodigoretencionsriTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocodigoretencionsriTotales=new TipoCodigoRetencionSri();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCodigoRetencionSri tipocodigoretencionsri:tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()) {
				if(tipocodigoretencionsri.getsType().equals(Constantes2.S_TOTALES)) {
					tipocodigoretencionsriTotales=tipocodigoretencionsri;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCodigoRetencionSriConstantesFunciones.TotalizarValoresFilaTipoCodigoRetencionSri(this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris(),tipocodigoretencionsriTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCodigoRetencionSri tipocodigoretencionsri:this.tipocodigoretencionsris) {
				if(tipocodigoretencionsri.getsType().equals(Constantes2.S_TOTALES)) {
					tipocodigoretencionsriTotales=tipocodigoretencionsri;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCodigoRetencionSriConstantesFunciones.TotalizarValoresFilaTipoCodigoRetencionSri(this.tipocodigoretencionsris,tipocodigoretencionsriTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoCodigoRetencionSrisBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoCodigoRetencionSrisBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoCodigoRetencionSrisFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoCodigoRetencionSrisBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocodigoretencionsriLogic.getTipoCodigoRetencionSrisBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoCodigoRetencionSrisBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocodigoretencionsriLogic.getTipoCodigoRetencionSrisBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoCodigoRetencionSrisFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocodigoretencionsriLogic.getTipoCodigoRetencionSrisFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
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
	
	public void inicializarPermisosTipoCodigoRetencionSri() {
		this.isPermisoTodoTipoCodigoRetencionSri=false;
		this.isPermisoNuevoTipoCodigoRetencionSri=false;
		this.isPermisoActualizarTipoCodigoRetencionSri=false;
		this.isPermisoActualizarOriginalTipoCodigoRetencionSri=false;
		this.isPermisoEliminarTipoCodigoRetencionSri=false;
		this.isPermisoGuardarCambiosTipoCodigoRetencionSri=false;
		this.isPermisoConsultaTipoCodigoRetencionSri=false;
		this.isPermisoBusquedaTipoCodigoRetencionSri=false;
		this.isPermisoReporteTipoCodigoRetencionSri=false;		
		this.isPermisoOrdenTipoCodigoRetencionSri=false;		
		this.isPermisoPaginacionMedioTipoCodigoRetencionSri=false;		
		this.isPermisoPaginacionAltoTipoCodigoRetencionSri=false;
		this.isPermisoPaginacionTodoTipoCodigoRetencionSri=false;
		this.isPermisoCopiarTipoCodigoRetencionSri=false;		
		this.isPermisoVerFormTipoCodigoRetencionSri=false;		
		this.isPermisoDuplicarTipoCodigoRetencionSri=false;		
		this.isPermisoOrdenTipoCodigoRetencionSri=false;		
	}
	
	public void setPermisosUsuarioTipoCodigoRetencionSri(Boolean isPermiso) {
		this.isPermisoTodoTipoCodigoRetencionSri=isPermiso;
		this.isPermisoNuevoTipoCodigoRetencionSri=isPermiso;
		this.isPermisoActualizarTipoCodigoRetencionSri=isPermiso;
		this.isPermisoActualizarOriginalTipoCodigoRetencionSri=isPermiso;
		this.isPermisoEliminarTipoCodigoRetencionSri=isPermiso;
		this.isPermisoGuardarCambiosTipoCodigoRetencionSri=isPermiso;
		this.isPermisoConsultaTipoCodigoRetencionSri=isPermiso;
		this.isPermisoBusquedaTipoCodigoRetencionSri=isPermiso;
		this.isPermisoReporteTipoCodigoRetencionSri=isPermiso;
		this.isPermisoOrdenTipoCodigoRetencionSri=isPermiso;		
		this.isPermisoPaginacionMedioTipoCodigoRetencionSri=isPermiso;		
		this.isPermisoPaginacionAltoTipoCodigoRetencionSri=isPermiso;		
		this.isPermisoPaginacionTodoTipoCodigoRetencionSri=isPermiso;		
		this.isPermisoCopiarTipoCodigoRetencionSri=isPermiso;		
		this.isPermisoVerFormTipoCodigoRetencionSri=isPermiso;		
		this.isPermisoDuplicarTipoCodigoRetencionSri=isPermiso;
		this.isPermisoOrdenTipoCodigoRetencionSri=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCodigoRetencionSri(Boolean isPermiso) {
		//this.isPermisoTodoTipoCodigoRetencionSri=isPermiso;
		this.isPermisoNuevoTipoCodigoRetencionSri=isPermiso;
		this.isPermisoActualizarTipoCodigoRetencionSri=isPermiso;
		this.isPermisoActualizarOriginalTipoCodigoRetencionSri=isPermiso;
		this.isPermisoEliminarTipoCodigoRetencionSri=isPermiso;
		this.isPermisoGuardarCambiosTipoCodigoRetencionSri=isPermiso;
		//this.isPermisoConsultaTipoCodigoRetencionSri=isPermiso;
		//this.isPermisoBusquedaTipoCodigoRetencionSri=isPermiso;
		//this.isPermisoReporteTipoCodigoRetencionSri=isPermiso;
		//this.isPermisoOrdenTipoCodigoRetencionSri=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCodigoRetencionSri=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCodigoRetencionSri=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCodigoRetencionSri=isPermiso;		
		//this.isPermisoCopiarTipoCodigoRetencionSri=isPermiso;		
		//this.isPermisoDuplicarTipoCodigoRetencionSri=isPermiso;
		//this.isPermisoOrdenTipoCodigoRetencionSri=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCodigoRetencionSriClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoCodigoRetencionSriJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCodigoRetencionSri(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCodigoRetencionSriClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCodigoRetencionSriClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCodigoRetencionSriClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCodigoRetencionSriClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoCodigoRetencionSri() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCodigoRetencionSriJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCodigoRetencionSriConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCodigoRetencionSri=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCodigoRetencionSri=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCodigoRetencionSri=this.isPermisoActualizarTipoCodigoRetencionSri;
			this.isPermisoEliminarTipoCodigoRetencionSri=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCodigoRetencionSri=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCodigoRetencionSri=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCodigoRetencionSri=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCodigoRetencionSri=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCodigoRetencionSri=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCodigoRetencionSri=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCodigoRetencionSri=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCodigoRetencionSri=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCodigoRetencionSri=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCodigoRetencionSri=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCodigoRetencionSri=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCodigoRetencionSri=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCodigoRetencionSri=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCodigoRetencionSri.setToolTipText(this.jTableDatosTipoCodigoRetencionSri.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCodigoRetencionSri(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCodigoRetencionSri(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCodigoRetencionSriJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCodigoRetencionSriJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCodigoRetencionSri() throws Exception {
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
	public void inicializarCombosForeignKeyTipoCodigoRetencionSriListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCodigoRetencionSriListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCodigoRetencionSriJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCodigoRetencionSriListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoCodigoRetencionSriListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoCodigoRetencionSriParameterReturnGeneral tipocodigoretencionsriReturnGeneral=new TipoCodigoRetencionSriParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipocodigoretencionsriConstantesFunciones.cargarid_paisTipoCodigoRetencionSri)
					 || (this.esRecargarFks && this.tipocodigoretencionsriConstantesFunciones.cargarid_paisTipoCodigoRetencionSri)) {

					if(!this.tipocodigoretencionsriSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipocodigoretencionsriSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocodigoretencionsriReturnGeneral=tipocodigoretencionsriLogic.cargarCombosLoteForeignKeyTipoCodigoRetencionSri(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipocodigoretencionsriReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCodigoRetencionSri()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipocodigoretencionsriSessionBean==null) {
				this.tipocodigoretencionsriSessionBean=new TipoCodigoRetencionSriSessionBean();
			}

			if(!this.tipocodigoretencionsriSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoCodigoRetencionSri()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCodigoRetencionSri(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCodigoRetencionSri()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCodigoRetencionSri();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipocodigoretencionsri.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCodigoRetencionSri()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipocodigoretencionsriConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCodigoRetencionSri()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCodigoRetencionSri()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCodigoRetencionSri()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCodigoRetencionSri()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCodigoRetencionSri()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCodigoRetencionSri(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCodigoRetencionSri()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri!=null && this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoCodigoRetencionSriBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCodigoRetencionSriBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCodigoRetencionSriBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocodigoretencionsriSessionBean=new TipoCodigoRetencionSriSessionBean(); 
		this.tipocodigoretencionsriConstantesFunciones=new TipoCodigoRetencionSriConstantesFunciones(); 
		this.tipocodigoretencionsriBean=new TipoCodigoRetencionSri();//(this.tipocodigoretencionsriConstantesFunciones); 		
		this.tipocodigoretencionsriReturnGeneral=new TipoCodigoRetencionSriParameterReturnGeneral(); 
		
		this.tipocodigoretencionsriSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocodigoretencionsriSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCodigoRetencionSriBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCodigoRetencionSriBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCodigoRetencionSriBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCodigoRetencionSri(true);
			
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
			
			this.tipocodigoretencionsriConstantesFunciones=new TipoCodigoRetencionSriConstantesFunciones(); 
			this.tipocodigoretencionsriBean=new TipoCodigoRetencionSri();//this.tipocodigoretencionsriConstantesFunciones); 			
			this.tipocodigoretencionsriReturnGeneral=new TipoCodigoRetencionSriParameterReturnGeneral(); 
		
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Codigo Retencion Sri Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocodigoretencionsri=new TipoCodigoRetencionSri();
			this.tipocodigoretencionsris = new ArrayList<TipoCodigoRetencionSri>();
			this.tipocodigoretencionsrisAux = new ArrayList<TipoCodigoRetencionSri>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic=new TipoCodigoRetencionSriLogic();
				this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocodigoretencionsriSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocodigoretencionsriSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCodigoRetencionSri);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri);	
					}
					
					if(this.jInternalFrameImportacionTipoCodigoRetencionSri!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCodigoRetencionSri);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCodigoRetencionSri!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCodigoRetencionSri);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCodigoRetencionSri);
				this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setVisible(false);
				this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri);
					this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCodigoRetencionSri!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCodigoRetencionSri);
					this.jInternalFrameImportacionTipoCodigoRetencionSri.setVisible(false);
					this.jInternalFrameImportacionTipoCodigoRetencionSri.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCodigoRetencionSri!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCodigoRetencionSri);
					this.jInternalFrameOrderByTipoCodigoRetencionSri.setVisible(false);
					this.jInternalFrameOrderByTipoCodigoRetencionSri.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCodigoRetencionSriActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCodigoRetencionSriConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocodigoretencionsriReturnGeneral=new TipoCodigoRetencionSriParameterReturnGeneral();
			
			this.tipocodigoretencionsriParameterGeneral=new TipoCodigoRetencionSriParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocodigoretencionsriLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCodigoRetencionSriJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCodigoRetencionSriConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado(),this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCodigoRetencionSriConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado(),this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaDuplicarTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaCopiarTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaVerFormTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaOrdenTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaModificarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCodigoRetencionSri("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCodigoRetencionSri();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCodigoRetencionSri(false);
			
			this.setPermisosUsuarioTipoCodigoRetencionSri();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado() && this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCodigoRetencionSriClasesRelacionadas();
			}
			
			if(this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCodigoRetencionSriClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCodigoRetencionSri();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCodigoRetencionSri();
			}
			
			if(!this.isPermisoBusquedaTipoCodigoRetencionSri) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCodigoRetencionSri,this.isPermisoPaginacionMedioTipoCodigoRetencionSri,this.isPermisoPaginacionTodoTipoCodigoRetencionSri);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCodigoRetencionSriConstantesFunciones.getTiposSeleccionarTipoCodigoRetencionSri());
				
				this.tiposColumnasSelect=TipoCodigoRetencionSriConstantesFunciones.getTiposSeleccionarTipoCodigoRetencionSri(true);
				
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
			//if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCodigoRetencionSri();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoCodigoRetencionSri(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoCodigoRetencionSri(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCodigoRetencionSri() ;
			
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
			
			this.paisLogic=new PaisLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipocodigoretencionsriImplementable= (TipoCodigoRetencionSriImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCodigoRetencionSriConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocodigoretencionsriImplementableHome= (TipoCodigoRetencionSriImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCodigoRetencionSriConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocodigoretencionsris= new ArrayList<TipoCodigoRetencionSri>();
			this.tipocodigoretencionsrisEliminados= new ArrayList<TipoCodigoRetencionSri>();
						
			this.isEsNuevoTipoCodigoRetencionSri=false;
			this.esParaAccionDesdeFormularioTipoCodigoRetencionSri=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCodigoRetencionSri(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCodigoRetencionSri();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCodigoRetencionSriConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCodigoRetencionSri("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCodigoRetencionSri(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCodigoRetencionSri();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCodigoRetencionSri();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCodigoRetencionSri(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCodigoRetencionSri: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCodigoRetencionSri() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCodigoRetencionSri")) {
				iIndex=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTabbedPaneRelacionesTipoCodigoRetencionSri.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTabbedPaneRelacionesTipoCodigoRetencionSri.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCodigoRetencionSri();	
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
	
	public void cargarCombosForeignKeyTipoCodigoRetencionSri(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCodigoRetencionSri(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCodigoRetencionSri(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCodigoRetencionSriListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCodigoRetencionSri();
		
		this.cargarCombosFrameForeignKeyTipoCodigoRetencionSri();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCodigoRetencionSri();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCodigoRetencionSri();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoCodigoRetencionSriActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			
			
			if(jTableDatosTipoCodigoRetencionSri.getRowCount()>=1) {
				jTableDatosTipoCodigoRetencionSri.removeRowSelectionInterval(0, jTableDatosTipoCodigoRetencionSri.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCodigoRetencionSri=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCodigoRetencionSri(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCodigoRetencionSri(true);			
			//this.tipocodigoretencionsri=new TipoCodigoRetencionSri();
			//this.tipocodigoretencionsri.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCodigoRetencionSri(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCodigoRetencionSri() ;
			
			if(TipoCodigoRetencionSriJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCodigoRetencionSri(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocodigoretencionsri);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);				
			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			
			if(this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCodigoRetencionSri: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCodigoRetencionSriActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCodigoRetencionSri.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCodigoRetencionSri.getSelectedRows().length;			
			}
			
			tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCodigoRetencionSri--;			
				//TipoCodigoRetencionSri tipocodigoretencionsriAux= new TipoCodigoRetencionSri();			
				//tipocodigoretencionsriAux.setId(this.iIdNuevoTipoCodigoRetencionSri);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCodigoRetencionSri tipocodigoretencionsriOrigen=new TipoCodigoRetencionSri();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCodigoRetencionSri tipocodigoretencionsriOrigen : tipocodigoretencionsrisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocodigoretencionsriOrigen =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocodigoretencionsriOrigen =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCodigoRetencionSri();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocodigoretencionsri.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCodigoRetencionSri(tipocodigoretencionsriOrigen,this.tipocodigoretencionsri,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().add(this.tipocodigoretencionsriAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocodigoretencionsris.add(this.tipocodigoretencionsriAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
				
				this.jTableDatosTipoCodigoRetencionSri.setRowSelectionInterval(this.getIndiceNuevoTipoCodigoRetencionSri(), this.getIndiceNuevoTipoCodigoRetencionSri());
				
				int iLastRow =  this.jTableDatosTipoCodigoRetencionSri.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCodigoRetencionSri.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCodigoRetencionSri.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();									
		
			TipoCodigoRetencionSri tipocodigoretencionsriOrigen=new TipoCodigoRetencionSri();
			TipoCodigoRetencionSri tipocodigoretencionsriDestino=new TipoCodigoRetencionSri();
				
			tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCodigoRetencionSri.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocodigoretencionsrisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCodigoRetencionSri.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigoretencionsriOrigen =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocodigoretencionsriOrigen =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocodigoretencionsriDestino =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocodigoretencionsriDestino =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocodigoretencionsriOrigen =tipocodigoretencionsrisSeleccionados.get(0);
				tipocodigoretencionsriDestino =tipocodigoretencionsrisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCodigoRetencionSri(tipocodigoretencionsriOrigen,tipocodigoretencionsriDestino,true,false);
				
				tipocodigoretencionsriDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocodigoretencionsriDestino,tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocodigoretencionsriDestino,tipocodigoretencionsris);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
				
				//this.jTableDatosTipoCodigoRetencionSri.setRowSelectionInterval(this.getIndiceNuevoTipoCodigoRetencionSri(), this.getIndiceNuevoTipoCodigoRetencionSri());
				
				int iLastRow =  this.jTableDatosTipoCodigoRetencionSri.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCodigoRetencionSri.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCodigoRetencionSri.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCodigoRetencionSri.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCodigoRetencionSri.setVisible(!isVisible);
			this.jPanelPaginacionTipoCodigoRetencionSri.setVisible(!isVisible);
			this.jPanelAccionesTipoCodigoRetencionSri.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCodigoRetencionSri();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCodigoRetencionSri();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCodigoRetencionSri();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCodigoRetencionSri();
			
			this.abrirFrameOrderByTipoCodigoRetencionSri();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCodigoRetencionSri();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCodigoRetencionSri(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCodigoRetencionSri);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setSize(this.jInternalFrameDetalleFormTipoCodigoRetencionSri.iWidthFormulario,this.jInternalFrameDetalleFormTipoCodigoRetencionSri.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCodigoRetencionSri.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCodigoRetencionSri.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jContentPaneDetalleTipoCodigoRetencionSri.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTabbedPaneRelacionesTipoCodigoRetencionSri.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jContentPaneDetalleTipoCodigoRetencionSri.getWidth(),TipoCodigoRetencionSriConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTabbedPaneRelacionesTipoCodigoRetencionSri.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jContentPaneDetalleTipoCodigoRetencionSri.getWidth(),TipoCodigoRetencionSriConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTabbedPaneRelacionesTipoCodigoRetencionSri.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jContentPaneDetalleTipoCodigoRetencionSri.getWidth(),TipoCodigoRetencionSriConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCodigoRetencionSri() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCodigoRetencionSri==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCodigoRetencionSri=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCodigoRetencionSri,false,this);
				} else {
					this.jInternalFrameOrderByTipoCodigoRetencionSri=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCodigoRetencionSri,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCodigoRetencionSri);
				this.jInternalFrameOrderByTipoCodigoRetencionSri.setVisible(false);
				this.jInternalFrameOrderByTipoCodigoRetencionSri.setSelected(false);
				
				this.jInternalFrameOrderByTipoCodigoRetencionSri.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCodigoRetencionSri"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCodigoRetencionSri();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCodigoRetencionSri() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCodigoRetencionSri==null) {
				
				this.jInternalFrameImportacionTipoCodigoRetencionSri=new ImportacionJInternalFrame(TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCodigoRetencionSri);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCodigoRetencionSri);
				this.jInternalFrameImportacionTipoCodigoRetencionSri.setVisible(false);
				this.jInternalFrameImportacionTipoCodigoRetencionSri.setSelected(false);


				this.jInternalFrameImportacionTipoCodigoRetencionSri.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCodigoRetencionSri"));
				this.jInternalFrameImportacionTipoCodigoRetencionSri.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCodigoRetencionSri"));
				this.jInternalFrameImportacionTipoCodigoRetencionSri.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCodigoRetencionSri"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCodigoRetencionSri() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri==null) {
				this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri=new ReporteDinamicoJInternalFrame(TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri);
				this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCodigoRetencionSri"));
				this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCodigoRetencionSri"));
				this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCodigoRetencionSri"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCodigoRetencionSri();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoCodigoRetencionSri() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCodigoRetencionSri);
			
	       	this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCodigoRetencionSri.dispose();
			//this.jInternalFrameDetalleFormTipoCodigoRetencionSri=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCodigoRetencionSri() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCodigoRetencionSri() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCodigoRetencionSri.setVisible(true);
	        this.jInternalFrameImportacionTipoCodigoRetencionSri.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCodigoRetencionSri() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCodigoRetencionSri.setVisible(true);
	        this.jInternalFrameOrderByTipoCodigoRetencionSri.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCodigoRetencionSri() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCodigoRetencionSri.setVisible(false);
	        this.jInternalFrameOrderByTipoCodigoRetencionSri.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCodigoRetencionSri() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCodigoRetencionSri() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCodigoRetencionSri.setVisible(false);
	        this.jInternalFrameImportacionTipoCodigoRetencionSri.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCodigoRetencionSri(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCodigoRetencionSri(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCodigoRetencionSri(true);
			//this.isEsNuevoTipoCodigoRetencionSri=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCodigoRetencionSri("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCodigoRetencionSri(false) ;
			
			if(tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoCodigoRetencionSriJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCodigoRetencionSri(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCodigoRetencionSri(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCodigoRetencionSriActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCodigoRetencionSri(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCodigoRetencionSri(true);
			//this.isEsNuevoTipoCodigoRetencionSri=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocodigoretencionsri.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCodigoRetencionSri("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCodigoRetencionSri(false) ;
			
			if(TipoCodigoRetencionSriJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCodigoRetencionSri(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCodigoRetencionSri(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoRetencionSri,TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCodigoRetencionSri(false);
			
			//if(!this.isEsNuevoTipoCodigoRetencionSri) {								
				int intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.tipocodigoretencionsri,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
				
			}
			
			if(this.permiteMantenimiento(this.tipocodigoretencionsri)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCodigoRetencionSri=true;
					this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
					this.isEsNuevoTipoCodigoRetencionSri=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCodigoRetencionSri=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCodigoRetencionSri=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCodigoRetencionSri(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCodigoRetencionSri(false);
				
				this.habilitarDeshabilitarControlesTipoCodigoRetencionSri(false);
			
												
				
				if(TipoCodigoRetencionSriJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCodigoRetencionSri();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,tipocodigoretencionsriSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCodigoRetencionSri(this.tipocodigoretencionsri,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCodigoRetencionSri.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocodigoretencionsriSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocodigoretencionsri.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCodigoRetencionSri.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoRetencionSri.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				this.tipocodigoretencionsri.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				this.tipocodigoretencionsri.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocodigoretencionsri)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCodigoRetencionSriModel) this.jTableDatosTipoCodigoRetencionSri.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCodigoRetencionSri=true;
				this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
				this.isEsNuevoTipoCodigoRetencionSri=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCodigoRetencionSri(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCodigoRetencionSri(false);
				
				this.habilitarDeshabilitarControlesTipoCodigoRetencionSri(false);
				
				
				
				if(TipoCodigoRetencionSriJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCodigoRetencionSri();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCodigoRetencionSri.getRowCount()>=1) {
				jTableDatosTipoCodigoRetencionSri.removeRowSelectionInterval(0, jTableDatosTipoCodigoRetencionSri.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCodigoRetencionSri(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCodigoRetencionSri(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCodigoRetencionSri(false) ;
			
			this.isEsNuevoTipoCodigoRetencionSri=false;
			
			if(TipoCodigoRetencionSriJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCodigoRetencionSri();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCodigoRetencionSri(false);
				
				//SI ES MANUAL
				if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCodigoRetencionSri();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCodigoRetencionSri--;			
			//TipoCodigoRetencionSri tipocodigoretencionsriAux= new TipoCodigoRetencionSri();			
			//tipocodigoretencionsriAux.setId(this.iIdNuevoTipoCodigoRetencionSri);
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCodigoRetencionSri();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
			
			this.tipocodigoretencionsri.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().add(this.tipocodigoretencionsriAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocodigoretencionsris.add(this.tipocodigoretencionsriAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
			
			this.jTableDatosTipoCodigoRetencionSri.setRowSelectionInterval(this.getIndiceNuevoTipoCodigoRetencionSri(), this.getIndiceNuevoTipoCodigoRetencionSri());
			
			int iLastRow =  this.jTableDatosTipoCodigoRetencionSri.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCodigoRetencionSri.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCodigoRetencionSri.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false);
			
			//SI ES MANUAL
			if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCodigoRetencionSri();
			}
			
			//this.abrirFrameTreeTipoCodigoRetencionSri();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Codigo Retencion SriS ?", "MANTENIMIENTO DE Tipo Codigo Retencion Sri", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCodigoRetencionSri.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCodigoRetencionSri();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocodigoretencionsriReturnGeneral=tipocodigoretencionsriLogic.procesarImportacionTipoCodigoRetencionSrisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocodigoretencionsriParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCodigoRetencionSriReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCodigoRetencionSri.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCodigoRetencionSri.setFileImportacion(this.jInternalFrameImportacionTipoCodigoRetencionSri.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCodigoRetencionSri.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCodigoRetencionSri.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCodigoRetencionSri.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCodigoRetencionSri.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();		

		tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCodigoRetencionSriBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCodigoRetencionSriBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCodigoRetencionSris("Todos",tipocodigoretencionsrisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Codigo Retencion Sri",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();		
		
		tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigoretencionsri";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCodigoRetencionSris");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoCodigoRetencionSri tipocodigoretencionsri:tipocodigoretencionsrisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocodigoretencionsri.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCodigoRetencionSri tipocodigoretencionsri:tipocodigoretencionsrisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocodigoretencionsri.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCodigoRetencionSri tipocodigoretencionsri:tipocodigoretencionsrisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocodigoretencionsri.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCodigoRetencionSri(row);				
			//	iRow++;
			//}				
			
			//for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsrisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCodigoRetencionSri(tipocodigoretencionsriAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Codigo Retencion Sri",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false);
			
			//SI ES MANUAL
			if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCodigoRetencionSri();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false);
			
			//SI ES MANUAL
			if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCodigoRetencionSri();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false);
			
			//SI ES MANUAL
			if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCodigoRetencionSri();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCodigoRetencionSri() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCodigoRetencionSri.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCodigoRetencionSri.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCodigoRetencionSri.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCodigoRetencionSri.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCodigoRetencionSri.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCodigoRetencionSri.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCodigoRetencionSri.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCodigoRetencionSri(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCodigoRetencionSri(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCodigoRetencionSri(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCodigoRetencionSri(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCodigoRetencionSri(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCodigoRetencionSri(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCodigoRetencionSri(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCodigoRetencionSri() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCodigoRetencionSri();
		
		this.inicializarActualizarBindingBotonesManualTipoCodigoRetencionSri(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCodigoRetencionSri();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCodigoRetencionSri() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCodigoRetencionSri(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCodigoRetencionSri(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCodigoRetencionSri.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCodigoRetencionSri.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jCheckBoxPostAccionNuevoTipoCodigoRetencionSri.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jCheckBoxPostAccionSinCerrarTipoCodigoRetencionSri.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jCheckBoxPostAccionSinMensajeTipoCodigoRetencionSri.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCodigoRetencionSri.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCodigoRetencionSri.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
				this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jCheckBoxPostAccionNuevoTipoCodigoRetencionSri.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jCheckBoxPostAccionSinCerrarTipoCodigoRetencionSri.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jCheckBoxPostAccionSinMensajeTipoCodigoRetencionSri.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCodigoRetencionSri.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCodigoRetencionSri.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCodigoRetencionSri.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCodigoRetencionSri.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCodigoRetencionSri.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCodigoRetencionSri.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCodigoRetencionSri.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCodigoRetencionSri(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCodigoRetencionSri(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCodigoRetencionSri() throws Exception {
		try	{
			if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCodigoRetencionSri();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCodigoRetencionSri() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCodigoRetencionSri() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCodigoRetencionSri.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCodigoRetencionSri.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCodigoRetencionSri.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCodigoRetencionSri.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCodigoRetencionSri.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCodigoRetencionSri.addItem(reporte);
			}
			
			
			if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCodigoRetencionSri.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCodigoRetencionSri.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCodigoRetencionSri.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCodigoRetencionSri.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCodigoRetencionSri.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCodigoRetencionSri.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCodigoRetencionSri();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCodigoRetencionSri() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri!=null) {
				this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri!=null) {
				this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCodigoRetencionSri()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoCodigoRetencionSri.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoCodigoRetencionSri.getText();
		if(this.jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCodigoRetencionSri(Boolean esInicializar) throws Exception {				
		if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCodigoRetencionSri();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCodigoRetencionSri() throws Exception {
		this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCodigoRetencionSri() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCodigoRetencionSriPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCodigoRetencionSriPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCodigoRetencionSriOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoRetencionSriOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCodigoRetencionSriPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCodigoRetencionSriPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCodigoRetencionSri(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocodigoretencionsris.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCodigoRetencionSri.setModel(new TipoCodigoRetencionSriModel(this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCodigoRetencionSri.setModel(new TipoCodigoRetencionSriModel(this.tipocodigoretencionsris,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCodigoRetencionSri!=null && this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCodigoRetencionSri();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoRetencionSri,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCodigoRetencionSriPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO,tipocodigoretencionsriConstantesFunciones.resaltarSeleccionarTipoCodigoRetencionSri,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO,tipocodigoretencionsriConstantesFunciones.resaltarSeleccionarTipoCodigoRetencionSri,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoRetencionSri,TipoCodigoRetencionSriConstantesFunciones.LABEL_ID));

		if(this.tipocodigoretencionsriConstantesFunciones.mostraridTipoCodigoRetencionSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCodigoRetencionSriConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocodigoretencionsriConstantesFunciones.resaltaridTipoCodigoRetencionSri,this.tipocodigoretencionsriConstantesFunciones.activaridTipoCodigoRetencionSri,this,true,"idTipoCodigoRetencionSri","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocodigoretencionsriConstantesFunciones.resaltaridTipoCodigoRetencionSri,this.tipocodigoretencionsriConstantesFunciones.activaridTipoCodigoRetencionSri,this,true,"idTipoCodigoRetencionSri","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoRetencionSri,TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS));

		if(this.tipocodigoretencionsriConstantesFunciones.mostrarid_paisTipoCodigoRetencionSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipocodigoretencionsriConstantesFunciones.resaltarid_paisTipoCodigoRetencionSri,this,this.tipocodigoretencionsriConstantesFunciones.activarid_paisTipoCodigoRetencionSri));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipocodigoretencionsriConstantesFunciones.resaltarid_paisTipoCodigoRetencionSri,this,this.tipocodigoretencionsriConstantesFunciones.activarid_paisTipoCodigoRetencionSri,true,"id_paisTipoCodigoRetencionSri","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCodigoRetencionSriPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoRetencionSri,TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO));

		if(this.tipocodigoretencionsriConstantesFunciones.mostrarcodigoTipoCodigoRetencionSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocodigoretencionsriConstantesFunciones.resaltarcodigoTipoCodigoRetencionSri,this.tipocodigoretencionsriConstantesFunciones.activarcodigoTipoCodigoRetencionSri,this,true,"codigoTipoCodigoRetencionSri","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocodigoretencionsriConstantesFunciones.resaltarcodigoTipoCodigoRetencionSri,this.tipocodigoretencionsriConstantesFunciones.activarcodigoTipoCodigoRetencionSri,this,true,"codigoTipoCodigoRetencionSri","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCodigoRetencionSriPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoRetencionSri,TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocodigoretencionsriConstantesFunciones.mostrarnombreTipoCodigoRetencionSri && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocodigoretencionsriConstantesFunciones.resaltarnombreTipoCodigoRetencionSri,this.tipocodigoretencionsriConstantesFunciones.activarnombreTipoCodigoRetencionSri,this,true,"nombreTipoCodigoRetencionSri","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocodigoretencionsriConstantesFunciones.resaltarnombreTipoCodigoRetencionSri,this.tipocodigoretencionsriConstantesFunciones.activarnombreTipoCodigoRetencionSri,this,true,"nombreTipoCodigoRetencionSri","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCodigoRetencionSriPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCodigoRetencionSri.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCodigoRetencionSri.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCodigoRetencionSri.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCodigoRetencionSri.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCodigoRetencionSri.moveColumn(this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCodigoRetencionSri.moveColumn(this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCodigoRetencionSri.moveColumn(this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCodigoRetencionSri.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCodigoRetencionSri.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCodigoRetencionSri,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCodigoRetencionSri.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCodigoRetencionSri.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCodigoRetencionSri.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocodigoretencionsris.size()-1;
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
		//this.jTableDatosTipoCodigoRetencionSri.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCodigoRetencionSri();
			
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
				
				//this.isEsNuevoTipoCodigoRetencionSri=false;
					
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			
				if(this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCodigoRetencionSri.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocodigoretencionsri.getsType().equals("DUPLICADO")
				   || this.tipocodigoretencionsri.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCodigoRetencionSri=true;
				
				} else {
					this.isEsNuevoTipoCodigoRetencionSri=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocodigoretencionsri.getId()>=0 && !this.tipocodigoretencionsri.getIsNew()) {						
						this.isEsNuevoTipoCodigoRetencionSri=false;
						
					} else {
						this.isEsNuevoTipoCodigoRetencionSri=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCodigoRetencionSri(esRelaciones);						
				
				this.seleccionarTipoCodigoRetencionSri(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocodigoretencionsri.getId()<0) {
					this.isEsNuevoTipoCodigoRetencionSri=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCodigoRetencionSri(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCodigoRetencionSri(evt,rowIndex);
				}	
				
				if(this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCodigoRetencionSri: " + this.dDif); 
					}
				}								
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCodigoRetencionSri(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocodigoretencionsri)) {
					if(this.tipocodigoretencionsri.getId()>0) {
						this.tipocodigoretencionsri.setIsDeleted(true);
						
						this.tipocodigoretencionsrisEliminados.add(this.tipocodigoretencionsri);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().remove(this.tipocodigoretencionsri);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocodigoretencionsris.remove(this.tipocodigoretencionsri);				
					}
					
					
					((TipoCodigoRetencionSriModel) this.jTableDatosTipoCodigoRetencionSri.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCodigoRetencionSri(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCodigoRetencionSri) {
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCodigoRetencionSri.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCodigoRetencionSri(this.tipocodigoretencionsri);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipocodigoretencionsriConstantesFunciones.cargarid_paisTipoCodigoRetencionSri || this.tipocodigoretencionsriConstantesFunciones.event_dependid_paisTipoCodigoRetencionSri) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipocodigoretencionsri.getid_pais());
									//this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipocodigoretencionsri.getPais()!=null) {
							this.paissForeignKey.add(tipocodigoretencionsri.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipocodigoretencionsri.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCodigoRetencionSri("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCodigoRetencionSri(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCodigoRetencionSri() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCodigoRetencionSri(tipocodigoretencionsri,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCodigoRetencionSri(tipocodigoretencionsri);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCodigoRetencionSri(tipocodigoretencionsri,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCodigoRetencionSri(tipocodigoretencionsri);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelidTipoCodigoRetencionSri.setText(tipocodigoretencionsri.getId().toString());
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextFieldcodigoTipoCodigoRetencionSri.setText(tipocodigoretencionsri.getcodigo());
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextAreanombreTipoCodigoRetencionSri.setText(tipocodigoretencionsri.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCodigoRetencionSri tipocodigoretencionsriLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocodigoretencionsriLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCodigoRetencionSri tipocodigoretencionsriLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocodigoretencionsriLocal=this.tipocodigoretencionsri;
			} else {
				tipocodigoretencionsriLocal=this.tipocodigoretencionsriAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocodigoretencionsriLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCodigoRetencionSri(tipocodigoretencionsriLocal,true);
					
					if(tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocodigoretencionsriLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocodigoretencionsriLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(tipocodigoretencionsri,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(tipocodigoretencionsri);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(tipocodigoretencionsri,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelidTipoCodigoRetencionSri.getText()==null || this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelidTipoCodigoRetencionSri.getText()=="" || this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelidTipoCodigoRetencionSri.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelidTipoCodigoRetencionSri.setText("0");
			}

			if(conColumnasBase) {tipocodigoretencionsri.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelidTipoCodigoRetencionSri.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCodigoRetencionSriConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelIdTipoCodigoRetencionSri,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocodigoretencionsri.setcodigo(this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextFieldcodigoTipoCodigoRetencionSri.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelcodigoTipoCodigoRetencionSri,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocodigoretencionsri.setnombre(this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextAreanombreTipoCodigoRetencionSri.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelnombreTipoCodigoRetencionSri,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsriBean,TipoCodigoRetencionSri tipocodigoretencionsri,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipocodigoretencionsriBean.getid_pais()!=null && !tipocodigoretencionsriBean.getid_pais().equals(-1L))) {tipocodigoretencionsri.setid_pais(tipocodigoretencionsriBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsriOrigen,TipoCodigoRetencionSri tipocodigoretencionsri,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocodigoretencionsriOrigen.getId()!=null && !tipocodigoretencionsriOrigen.getId().equals(0L))) {tipocodigoretencionsri.setId(tipocodigoretencionsriOrigen.getId());}}
			if(conDefault || (!conDefault && tipocodigoretencionsriOrigen.getid_pais()!=null && !tipocodigoretencionsriOrigen.getid_pais().equals(-1L))) {tipocodigoretencionsri.setid_pais(tipocodigoretencionsriOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipocodigoretencionsriOrigen.getcodigo()!=null && !tipocodigoretencionsriOrigen.getcodigo().equals(""))) {tipocodigoretencionsri.setcodigo(tipocodigoretencionsriOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocodigoretencionsriOrigen.getnombre()!=null && !tipocodigoretencionsriOrigen.getnombre().equals(""))) {tipocodigoretencionsri.setnombre(tipocodigoretencionsriOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelidTipoCodigoRetencionSri.setText(tipocodigoretencionsri.getId().toString());
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextFieldcodigoTipoCodigoRetencionSri.setText(tipocodigoretencionsri.getcodigo());
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextAreanombreTipoCodigoRetencionSri.setText(tipocodigoretencionsri.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCodigoRetencionSri(TipoCodigoRetencionSriBean tipocodigoretencionsriBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelidTipoCodigoRetencionSri.setText(tipocodigoretencionsriBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextFieldcodigoTipoCodigoRetencionSri.setText(tipocodigoretencionsriBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextAreanombreTipoCodigoRetencionSri.setText(tipocodigoretencionsriBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCodigoRetencionSri(TipoCodigoRetencionSriParameterReturnGeneral tipocodigoretencionsriReturnGeneral,TipoCodigoRetencionSriBean tipocodigoretencionsriBean,Boolean conDefault) throws Exception { 
		try {
			TipoCodigoRetencionSri tipocodigoretencionsriLocal=new TipoCodigoRetencionSri();
			
			tipocodigoretencionsriLocal=tipocodigoretencionsriReturnGeneral.getTipoCodigoRetencionSri();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocodigoretencionsriLocal.getId()!=null && !tipocodigoretencionsriLocal.getId().equals(0L))) {tipocodigoretencionsriBean.setId(tipocodigoretencionsriLocal.getId());}}
			if(conDefault || (!conDefault && tipocodigoretencionsriLocal.getid_pais()!=null && !tipocodigoretencionsriLocal.getid_pais().equals(-1L))) {tipocodigoretencionsriBean.setid_pais(tipocodigoretencionsriLocal.getid_pais());}
			if(conDefault || (!conDefault && tipocodigoretencionsriLocal.getcodigo()!=null && !tipocodigoretencionsriLocal.getcodigo().equals(""))) {tipocodigoretencionsriBean.setcodigo(tipocodigoretencionsriLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocodigoretencionsriLocal.getnombre()!=null && !tipocodigoretencionsriLocal.getnombre().equals(""))) {tipocodigoretencionsriBean.setnombre(tipocodigoretencionsriLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCodigoRetencionSriGenerico(Long idTipoCodigoRetencionSriSeleccionado,JComboBox jComboBoxTipoCodigoRetencionSri,List<TipoCodigoRetencionSri> tipocodigoretencionsrisLocal)throws Exception {
		try {
			TipoCodigoRetencionSri  tipocodigoretencionsriTemp=null;

			for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsrisLocal) {
				if(tipocodigoretencionsriAux.getId()!=null && tipocodigoretencionsriAux.getId().equals(idTipoCodigoRetencionSriSeleccionado)) {
					tipocodigoretencionsriTemp=tipocodigoretencionsriAux;
					break;
				}
			}

			jComboBoxTipoCodigoRetencionSri.setSelectedItem(tipocodigoretencionsriTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCodigoRetencionSriGenerico(JComboBox jComboBoxTipoCodigoRetencionSri,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCodigoRetencionSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCodigoRetencionSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCodigoRetencionSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCodigoRetencionSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCodigoRetencionSri.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCodigoRetencionSri.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCodigoRetencionSri.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCodigoRetencionSri.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCodigoRetencionSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCodigoRetencionSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocodigoretencionsri=(TipoCodigoRetencionSri) tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocodigoretencionsri =(TipoCodigoRetencionSri) tipocodigoretencionsris.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipocodigoretencionsri.getIsNew() && !tipocodigoretencionsri.getIsChanged() && !tipocodigoretencionsri.getIsDeleted()) {
				sDescripcion=tipocodigoretencionsri.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipocodigoretencionsri.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCodigoRetencionSri tipocodigoretencionsriRow=new TipoCodigoRetencionSri();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocodigoretencionsriRow=(TipoCodigoRetencionSri) tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocodigoretencionsriRow=(TipoCodigoRetencionSri) tipocodigoretencionsris.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCodigoRetencionSri(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri && this.isPermisoNuevoTipoCodigoRetencionSri));			
			this.jButtonDuplicarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaDuplicarTipoCodigoRetencionSri && this.isPermisoDuplicarTipoCodigoRetencionSri));			
			this.jButtonCopiarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaCopiarTipoCodigoRetencionSri && this.isPermisoCopiarTipoCodigoRetencionSri));
			this.jButtonVerFormTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaVerFormTipoCodigoRetencionSri && this.isPermisoVerFormTipoCodigoRetencionSri));
			
			this.jButtonAbrirOrderByTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaOrdenTipoCodigoRetencionSri && this.isPermisoOrdenTipoCodigoRetencionSri));			
			
			this.jButtonNuevoRelacionesTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri && this.isPermisoNuevoTipoCodigoRetencionSri));			
			this.jButtonNuevoGuardarCambiosTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri && this.isPermisoNuevoTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri));
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonModificarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaModificarTipoCodigoRetencionSri && this.isPermisoActualizarTipoCodigoRetencionSri));	
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonActualizarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri && this.isPermisoActualizarTipoCodigoRetencionSri));	
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonEliminarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri && this.isPermisoEliminarTipoCodigoRetencionSri));
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonCancelarTipoCodigoRetencionSri.setVisible(this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri);							
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonGuardarCambiosTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri && this.isPermisoNuevoTipoCodigoRetencionSri));						
			this.jButtonDuplicarToolBarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaDuplicarTipoCodigoRetencionSri && this.isPermisoDuplicarTipoCodigoRetencionSri));						
			this.jButtonCopiarToolBarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaCopiarTipoCodigoRetencionSri && this.isPermisoCopiarTipoCodigoRetencionSri));			
			this.jButtonVerFormToolBarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaVerFormTipoCodigoRetencionSri && this.isPermisoVerFormTipoCodigoRetencionSri));			
			this.jButtonAbrirOrderByToolBarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaOrdenTipoCodigoRetencionSri && this.isPermisoOrdenTipoCodigoRetencionSri));
			this.jButtonNuevoRelacionesToolBarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri && this.isPermisoNuevoTipoCodigoRetencionSri));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri && this.isPermisoNuevoTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri));			
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonModificarToolBarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaModificarTipoCodigoRetencionSri && this.isPermisoActualizarTipoCodigoRetencionSri));	
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonActualizarToolBarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri  && this.isPermisoActualizarTipoCodigoRetencionSri));	
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonEliminarToolBarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri && this.isPermisoEliminarTipoCodigoRetencionSri));
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonCancelarToolBarTipoCodigoRetencionSri.setVisible(this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri);				
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonGuardarCambiosToolBarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri && this.isPermisoNuevoTipoCodigoRetencionSri));			
			this.jMenuItemDuplicarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaDuplicarTipoCodigoRetencionSri && this.isPermisoDuplicarTipoCodigoRetencionSri));			
			this.jMenuItemCopiarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaCopiarTipoCodigoRetencionSri && this.isPermisoCopiarTipoCodigoRetencionSri));			
			this.jMenuItemVerFormTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaVerFormTipoCodigoRetencionSri && this.isPermisoVerFormTipoCodigoRetencionSri));			
			this.jMenuItemAbrirOrderByTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaOrdenTipoCodigoRetencionSri && this.isPermisoOrdenTipoCodigoRetencionSri));			
			//this.jMenuItemMostrarOcultarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaOrdenTipoCodigoRetencionSri && this.isPermisoOrdenTipoCodigoRetencionSri));
			this.jMenuItemDetalleAbrirOrderByTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaOrdenTipoCodigoRetencionSri && this.isPermisoOrdenTipoCodigoRetencionSri));			
			//this.jMenuItemDetalleMostrarOcultarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaOrdenTipoCodigoRetencionSri && this.isPermisoOrdenTipoCodigoRetencionSri));			
			this.jMenuItemNuevoRelacionesTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri && this.isPermisoNuevoTipoCodigoRetencionSri));			
			this.jMenuItemNuevoGuardarCambiosTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri && this.isPermisoNuevoTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri));									
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemModificarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaModificarTipoCodigoRetencionSri && this.isPermisoActualizarTipoCodigoRetencionSri));	
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemActualizarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri && this.isPermisoActualizarTipoCodigoRetencionSri));	
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemEliminarTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri && this.isPermisoEliminarTipoCodigoRetencionSri));
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemCancelarTipoCodigoRetencionSri.setVisible(this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri);				
			}
			
			this.jMenuItemGuardarCambiosTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri));						
			this.jMenuItemGuardarCambiosTablaTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=this.jButtonNuevoTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCodigoRetencionSri=this.jButtonDuplicarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaCopiarTipoCodigoRetencionSri=this.jButtonCopiarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaVerFormTipoCodigoRetencionSri=this.jButtonVerFormTipoCodigoRetencionSri.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCodigoRetencionSri=this.jButtonAbrirOrderByTipoCodigoRetencionSri.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=this.jButtonNuevoRelacionesTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaModificarTipoCodigoRetencionSri=this.jButtonModificarTipoCodigoRetencionSri.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonActualizarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonEliminarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonCancelarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonGuardarCambiosTipoCodigoRetencionSri.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=this.jButtonNuevoToolBarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=this.jButtonNuevoRelacionesToolBarTipoCodigoRetencionSri.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			this.isVisibilidadCeldaModificarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonModificarToolBarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonActualizarToolBarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonEliminarToolBarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonCancelarToolBarTipoCodigoRetencionSri.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=this.jButtonGuardarCambiosToolBarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=this.jButtonGuardarCambiosTablaToolBarTipoCodigoRetencionSri.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=this.jMenuItemNuevoTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=this.jMenuItemNuevoRelacionesTipoCodigoRetencionSri.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			this.isVisibilidadCeldaModificarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemModificarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemActualizarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemEliminarTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri=this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemCancelarTipoCodigoRetencionSri.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=this.jMenuItemGuardarCambiosTipoCodigoRetencionSri.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=this.jMenuItemGuardarCambiosTablaTipoCodigoRetencionSri.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCodigoRetencionSri(Boolean esInicializar) {
		if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCodigoRetencionSri();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCodigoRetencionSri(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCodigoRetencionSri() {
		this.jButtonNuevoTipoCodigoRetencionSri.setVisible(this.isPermisoNuevoTipoCodigoRetencionSri);			
		this.jButtonDuplicarTipoCodigoRetencionSri.setVisible(this.isPermisoDuplicarTipoCodigoRetencionSri);			
		this.jButtonCopiarTipoCodigoRetencionSri.setVisible(this.isPermisoCopiarTipoCodigoRetencionSri);			
		this.jButtonVerFormTipoCodigoRetencionSri.setVisible(this.isPermisoVerFormTipoCodigoRetencionSri);			
		
		this.jButtonAbrirOrderByTipoCodigoRetencionSri.setVisible(this.isPermisoOrdenTipoCodigoRetencionSri);					
		
		this.jButtonNuevoRelacionesTipoCodigoRetencionSri.setVisible(this.isPermisoNuevoTipoCodigoRetencionSri);			
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonModificarTipoCodigoRetencionSri.setVisible(this.isPermisoActualizarTipoCodigoRetencionSri);	
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonActualizarTipoCodigoRetencionSri.setVisible(this.isPermisoActualizarTipoCodigoRetencionSri);	
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonEliminarTipoCodigoRetencionSri.setVisible(this.isPermisoEliminarTipoCodigoRetencionSri);
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonCancelarTipoCodigoRetencionSri.setVisible(this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri);						
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonGuardarCambiosTipoCodigoRetencionSri.setVisible(this.isPermisoGuardarCambiosTipoCodigoRetencionSri);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.setVisible(this.isPermisoActualizarTipoCodigoRetencionSri);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCodigoRetencionSri() {
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonModificarTipoCodigoRetencionSri.setVisible(this.isPermisoActualizarTipoCodigoRetencionSri);	
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonActualizarTipoCodigoRetencionSri.setVisible(this.isPermisoActualizarTipoCodigoRetencionSri);	
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonEliminarTipoCodigoRetencionSri.setVisible(this.isPermisoEliminarTipoCodigoRetencionSri);
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonCancelarTipoCodigoRetencionSri.setVisible(this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri);							
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonGuardarCambiosTipoCodigoRetencionSri.setVisible((this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri && this.isPermisoGuardarCambiosTipoCodigoRetencionSri));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCodigoRetencionSri() {
		if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCodigoRetencionSri();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCodigoRetencionSri() {
	}
	
	public void jTableDatosTipoCodigoRetencionSriListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCodigoRetencionSri(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCodigoRetencionSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.gettipocodigoretencionsri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocodigoretencionsri==null) {
						this.tipocodigoretencionsri = new TipoCodigoRetencionSri();
					}

					this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.tipocodigoretencionsri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
				}

				if(this.tipocodigoretencionsri.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocodigoretencionsri.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCodigoRetencionSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoCodigoRetencionSriUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoCodigoRetencionSri(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCodigoRetencionSri.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCodigoRetencionSri.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.gettipocodigoretencionsri(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipocodigoretencionsriLogic.getConnexion());

				if(this.tipocodigoretencionsri.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipocodigoretencionsri.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCodigoRetencionSri=(TitledBorder)this.jScrollPanelDatosTipoCodigoRetencionSri.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoCodigoRetencionSri.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoCodigoRetencionSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.gettipocodigoretencionsri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocodigoretencionsri==null) {
						this.tipocodigoretencionsri = new TipoCodigoRetencionSri();
					}

					this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.tipocodigoretencionsri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
				}

				if(this.tipocodigoretencionsri.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipocodigoretencionsri.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCodigoRetencionSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCodigoRetencionSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.gettipocodigoretencionsri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocodigoretencionsri==null) {
						this.tipocodigoretencionsri = new TipoCodigoRetencionSri();
					}

					this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.tipocodigoretencionsri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
				}

				if(this.tipocodigoretencionsri.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocodigoretencionsri.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCodigoRetencionSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCodigoRetencionSriBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.gettipocodigoretencionsri(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocodigoretencionsri==null) {
						this.tipocodigoretencionsri = new TipoCodigoRetencionSri();
					}

					this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.tipocodigoretencionsri,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);
				}

				if(this.tipocodigoretencionsri.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocodigoretencionsri.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCodigoRetencionSri(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);

			this.getTipoCodigoRetencionSrisBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoCodigoRetencionSri(false);

			//if(TipoCodigoRetencionSriBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);

			this.getTipoCodigoRetencionSrisBusquedaPorNombre();

			this.inicializarActualizarBindingTipoCodigoRetencionSri(false);

			//if(TipoCodigoRetencionSriBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisTipoCodigoRetencionSriActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);

			this.getTipoCodigoRetencionSrisFK_IdPais();

			this.inicializarActualizarBindingTipoCodigoRetencionSri(false);

			//if(TipoCodigoRetencionSriBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocodigoretencionsriLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCodigoRetencionSri() {
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.dispose();
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri!=null) {
			this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.dispose();
			this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri=null;
		}
		
		if(this.jInternalFrameImportacionTipoCodigoRetencionSri!=null) {
			this.jInternalFrameImportacionTipoCodigoRetencionSri.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCodigoRetencionSri.dispose();
			this.jInternalFrameImportacionTipoCodigoRetencionSri=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCodigoRetencionSri();
			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCodigoRetencionSri")) {
				jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCodigoRetencionSri")) {
				jButtonDuplicarTipoCodigoRetencionSriActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCodigoRetencionSri")) {
				jButtonCopiarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCodigoRetencionSri")) {
				jButtonVerFormTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCodigoRetencionSri")) {
				jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCodigoRetencionSri")) {
				jButtonDuplicarTipoCodigoRetencionSriActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCodigoRetencionSri")) {
				jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCodigoRetencionSri")) {
				jButtonDuplicarTipoCodigoRetencionSriActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCodigoRetencionSri")) {
				jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCodigoRetencionSri")) {
				jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCodigoRetencionSri")) {
				jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCodigoRetencionSri")) {
				jButtonModificarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCodigoRetencionSri")) {
				jButtonModificarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCodigoRetencionSri")) {
				jButtonModificarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCodigoRetencionSri")) {
				jButtonActualizarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCodigoRetencionSri")) {
				jButtonActualizarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCodigoRetencionSri")) {
				jButtonActualizarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCodigoRetencionSri")) {
				jButtonEliminarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCodigoRetencionSri")) {
				jButtonEliminarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCodigoRetencionSri")) {
				jButtonEliminarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCodigoRetencionSri")) {
				jButtonCancelarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCodigoRetencionSri")) {
				jButtonCancelarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCodigoRetencionSri")) {
				jButtonCancelarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCodigoRetencionSri")) {
				jButtonCerrarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCodigoRetencionSri")) {
				jButtonCerrarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCodigoRetencionSri")) {
				jButtonCerrarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCodigoRetencionSri")) {
				jButtonMostrarOcultarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCodigoRetencionSri")) {
				jButtonCancelarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCodigoRetencionSri")) {
				jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCodigoRetencionSri")) {
				jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCodigoRetencionSri")) {
				jButtonCopiarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCodigoRetencionSri")) {
				jButtonVerFormTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCodigoRetencionSri")) {
				jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCodigoRetencionSri")) {
				jButtonCopiarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCodigoRetencionSri")) {
				jButtonVerFormTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCodigoRetencionSri")) {
				jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCodigoRetencionSri")) {
				jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCodigoRetencionSri")) {
				jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCodigoRetencionSri")) {
				jButtonRecargarInformacionTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCodigoRetencionSri")) {
				jButtonRecargarInformacionTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCodigoRetencionSri")) {
				jButtonRecargarInformacionTipoCodigoRetencionSriActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCodigoRetencionSri")) {
				jButtonAnterioresTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCodigoRetencionSri")) {
				jButtonAnterioresTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCodigoRetencionSri")) {
				jButtonAnterioresTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCodigoRetencionSri")) {
				jButtonSiguientesTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCodigoRetencionSri")) {
				jButtonSiguientesTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCodigoRetencionSri")) {
				jButtonSiguientesTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCodigoRetencionSri") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCodigoRetencionSri")) {
				jButtonAbrirOrderByTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCodigoRetencionSri") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCodigoRetencionSri")) {
				jButtonMostrarOcultarTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCodigoRetencionSri")) {
				jButtonNuevoGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCodigoRetencionSri")) {
				jButtonNuevoGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCodigoRetencionSri")) {
				jButtonNuevoGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCodigoRetencionSri")) {
				jButtonCerrarReporteDinamicoTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCodigoRetencionSri")) {
				jButtonGenerarReporteDinamicoTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCodigoRetencionSri")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCodigoRetencionSri")) {
				jButtonCerrarImportacionTipoCodigoRetencionSriActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCodigoRetencionSri")) {
				
				jButtonGenerarImportacionTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCodigoRetencionSri")) {
				
				jButtonAbrirImportacionTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCodigoRetencionSri")) {
				jComboBoxTiposAccionesTipoCodigoRetencionSriActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCodigoRetencionSri")) {
				jComboBoxTiposRelacionesTipoCodigoRetencionSriActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCodigoRetencionSri")) {
				jComboBoxTiposAccionesTipoCodigoRetencionSriActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCodigoRetencionSri")) {
				
				jComboBoxTiposSeleccionarTipoCodigoRetencionSriActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCodigoRetencionSri")) {
				jTextFieldValorCampoGeneralTipoCodigoRetencionSriActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCodigoRetencionSri")) {
				jButtonAbrirOrderByTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCodigoRetencionSri")) {
				jButtonAbrirOrderByTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCodigoRetencionSri")) {
				jButtonCerrarOrderByTipoCodigoRetencionSriActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCodigoRetencionSriBusqueda")) {
				this.jButtonidTipoCodigoRetencionSriBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoCodigoRetencionSriUpdate")) {
				this.jButtonid_paisTipoCodigoRetencionSriUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoCodigoRetencionSriBusqueda")) {
				this.jButtonid_paisTipoCodigoRetencionSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCodigoRetencionSriBusqueda")) {
				this.jButtoncodigoTipoCodigoRetencionSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCodigoRetencionSriBusqueda")) {
				this.jButtonnombreTipoCodigoRetencionSriBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoCodigoRetencionSri")) {
				this.jButtonBusquedaPorCodigoTipoCodigoRetencionSriActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoCodigoRetencionSri")) {
				this.jButtonBusquedaPorNombreTipoCodigoRetencionSriActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisTipoCodigoRetencionSri")) {
				this.jButtonFK_IdPaisTipoCodigoRetencionSriActionPerformed(evt);
			}
			
			;
			
			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCodigoRetencionSri();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				


				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoRetencionSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoRetencionSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCodigoRetencionSri tipocodigoretencionsriLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocodigoretencionsriLocal=this.tipocodigoretencionsri;
			} else {
				tipocodigoretencionsriLocal=this.tipocodigoretencionsriAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
							
				
				


				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoRetencionSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoRetencionSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
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
			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			
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
			
			


			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
								
						
				


				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoRetencionSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoRetencionSri.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
								
				
				


				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoRetencionSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoRetencionSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
							
				
				


				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoRetencionSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoRetencionSri.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
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
			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			
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
			
			


			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
								
				
				


				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoRetencionSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoRetencionSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCodigoRetencionSri")) {
					jCheckBoxSeleccionarTodosTipoCodigoRetencionSriItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCodigoRetencionSri")) {
					jCheckBoxSeleccionadosTipoCodigoRetencionSriItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCodigoRetencionSri")) {
					
				}
				
				


				
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoRetencionSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoRetencionSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
												
				
				


				
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoRetencionSri.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoRetencionSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
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
			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
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
			
			


			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoRetencionSri.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoRetencionSri.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocodigoretencionsri);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocodigoretencionsri);
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
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
				
				


				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCodigoRetencionSri.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCodigoRetencionSri.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCodigoRetencionSriActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocodigoretencionsriAnterior =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCodigoRetencionSri")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCodigoRetencionSriListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCodigoRetencionSri.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocodigoretencionsri =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocodigoretencionsri);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCodigoRetencionSri")) {
				
				}
				
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCodigoRetencionSri")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCodigoRetencionSri.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCodigoRetencionSri")) {
			
			}
			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCodigoRetencionSri();
			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCodigoRetencionSri")) {
				jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCodigoRetencionSri")) {
				jButtonDuplicarTipoCodigoRetencionSriActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCodigoRetencionSri")) {
				jButtonCopiarTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCodigoRetencionSri")) {
				jButtonVerFormTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCodigoRetencionSri")) {
				jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCodigoRetencionSri")) {
				jButtonModificarTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCodigoRetencionSri")) {
				jButtonActualizarTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCodigoRetencionSri")) {
				jButtonEliminarTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCodigoRetencionSri")) {
				jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCodigoRetencionSri")) {
				jButtonCancelarTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCodigoRetencionSri")) {
				jButtonCerrarTipoCodigoRetencionSriActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCodigoRetencionSri")) {
				jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCodigoRetencionSri")) {
				jButtonNuevoGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCodigoRetencionSri")) {
				jButtonAbrirOrderByTipoCodigoRetencionSriActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCodigoRetencionSri")) {
				jButtonRecargarInformacionTipoCodigoRetencionSriActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCodigoRetencionSri")) {
				jButtonAnterioresTipoCodigoRetencionSriActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCodigoRetencionSri")) {
				jButtonSiguientesTipoCodigoRetencionSriActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCodigoRetencionSriBusqueda")) {
				this.jButtonidTipoCodigoRetencionSriBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoCodigoRetencionSriUpdate")) {
				this.jButtonid_paisTipoCodigoRetencionSriUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoCodigoRetencionSriBusqueda")) {
				this.jButtonid_paisTipoCodigoRetencionSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCodigoRetencionSriBusqueda")) {
				this.jButtoncodigoTipoCodigoRetencionSriBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCodigoRetencionSriBusqueda")) {
				this.jButtonnombreTipoCodigoRetencionSriBusquedaActionPerformed(evt);
			}
			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCodigoRetencionSri();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCodigoRetencionSri")) {
				closingInternalFrameTipoCodigoRetencionSri();
				
			} else if(sTipo.equals("jButtonCancelarTipoCodigoRetencionSri")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCodigoRetencionSri = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCodigoRetencionSriBeanSwingJInternalFrame jInternalFrameParent=(TipoCodigoRetencionSriBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCodigoRetencionSri.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCodigoRetencionSriActionPerformed(null);
			}
			
			TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocodigoretencionsri,new Object(),this.tipocodigoretencionsriParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCodigoRetencionSri(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCodigoRetencionSri(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCodigoRetencionSri(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocodigoretencionsri)) {
			if(!esControlTabla) {
				if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.tipocodigoretencionsri,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);			
				}
				
				if(this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCodigoRetencionSri(this.tipocodigoretencionsri,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocodigoretencionsriReturnGeneral=tipocodigoretencionsriLogic.procesarEventosTipoCodigoRetencionSrisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris(),this.tipocodigoretencionsri,this.tipocodigoretencionsriParameterGeneral,this.isEsNuevoTipoCodigoRetencionSri,classes);//this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSri()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCodigoRetencionSri(this.tipocodigoretencionsriReturnGeneral,this.tipocodigoretencionsriBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCodigoRetencionSri(classes,this.tipocodigoretencionsriReturnGeneral,this.tipocodigoretencionsriBean,false);
					}
						
					if(this.tipocodigoretencionsriReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCodigoRetencionSri(this.tipocodigoretencionsriReturnGeneral.getTipoCodigoRetencionSri());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCodigoRetencionSri(this.tipocodigoretencionsriReturnGeneral.getTipoCodigoRetencionSri());	
					}
						
					if(this.tipocodigoretencionsriReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCodigoRetencionSri(this.tipocodigoretencionsriReturnGeneral.getTipoCodigoRetencionSri(),classes);//this.tipocodigoretencionsriBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCodigoRetencionSri(this.tipocodigoretencionsri,classes);//this.tipocodigoretencionsriBean);									
				}
			
				if(TipoCodigoRetencionSriJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCodigoRetencionSri(this.tipocodigoretencionsri,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCodigoRetencionSri(this.tipocodigoretencionsri);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocodigoretencionsriAnterior!=null) {
						this.tipocodigoretencionsri=this.tipocodigoretencionsriAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocodigoretencionsriReturnGeneral=tipocodigoretencionsriLogic.procesarEventosTipoCodigoRetencionSrisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris(),this.tipocodigoretencionsri,this.tipocodigoretencionsriParameterGeneral,this.isEsNuevoTipoCodigoRetencionSri,classes);//this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSri()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocodigoretencionsriSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocodigoretencionsriReturnGeneral.getTipoCodigoRetencionSri(),tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocodigoretencionsriReturnGeneral.getTipoCodigoRetencionSri(),this.tipocodigoretencionsris);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCodigoRetencionSri.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCodigoRetencionSri.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCodigoRetencionSri();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCodigoRetencionSri() throws Exception {
		
		TipoCodigoRetencionSriModel tipocodigoretencionsriModel=(TipoCodigoRetencionSriModel)this.jTableDatosTipoCodigoRetencionSri.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocodigoretencionsriModel.tipocodigoretencionsris=this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocodigoretencionsriModel.tipocodigoretencionsris=this.tipocodigoretencionsris;
		}
		
		
		((TipoCodigoRetencionSriModel) this.jTableDatosTipoCodigoRetencionSri.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCodigoRetencionSri() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocodigoretencionsriAnterior(),this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocodigoretencionsriAnterior(),this.tipocodigoretencionsris);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCodigoRetencionSri();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
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
										
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocodigoretencionsri,new Object(),generalEntityParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCodigoRetencionSriConstantesFunciones.getClassesRelationshipsOfTipoCodigoRetencionSri(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCodigoRetencionSriConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCodigoRetencionSri(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCodigoRetencionSri(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocodigoretencionsri,new Object(),generalEntityParameterGeneral,this.tipocodigoretencionsriReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCodigoRetencionSri(TipoCodigoRetencionSriBean tipocodigoretencionsriBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCodigoRetencionSri(ArrayList<Classe> classes,TipoCodigoRetencionSriReturnGeneral tipocodigoretencionsriReturnGeneral,TipoCodigoRetencionSriBean tipocodigoretencionsriBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocodigoretencionsri)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri = new TipoCodigoRetencionSriDetalleFormJInternalFrame(jDesktopPane,this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones(),this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCodigoRetencionSri);
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setVisible(false);
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.tipocodigoretencionsriLogic=this.tipocodigoretencionsriLogic;
		
		this.cargarCombosFrameForeignKeyTipoCodigoRetencionSri("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCodigoRetencionSri();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCodigoRetencionSri();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCodigoRetencionSri("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCodigoRetencionSri();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCodigoRetencionSri"));
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonModificarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"ModificarTipoCodigoRetencionSri"));

		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonModificarToolBarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCodigoRetencionSri"));
					
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemModificarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCodigoRetencionSri"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonActualizarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"ActualizarTipoCodigoRetencionSri"));
		
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonActualizarToolBarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCodigoRetencionSri"));
						
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemActualizarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCodigoRetencionSri"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonEliminarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"EliminarTipoCodigoRetencionSri"));
		
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonEliminarToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCodigoRetencionSri"));
								
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemEliminarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCodigoRetencionSri"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonCancelarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"CancelarTipoCodigoRetencionSri"));
		
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonCancelarToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCodigoRetencionSri"));
					
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemCancelarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCodigoRetencionSri"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemDetalleCerrarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCodigoRetencionSri"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonGuardarCambiosToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCodigoRetencionSri"));
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonGuardarCambiosToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCodigoRetencionSri"));
		
		
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCodigoRetencionSri"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonidTipoCodigoRetencionSriBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCodigoRetencionSriBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonid_paisTipoCodigoRetencionSriUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoCodigoRetencionSriUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonid_paisTipoCodigoRetencionSriBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoCodigoRetencionSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtoncodigoTipoCodigoRetencionSriBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCodigoRetencionSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonnombreTipoCodigoRetencionSriBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCodigoRetencionSriBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTabbedPaneRelacionesTipoCodigoRetencionSri.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCodigoRetencionSri"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCodigoRetencionSri"));
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCodigoRetencionSri"));
		}
		
		this.jTableDatosTipoCodigoRetencionSri.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCodigoRetencionSri"));
		
		this.jTableDatosTipoCodigoRetencionSri.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCodigoRetencionSri"));
		
		this.jButtonNuevoTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"NuevoTipoCodigoRetencionSri"));
		
		this.jButtonDuplicarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"DuplicarTipoCodigoRetencionSri"));
		
		this.jButtonCopiarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"CopiarTipoCodigoRetencionSri"));
		
		this.jButtonVerFormTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"VerFormTipoCodigoRetencionSri"));
		
		
		this.jButtonNuevoToolBarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCodigoRetencionSri"));
			
		this.jButtonDuplicarToolBarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCodigoRetencionSri"));
			
		this.jMenuItemNuevoTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCodigoRetencionSri"));
			
		this.jMenuItemDuplicarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCodigoRetencionSri"));		
		
		
		this.jButtonNuevoRelacionesTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCodigoRetencionSri"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCodigoRetencionSri"));
			
		this.jMenuItemNuevoRelacionesTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCodigoRetencionSri"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonModificarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"ModificarTipoCodigoRetencionSri"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonModificarToolBarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCodigoRetencionSri"));
			
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemModificarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCodigoRetencionSri"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonActualizarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"ActualizarTipoCodigoRetencionSri"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonActualizarToolBarTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCodigoRetencionSri"));
				
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemActualizarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCodigoRetencionSri"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonEliminarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"EliminarTipoCodigoRetencionSri"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonEliminarToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCodigoRetencionSri"));
						
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemEliminarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCodigoRetencionSri"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonCancelarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"CancelarTipoCodigoRetencionSri"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonCancelarToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCodigoRetencionSri"));
			
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemCancelarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCodigoRetencionSri"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCodigoRetencionSri"));		
		
		
		this.jButtonCerrarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"CerrarTipoCodigoRetencionSri"));
		
		
		this.jButtonCerrarToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCodigoRetencionSri"));
			
		this.jMenuItemCerrarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCodigoRetencionSri"));
			
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jMenuItemDetalleCerrarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCodigoRetencionSri"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonGuardarCambiosTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCodigoRetencionSri"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonGuardarCambiosToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCodigoRetencionSri"));
		}
		
		this.jButtonCopiarToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCodigoRetencionSri"));
			
		this.jButtonVerFormToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCodigoRetencionSri"));
		
		this.jMenuItemGuardarCambiosTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCodigoRetencionSri"));
			
		this.jMenuItemCopiarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCodigoRetencionSri"));		
		
		this.jMenuItemVerFormTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCodigoRetencionSri"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCodigoRetencionSri"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCodigoRetencionSri"));
			
		this.jMenuItemGuardarCambiosTablaTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCodigoRetencionSri"));		
		
		
		
		this.jButtonRecargarInformacionTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCodigoRetencionSri"));
					
		this.jButtonRecargarInformacionToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCodigoRetencionSri"));
		
		this.jMenuItemRecargarInformacionTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCodigoRetencionSri"));		
		
		
		
		this.jButtonAnterioresTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"AnterioresTipoCodigoRetencionSri"));
		
		
		this.jButtonAnterioresToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCodigoRetencionSri"));
		
		this.jMenuItemAnterioresTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCodigoRetencionSri"));		
		
		
		this.jButtonSiguientesTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"SiguientesTipoCodigoRetencionSri"));
		
		
		this.jButtonSiguientesToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCodigoRetencionSri"));
			
		this.jMenuItemSiguientesTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCodigoRetencionSri"));
			
		this.jMenuItemAbrirOrderByTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCodigoRetencionSri"));
			
		this.jMenuItemMostrarOcultarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCodigoRetencionSri"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCodigoRetencionSri"));
			
		this.jMenuItemDetalleMostarOcultarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCodigoRetencionSri"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCodigoRetencionSri"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCodigoRetencionSri"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCodigoRetencionSri"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCodigoRetencionSri"));

		this.jCheckBoxSeleccionadosTipoCodigoRetencionSri.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCodigoRetencionSri"));
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCodigoRetencionSri"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCodigoRetencionSri"));
			
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCodigoRetencionSri"));
					
		this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCodigoRetencionSri"));
			
		this.jTextFieldValorCampoGeneralTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCodigoRetencionSri"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonidTipoCodigoRetencionSriBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCodigoRetencionSriBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonid_paisTipoCodigoRetencionSriUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoCodigoRetencionSriUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonid_paisTipoCodigoRetencionSriBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoCodigoRetencionSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtoncodigoTipoCodigoRetencionSriBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCodigoRetencionSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonnombreTipoCodigoRetencionSriBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCodigoRetencionSriBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoCodigoRetencionSri"));

			this.jButtonBusquedaPorNombreTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoCodigoRetencionSri"));

			this.jButtonFK_IdPaisTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoCodigoRetencionSri"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri!=null) {
				this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCodigoRetencionSri"));
				this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCodigoRetencionSri"));
				this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCodigoRetencionSri"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCodigoRetencionSri"));				
			//this.jButtonGenerarReporteDinamicoTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCodigoRetencionSri"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCodigoRetencionSri"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCodigoRetencionSri!=null) {
				this.jInternalFrameImportacionTipoCodigoRetencionSri.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCodigoRetencionSri"));
				this.jInternalFrameImportacionTipoCodigoRetencionSri.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCodigoRetencionSri"));
				this.jInternalFrameImportacionTipoCodigoRetencionSri.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCodigoRetencionSri"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCodigoRetencionSri"));
			
			this.jButtonAbrirOrderByToolBarTipoCodigoRetencionSri.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCodigoRetencionSri"));			
			
			if(this.jInternalFrameOrderByTipoCodigoRetencionSri!=null) {
				this.jInternalFrameOrderByTipoCodigoRetencionSri.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCodigoRetencionSri"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTabbedPaneRelacionesTipoCodigoRetencionSri.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCodigoRetencionSri"));
		
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
            		closingInternalFrameTipoCodigoRetencionSri();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCodigoRetencionSri = (JInternalFrameBase)event.getSource();
	            	
	            TipoCodigoRetencionSriBeanSwingJInternalFrame jInternalFrameParent=(TipoCodigoRetencionSriBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCodigoRetencionSri.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCodigoRetencionSriActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCodigoRetencionSri.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCodigoRetencionSriListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCodigoRetencionSri.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCodigoRetencionSri.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCodigoRetencionSri";
		inputMap = this.jButtonNuevoTipoCodigoRetencionSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCodigoRetencionSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCodigoRetencionSri";
		inputMap = this.jButtonNuevoRelacionesTipoCodigoRetencionSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCodigoRetencionSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCodigoRetencionSriActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCodigoRetencionSri";
		inputMap = this.jButtonModificarTipoCodigoRetencionSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCodigoRetencionSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCodigoRetencionSriActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCodigoRetencionSri";
		inputMap = this.jButtonActualizarTipoCodigoRetencionSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCodigoRetencionSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCodigoRetencionSriActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCodigoRetencionSri";
		inputMap = this.jButtonEliminarTipoCodigoRetencionSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCodigoRetencionSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCodigoRetencionSriActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCodigoRetencionSri";
		inputMap = this.jButtonCancelarTipoCodigoRetencionSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCodigoRetencionSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCodigoRetencionSriActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCodigoRetencionSri";
		inputMap = this.jButtonCerrarTipoCodigoRetencionSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCodigoRetencionSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCodigoRetencionSriActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonGuardarCambiosTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCodigoRetencionSri";
		inputMap = this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonGuardarCambiosTipoCodigoRetencionSri.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonGuardarCambiosTipoCodigoRetencionSri.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCodigoRetencionSriItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCodigoRetencionSri.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCodigoRetencionSriActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCodigoRetencionSriActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCodigoRetencionSri.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCodigoRetencionSriActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonidTipoCodigoRetencionSriBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCodigoRetencionSriBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonid_paisTipoCodigoRetencionSriUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoCodigoRetencionSriUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonid_paisTipoCodigoRetencionSriBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoCodigoRetencionSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtoncodigoTipoCodigoRetencionSriBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCodigoRetencionSriBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jButtonnombreTipoCodigoRetencionSriBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCodigoRetencionSriBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoCodigoRetencionSri"));

		this.jButtonBusquedaPorNombreTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoCodigoRetencionSri"));

		this.jButtonFK_IdPaisTipoCodigoRetencionSri.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoCodigoRetencionSri"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCodigoRetencionSri.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCodigoRetencionSriActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCodigoRetencionSriActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCodigoRetencionSri(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()) {
					tipocodigoretencionsriAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsris) {
					tipocodigoretencionsriAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCodigoRetencionSriItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()) {
						tipocodigoretencionsriAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsris) {
						tipocodigoretencionsriAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsris) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCodigoRetencionSri.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCodigoRetencionSri.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoRetencionSri,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCodigoRetencionSriItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCodigoRetencionSri.getSelectedRows();
			
			TipoCodigoRetencionSri tipocodigoretencionsriLocal=new TipoCodigoRetencionSri();
			
			//this.seleccionarTodosTipoCodigoRetencionSri(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocodigoretencionsriLocal =(TipoCodigoRetencionSri) this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocodigoretencionsriLocal =(TipoCodigoRetencionSri) this.tipocodigoretencionsris.toArray()[this.jTableDatosTipoCodigoRetencionSri.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocodigoretencionsriLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()) {
						tipocodigoretencionsriAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsris) {
						tipocodigoretencionsriAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCodigoRetencionSri.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCodigoRetencionSri.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCodigoRetencionSri,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCodigoRetencionSriItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCodigoRetencionSriParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCodigoRetencionSriActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCodigoRetencionSri.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()) {
				
						if(sTipoSeleccionar.equals(TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocodigoretencionsriAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocodigoretencionsriAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsris) {
					
						if(sTipoSeleccionar.equals(TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocodigoretencionsriAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocodigoretencionsriAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCodigoRetencionSriActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCodigoRetencionSri=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCodigoRetencionSri.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCodigoRetencionSri) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCodigoRetencionSri(conSplash);
				
					this.generarReporteTipoCodigoRetencionSrisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCodigoRetencionSrisSeleccionados();
				//this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCodigoRetencionSrisSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCodigoRetencionSrisSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCodigoRetencionSri();
				
				this.exportarTipoCodigoRetencionSrisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCodigoRetencionSris();
				//this.importarTipoCodigoRetencionSris();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCodigoRetencionSri();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCodigoRetencionSrisSeleccionados();
				//this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Codigo Retencion Sri", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCodigoRetencionSri();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCodigoRetencionSri)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCodigoRetencionSri(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Codigo Retencion Sri",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxTiposAccionesFormularioTipoCodigoRetencionSri.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCodigoRetencionSri();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCodigoRetencionSri(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCodigoRetencionSriActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCodigoRetencionSri();
			
			if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();		
			TipoCodigoRetencionSri tipocodigoretencionsri=new TipoCodigoRetencionSri();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCodigoRetencionSri.getSelectedItem();
			
			
			
			
			tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocodigoretencionsrisSeleccionados.size()==1) {
				for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsrisSeleccionados) {
					tipocodigoretencionsri=tipocodigoretencionsriAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCodigoRetencionSri();
			
      		//this.finishProcessTipoCodigoRetencionSri(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCodigoRetencionSriReturnGeneral() throws Exception {
		if(this.tipocodigoretencionsriReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocodigoretencionsriReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocodigoretencionsriReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocodigoretencionsriReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocodigoretencionsriReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocodigoretencionsriReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false);
		}
		
		if(this.tipocodigoretencionsriReturnGeneral.getConRetornoLista() || this.tipocodigoretencionsriReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocodigoretencionsriReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocodigoretencionsriLogic.setTipoCodigoRetencionSris(this.tipocodigoretencionsriReturnGeneral.getTipoCodigoRetencionSris());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocodigoretencionsriReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocodigoretencionsriLogic.setTipoCodigoRetencionSri(this.tipocodigoretencionsriReturnGeneral.getTipoCodigoRetencionSri());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCodigoRetencionSri(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCodigoRetencionSri() throws Exception {
		
		
	}
	
	public ArrayList<TipoCodigoRetencionSri> getTipoCodigoRetencionSrisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCodigoRetencionSri) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsriLogic.getTipoCodigoRetencionSris()) {
					if(tipocodigoretencionsriAux.getIsSelected()) {
						tipocodigoretencionsrisSeleccionados.add(tipocodigoretencionsriAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCodigoRetencionSri tipocodigoretencionsriAux:this.tipocodigoretencionsris) {
					if(tipocodigoretencionsriAux.getIsSelected()) {
						tipocodigoretencionsrisSeleccionados.add(tipocodigoretencionsriAux);				
					}
				}
			}
			
			if(tipocodigoretencionsrisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocodigoretencionsrisSeleccionados.addAll(this.tipocodigoretencionsriLogic.getTipoCodigoRetencionSris());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocodigoretencionsrisSeleccionados.addAll(this.tipocodigoretencionsris);				
					}
				}
			}
		} else {
			tipocodigoretencionsrisSeleccionados.add(this.tipocodigoretencionsri);
		}
		
		return tipocodigoretencionsrisSeleccionados;
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
	
	public void generarReporteTipoCodigoRetencionSrisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCodigoRetencionSrisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCodigoRetencionSrisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCodigoRetencionSrisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCodigoRetencionSrisSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Codigo Retencion Sri",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCodigoRetencionSrisSeleccionados() throws Exception {
		ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();		
		
		tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCodigoRetencionSris("Todos",tipocodigoretencionsrisSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCodigoRetencionSrisSeleccionados() throws Exception {
		ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();		
		
		tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCodigoRetencionSris("Todos",tipocodigoretencionsrisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCodigoRetencionSrisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();
		
		tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCodigoRetencionSris("Todos",tipocodigoretencionsrisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCodigoRetencionSrisSeleccionados() throws Exception {
		ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCodigoRetencionSri();
		
		
		tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCodigoRetencionSri();
		
		
		//this.generarReporteTipoCodigoRetencionSris("Todos",tipocodigoretencionsrisSeleccionados ,tipocodigoretencionsriImplementable,tipocodigoretencionsriImplementableHome);
	}
	
	public void mostrarImportacionTipoCodigoRetencionSris() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCodigoRetencionSri();
		
		this.abrirFrameImportacionTipoCodigoRetencionSri();		
		
			
		//this.generarReporteTipoCodigoRetencionSris("Todos",tipocodigoretencionsrisSeleccionados ,tipocodigoretencionsriImplementable,tipocodigoretencionsriImplementableHome);
	}
	
	public void importarTipoCodigoRetencionSris() throws Exception {		
	
	}
	
	public void exportarTipoCodigoRetencionSrisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCodigoRetencionSrisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCodigoRetencionSrisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCodigoRetencionSrisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Codigo Retencion Sri",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCodigoRetencionSrisSeleccionados() throws Exception {
		ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();		
		
		tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigoretencionsri."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCodigoRetencionSri(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsrisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCodigoRetencionSri(tipocodigoretencionsriAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocodigoretencionsriAux.setsDetalleGeneralEntityReporte(tipocodigoretencionsriAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Codigo Retencion Sri",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCodigoRetencionSri(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCodigoRetencionSriConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCodigoRetencionSriConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocodigoretencionsri.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocodigoretencionsri.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocodigoretencionsri.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocodigoretencionsri.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocodigoretencionsri.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCodigoRetencionSrisSeleccionados() throws Exception {
		ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();		
		
		tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigoretencionsri.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCodigoRetencionSris");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCodigoRetencionSri(row);				
				iRow++;
			}				
			
			for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsrisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCodigoRetencionSri(tipocodigoretencionsriAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Codigo Retencion Sri",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCodigoRetencionSrisSeleccionados() throws Exception {
		ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();		
		
		tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocodigoretencionsri.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocodigoretencionsris");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocodigoretencionsri");
			//elementRoot.appendChild(element);
		
			for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsrisSeleccionados) {
				element = document.createElement("tipocodigoretencionsri");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCodigoRetencionSri(tipocodigoretencionsriAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Codigo Retencion Sri",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCodigoRetencionSri(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocodigoretencionsri.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocodigoretencionsri.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocodigoretencionsri.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocodigoretencionsri.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCodigoRetencionSri(TipoCodigoRetencionSri tipocodigoretencionsri,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCodigoRetencionSriConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocodigoretencionsri.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCodigoRetencionSriConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocodigoretencionsri.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoCodigoRetencionSriConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipocodigoretencionsri.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementcodigo = document.createElement(TipoCodigoRetencionSriConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocodigoretencionsri.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCodigoRetencionSriConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocodigoretencionsri.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCodigoRetencionSrisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados=new ArrayList<TipoCodigoRetencionSri>();
		
		tipocodigoretencionsrisSeleccionados=this.getTipoCodigoRetencionSrisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCodigoRetencionSri(tipocodigoretencionsrisSeleccionados);
		
		this.generarReporteTipoCodigoRetencionSris("Todos",tipocodigoretencionsrisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCodigoRetencionSri(ArrayList<TipoCodigoRetencionSri> tipocodigoretencionsrisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCodigoRetencionSri tipocodigoretencionsriAux:tipocodigoretencionsrisSeleccionados) {
				tipocodigoretencionsriAux.setsDetalleGeneralEntityReporte(tipocodigoretencionsriAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCodigoRetencionSriConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipocodigoretencionsriAux.setsDescripcionGeneralEntityReporte1(tipocodigoretencionsriAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCodigoRetencionSriConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocodigoretencionsriAux.setsDescripcionGeneralEntityReporte1(tipocodigoretencionsriAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCodigoRetencionSriConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocodigoretencionsriAux.setsDescripcionGeneralEntityReporte1(tipocodigoretencionsriAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCodigoRetencionSriConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCodigoRetencionSri(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaModificarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaModificarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaModificarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaModificarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaModificarTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaCancelarTipoCodigoRetencionSri=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCodigoRetencionSri=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCodigoRetencionSriJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=true;
		} else {
			this.actualizarEstadoPanelsTipoCodigoRetencionSri(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCodigoRetencionSri=false;
			//this.isVisibilidadCeldaVerFormTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaDuplicarTipoCodigoRetencionSri=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCodigoRetencionSri=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
			if(!tipocodigoretencionsriSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=false;												
			}
			
			this.jButtonCerrarTipoCodigoRetencionSri.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCodigoRetencionSri=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocodigoretencionsri)) {
			this.isVisibilidadCeldaActualizarTipoCodigoRetencionSri=false;
			this.isVisibilidadCeldaEliminarTipoCodigoRetencionSri=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCodigoRetencionSri() {
	}
	
	public void actualizarEstadoPanelsTipoCodigoRetencionSri(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCodigoRetencionSri!=null) {
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosTipoCodigoRetencionSri.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCodigoRetencionSri!=null) {
				this.jPanelPaginacionTipoCodigoRetencionSri.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoRetencionSri!=null) {
				this.jPanelParametrosReportesTipoCodigoRetencionSri.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCodigoRetencionSri!=null) {
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosTipoCodigoRetencionSri.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCodigoRetencionSri!=null) {
				this.jPanelPaginacionTipoCodigoRetencionSri.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoRetencionSri!=null) {
				this.jPanelParametrosReportesTipoCodigoRetencionSri.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCodigoRetencionSri!=null) {
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosTipoCodigoRetencionSri.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCodigoRetencionSri!=null) {
				this.jPanelPaginacionTipoCodigoRetencionSri.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoRetencionSri!=null) {
				this.jPanelParametrosReportesTipoCodigoRetencionSri.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCodigoRetencionSri!=null) {
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosTipoCodigoRetencionSri.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCodigoRetencionSri!=null) {
				this.jPanelPaginacionTipoCodigoRetencionSri.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoRetencionSri!=null) {
				this.jPanelParametrosReportesTipoCodigoRetencionSri.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCodigoRetencionSri!=null) {
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosTipoCodigoRetencionSri.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCodigoRetencionSri!=null) {
				this.jPanelPaginacionTipoCodigoRetencionSri.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoRetencionSri!=null) {
				this.jPanelParametrosReportesTipoCodigoRetencionSri.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCodigoRetencionSri!=null) {
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosTipoCodigoRetencionSri.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCodigoRetencionSri!=null) {
				this.jPanelPaginacionTipoCodigoRetencionSri.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoRetencionSri!=null) {
				this.jPanelParametrosReportesTipoCodigoRetencionSri.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosEdicionTipoCodigoRetencionSri.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCodigoRetencionSri!=null) {
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCodigoRetencionSri!=null) {
				this.jScrollPanelDatosTipoCodigoRetencionSri.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCodigoRetencionSri!=null) {
				this.jPanelPaginacionTipoCodigoRetencionSri.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCodigoRetencionSri!=null) {
				this.jPanelParametrosReportesTipoCodigoRetencionSri.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCodigoRetencionSri!=null) {
					this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCodigoRetencionSri!=null) {
				this.jPanelParametrosReportesTipoCodigoRetencionSri.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCodigoRetencionSri!=null) {
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCodigoRetencionSri!=null) {
				this.jPanelParametrosReportesTipoCodigoRetencionSri.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorCodigo=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoCodigoRetencionSri.remove(jPanelBusquedaPorCodigoTipoCodigoRetencionSri);}

			this.isVisibilidadBusquedaPorNombre=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoCodigoRetencionSri.remove(jPanelBusquedaPorNombreTipoCodigoRetencionSri);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoCodigoRetencionSri.remove(jPanelFK_IdPaisTipoCodigoRetencionSri);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCodigoRetencionSriSessionBean tipocodigoretencionsriSessionBean=new TipoCodigoRetencionSriSessionBean();
		
		if(this.tipocodigoretencionsriSessionBean==null) {
			this.tipocodigoretencionsriSessionBean=new TipoCodigoRetencionSriSessionBean();
		}
		
		this.tipocodigoretencionsriSessionBean.setsUltimaBusquedaTipoCodigoRetencionSri(this.getsAccionBusqueda());
		this.tipocodigoretencionsriSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocodigoretencionsriSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipocodigoretencionsriSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipocodigoretencionsriSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipocodigoretencionsriSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCodigoRetencionSriSessionBean tipocodigoretencionsriSessionBean=new TipoCodigoRetencionSriSessionBean();
		
		if(this.tipocodigoretencionsriSessionBean==null) {
			this.tipocodigoretencionsriSessionBean=new TipoCodigoRetencionSriSessionBean();
		}
		
		if(this.tipocodigoretencionsriSessionBean.getsUltimaBusquedaTipoCodigoRetencionSri()!=null&&!this.tipocodigoretencionsriSessionBean.getsUltimaBusquedaTipoCodigoRetencionSri().equals("")) {
			this.setsAccionBusqueda(tipocodigoretencionsriSessionBean.getsUltimaBusquedaTipoCodigoRetencionSri());
			this.setiNumeroPaginacion(tipocodigoretencionsriSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocodigoretencionsriSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipocodigoretencionsriSessionBean.getcodigo());
				tipocodigoretencionsriSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipocodigoretencionsriSessionBean.getnombre());
				tipocodigoretencionsriSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipocodigoretencionsriSessionBean.getid_pais());
				tipocodigoretencionsriSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipocodigoretencionsriSessionBean.setsUltimaBusquedaTipoCodigoRetencionSri("");
		this.tipocodigoretencionsriSessionBean.setiNumeroPaginacion(TipoCodigoRetencionSriConstantesFunciones.INUMEROPAGINACION);
		this.tipocodigoretencionsriSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCodigoRetencionSri(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCodigoRetencionSri() {
		this.updateBorderResaltarBusquedasFormularioTipoCodigoRetencionSri();
		this.updateVisibilidadBusquedasFormularioTipoCodigoRetencionSri();
		this.updateHabilitarBusquedasFormularioTipoCodigoRetencionSri();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCodigoRetencionSri() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponents().length>0) {
	

		if(this.tipocodigoretencionsriConstantesFunciones.resaltarBusquedaPorCodigoTipoCodigoRetencionSri!=null) {
			index= this.jTabbedPaneBusquedasTipoCodigoRetencionSri.indexOfComponent(this.jPanelBusquedaPorCodigoTipoCodigoRetencionSri);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponent(index);
				jPanel.setBorder(this.tipocodigoretencionsriConstantesFunciones.resaltarBusquedaPorCodigoTipoCodigoRetencionSri);
			}
		}

		if(this.tipocodigoretencionsriConstantesFunciones.resaltarBusquedaPorNombreTipoCodigoRetencionSri!=null) {
			index= this.jTabbedPaneBusquedasTipoCodigoRetencionSri.indexOfComponent(this.jPanelBusquedaPorNombreTipoCodigoRetencionSri);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponent(index);
				jPanel.setBorder(this.tipocodigoretencionsriConstantesFunciones.resaltarBusquedaPorNombreTipoCodigoRetencionSri);
			}
		}

		if(this.tipocodigoretencionsriConstantesFunciones.resaltarFK_IdPaisTipoCodigoRetencionSri!=null) {
			index= this.jTabbedPaneBusquedasTipoCodigoRetencionSri.indexOfComponent(this.jPanelFK_IdPaisTipoCodigoRetencionSri);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponent(index);
				jPanel.setBorder(this.tipocodigoretencionsriConstantesFunciones.resaltarFK_IdPaisTipoCodigoRetencionSri);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCodigoRetencionSri() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCodigoRetencionSri.indexOfComponent(this.jPanelBusquedaPorCodigoTipoCodigoRetencionSri);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocodigoretencionsriConstantesFunciones.mostrarBusquedaPorCodigoTipoCodigoRetencionSri);
			if(!this.tipocodigoretencionsriConstantesFunciones.mostrarBusquedaPorCodigoTipoCodigoRetencionSri && index>-1) {
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoCodigoRetencionSri.indexOfComponent(this.jPanelBusquedaPorNombreTipoCodigoRetencionSri);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocodigoretencionsriConstantesFunciones.mostrarBusquedaPorNombreTipoCodigoRetencionSri);
			if(!this.tipocodigoretencionsriConstantesFunciones.mostrarBusquedaPorNombreTipoCodigoRetencionSri && index>-1) {
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoCodigoRetencionSri.indexOfComponent(this.jPanelFK_IdPaisTipoCodigoRetencionSri);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocodigoretencionsriConstantesFunciones.mostrarFK_IdPaisTipoCodigoRetencionSri);
			if(!this.tipocodigoretencionsriConstantesFunciones.mostrarFK_IdPaisTipoCodigoRetencionSri && index>-1) {
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCodigoRetencionSri() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCodigoRetencionSri.indexOfComponent(this.jPanelBusquedaPorCodigoTipoCodigoRetencionSri);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocodigoretencionsriConstantesFunciones.activarBusquedaPorCodigoTipoCodigoRetencionSri);
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setEnabledAt(index,this.tipocodigoretencionsriConstantesFunciones.activarBusquedaPorCodigoTipoCodigoRetencionSri);
			}

			index= this.jTabbedPaneBusquedasTipoCodigoRetencionSri.indexOfComponent(this.jPanelBusquedaPorNombreTipoCodigoRetencionSri);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocodigoretencionsriConstantesFunciones.activarBusquedaPorNombreTipoCodigoRetencionSri);
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setEnabledAt(index,this.tipocodigoretencionsriConstantesFunciones.activarBusquedaPorNombreTipoCodigoRetencionSri);
			}

			index= this.jTabbedPaneBusquedasTipoCodigoRetencionSri.indexOfComponent(this.jPanelFK_IdPaisTipoCodigoRetencionSri);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocodigoretencionsriConstantesFunciones.activarFK_IdPaisTipoCodigoRetencionSri);
				this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setEnabledAt(index,this.tipocodigoretencionsriConstantesFunciones.activarFK_IdPaisTipoCodigoRetencionSri);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCodigoRetencionSri(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoCodigoRetencionSri.indexOfComponent(this.jPanelBusquedaPorCodigoTipoCodigoRetencionSri);

			this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponent(index);

			this.tipocodigoretencionsriConstantesFunciones.setResaltarBusquedaPorCodigoTipoCodigoRetencionSri(resaltar);

			jPanel.setBorder(this.tipocodigoretencionsriConstantesFunciones.resaltarBusquedaPorCodigoTipoCodigoRetencionSri);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoCodigoRetencionSri.indexOfComponent(this.jPanelBusquedaPorNombreTipoCodigoRetencionSri);

			this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponent(index);

			this.tipocodigoretencionsriConstantesFunciones.setResaltarBusquedaPorNombreTipoCodigoRetencionSri(resaltar);

			jPanel.setBorder(this.tipocodigoretencionsriConstantesFunciones.resaltarBusquedaPorNombreTipoCodigoRetencionSri);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoCodigoRetencionSri.indexOfComponent(this.jPanelFK_IdPaisTipoCodigoRetencionSri);

			this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCodigoRetencionSri.getComponent(index);

			this.tipocodigoretencionsriConstantesFunciones.setResaltarFK_IdPaisTipoCodigoRetencionSri(resaltar);

			jPanel.setBorder(this.tipocodigoretencionsriConstantesFunciones.resaltarFK_IdPaisTipoCodigoRetencionSri);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoCodigoRetencionSri.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCodigoRetencionSri() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCodigoRetencionSri();
		this.updateVisibilidadResaltarControlesFormularioTipoCodigoRetencionSri();
		this.updateHabilitarResaltarControlesFormularioTipoCodigoRetencionSri();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCodigoRetencionSri() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocodigoretencionsriConstantesFunciones.resaltaridTipoCodigoRetencionSri!=null && this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelidTipoCodigoRetencionSri.setBorder(this.tipocodigoretencionsriConstantesFunciones.resaltaridTipoCodigoRetencionSri);}
		if(this.tipocodigoretencionsriConstantesFunciones.resaltarid_paisTipoCodigoRetencionSri!=null && this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.setBorder(this.tipocodigoretencionsriConstantesFunciones.resaltarid_paisTipoCodigoRetencionSri);}
		if(this.tipocodigoretencionsriConstantesFunciones.resaltarcodigoTipoCodigoRetencionSri!=null && this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextFieldcodigoTipoCodigoRetencionSri.setBorder(this.tipocodigoretencionsriConstantesFunciones.resaltarcodigoTipoCodigoRetencionSri);}
		if(this.tipocodigoretencionsriConstantesFunciones.resaltarnombreTipoCodigoRetencionSri!=null && this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextAreanombreTipoCodigoRetencionSri.setBorder(this.tipocodigoretencionsriConstantesFunciones.resaltarnombreTipoCodigoRetencionSri);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCodigoRetencionSri() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
	
		//this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelidTipoCodigoRetencionSri.setVisible(this.tipocodigoretencionsriConstantesFunciones.mostraridTipoCodigoRetencionSri);
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jPanelidTipoCodigoRetencionSri.setVisible(this.tipocodigoretencionsriConstantesFunciones.mostraridTipoCodigoRetencionSri);
		//this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.setVisible(this.tipocodigoretencionsriConstantesFunciones.mostrarid_paisTipoCodigoRetencionSri);
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jPanelid_paisTipoCodigoRetencionSri.setVisible(this.tipocodigoretencionsriConstantesFunciones.mostrarid_paisTipoCodigoRetencionSri);
		//this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextFieldcodigoTipoCodigoRetencionSri.setVisible(this.tipocodigoretencionsriConstantesFunciones.mostrarcodigoTipoCodigoRetencionSri);
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jPanelcodigoTipoCodigoRetencionSri.setVisible(this.tipocodigoretencionsriConstantesFunciones.mostrarcodigoTipoCodigoRetencionSri);
		//this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextAreanombreTipoCodigoRetencionSri.setVisible(this.tipocodigoretencionsriConstantesFunciones.mostrarnombreTipoCodigoRetencionSri);
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jPanelnombreTipoCodigoRetencionSri.setVisible(this.tipocodigoretencionsriConstantesFunciones.mostrarnombreTipoCodigoRetencionSri);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCodigoRetencionSri() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCodigoRetencionSri!=null) {
	
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jLabelidTipoCodigoRetencionSri.setEnabled(this.tipocodigoretencionsriConstantesFunciones.activaridTipoCodigoRetencionSri);
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jComboBoxid_paisTipoCodigoRetencionSri.setEnabled(this.tipocodigoretencionsriConstantesFunciones.activarid_paisTipoCodigoRetencionSri);
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextFieldcodigoTipoCodigoRetencionSri.setEnabled(this.tipocodigoretencionsriConstantesFunciones.activarcodigoTipoCodigoRetencionSri);
		this.jInternalFrameDetalleFormTipoCodigoRetencionSri.jTextAreanombreTipoCodigoRetencionSri.setEnabled(this.tipocodigoretencionsriConstantesFunciones.activarnombreTipoCodigoRetencionSri);
		}
	}
	
		
}