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

import com.bydan.erp.contabilidad.util.EstadoAsientoContableConstantesFunciones;
import com.bydan.erp.contabilidad.util.EstadoAsientoContableParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.EstadoAsientoContableParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.EstadoAsientoContableBean;
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
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoAsientoContableBeanSwingJInternalFrame extends EstadoAsientoContableJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoAsientoContableBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoAsientoContable> estadoasientocontableValidator = new ClassValidator<EstadoAsientoContable>(EstadoAsientoContable.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoAsientoContable estadoasientocontable;	
	public EstadoAsientoContable estadoasientocontableAux;
	public EstadoAsientoContable estadoasientocontableAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoAsientoContable estadoasientocontableTotales;
	public Long idEstadoAsientoContableActual;
	public Long iIdNuevoEstadoAsientoContable=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboColorGeneral="";

	public List<ColorGeneral> colorgeneralsForeignKey;

	public List<ColorGeneral> getcolorgeneralsForeignKey() {
		return colorgeneralsForeignKey;
	}

	public void setcolorgeneralsForeignKey(List<ColorGeneral> colorgeneralsForeignKey) {
		this.colorgeneralsForeignKey = colorgeneralsForeignKey;
	}

	//OBJETO FK ACTUAL
	public ColorGeneral colorgeneralForeignKey;

	public ColorGeneral getcolorgeneralForeignKey() {
		return colorgeneralForeignKey;
	}

	public void setcolorgeneralForeignKey(ColorGeneral colorgeneralForeignKey) {
		this.colorgeneralForeignKey = colorgeneralForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosParametroContabilidadDefecto=false;

	public Boolean getIsTienePermisosParametroContabilidadDefecto() {
		return isTienePermisosParametroContabilidadDefecto;
	}

	public void setIsTienePermisosParametroContabilidadDefecto(Boolean isTienePermisosParametroContabilidadDefecto) {
		this.isTienePermisosParametroContabilidadDefecto= isTienePermisosParametroContabilidadDefecto;
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
	
	public Boolean isPermisoTodoEstadoAsientoContable;
	public Boolean isPermisoNuevoEstadoAsientoContable;
	public Boolean isPermisoActualizarEstadoAsientoContable;
	public Boolean isPermisoActualizarOriginalEstadoAsientoContable;
	public Boolean isPermisoEliminarEstadoAsientoContable;
	public Boolean isPermisoGuardarCambiosEstadoAsientoContable;
	public Boolean isPermisoConsultaEstadoAsientoContable;
	public Boolean isPermisoBusquedaEstadoAsientoContable;
	public Boolean isPermisoReporteEstadoAsientoContable;
	public Boolean isPermisoPaginacionMedioEstadoAsientoContable;
	public Boolean isPermisoPaginacionAltoEstadoAsientoContable;
	public Boolean isPermisoPaginacionTodoEstadoAsientoContable;
	public Boolean isPermisoCopiarEstadoAsientoContable;
	public Boolean isPermisoVerFormEstadoAsientoContable;
	public Boolean isPermisoDuplicarEstadoAsientoContable;
	public Boolean isPermisoOrdenEstadoAsientoContable;
	
	
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
	
	public EstadoAsientoContableParameterReturnGeneral estadoasientocontableReturnGeneral;
	public EstadoAsientoContableParameterReturnGeneral estadoasientocontableParameterGeneral;
	
	

	public ParametroContabilidadDefectoLogic parametrocontabilidaddefectoLogic=null;

	public ParametroContabilidadDefectoLogic getParametroContabilidadDefectoLogic() {
		return parametrocontabilidaddefectoLogic;
	}

	public void setParametroContabilidadDefectoLogic(ParametroContabilidadDefectoLogic parametrocontabilidaddefectoLogic) {
		this.parametrocontabilidaddefectoLogic = parametrocontabilidaddefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoAsientoContable=false;
	public Boolean esParaAccionDesdeFormularioEstadoAsientoContable=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoAsientoContableLogic estadoasientocontableLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoAsientoContable estadoasientocontableBean;
	public EstadoAsientoContableConstantesFunciones estadoasientocontableConstantesFunciones;
	//public EstadoAsientoContableParameterReturnGeneral estadoasientocontableReturnGeneral;
	
	//FK
	
	public ColorGeneralLogic colorgeneralLogic;
	
	//PARAMETROS
	
	
	//public List<EstadoAsientoContable> estadoasientocontables;	
	//public List<EstadoAsientoContable> estadoasientocontablesEliminados;
	//public List<EstadoAsientoContable> estadoasientocontablesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoAsientoContable=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoAsientoContable=true;
	public Boolean isVisibilidadCeldaCopiarEstadoAsientoContable=true;
	public Boolean isVisibilidadCeldaVerFormEstadoAsientoContable=true;
	public Boolean isVisibilidadCeldaOrdenEstadoAsientoContable=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=false;
	public Boolean isVisibilidadCeldaModificarEstadoAsientoContable=false;
	public Boolean isVisibilidadCeldaActualizarEstadoAsientoContable=false;
	public Boolean isVisibilidadCeldaEliminarEstadoAsientoContable=false;
	public Boolean isVisibilidadCeldaCancelarEstadoAsientoContable=false;
	public Boolean isVisibilidadCeldaGuardarEstadoAsientoContable=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=false;	
	
	
	public Boolean isVisibilidadFK_IdColorGeneral=false;
	
	public Long getiIdNuevoEstadoAsientoContable() {
		return this.iIdNuevoEstadoAsientoContable;
	}

	public void setiIdNuevoEstadoAsientoContable(Long iIdNuevoEstadoAsientoContable) {
		this.iIdNuevoEstadoAsientoContable = iIdNuevoEstadoAsientoContable;
	}
	
	public Long getidEstadoAsientoContableActual() {
		return this.idEstadoAsientoContableActual;
	}

	public void setidEstadoAsientoContableActual(Long idEstadoAsientoContableActual) {
		this.idEstadoAsientoContableActual = idEstadoAsientoContableActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoAsientoContable getestadoasientocontable() {
		return this.estadoasientocontable;
	}

	public void setestadoasientocontable(EstadoAsientoContable estadoasientocontable) {
		this.estadoasientocontable = estadoasientocontable;
	}
	
	public EstadoAsientoContable getestadoasientocontableAux() {
		return this.estadoasientocontableAux;
	}

	public void setestadoasientocontableAux(EstadoAsientoContable estadoasientocontableAux) {
		this.estadoasientocontableAux = estadoasientocontableAux;
	}				
	
	public EstadoAsientoContable getestadoasientocontableAnterior() {
		return this.estadoasientocontableAnterior;
	}

	public void setestadoasientocontableAnterior(EstadoAsientoContable estadoasientocontableAnterior) {
		this.estadoasientocontableAnterior = estadoasientocontableAnterior;
	}	
	
	public EstadoAsientoContable getestadoasientocontableTotales() {
		return this.estadoasientocontableTotales;
	}

	public void setestadoasientocontableTotales(EstadoAsientoContable estadoasientocontableTotales) {
		this.estadoasientocontableTotales = estadoasientocontableTotales;
	}	
	
	public EstadoAsientoContable getestadoasientocontableBean() {
		return this.estadoasientocontableBean;
	}

	public void setestadoasientocontableBean(EstadoAsientoContable estadoasientocontableBean) {
		this.estadoasientocontableBean = estadoasientocontableBean;
	}	
	
	public EstadoAsientoContableParameterReturnGeneral getestadoasientocontableReturnGeneral() {
		return this.estadoasientocontableReturnGeneral;
	}

	public void setestadoasientocontableReturnGeneral(EstadoAsientoContableParameterReturnGeneral estadoasientocontableReturnGeneral) {
		this.estadoasientocontableReturnGeneral = estadoasientocontableReturnGeneral;
	}	
	
	
	public Long id_color_generalFK_IdColorGeneral=-1L;

	public Long getid_color_generalFK_IdColorGeneral() {
		return this.id_color_generalFK_IdColorGeneral;
	}

	public void setid_color_generalFK_IdColorGeneral(Long id_color_generalFK_IdColorGeneral) {
		this.id_color_generalFK_IdColorGeneral = id_color_generalFK_IdColorGeneral;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoAsientoContableLogic getEstadoAsientoContableLogic()	{		
		return estadoasientocontableLogic;
	}

	public void setEstadoAsientoContableLogic(EstadoAsientoContableLogic estadoasientocontableLogic) {
		this.estadoasientocontableLogic = estadoasientocontableLogic;
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
	
	public Boolean getIsEsNuevoEstadoAsientoContable() {
		return isEsNuevoEstadoAsientoContable;
	}

	public void setIsEsNuevoEstadoAsientoContable(Boolean isEsNuevoEstadoAsientoContable) {
		this.isEsNuevoEstadoAsientoContable = isEsNuevoEstadoAsientoContable;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoAsientoContable() {
		return esParaAccionDesdeFormularioEstadoAsientoContable;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoAsientoContable(Boolean esParaAccionDesdeFormularioEstadoAsientoContable) {
		this.esParaAccionDesdeFormularioEstadoAsientoContable = esParaAccionDesdeFormularioEstadoAsientoContable;
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
	
	
	public void cargarCombosColorGeneralsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.colorgeneralsForeignKey=new ArrayList<ColorGeneral>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ColorGeneralLogic colorgeneralLogic=new ColorGeneralLogic();

			colorgeneralLogic.getColorGeneralDataAccess().setIsForForeingKeyData(true);

			if(this.estadoasientocontableSessionBean==null) {
				this.estadoasientocontableSessionBean=new EstadoAsientoContableSessionBean();
			}

			if(!this.estadoasientocontableSessionBean.getisBusquedaDesdeForeignKeySesionColorGeneral()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorgeneralLogic.getColorGeneralDataAccess().setIsForForeingKeyData(true);

					colorgeneralLogic.getTodosColorGeneralsWithConnection(sFinalQuery,new Pagination());

					this.colorgeneralsForeignKey=colorgeneralLogic.getColorGenerals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaColorGeneral(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorgeneralLogic.getEntityWithConnection(estadoasientocontableSessionBean.getlidColorGeneralActual());
					this.colorgeneralsForeignKey.add(colorgeneralLogic.getColorGeneral());
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

	
	
	public void setActualColorGeneralForeignKey(Long idColorGeneralSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ColorGeneral  colorgeneralTemp=null;

			for(ColorGeneral colorgeneralAux:colorgeneralsForeignKey) {
				if(colorgeneralAux.getId()!=null && colorgeneralAux.getId().equals(idColorGeneralSeleccionado)) {
					colorgeneralTemp=colorgeneralAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(colorgeneralTemp!=null) {

					if(this.estadoasientocontable!=null) {
						this.estadoasientocontable.setColorGeneral(colorgeneralTemp);
					}

					if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
						this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.setSelectedItem(colorgeneralTemp);
					}
				} else {
					//jComboBoxid_color_generalEstadoAsientoContable.setSelectedItem(colorgeneralTemp);
					if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
						if(this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdColorGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(colorgeneralTemp!=null && jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable!=null) {
						jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.setSelectedItem(colorgeneralTemp);
					} else {
						if(jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable!=null) {
							//jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.setSelectedItem(colorgeneralTemp);
							if(jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.getItemCount()>0) {
								jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.setSelectedIndex(0);
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

	public String getActualColorGeneralForeignKeyDescripcion(Long idColorGeneralSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ColorGeneral  colorgeneralTemp=null;

			for(ColorGeneral colorgeneralAux:colorgeneralsForeignKey) {
				if(colorgeneralAux.getId()!=null && colorgeneralAux.getId().equals(idColorGeneralSeleccionado)) {
					colorgeneralTemp=colorgeneralAux;
					break;
				}
			}


			sDescripcion=ColorGeneralConstantesFunciones.getColorGeneralDescripcion(colorgeneralTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualColorGeneralForeignKeyGenerico(Long idColorGeneralSeleccionado,JComboBox jComboBoxid_color_generalEstadoAsientoContableGenerico)throws Exception
	{
		try
		{
			ColorGeneral  colorgeneralTemp=null;

			for(ColorGeneral colorgeneralAux:colorgeneralsForeignKey) {
				if(colorgeneralAux.getId()!=null && colorgeneralAux.getId().equals(idColorGeneralSeleccionado)) {
					colorgeneralTemp=colorgeneralAux;
					break;
				}
			}

			if(colorgeneralTemp!=null) {
				jComboBoxid_color_generalEstadoAsientoContableGenerico.setSelectedItem(colorgeneralTemp);
			} else {
				if(jComboBoxid_color_generalEstadoAsientoContableGenerico!=null && jComboBoxid_color_generalEstadoAsientoContableGenerico.getItemCount()>0) {
					jComboBoxid_color_generalEstadoAsientoContableGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarColorGeneralForeignKey(EstadoAsientoContable estadoasientocontable,JComboBox jComboBoxid_color_generalEstadoAsientoContableGenerico)throws Exception
	{
		try
		{
			ColorGeneral  colorgeneralAux=new ColorGeneral();

			if(jComboBoxid_color_generalEstadoAsientoContableGenerico==null) {
				colorgeneralAux=(ColorGeneral)this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.getSelectedItem();
			} else {
				colorgeneralAux=(ColorGeneral)jComboBoxid_color_generalEstadoAsientoContableGenerico.getSelectedItem();
			}

			if(colorgeneralAux!=null && colorgeneralAux.getId()!=null) {
				estadoasientocontable.setid_color_general(colorgeneralAux.getId());
				estadoasientocontable.setcolorgeneral_descripcion(EstadoAsientoContableConstantesFunciones.getColorGeneralDescripcion(colorgeneralAux));
				estadoasientocontable.setColorGeneral(colorgeneralAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameColorGeneralsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingColorGeneral=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { 
							this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.removeAllItems();

							for(ColorGeneral colorgeneral:this.colorgeneralsForeignKey) {
								this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.addItem(colorgeneral);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { 
					}

					if(!EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdColorGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.removeAllItems();

							for(ColorGeneral colorgeneral:this.colorgeneralsForeignKey) {
								this.jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.addItem(colorgeneral);
							}
						}

						if(!EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameColorGeneralForeignKey(ColorGeneral colorgeneral,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
							this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.setSelectedItem(colorgeneral);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
							this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.setSelectedItem(colorgeneral);
						} else {
							this.jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEstadoAsientoContable() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoAsientoContableConstantesFunciones.refrescarForeignKeysDescripcionesEstadoAsientoContable(this.estadoasientocontableLogic.getEstadoAsientoContables());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoAsientoContableConstantesFunciones.refrescarForeignKeysDescripcionesEstadoAsientoContable(this.estadoasientocontables);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(ColorGeneral.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoasientocontableLogic.setEstadoAsientoContables(this.estadoasientocontables);
			estadoasientocontableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoAsientoContableParameterReturnGeneral getEstadoAsientoContableParameterGeneral() {
		return this.estadoasientocontableParameterGeneral;
	}
	
	public void setEstadoAsientoContableParameterGeneral(EstadoAsientoContableParameterReturnGeneral estadoasientocontableParameterGeneral) {
		this.estadoasientocontableParameterGeneral = estadoasientocontableParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoAsientoContable() {
		return isPermisoTodoEstadoAsientoContable;
	}

	public void setIsPermisoTodoEstadoAsientoContable(Boolean isPermisoTodoEstadoAsientoContable) {
		this.isPermisoTodoEstadoAsientoContable = isPermisoTodoEstadoAsientoContable;
	}

	public Boolean getIsPermisoNuevoEstadoAsientoContable() {
		return isPermisoNuevoEstadoAsientoContable;
	}

	public void setIsPermisoNuevoEstadoAsientoContable(Boolean isPermisoNuevoEstadoAsientoContable) {
		this.isPermisoNuevoEstadoAsientoContable = isPermisoNuevoEstadoAsientoContable;
	}

	public Boolean getIsPermisoActualizarEstadoAsientoContable() {
		return isPermisoActualizarEstadoAsientoContable;
	}

	public void setIsPermisoActualizarEstadoAsientoContable(Boolean isPermisoActualizarEstadoAsientoContable) {
		this.isPermisoActualizarEstadoAsientoContable = isPermisoActualizarEstadoAsientoContable;
	}

	public Boolean getIsPermisoEliminarEstadoAsientoContable() {
		return isPermisoEliminarEstadoAsientoContable;
	}

	public void setIsPermisoEliminarEstadoAsientoContable(Boolean isPermisoEliminarEstadoAsientoContable) {
		this.isPermisoEliminarEstadoAsientoContable = isPermisoEliminarEstadoAsientoContable;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoAsientoContable() {
		return isPermisoGuardarCambiosEstadoAsientoContable;
	}

	public void setIsPermisoGuardarCambiosEstadoAsientoContable(Boolean isPermisoGuardarCambiosEstadoAsientoContable) {
		this.isPermisoGuardarCambiosEstadoAsientoContable = isPermisoGuardarCambiosEstadoAsientoContable;
	}
	
	public Boolean getIsPermisoConsultaEstadoAsientoContable() {
		return isPermisoConsultaEstadoAsientoContable;
	}

	public void setIsPermisoConsultaEstadoAsientoContable(Boolean isPermisoConsultaEstadoAsientoContable) {
		this.isPermisoConsultaEstadoAsientoContable = isPermisoConsultaEstadoAsientoContable;
	}

	public Boolean getIsPermisoBusquedaEstadoAsientoContable() {
		return isPermisoBusquedaEstadoAsientoContable;
	}

	public void setIsPermisoBusquedaEstadoAsientoContable(Boolean isPermisoBusquedaEstadoAsientoContable) {
		this.isPermisoBusquedaEstadoAsientoContable = isPermisoBusquedaEstadoAsientoContable;
	}

	public Boolean getIsPermisoReporteEstadoAsientoContable() {
		return isPermisoReporteEstadoAsientoContable;
	}

	public void setIsPermisoReporteEstadoAsientoContable(Boolean isPermisoReporteEstadoAsientoContable) {
		this.isPermisoReporteEstadoAsientoContable = isPermisoReporteEstadoAsientoContable;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoAsientoContable() {
		return isPermisoPaginacionMedioEstadoAsientoContable;
	}

	public void setIsPermisoPaginacionMedioEstadoAsientoContable(Boolean isPermisoPaginacionMedioEstadoAsientoContable) {
		this.isPermisoPaginacionMedioEstadoAsientoContable = isPermisoPaginacionMedioEstadoAsientoContable;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoAsientoContable() {
		return isPermisoPaginacionTodoEstadoAsientoContable;
	}

	public void setIsPermisoPaginacionTodoEstadoAsientoContable(Boolean isPermisoPaginacionTodoEstadoAsientoContable) {
		this.isPermisoPaginacionTodoEstadoAsientoContable = isPermisoPaginacionTodoEstadoAsientoContable;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoAsientoContable() {
		return isPermisoPaginacionAltoEstadoAsientoContable;
	}

	public void setIsPermisoPaginacionAltoEstadoAsientoContable(Boolean isPermisoPaginacionAltoEstadoAsientoContable) {
		this.isPermisoPaginacionAltoEstadoAsientoContable = isPermisoPaginacionAltoEstadoAsientoContable;
	}
	
	public Boolean getIsPermisoCopiarEstadoAsientoContable() {
		return isPermisoCopiarEstadoAsientoContable;
	}

	public void setIsPermisoCopiarEstadoAsientoContable(Boolean isPermisoCopiarEstadoAsientoContable) {
		this.isPermisoCopiarEstadoAsientoContable = isPermisoCopiarEstadoAsientoContable;
	}
	
	public Boolean getIsPermisoVerFormEstadoAsientoContable() {
		return isPermisoVerFormEstadoAsientoContable;
	}

	public void setIsPermisoVerFormEstadoAsientoContable(Boolean isPermisoVerFormEstadoAsientoContable) {
		this.isPermisoVerFormEstadoAsientoContable = isPermisoVerFormEstadoAsientoContable;
	}
	
	public Boolean getIsPermisoDuplicarEstadoAsientoContable() {
		return isPermisoDuplicarEstadoAsientoContable;
	}

	public void setIsPermisoDuplicarEstadoAsientoContable(Boolean isPermisoDuplicarEstadoAsientoContable) {
		this.isPermisoDuplicarEstadoAsientoContable = isPermisoDuplicarEstadoAsientoContable;
	}
	
	public Boolean getIsPermisoOrdenEstadoAsientoContable() {
		return isPermisoOrdenEstadoAsientoContable;
	}

	public void setIsPermisoOrdenEstadoAsientoContable(Boolean isPermisoOrdenEstadoAsientoContable) {
		this.isPermisoOrdenEstadoAsientoContable = isPermisoOrdenEstadoAsientoContable;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoAsientoContable() {
		return isVisibilidadCeldaNuevoEstadoAsientoContable;
	}

	public void setIsVisibilidadCeldaNuevoEstadoAsientoContable(Boolean isVisibilidadCeldaNuevoEstadoAsientoContable) {
		this.isVisibilidadCeldaNuevoEstadoAsientoContable = isVisibilidadCeldaNuevoEstadoAsientoContable;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoAsientoContable() {
		return isVisibilidadCeldaDuplicarEstadoAsientoContable;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoAsientoContable(Boolean isVisibilidadCeldaDuplicarEstadoAsientoContable) {
		this.isVisibilidadCeldaDuplicarEstadoAsientoContable = isVisibilidadCeldaDuplicarEstadoAsientoContable;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoAsientoContable() {
		return isVisibilidadCeldaCopiarEstadoAsientoContable;
	}

	public void setIsVisibilidadCeldaCopiarEstadoAsientoContable(Boolean isVisibilidadCeldaCopiarEstadoAsientoContable) {
		this.isVisibilidadCeldaCopiarEstadoAsientoContable = isVisibilidadCeldaCopiarEstadoAsientoContable;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoAsientoContable() {
		return isVisibilidadCeldaVerFormEstadoAsientoContable;
	}

	public void setIsVisibilidadCeldaVerFormEstadoAsientoContable(Boolean isVisibilidadCeldaVerFormEstadoAsientoContable) {
		this.isVisibilidadCeldaVerFormEstadoAsientoContable = isVisibilidadCeldaVerFormEstadoAsientoContable;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoAsientoContable() {
		return isVisibilidadCeldaOrdenEstadoAsientoContable;
	}

	public void setIsVisibilidadCeldaOrdenEstadoAsientoContable(Boolean isVisibilidadCeldaOrdenEstadoAsientoContable) {
		this.isVisibilidadCeldaOrdenEstadoAsientoContable = isVisibilidadCeldaOrdenEstadoAsientoContable;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoAsientoContable() {
		return isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoAsientoContable(Boolean isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable = isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoAsientoContable() {
		return isVisibilidadCeldaModificarEstadoAsientoContable;
	}

	public void setIsVisibilidadCeldaModificarEstadoAsientoContable(Boolean isVisibilidadCeldaModificarEstadoAsientoContable) {
		this.isVisibilidadCeldaModificarEstadoAsientoContable = isVisibilidadCeldaModificarEstadoAsientoContable;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoAsientoContable() {
		return isVisibilidadCeldaActualizarEstadoAsientoContable;
	}

	public void setIsVisibilidadCeldaActualizarEstadoAsientoContable(Boolean isVisibilidadCeldaActualizarEstadoAsientoContable) {
		this.isVisibilidadCeldaActualizarEstadoAsientoContable = isVisibilidadCeldaActualizarEstadoAsientoContable;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoAsientoContable() {
		return isVisibilidadCeldaEliminarEstadoAsientoContable;
	}

	public void setIsVisibilidadCeldaEliminarEstadoAsientoContable(Boolean isVisibilidadCeldaEliminarEstadoAsientoContable) {
		this.isVisibilidadCeldaEliminarEstadoAsientoContable = isVisibilidadCeldaEliminarEstadoAsientoContable;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoAsientoContable() {
		return isVisibilidadCeldaCancelarEstadoAsientoContable;
	}

	public void setIsVisibilidadCeldaCancelarEstadoAsientoContable(Boolean isVisibilidadCeldaCancelarEstadoAsientoContable) {
		this.isVisibilidadCeldaCancelarEstadoAsientoContable = isVisibilidadCeldaCancelarEstadoAsientoContable;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoAsientoContable() {
		return isVisibilidadCeldaGuardarEstadoAsientoContable;
	}

	public void setIsVisibilidadCeldaGuardarEstadoAsientoContable(Boolean isVisibilidadCeldaGuardarEstadoAsientoContable) {
		this.isVisibilidadCeldaGuardarEstadoAsientoContable = isVisibilidadCeldaGuardarEstadoAsientoContable;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoAsientoContable() {
		return isVisibilidadCeldaGuardarCambiosEstadoAsientoContable;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoAsientoContable(Boolean isVisibilidadCeldaGuardarCambiosEstadoAsientoContable) {
		this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable = isVisibilidadCeldaGuardarCambiosEstadoAsientoContable;
	}
		
	public EstadoAsientoContableSessionBean getestadoasientocontableSessionBean() {
		return this.estadoasientocontableSessionBean;
	}
	
	public void setestadoasientocontableSessionBean(EstadoAsientoContableSessionBean estadoasientocontableSessionBean) {
		this.estadoasientocontableSessionBean=estadoasientocontableSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdColorGeneral() {
		return this.isVisibilidadFK_IdColorGeneral;
	}

	public void setisVisibilidadFK_IdColorGeneral(Boolean isVisibilidadFK_IdColorGeneral) {
		this.isVisibilidadFK_IdColorGeneral=isVisibilidadFK_IdColorGeneral;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(EstadoAsientoContable estadoasientocontable)throws Exception {
		try {
			
				this.setActualParaGuardarColorGeneralForeignKey(estadoasientocontable,null);
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
	
	public void bugActualizarReferenciaActual(EstadoAsientoContable estadoasientocontable,EstadoAsientoContable estadoasientocontableAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoAsientoContable(estadoasientocontable);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoasientocontableAux.setId(estadoasientocontable.getId());
		estadoasientocontableAux.setVersionRow(estadoasientocontable.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoAsientoContable();
		
			int intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.estadoasientocontable,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoasientocontableValidator.getInvalidValues(this.estadoasientocontable);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoasientocontableLogic.setDatosCliente(datosCliente);
			estadoasientocontableLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoasientocontableAux=new  EstadoAsientoContable();
				
				estadoasientocontableAux.setIsNew(true);
				estadoasientocontableAux.setIsChanged(true);
				
				estadoasientocontableAux.setEstadoAsientoContableOriginal(this.estadoasientocontable);
				
				estadoasientocontableAux.setId(this.estadoasientocontable.getId());	
				estadoasientocontableAux.setVersionRow(this.estadoasientocontable.getVersionRow());	
				estadoasientocontableAux.setcodigo(this.estadoasientocontable.getcodigo());	
				estadoasientocontableAux.setnombre(this.estadoasientocontable.getnombre());	
				estadoasientocontableAux.setid_color_general(this.estadoasientocontable.getid_color_general());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoasientocontableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoasientocontableAux,estadoasientocontableLogic.getEstadoAsientoContables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoasientocontableAux,estadoasientocontables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoasientocontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoasientocontableLogic.saveEstadoAsientoContables();//WithConnection
						//estadoasientocontableLogic.getSetVersionRowEstadoAsientoContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoasientocontable,estadoasientocontableAux);
					
					this.refrescarForeignKeysDescripcionesEstadoAsientoContable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoasientocontableAux=new  EstadoAsientoContable();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoasientocontableSessionBean.getEsGuardarRelacionado() && this.estadoasientocontable.getId()>=0)) {
						
					estadoasientocontableAux.setIsNew(false);
				}
				
				estadoasientocontableAux.setIsDeleted(false);
			
				estadoasientocontableAux.setId(this.estadoasientocontable.getId());	
				estadoasientocontableAux.setVersionRow(this.estadoasientocontable.getVersionRow());	
				estadoasientocontableAux.setcodigo(this.estadoasientocontable.getcodigo());	
				estadoasientocontableAux.setnombre(this.estadoasientocontable.getnombre());	
				estadoasientocontableAux.setid_color_general(this.estadoasientocontable.getid_color_general());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoasientocontableAux,estadoasientocontableLogic.getEstadoAsientoContables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoasientocontableAux,estadoasientocontables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoasientocontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoasientocontableLogic.saveEstadoAsientoContables();//WithConnection
						//estadoasientocontableLogic.getSetVersionRowEstadoAsientoContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoasientocontable,estadoasientocontableAux);
					
					this.refrescarForeignKeysDescripcionesEstadoAsientoContable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoasientocontableAux=new  EstadoAsientoContable();
				
				estadoasientocontableAux.setIsNew(false);
				estadoasientocontableAux.setIsChanged(false);
				
				estadoasientocontableAux.setIsDeleted(true);
				
				estadoasientocontableAux.setId(this.estadoasientocontable.getId());	
				estadoasientocontableAux.setVersionRow(this.estadoasientocontable.getVersionRow());	
				estadoasientocontableAux.setcodigo(this.estadoasientocontable.getcodigo());	
				estadoasientocontableAux.setnombre(this.estadoasientocontable.getnombre());	
				estadoasientocontableAux.setid_color_general(this.estadoasientocontable.getid_color_general());	
				
				if(this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoasientocontableAux.getId()>=0) {	
						this.estadoasientocontablesEliminados.add(estadoasientocontableAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoasientocontableAux,estadoasientocontableLogic.getEstadoAsientoContables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoasientocontableAux,estadoasientocontables);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoasientocontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoasientocontableLogic.saveEstadoAsientoContables();//WithConnection
						//estadoasientocontableLogic.getSetVersionRowEstadoAsientoContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoasientocontableAux.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoasientocontableSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoasientocontableAux,estadoasientocontableLogic.getEstadoAsientoContables());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoasientocontableAux,estadoasientocontables);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.getEstadoAsientoContables().addAll(this.estadoasientocontablesEliminados);
					
					estadoasientocontableLogic.saveEstadoAsientoContables();//WithConnection
					//estadoasientocontableLogic.getSetVersionRowEstadoAsientoContables();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEstadoAsientoContable();
				
				this.estadoasientocontablesEliminados= new ArrayList<EstadoAsientoContable>();		
			}
			
			if(this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Asiento Contable GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoasientocontable=estadoasientocontableAux;
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
      		//this.finishProcessEstadoAsientoContable();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoAsientoContable estadoasientocontableLocal) throws Exception {
		
		if(this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadoasientocontableLocal.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
			
			} else {
			
				estadoasientocontableLocal.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoAsientoContable estadoasientocontableLocal) throws Exception {	
		if(this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ColorGeneralDetalleFormJInternalFrame.class)) {
				ColorGeneralBeanSwingJInternalFrame colorgeneralBeanSwingJInternalFrameLocal=(ColorGeneralBeanSwingJInternalFrame) ((ColorGeneralDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				colorgeneralBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoColorGeneral(colorgeneralBeanSwingJInternalFrameLocal.getcolorgeneral(),true);
				colorgeneralBeanSwingJInternalFrameLocal.actualizarLista(colorgeneralBeanSwingJInternalFrameLocal.colorgeneral,this.colorgeneralsForeignKey);

				colorgeneralBeanSwingJInternalFrameLocal.actualizarRelaciones(colorgeneralBeanSwingJInternalFrameLocal.colorgeneral);

				estadoasientocontableLocal.setColorGeneral(colorgeneralBeanSwingJInternalFrameLocal.colorgeneral);

				this.addItemDefectoCombosForeignKeyColorGeneral();
				this.cargarCombosFrameColorGeneralsForeignKey("Formulario");
				this.setActualColorGeneralForeignKey(colorgeneralBeanSwingJInternalFrameLocal.colorgeneral.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEstadoAsientoContableActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoasientocontableValidator.getInvalidValues(this.estadoasientocontable);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoAsientoContable estadoasientocontable,List<EstadoAsientoContable> estadoasientocontables) throws Exception {
		try	{		
			EstadoAsientoContableConstantesFunciones.actualizarLista(estadoasientocontable,estadoasientocontables,this.estadoasientocontableSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoAsientoContable estadoasientocontable,List<EstadoAsientoContable> estadoasientocontables) throws Exception {
		try	{			
			EstadoAsientoContableConstantesFunciones.actualizarSelectedLista(estadoasientocontable,estadoasientocontables);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoAsientoContable> estadoasientocontablesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoasientocontablesLocal=this.estadoasientocontableLogic.getEstadoAsientoContables();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoasientocontablesLocal=this.estadoasientocontables;
			}
			//ARCHITECTURE
		
			for(EstadoAsientoContable estadoasientocontableLocal:estadoasientocontablesLocal) {
				if(this.permiteMantenimiento(estadoasientocontableLocal) && estadoasientocontableLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoAsientoContableConstantesFunciones.getEstadoAsientoContableLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoAsientoContableConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAsientoContable.jLabelcodigoEstadoAsientoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoAsientoContableConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAsientoContable.jLabelnombreEstadoAsientoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoAsientoContableConstantesFunciones.IDCOLORGENERAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAsientoContable.jLabelid_color_generalEstadoAsientoContable,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoAsientoContable.jLabelcodigoEstadoAsientoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoAsientoContable.jLabelnombreEstadoAsientoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoAsientoContable.jLabelid_color_generalEstadoAsientoContable,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroContabilidadDefecto")) {
			if(this.estadoasientocontable==null) {
				this.estadoasientocontable= new EstadoAsientoContable();
			}

			if(this.estadoasientocontableSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoAsientoContable
				this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.estadoasientocontable,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);

				this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.getparametrocontabilidaddefecto().setEstadoAsientoContable(this.estadoasientocontable);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoAsientoContable--;	
		
		
		this.estadoasientocontableAux=new EstadoAsientoContable();
		
		this.estadoasientocontableAux.setId(this.iIdNuevoEstadoAsientoContable);
		this.estadoasientocontableAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoasientocontableLogic.getEstadoAsientoContables().add(this.estadoasientocontableAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoasientocontables.add(this.estadoasientocontableAux);
		}
		//ARCHITECTURE
		
		this.estadoasientocontable=this.estadoasientocontableAux;
		
		if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoAsientoContable(this.estadoasientocontable);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoAsientoContable(this.estadoasientocontable);
		}
				
		//this.setDefaultControlesEstadoAsientoContable();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoAsientoContable();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoAsientoContable();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoAsientoContable();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoAsientoContable(this.estadoasientocontableBean,this.estadoasientocontable,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {
			classes=EstadoAsientoContableConstantesFunciones.getClassesRelationshipsOfEstadoAsientoContable(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoasientocontableReturnGeneral=estadoasientocontableLogic.procesarEventosEstadoAsientoContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoasientocontableLogic.getEstadoAsientoContables(),this.estadoasientocontable,this.estadoasientocontableParameterGeneral,this.isEsNuevoEstadoAsientoContable,classes);//this.estadoasientocontableLogic.getEstadoAsientoContable()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoAsientoContable(this.estadoasientocontableReturnGeneral,this.estadoasientocontableBean,false);
		
		if(this.estadoasientocontableReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoAsientoContable(this.estadoasientocontableReturnGeneral.getEstadoAsientoContable());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoAsientoContable(this.estadoasientocontableReturnGeneral.getEstadoAsientoContable());
		}
		
		if(this.estadoasientocontableReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoAsientoContable(this.estadoasientocontableReturnGeneral.getEstadoAsientoContable(),classes);//this.estadoasientocontableBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.estadoasientocontable,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoAsientoContable();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoAsientoContable();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoAsientoContable(false);
						
			if(estadoasientocontableSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() && ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroContabilidadDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoAsientoContable();
			}
			
			this.actualizarVisualTableDatosEstadoAsientoContable();
			
			this.jTableDatosEstadoAsientoContable.setRowSelectionInterval(this.getIndiceNuevoEstadoAsientoContable(), this.getIndiceNuevoEstadoAsientoContable());
			
			this.seleccionarFilaTablaEstadoAsientoContableActual();
						
			this.actualizarEstadoCeldasBotonesEstadoAsientoContable("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoAsientoContable(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldcodigoEstadoAsientoContable.setEnabled(isHabilitar && this.estadoasientocontableConstantesFunciones.activarcodigoEstadoAsientoContable);
		this.jInternalFrameDetalleFormEstadoAsientoContable.jTextAreanombreEstadoAsientoContable.setEnabled(isHabilitar && this.estadoasientocontableConstantesFunciones.activarnombreEstadoAsientoContable);	
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.setEnabled(isHabilitar && this.estadoasientocontableConstantesFunciones.activarid_color_generalEstadoAsientoContable);
	};
	
	public void setDefaultControlesEstadoAsientoContable() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoAsientoContable(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoasientocontableSessionBean.setConGuardarRelaciones(true);			
			this.estadoasientocontableSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTabbedPaneRelacionesEstadoAsientoContable.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadoasientocontableSessionBean.setConGuardarRelaciones(false);			
			this.estadoasientocontableSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTabbedPaneRelacionesEstadoAsientoContable.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoAsientoContable() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontableLogic.getEstadoAsientoContables()) {
				if(estadoasientocontableAux.getId().equals(this.iIdNuevoEstadoAsientoContable)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontables) {
				if(estadoasientocontableAux.getId().equals(this.iIdNuevoEstadoAsientoContable)) {
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
	
	public int getIndiceActualEstadoAsientoContable(EstadoAsientoContable estadoasientocontable,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontableLogic.getEstadoAsientoContables()) {
				if(estadoasientocontableAux.getId().equals(estadoasientocontable.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontables) {
				if(estadoasientocontableAux.getId().equals(estadoasientocontable.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoAsientoContable(EstadoAsientoContable estadoasientocontableOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontableLogic.getEstadoAsientoContables()) {
				if(estadoasientocontableAux.getEstadoAsientoContableOriginal().getId().equals(estadoasientocontableOriginal.getId())) {
					existe=true;
					estadoasientocontableOriginal.setId(estadoasientocontableAux.getId());
					estadoasientocontableOriginal.setVersionRow(estadoasientocontableAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontables) {
				if(estadoasientocontableAux.getEstadoAsientoContableOriginal().getId().equals(estadoasientocontableOriginal.getId())) {
					existe=true;
					estadoasientocontableOriginal.setId(estadoasientocontableAux.getId());
					estadoasientocontableOriginal.setVersionRow(estadoasientocontableAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoAsientoContable(Boolean esParaCancelar) throws Exception {
		estadoasientocontablesAux=new ArrayList<EstadoAsientoContable>();
		estadoasientocontableAux=new EstadoAsientoContable();
		
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontableLogic.getEstadoAsientoContables()) {
					if(estadoasientocontableAux.getId()<0) {
						estadoasientocontablesAux.add(estadoasientocontableAux);
					}		
				}
				this.iIdNuevoEstadoAsientoContable=0L;
				this.estadoasientocontableLogic.getEstadoAsientoContables().removeAll(estadoasientocontablesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontables) {
					if(estadoasientocontableAux.getId()<0) {
						estadoasientocontablesAux.add(estadoasientocontableAux);
					}		
				}
				this.iIdNuevoEstadoAsientoContable=0L;
				this.estadoasientocontables.removeAll(estadoasientocontablesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoAsientoContable 
					&& this.estadoasientocontableLogic.getEstadoAsientoContables().size()>0
					) {
					estadoasientocontableAux=this.estadoasientocontableLogic.getEstadoAsientoContables().get(this.estadoasientocontableLogic.getEstadoAsientoContables().size() - 1);
				
					if(estadoasientocontableAux.getId()<0) {
						this.estadoasientocontableLogic.getEstadoAsientoContables().remove(estadoasientocontableAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoAsientoContable && this.estadoasientocontables.size()>0) {
					estadoasientocontableAux=this.estadoasientocontables.get(this.estadoasientocontables.size() - 1);
				
					if(estadoasientocontableAux.getId()<0) {
						this.estadoasientocontables.remove(estadoasientocontableAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoAsientoContable(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoasientocontable.getId()<0) {
				this.estadoasientocontableLogic.getEstadoAsientoContables().remove(this.estadoasientocontable);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoasientocontable.getId()<0) {
				this.estadoasientocontables.remove(this.estadoasientocontable);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoAsientoContable(List<EstadoAsientoContable> estadoasientocontablesAux) throws Exception {
		EstadoAsientoContableConstantesFunciones.setEstadosInicialesEstadoAsientoContable(estadoasientocontablesAux);
	}
	
	public void setEstadosInicialesEstadoAsientoContable(EstadoAsientoContable estadoasientocontableAux) throws Exception {
		EstadoAsientoContableConstantesFunciones.setEstadosInicialesEstadoAsientoContable(estadoasientocontableAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoAsientoContableActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoAsientoContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoAsientoContableActual()) {
				if(!this.isEsNuevoEstadoAsientoContable) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoAsientoContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoAsientoContable=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoAsientoContableActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Asiento Contable ?", "MANTENIMIENTO DE Estado Asiento Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoAsientoContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoAsientoContable estadoasientocontable) throws Exception {
		EstadoAsientoContableConstantesFunciones.seleccionarAsignar(this.estadoasientocontable,estadoasientocontable);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoAsientoContable=this.isPermisoActualizarOriginalEstadoAsientoContable;
			
			
			this.seleccionarAsignar(estadoasientocontable);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoAsientoContableConstantesFunciones.quitarEspaciosEstadoAsientoContable(this.estadoasientocontable,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoAsientoContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoasientocontableSessionBean.setsFuncionBusquedaRapida(this.estadoasientocontableSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoAsientoContable) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoAsientoContable(esParaCancelar);				
				this.cancelarNuevoEstadoAsientoContable(esParaCancelar);								
			}
			
			this.estadoasientocontable=new EstadoAsientoContable();
			
			this.inicializarEstadoAsientoContable();
			
			this.actualizarEstadoCeldasBotonesEstadoAsientoContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoAsientoContable() throws Exception {
		try {
			EstadoAsientoContableConstantesFunciones.inicializarEstadoAsientoContable(this.estadoasientocontable);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoasientocontableLogic.getEstadoAsientoContables().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoAsientoContables(String sAccionBusqueda,List<EstadoAsientoContable> estadoasientocontablesParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoAsientoContable"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoAsientoContableMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoAsientoContableMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoAsientoContable"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Asiento Contables");		
		parameters.put("busquedapor", EstadoAsientoContableConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ParametroContabilidadDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoAsientoContableLogic estadoasientocontableLogicAuxiliar=new EstadoAsientoContableLogic();
					estadoasientocontableLogicAuxiliar.setDatosCliente(estadoasientocontableLogic.getDatosCliente());				
					estadoasientocontableLogicAuxiliar.setEstadoAsientoContables(estadoasientocontablesParaReportes);
					
					estadoasientocontableLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoAsientoContableWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadoasientocontablesParaReportes=estadoasientocontableLogicAuxiliar.getEstadoAsientoContables();
					
					//estadoasientocontableLogic.getNewConnexionToDeep();
					
					//for (EstadoAsientoContable estadoasientocontable:estadoasientocontablesParaReportes) {
					//	estadoasientocontableLogic.deepLoad(estadoasientocontable, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadoasientocontableLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadoasientocontableLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileParametroContabilidadDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroContabilidadDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocontabilidaddefecto", reportFileParametroContabilidadDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoAsientoContable=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoAsientoContableConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoAsientoContableConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoAsientoContable=new JRBeanArrayDataSource(EstadoAsientoContableJInternalFrame.TraerEstadoAsientoContableBeans(estadoasientocontablesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoAsientoContable);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoAsientoContableConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoAsientoContableConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoAsientoContableBean.TraerEstadoAsientoContableBeans(estadoasientocontablesParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoAsientoContables(sAccionBusqueda,sTipoArchivoReporte,estadoasientocontablesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoAsientoContables(sAccionBusqueda,sTipoArchivoReporte,estadoasientocontablesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContableActionPerformed(null);
					//this.generarExcelReporteEstadoAsientoContables(sAccionBusqueda,sTipoArchivoReporte,estadoasientocontablesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoAsientoContables(sAccionBusqueda,sTipoArchivoReporte,estadoasientocontablesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoAsientoContables(sAccionBusqueda,sTipoArchivoReporte,estadoasientocontablesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoAsientoContables(sAccionBusqueda,sTipoArchivoReporte,estadoasientocontablesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoAsientoContables(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoAsientoContable> estadoasientocontablesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontable";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoAsientoContables");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoAsientoContable("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoAsientoContable estadoasientocontable : estadoasientocontablesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoAsientoContableConstantesFunciones.generarExcelReporteDataEstadoAsientoContable("NORMAL",row,workbook,estadoasientocontable,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoAsientoContable(String sTipo,Row row,Workbook workbook) {
		
		EstadoAsientoContableConstantesFunciones.generarExcelReporteHeaderEstadoAsientoContable(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoAsientoContables(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoAsientoContable> estadoasientocontablesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontable_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoAsientoContables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoAsientoContable estadoasientocontable : estadoasientocontablesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoAsientoContableConstantesFunciones.getEstadoAsientoContableDescripcion(estadoasientocontable));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoAsientoContableConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoAsientoContableConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoasientocontable.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoasientocontable.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoasientocontable.getcolorgeneral_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoAsientoContables(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoAsientoContable> estadoasientocontablesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoAsientoContable> estadoasientocontablesRespaldo=null;
		
		classes=EstadoAsientoContableConstantesFunciones.getClassesRelationshipsOfEstadoAsientoContable(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoasientocontableLogic.setDatosCliente(this.datosCliente);
		this.estadoasientocontableLogic.setDatosDeep(this.datosDeep);
		this.estadoasientocontableLogic.setIsConDeep(true);
		
		estadoasientocontablesRespaldo=this.estadoasientocontableLogic.getEstadoAsientoContables();
		
		this.estadoasientocontableLogic.setEstadoAsientoContables(estadoasientocontablesParaReportes);	
		this.estadoasientocontableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoasientocontablesParaReportes=this.estadoasientocontableLogic.getEstadoAsientoContables();
		this.estadoasientocontableLogic.setEstadoAsientoContables(estadoasientocontablesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontable_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoAsientoContables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoAsientoContable("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoAsientoContable estadoasientocontable : estadoasientocontablesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoAsientoContable("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoAsientoContableConstantesFunciones.generarExcelReporteDataEstadoAsientoContable("NORMAL",row,workbook,estadoasientocontable,cellStyleDataAux);
		
			
			


				//ParametroContabilidadDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoasientocontable.getParametroContabilidadDefectos()!=null && estadoasientocontable.getParametroContabilidadDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroContabilidadDefectoConstantesFunciones.generarExcelReporteHeaderParametroContabilidadDefecto("RELACIONADO",row,workbook);
				}

				if(estadoasientocontable.getParametroContabilidadDefectos()!=null) {
					i2=0;
					for(ParametroContabilidadDefecto parametrocontabilidaddefecto : estadoasientocontable.getParametroContabilidadDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroContabilidadDefectoConstantesFunciones.generarExcelReporteDataParametroContabilidadDefecto("RELACIONADO",row,workbook,parametrocontabilidaddefecto,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoAsientoContableConstantesFunciones.getEstadoAsientoContableDescripcion(estadoasientocontable));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoAsientoContable() throws Exception {		
		this.startProcessEstadoAsientoContable(true);
	}
	
	public void startProcessEstadoAsientoContable(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEstadoAsientoContable ,this.jPanelParametrosReportesEstadoAsientoContable, this.jScrollPanelDatosEstadoAsientoContable,this.jPanelPaginacionEstadoAsientoContable, this.jScrollPanelDatosEdicionEstadoAsientoContable, this.jPanelAccionesEstadoAsientoContable,this.jPanelAccionesFormularioEstadoAsientoContable,this.jmenuBarEstadoAsientoContable,this.jmenuBarDetalleEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,this.jTtoolBarDetalleEstadoAsientoContable);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoAsientoContable=this.jTabbedPaneBusquedasEstadoAsientoContable; 
		
		final JPanel jPanelParametrosReportesEstadoAsientoContable=this.jPanelParametrosReportesEstadoAsientoContable;
		//final JScrollPane jScrollPanelDatosEstadoAsientoContable=this.jScrollPanelDatosEstadoAsientoContable;
		final JTable jTableDatosEstadoAsientoContable=this.jTableDatosEstadoAsientoContable;		
		final JPanel jPanelPaginacionEstadoAsientoContable=this.jPanelPaginacionEstadoAsientoContable;
		//final JScrollPane jScrollPanelDatosEdicionEstadoAsientoContable=this.jScrollPanelDatosEdicionEstadoAsientoContable;
		final JPanel jPanelAccionesEstadoAsientoContable=this.jPanelAccionesEstadoAsientoContable;
		
		JPanel jPanelCamposAuxiliarEstadoAsientoContable=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoAsientoContable=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
			jPanelCamposAuxiliarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jPanelCamposEstadoAsientoContable;
			jPanelAccionesFormularioAuxiliarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jPanelAccionesFormularioEstadoAsientoContable;
		}
		
		final JPanel jPanelCamposEstadoAsientoContable=jPanelCamposAuxiliarEstadoAsientoContable;
		final JPanel jPanelAccionesFormularioEstadoAsientoContable=jPanelAccionesFormularioAuxiliarEstadoAsientoContable;
		
		
		final JMenuBar jmenuBarEstadoAsientoContable=this.jmenuBarEstadoAsientoContable;
		final JToolBar jTtoolBarEstadoAsientoContable=this.jTtoolBarEstadoAsientoContable;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoAsientoContable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoAsientoContable=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
			jmenuBarDetalleAuxiliarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jmenuBarDetalleEstadoAsientoContable;
			jTtoolBarDetalleAuxiliarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jTtoolBarDetalleEstadoAsientoContable;
		}
		
		final JMenuBar jmenuBarDetalleEstadoAsientoContable=jmenuBarDetalleAuxiliarEstadoAsientoContable;
		final JToolBar jTtoolBarDetalleEstadoAsientoContable=jTtoolBarDetalleAuxiliarEstadoAsientoContable;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoAsientoContable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoAsientoContable;
			processRunnable.jTableDatos=jTableDatosEstadoAsientoContable;
			processRunnable.jPanelCampos=jPanelCamposEstadoAsientoContable;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoAsientoContable;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoAsientoContable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoAsientoContable;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoAsientoContable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoAsientoContable;
			processRunnable.jTtoolBar=jTtoolBarEstadoAsientoContable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoAsientoContable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoAsientoContable ,jPanelParametrosReportesEstadoAsientoContable,jTableDatosEstadoAsientoContable, /*jScrollPanelDatosEstadoAsientoContable,*/jPanelCamposEstadoAsientoContable,jPanelPaginacionEstadoAsientoContable, /*jScrollPanelDatosEdicionEstadoAsientoContable,*/ jPanelAccionesEstadoAsientoContable,jPanelAccionesFormularioEstadoAsientoContable,jmenuBarEstadoAsientoContable,jmenuBarDetalleEstadoAsientoContable,jTtoolBarEstadoAsientoContable,jTtoolBarDetalleEstadoAsientoContable);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoAsientoContable ,jPanelParametrosReportesEstadoAsientoContable, jScrollPanelDatosEstadoAsientoContable,jPanelPaginacionEstadoAsientoContable, jScrollPanelDatosEdicionEstadoAsientoContable, jPanelAccionesEstadoAsientoContable,jPanelAccionesFormularioEstadoAsientoContable,jmenuBarEstadoAsientoContable,jmenuBarDetalleEstadoAsientoContable,jTtoolBarEstadoAsientoContable,jTtoolBarDetalleEstadoAsientoContable);
						
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
	
	public void finishProcessEstadoAsientoContable() {// throws Exception 
		this.finishProcessEstadoAsientoContable(true);
	}
	
	public void finishProcessEstadoAsientoContable(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEstadoAsientoContable ,this.jPanelParametrosReportesEstadoAsientoContable, this.jScrollPanelDatosEstadoAsientoContable,this.jPanelPaginacionEstadoAsientoContable, this.jScrollPanelDatosEdicionEstadoAsientoContable, this.jPanelAccionesEstadoAsientoContable,this.jPanelAccionesFormularioEstadoAsientoContable,this.jmenuBarEstadoAsientoContable,this.jmenuBarDetalleEstadoAsientoContable,this.jTtoolBarEstadoAsientoContable,this.jTtoolBarDetalleEstadoAsientoContable);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoAsientoContable=this.jTabbedPaneBusquedasEstadoAsientoContable; 
		
		final JPanel jPanelParametrosReportesEstadoAsientoContable=this.jPanelParametrosReportesEstadoAsientoContable;
		//final JScrollPane jScrollPanelDatosEstadoAsientoContable=this.jScrollPanelDatosEstadoAsientoContable;
		final JTable jTableDatosEstadoAsientoContable=this.jTableDatosEstadoAsientoContable;		
		final JPanel jPanelPaginacionEstadoAsientoContable=this.jPanelPaginacionEstadoAsientoContable;
		//final JScrollPane jScrollPanelDatosEdicionEstadoAsientoContable=this.jScrollPanelDatosEdicionEstadoAsientoContable;
		final JPanel jPanelAccionesEstadoAsientoContable=this.jPanelAccionesEstadoAsientoContable;
		
		JPanel jPanelCamposAuxiliarEstadoAsientoContable=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoAsientoContable=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
			jPanelCamposAuxiliarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jPanelCamposEstadoAsientoContable;
			jPanelAccionesFormularioAuxiliarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jPanelAccionesFormularioEstadoAsientoContable;
		}
		
		final JPanel jPanelCamposEstadoAsientoContable=jPanelCamposAuxiliarEstadoAsientoContable;
		final JPanel jPanelAccionesFormularioEstadoAsientoContable=jPanelAccionesFormularioAuxiliarEstadoAsientoContable;
		
		
		final JMenuBar jmenuBarEstadoAsientoContable=this.jmenuBarEstadoAsientoContable;		
		final JToolBar jTtoolBarEstadoAsientoContable=this.jTtoolBarEstadoAsientoContable;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoAsientoContable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoAsientoContable=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
			jmenuBarDetalleAuxiliarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jmenuBarDetalleEstadoAsientoContable;
			jTtoolBarDetalleAuxiliarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jTtoolBarDetalleEstadoAsientoContable;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoAsientoContable=jmenuBarDetalleAuxiliarEstadoAsientoContable;
		final JToolBar jTtoolBarDetalleEstadoAsientoContable=jTtoolBarDetalleAuxiliarEstadoAsientoContable;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoAsientoContable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoAsientoContable;
			processRunnable.jTableDatos=jTableDatosEstadoAsientoContable;
			processRunnable.jPanelCampos=jPanelCamposEstadoAsientoContable;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoAsientoContable;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoAsientoContable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoAsientoContable;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoAsientoContable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoAsientoContable;
			processRunnable.jTtoolBar=jTtoolBarEstadoAsientoContable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoAsientoContable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoAsientoContable ,jPanelParametrosReportesEstadoAsientoContable, jTableDatosEstadoAsientoContable,/*jScrollPanelDatosEstadoAsientoContable,*/jPanelCamposEstadoAsientoContable,jPanelPaginacionEstadoAsientoContable, /*jScrollPanelDatosEdicionEstadoAsientoContable,*/ jPanelAccionesEstadoAsientoContable,jPanelAccionesFormularioEstadoAsientoContable,jmenuBarEstadoAsientoContable,jmenuBarDetalleEstadoAsientoContable,jTtoolBarEstadoAsientoContable,jTtoolBarDetalleEstadoAsientoContable));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoAsientoContable(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoAsientoContable(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoAsientoContable(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoAsientoContable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoAsientoContable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoAsientoContable,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoAsientoContable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoAsientoContable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoAsientoContable,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoasientocontableConstantesFunciones.getsFinalQueryEstadoAsientoContable();
		String  finalQueryPaginacionTodos=this.estadoasientocontableConstantesFunciones.getsFinalQueryEstadoAsientoContable();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoAsientoContableConstantesFunciones.getArrayColumnasGlobalesNoEstadoAsientoContable(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoAsientoContableConstantesFunciones.getArrayColumnasGlobalesEstadoAsientoContable(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoAsientoContableConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoasientocontablesEliminados= new ArrayList<EstadoAsientoContable>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoAsientoContable();
		
				///*EstadoAsientoContableSessionBean*/this.estadoasientocontableSessionBean=new EstadoAsientoContableSessionBean();
			
			if(this.estadoasientocontableSessionBean==null) {
				this.estadoasientocontableSessionBean=new EstadoAsientoContableSessionBean();
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
					this.iNumeroPaginacion=EstadoAsientoContableConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoAsientoContableConstantesFunciones.getClassesForeignKeysOfEstadoAsientoContable(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoasientocontable."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoasientocontablesAux= new ArrayList<EstadoAsientoContable>();
			
				
			estadoasientocontableLogic.setDatosCliente(this.datosCliente);
			estadoasientocontableLogic.setDatosDeep(this.datosDeep);
			estadoasientocontableLogic.setIsConDeep(true);
			
			
			estadoasientocontableLogic.getEstadoAsientoContableDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoasientocontableLogic.getTodosEstadoAsientoContables(finalQueryGlobal,pagination);
					
					//estadoasientocontableLogic.getTodosEstadoAsientoContablesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoasientocontableLogic.getEstadoAsientoContables()==null|| estadoasientocontableLogic.getEstadoAsientoContables().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoasientocontablesAux= new ArrayList<EstadoAsientoContable>();
							estadoasientocontablesAux.addAll(estadoasientocontableLogic.getEstadoAsientoContables());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoasientocontablesAux= new ArrayList<EstadoAsientoContable>();
							estadoasientocontablesAux.addAll(estadoasientocontables);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoasientocontableLogic.getTodosEstadoAsientoContables(finalQueryGlobal+"",this.pagination);												
							
							//estadoasientocontableLogic.getTodosEstadoAsientoContablesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoAsientoContables("Todos",estadoasientocontableLogic.getEstadoAsientoContables() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoasientocontableLogic.setEstadoAsientoContables(new ArrayList<EstadoAsientoContable>());					
							estadoasientocontableLogic.getEstadoAsientoContables().addAll(estadoasientocontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoasientocontables=new ArrayList<EstadoAsientoContable>();
							estadoasientocontables.addAll(estadoasientocontablesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoAsientoContable=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoAsientoContable=this.idActual;
				
				} else if(this.idEstadoAsientoContableActual!=null && this.idEstadoAsientoContableActual!=0L) {
					idEstadoAsientoContable=idEstadoAsientoContableActual;
				}
				
					
				this.sDetalleReporte=EstadoAsientoContableConstantesFunciones.getDetalleIndicePorId(idEstadoAsientoContable);
				
				this.estadoasientocontables=new ArrayList<EstadoAsientoContable>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoasientocontableLogic.getEntity(idEstadoAsientoContable);
					
					//estadoasientocontableLogic.getEntityWithConnection(idEstadoAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoasientocontableLogic.setEstadoAsientoContables(new ArrayList<EstadoAsientoContable>());
					estadoasientocontableLogic.getEstadoAsientoContables().add(estadoasientocontableLogic.getEstadoAsientoContable());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoasientocontables=new ArrayList<EstadoAsientoContable>();
					this.estadoasientocontables.add(estadoasientocontable);
				}
				
				if(estadoasientocontableLogic.getEstadoAsientoContable()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdColorGeneral")) {
				this.sDetalleReporte=EstadoAsientoContableConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					estadoasientocontableLogic.getEstadoAsientoContablesFK_IdColorGeneral(finalQueryGlobal,pagination,id_color_generalFK_IdColorGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoAsientoContableConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoAsientoContableConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=estadoasientocontableLogic.getEstadoAsientoContables()==null||estadoasientocontableLogic.getEstadoAsientoContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=estadoasientocontables==null|| estadoasientocontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoasientocontablesAux=new ArrayList<EstadoAsientoContable>();
						estadoasientocontablesAux.addAll(estadoasientocontableLogic.getEstadoAsientoContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoasientocontablesAux=new ArrayList<EstadoAsientoContable>();
							estadoasientocontablesAux.addAll(estadoasientocontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							estadoasientocontableLogic.getEstadoAsientoContablesFK_IdColorGeneral(finalQueryGlobal,pagination,id_color_generalFK_IdColorGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoAsientoContableConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoAsientoContableConstantesFunciones.getDetalleIndiceFK_IdColorGeneral(id_color_generalFK_IdColorGeneral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEstadoAsientoContables("FK_IdColorGeneral",estadoasientocontableLogic.getEstadoAsientoContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEstadoAsientoContables("FK_IdColorGeneral",estadoasientocontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoasientocontableLogic.setEstadoAsientoContables(new ArrayList<EstadoAsientoContable>());
						estadoasientocontableLogic.getEstadoAsientoContables().addAll(estadoasientocontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoasientocontables=new ArrayList<EstadoAsientoContable>();
							estadoasientocontables.addAll(estadoasientocontablesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoAsientoContable();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoAsientoContable();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoasientocontableLogic.getEstadoAsientoContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoasientocontables.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoasientocontableLogic.getEstadoAsientoContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoasientocontables.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoAsientoContable estadoasientocontable) {
		Boolean permite=true;
		
		if(this.estadoasientocontable.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoAsientoContableConstantesFunciones.getOrderByListaEstadoAsientoContable();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoAsientoContableConstantesFunciones.getOrderByListaEstadoAsientoContable();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAsientoContable estadoasientocontable:estadoasientocontableLogic.getEstadoAsientoContables()) {
				if(estadoasientocontable.getsType().equals(Constantes2.S_TOTALES)) {
					estadoasientocontableTotales=estadoasientocontable;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAsientoContable estadoasientocontable:this.estadoasientocontables) {
				if(estadoasientocontable.getsType().equals(Constantes2.S_TOTALES)) {
					estadoasientocontableTotales=estadoasientocontable;
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
			this.estadoasientocontableAux=new EstadoAsientoContable();
			this.estadoasientocontableAux.setsType(Constantes2.S_TOTALES);
			this.estadoasientocontableAux.setIsNew(false);
			this.estadoasientocontableAux.setIsChanged(false);
			this.estadoasientocontableAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoAsientoContableConstantesFunciones.TotalizarValoresFilaEstadoAsientoContable(this.estadoasientocontableLogic.getEstadoAsientoContables(),this.estadoasientocontableAux);
				
				this.estadoasientocontableLogic.getEstadoAsientoContables().add(this.estadoasientocontableAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoAsientoContableConstantesFunciones.TotalizarValoresFilaEstadoAsientoContable(this.estadoasientocontables,this.estadoasientocontableAux);
				
				this.estadoasientocontables.add(this.estadoasientocontableAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoasientocontableTotales=new EstadoAsientoContable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoasientocontableLogic.getEstadoAsientoContables().remove(estadoasientocontableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoasientocontables.remove(estadoasientocontableTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoasientocontableTotales=new EstadoAsientoContable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAsientoContable estadoasientocontable:estadoasientocontableLogic.getEstadoAsientoContables()) {
				if(estadoasientocontable.getsType().equals(Constantes2.S_TOTALES)) {
					estadoasientocontableTotales=estadoasientocontable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoAsientoContableConstantesFunciones.TotalizarValoresFilaEstadoAsientoContable(this.estadoasientocontableLogic.getEstadoAsientoContables(),estadoasientocontableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAsientoContable estadoasientocontable:this.estadoasientocontables) {
				if(estadoasientocontable.getsType().equals(Constantes2.S_TOTALES)) {
					estadoasientocontableTotales=estadoasientocontable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoAsientoContableConstantesFunciones.TotalizarValoresFilaEstadoAsientoContable(this.estadoasientocontables,estadoasientocontableTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoAsientoContablesFK_IdColorGeneral()throws Exception {
		try {
			sAccionBusqueda="FK_IdColorGeneral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadoAsientoContablePorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoAsientoContablesFK_IdColorGeneral(String sFinalQuery,Long id_color_general)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoasientocontableLogic.getEstadoAsientoContablesFK_IdColorGeneral(sFinalQuery,this.pagination,id_color_general);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadoAsientoContablePorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoasientocontableLogic.getEstadoAsientoContablePorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoAsientoContable() {
		this.isPermisoTodoEstadoAsientoContable=false;
		this.isPermisoNuevoEstadoAsientoContable=false;
		this.isPermisoActualizarEstadoAsientoContable=false;
		this.isPermisoActualizarOriginalEstadoAsientoContable=false;
		this.isPermisoEliminarEstadoAsientoContable=false;
		this.isPermisoGuardarCambiosEstadoAsientoContable=false;
		this.isPermisoConsultaEstadoAsientoContable=false;
		this.isPermisoBusquedaEstadoAsientoContable=false;
		this.isPermisoReporteEstadoAsientoContable=false;		
		this.isPermisoOrdenEstadoAsientoContable=false;		
		this.isPermisoPaginacionMedioEstadoAsientoContable=false;		
		this.isPermisoPaginacionAltoEstadoAsientoContable=false;
		this.isPermisoPaginacionTodoEstadoAsientoContable=false;
		this.isPermisoCopiarEstadoAsientoContable=false;		
		this.isPermisoVerFormEstadoAsientoContable=false;		
		this.isPermisoDuplicarEstadoAsientoContable=false;		
		this.isPermisoOrdenEstadoAsientoContable=false;		
	}
	
	public void setPermisosUsuarioEstadoAsientoContable(Boolean isPermiso) {
		this.isPermisoTodoEstadoAsientoContable=isPermiso;
		this.isPermisoNuevoEstadoAsientoContable=isPermiso;
		this.isPermisoActualizarEstadoAsientoContable=isPermiso;
		this.isPermisoActualizarOriginalEstadoAsientoContable=isPermiso;
		this.isPermisoEliminarEstadoAsientoContable=isPermiso;
		this.isPermisoGuardarCambiosEstadoAsientoContable=isPermiso;
		this.isPermisoConsultaEstadoAsientoContable=isPermiso;
		this.isPermisoBusquedaEstadoAsientoContable=isPermiso;
		this.isPermisoReporteEstadoAsientoContable=isPermiso;
		this.isPermisoOrdenEstadoAsientoContable=isPermiso;		
		this.isPermisoPaginacionMedioEstadoAsientoContable=isPermiso;		
		this.isPermisoPaginacionAltoEstadoAsientoContable=isPermiso;		
		this.isPermisoPaginacionTodoEstadoAsientoContable=isPermiso;		
		this.isPermisoCopiarEstadoAsientoContable=isPermiso;		
		this.isPermisoVerFormEstadoAsientoContable=isPermiso;		
		this.isPermisoDuplicarEstadoAsientoContable=isPermiso;
		this.isPermisoOrdenEstadoAsientoContable=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoAsientoContable(Boolean isPermiso) {
		//this.isPermisoTodoEstadoAsientoContable=isPermiso;
		this.isPermisoNuevoEstadoAsientoContable=isPermiso;
		this.isPermisoActualizarEstadoAsientoContable=isPermiso;
		this.isPermisoActualizarOriginalEstadoAsientoContable=isPermiso;
		this.isPermisoEliminarEstadoAsientoContable=isPermiso;
		this.isPermisoGuardarCambiosEstadoAsientoContable=isPermiso;
		//this.isPermisoConsultaEstadoAsientoContable=isPermiso;
		//this.isPermisoBusquedaEstadoAsientoContable=isPermiso;
		//this.isPermisoReporteEstadoAsientoContable=isPermiso;
		//this.isPermisoOrdenEstadoAsientoContable=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoAsientoContable=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoAsientoContable=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoAsientoContable=isPermiso;		
		//this.isPermisoCopiarEstadoAsientoContable=isPermiso;		
		//this.isPermisoDuplicarEstadoAsientoContable=isPermiso;
		//this.isPermisoOrdenEstadoAsientoContable=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoAsientoContableClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroContabilidadDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoAsientoContableJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosParametroContabilidadDefecto=false;
		this.isTienePermisosParametroContabilidadDefecto=this.verificarGetPermisosUsuarioOpcionEstadoAsientoContableClaseRelacionada(this.opcionsRelacionadas,ParametroContabilidadDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoAsientoContable(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoAsientoContableClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroContabilidadDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoAsientoContableClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoAsientoContableClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoAsientoContableClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroContabilidadDefecto && this.jInternalFrameDetalleFormEstadoAsientoContable!=null && this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTabbedPaneRelacionesEstadoAsientoContable.remove(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoAsientoContable() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoAsientoContableJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoAsientoContableConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoAsientoContable=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoAsientoContable=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoAsientoContable=this.isPermisoActualizarEstadoAsientoContable;
			this.isPermisoEliminarEstadoAsientoContable=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoAsientoContable=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoAsientoContable=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoAsientoContable=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoAsientoContable=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoAsientoContable=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoAsientoContable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoAsientoContable=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoAsientoContable=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoAsientoContable=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoAsientoContable=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoAsientoContable=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoAsientoContable=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoAsientoContable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoAsientoContable.setToolTipText(this.jTableDatosEstadoAsientoContable.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoAsientoContable(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoAsientoContable(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoAsientoContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoAsientoContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoAsientoContable() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroContabilidadDefecto && this.estadoasientocontableConstantesFunciones.mostrarParametroContabilidadDefectoEstadoAsientoContable && !EstadoAsientoContableConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Contabilidad Defecto");
			reporte.setsDescripcion("Parametro Contabilidad Defecto");
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyEstadoAsientoContableListas()throws Exception {
		try	{						
			
				this.colorgeneralsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoAsientoContableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoAsientoContableJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoAsientoContableListas(false);
			} else {
			
				this.cargarCombosForeignKeyColorGeneralListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyColorGeneralListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.colorgeneralsForeignKey==null||this.colorgeneralsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ColorGeneralConstantesFunciones.getArrayColumnasGlobalesColorGeneral(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ColorGeneralConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ColorGeneralConstantesFunciones.SFINALQUERY;

				this.cargarCombosColorGeneralsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEstadoAsientoContableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EstadoAsientoContableParameterReturnGeneral estadoasientocontableReturnGeneral=new EstadoAsientoContableParameterReturnGeneral();
						
			


				String finalQueryGlobalColorGeneral="";

				if(((this.colorgeneralsForeignKey==null||this.colorgeneralsForeignKey.size()<=0) && this.estadoasientocontableConstantesFunciones.cargarid_color_generalEstadoAsientoContable)
					 || (this.esRecargarFks && this.estadoasientocontableConstantesFunciones.cargarid_color_generalEstadoAsientoContable)) {

					if(!this.estadoasientocontableSessionBean.getisBusquedaDesdeForeignKeySesionColorGeneral()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ColorGeneralConstantesFunciones.getArrayColumnasGlobalesColorGeneral(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalColorGeneral=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ColorGeneralConstantesFunciones.TABLENAME);

						finalQueryGlobalColorGeneral=Funciones.GetFinalQueryAppend(finalQueryGlobalColorGeneral, "");
						finalQueryGlobalColorGeneral+=ColorGeneralConstantesFunciones.SFINALQUERY;

						//this.cargarCombosColorGeneralsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalColorGeneral=" WHERE " + ConstantesSql.ID + "="+estadoasientocontableSessionBean.getlidColorGeneralActual();
					}
				} else {
					finalQueryGlobalColorGeneral="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				estadoasientocontableReturnGeneral=estadoasientocontableLogic.cargarCombosLoteForeignKeyEstadoAsientoContable(finalQueryGlobalColorGeneral);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalColorGeneral.equals("NONE")) {
				this.colorgeneralsForeignKey=estadoasientocontableReturnGeneral.getcolorgeneralsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoAsientoContable()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyColorGeneral();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyColorGeneral()throws Exception {
		try {
			if(this.estadoasientocontableSessionBean==null) {
				this.estadoasientocontableSessionBean=new EstadoAsientoContableSessionBean();
			}

			if(!this.estadoasientocontableSessionBean.getisBusquedaDesdeForeignKeySesionColorGeneral()) {
				ColorGeneral colorgeneral=new ColorGeneral();
				ColorGeneralConstantesFunciones.setColorGeneralDescripcion(colorgeneral,Constantes.SMENSAJE_ESCOJA_OPCION);
				colorgeneral.setId(null);

				if(!ColorGeneralConstantesFunciones.ExisteEnLista(this.colorgeneralsForeignKey,colorgeneral,true)) {

					this.colorgeneralsForeignKey.add(0,colorgeneral);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEstadoAsientoContable()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoAsientoContable(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoAsientoContable()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoAsientoContable();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoAsientoContable(EstadoAsientoContable estadoasientocontable)throws Exception {	
		try {
			
			this.setActualColorGeneralForeignKey(estadoasientocontable.getid_color_general(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoAsientoContable(EstadoAsientoContable estadoasientocontable,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoAsientoContable()throws Exception {	
		try {
			
			this.setActualColorGeneralForeignKey(this.estadoasientocontableConstantesFunciones.getid_color_general(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoAsientoContable()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoAsientoContable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoAsientoContable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoAsientoContable()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoAsientoContable()throws Exception {
		try {
			

			this.cargarCombosFrameColorGeneralsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoAsientoContable(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameColorGeneralsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoAsientoContable()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable!=null && this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public EstadoAsientoContableBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoAsientoContableBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoAsientoContableBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoasientocontableSessionBean=new EstadoAsientoContableSessionBean(); 
		this.estadoasientocontableConstantesFunciones=new EstadoAsientoContableConstantesFunciones(); 
		this.estadoasientocontableBean=new EstadoAsientoContable();//(this.estadoasientocontableConstantesFunciones); 		
		this.estadoasientocontableReturnGeneral=new EstadoAsientoContableParameterReturnGeneral(); 
		
		this.estadoasientocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoasientocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoAsientoContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoAsientoContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoAsientoContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoAsientoContable(true);
			
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
			
			this.estadoasientocontableConstantesFunciones=new EstadoAsientoContableConstantesFunciones(); 
			this.estadoasientocontableBean=new EstadoAsientoContable();//this.estadoasientocontableConstantesFunciones); 			
			this.estadoasientocontableReturnGeneral=new EstadoAsientoContableParameterReturnGeneral(); 
		
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Asiento Contable Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoasientocontable=new EstadoAsientoContable();
			this.estadoasientocontables = new ArrayList<EstadoAsientoContable>();
			this.estadoasientocontablesAux = new ArrayList<EstadoAsientoContable>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic=new EstadoAsientoContableLogic();
				this.estadoasientocontableLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoasientocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoasientocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoAsientoContable);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoAsientoContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoAsientoContable);	
					}
					
					if(this.jInternalFrameImportacionEstadoAsientoContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoAsientoContable);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoAsientoContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoAsientoContable);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoAsientoContable);
				this.jInternalFrameDetalleFormEstadoAsientoContable.setVisible(false);
				this.jInternalFrameDetalleFormEstadoAsientoContable.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoAsientoContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoAsientoContable);
					this.jInternalFrameReporteDinamicoEstadoAsientoContable.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoAsientoContable.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoAsientoContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoAsientoContable);
					this.jInternalFrameImportacionEstadoAsientoContable.setVisible(false);
					this.jInternalFrameImportacionEstadoAsientoContable.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoAsientoContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoAsientoContable);
					this.jInternalFrameOrderByEstadoAsientoContable.setVisible(false);
					this.jInternalFrameOrderByEstadoAsientoContable.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoAsientoContableActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoAsientoContableConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoasientocontableReturnGeneral=new EstadoAsientoContableParameterReturnGeneral();
			
			this.estadoasientocontableParameterGeneral=new EstadoAsientoContableParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoasientocontableLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoAsientoContableJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroContabilidadDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoAsientoContableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoasientocontableSessionBean.getEsGuardarRelacionado(),this.estadoasientocontableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoAsientoContableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoasientocontableSessionBean.getEsGuardarRelacionado(),this.estadoasientocontableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoAsientoContable=false;
			this.isVisibilidadCeldaDuplicarEstadoAsientoContable=true;
			this.isVisibilidadCeldaCopiarEstadoAsientoContable=true;
			this.isVisibilidadCeldaVerFormEstadoAsientoContable=true;
			this.isVisibilidadCeldaOrdenEstadoAsientoContable=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=false;
			this.isVisibilidadCeldaModificarEstadoAsientoContable=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContable=false;
			this.isVisibilidadCeldaEliminarEstadoAsientoContable=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContable=false;
			this.isVisibilidadCeldaGuardarEstadoAsientoContable=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=false;
			
			
			this.isVisibilidadFK_IdColorGeneral=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoAsientoContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoAsientoContable();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoAsientoContable(false);
			
			this.setPermisosUsuarioEstadoAsientoContable();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoasientocontableSessionBean.getEsGuardarRelacionado() && this.estadoasientocontableSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoAsientoContableClasesRelacionadas();
			}
			
			if(this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoAsientoContableClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoAsientoContable();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoAsientoContable();
			}
			
			if(!this.isPermisoBusquedaEstadoAsientoContable) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEstadoAsientoContable.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoAsientoContable,this.isPermisoPaginacionMedioEstadoAsientoContable,this.isPermisoPaginacionTodoEstadoAsientoContable);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoAsientoContableConstantesFunciones.getTiposSeleccionarEstadoAsientoContable());
				
				this.tiposColumnasSelect=EstadoAsientoContableConstantesFunciones.getTiposSeleccionarEstadoAsientoContable(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoAsientoContable();				
				//this.tiposRelacionesSelect=EstadoAsientoContableConstantesFunciones.getTiposRelacionesEstadoAsientoContable(true);
				
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
			//if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoAsientoContable();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEstadoAsientoContable(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEstadoAsientoContable(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoAsientoContable() ;
			
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
			
			
			this.parametrocontabilidaddefectoLogic=new ParametroContabilidadDefectoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.colorgeneralLogic=new ColorGeneralLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadoasientocontableImplementable= (EstadoAsientoContableImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoAsientoContableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoasientocontableImplementableHome= (EstadoAsientoContableImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoAsientoContableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoasientocontables= new ArrayList<EstadoAsientoContable>();
			this.estadoasientocontablesEliminados= new ArrayList<EstadoAsientoContable>();
						
			this.isEsNuevoEstadoAsientoContable=false;
			this.esParaAccionDesdeFormularioEstadoAsientoContable=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.colorgeneralsForeignKey=new ArrayList<ColorGeneral>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoAsientoContable(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoAsientoContable();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoAsientoContableConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoAsientoContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoAsientoContable(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoAsientoContable();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoAsientoContable();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEstadoAsientoContable.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEstadoAsientoContable.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEstadoAsientoContable.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoAsientoContable(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoAsientoContable: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoAsientoContable() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoAsientoContable")) {
				iIndex=this.jInternalFrameDetalleFormEstadoAsientoContable.jTabbedPaneRelacionesEstadoAsientoContable.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoAsientoContable.jTabbedPaneRelacionesEstadoAsientoContable.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Contabilidad Defectos")) {
					if(!ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoAsientoContable();

						this.cargarParteTabPanelRelacionadaParametroContabilidadDefecto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoAsientoContable();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroContabilidadDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoAsientoContable.cargarSessionConBeanSwingJInternalFrameParametroContabilidadDefecto(false,true,iIndex);
		this.jButtonParametroContabilidadDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroContabilidadDefecto();

		//this.jTabbedPaneRelacionesEstadoAsientoContable.updateUI();
		//this.jTabbedPaneRelacionesEstadoAsientoContable.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoAsientoContable.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroContabilidadDefecto")) {
				int row=this.jTableDatosEstadoAsientoContable.getSelectedRow();
				jButtonParametroContabilidadDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Contabilidad Defecto")) {

					if(this.isTienePermisosParametroContabilidadDefecto && this.estadoasientocontableConstantesFunciones.mostrarParametroContabilidadDefectoEstadoAsientoContable && !EstadoAsientoContableConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Contabilidad Defectos"+"("+ParametroContabilidadDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Contabilidad Defectos");

						if(estadoasientocontableConstantesFunciones.resaltarParametroContabilidadDefectoEstadoAsientoContable!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoasientocontableConstantesFunciones.resaltarParametroContabilidadDefectoEstadoAsientoContable);
						}

						jmenuItem.setEnabled(this.estadoasientocontableConstantesFunciones.activarParametroContabilidadDefectoEstadoAsientoContable);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroContabilidadDefecto"));

						

						this.jInternalFrameDetalleFormEstadoAsientoContable.jmenuDetalleEstadoAsientoContable.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoAsientoContable(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoAsientoContable(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoAsientoContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoAsientoContableListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoAsientoContable();
		
		this.cargarCombosFrameForeignKeyEstadoAsientoContable();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoAsientoContable();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoAsientoContable();
		}
	}
	
	

	public void cargarCombosForeignKeyColorGeneral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyColorGeneralListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyColorGeneral();
				this.cargarCombosFrameColorGeneralsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaColorGeneral(this.colorgeneralsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEstadoAsientoContableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			
			
			if(jTableDatosEstadoAsientoContable.getRowCount()>=1) {
				jTableDatosEstadoAsientoContable.removeRowSelectionInterval(0, jTableDatosEstadoAsientoContable.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoAsientoContable=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoAsientoContable(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoAsientoContable(true);			
			//this.estadoasientocontable=new EstadoAsientoContable();
			//this.estadoasientocontable.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoAsientoContable(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoAsientoContable() ;
			
			if(EstadoAsientoContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoAsientoContable(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoasientocontable);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);				
			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			
			if(this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoAsientoContable: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoAsientoContableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoAsientoContable.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoAsientoContable.getSelectedRows().length;			
			}
			
			estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoAsientoContable--;			
				//EstadoAsientoContable estadoasientocontableAux= new EstadoAsientoContable();			
				//estadoasientocontableAux.setId(this.iIdNuevoEstadoAsientoContable);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoAsientoContable estadoasientocontableOrigen=new EstadoAsientoContable();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoAsientoContable estadoasientocontableOrigen : estadoasientocontablesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoasientocontableOrigen =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoasientocontableOrigen =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoAsientoContable();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoasientocontable.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoAsientoContable(estadoasientocontableOrigen,this.estadoasientocontable,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoasientocontableLogic.getEstadoAsientoContables().add(this.estadoasientocontableAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoasientocontables.add(this.estadoasientocontableAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
				
				this.jTableDatosEstadoAsientoContable.setRowSelectionInterval(this.getIndiceNuevoEstadoAsientoContable(), this.getIndiceNuevoEstadoAsientoContable());
				
				int iLastRow =  this.jTableDatosEstadoAsientoContable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoAsientoContable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoAsientoContable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();									
		
			EstadoAsientoContable estadoasientocontableOrigen=new EstadoAsientoContable();
			EstadoAsientoContable estadoasientocontableDestino=new EstadoAsientoContable();
				
			estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoAsientoContable.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoasientocontablesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoAsientoContable.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoasientocontableOrigen =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoasientocontableOrigen =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoasientocontableDestino =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoasientocontableDestino =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoasientocontableOrigen =estadoasientocontablesSeleccionados.get(0);
				estadoasientocontableDestino =estadoasientocontablesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoAsientoContable(estadoasientocontableOrigen,estadoasientocontableDestino,true,false);
				
				estadoasientocontableDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoasientocontableDestino,estadoasientocontableLogic.getEstadoAsientoContables());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoasientocontableDestino,estadoasientocontables);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
				
				//this.jTableDatosEstadoAsientoContable.setRowSelectionInterval(this.getIndiceNuevoEstadoAsientoContable(), this.getIndiceNuevoEstadoAsientoContable());
				
				int iLastRow =  this.jTableDatosEstadoAsientoContable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoAsientoContable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoAsientoContable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoAsientoContable.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoAsientoContable.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEstadoAsientoContable.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEstadoAsientoContable.setVisible(!isVisible);
			this.jPanelPaginacionEstadoAsientoContable.setVisible(!isVisible);
			this.jPanelAccionesEstadoAsientoContable.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoAsientoContable();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoAsientoContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoAsientoContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoAsientoContable();
			
			this.abrirFrameOrderByEstadoAsientoContable();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoAsientoContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoAsientoContable(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoAsientoContable);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoAsientoContable.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoAsientoContable.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoAsientoContable.setSize(this.jInternalFrameDetalleFormEstadoAsientoContable.iWidthFormulario,this.jInternalFrameDetalleFormEstadoAsientoContable.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoAsientoContable.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoAsientoContable.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoAsientoContable.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoAsientoContable.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoAsientoContable.jContentPaneDetalleEstadoAsientoContable.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoAsientoContable.jTabbedPaneRelacionesEstadoAsientoContable.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoAsientoContable.jContentPaneDetalleEstadoAsientoContable.getWidth(),EstadoAsientoContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoAsientoContable.jTabbedPaneRelacionesEstadoAsientoContable.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoAsientoContable.jContentPaneDetalleEstadoAsientoContable.getWidth(),EstadoAsientoContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoAsientoContable.jTabbedPaneRelacionesEstadoAsientoContable.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoAsientoContable.jContentPaneDetalleEstadoAsientoContable.getWidth(),EstadoAsientoContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroContabilidadDefecto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoAsientoContable.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoAsientoContable.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoAsientoContable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoAsientoContable==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoAsientoContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoAsientoContable,false,this);
				} else {
					this.jInternalFrameOrderByEstadoAsientoContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoAsientoContable,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoAsientoContable);
				this.jInternalFrameOrderByEstadoAsientoContable.setVisible(false);
				this.jInternalFrameOrderByEstadoAsientoContable.setSelected(false);
				
				this.jInternalFrameOrderByEstadoAsientoContable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoAsientoContable"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoAsientoContable();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoAsientoContable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoAsientoContable==null) {
				
				this.jInternalFrameImportacionEstadoAsientoContable=new ImportacionJInternalFrame(EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoAsientoContable);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoAsientoContable);
				this.jInternalFrameImportacionEstadoAsientoContable.setVisible(false);
				this.jInternalFrameImportacionEstadoAsientoContable.setSelected(false);


				this.jInternalFrameImportacionEstadoAsientoContable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoAsientoContable"));
				this.jInternalFrameImportacionEstadoAsientoContable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoAsientoContable"));
				this.jInternalFrameImportacionEstadoAsientoContable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoAsientoContable"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoAsientoContable() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoAsientoContable==null) {
				this.jInternalFrameReporteDinamicoEstadoAsientoContable=new ReporteDinamicoJInternalFrame(EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoAsientoContable);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoAsientoContable);
				this.jInternalFrameReporteDinamicoEstadoAsientoContable.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoAsientoContable.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoAsientoContable"));
				this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoAsientoContable"));
				this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoAsientoContable"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoAsientoContable();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroContabilidadDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoAsientoContable.jContentPaneDetalleEstadoAsientoContable.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoAsientoContable() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoAsientoContable);
			
	       	this.jInternalFrameDetalleFormEstadoAsientoContable.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoAsientoContable.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoAsientoContable.dispose();
			//this.jInternalFrameDetalleFormEstadoAsientoContable=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoAsientoContable() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoAsientoContable.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoAsientoContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoAsientoContable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoAsientoContable.setVisible(true);
	        this.jInternalFrameImportacionEstadoAsientoContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoAsientoContable() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoAsientoContable.setVisible(true);
	        this.jInternalFrameOrderByEstadoAsientoContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoAsientoContable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoAsientoContable.setVisible(false);
	        this.jInternalFrameOrderByEstadoAsientoContable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoAsientoContable() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoAsientoContable.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoAsientoContable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoAsientoContable() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoAsientoContable.setVisible(false);
	        this.jInternalFrameImportacionEstadoAsientoContable.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoAsientoContable(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoAsientoContable(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoAsientoContable(true);
			//this.isEsNuevoEstadoAsientoContable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoAsientoContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoAsientoContable(false) ;
			
			if(estadoasientocontableSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() && ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroContabilidadDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoAsientoContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoAsientoContable(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoAsientoContable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoAsientoContableActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoAsientoContable(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoAsientoContable(true);
			//this.isEsNuevoEstadoAsientoContable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoasientocontable.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoAsientoContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoAsientoContable(false) ;
			
			if(EstadoAsientoContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoAsientoContable(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoAsientoContable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaColorGeneral(List<ColorGeneral> colorgeneralsForeignKey)throws Exception{
		TableColumn tableColumnColorGeneral=this.jTableDatosEstadoAsientoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContable,EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL));
		TableCellEditor tableCellEditorColorGeneral =tableColumnColorGeneral.getCellEditor();

		ColorGeneralTableCell colorgeneralTableCellFk=(ColorGeneralTableCell)tableCellEditorColorGeneral;

		if(colorgeneralTableCellFk!=null) {
			colorgeneralTableCellFk.setcolorgeneralsForeignKey(colorgeneralsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEstadoAsientoContable.getSelectedRow();

		//if(intSelectedRow<=0) {
			//colorgeneralTableCellFk.setRowActual(intSelectedRow);
			//colorgeneralTableCellFk.setcolorgeneralsForeignKeyActual(colorgeneralsForeignKey);
		//}


		if(colorgeneralTableCellFk!=null) {
			colorgeneralTableCellFk.RecargarColorGeneralsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoAsientoContable(false);
			
			//if(!this.isEsNuevoEstadoAsientoContable) {								
				int intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.estadoasientocontable,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
				
			}
			
			if(this.permiteMantenimiento(this.estadoasientocontable)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoAsientoContable=true;
					this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
					this.isEsNuevoEstadoAsientoContable=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoAsientoContable=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoAsientoContable=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoAsientoContable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoAsientoContable(false);
				
				this.habilitarDeshabilitarControlesEstadoAsientoContable(false);
			
												
				
				if(EstadoAsientoContableJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoAsientoContable();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoAsientoContableActionPerformed(evt,estadoasientocontableSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoAsientoContable(this.estadoasientocontable,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoAsientoContable.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoasientocontableSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoasientocontable.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContable.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContable.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				this.estadoasientocontable.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				this.estadoasientocontable.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoasientocontable)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoAsientoContableModel) this.jTableDatosEstadoAsientoContable.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoAsientoContable=true;
				this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
				this.isEsNuevoEstadoAsientoContable=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoAsientoContable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoAsientoContable(false);
				
				this.habilitarDeshabilitarControlesEstadoAsientoContable(false);
				
				
				
				if(EstadoAsientoContableJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoAsientoContable();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoAsientoContable.getRowCount()>=1) {
				jTableDatosEstadoAsientoContable.removeRowSelectionInterval(0, jTableDatosEstadoAsientoContable.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoAsientoContable(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoAsientoContable(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoAsientoContable(false) ;
			
			this.isEsNuevoEstadoAsientoContable=false;
			
			if(EstadoAsientoContableJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoAsientoContable();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoAsientoContable(false);
				
				//SI ES MANUAL
				if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoAsientoContable();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoAsientoContable--;			
			//EstadoAsientoContable estadoasientocontableAux= new EstadoAsientoContable();			
			//estadoasientocontableAux.setId(this.iIdNuevoEstadoAsientoContable);
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoAsientoContable();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
			
			this.estadoasientocontable.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoasientocontableLogic.getEstadoAsientoContables().add(this.estadoasientocontableAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoasientocontables.add(this.estadoasientocontableAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
			
			this.jTableDatosEstadoAsientoContable.setRowSelectionInterval(this.getIndiceNuevoEstadoAsientoContable(), this.getIndiceNuevoEstadoAsientoContable());
			
			int iLastRow =  this.jTableDatosEstadoAsientoContable.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoAsientoContable.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoAsientoContable.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoAsientoContable(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoAsientoContable(false);
			
			//SI ES MANUAL
			if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoAsientoContable();
			}
			
			//this.abrirFrameTreeEstadoAsientoContable();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Asiento ContableS ?", "MANTENIMIENTO DE Estado Asiento Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoAsientoContable.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoAsientoContable();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoasientocontableReturnGeneral=estadoasientocontableLogic.procesarImportacionEstadoAsientoContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoasientocontableParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoAsientoContableReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoAsientoContable.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoAsientoContable.setFileImportacion(this.jInternalFrameImportacionEstadoAsientoContable.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoAsientoContable.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoAsientoContable.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoAsientoContable.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoAsientoContable.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();		

		estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoAsientoContableBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoAsientoContableBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoAsientoContables("Todos",estadoasientocontablesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoAsientoContableConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ColorGeneral_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ColorGeneral_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ColorGeneral_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ColorGeneral_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoAsientoContableConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL:
					sNombreCampoCategoria="id_color_general";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoAsientoContableConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL:
					sNombreCampoCategoriaValor="id_color_general";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoAsientoContableConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Color General",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_color_general");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();		
		
		estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontable";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoAsientoContables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoAsientoContableConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoAsientoContableConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoAsientoContable estadoasientocontable:estadoasientocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoasientocontable.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoAsientoContable estadoasientocontable:estadoasientocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoasientocontable.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL);
					iRow++;

					for(EstadoAsientoContable estadoasientocontable:estadoasientocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoasientocontable.getcolorgeneral_descripcion());
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
			//	this.getFilaCabeceraExportarExcelEstadoAsientoContable(row);				
			//	iRow++;
			//}				
			
			//for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontablesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoAsientoContable(estadoasientocontableAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoasientocontableLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoAsientoContable(false);
			
			//SI ES MANUAL
			if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoAsientoContable();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoAsientoContable(false);
			
			//SI ES MANUAL
			if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoAsientoContable();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoAsientoContable(false);
			
			//SI ES MANUAL
			if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoAsientoContable();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoAsientoContable() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoAsientoContable.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoAsientoContable.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoAsientoContable.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoAsientoContable.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoAsientoContable.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoAsientoContable.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoAsientoContable.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoAsientoContable(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoAsientoContable(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoAsientoContable(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoAsientoContable(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoAsientoContable(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoAsientoContable(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoAsientoContable(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoAsientoContable(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoAsientoContable() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoAsientoContable();
		
		this.inicializarActualizarBindingBotonesManualEstadoAsientoContable(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoAsientoContable();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoAsientoContable() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoAsientoContable(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoAsientoContable(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoAsientoContable.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoAsientoContable.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoAsientoContable.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoAsientoContable.jCheckBoxPostAccionNuevoEstadoAsientoContable.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoAsientoContable.jCheckBoxPostAccionSinCerrarEstadoAsientoContable.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoAsientoContable.jCheckBoxPostAccionSinMensajeEstadoAsientoContable.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoAsientoContable.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoAsientoContable.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoAsientoContable.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
				this.jInternalFrameDetalleFormEstadoAsientoContable.jCheckBoxPostAccionNuevoEstadoAsientoContable.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoAsientoContable.jCheckBoxPostAccionSinCerrarEstadoAsientoContable.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoAsientoContable.jCheckBoxPostAccionSinMensajeEstadoAsientoContable.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoAsientoContable.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoAsientoContable.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxTiposAccionesFormularioEstadoAsientoContable.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoAsientoContable.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoAsientoContable!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoAsientoContable.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoAsientoContable.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoAsientoContable.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoAsientoContable.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoAsientoContable!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoAsientoContable.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoAsientoContable.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoAsientoContable(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoAsientoContable(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoAsientoContable() throws Exception {
		try	{
			if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoAsientoContable();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoAsientoContable() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxTiposAccionesFormularioEstadoAsientoContable.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxTiposAccionesFormularioEstadoAsientoContable.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoAsientoContable() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoAsientoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoAsientoContable.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoAsientoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoAsientoContable.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoAsientoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoAsientoContable.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoAsientoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoAsientoContable.addItem(reporte);
			}
			
			
			if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoAsientoContable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoAsientoContable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoAsientoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoAsientoContable.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoAsientoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoAsientoContable.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxTiposAccionesFormularioEstadoAsientoContable.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxTiposAccionesFormularioEstadoAsientoContable.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoAsientoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoAsientoContable.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoAsientoContable.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoAsientoContable();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoAsientoContable() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoAsientoContable!=null) {
				this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoAsientoContable!=null) {
				this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoAsientoContable!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoAsientoContable()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.getSelectedItem()!=null){this.id_color_generalFK_IdColorGeneral=((ColorGeneral)this.jComboBoxid_color_generalFK_IdColorGeneralEstadoAsientoContable.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoAsientoContable(Boolean esInicializar) throws Exception {				
		if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoAsientoContable();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoAsientoContable() throws Exception {
		this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoAsientoContable() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoAsientoContablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoAsientoContablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoAsientoContableOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContableOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoAsientoContablePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoAsientoContablePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoAsientoContable(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoasientocontableLogic.getEstadoAsientoContables().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoasientocontables.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoAsientoContable.setModel(new EstadoAsientoContableModel(this.estadoasientocontableLogic.getEstadoAsientoContables(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoAsientoContable.setModel(new EstadoAsientoContableModel(this.estadoasientocontables,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoAsientoContable!=null && this.jInternalFrameOrderByEstadoAsientoContable.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoAsientoContable();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoAsientoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContable,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoAsientoContablePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO,estadoasientocontableConstantesFunciones.resaltarSeleccionarEstadoAsientoContable,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO,estadoasientocontableConstantesFunciones.resaltarSeleccionarEstadoAsientoContable,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoAsientoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContable,EstadoAsientoContableConstantesFunciones.LABEL_ID));

		if(this.estadoasientocontableConstantesFunciones.mostraridEstadoAsientoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoAsientoContableConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoasientocontableConstantesFunciones.resaltaridEstadoAsientoContable,this.estadoasientocontableConstantesFunciones.activaridEstadoAsientoContable,this,true,"idEstadoAsientoContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoasientocontableConstantesFunciones.resaltaridEstadoAsientoContable,this.estadoasientocontableConstantesFunciones.activaridEstadoAsientoContable,this,true,"idEstadoAsientoContable","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoAsientoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContable,EstadoAsientoContableConstantesFunciones.LABEL_CODIGO));

		if(this.estadoasientocontableConstantesFunciones.mostrarcodigoEstadoAsientoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoAsientoContableConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoasientocontableConstantesFunciones.resaltarcodigoEstadoAsientoContable,this.estadoasientocontableConstantesFunciones.activarcodigoEstadoAsientoContable,this,true,"codigoEstadoAsientoContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoasientocontableConstantesFunciones.resaltarcodigoEstadoAsientoContable,this.estadoasientocontableConstantesFunciones.activarcodigoEstadoAsientoContable,this,true,"codigoEstadoAsientoContable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoAsientoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoAsientoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContable,EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoasientocontableConstantesFunciones.mostrarnombreEstadoAsientoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoasientocontableConstantesFunciones.resaltarnombreEstadoAsientoContable,this.estadoasientocontableConstantesFunciones.activarnombreEstadoAsientoContable,this,true,"nombreEstadoAsientoContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoasientocontableConstantesFunciones.resaltarnombreEstadoAsientoContable,this.estadoasientocontableConstantesFunciones.activarnombreEstadoAsientoContable,this,true,"nombreEstadoAsientoContable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoAsientoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoAsientoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContable,EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL));

		if(this.estadoasientocontableConstantesFunciones.mostrarid_color_generalEstadoAsientoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ColorGeneralTableCell(this.colorgeneralsForeignKey,this.estadoasientocontableConstantesFunciones.resaltarid_color_generalEstadoAsientoContable,this,this.estadoasientocontableConstantesFunciones.activarid_color_generalEstadoAsientoContable));
			tableColumn.setCellEditor(new ColorGeneralTableCell(this.colorgeneralsForeignKey,this.estadoasientocontableConstantesFunciones.resaltarid_color_generalEstadoAsientoContable,this,this.estadoasientocontableConstantesFunciones.activarid_color_generalEstadoAsientoContable,true,"id_color_generalEstadoAsientoContable","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoAsientoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroContabilidadDefecto && this.estadoasientocontableConstantesFunciones.mostrarParametroContabilidadDefectoEstadoAsientoContable && !EstadoAsientoContableConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Contabilidad Defectos");
				tableColumn.setHeaderValue("Parametro Contabilidad Defectos");
				tableColumn.setCellRenderer(new ParametroContabilidadDefectoTableCell(estadoasientocontableConstantesFunciones.resaltarParametroContabilidadDefectoEstadoAsientoContable,this,this.estadoasientocontableConstantesFunciones.activarParametroContabilidadDefectoEstadoAsientoContable));
				tableColumn.setCellEditor(new ParametroContabilidadDefectoTableCell(estadoasientocontableConstantesFunciones.resaltarParametroContabilidadDefectoEstadoAsientoContable,this,this.estadoasientocontableConstantesFunciones.activarParametroContabilidadDefectoEstadoAsientoContable));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoAsientoContable.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoasientocontableSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoasientocontableSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoAsientoContable.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoasientocontableSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoasientocontableSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoAsientoContable.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoasientocontableSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoasientocontableSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoAsientoContable.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoAsientoContable.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoAsientoContable.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoAsientoContable.moveColumn(this.jTableDatosEstadoAsientoContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoAsientoContable.moveColumn(this.jTableDatosEstadoAsientoContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoAsientoContable.moveColumn(this.jTableDatosEstadoAsientoContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoAsientoContable.moveColumn(this.jTableDatosEstadoAsientoContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoAsientoContable.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoAsientoContable.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoAsientoContable,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoAsientoContable.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoAsientoContable.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoAsientoContable.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoAsientoContable.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoAsientoContable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoasientocontableLogic.getEstadoAsientoContables().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoasientocontables.size()-1;
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
		//this.jTableDatosEstadoAsientoContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoAsientoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoAsientoContable();
			
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
				
				//this.isEsNuevoEstadoAsientoContable=false;
					
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			
				if(this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoAsientoContable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoAsientoContable.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoasientocontable.getsType().equals("DUPLICADO")
				   || this.estadoasientocontable.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoAsientoContable=true;
				
				} else {
					this.isEsNuevoEstadoAsientoContable=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoasientocontable.getId()>=0 && !this.estadoasientocontable.getIsNew()) {						
						this.isEsNuevoEstadoAsientoContable=false;
						
					} else {
						this.isEsNuevoEstadoAsientoContable=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoAsientoContable(esRelaciones);						
				
				this.seleccionarEstadoAsientoContable(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoasientocontable.getId()<0) {
					this.isEsNuevoEstadoAsientoContable=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoAsientoContable(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoAsientoContable(evt,rowIndex);
				}	
				
				if(this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoAsientoContable: " + this.dDif); 
					}
				}								
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoAsientoContable(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoasientocontable)) {
					if(this.estadoasientocontable.getId()>0) {
						this.estadoasientocontable.setIsDeleted(true);
						
						this.estadoasientocontablesEliminados.add(this.estadoasientocontable);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoasientocontableLogic.getEstadoAsientoContables().remove(this.estadoasientocontable);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoasientocontables.remove(this.estadoasientocontable);				
					}
					
					
					((EstadoAsientoContableModel) this.jTableDatosEstadoAsientoContable.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoAsientoContable(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoAsientoContable(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoAsientoContable) {
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoAsientoContable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoAsientoContable.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoAsientoContable(this.estadoasientocontable);
				}
				
				//ARCHITECTURE
				try {
					

					//ColorGeneral
					if(!this.estadoasientocontableConstantesFunciones.cargarid_color_generalEstadoAsientoContable || this.estadoasientocontableConstantesFunciones.event_dependid_color_generalEstadoAsientoContable) {
						//this.cargarCombosColorGeneralsForeignKeyLista(" where id="+this.estadoasientocontable.getid_color_general());
									//this.inicializarActualizarBindingEstadoAsientoContable(false,false);
						this.colorgeneralsForeignKey=new ArrayList<ColorGeneral>();

						if(estadoasientocontable.getColorGeneral()!=null) {
							this.colorgeneralsForeignKey.add(estadoasientocontable.getColorGeneral());
						}

						this.addItemDefectoCombosForeignKeyColorGeneral();
						this.cargarCombosFrameColorGeneralsForeignKey("Todos");
					}
					this.setActualColorGeneralForeignKey(this.estadoasientocontable.getid_color_general(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoAsientoContable("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoAsientoContable(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoAsientoContable() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoAsientoContable(EstadoAsientoContable estadoasientocontable) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoAsientoContable(estadoasientocontable,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoAsientoContable(EstadoAsientoContable estadoasientocontable,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoAsientoContable(estadoasientocontable);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoAsientoContable(estadoasientocontable,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoAsientoContable(estadoasientocontable);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoAsientoContable(EstadoAsientoContable estadoasientocontable) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldidEstadoAsientoContable.setText(estadoasientocontable.getId().toString());
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldcodigoEstadoAsientoContable.setText(estadoasientocontable.getcodigo());
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTextAreanombreEstadoAsientoContable.setText(estadoasientocontable.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoAsientoContable estadoasientocontableLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoasientocontableLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoAsientoContable estadoasientocontableLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoasientocontableLocal=this.estadoasientocontable;
			} else {
				estadoasientocontableLocal=this.estadoasientocontableAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoasientocontableLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoAsientoContable(estadoasientocontableLocal,true);
					
					if(estadoasientocontableSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoasientocontableLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoasientocontableLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoAsientoContable(EstadoAsientoContable estadoasientocontable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoAsientoContable(estadoasientocontable,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(estadoasientocontable);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoAsientoContable(EstadoAsientoContable estadoasientocontable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoAsientoContable(estadoasientocontable,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoAsientoContable(EstadoAsientoContable estadoasientocontable,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldidEstadoAsientoContable.getText()==null || this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldidEstadoAsientoContable.getText()=="" || this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldidEstadoAsientoContable.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldidEstadoAsientoContable.setText("0");
			}

			if(conColumnasBase) {estadoasientocontable.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldidEstadoAsientoContable.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoAsientoContableConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAsientoContable.jLabelIdEstadoAsientoContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoasientocontable.setcodigo(this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldcodigoEstadoAsientoContable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoAsientoContableConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAsientoContable.jLabelcodigoEstadoAsientoContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoasientocontable.setnombre(this.jInternalFrameDetalleFormEstadoAsientoContable.jTextAreanombreEstadoAsientoContable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAsientoContable.jLabelnombreEstadoAsientoContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoAsientoContable(EstadoAsientoContable estadoasientocontableBean,EstadoAsientoContable estadoasientocontable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && estadoasientocontableBean.getid_color_general()!=null && !estadoasientocontableBean.getid_color_general().equals(-1L))) {estadoasientocontable.setid_color_general(estadoasientocontableBean.getid_color_general());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoAsientoContable(EstadoAsientoContable estadoasientocontableOrigen,EstadoAsientoContable estadoasientocontable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoasientocontableOrigen.getId()!=null && !estadoasientocontableOrigen.getId().equals(0L))) {estadoasientocontable.setId(estadoasientocontableOrigen.getId());}}
			if(conDefault || (!conDefault && estadoasientocontableOrigen.getcodigo()!=null && !estadoasientocontableOrigen.getcodigo().equals(""))) {estadoasientocontable.setcodigo(estadoasientocontableOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoasientocontableOrigen.getnombre()!=null && !estadoasientocontableOrigen.getnombre().equals(""))) {estadoasientocontable.setnombre(estadoasientocontableOrigen.getnombre());}
			if(conDefault || (!conDefault && estadoasientocontableOrigen.getid_color_general()!=null && !estadoasientocontableOrigen.getid_color_general().equals(-1L))) {estadoasientocontable.setid_color_general(estadoasientocontableOrigen.getid_color_general());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoAsientoContable(EstadoAsientoContable estadoasientocontable) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldidEstadoAsientoContable.setText(estadoasientocontable.getId().toString());
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldcodigoEstadoAsientoContable.setText(estadoasientocontable.getcodigo());
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTextAreanombreEstadoAsientoContable.setText(estadoasientocontable.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoAsientoContable(EstadoAsientoContableBean estadoasientocontableBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldidEstadoAsientoContable.setText(estadoasientocontableBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldcodigoEstadoAsientoContable.setText(estadoasientocontableBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTextAreanombreEstadoAsientoContable.setText(estadoasientocontableBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoAsientoContable(EstadoAsientoContableParameterReturnGeneral estadoasientocontableReturnGeneral,EstadoAsientoContableBean estadoasientocontableBean,Boolean conDefault) throws Exception { 
		try {
			EstadoAsientoContable estadoasientocontableLocal=new EstadoAsientoContable();
			
			estadoasientocontableLocal=estadoasientocontableReturnGeneral.getEstadoAsientoContable();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoasientocontableLocal.getId()!=null && !estadoasientocontableLocal.getId().equals(0L))) {estadoasientocontableBean.setId(estadoasientocontableLocal.getId());}}
			if(conDefault || (!conDefault && estadoasientocontableLocal.getcodigo()!=null && !estadoasientocontableLocal.getcodigo().equals(""))) {estadoasientocontableBean.setcodigo(estadoasientocontableLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoasientocontableLocal.getnombre()!=null && !estadoasientocontableLocal.getnombre().equals(""))) {estadoasientocontableBean.setnombre(estadoasientocontableLocal.getnombre());}
			if(conDefault || (!conDefault && estadoasientocontableLocal.getid_color_general()!=null && !estadoasientocontableLocal.getid_color_general().equals(-1L))) {estadoasientocontableBean.setid_color_general(estadoasientocontableLocal.getid_color_general());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoAsientoContableGenerico(Long idEstadoAsientoContableSeleccionado,JComboBox jComboBoxEstadoAsientoContable,List<EstadoAsientoContable> estadoasientocontablesLocal)throws Exception {
		try {
			EstadoAsientoContable  estadoasientocontableTemp=null;

			for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontablesLocal) {
				if(estadoasientocontableAux.getId()!=null && estadoasientocontableAux.getId().equals(idEstadoAsientoContableSeleccionado)) {
					estadoasientocontableTemp=estadoasientocontableAux;
					break;
				}
			}

			jComboBoxEstadoAsientoContable.setSelectedItem(estadoasientocontableTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoAsientoContableGenerico(JComboBox jComboBoxEstadoAsientoContable,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoAsientoContable.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoAsientoContable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoAsientoContable.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoAsientoContable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ParametroContabilidadDefecto")) {
			jButtonParametroContabilidadDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoasientocontable=(EstadoAsientoContable) estadoasientocontableLogic.getEstadoAsientoContables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoasientocontable =(EstadoAsientoContable) estadoasientocontables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("ColorGeneral")) {
			//sDescripcion=this.getActualColorGeneralForeignKeyDescripcion((Long)value);
			if(!estadoasientocontable.getIsNew() && !estadoasientocontable.getIsChanged() && !estadoasientocontable.getIsDeleted()) {
				sDescripcion=estadoasientocontable.getcolorgeneral_descripcion();
			} else {
				//sDescripcion=this.getActualColorGeneralForeignKeyDescripcion((Long)value);
				sDescripcion=estadoasientocontable.getcolorgeneral_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoAsientoContable estadoasientocontableRow=new EstadoAsientoContable();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoasientocontableRow=(EstadoAsientoContable) estadoasientocontableLogic.getEstadoAsientoContables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoasientocontableRow=(EstadoAsientoContable) estadoasientocontables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroContabilidadDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoAsientoContable estadoasientocontable) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoasientocontable = (EstadoAsientoContable)this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoasientocontable = (EstadoAsientoContable)this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoasientocontable!=null) {
						this.estadoasientocontable = estadoasientocontable;
					} else {
						this.estadoasientocontable = new EstadoAsientoContable();
					}
				}

				if(this.isTienePermisosParametroContabilidadDefecto && this.permiteMantenimiento(this.estadoasientocontable)) {
					ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFramePopup=new ParametroContabilidadDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocontabilidaddefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFramePopup;
					} else {
						parametrocontabilidaddefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame;
					}

					List<EstadoAsientoContable> estadoasientocontables=new ArrayList<EstadoAsientoContable>();
					estadoasientocontables.add(this.estadoasientocontable);
					if(!esRelacionado) {
						//parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setConGuardarRelaciones(false);
						//parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocontabilidaddefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoAsientoContable.cargarParametroContabilidadDefectoBeanSwingJInternalFrame(estadoasientocontables,this.estadoasientocontable,parametrocontabilidaddefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones(),parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
					parametrocontabilidaddefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocontabilidaddefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContabilidadDefecto("no_relacionado");

						parametrocontabilidaddefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroContabilidadDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroContabilidadDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocontabilidaddefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoAsientoContable=(TitledBorder)this.jScrollPanelDatosEstadoAsientoContable.getBorder();
						TitledBorder titledBorderParametroContabilidadDefecto=(TitledBorder)parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.getBorder();

						titledBorderParametroContabilidadDefecto.setTitle(titledBorderEstadoAsientoContable.getTitle() + " -> Parametro Contabilidad Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocontabilidaddefectoBeanSwingJInternalFrame);
						}

						parametrocontabilidaddefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocontabilidaddefectoBeanSwingJInternalFrame);

						parametrocontabilidaddefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Contabilidad Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoAsientoContable(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoAsientoContable.setVisible((this.isVisibilidadCeldaNuevoEstadoAsientoContable && this.isPermisoNuevoEstadoAsientoContable));			
			this.jButtonDuplicarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaDuplicarEstadoAsientoContable && this.isPermisoDuplicarEstadoAsientoContable));			
			this.jButtonCopiarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaCopiarEstadoAsientoContable && this.isPermisoCopiarEstadoAsientoContable));
			this.jButtonVerFormEstadoAsientoContable.setVisible((this.isVisibilidadCeldaVerFormEstadoAsientoContable && this.isPermisoVerFormEstadoAsientoContable));
			
			this.jButtonAbrirOrderByEstadoAsientoContable.setVisible((this.isVisibilidadCeldaOrdenEstadoAsientoContable && this.isPermisoOrdenEstadoAsientoContable));			
			
			this.jButtonNuevoRelacionesEstadoAsientoContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable && this.isPermisoNuevoEstadoAsientoContable));			
			this.jButtonNuevoGuardarCambiosEstadoAsientoContable.setVisible((this.isVisibilidadCeldaNuevoEstadoAsientoContable && this.isPermisoNuevoEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable));
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonModificarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaModificarEstadoAsientoContable && this.isPermisoActualizarEstadoAsientoContable));	
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonActualizarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaActualizarEstadoAsientoContable && this.isPermisoActualizarEstadoAsientoContable));	
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonEliminarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaEliminarEstadoAsientoContable && this.isPermisoEliminarEstadoAsientoContable));
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonCancelarEstadoAsientoContable.setVisible(this.isVisibilidadCeldaCancelarEstadoAsientoContable);							
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonGuardarCambiosEstadoAsientoContable.setVisible((this.isVisibilidadCeldaGuardarEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoAsientoContable.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaNuevoEstadoAsientoContable && this.isPermisoNuevoEstadoAsientoContable));						
			this.jButtonDuplicarToolBarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaDuplicarEstadoAsientoContable && this.isPermisoDuplicarEstadoAsientoContable));						
			this.jButtonCopiarToolBarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaCopiarEstadoAsientoContable && this.isPermisoCopiarEstadoAsientoContable));			
			this.jButtonVerFormToolBarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaVerFormEstadoAsientoContable && this.isPermisoVerFormEstadoAsientoContable));			
			this.jButtonAbrirOrderByToolBarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaOrdenEstadoAsientoContable && this.isPermisoOrdenEstadoAsientoContable));
			this.jButtonNuevoRelacionesToolBarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable && this.isPermisoNuevoEstadoAsientoContable));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaNuevoEstadoAsientoContable && this.isPermisoNuevoEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable));			
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonModificarToolBarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaModificarEstadoAsientoContable && this.isPermisoActualizarEstadoAsientoContable));	
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonActualizarToolBarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaActualizarEstadoAsientoContable  && this.isPermisoActualizarEstadoAsientoContable));	
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonEliminarToolBarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaEliminarEstadoAsientoContable && this.isPermisoEliminarEstadoAsientoContable));
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonCancelarToolBarEstadoAsientoContable.setVisible(this.isVisibilidadCeldaCancelarEstadoAsientoContable);				
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonGuardarCambiosToolBarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaGuardarEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoAsientoContable.setVisible((this.isVisibilidadCeldaNuevoEstadoAsientoContable && this.isPermisoNuevoEstadoAsientoContable));			
			this.jMenuItemDuplicarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaDuplicarEstadoAsientoContable && this.isPermisoDuplicarEstadoAsientoContable));			
			this.jMenuItemCopiarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaCopiarEstadoAsientoContable && this.isPermisoCopiarEstadoAsientoContable));			
			this.jMenuItemVerFormEstadoAsientoContable.setVisible((this.isVisibilidadCeldaVerFormEstadoAsientoContable && this.isPermisoVerFormEstadoAsientoContable));			
			this.jMenuItemAbrirOrderByEstadoAsientoContable.setVisible((this.isVisibilidadCeldaOrdenEstadoAsientoContable && this.isPermisoOrdenEstadoAsientoContable));			
			//this.jMenuItemMostrarOcultarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaOrdenEstadoAsientoContable && this.isPermisoOrdenEstadoAsientoContable));
			this.jMenuItemDetalleAbrirOrderByEstadoAsientoContable.setVisible((this.isVisibilidadCeldaOrdenEstadoAsientoContable && this.isPermisoOrdenEstadoAsientoContable));			
			//this.jMenuItemDetalleMostrarOcultarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaOrdenEstadoAsientoContable && this.isPermisoOrdenEstadoAsientoContable));			
			this.jMenuItemNuevoRelacionesEstadoAsientoContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable && this.isPermisoNuevoEstadoAsientoContable));			
			this.jMenuItemNuevoGuardarCambiosEstadoAsientoContable.setVisible((this.isVisibilidadCeldaNuevoEstadoAsientoContable && this.isPermisoNuevoEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable));									
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemModificarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaModificarEstadoAsientoContable && this.isPermisoActualizarEstadoAsientoContable));	
			this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemActualizarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaActualizarEstadoAsientoContable && this.isPermisoActualizarEstadoAsientoContable));	
			this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemEliminarEstadoAsientoContable.setVisible((this.isVisibilidadCeldaEliminarEstadoAsientoContable && this.isPermisoEliminarEstadoAsientoContable));
			this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemCancelarEstadoAsientoContable.setVisible(this.isVisibilidadCeldaCancelarEstadoAsientoContable);				
			}
			
			this.jMenuItemGuardarCambiosEstadoAsientoContable.setVisible((this.isVisibilidadCeldaGuardarEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable));						
			this.jMenuItemGuardarCambiosTablaEstadoAsientoContable.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoAsientoContable=this.jButtonNuevoEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoAsientoContable=this.jButtonDuplicarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaCopiarEstadoAsientoContable=this.jButtonCopiarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaVerFormEstadoAsientoContable=this.jButtonVerFormEstadoAsientoContable.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoAsientoContable=this.jButtonAbrirOrderByEstadoAsientoContable.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=this.jButtonNuevoRelacionesEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaModificarEstadoAsientoContable=this.jButtonModificarEstadoAsientoContable.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
			this.isVisibilidadCeldaActualizarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonActualizarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaEliminarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonEliminarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaCancelarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonCancelarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaGuardarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonGuardarCambiosEstadoAsientoContable.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=this.jButtonGuardarCambiosTablaEstadoAsientoContable.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoAsientoContable=this.jButtonNuevoToolBarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=this.jButtonNuevoRelacionesToolBarEstadoAsientoContable.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
			this.isVisibilidadCeldaModificarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonModificarToolBarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaActualizarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonActualizarToolBarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaEliminarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonEliminarToolBarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaCancelarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonCancelarToolBarEstadoAsientoContable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoAsientoContable=this.jButtonGuardarCambiosToolBarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=this.jButtonGuardarCambiosTablaToolBarEstadoAsientoContable.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoAsientoContable=this.jMenuItemNuevoEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=this.jMenuItemNuevoRelacionesEstadoAsientoContable.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
			this.isVisibilidadCeldaModificarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemModificarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaActualizarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemActualizarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaEliminarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemEliminarEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaCancelarEstadoAsientoContable=this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemCancelarEstadoAsientoContable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoAsientoContable=this.jMenuItemGuardarCambiosEstadoAsientoContable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=this.jMenuItemGuardarCambiosTablaEstadoAsientoContable.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoAsientoContable(Boolean esInicializar) {
		if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoAsientoContable();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoAsientoContable(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoAsientoContable() {
		this.jButtonNuevoEstadoAsientoContable.setVisible(this.isPermisoNuevoEstadoAsientoContable);			
		this.jButtonDuplicarEstadoAsientoContable.setVisible(this.isPermisoDuplicarEstadoAsientoContable);			
		this.jButtonCopiarEstadoAsientoContable.setVisible(this.isPermisoCopiarEstadoAsientoContable);			
		this.jButtonVerFormEstadoAsientoContable.setVisible(this.isPermisoVerFormEstadoAsientoContable);			
		
		this.jButtonAbrirOrderByEstadoAsientoContable.setVisible(this.isPermisoOrdenEstadoAsientoContable);					
		
		this.jButtonNuevoRelacionesEstadoAsientoContable.setVisible(this.isPermisoNuevoEstadoAsientoContable);			
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonModificarEstadoAsientoContable.setVisible(this.isPermisoActualizarEstadoAsientoContable);	
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonActualizarEstadoAsientoContable.setVisible(this.isPermisoActualizarEstadoAsientoContable);	
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonEliminarEstadoAsientoContable.setVisible(this.isPermisoEliminarEstadoAsientoContable);
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonCancelarEstadoAsientoContable.setVisible(this.isVisibilidadCeldaCancelarEstadoAsientoContable);						
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonGuardarCambiosEstadoAsientoContable.setVisible(this.isPermisoGuardarCambiosEstadoAsientoContable);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContable.setVisible(this.isPermisoActualizarEstadoAsientoContable);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoAsientoContable() {
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonModificarEstadoAsientoContable.setVisible(this.isPermisoActualizarEstadoAsientoContable);	
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonActualizarEstadoAsientoContable.setVisible(this.isPermisoActualizarEstadoAsientoContable);	
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonEliminarEstadoAsientoContable.setVisible(this.isPermisoEliminarEstadoAsientoContable);
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonCancelarEstadoAsientoContable.setVisible(this.isVisibilidadCeldaCancelarEstadoAsientoContable);							
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonGuardarCambiosEstadoAsientoContable.setVisible((this.isVisibilidadCeldaGuardarEstadoAsientoContable && this.isPermisoGuardarCambiosEstadoAsientoContable));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoAsientoContable() {
		if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoAsientoContable();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoAsientoContable() {
	}
	
	public void jTableDatosEstadoAsientoContableListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoAsientoContable(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoAsientoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.getestadoasientocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoasientocontable==null) {
						this.estadoasientocontable = new EstadoAsientoContable();
					}

					this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.estadoasientocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
				}

				if(this.estadoasientocontable.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoasientocontable.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoAsientoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoAsientoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.getestadoasientocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoasientocontable==null) {
						this.estadoasientocontable = new EstadoAsientoContable();
					}

					this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.estadoasientocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
				}

				if(this.estadoasientocontable.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoasientocontable.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoAsientoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoAsientoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.getestadoasientocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoasientocontable==null) {
						this.estadoasientocontable = new EstadoAsientoContable();
					}

					this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.estadoasientocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
				}

				if(this.estadoasientocontable.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoasientocontable.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoAsientoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_color_generalEstadoAsientoContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocolorgeneral=true;

			idTienePermisocolorgeneral=this.tienePermisosUsuarioEnPaginaWebEstadoAsientoContable(ColorGeneralConstantesFunciones.CLASSNAME);

			if(idTienePermisocolorgeneral) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadoAsientoContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadoAsientoContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.getestadoasientocontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);

				this.colorgeneralBeanSwingJInternalFrame=new ColorGeneralBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.colorgeneralBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.colorgeneralBeanSwingJInternalFrame.getColorGeneralLogic().setConnexion(this.estadoasientocontableLogic.getConnexion());

				if(this.estadoasientocontable.getid_color_general()!=null) {
					this.colorgeneralBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.colorgeneralBeanSwingJInternalFrame.setIdActual(this.estadoasientocontable.getid_color_general());
					this.colorgeneralBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.colorgeneralBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.colorgeneralBeanSwingJInternalFrame.inicializarActualizarBindingTablaColorGeneral();
				}

				JInternalFrameBase jinternalFrame =this.colorgeneralBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadoAsientoContable=(TitledBorder)this.jScrollPanelDatosEstadoAsientoContable.getBorder();
				TitledBorder titledBordercolorgeneral=(TitledBorder)this.colorgeneralBeanSwingJInternalFrame.jScrollPanelDatosColorGeneral.getBorder();

				titledBordercolorgeneral.setTitle(titledBorderEstadoAsientoContable.getTitle() + " -> Color");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_color_generalEstadoAsientoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.getestadoasientocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoasientocontable==null) {
						this.estadoasientocontable = new EstadoAsientoContable();
					}

					this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.estadoasientocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);
				}

				if(this.estadoasientocontable.getid_color_general()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_color_general = "+this.estadoasientocontable.getid_color_general().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoAsientoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdColorGeneralEstadoAsientoContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadoAsientoContable(false,false);

			this.getEstadoAsientoContablesFK_IdColorGeneral();

			this.inicializarActualizarBindingEstadoAsientoContable(false);

			//if(EstadoAsientoContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadoAsientoContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoasientocontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEstadoAsientoContable() {
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoAsientoContable.dispose();
			this.jInternalFrameDetalleFormEstadoAsientoContable=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoAsientoContable!=null) {
			this.jInternalFrameReporteDinamicoEstadoAsientoContable.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoAsientoContable.dispose();
			this.jInternalFrameReporteDinamicoEstadoAsientoContable=null;
		}
		
		if(this.jInternalFrameImportacionEstadoAsientoContable!=null) {
			this.jInternalFrameImportacionEstadoAsientoContable.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoAsientoContable.dispose();
			this.jInternalFrameImportacionEstadoAsientoContable=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoAsientoContable();
			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoAsientoContable")) {
				jButtonNuevoEstadoAsientoContableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoAsientoContable")) {
				jButtonDuplicarEstadoAsientoContableActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoAsientoContable")) {
				jButtonCopiarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoAsientoContable")) {
				jButtonVerFormEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoAsientoContable")) {
				jButtonNuevoEstadoAsientoContableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoAsientoContable")) {
				jButtonDuplicarEstadoAsientoContableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoAsientoContable")) {
				jButtonNuevoEstadoAsientoContableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoAsientoContable")) {
				jButtonDuplicarEstadoAsientoContableActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoAsientoContable")) {
				jButtonNuevoEstadoAsientoContableActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoAsientoContable")) {
				jButtonNuevoEstadoAsientoContableActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoAsientoContable")) {
				jButtonNuevoEstadoAsientoContableActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoAsientoContable")) {
				jButtonModificarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoAsientoContable")) {
				jButtonModificarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoAsientoContable")) {
				jButtonModificarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoAsientoContable")) {
				jButtonActualizarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoAsientoContable")) {
				jButtonActualizarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoAsientoContable")) {
				jButtonActualizarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoAsientoContable")) {
				jButtonEliminarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoAsientoContable")) {
				jButtonEliminarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoAsientoContable")) {
				jButtonEliminarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoAsientoContable")) {
				jButtonCancelarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoAsientoContable")) {
				jButtonCancelarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoAsientoContable")) {
				jButtonCancelarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoAsientoContable")) {
				jButtonCerrarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoAsientoContable")) {
				jButtonCerrarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoAsientoContable")) {
				jButtonCerrarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoAsientoContable")) {
				jButtonMostrarOcultarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoAsientoContable")) {
				jButtonCancelarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoAsientoContable")) {
				jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoAsientoContable")) {
				jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoAsientoContable")) {
				jButtonCopiarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoAsientoContable")) {
				jButtonVerFormEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoAsientoContable")) {
				jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoAsientoContable")) {
				jButtonCopiarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoAsientoContable")) {
				jButtonVerFormEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoAsientoContable")) {
				jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoAsientoContable")) {
				jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoAsientoContable")) {
				jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoAsientoContable")) {
				jButtonRecargarInformacionEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoAsientoContable")) {
				jButtonRecargarInformacionEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoAsientoContable")) {
				jButtonRecargarInformacionEstadoAsientoContableActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoAsientoContable")) {
				jButtonAnterioresEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoAsientoContable")) {
				jButtonAnterioresEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoAsientoContable")) {
				jButtonAnterioresEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoAsientoContable")) {
				jButtonSiguientesEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoAsientoContable")) {
				jButtonSiguientesEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoAsientoContable")) {
				jButtonSiguientesEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoAsientoContable") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoAsientoContable")) {
				jButtonAbrirOrderByEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoAsientoContable") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoAsientoContable")) {
				jButtonMostrarOcultarEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoAsientoContable")) {
				jButtonNuevoGuardarCambiosEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoAsientoContable")) {
				jButtonNuevoGuardarCambiosEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoAsientoContable")) {
				jButtonNuevoGuardarCambiosEstadoAsientoContableActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoAsientoContable")) {
				jButtonCerrarReporteDinamicoEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoAsientoContable")) {
				jButtonGenerarReporteDinamicoEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoAsientoContable")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoAsientoContable")) {
				jButtonCerrarImportacionEstadoAsientoContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoAsientoContable")) {
				
				jButtonGenerarImportacionEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoAsientoContable")) {
				
				jButtonAbrirImportacionEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoAsientoContable")) {
				jComboBoxTiposAccionesEstadoAsientoContableActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoAsientoContable")) {
				jComboBoxTiposRelacionesEstadoAsientoContableActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoAsientoContable")) {
				jComboBoxTiposAccionesEstadoAsientoContableActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoAsientoContable")) {
				
				jComboBoxTiposSeleccionarEstadoAsientoContableActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoAsientoContable")) {
				jTextFieldValorCampoGeneralEstadoAsientoContableActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoAsientoContable")) {
				jButtonAbrirOrderByEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoAsientoContable")) {
				jButtonAbrirOrderByEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoAsientoContable")) {
				jButtonCerrarOrderByEstadoAsientoContableActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoAsientoContableBusqueda")) {
				this.jButtonidEstadoAsientoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoAsientoContableBusqueda")) {
				this.jButtoncodigoEstadoAsientoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoAsientoContableBusqueda")) {
				this.jButtonnombreEstadoAsientoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_color_generalEstadoAsientoContableUpdate")) {
				this.jButtonid_color_generalEstadoAsientoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_color_generalEstadoAsientoContableBusqueda")) {
				this.jButtonid_color_generalEstadoAsientoContableBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdColorGeneralEstadoAsientoContable")) {
				this.jButtonFK_IdColorGeneralEstadoAsientoContableActionPerformed(evt);
			}
			
			;
			
			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoAsientoContable();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				


				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoAsientoContable estadoasientocontableLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoasientocontableLocal=this.estadoasientocontable;
			} else {
				estadoasientocontableLocal=this.estadoasientocontableAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
							
				
				


				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
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
			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			
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
			
			


			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
								
						
				


				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContable.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
								
				
				


				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
							
				
				


				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContable.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
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
			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			
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
			
			


			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
								
				
				


				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoAsientoContable")) {
					jCheckBoxSeleccionarTodosEstadoAsientoContableItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoAsientoContable")) {
					jCheckBoxSeleccionadosEstadoAsientoContableItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoAsientoContable")) {
					
				}
				
				


				
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
												
				
				


				
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
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
			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
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
			
			


			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAsientoContableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContable.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContable.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoasientocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoasientocontable);
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
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
				
				


				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAsientoContable.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAsientoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAsientoContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoasientocontableAnterior =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoAsientoContable")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoAsientoContableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoAsientoContable.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoasientocontable =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoasientocontable);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoAsientoContable")) {
				
				}
				
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoAsientoContable")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoAsientoContable.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoAsientoContable")) {
			
			}
			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoAsientoContable();
			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoAsientoContable")) {
				jButtonNuevoEstadoAsientoContableActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoAsientoContable")) {
				jButtonDuplicarEstadoAsientoContableActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoAsientoContable")) {
				jButtonCopiarEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoAsientoContable")) {
				jButtonVerFormEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoAsientoContable")) {
				jButtonNuevoEstadoAsientoContableActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoAsientoContable")) {
				jButtonModificarEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoAsientoContable")) {
				jButtonActualizarEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoAsientoContable")) {
				jButtonEliminarEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoAsientoContable")) {
				jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoAsientoContable")) {
				jButtonCancelarEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoAsientoContable")) {
				jButtonCerrarEstadoAsientoContableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoAsientoContable")) {
				jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoAsientoContable")) {
				jButtonNuevoGuardarCambiosEstadoAsientoContableActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoAsientoContable")) {
				jButtonAbrirOrderByEstadoAsientoContableActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoAsientoContable")) {
				jButtonRecargarInformacionEstadoAsientoContableActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoAsientoContable")) {
				jButtonAnterioresEstadoAsientoContableActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoAsientoContable")) {
				jButtonSiguientesEstadoAsientoContableActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoAsientoContableBusqueda")) {
				this.jButtonidEstadoAsientoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoAsientoContableBusqueda")) {
				this.jButtoncodigoEstadoAsientoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoAsientoContableBusqueda")) {
				this.jButtonnombreEstadoAsientoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_color_generalEstadoAsientoContableUpdate")) {
				this.jButtonid_color_generalEstadoAsientoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_color_generalEstadoAsientoContableBusqueda")) {
				this.jButtonid_color_generalEstadoAsientoContableBusquedaActionPerformed(evt);
			}
			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoAsientoContable();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoAsientoContable")) {
				closingInternalFrameEstadoAsientoContable();
				
			} else if(sTipo.equals("jButtonCancelarEstadoAsientoContable")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoAsientoContable = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoAsientoContableBeanSwingJInternalFrame jInternalFrameParent=(EstadoAsientoContableBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoAsientoContable.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoAsientoContableActionPerformed(null);
			}
			
			EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoasientocontable,new Object(),this.estadoasientocontableParameterGeneral,this.estadoasientocontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoAsientoContable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoAsientoContable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoAsientoContable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoasientocontable)) {
			if(!esControlTabla) {
				if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.estadoasientocontable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);			
				}
				
				if(this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoAsientoContable(this.estadoasientocontable,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoasientocontableReturnGeneral=estadoasientocontableLogic.procesarEventosEstadoAsientoContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoasientocontableLogic.getEstadoAsientoContables(),this.estadoasientocontable,this.estadoasientocontableParameterGeneral,this.isEsNuevoEstadoAsientoContable,classes);//this.estadoasientocontableLogic.getEstadoAsientoContable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoAsientoContable(this.estadoasientocontableReturnGeneral,this.estadoasientocontableBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoAsientoContable(classes,this.estadoasientocontableReturnGeneral,this.estadoasientocontableBean,false);
					}
						
					if(this.estadoasientocontableReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoAsientoContable(this.estadoasientocontableReturnGeneral.getEstadoAsientoContable());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoAsientoContable(this.estadoasientocontableReturnGeneral.getEstadoAsientoContable());	
					}
						
					if(this.estadoasientocontableReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoAsientoContable(this.estadoasientocontableReturnGeneral.getEstadoAsientoContable(),classes);//this.estadoasientocontableBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoAsientoContable(this.estadoasientocontable,classes);//this.estadoasientocontableBean);									
				}
			
				if(EstadoAsientoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoAsientoContable(this.estadoasientocontable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAsientoContable(this.estadoasientocontable);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoasientocontableAnterior!=null) {
						this.estadoasientocontable=this.estadoasientocontableAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoasientocontableReturnGeneral=estadoasientocontableLogic.procesarEventosEstadoAsientoContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoasientocontableLogic.getEstadoAsientoContables(),this.estadoasientocontable,this.estadoasientocontableParameterGeneral,this.isEsNuevoEstadoAsientoContable,classes);//this.estadoasientocontableLogic.getEstadoAsientoContable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoasientocontableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoasientocontableReturnGeneral.getEstadoAsientoContable(),estadoasientocontableLogic.getEstadoAsientoContables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoasientocontableReturnGeneral.getEstadoAsientoContable(),this.estadoasientocontables);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoAsientoContable.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoAsientoContable.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoAsientoContable();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoAsientoContable() throws Exception {
		
		EstadoAsientoContableModel estadoasientocontableModel=(EstadoAsientoContableModel)this.jTableDatosEstadoAsientoContable.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoasientocontableModel.estadoasientocontables=this.estadoasientocontableLogic.getEstadoAsientoContables();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoasientocontableModel.estadoasientocontables=this.estadoasientocontables;
		}
		
		
		((EstadoAsientoContableModel) this.jTableDatosEstadoAsientoContable.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoAsientoContable() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoasientocontableAnterior(),this.estadoasientocontableLogic.getEstadoAsientoContables());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoasientocontableAnterior(),this.estadoasientocontables);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoAsientoContable();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoAsientoContable(EstadoAsientoContable estadoasientocontable,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroContabilidadDefecto.class)) {
					this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(estadoasientocontable.getParametroContabilidadDefectos());
					this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
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
										
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoasientocontable,new Object(),generalEntityParameterGeneral,this.estadoasientocontableReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoAsientoContableConstantesFunciones.getClassesRelationshipsOfEstadoAsientoContable(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoAsientoContableConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoAsientoContable(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoAsientoContable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoAsientoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoasientocontable,new Object(),generalEntityParameterGeneral,this.estadoasientocontableReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoAsientoContable(EstadoAsientoContableBean estadoasientocontableBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroContabilidadDefecto.class)) {
					this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(estadoasientocontable.getParametroContabilidadDefectos());
					this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoAsientoContable(ArrayList<Classe> classes,EstadoAsientoContableReturnGeneral estadoasientocontableReturnGeneral,EstadoAsientoContableBean estadoasientocontableBean,Boolean conDefault) throws Exception {
		
			this.estadoasientocontableBean.setParametroContabilidadDefectos(estadoasientocontableReturnGeneral.getEstadoAsientoContable().getParametroContabilidadDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoAsientoContable(EstadoAsientoContable estadoasientocontable,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroContabilidadDefecto.class)) {
					estadoasientocontable.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadoasientocontable)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoAsientoContable = new EstadoAsientoContableDetalleFormJInternalFrame(jDesktopPane,this.estadoasientocontableSessionBean.getConGuardarRelaciones(),this.estadoasientocontableSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoAsientoContable);
		this.jInternalFrameDetalleFormEstadoAsientoContable.setVisible(false);
		this.jInternalFrameDetalleFormEstadoAsientoContable.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.estadoasientocontableLogic=this.estadoasientocontableLogic;
		
		this.cargarCombosFrameForeignKeyEstadoAsientoContable("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoAsientoContable();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoAsientoContable();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoAsientoContable("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoAsientoContable();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoAsientoContable"));
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonModificarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"ModificarEstadoAsientoContable"));

		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonModificarToolBarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoAsientoContable"));
					
		this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemModificarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoAsientoContable"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonActualizarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"ActualizarEstadoAsientoContable"));
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonActualizarToolBarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoAsientoContable"));
						
		this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemActualizarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoAsientoContable"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonEliminarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"EliminarEstadoAsientoContable"));
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonEliminarToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoAsientoContable"));
								
		this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemEliminarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoAsientoContable"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonCancelarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"CancelarEstadoAsientoContable"));
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonCancelarToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoAsientoContable"));
					
		this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemCancelarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoAsientoContable"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemDetalleCerrarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoAsientoContable"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonGuardarCambiosToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoAsientoContable"));
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonGuardarCambiosToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoAsientoContable"));
		
		
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxTiposAccionesFormularioEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoAsientoContable"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonidEstadoAsientoContableBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoAsientoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtoncodigoEstadoAsientoContableBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoAsientoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonnombreEstadoAsientoContableBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoAsientoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonid_color_generalEstadoAsientoContableUpdate.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoAsientoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonid_color_generalEstadoAsientoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoAsientoContableBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoAsientoContable.jTabbedPaneRelacionesEstadoAsientoContable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoAsientoContable"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoAsientoContable"));
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoAsientoContable"));
		}
		
		this.jTableDatosEstadoAsientoContable.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoAsientoContable"));
		
		this.jTableDatosEstadoAsientoContable.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoAsientoContable"));
		
		this.jButtonNuevoEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"NuevoEstadoAsientoContable"));
		
		this.jButtonDuplicarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"DuplicarEstadoAsientoContable"));
		
		this.jButtonCopiarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"CopiarEstadoAsientoContable"));
		
		this.jButtonVerFormEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"VerFormEstadoAsientoContable"));
		
		
		this.jButtonNuevoToolBarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoAsientoContable"));
			
		this.jButtonDuplicarToolBarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoAsientoContable"));
			
		this.jMenuItemNuevoEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoAsientoContable"));
			
		this.jMenuItemDuplicarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoAsientoContable"));		
		
		
		this.jButtonNuevoRelacionesEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoAsientoContable"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoAsientoContable"));
			
		this.jMenuItemNuevoRelacionesEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoAsientoContable"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonModificarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"ModificarEstadoAsientoContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonModificarToolBarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoAsientoContable"));
			
			this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemModificarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoAsientoContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonActualizarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"ActualizarEstadoAsientoContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonActualizarToolBarEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoAsientoContable"));
				
			this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemActualizarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoAsientoContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonEliminarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"EliminarEstadoAsientoContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonEliminarToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoAsientoContable"));
						
			this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemEliminarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoAsientoContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonCancelarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"CancelarEstadoAsientoContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonCancelarToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoAsientoContable"));
			
			this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemCancelarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoAsientoContable"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoAsientoContable"));		
		
		
		this.jButtonCerrarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"CerrarEstadoAsientoContable"));
		
		
		this.jButtonCerrarToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoAsientoContable"));
			
		this.jMenuItemCerrarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoAsientoContable"));
			
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jMenuItemDetalleCerrarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoAsientoContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonGuardarCambiosEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoAsientoContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonGuardarCambiosToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoAsientoContable"));
		}
		
		this.jButtonCopiarToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoAsientoContable"));
			
		this.jButtonVerFormToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoAsientoContable"));
		
		this.jMenuItemGuardarCambiosEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoAsientoContable"));
			
		this.jMenuItemCopiarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoAsientoContable"));		
		
		this.jMenuItemVerFormEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoAsientoContable"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoAsientoContable"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoAsientoContable"));
			
		this.jMenuItemGuardarCambiosTablaEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoAsientoContable"));		
		
		
		
		this.jButtonRecargarInformacionEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoAsientoContable"));
					
		this.jButtonRecargarInformacionToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoAsientoContable"));
		
		this.jMenuItemRecargarInformacionEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoAsientoContable"));		
		
		
		
		this.jButtonAnterioresEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"AnterioresEstadoAsientoContable"));
		
		
		this.jButtonAnterioresToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoAsientoContable"));
		
		this.jMenuItemAnterioresEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoAsientoContable"));		
		
		
		this.jButtonSiguientesEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"SiguientesEstadoAsientoContable"));
		
		
		this.jButtonSiguientesToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoAsientoContable"));
			
		this.jMenuItemSiguientesEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoAsientoContable"));
			
		this.jMenuItemAbrirOrderByEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoAsientoContable"));
			
		this.jMenuItemMostrarOcultarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoAsientoContable"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoAsientoContable"));
			
		this.jMenuItemDetalleMostarOcultarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoAsientoContable"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoAsientoContable"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoAsientoContable"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoAsientoContable"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoAsientoContable.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoAsientoContable"));

		this.jCheckBoxSeleccionadosEstadoAsientoContable.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoAsientoContable"));
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxTiposAccionesFormularioEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoAsientoContable"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoAsientoContable"));
			
		this.jComboBoxTiposAccionesEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoAsientoContable"));
					
		this.jComboBoxTiposSeleccionarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoAsientoContable"));
			
		this.jTextFieldValorCampoGeneralEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoAsientoContable"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonidEstadoAsientoContableBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoAsientoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtoncodigoEstadoAsientoContableBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoAsientoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonnombreEstadoAsientoContableBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoAsientoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonid_color_generalEstadoAsientoContableUpdate.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoAsientoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonid_color_generalEstadoAsientoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoAsientoContableBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdColorGeneralEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"FK_IdColorGeneralEstadoAsientoContable"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoAsientoContable!=null) {
				this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoAsientoContable"));
				this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoAsientoContable"));
				this.jInternalFrameReporteDinamicoEstadoAsientoContable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoAsientoContable"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoAsientoContable"));				
			//this.jButtonGenerarReporteDinamicoEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoAsientoContable"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoAsientoContable"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoAsientoContable!=null) {
				this.jInternalFrameImportacionEstadoAsientoContable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoAsientoContable"));
				this.jInternalFrameImportacionEstadoAsientoContable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoAsientoContable"));
				this.jInternalFrameImportacionEstadoAsientoContable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoAsientoContable"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoAsientoContable"));
			
			this.jButtonAbrirOrderByToolBarEstadoAsientoContable.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoAsientoContable"));			
			
			if(this.jInternalFrameOrderByEstadoAsientoContable!=null) {
				this.jInternalFrameOrderByEstadoAsientoContable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoAsientoContable"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAsientoContable.jTabbedPaneRelacionesEstadoAsientoContable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoAsientoContable"));
		
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
            		closingInternalFrameEstadoAsientoContable();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoAsientoContable = (JInternalFrameBase)event.getSource();
	            	
	            EstadoAsientoContableBeanSwingJInternalFrame jInternalFrameParent=(EstadoAsientoContableBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoAsientoContable.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoAsientoContableActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoAsientoContable.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoAsientoContableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoAsientoContable.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoAsientoContable.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAsientoContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAsientoContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAsientoContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoAsientoContable";
		inputMap = this.jButtonNuevoEstadoAsientoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoAsientoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoAsientoContableActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAsientoContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAsientoContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAsientoContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoAsientoContable";
		inputMap = this.jButtonNuevoRelacionesEstadoAsientoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoAsientoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoAsientoContableActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoAsientoContable";
		inputMap = this.jButtonModificarEstadoAsientoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoAsientoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoAsientoContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoAsientoContable";
		inputMap = this.jButtonActualizarEstadoAsientoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoAsientoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoAsientoContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoAsientoContable";
		inputMap = this.jButtonEliminarEstadoAsientoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoAsientoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoAsientoContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoAsientoContable";
		inputMap = this.jButtonCancelarEstadoAsientoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoAsientoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoAsientoContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoAsientoContable";
		inputMap = this.jButtonCerrarEstadoAsientoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoAsientoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoAsientoContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonGuardarCambiosEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoAsientoContable";
		inputMap = this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonGuardarCambiosEstadoAsientoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonGuardarCambiosEstadoAsientoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoAsientoContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoAsientoContable.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoAsientoContableItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoAsientoContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoAsientoContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoAsientoContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoAsientoContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoAsientoContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoAsientoContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonidEstadoAsientoContableBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoAsientoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtoncodigoEstadoAsientoContableBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoAsientoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonnombreEstadoAsientoContableBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoAsientoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonid_color_generalEstadoAsientoContableUpdate.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoAsientoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAsientoContable.jButtonid_color_generalEstadoAsientoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_color_generalEstadoAsientoContableBusqueda"));
		
		
		this.jButtonFK_IdColorGeneralEstadoAsientoContable.addActionListener(new ButtonActionListener(this,"FK_IdColorGeneralEstadoAsientoContable"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoAsientoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoAsientoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoAsientoContableActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoAsientoContable.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoAsientoContable(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontableLogic.getEstadoAsientoContables()) {
					estadoasientocontableAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontables) {
					estadoasientocontableAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoAsientoContableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoAsientoContable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontableLogic.getEstadoAsientoContables()) {
						estadoasientocontableAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontables) {
						estadoasientocontableAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontableLogic.getEstadoAsientoContables()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontables) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoAsientoContable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoAsientoContable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoAsientoContableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoAsientoContable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoAsientoContable.getSelectedRows();
			
			EstadoAsientoContable estadoasientocontableLocal=new EstadoAsientoContable();
			
			//this.seleccionarTodosEstadoAsientoContable(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoasientocontableLocal =(EstadoAsientoContable) this.estadoasientocontableLogic.getEstadoAsientoContables().toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoasientocontableLocal =(EstadoAsientoContable) this.estadoasientocontables.toArray()[this.jTableDatosEstadoAsientoContable.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoasientocontableLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontableLogic.getEstadoAsientoContables()) {
						estadoasientocontableAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontables) {
						estadoasientocontableAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoAsientoContable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoAsientoContable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoAsientoContable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoAsientoContableItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoAsientoContableParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoAsientoContableActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoAsientoContable(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoAsientoContable.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontableLogic.getEstadoAsientoContables()) {
				
						if(sTipoSeleccionar.equals(EstadoAsientoContableConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoasientocontableAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoasientocontableAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontables) {
					
						if(sTipoSeleccionar.equals(EstadoAsientoContableConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoasientocontableAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoasientocontableAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoAsientoContableActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoAsientoContable(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoAsientoContable=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoAsientoContable.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxTiposAccionesFormularioEstadoAsientoContable.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoAsientoContable) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoAsientoContable(conSplash);
				
					this.generarReporteEstadoAsientoContablesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoAsientoContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxTiposAccionesFormularioEstadoAsientoContable.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoAsientoContablesSeleccionados();
				//this.jComboBoxTiposAccionesEstadoAsientoContable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoAsientoContablesSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoAsientoContable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoAsientoContablesSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoAsientoContable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoAsientoContable();
				
				this.exportarEstadoAsientoContablesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoAsientoContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxTiposAccionesFormularioEstadoAsientoContable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoAsientoContables();
				//this.importarEstadoAsientoContables();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoAsientoContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxTiposAccionesFormularioEstadoAsientoContable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoAsientoContable();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoAsientoContablesSeleccionados();
				//this.jComboBoxTiposAccionesEstadoAsientoContable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Asiento Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoAsientoContable();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoAsientoContable)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoAsientoContable(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoAsientoContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxTiposAccionesFormularioEstadoAsientoContable.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoAsientoContable();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoAsientoContable(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoAsientoContableActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoAsientoContable();
			
			if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();		
			EstadoAsientoContable estadoasientocontable=new EstadoAsientoContable();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoAsientoContable(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoAsientoContable.getSelectedItem();
			
			
			
			
			estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoasientocontablesSeleccionados.size()==1) {
				for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontablesSeleccionados) {
					estadoasientocontable=estadoasientocontableAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Contabilidad Defecto")) {
					jButtonParametroContabilidadDefectoActionPerformed(null,rowIndex,true,false,estadoasientocontable);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoAsientoContable();
			
      		//this.finishProcessEstadoAsientoContable(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoAsientoContableReturnGeneral() throws Exception {
		if(this.estadoasientocontableReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoasientocontableReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoasientocontableReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoasientocontableReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoasientocontableReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoasientocontableReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoAsientoContable(false);
		}
		
		if(this.estadoasientocontableReturnGeneral.getConRetornoLista() || this.estadoasientocontableReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoasientocontableReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoasientocontableLogic.setEstadoAsientoContables(this.estadoasientocontableReturnGeneral.getEstadoAsientoContables());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoasientocontableReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoasientocontableLogic.setEstadoAsientoContable(this.estadoasientocontableReturnGeneral.getEstadoAsientoContable());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoAsientoContable(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoAsientoContable() throws Exception {
		
		
	}
	
	public ArrayList<EstadoAsientoContable> getEstadoAsientoContablesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoAsientoContable) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontableLogic.getEstadoAsientoContables()) {
					if(estadoasientocontableAux.getIsSelected()) {
						estadoasientocontablesSeleccionados.add(estadoasientocontableAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoAsientoContable estadoasientocontableAux:this.estadoasientocontables) {
					if(estadoasientocontableAux.getIsSelected()) {
						estadoasientocontablesSeleccionados.add(estadoasientocontableAux);				
					}
				}
			}
			
			if(estadoasientocontablesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoasientocontablesSeleccionados.addAll(this.estadoasientocontableLogic.getEstadoAsientoContables());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoasientocontablesSeleccionados.addAll(this.estadoasientocontables);				
					}
				}
			}
		} else {
			estadoasientocontablesSeleccionados.add(this.estadoasientocontable);
		}
		
		return estadoasientocontablesSeleccionados;
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
	
	public void generarReporteEstadoAsientoContablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoAsientoContablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoAsientoContablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoAsientoContablesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoAsientoContablesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoAsientoContablesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Asiento Contable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoAsientoContablesSeleccionados() throws Exception {
		ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();		
		
		estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoAsientoContables("Todos",estadoasientocontablesSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoAsientoContablesSeleccionados() throws Exception {
		ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();		
		
		estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoAsientoContables("Todos",estadoasientocontablesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoAsientoContablesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();
		
		estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoAsientoContables("Todos",estadoasientocontablesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoAsientoContablesSeleccionados() throws Exception {
		ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoAsientoContable();
		
		
		estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoAsientoContable();
		
		
		//this.generarReporteEstadoAsientoContables("Todos",estadoasientocontablesSeleccionados ,estadoasientocontableImplementable,estadoasientocontableImplementableHome);
	}
	
	public void mostrarImportacionEstadoAsientoContables() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoAsientoContable();
		
		this.abrirFrameImportacionEstadoAsientoContable();		
		
			
		//this.generarReporteEstadoAsientoContables("Todos",estadoasientocontablesSeleccionados ,estadoasientocontableImplementable,estadoasientocontableImplementableHome);
	}
	
	public void importarEstadoAsientoContables() throws Exception {		
	
	}
	
	public void exportarEstadoAsientoContablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoAsientoContablesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoAsientoContablesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoAsientoContablesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Asiento Contable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoAsientoContablesSeleccionados() throws Exception {
		ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();		
		
		estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontable."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoAsientoContable(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontablesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoAsientoContable(estadoasientocontableAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoasientocontableAux.setsDetalleGeneralEntityReporte(estadoasientocontableAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoAsientoContable(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoAsientoContableConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoAsientoContableConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoAsientoContableConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoAsientoContable(EstadoAsientoContable estadoasientocontable,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoasientocontable.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoasientocontable.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoasientocontable.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoasientocontable.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoasientocontable.getcolorgeneral_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoAsientoContablesSeleccionados() throws Exception {
		ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();		
		
		estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontable.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoAsientoContables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoAsientoContable(row);				
				iRow++;
			}				
			
			for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontablesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoAsientoContable(estadoasientocontableAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoAsientoContablesSeleccionados() throws Exception {
		ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();		
		
		estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoasientocontable.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoasientocontables");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoasientocontable");
			//elementRoot.appendChild(element);
		
			for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontablesSeleccionados) {
				element = document.createElement("estadoasientocontable");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoAsientoContable(estadoasientocontableAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Asiento Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoAsientoContable(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAsientoContableConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAsientoContableConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAsientoContableConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoAsientoContable(EstadoAsientoContable estadoasientocontable,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoasientocontable.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoasientocontable.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoasientocontable.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoasientocontable.getcolorgeneral_descripcion());				
	}
	
	public void setFilaDatosExportarXmlEstadoAsientoContable(EstadoAsientoContable estadoasientocontable,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoAsientoContableConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoasientocontable.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoAsientoContableConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoasientocontable.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoAsientoContableConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoasientocontable.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoAsientoContableConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoasientocontable.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcolorgeneral_descripcion = document.createElement(EstadoAsientoContableConstantesFunciones.IDCOLORGENERAL);
		elementcolorgeneral_descripcion.appendChild(document.createTextNode(estadoasientocontable.getcolorgeneral_descripcion()));
		element.appendChild(elementcolorgeneral_descripcion);
	}
	
	public void generarReporteGroupGenericoEstadoAsientoContablesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados=new ArrayList<EstadoAsientoContable>();
		
		estadoasientocontablesSeleccionados=this.getEstadoAsientoContablesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoAsientoContable(estadoasientocontablesSeleccionados);
		
		this.generarReporteEstadoAsientoContables("Todos",estadoasientocontablesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoAsientoContable(ArrayList<EstadoAsientoContable> estadoasientocontablesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontablesSeleccionados) {
				estadoasientocontableAux.setsDetalleGeneralEntityReporte(estadoasientocontableAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoAsientoContableConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoasientocontableAux.setsDescripcionGeneralEntityReporte1(estadoasientocontableAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoasientocontableAux.setsDescripcionGeneralEntityReporte1(estadoasientocontableAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL)) {
					existe=true;
					estadoasientocontableAux.setsDescripcionGeneralEntityReporte1(estadoasientocontableAux.getcolorgeneral_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAsientoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoAsientoContable(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoAsientoContable=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoAsientoContable=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContable=false;
			this.isVisibilidadCeldaEliminarEstadoAsientoContable=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoAsientoContable=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=false;
			this.isVisibilidadCeldaModificarEstadoAsientoContable=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContable=true;
			this.isVisibilidadCeldaEliminarEstadoAsientoContable=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoAsientoContable=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=false;
			this.isVisibilidadCeldaModificarEstadoAsientoContable=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContable=true;
			this.isVisibilidadCeldaEliminarEstadoAsientoContable=true;
			this.isVisibilidadCeldaCancelarEstadoAsientoContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoAsientoContable=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=false;
			this.isVisibilidadCeldaModificarEstadoAsientoContable=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContable=true;
			this.isVisibilidadCeldaEliminarEstadoAsientoContable=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoAsientoContable=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=true;
			this.isVisibilidadCeldaModificarEstadoAsientoContable=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContable=false;
			this.isVisibilidadCeldaEliminarEstadoAsientoContable=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoAsientoContable=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=false;
			this.isVisibilidadCeldaActualizarEstadoAsientoContable=false;
			this.isVisibilidadCeldaEliminarEstadoAsientoContable=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoAsientoContable=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=false;
			this.isVisibilidadCeldaModificarEstadoAsientoContable=true;
			this.isVisibilidadCeldaActualizarEstadoAsientoContable=false;
			this.isVisibilidadCeldaEliminarEstadoAsientoContable=false;
			this.isVisibilidadCeldaCancelarEstadoAsientoContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAsientoContable=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoAsientoContableJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoAsientoContable=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=true;
		} else {
			this.actualizarEstadoPanelsEstadoAsientoContable(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoAsientoContable=false;
			//this.isVisibilidadCeldaVerFormEstadoAsientoContable=false;
			this.isVisibilidadCeldaDuplicarEstadoAsientoContable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoasientocontableSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoAsientoContable=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
			if(!estadoasientocontableSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=false;												
			}
			
			this.jButtonCerrarEstadoAsientoContable.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoAsientoContable=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoasientocontable)) {
			this.isVisibilidadCeldaActualizarEstadoAsientoContable=false;
			this.isVisibilidadCeldaEliminarEstadoAsientoContable=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoAsientoContable() {
		this.isVisibilidadCeldaNuevoEstadoAsientoContable=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoAsientoContable=false;
	}
	
	public void actualizarEstadoPanelsEstadoAsientoContable(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoAsientoContable!=null) {
				this.jTabbedPaneBusquedasEstadoAsientoContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEstadoAsientoContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContable!=null) {
				this.jPanelPaginacionEstadoAsientoContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContable!=null) {
				this.jPanelParametrosReportesEstadoAsientoContable.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoAsientoContable!=null) {
				this.jTabbedPaneBusquedasEstadoAsientoContable.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEstadoAsientoContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContable!=null) {
				this.jPanelPaginacionEstadoAsientoContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContable!=null) {
				this.jPanelParametrosReportesEstadoAsientoContable.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContable.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoAsientoContable!=null) {
				this.jTabbedPaneBusquedasEstadoAsientoContable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEstadoAsientoContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContable!=null) {
				this.jPanelPaginacionEstadoAsientoContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContable!=null) {
				this.jPanelParametrosReportesEstadoAsientoContable.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoAsientoContable!=null) {
				this.jTabbedPaneBusquedasEstadoAsientoContable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEstadoAsientoContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContable!=null) {
				this.jPanelPaginacionEstadoAsientoContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContable!=null) {
				this.jPanelParametrosReportesEstadoAsientoContable.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoAsientoContable!=null) {
				this.jTabbedPaneBusquedasEstadoAsientoContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEstadoAsientoContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContable!=null) {
				this.jPanelPaginacionEstadoAsientoContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContable!=null) {
				this.jPanelParametrosReportesEstadoAsientoContable.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoAsientoContable!=null) {
				this.jTabbedPaneBusquedasEstadoAsientoContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEstadoAsientoContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContable!=null) {
				this.jPanelPaginacionEstadoAsientoContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContable!=null) {
				this.jPanelParametrosReportesEstadoAsientoContable.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEdicionEstadoAsientoContable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoAsientoContable!=null) {
				this.jTabbedPaneBusquedasEstadoAsientoContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoAsientoContable!=null) {
				this.jScrollPanelDatosEstadoAsientoContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoAsientoContable!=null) {
				this.jPanelPaginacionEstadoAsientoContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContable!=null) {
				this.jPanelParametrosReportesEstadoAsientoContable.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEstadoAsientoContable!=null) {
					this.jTabbedPaneBusquedasEstadoAsientoContable.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContable!=null) {
				this.jPanelParametrosReportesEstadoAsientoContable.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoAsientoContable!=null) {
				this.jTabbedPaneBusquedasEstadoAsientoContable.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEstadoAsientoContable!=null) {
				this.jPanelParametrosReportesEstadoAsientoContable.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaColorGeneral(Boolean isParaColorGeneral){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaColorGeneralNegation=!isParaColorGeneral;

			this.isVisibilidadFK_IdColorGeneral=isParaColorGeneral;
			if(!this.isVisibilidadFK_IdColorGeneral) {this.jTabbedPaneBusquedasEstadoAsientoContable.remove(jPanelFK_IdColorGeneralEstadoAsientoContable);}
		}
		
	}
	
	

	public String registrarSesionEstadoAsientoContableParaParametroContabilidadDefectos() throws Exception {
		Boolean isPaginaPopupParametroContabilidadDefecto=false;

		try {

			if(this.estadoasientocontableSessionBean==null) {
				this.estadoasientocontableSessionBean=new EstadoAsientoContableSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoSessionBean.setsPathNavegacionActual(estadoasientocontableSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroContabilidadDefecto=this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto(true);
			this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto(EstadoAsientoContableConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoAsientoContable(true);
			this.jInternalFrameDetalleFormEstadoAsientoContable.parametrocontabilidaddefectoSessionBean.setlidEstadoAsientoContableActual(this.idEstadoAsientoContableActual);

			estadoasientocontableSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoAsientoContable(true);
			estadoasientocontableSessionBean.setlIdEstadoAsientoContableActualForeignKey(this.idEstadoAsientoContableActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoAsientoContableSessionBean estadoasientocontableSessionBean=new EstadoAsientoContableSessionBean();
		
		if(this.estadoasientocontableSessionBean==null) {
			this.estadoasientocontableSessionBean=new EstadoAsientoContableSessionBean();
		}
		
		this.estadoasientocontableSessionBean.setsUltimaBusquedaEstadoAsientoContable(this.getsAccionBusqueda());
		this.estadoasientocontableSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoasientocontableSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdColorGeneral")) {
			estadoasientocontableSessionBean.setid_color_general(this.getid_color_generalFK_IdColorGeneral());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoAsientoContableSessionBean estadoasientocontableSessionBean=new EstadoAsientoContableSessionBean();
		
		if(this.estadoasientocontableSessionBean==null) {
			this.estadoasientocontableSessionBean=new EstadoAsientoContableSessionBean();
		}
		
		if(this.estadoasientocontableSessionBean.getsUltimaBusquedaEstadoAsientoContable()!=null&&!this.estadoasientocontableSessionBean.getsUltimaBusquedaEstadoAsientoContable().equals("")) {
			this.setsAccionBusqueda(estadoasientocontableSessionBean.getsUltimaBusquedaEstadoAsientoContable());
			this.setiNumeroPaginacion(estadoasientocontableSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoasientocontableSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdColorGeneral")) {
				this.setid_color_generalFK_IdColorGeneral(estadoasientocontableSessionBean.getid_color_general());
				estadoasientocontableSessionBean.setid_color_general(-1L);
			}
		}
		
		this.estadoasientocontableSessionBean.setsUltimaBusquedaEstadoAsientoContable("");
		this.estadoasientocontableSessionBean.setiNumeroPaginacion(EstadoAsientoContableConstantesFunciones.INUMEROPAGINACION);
		this.estadoasientocontableSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoAsientoContable(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoAsientoContable() {
		this.updateBorderResaltarBusquedasFormularioEstadoAsientoContable();
		this.updateVisibilidadBusquedasFormularioEstadoAsientoContable();
		this.updateHabilitarBusquedasFormularioEstadoAsientoContable();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoAsientoContable() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEstadoAsientoContable.getComponents().length>0) {
	

		if(this.estadoasientocontableConstantesFunciones.resaltarFK_IdColorGeneralEstadoAsientoContable!=null) {
			index= this.jTabbedPaneBusquedasEstadoAsientoContable.indexOfComponent(this.jPanelFK_IdColorGeneralEstadoAsientoContable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoAsientoContable.getComponent(index);
				jPanel.setBorder(this.estadoasientocontableConstantesFunciones.resaltarFK_IdColorGeneralEstadoAsientoContable);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoAsientoContable() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEstadoAsientoContable.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadoAsientoContable.indexOfComponent(this.jPanelFK_IdColorGeneralEstadoAsientoContable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoAsientoContable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.estadoasientocontableConstantesFunciones.mostrarFK_IdColorGeneralEstadoAsientoContable);
			if(!this.estadoasientocontableConstantesFunciones.mostrarFK_IdColorGeneralEstadoAsientoContable && index>-1) {
				this.jTabbedPaneBusquedasEstadoAsientoContable.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEstadoAsientoContable() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEstadoAsientoContable.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadoAsientoContable.indexOfComponent(this.jPanelFK_IdColorGeneralEstadoAsientoContable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoAsientoContable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.estadoasientocontableConstantesFunciones.activarFK_IdColorGeneralEstadoAsientoContable);
				this.jTabbedPaneBusquedasEstadoAsientoContable.setEnabledAt(index,this.estadoasientocontableConstantesFunciones.activarFK_IdColorGeneralEstadoAsientoContable);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEstadoAsientoContable(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdColorGeneral")) {
			index= this.jTabbedPaneBusquedasEstadoAsientoContable.indexOfComponent(this.jPanelFK_IdColorGeneralEstadoAsientoContable);

			this.jTabbedPaneBusquedasEstadoAsientoContable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoAsientoContable.getComponent(index);

			this.estadoasientocontableConstantesFunciones.setResaltarFK_IdColorGeneralEstadoAsientoContable(resaltar);

			jPanel.setBorder(this.estadoasientocontableConstantesFunciones.resaltarFK_IdColorGeneralEstadoAsientoContable);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEstadoAsientoContable.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEstadoAsientoContable() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoAsientoContable();
		this.updateVisibilidadResaltarControlesFormularioEstadoAsientoContable();
		this.updateHabilitarResaltarControlesFormularioEstadoAsientoContable();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoAsientoContable() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoasientocontableConstantesFunciones.resaltaridEstadoAsientoContable!=null && this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldidEstadoAsientoContable.setBorder(this.estadoasientocontableConstantesFunciones.resaltaridEstadoAsientoContable);}
		if(this.estadoasientocontableConstantesFunciones.resaltarcodigoEstadoAsientoContable!=null && this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldcodigoEstadoAsientoContable.setBorder(this.estadoasientocontableConstantesFunciones.resaltarcodigoEstadoAsientoContable);}
		if(this.estadoasientocontableConstantesFunciones.resaltarnombreEstadoAsientoContable!=null && this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {this.jInternalFrameDetalleFormEstadoAsientoContable.jTextAreanombreEstadoAsientoContable.setBorder(this.estadoasientocontableConstantesFunciones.resaltarnombreEstadoAsientoContable);}
		if(this.estadoasientocontableConstantesFunciones.resaltarid_color_generalEstadoAsientoContable!=null && this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.setBorder(this.estadoasientocontableConstantesFunciones.resaltarid_color_generalEstadoAsientoContable);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoAsientoContable() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
	
		//this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldidEstadoAsientoContable.setVisible(this.estadoasientocontableConstantesFunciones.mostraridEstadoAsientoContable);
		this.jInternalFrameDetalleFormEstadoAsientoContable.jPanelidEstadoAsientoContable.setVisible(this.estadoasientocontableConstantesFunciones.mostraridEstadoAsientoContable);
		//this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldcodigoEstadoAsientoContable.setVisible(this.estadoasientocontableConstantesFunciones.mostrarcodigoEstadoAsientoContable);
		this.jInternalFrameDetalleFormEstadoAsientoContable.jPanelcodigoEstadoAsientoContable.setVisible(this.estadoasientocontableConstantesFunciones.mostrarcodigoEstadoAsientoContable);
		//this.jInternalFrameDetalleFormEstadoAsientoContable.jTextAreanombreEstadoAsientoContable.setVisible(this.estadoasientocontableConstantesFunciones.mostrarnombreEstadoAsientoContable);
		this.jInternalFrameDetalleFormEstadoAsientoContable.jPanelnombreEstadoAsientoContable.setVisible(this.estadoasientocontableConstantesFunciones.mostrarnombreEstadoAsientoContable);
		//this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.setVisible(this.estadoasientocontableConstantesFunciones.mostrarid_color_generalEstadoAsientoContable);
		this.jInternalFrameDetalleFormEstadoAsientoContable.jPanelid_color_generalEstadoAsientoContable.setVisible(this.estadoasientocontableConstantesFunciones.mostrarid_color_generalEstadoAsientoContable);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoAsientoContable() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoAsientoContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoAsientoContable!=null) {
	
		this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldidEstadoAsientoContable.setEnabled(this.estadoasientocontableConstantesFunciones.activaridEstadoAsientoContable);
		this.jInternalFrameDetalleFormEstadoAsientoContable.jTextFieldcodigoEstadoAsientoContable.setEnabled(this.estadoasientocontableConstantesFunciones.activarcodigoEstadoAsientoContable);
		this.jInternalFrameDetalleFormEstadoAsientoContable.jTextAreanombreEstadoAsientoContable.setEnabled(this.estadoasientocontableConstantesFunciones.activarnombreEstadoAsientoContable);
		this.jInternalFrameDetalleFormEstadoAsientoContable.jComboBoxid_color_generalEstadoAsientoContable.setEnabled(this.estadoasientocontableConstantesFunciones.activarid_color_generalEstadoAsientoContable);
		}
	}
	
		
}