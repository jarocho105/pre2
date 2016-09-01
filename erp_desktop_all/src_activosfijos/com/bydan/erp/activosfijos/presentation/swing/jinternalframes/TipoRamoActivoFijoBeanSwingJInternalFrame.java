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

import com.bydan.erp.activosfijos.util.TipoRamoActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.TipoRamoActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.TipoRamoActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.TipoRamoActivoFijoBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoRamoActivoFijoBeanSwingJInternalFrame extends TipoRamoActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoRamoActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRamoActivoFijo> tiporamoactivofijoValidator = new ClassValidator<TipoRamoActivoFijo>(TipoRamoActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRamoActivoFijo tiporamoactivofijo;	
	public TipoRamoActivoFijo tiporamoactivofijoAux;
	public TipoRamoActivoFijo tiporamoactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRamoActivoFijo tiporamoactivofijoTotales;
	public Long idTipoRamoActivoFijoActual;
	public Long iIdNuevoTipoRamoActivoFijo=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleActivoFijo=false;

	public Boolean getIsTienePermisosDetalleActivoFijo() {
		return isTienePermisosDetalleActivoFijo;
	}

	public void setIsTienePermisosDetalleActivoFijo(Boolean isTienePermisosDetalleActivoFijo) {
		this.isTienePermisosDetalleActivoFijo= isTienePermisosDetalleActivoFijo;
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
	
	public Boolean isPermisoTodoTipoRamoActivoFijo;
	public Boolean isPermisoNuevoTipoRamoActivoFijo;
	public Boolean isPermisoActualizarTipoRamoActivoFijo;
	public Boolean isPermisoActualizarOriginalTipoRamoActivoFijo;
	public Boolean isPermisoEliminarTipoRamoActivoFijo;
	public Boolean isPermisoGuardarCambiosTipoRamoActivoFijo;
	public Boolean isPermisoConsultaTipoRamoActivoFijo;
	public Boolean isPermisoBusquedaTipoRamoActivoFijo;
	public Boolean isPermisoReporteTipoRamoActivoFijo;
	public Boolean isPermisoPaginacionMedioTipoRamoActivoFijo;
	public Boolean isPermisoPaginacionAltoTipoRamoActivoFijo;
	public Boolean isPermisoPaginacionTodoTipoRamoActivoFijo;
	public Boolean isPermisoCopiarTipoRamoActivoFijo;
	public Boolean isPermisoVerFormTipoRamoActivoFijo;
	public Boolean isPermisoDuplicarTipoRamoActivoFijo;
	public Boolean isPermisoOrdenTipoRamoActivoFijo;
	
	
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
	
	public TipoRamoActivoFijoParameterReturnGeneral tiporamoactivofijoReturnGeneral;
	public TipoRamoActivoFijoParameterReturnGeneral tiporamoactivofijoParameterGeneral;
	
	

	public DetalleActivoFijoLogic detalleactivofijoLogic=null;

	public DetalleActivoFijoLogic getDetalleActivoFijoLogic() {
		return detalleactivofijoLogic;
	}

	public void setDetalleActivoFijoLogic(DetalleActivoFijoLogic detalleactivofijoLogic) {
		this.detalleactivofijoLogic = detalleactivofijoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRamoActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioTipoRamoActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoRamoActivoFijoLogic tiporamoactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRamoActivoFijo tiporamoactivofijoBean;
	public TipoRamoActivoFijoConstantesFunciones tiporamoactivofijoConstantesFunciones;
	//public TipoRamoActivoFijoParameterReturnGeneral tiporamoactivofijoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoRamoActivoFijo> tiporamoactivofijos;	
	//public List<TipoRamoActivoFijo> tiporamoactivofijosEliminados;
	//public List<TipoRamoActivoFijo> tiporamoactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRamoActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRamoActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarTipoRamoActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormTipoRamoActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenTipoRamoActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarTipoRamoActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarTipoRamoActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarTipoRamoActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarTipoRamoActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarTipoRamoActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoRamoActivoFijo() {
		return this.iIdNuevoTipoRamoActivoFijo;
	}

	public void setiIdNuevoTipoRamoActivoFijo(Long iIdNuevoTipoRamoActivoFijo) {
		this.iIdNuevoTipoRamoActivoFijo = iIdNuevoTipoRamoActivoFijo;
	}
	
	public Long getidTipoRamoActivoFijoActual() {
		return this.idTipoRamoActivoFijoActual;
	}

	public void setidTipoRamoActivoFijoActual(Long idTipoRamoActivoFijoActual) {
		this.idTipoRamoActivoFijoActual = idTipoRamoActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRamoActivoFijo gettiporamoactivofijo() {
		return this.tiporamoactivofijo;
	}

	public void settiporamoactivofijo(TipoRamoActivoFijo tiporamoactivofijo) {
		this.tiporamoactivofijo = tiporamoactivofijo;
	}
	
	public TipoRamoActivoFijo gettiporamoactivofijoAux() {
		return this.tiporamoactivofijoAux;
	}

	public void settiporamoactivofijoAux(TipoRamoActivoFijo tiporamoactivofijoAux) {
		this.tiporamoactivofijoAux = tiporamoactivofijoAux;
	}				
	
	public TipoRamoActivoFijo gettiporamoactivofijoAnterior() {
		return this.tiporamoactivofijoAnterior;
	}

	public void settiporamoactivofijoAnterior(TipoRamoActivoFijo tiporamoactivofijoAnterior) {
		this.tiporamoactivofijoAnterior = tiporamoactivofijoAnterior;
	}	
	
	public TipoRamoActivoFijo gettiporamoactivofijoTotales() {
		return this.tiporamoactivofijoTotales;
	}

	public void settiporamoactivofijoTotales(TipoRamoActivoFijo tiporamoactivofijoTotales) {
		this.tiporamoactivofijoTotales = tiporamoactivofijoTotales;
	}	
	
	public TipoRamoActivoFijo gettiporamoactivofijoBean() {
		return this.tiporamoactivofijoBean;
	}

	public void settiporamoactivofijoBean(TipoRamoActivoFijo tiporamoactivofijoBean) {
		this.tiporamoactivofijoBean = tiporamoactivofijoBean;
	}	
	
	public TipoRamoActivoFijoParameterReturnGeneral gettiporamoactivofijoReturnGeneral() {
		return this.tiporamoactivofijoReturnGeneral;
	}

	public void settiporamoactivofijoReturnGeneral(TipoRamoActivoFijoParameterReturnGeneral tiporamoactivofijoReturnGeneral) {
		this.tiporamoactivofijoReturnGeneral = tiporamoactivofijoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoRamoActivoFijoLogic getTipoRamoActivoFijoLogic()	{		
		return tiporamoactivofijoLogic;
	}

	public void setTipoRamoActivoFijoLogic(TipoRamoActivoFijoLogic tiporamoactivofijoLogic) {
		this.tiporamoactivofijoLogic = tiporamoactivofijoLogic;
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
	
	public Boolean getIsEsNuevoTipoRamoActivoFijo() {
		return isEsNuevoTipoRamoActivoFijo;
	}

	public void setIsEsNuevoTipoRamoActivoFijo(Boolean isEsNuevoTipoRamoActivoFijo) {
		this.isEsNuevoTipoRamoActivoFijo = isEsNuevoTipoRamoActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRamoActivoFijo() {
		return esParaAccionDesdeFormularioTipoRamoActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRamoActivoFijo(Boolean esParaAccionDesdeFormularioTipoRamoActivoFijo) {
		this.esParaAccionDesdeFormularioTipoRamoActivoFijo = esParaAccionDesdeFormularioTipoRamoActivoFijo;
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

			if(this.tiporamoactivofijoSessionBean==null) {
				this.tiporamoactivofijoSessionBean=new TipoRamoActivoFijoSessionBean();
			}

			if(!this.tiporamoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiporamoactivofijoSessionBean.getlidEmpresaActual());
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

					if(this.tiporamoactivofijo!=null) {
						this.tiporamoactivofijo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
						this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoRamoActivoFijo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoRamoActivoFijoGenerico)throws Exception
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
				jComboBoxid_empresaTipoRamoActivoFijoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoRamoActivoFijoGenerico!=null && jComboBoxid_empresaTipoRamoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoRamoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoRamoActivoFijo tiporamoactivofijo,JComboBox jComboBoxid_empresaTipoRamoActivoFijoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoRamoActivoFijoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoRamoActivoFijoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiporamoactivofijo.setid_empresa(empresaAux.getId());
				tiporamoactivofijo.setempresa_descripcion(TipoRamoActivoFijoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiporamoactivofijo.setEmpresa(empresaAux);			}
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

					if(!TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { 
					}

					if(!TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
							this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
							this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoRamoActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoRamoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesTipoRamoActivoFijo(this.tiporamoactivofijoLogic.getTipoRamoActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoRamoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesTipoRamoActivoFijo(this.tiporamoactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporamoactivofijoLogic.setTipoRamoActivoFijos(this.tiporamoactivofijos);
			tiporamoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoRamoActivoFijoParameterReturnGeneral getTipoRamoActivoFijoParameterGeneral() {
		return this.tiporamoactivofijoParameterGeneral;
	}
	
	public void setTipoRamoActivoFijoParameterGeneral(TipoRamoActivoFijoParameterReturnGeneral tiporamoactivofijoParameterGeneral) {
		this.tiporamoactivofijoParameterGeneral = tiporamoactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRamoActivoFijo() {
		return isPermisoTodoTipoRamoActivoFijo;
	}

	public void setIsPermisoTodoTipoRamoActivoFijo(Boolean isPermisoTodoTipoRamoActivoFijo) {
		this.isPermisoTodoTipoRamoActivoFijo = isPermisoTodoTipoRamoActivoFijo;
	}

	public Boolean getIsPermisoNuevoTipoRamoActivoFijo() {
		return isPermisoNuevoTipoRamoActivoFijo;
	}

	public void setIsPermisoNuevoTipoRamoActivoFijo(Boolean isPermisoNuevoTipoRamoActivoFijo) {
		this.isPermisoNuevoTipoRamoActivoFijo = isPermisoNuevoTipoRamoActivoFijo;
	}

	public Boolean getIsPermisoActualizarTipoRamoActivoFijo() {
		return isPermisoActualizarTipoRamoActivoFijo;
	}

	public void setIsPermisoActualizarTipoRamoActivoFijo(Boolean isPermisoActualizarTipoRamoActivoFijo) {
		this.isPermisoActualizarTipoRamoActivoFijo = isPermisoActualizarTipoRamoActivoFijo;
	}

	public Boolean getIsPermisoEliminarTipoRamoActivoFijo() {
		return isPermisoEliminarTipoRamoActivoFijo;
	}

	public void setIsPermisoEliminarTipoRamoActivoFijo(Boolean isPermisoEliminarTipoRamoActivoFijo) {
		this.isPermisoEliminarTipoRamoActivoFijo = isPermisoEliminarTipoRamoActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRamoActivoFijo() {
		return isPermisoGuardarCambiosTipoRamoActivoFijo;
	}

	public void setIsPermisoGuardarCambiosTipoRamoActivoFijo(Boolean isPermisoGuardarCambiosTipoRamoActivoFijo) {
		this.isPermisoGuardarCambiosTipoRamoActivoFijo = isPermisoGuardarCambiosTipoRamoActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaTipoRamoActivoFijo() {
		return isPermisoConsultaTipoRamoActivoFijo;
	}

	public void setIsPermisoConsultaTipoRamoActivoFijo(Boolean isPermisoConsultaTipoRamoActivoFijo) {
		this.isPermisoConsultaTipoRamoActivoFijo = isPermisoConsultaTipoRamoActivoFijo;
	}

	public Boolean getIsPermisoBusquedaTipoRamoActivoFijo() {
		return isPermisoBusquedaTipoRamoActivoFijo;
	}

	public void setIsPermisoBusquedaTipoRamoActivoFijo(Boolean isPermisoBusquedaTipoRamoActivoFijo) {
		this.isPermisoBusquedaTipoRamoActivoFijo = isPermisoBusquedaTipoRamoActivoFijo;
	}

	public Boolean getIsPermisoReporteTipoRamoActivoFijo() {
		return isPermisoReporteTipoRamoActivoFijo;
	}

	public void setIsPermisoReporteTipoRamoActivoFijo(Boolean isPermisoReporteTipoRamoActivoFijo) {
		this.isPermisoReporteTipoRamoActivoFijo = isPermisoReporteTipoRamoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRamoActivoFijo() {
		return isPermisoPaginacionMedioTipoRamoActivoFijo;
	}

	public void setIsPermisoPaginacionMedioTipoRamoActivoFijo(Boolean isPermisoPaginacionMedioTipoRamoActivoFijo) {
		this.isPermisoPaginacionMedioTipoRamoActivoFijo = isPermisoPaginacionMedioTipoRamoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRamoActivoFijo() {
		return isPermisoPaginacionTodoTipoRamoActivoFijo;
	}

	public void setIsPermisoPaginacionTodoTipoRamoActivoFijo(Boolean isPermisoPaginacionTodoTipoRamoActivoFijo) {
		this.isPermisoPaginacionTodoTipoRamoActivoFijo = isPermisoPaginacionTodoTipoRamoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRamoActivoFijo() {
		return isPermisoPaginacionAltoTipoRamoActivoFijo;
	}

	public void setIsPermisoPaginacionAltoTipoRamoActivoFijo(Boolean isPermisoPaginacionAltoTipoRamoActivoFijo) {
		this.isPermisoPaginacionAltoTipoRamoActivoFijo = isPermisoPaginacionAltoTipoRamoActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarTipoRamoActivoFijo() {
		return isPermisoCopiarTipoRamoActivoFijo;
	}

	public void setIsPermisoCopiarTipoRamoActivoFijo(Boolean isPermisoCopiarTipoRamoActivoFijo) {
		this.isPermisoCopiarTipoRamoActivoFijo = isPermisoCopiarTipoRamoActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormTipoRamoActivoFijo() {
		return isPermisoVerFormTipoRamoActivoFijo;
	}

	public void setIsPermisoVerFormTipoRamoActivoFijo(Boolean isPermisoVerFormTipoRamoActivoFijo) {
		this.isPermisoVerFormTipoRamoActivoFijo = isPermisoVerFormTipoRamoActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarTipoRamoActivoFijo() {
		return isPermisoDuplicarTipoRamoActivoFijo;
	}

	public void setIsPermisoDuplicarTipoRamoActivoFijo(Boolean isPermisoDuplicarTipoRamoActivoFijo) {
		this.isPermisoDuplicarTipoRamoActivoFijo = isPermisoDuplicarTipoRamoActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenTipoRamoActivoFijo() {
		return isPermisoOrdenTipoRamoActivoFijo;
	}

	public void setIsPermisoOrdenTipoRamoActivoFijo(Boolean isPermisoOrdenTipoRamoActivoFijo) {
		this.isPermisoOrdenTipoRamoActivoFijo = isPermisoOrdenTipoRamoActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRamoActivoFijo() {
		return isVisibilidadCeldaNuevoTipoRamoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoTipoRamoActivoFijo(Boolean isVisibilidadCeldaNuevoTipoRamoActivoFijo) {
		this.isVisibilidadCeldaNuevoTipoRamoActivoFijo = isVisibilidadCeldaNuevoTipoRamoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRamoActivoFijo() {
		return isVisibilidadCeldaDuplicarTipoRamoActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRamoActivoFijo(Boolean isVisibilidadCeldaDuplicarTipoRamoActivoFijo) {
		this.isVisibilidadCeldaDuplicarTipoRamoActivoFijo = isVisibilidadCeldaDuplicarTipoRamoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRamoActivoFijo() {
		return isVisibilidadCeldaCopiarTipoRamoActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarTipoRamoActivoFijo(Boolean isVisibilidadCeldaCopiarTipoRamoActivoFijo) {
		this.isVisibilidadCeldaCopiarTipoRamoActivoFijo = isVisibilidadCeldaCopiarTipoRamoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRamoActivoFijo() {
		return isVisibilidadCeldaVerFormTipoRamoActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormTipoRamoActivoFijo(Boolean isVisibilidadCeldaVerFormTipoRamoActivoFijo) {
		this.isVisibilidadCeldaVerFormTipoRamoActivoFijo = isVisibilidadCeldaVerFormTipoRamoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRamoActivoFijo() {
		return isVisibilidadCeldaOrdenTipoRamoActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenTipoRamoActivoFijo(Boolean isVisibilidadCeldaOrdenTipoRamoActivoFijo) {
		this.isVisibilidadCeldaOrdenTipoRamoActivoFijo = isVisibilidadCeldaOrdenTipoRamoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo = isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRamoActivoFijo() {
		return isVisibilidadCeldaModificarTipoRamoActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarTipoRamoActivoFijo(Boolean isVisibilidadCeldaModificarTipoRamoActivoFijo) {
		this.isVisibilidadCeldaModificarTipoRamoActivoFijo = isVisibilidadCeldaModificarTipoRamoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRamoActivoFijo() {
		return isVisibilidadCeldaActualizarTipoRamoActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarTipoRamoActivoFijo(Boolean isVisibilidadCeldaActualizarTipoRamoActivoFijo) {
		this.isVisibilidadCeldaActualizarTipoRamoActivoFijo = isVisibilidadCeldaActualizarTipoRamoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRamoActivoFijo() {
		return isVisibilidadCeldaEliminarTipoRamoActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarTipoRamoActivoFijo(Boolean isVisibilidadCeldaEliminarTipoRamoActivoFijo) {
		this.isVisibilidadCeldaEliminarTipoRamoActivoFijo = isVisibilidadCeldaEliminarTipoRamoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRamoActivoFijo() {
		return isVisibilidadCeldaCancelarTipoRamoActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarTipoRamoActivoFijo(Boolean isVisibilidadCeldaCancelarTipoRamoActivoFijo) {
		this.isVisibilidadCeldaCancelarTipoRamoActivoFijo = isVisibilidadCeldaCancelarTipoRamoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRamoActivoFijo() {
		return isVisibilidadCeldaGuardarTipoRamoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarTipoRamoActivoFijo(Boolean isVisibilidadCeldaGuardarTipoRamoActivoFijo) {
		this.isVisibilidadCeldaGuardarTipoRamoActivoFijo = isVisibilidadCeldaGuardarTipoRamoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo = isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo;
	}
		
	public TipoRamoActivoFijoSessionBean gettiporamoactivofijoSessionBean() {
		return this.tiporamoactivofijoSessionBean;
	}
	
	public void settiporamoactivofijoSessionBean(TipoRamoActivoFijoSessionBean tiporamoactivofijoSessionBean) {
		this.tiporamoactivofijoSessionBean=tiporamoactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiporamoactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(TipoRamoActivoFijo tiporamoactivofijo,TipoRamoActivoFijo tiporamoactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRamoActivoFijo(tiporamoactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporamoactivofijoAux.setId(tiporamoactivofijo.getId());
		tiporamoactivofijoAux.setVersionRow(tiporamoactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRamoActivoFijo();
		
			int intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.tiporamoactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporamoactivofijoValidator.getInvalidValues(this.tiporamoactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporamoactivofijoLogic.setDatosCliente(datosCliente);
			tiporamoactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporamoactivofijoAux=new  TipoRamoActivoFijo();
				
				tiporamoactivofijoAux.setIsNew(true);
				tiporamoactivofijoAux.setIsChanged(true);
				
				tiporamoactivofijoAux.setTipoRamoActivoFijoOriginal(this.tiporamoactivofijo);
				
				tiporamoactivofijoAux.setId(this.tiporamoactivofijo.getId());	
				tiporamoactivofijoAux.setVersionRow(this.tiporamoactivofijo.getVersionRow());	
				tiporamoactivofijoAux.setid_empresa(this.tiporamoactivofijo.getid_empresa());	
				tiporamoactivofijoAux.setnombre(this.tiporamoactivofijo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporamoactivofijoAux,tiporamoactivofijoLogic.getTipoRamoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporamoactivofijoAux,tiporamoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporamoactivofijoLogic.saveTipoRamoActivoFijos();//WithConnection
						//tiporamoactivofijoLogic.getSetVersionRowTipoRamoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporamoactivofijo,tiporamoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesTipoRamoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporamoactivofijoAux=new  TipoRamoActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado() && this.tiporamoactivofijo.getId()>=0)) {
						
					tiporamoactivofijoAux.setIsNew(false);
				}
				
				tiporamoactivofijoAux.setIsDeleted(false);
			
				tiporamoactivofijoAux.setId(this.tiporamoactivofijo.getId());	
				tiporamoactivofijoAux.setVersionRow(this.tiporamoactivofijo.getVersionRow());	
				tiporamoactivofijoAux.setid_empresa(this.tiporamoactivofijo.getid_empresa());	
				tiporamoactivofijoAux.setnombre(this.tiporamoactivofijo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporamoactivofijoAux,tiporamoactivofijoLogic.getTipoRamoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporamoactivofijoAux,tiporamoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporamoactivofijoLogic.saveTipoRamoActivoFijos();//WithConnection
						//tiporamoactivofijoLogic.getSetVersionRowTipoRamoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporamoactivofijo,tiporamoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesTipoRamoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporamoactivofijoAux=new  TipoRamoActivoFijo();
				
				tiporamoactivofijoAux.setIsNew(false);
				tiporamoactivofijoAux.setIsChanged(false);
				
				tiporamoactivofijoAux.setIsDeleted(true);
				
				tiporamoactivofijoAux.setId(this.tiporamoactivofijo.getId());	
				tiporamoactivofijoAux.setVersionRow(this.tiporamoactivofijo.getVersionRow());	
				tiporamoactivofijoAux.setid_empresa(this.tiporamoactivofijo.getid_empresa());	
				tiporamoactivofijoAux.setnombre(this.tiporamoactivofijo.getnombre());	
				
				if(this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporamoactivofijoAux.getId()>=0) {	
						this.tiporamoactivofijosEliminados.add(tiporamoactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporamoactivofijoAux,tiporamoactivofijoLogic.getTipoRamoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporamoactivofijoAux,tiporamoactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporamoactivofijoLogic.saveTipoRamoActivoFijos();//WithConnection
						//tiporamoactivofijoLogic.getSetVersionRowTipoRamoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporamoactivofijoAux.setDetalleActivoFijos(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiporamoactivofijoAux,tiporamoactivofijoLogic.getTipoRamoActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiporamoactivofijoAux,tiporamoactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().addAll(this.tiporamoactivofijosEliminados);
					
					tiporamoactivofijoLogic.saveTipoRamoActivoFijos();//WithConnection
					//tiporamoactivofijoLogic.getSetVersionRowTipoRamoActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoRamoActivoFijo();
				
				this.tiporamoactivofijosEliminados= new ArrayList<TipoRamoActivoFijo>();		
			}
			
			if(this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Ramo Activo Fijo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Ramo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporamoactivofijo=tiporamoactivofijoAux;
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
      		//this.finishProcessTipoRamoActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRamoActivoFijo tiporamoactivofijoLocal) throws Exception {
		
		if(this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiporamoactivofijoLocal.setDetalleActivoFijos(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
			
			} else {
			
				tiporamoactivofijoLocal.setDetalleActivoFijos(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRamoActivoFijo tiporamoactivofijoLocal) throws Exception {	
		if(this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiporamoactivofijoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoRamoActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporamoactivofijoValidator.getInvalidValues(this.tiporamoactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRamoActivoFijo tiporamoactivofijo,List<TipoRamoActivoFijo> tiporamoactivofijos) throws Exception {
		try	{		
			TipoRamoActivoFijoConstantesFunciones.actualizarLista(tiporamoactivofijo,tiporamoactivofijos,this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRamoActivoFijo tiporamoactivofijo,List<TipoRamoActivoFijo> tiporamoactivofijos) throws Exception {
		try	{			
			TipoRamoActivoFijoConstantesFunciones.actualizarSelectedLista(tiporamoactivofijo,tiporamoactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRamoActivoFijo> tiporamoactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporamoactivofijosLocal=this.tiporamoactivofijoLogic.getTipoRamoActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporamoactivofijosLocal=this.tiporamoactivofijos;
			}
			//ARCHITECTURE
		
			for(TipoRamoActivoFijo tiporamoactivofijoLocal:tiporamoactivofijosLocal) {
				if(this.permiteMantenimiento(tiporamoactivofijoLocal) && tiporamoactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoRamoActivoFijoConstantesFunciones.getTipoRamoActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoRamoActivoFijoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelid_empresaTipoRamoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRamoActivoFijoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelnombreTipoRamoActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelid_empresaTipoRamoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelnombreTipoRamoActivoFijo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleActivoFijo")) {
			if(this.tiporamoactivofijo==null) {
				this.tiporamoactivofijo= new TipoRamoActivoFijo();
			}

			if(this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoRamoActivoFijo
				this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.tiporamoactivofijo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);

				this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getdetalleactivofijo().setTipoRamoActivoFijo(this.tiporamoactivofijo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoRamoActivoFijo--;	
		
		
		this.tiporamoactivofijoAux=new TipoRamoActivoFijo();
		
		this.tiporamoactivofijoAux.setId(this.iIdNuevoTipoRamoActivoFijo);
		this.tiporamoactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().add(this.tiporamoactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporamoactivofijos.add(this.tiporamoactivofijoAux);
		}
		//ARCHITECTURE
		
		this.tiporamoactivofijo=this.tiporamoactivofijoAux;
		
		if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRamoActivoFijo(this.tiporamoactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRamoActivoFijo(this.tiporamoactivofijo);
		}
				
		//this.setDefaultControlesTipoRamoActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRamoActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRamoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRamoActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRamoActivoFijo(this.tiporamoactivofijoBean,this.tiporamoactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=TipoRamoActivoFijoConstantesFunciones.getClassesRelationshipsOfTipoRamoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporamoactivofijoReturnGeneral=tiporamoactivofijoLogic.procesarEventosTipoRamoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporamoactivofijoLogic.getTipoRamoActivoFijos(),this.tiporamoactivofijo,this.tiporamoactivofijoParameterGeneral,this.isEsNuevoTipoRamoActivoFijo,classes);//this.tiporamoactivofijoLogic.getTipoRamoActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRamoActivoFijo(this.tiporamoactivofijoReturnGeneral,this.tiporamoactivofijoBean,false);
		
		if(this.tiporamoactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRamoActivoFijo(this.tiporamoactivofijoReturnGeneral.getTipoRamoActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRamoActivoFijo(this.tiporamoactivofijoReturnGeneral.getTipoRamoActivoFijo());
		}
		
		if(this.tiporamoactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRamoActivoFijo(this.tiporamoactivofijoReturnGeneral.getTipoRamoActivoFijo(),classes);//this.tiporamoactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.tiporamoactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRamoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRamoActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRamoActivoFijo(false);
						
			if(tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado() && DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleActivoFijoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRamoActivoFijo();
			}
			
			this.actualizarVisualTableDatosTipoRamoActivoFijo();
			
			this.jTableDatosTipoRamoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoRamoActivoFijo(), this.getIndiceNuevoTipoRamoActivoFijo());
			
			this.seleccionarFilaTablaTipoRamoActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesTipoRamoActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRamoActivoFijo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTextAreanombreTipoRamoActivoFijo.setEnabled(isHabilitar && this.tiporamoactivofijoConstantesFunciones.activarnombreTipoRamoActivoFijo);	
		//
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.setEnabled(isHabilitar && this.tiporamoactivofijoConstantesFunciones.activarid_empresaTipoRamoActivoFijo);
	};
	
	public void setDefaultControlesTipoRamoActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRamoActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporamoactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.tiporamoactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTabbedPaneRelacionesTipoRamoActivoFijo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiporamoactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.tiporamoactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTabbedPaneRelacionesTipoRamoActivoFijo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoRamoActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijoLogic.getTipoRamoActivoFijos()) {
				if(tiporamoactivofijoAux.getId().equals(this.iIdNuevoTipoRamoActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijos) {
				if(tiporamoactivofijoAux.getId().equals(this.iIdNuevoTipoRamoActivoFijo)) {
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
	
	public int getIndiceActualTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijoLogic.getTipoRamoActivoFijos()) {
				if(tiporamoactivofijoAux.getId().equals(tiporamoactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijos) {
				if(tiporamoactivofijoAux.getId().equals(tiporamoactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijoLogic.getTipoRamoActivoFijos()) {
				if(tiporamoactivofijoAux.getTipoRamoActivoFijoOriginal().getId().equals(tiporamoactivofijoOriginal.getId())) {
					existe=true;
					tiporamoactivofijoOriginal.setId(tiporamoactivofijoAux.getId());
					tiporamoactivofijoOriginal.setVersionRow(tiporamoactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijos) {
				if(tiporamoactivofijoAux.getTipoRamoActivoFijoOriginal().getId().equals(tiporamoactivofijoOriginal.getId())) {
					existe=true;
					tiporamoactivofijoOriginal.setId(tiporamoactivofijoAux.getId());
					tiporamoactivofijoOriginal.setVersionRow(tiporamoactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRamoActivoFijo(Boolean esParaCancelar) throws Exception {
		tiporamoactivofijosAux=new ArrayList<TipoRamoActivoFijo>();
		tiporamoactivofijoAux=new TipoRamoActivoFijo();
		
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijoLogic.getTipoRamoActivoFijos()) {
					if(tiporamoactivofijoAux.getId()<0) {
						tiporamoactivofijosAux.add(tiporamoactivofijoAux);
					}		
				}
				this.iIdNuevoTipoRamoActivoFijo=0L;
				this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().removeAll(tiporamoactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijos) {
					if(tiporamoactivofijoAux.getId()<0) {
						tiporamoactivofijosAux.add(tiporamoactivofijoAux);
					}		
				}
				this.iIdNuevoTipoRamoActivoFijo=0L;
				this.tiporamoactivofijos.removeAll(tiporamoactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRamoActivoFijo 
					&& this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().size()>0
					) {
					tiporamoactivofijoAux=this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().get(this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().size() - 1);
				
					if(tiporamoactivofijoAux.getId()<0) {
						this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().remove(tiporamoactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRamoActivoFijo && this.tiporamoactivofijos.size()>0) {
					tiporamoactivofijoAux=this.tiporamoactivofijos.get(this.tiporamoactivofijos.size() - 1);
				
					if(tiporamoactivofijoAux.getId()<0) {
						this.tiporamoactivofijos.remove(tiporamoactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRamoActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporamoactivofijo.getId()<0) {
				this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().remove(this.tiporamoactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporamoactivofijo.getId()<0) {
				this.tiporamoactivofijos.remove(this.tiporamoactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRamoActivoFijo(List<TipoRamoActivoFijo> tiporamoactivofijosAux) throws Exception {
		TipoRamoActivoFijoConstantesFunciones.setEstadosInicialesTipoRamoActivoFijo(tiporamoactivofijosAux);
	}
	
	public void setEstadosInicialesTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijoAux) throws Exception {
		TipoRamoActivoFijoConstantesFunciones.setEstadosInicialesTipoRamoActivoFijo(tiporamoactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoRamoActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRamoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoRamoActivoFijoActual()) {
				if(!this.isEsNuevoTipoRamoActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRamoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRamoActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoRamoActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Ramo Activo Fijo ?", "MANTENIMIENTO DE Tipo Ramo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRamoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRamoActivoFijo tiporamoactivofijo) throws Exception {
		TipoRamoActivoFijoConstantesFunciones.seleccionarAsignar(this.tiporamoactivofijo,tiporamoactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRamoActivoFijo=this.isPermisoActualizarOriginalTipoRamoActivoFijo;
			
			
			this.seleccionarAsignar(tiporamoactivofijo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRamoActivoFijoConstantesFunciones.quitarEspaciosTipoRamoActivoFijo(this.tiporamoactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRamoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporamoactivofijoSessionBean.setsFuncionBusquedaRapida(this.tiporamoactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoRamoActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRamoActivoFijo(esParaCancelar);				
				this.cancelarNuevoTipoRamoActivoFijo(esParaCancelar);								
			}
			
			this.tiporamoactivofijo=new TipoRamoActivoFijo();
			
			this.inicializarTipoRamoActivoFijo();
			
			this.actualizarEstadoCeldasBotonesTipoRamoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRamoActivoFijo() throws Exception {
		try {
			TipoRamoActivoFijoConstantesFunciones.inicializarTipoRamoActivoFijo(this.tiporamoactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRamoActivoFijos(String sAccionBusqueda,List<TipoRamoActivoFijo> tiporamoactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRamoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoRamoActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoRamoActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRamoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Ramo Activo Fijos");		
		parameters.put("busquedapor", TipoRamoActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleActivoFijo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoRamoActivoFijoLogic tiporamoactivofijoLogicAuxiliar=new TipoRamoActivoFijoLogic();
					tiporamoactivofijoLogicAuxiliar.setDatosCliente(tiporamoactivofijoLogic.getDatosCliente());				
					tiporamoactivofijoLogicAuxiliar.setTipoRamoActivoFijos(tiporamoactivofijosParaReportes);
					
					tiporamoactivofijoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoRamoActivoFijoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiporamoactivofijosParaReportes=tiporamoactivofijoLogicAuxiliar.getTipoRamoActivoFijos();
					
					//tiporamoactivofijoLogic.getNewConnexionToDeep();
					
					//for (TipoRamoActivoFijo tiporamoactivofijo:tiporamoactivofijosParaReportes) {
					//	tiporamoactivofijoLogic.deepLoad(tiporamoactivofijo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiporamoactivofijoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiporamoactivofijoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleActivoFijo = AuxiliarReportes.class.getResourceAsStream("DetalleActivoFijoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleactivofijo", reportFileDetalleActivoFijo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRamoActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoRamoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoRamoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRamoActivoFijo=new JRBeanArrayDataSource(TipoRamoActivoFijoJInternalFrame.TraerTipoRamoActivoFijoBeans(tiporamoactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRamoActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoRamoActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoRamoActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoRamoActivoFijoBean.TraerTipoRamoActivoFijoBeans(tiporamoactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRamoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tiporamoactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRamoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tiporamoactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoRamoActivoFijoActionPerformed(null);
					//this.generarExcelReporteTipoRamoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tiporamoactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRamoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tiporamoactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRamoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tiporamoactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRamoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tiporamoactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRamoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRamoActivoFijo> tiporamoactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporamoactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRamoActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRamoActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRamoActivoFijo tiporamoactivofijo : tiporamoactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoRamoActivoFijoConstantesFunciones.generarExcelReporteDataTipoRamoActivoFijo("NORMAL",row,workbook,tiporamoactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ramo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRamoActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		TipoRamoActivoFijoConstantesFunciones.generarExcelReporteHeaderTipoRamoActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRamoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRamoActivoFijo> tiporamoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporamoactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRamoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRamoActivoFijo tiporamoactivofijo : tiporamoactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoRamoActivoFijoConstantesFunciones.getTipoRamoActivoFijoDescripcion(tiporamoactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporamoactivofijo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporamoactivofijo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ramo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRamoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRamoActivoFijo> tiporamoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRamoActivoFijo> tiporamoactivofijosRespaldo=null;
		
		classes=TipoRamoActivoFijoConstantesFunciones.getClassesRelationshipsOfTipoRamoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporamoactivofijoLogic.setDatosCliente(this.datosCliente);
		this.tiporamoactivofijoLogic.setDatosDeep(this.datosDeep);
		this.tiporamoactivofijoLogic.setIsConDeep(true);
		
		tiporamoactivofijosRespaldo=this.tiporamoactivofijoLogic.getTipoRamoActivoFijos();
		
		this.tiporamoactivofijoLogic.setTipoRamoActivoFijos(tiporamoactivofijosParaReportes);	
		this.tiporamoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporamoactivofijosParaReportes=this.tiporamoactivofijoLogic.getTipoRamoActivoFijos();
		this.tiporamoactivofijoLogic.setTipoRamoActivoFijos(tiporamoactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporamoactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRamoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRamoActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRamoActivoFijo tiporamoactivofijo : tiporamoactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRamoActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoRamoActivoFijoConstantesFunciones.generarExcelReporteDataTipoRamoActivoFijo("NORMAL",row,workbook,tiporamoactivofijo,cellStyleDataAux);
		
			
			


				//DetalleActivoFijo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiporamoactivofijo.getDetalleActivoFijos()!=null && tiporamoactivofijo.getDetalleActivoFijos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleActivoFijoConstantesFunciones.generarExcelReporteHeaderDetalleActivoFijo("RELACIONADO",row,workbook);
				}

				if(tiporamoactivofijo.getDetalleActivoFijos()!=null) {
					i2=0;
					for(DetalleActivoFijo detalleactivofijo : tiporamoactivofijo.getDetalleActivoFijos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleActivoFijoConstantesFunciones.generarExcelReporteDataDetalleActivoFijo("RELACIONADO",row,workbook,detalleactivofijo,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoRamoActivoFijoConstantesFunciones.getTipoRamoActivoFijoDescripcion(tiporamoactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ramo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRamoActivoFijo() throws Exception {		
		this.startProcessTipoRamoActivoFijo(true);
	}
	
	public void startProcessTipoRamoActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoRamoActivoFijo ,this.jPanelParametrosReportesTipoRamoActivoFijo, this.jScrollPanelDatosTipoRamoActivoFijo,this.jPanelPaginacionTipoRamoActivoFijo, this.jScrollPanelDatosEdicionTipoRamoActivoFijo, this.jPanelAccionesTipoRamoActivoFijo,this.jPanelAccionesFormularioTipoRamoActivoFijo,this.jmenuBarTipoRamoActivoFijo,this.jmenuBarDetalleTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,this.jTtoolBarDetalleTipoRamoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRamoActivoFijo=this.jTabbedPaneBusquedasTipoRamoActivoFijo; 
		
		final JPanel jPanelParametrosReportesTipoRamoActivoFijo=this.jPanelParametrosReportesTipoRamoActivoFijo;
		//final JScrollPane jScrollPanelDatosTipoRamoActivoFijo=this.jScrollPanelDatosTipoRamoActivoFijo;
		final JTable jTableDatosTipoRamoActivoFijo=this.jTableDatosTipoRamoActivoFijo;		
		final JPanel jPanelPaginacionTipoRamoActivoFijo=this.jPanelPaginacionTipoRamoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionTipoRamoActivoFijo=this.jScrollPanelDatosEdicionTipoRamoActivoFijo;
		final JPanel jPanelAccionesTipoRamoActivoFijo=this.jPanelAccionesTipoRamoActivoFijo;
		
		JPanel jPanelCamposAuxiliarTipoRamoActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRamoActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
			jPanelCamposAuxiliarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jPanelCamposTipoRamoActivoFijo;
			jPanelAccionesFormularioAuxiliarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jPanelAccionesFormularioTipoRamoActivoFijo;
		}
		
		final JPanel jPanelCamposTipoRamoActivoFijo=jPanelCamposAuxiliarTipoRamoActivoFijo;
		final JPanel jPanelAccionesFormularioTipoRamoActivoFijo=jPanelAccionesFormularioAuxiliarTipoRamoActivoFijo;
		
		
		final JMenuBar jmenuBarTipoRamoActivoFijo=this.jmenuBarTipoRamoActivoFijo;
		final JToolBar jTtoolBarTipoRamoActivoFijo=this.jTtoolBarTipoRamoActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRamoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRamoActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jmenuBarDetalleTipoRamoActivoFijo;
			jTtoolBarDetalleAuxiliarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTtoolBarDetalleTipoRamoActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleTipoRamoActivoFijo=jmenuBarDetalleAuxiliarTipoRamoActivoFijo;
		final JToolBar jTtoolBarDetalleTipoRamoActivoFijo=jTtoolBarDetalleAuxiliarTipoRamoActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRamoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRamoActivoFijo;
			processRunnable.jTableDatos=jTableDatosTipoRamoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposTipoRamoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRamoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRamoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRamoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRamoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRamoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarTipoRamoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRamoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRamoActivoFijo ,jPanelParametrosReportesTipoRamoActivoFijo,jTableDatosTipoRamoActivoFijo, /*jScrollPanelDatosTipoRamoActivoFijo,*/jPanelCamposTipoRamoActivoFijo,jPanelPaginacionTipoRamoActivoFijo, /*jScrollPanelDatosEdicionTipoRamoActivoFijo,*/ jPanelAccionesTipoRamoActivoFijo,jPanelAccionesFormularioTipoRamoActivoFijo,jmenuBarTipoRamoActivoFijo,jmenuBarDetalleTipoRamoActivoFijo,jTtoolBarTipoRamoActivoFijo,jTtoolBarDetalleTipoRamoActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRamoActivoFijo ,jPanelParametrosReportesTipoRamoActivoFijo, jScrollPanelDatosTipoRamoActivoFijo,jPanelPaginacionTipoRamoActivoFijo, jScrollPanelDatosEdicionTipoRamoActivoFijo, jPanelAccionesTipoRamoActivoFijo,jPanelAccionesFormularioTipoRamoActivoFijo,jmenuBarTipoRamoActivoFijo,jmenuBarDetalleTipoRamoActivoFijo,jTtoolBarTipoRamoActivoFijo,jTtoolBarDetalleTipoRamoActivoFijo);
						
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
	
	public void finishProcessTipoRamoActivoFijo() {// throws Exception 
		this.finishProcessTipoRamoActivoFijo(true);
	}
	
	public void finishProcessTipoRamoActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoRamoActivoFijo ,this.jPanelParametrosReportesTipoRamoActivoFijo, this.jScrollPanelDatosTipoRamoActivoFijo,this.jPanelPaginacionTipoRamoActivoFijo, this.jScrollPanelDatosEdicionTipoRamoActivoFijo, this.jPanelAccionesTipoRamoActivoFijo,this.jPanelAccionesFormularioTipoRamoActivoFijo,this.jmenuBarTipoRamoActivoFijo,this.jmenuBarDetalleTipoRamoActivoFijo,this.jTtoolBarTipoRamoActivoFijo,this.jTtoolBarDetalleTipoRamoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRamoActivoFijo=this.jTabbedPaneBusquedasTipoRamoActivoFijo; 
		
		final JPanel jPanelParametrosReportesTipoRamoActivoFijo=this.jPanelParametrosReportesTipoRamoActivoFijo;
		//final JScrollPane jScrollPanelDatosTipoRamoActivoFijo=this.jScrollPanelDatosTipoRamoActivoFijo;
		final JTable jTableDatosTipoRamoActivoFijo=this.jTableDatosTipoRamoActivoFijo;		
		final JPanel jPanelPaginacionTipoRamoActivoFijo=this.jPanelPaginacionTipoRamoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionTipoRamoActivoFijo=this.jScrollPanelDatosEdicionTipoRamoActivoFijo;
		final JPanel jPanelAccionesTipoRamoActivoFijo=this.jPanelAccionesTipoRamoActivoFijo;
		
		JPanel jPanelCamposAuxiliarTipoRamoActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRamoActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
			jPanelCamposAuxiliarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jPanelCamposTipoRamoActivoFijo;
			jPanelAccionesFormularioAuxiliarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jPanelAccionesFormularioTipoRamoActivoFijo;
		}
		
		final JPanel jPanelCamposTipoRamoActivoFijo=jPanelCamposAuxiliarTipoRamoActivoFijo;
		final JPanel jPanelAccionesFormularioTipoRamoActivoFijo=jPanelAccionesFormularioAuxiliarTipoRamoActivoFijo;
		
		
		final JMenuBar jmenuBarTipoRamoActivoFijo=this.jmenuBarTipoRamoActivoFijo;		
		final JToolBar jTtoolBarTipoRamoActivoFijo=this.jTtoolBarTipoRamoActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRamoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRamoActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jmenuBarDetalleTipoRamoActivoFijo;
			jTtoolBarDetalleAuxiliarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTtoolBarDetalleTipoRamoActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRamoActivoFijo=jmenuBarDetalleAuxiliarTipoRamoActivoFijo;
		final JToolBar jTtoolBarDetalleTipoRamoActivoFijo=jTtoolBarDetalleAuxiliarTipoRamoActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRamoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRamoActivoFijo;
			processRunnable.jTableDatos=jTableDatosTipoRamoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposTipoRamoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRamoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRamoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRamoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRamoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRamoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarTipoRamoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRamoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRamoActivoFijo ,jPanelParametrosReportesTipoRamoActivoFijo, jTableDatosTipoRamoActivoFijo,/*jScrollPanelDatosTipoRamoActivoFijo,*/jPanelCamposTipoRamoActivoFijo,jPanelPaginacionTipoRamoActivoFijo, /*jScrollPanelDatosEdicionTipoRamoActivoFijo,*/ jPanelAccionesTipoRamoActivoFijo,jPanelAccionesFormularioTipoRamoActivoFijo,jmenuBarTipoRamoActivoFijo,jmenuBarDetalleTipoRamoActivoFijo,jTtoolBarTipoRamoActivoFijo,jTtoolBarDetalleTipoRamoActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRamoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRamoActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRamoActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRamoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRamoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRamoActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRamoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRamoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRamoActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporamoactivofijoConstantesFunciones.getsFinalQueryTipoRamoActivoFijo();
		String  finalQueryPaginacionTodos=this.tiporamoactivofijoConstantesFunciones.getsFinalQueryTipoRamoActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoRamoActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoTipoRamoActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoRamoActivoFijoConstantesFunciones.getArrayColumnasGlobalesTipoRamoActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoRamoActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporamoactivofijosEliminados= new ArrayList<TipoRamoActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRamoActivoFijo();
		
				///*TipoRamoActivoFijoSessionBean*/this.tiporamoactivofijoSessionBean=new TipoRamoActivoFijoSessionBean();
			
			if(this.tiporamoactivofijoSessionBean==null) {
				this.tiporamoactivofijoSessionBean=new TipoRamoActivoFijoSessionBean();
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
					this.iNumeroPaginacion=TipoRamoActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoRamoActivoFijoConstantesFunciones.getClassesForeignKeysOfTipoRamoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporamoactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporamoactivofijosAux= new ArrayList<TipoRamoActivoFijo>();
			
				
			tiporamoactivofijoLogic.setDatosCliente(this.datosCliente);
			tiporamoactivofijoLogic.setDatosDeep(this.datosDeep);
			tiporamoactivofijoLogic.setIsConDeep(true);
			
			
			tiporamoactivofijoLogic.getTipoRamoActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporamoactivofijoLogic.getTodosTipoRamoActivoFijos(finalQueryGlobal,pagination);
					
					//tiporamoactivofijoLogic.getTodosTipoRamoActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporamoactivofijoLogic.getTipoRamoActivoFijos()==null|| tiporamoactivofijoLogic.getTipoRamoActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporamoactivofijosAux= new ArrayList<TipoRamoActivoFijo>();
							tiporamoactivofijosAux.addAll(tiporamoactivofijoLogic.getTipoRamoActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporamoactivofijosAux= new ArrayList<TipoRamoActivoFijo>();
							tiporamoactivofijosAux.addAll(tiporamoactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporamoactivofijoLogic.getTodosTipoRamoActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//tiporamoactivofijoLogic.getTodosTipoRamoActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRamoActivoFijos("Todos",tiporamoactivofijoLogic.getTipoRamoActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporamoactivofijoLogic.setTipoRamoActivoFijos(new ArrayList<TipoRamoActivoFijo>());					
							tiporamoactivofijoLogic.getTipoRamoActivoFijos().addAll(tiporamoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporamoactivofijos=new ArrayList<TipoRamoActivoFijo>();
							tiporamoactivofijos.addAll(tiporamoactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRamoActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRamoActivoFijo=this.idActual;
				
				} else if(this.idTipoRamoActivoFijoActual!=null && this.idTipoRamoActivoFijoActual!=0L) {
					idTipoRamoActivoFijo=idTipoRamoActivoFijoActual;
				}
				
					
				this.sDetalleReporte=TipoRamoActivoFijoConstantesFunciones.getDetalleIndicePorId(idTipoRamoActivoFijo);
				
				this.tiporamoactivofijos=new ArrayList<TipoRamoActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporamoactivofijoLogic.getEntity(idTipoRamoActivoFijo);
					
					//tiporamoactivofijoLogic.getEntityWithConnection(idTipoRamoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporamoactivofijoLogic.setTipoRamoActivoFijos(new ArrayList<TipoRamoActivoFijo>());
					tiporamoactivofijoLogic.getTipoRamoActivoFijos().add(tiporamoactivofijoLogic.getTipoRamoActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporamoactivofijos=new ArrayList<TipoRamoActivoFijo>();
					this.tiporamoactivofijos.add(tiporamoactivofijo);
				}
				
				if(tiporamoactivofijoLogic.getTipoRamoActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoRamoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporamoactivofijoLogic.getTipoRamoActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRamoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRamoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporamoactivofijoLogic.getTipoRamoActivoFijos()==null||tiporamoactivofijoLogic.getTipoRamoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporamoactivofijos==null|| tiporamoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporamoactivofijosAux=new ArrayList<TipoRamoActivoFijo>();
						tiporamoactivofijosAux.addAll(tiporamoactivofijoLogic.getTipoRamoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporamoactivofijosAux=new ArrayList<TipoRamoActivoFijo>();
							tiporamoactivofijosAux.addAll(tiporamoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporamoactivofijoLogic.getTipoRamoActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRamoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRamoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRamoActivoFijos("FK_IdEmpresa",tiporamoactivofijoLogic.getTipoRamoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRamoActivoFijos("FK_IdEmpresa",tiporamoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporamoactivofijoLogic.setTipoRamoActivoFijos(new ArrayList<TipoRamoActivoFijo>());
						tiporamoactivofijoLogic.getTipoRamoActivoFijos().addAll(tiporamoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporamoactivofijos=new ArrayList<TipoRamoActivoFijo>();
							tiporamoactivofijos.addAll(tiporamoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRamoActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRamoActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporamoactivofijoLogic.getTipoRamoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporamoactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporamoactivofijoLogic.getTipoRamoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporamoactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRamoActivoFijo tiporamoactivofijo) {
		Boolean permite=true;
		
		if(this.tiporamoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoRamoActivoFijoConstantesFunciones.getOrderByListaTipoRamoActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoRamoActivoFijoConstantesFunciones.getOrderByListaTipoRamoActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRamoActivoFijo tiporamoactivofijo:tiporamoactivofijoLogic.getTipoRamoActivoFijos()) {
				if(tiporamoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tiporamoactivofijoTotales=tiporamoactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRamoActivoFijo tiporamoactivofijo:this.tiporamoactivofijos) {
				if(tiporamoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tiporamoactivofijoTotales=tiporamoactivofijo;
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
			this.tiporamoactivofijoAux=new TipoRamoActivoFijo();
			this.tiporamoactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.tiporamoactivofijoAux.setIsNew(false);
			this.tiporamoactivofijoAux.setIsChanged(false);
			this.tiporamoactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoRamoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoRamoActivoFijo(this.tiporamoactivofijoLogic.getTipoRamoActivoFijos(),this.tiporamoactivofijoAux);
				
				this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().add(this.tiporamoactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoRamoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoRamoActivoFijo(this.tiporamoactivofijos,this.tiporamoactivofijoAux);
				
				this.tiporamoactivofijos.add(this.tiporamoactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporamoactivofijoTotales=new TipoRamoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().remove(tiporamoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporamoactivofijos.remove(tiporamoactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporamoactivofijoTotales=new TipoRamoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRamoActivoFijo tiporamoactivofijo:tiporamoactivofijoLogic.getTipoRamoActivoFijos()) {
				if(tiporamoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tiporamoactivofijoTotales=tiporamoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRamoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoRamoActivoFijo(this.tiporamoactivofijoLogic.getTipoRamoActivoFijos(),tiporamoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRamoActivoFijo tiporamoactivofijo:this.tiporamoactivofijos) {
				if(tiporamoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tiporamoactivofijoTotales=tiporamoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRamoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoRamoActivoFijo(this.tiporamoactivofijos,tiporamoactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoRamoActivoFijosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoRamoActivoFijosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporamoactivofijoLogic.getTipoRamoActivoFijosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoRamoActivoFijo() {
		this.isPermisoTodoTipoRamoActivoFijo=false;
		this.isPermisoNuevoTipoRamoActivoFijo=false;
		this.isPermisoActualizarTipoRamoActivoFijo=false;
		this.isPermisoActualizarOriginalTipoRamoActivoFijo=false;
		this.isPermisoEliminarTipoRamoActivoFijo=false;
		this.isPermisoGuardarCambiosTipoRamoActivoFijo=false;
		this.isPermisoConsultaTipoRamoActivoFijo=false;
		this.isPermisoBusquedaTipoRamoActivoFijo=false;
		this.isPermisoReporteTipoRamoActivoFijo=false;		
		this.isPermisoOrdenTipoRamoActivoFijo=false;		
		this.isPermisoPaginacionMedioTipoRamoActivoFijo=false;		
		this.isPermisoPaginacionAltoTipoRamoActivoFijo=false;
		this.isPermisoPaginacionTodoTipoRamoActivoFijo=false;
		this.isPermisoCopiarTipoRamoActivoFijo=false;		
		this.isPermisoVerFormTipoRamoActivoFijo=false;		
		this.isPermisoDuplicarTipoRamoActivoFijo=false;		
		this.isPermisoOrdenTipoRamoActivoFijo=false;		
	}
	
	public void setPermisosUsuarioTipoRamoActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoTipoRamoActivoFijo=isPermiso;
		this.isPermisoNuevoTipoRamoActivoFijo=isPermiso;
		this.isPermisoActualizarTipoRamoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalTipoRamoActivoFijo=isPermiso;
		this.isPermisoEliminarTipoRamoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosTipoRamoActivoFijo=isPermiso;
		this.isPermisoConsultaTipoRamoActivoFijo=isPermiso;
		this.isPermisoBusquedaTipoRamoActivoFijo=isPermiso;
		this.isPermisoReporteTipoRamoActivoFijo=isPermiso;
		this.isPermisoOrdenTipoRamoActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioTipoRamoActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoTipoRamoActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoTipoRamoActivoFijo=isPermiso;		
		this.isPermisoCopiarTipoRamoActivoFijo=isPermiso;		
		this.isPermisoVerFormTipoRamoActivoFijo=isPermiso;		
		this.isPermisoDuplicarTipoRamoActivoFijo=isPermiso;
		this.isPermisoOrdenTipoRamoActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRamoActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoTipoRamoActivoFijo=isPermiso;
		this.isPermisoNuevoTipoRamoActivoFijo=isPermiso;
		this.isPermisoActualizarTipoRamoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalTipoRamoActivoFijo=isPermiso;
		this.isPermisoEliminarTipoRamoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosTipoRamoActivoFijo=isPermiso;
		//this.isPermisoConsultaTipoRamoActivoFijo=isPermiso;
		//this.isPermisoBusquedaTipoRamoActivoFijo=isPermiso;
		//this.isPermisoReporteTipoRamoActivoFijo=isPermiso;
		//this.isPermisoOrdenTipoRamoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRamoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRamoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRamoActivoFijo=isPermiso;		
		//this.isPermisoCopiarTipoRamoActivoFijo=isPermiso;		
		//this.isPermisoDuplicarTipoRamoActivoFijo=isPermiso;
		//this.isPermisoOrdenTipoRamoActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoRamoActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoRamoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleActivoFijo=false;
		this.isTienePermisosDetalleActivoFijo=this.verificarGetPermisosUsuarioOpcionTipoRamoActivoFijoClaseRelacionada(this.opcionsRelacionadas,DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRamoActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoRamoActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleActivoFijo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoRamoActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoRamoActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoRamoActivoFijoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleActivoFijo && this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null && this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTabbedPaneRelacionesTipoRamoActivoFijo.remove(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoRamoActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoRamoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoRamoActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRamoActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRamoActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRamoActivoFijo=this.isPermisoActualizarTipoRamoActivoFijo;
			this.isPermisoEliminarTipoRamoActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRamoActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRamoActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRamoActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRamoActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRamoActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRamoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRamoActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRamoActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRamoActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRamoActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRamoActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRamoActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRamoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRamoActivoFijo.setToolTipText(this.jTableDatosTipoRamoActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRamoActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRamoActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoRamoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoRamoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRamoActivoFijo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleActivoFijo && this.tiporamoactivofijoConstantesFunciones.mostrarDetalleActivoFijoTipoRamoActivoFijo && !TipoRamoActivoFijoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Activo Fijo");
			reporte.setsDescripcion("Detalle Activo Fijo");
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
	public void inicializarCombosForeignKeyTipoRamoActivoFijoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoRamoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoRamoActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoRamoActivoFijoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTipoRamoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoRamoActivoFijoParameterReturnGeneral tiporamoactivofijoReturnGeneral=new TipoRamoActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiporamoactivofijoConstantesFunciones.cargarid_empresaTipoRamoActivoFijo)
					 || (this.esRecargarFks && this.tiporamoactivofijoConstantesFunciones.cargarid_empresaTipoRamoActivoFijo)) {

					if(!this.tiporamoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiporamoactivofijoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiporamoactivofijoReturnGeneral=tiporamoactivofijoLogic.cargarCombosLoteForeignKeyTipoRamoActivoFijo(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiporamoactivofijoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRamoActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tiporamoactivofijoSessionBean==null) {
				this.tiporamoactivofijoSessionBean=new TipoRamoActivoFijoSessionBean();
			}

			if(!this.tiporamoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoRamoActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRamoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRamoActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRamoActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRamoActivoFijo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRamoActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRamoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRamoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRamoActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRamoActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRamoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRamoActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo!=null && this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoRamoActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoRamoActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoRamoActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporamoactivofijoSessionBean=new TipoRamoActivoFijoSessionBean(); 
		this.tiporamoactivofijoConstantesFunciones=new TipoRamoActivoFijoConstantesFunciones(); 
		this.tiporamoactivofijoBean=new TipoRamoActivoFijo();//(this.tiporamoactivofijoConstantesFunciones); 		
		this.tiporamoactivofijoReturnGeneral=new TipoRamoActivoFijoParameterReturnGeneral(); 
		
		this.tiporamoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporamoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoRamoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoRamoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoRamoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRamoActivoFijo(true);
			
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
			
			this.tiporamoactivofijoConstantesFunciones=new TipoRamoActivoFijoConstantesFunciones(); 
			this.tiporamoactivofijoBean=new TipoRamoActivoFijo();//this.tiporamoactivofijoConstantesFunciones); 			
			this.tiporamoactivofijoReturnGeneral=new TipoRamoActivoFijoParameterReturnGeneral(); 
		
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Ramo Activo Fijo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiporamoactivofijo=new TipoRamoActivoFijo();
			this.tiporamoactivofijos = new ArrayList<TipoRamoActivoFijo>();
			this.tiporamoactivofijosAux = new ArrayList<TipoRamoActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic=new TipoRamoActivoFijoLogic();
				this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporamoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporamoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRamoActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRamoActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionTipoRamoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRamoActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRamoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRamoActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRamoActivoFijo);
				this.jInternalFrameDetalleFormTipoRamoActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormTipoRamoActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo);
					this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRamoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRamoActivoFijo);
					this.jInternalFrameImportacionTipoRamoActivoFijo.setVisible(false);
					this.jInternalFrameImportacionTipoRamoActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRamoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRamoActivoFijo);
					this.jInternalFrameOrderByTipoRamoActivoFijo.setVisible(false);
					this.jInternalFrameOrderByTipoRamoActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoRamoActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoRamoActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporamoactivofijoReturnGeneral=new TipoRamoActivoFijoParameterReturnGeneral();
			
			this.tiporamoactivofijoParameterGeneral=new TipoRamoActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporamoactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoRamoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRamoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado(),this.tiporamoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRamoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado(),this.tiporamoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaCopiarTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaVerFormTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaOrdenTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRamoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRamoActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRamoActivoFijo(false);
			
			this.setPermisosUsuarioTipoRamoActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado() && this.tiporamoactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoRamoActivoFijoClasesRelacionadas();
			}
			
			if(this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoRamoActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRamoActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRamoActivoFijo();
			}
			
			if(!this.isPermisoBusquedaTipoRamoActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoRamoActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRamoActivoFijo,this.isPermisoPaginacionMedioTipoRamoActivoFijo,this.isPermisoPaginacionTodoTipoRamoActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoRamoActivoFijoConstantesFunciones.getTiposSeleccionarTipoRamoActivoFijo());
				
				this.tiposColumnasSelect=TipoRamoActivoFijoConstantesFunciones.getTiposSeleccionarTipoRamoActivoFijo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoRamoActivoFijo();				
				//this.tiposRelacionesSelect=TipoRamoActivoFijoConstantesFunciones.getTiposRelacionesTipoRamoActivoFijo(true);
				
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
			//if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRamoActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoRamoActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoRamoActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRamoActivoFijo() ;
			
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
			
			
			this.detalleactivofijoLogic=new DetalleActivoFijoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tiporamoactivofijoImplementable= (TipoRamoActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRamoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporamoactivofijoImplementableHome= (TipoRamoActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRamoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporamoactivofijos= new ArrayList<TipoRamoActivoFijo>();
			this.tiporamoactivofijosEliminados= new ArrayList<TipoRamoActivoFijo>();
						
			this.isEsNuevoTipoRamoActivoFijo=false;
			this.esParaAccionDesdeFormularioTipoRamoActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoRamoActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRamoActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoRamoActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRamoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRamoActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRamoActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRamoActivoFijo();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoRamoActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoRamoActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoRamoActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRamoActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRamoActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRamoActivoFijo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRamoActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTabbedPaneRelacionesTipoRamoActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTabbedPaneRelacionesTipoRamoActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Activo Fijos")) {
					if(!DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoRamoActivoFijo();

						this.cargarParteTabPanelRelacionadaDetalleActivoFijo(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRamoActivoFijo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleActivoFijo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(false,true,iIndex);
		this.jButtonDetalleActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleActivoFijo();

		//this.jTabbedPaneRelacionesTipoRamoActivoFijo.updateUI();
		//this.jTabbedPaneRelacionesTipoRamoActivoFijo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoRamoActivoFijo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleActivoFijo")) {
				int row=this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
				jButtonDetalleActivoFijoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Activo Fijo")) {

					if(this.isTienePermisosDetalleActivoFijo && this.tiporamoactivofijoConstantesFunciones.mostrarDetalleActivoFijoTipoRamoActivoFijo && !TipoRamoActivoFijoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Activo Fijos"+"("+DetalleActivoFijoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Activo Fijos");

						if(tiporamoactivofijoConstantesFunciones.resaltarDetalleActivoFijoTipoRamoActivoFijo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiporamoactivofijoConstantesFunciones.resaltarDetalleActivoFijoTipoRamoActivoFijo);
						}

						jmenuItem.setEnabled(this.tiporamoactivofijoConstantesFunciones.activarDetalleActivoFijoTipoRamoActivoFijo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleActivoFijo"));

						

						this.jInternalFrameDetalleFormTipoRamoActivoFijo.jmenuDetalleTipoRamoActivoFijo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoRamoActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRamoActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRamoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoRamoActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRamoActivoFijo();
		
		this.cargarCombosFrameForeignKeyTipoRamoActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRamoActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRamoActivoFijo();
		}
	}
	
	
	
	public void jButtonNuevoTipoRamoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			
			
			if(jTableDatosTipoRamoActivoFijo.getRowCount()>=1) {
				jTableDatosTipoRamoActivoFijo.removeRowSelectionInterval(0, jTableDatosTipoRamoActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRamoActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRamoActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRamoActivoFijo(true);			
			//this.tiporamoactivofijo=new TipoRamoActivoFijo();
			//this.tiporamoactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRamoActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRamoActivoFijo() ;
			
			if(TipoRamoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRamoActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporamoactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);				
			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			
			if(this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRamoActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoRamoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRamoActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRamoActivoFijo.getSelectedRows().length;			
			}
			
			tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRamoActivoFijo--;			
				//TipoRamoActivoFijo tiporamoactivofijoAux= new TipoRamoActivoFijo();			
				//tiporamoactivofijoAux.setId(this.iIdNuevoTipoRamoActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRamoActivoFijo tiporamoactivofijoOrigen=new TipoRamoActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRamoActivoFijo tiporamoactivofijoOrigen : tiporamoactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporamoactivofijoOrigen =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporamoactivofijoOrigen =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRamoActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporamoactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRamoActivoFijo(tiporamoactivofijoOrigen,this.tiporamoactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().add(this.tiporamoactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporamoactivofijos.add(this.tiporamoactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
				
				this.jTableDatosTipoRamoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoRamoActivoFijo(), this.getIndiceNuevoTipoRamoActivoFijo());
				
				int iLastRow =  this.jTableDatosTipoRamoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRamoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRamoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();									
		
			TipoRamoActivoFijo tiporamoactivofijoOrigen=new TipoRamoActivoFijo();
			TipoRamoActivoFijo tiporamoactivofijoDestino=new TipoRamoActivoFijo();
				
			tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRamoActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporamoactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRamoActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporamoactivofijoOrigen =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporamoactivofijoOrigen =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporamoactivofijoDestino =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporamoactivofijoDestino =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporamoactivofijoOrigen =tiporamoactivofijosSeleccionados.get(0);
				tiporamoactivofijoDestino =tiporamoactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRamoActivoFijo(tiporamoactivofijoOrigen,tiporamoactivofijoDestino,true,false);
				
				tiporamoactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporamoactivofijoDestino,tiporamoactivofijoLogic.getTipoRamoActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporamoactivofijoDestino,tiporamoactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
				
				//this.jTableDatosTipoRamoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoRamoActivoFijo(), this.getIndiceNuevoTipoRamoActivoFijo());
				
				int iLastRow =  this.jTableDatosTipoRamoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRamoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRamoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRamoActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoRamoActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoRamoActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionTipoRamoActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesTipoRamoActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRamoActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRamoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRamoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRamoActivoFijo();
			
			this.abrirFrameOrderByTipoRamoActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRamoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRamoActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRamoActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRamoActivoFijo.setSize(this.jInternalFrameDetalleFormTipoRamoActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormTipoRamoActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRamoActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRamoActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRamoActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRamoActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.jContentPaneDetalleTipoRamoActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTabbedPaneRelacionesTipoRamoActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRamoActivoFijo.jContentPaneDetalleTipoRamoActivoFijo.getWidth(),TipoRamoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTabbedPaneRelacionesTipoRamoActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRamoActivoFijo.jContentPaneDetalleTipoRamoActivoFijo.getWidth(),TipoRamoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTabbedPaneRelacionesTipoRamoActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRamoActivoFijo.jContentPaneDetalleTipoRamoActivoFijo.getWidth(),TipoRamoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleActivoFijo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRamoActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRamoActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRamoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRamoActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRamoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRamoActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderByTipoRamoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRamoActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRamoActivoFijo);
				this.jInternalFrameOrderByTipoRamoActivoFijo.setVisible(false);
				this.jInternalFrameOrderByTipoRamoActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderByTipoRamoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRamoActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRamoActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRamoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRamoActivoFijo==null) {
				
				this.jInternalFrameImportacionTipoRamoActivoFijo=new ImportacionJInternalFrame(TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRamoActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRamoActivoFijo);
				this.jInternalFrameImportacionTipoRamoActivoFijo.setVisible(false);
				this.jInternalFrameImportacionTipoRamoActivoFijo.setSelected(false);


				this.jInternalFrameImportacionTipoRamoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRamoActivoFijo"));
				this.jInternalFrameImportacionTipoRamoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRamoActivoFijo"));
				this.jInternalFrameImportacionTipoRamoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRamoActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRamoActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo==null) {
				this.jInternalFrameReporteDinamicoTipoRamoActivoFijo=new ReporteDinamicoJInternalFrame(TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRamoActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo);
				this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRamoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRamoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRamoActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRamoActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleActivoFijo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoRamoActivoFijo.jContentPaneDetalleTipoRamoActivoFijo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoRamoActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRamoActivoFijo);
			
	       	this.jInternalFrameDetalleFormTipoRamoActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRamoActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRamoActivoFijo.dispose();
			//this.jInternalFrameDetalleFormTipoRamoActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRamoActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRamoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRamoActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionTipoRamoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRamoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRamoActivoFijo.setVisible(true);
	        this.jInternalFrameOrderByTipoRamoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRamoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRamoActivoFijo.setVisible(false);
	        this.jInternalFrameOrderByTipoRamoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRamoActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRamoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRamoActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionTipoRamoActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRamoActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRamoActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRamoActivoFijo(true);
			//this.isEsNuevoTipoRamoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRamoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRamoActivoFijo(false) ;
			
			if(tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado() && DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoRamoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRamoActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRamoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoRamoActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRamoActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRamoActivoFijo(true);
			//this.isEsNuevoTipoRamoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporamoactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRamoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRamoActivoFijo(false) ;
			
			if(TipoRamoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRamoActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRamoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRamoActivoFijo(false);
			
			//if(!this.isEsNuevoTipoRamoActivoFijo) {								
				int intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.tiporamoactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.tiporamoactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRamoActivoFijo=true;
					this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
					this.isEsNuevoTipoRamoActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRamoActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRamoActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRamoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRamoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesTipoRamoActivoFijo(false);
			
												
				
				if(TipoRamoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRamoActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,tiporamoactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRamoActivoFijo(this.tiporamoactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRamoActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporamoactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporamoactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRamoActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRamoActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.tiporamoactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.tiporamoactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporamoactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoRamoActivoFijoModel) this.jTableDatosTipoRamoActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRamoActivoFijo=true;
				this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
				this.isEsNuevoTipoRamoActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRamoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRamoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesTipoRamoActivoFijo(false);
				
				
				
				if(TipoRamoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRamoActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRamoActivoFijo.getRowCount()>=1) {
				jTableDatosTipoRamoActivoFijo.removeRowSelectionInterval(0, jTableDatosTipoRamoActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRamoActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRamoActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRamoActivoFijo(false) ;
			
			this.isEsNuevoTipoRamoActivoFijo=false;
			
			if(TipoRamoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRamoActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRamoActivoFijo(false);
				
				//SI ES MANUAL
				if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRamoActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRamoActivoFijo--;			
			//TipoRamoActivoFijo tiporamoactivofijoAux= new TipoRamoActivoFijo();			
			//tiporamoactivofijoAux.setId(this.iIdNuevoTipoRamoActivoFijo);
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRamoActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);
			
			this.tiporamoactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().add(this.tiporamoactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporamoactivofijos.add(this.tiporamoactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
			
			this.jTableDatosTipoRamoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoRamoActivoFijo(), this.getIndiceNuevoTipoRamoActivoFijo());
			
			int iLastRow =  this.jTableDatosTipoRamoActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRamoActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRamoActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRamoActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRamoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRamoActivoFijo();
			}
			
			//this.abrirFrameTreeTipoRamoActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Ramo Activo FijoS ?", "MANTENIMIENTO DE Tipo Ramo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRamoActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRamoActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporamoactivofijoReturnGeneral=tiporamoactivofijoLogic.procesarImportacionTipoRamoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporamoactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoRamoActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRamoActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRamoActivoFijo.setFileImportacion(this.jInternalFrameImportacionTipoRamoActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRamoActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRamoActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRamoActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRamoActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();		

		tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoRamoActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoRamoActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRamoActivoFijos("Todos",tiporamoactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ramo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();		
		
		tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporamoactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRamoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoRamoActivoFijo tiporamoactivofijo:tiporamoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporamoactivofijo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRamoActivoFijo tiporamoactivofijo:tiporamoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporamoactivofijo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoRamoActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRamoActivoFijo(tiporamoactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ramo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRamoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRamoActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRamoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRamoActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRamoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRamoActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRamoActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRamoActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRamoActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRamoActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRamoActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRamoActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRamoActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRamoActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRamoActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRamoActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRamoActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRamoActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRamoActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRamoActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRamoActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRamoActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRamoActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRamoActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualTipoRamoActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRamoActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRamoActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRamoActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRamoActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRamoActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRamoActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jCheckBoxPostAccionNuevoTipoRamoActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jCheckBoxPostAccionSinCerrarTipoRamoActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jCheckBoxPostAccionSinMensajeTipoRamoActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRamoActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRamoActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
				this.jInternalFrameDetalleFormTipoRamoActivoFijo.jCheckBoxPostAccionNuevoTipoRamoActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRamoActivoFijo.jCheckBoxPostAccionSinCerrarTipoRamoActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRamoActivoFijo.jCheckBoxPostAccionSinMensajeTipoRamoActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRamoActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRamoActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRamoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRamoActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRamoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRamoActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRamoActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRamoActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRamoActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRamoActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRamoActivoFijo() throws Exception {
		try	{
			if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRamoActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRamoActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRamoActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRamoActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRamoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRamoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRamoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRamoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRamoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRamoActivoFijo.addItem(reporte);
			}
			
			
			if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRamoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRamoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRamoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRamoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRamoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRamoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRamoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRamoActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRamoActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRamoActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRamoActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRamoActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRamoActivoFijo(Boolean esInicializar) throws Exception {				
		if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRamoActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRamoActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRamoActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRamoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRamoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoRamoActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRamoActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRamoActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRamoActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRamoActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporamoactivofijoLogic.getTipoRamoActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporamoactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRamoActivoFijo.setModel(new TipoRamoActivoFijoModel(this.tiporamoactivofijoLogic.getTipoRamoActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRamoActivoFijo.setModel(new TipoRamoActivoFijoModel(this.tiporamoactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRamoActivoFijo!=null && this.jInternalFrameOrderByTipoRamoActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRamoActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRamoActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRamoActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO,tiporamoactivofijoConstantesFunciones.resaltarSeleccionarTipoRamoActivoFijo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO,tiporamoactivofijoConstantesFunciones.resaltarSeleccionarTipoRamoActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRamoActivoFijo,TipoRamoActivoFijoConstantesFunciones.LABEL_ID));

		if(this.tiporamoactivofijoConstantesFunciones.mostraridTipoRamoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRamoActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporamoactivofijoConstantesFunciones.resaltaridTipoRamoActivoFijo,this.tiporamoactivofijoConstantesFunciones.activaridTipoRamoActivoFijo,this,true,"idTipoRamoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporamoactivofijoConstantesFunciones.resaltaridTipoRamoActivoFijo,this.tiporamoactivofijoConstantesFunciones.activaridTipoRamoActivoFijo,this,true,"idTipoRamoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRamoActivoFijo,TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiporamoactivofijoConstantesFunciones.mostrarid_empresaTipoRamoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiporamoactivofijoConstantesFunciones.resaltarid_empresaTipoRamoActivoFijo,this,this.tiporamoactivofijoConstantesFunciones.activarid_empresaTipoRamoActivoFijo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiporamoactivofijoConstantesFunciones.resaltarid_empresaTipoRamoActivoFijo,this,this.tiporamoactivofijoConstantesFunciones.activarid_empresaTipoRamoActivoFijo,false,"id_empresaTipoRamoActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRamoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRamoActivoFijo,TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporamoactivofijoConstantesFunciones.mostrarnombreTipoRamoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporamoactivofijoConstantesFunciones.resaltarnombreTipoRamoActivoFijo,this.tiporamoactivofijoConstantesFunciones.activarnombreTipoRamoActivoFijo,this,true,"nombreTipoRamoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporamoactivofijoConstantesFunciones.resaltarnombreTipoRamoActivoFijo,this.tiporamoactivofijoConstantesFunciones.activarnombreTipoRamoActivoFijo,this,true,"nombreTipoRamoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRamoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleActivoFijo && this.tiporamoactivofijoConstantesFunciones.mostrarDetalleActivoFijoTipoRamoActivoFijo && !TipoRamoActivoFijoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Activo Fijos");
				tableColumn.setHeaderValue("Detalle Activo Fijos");
				tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(tiporamoactivofijoConstantesFunciones.resaltarDetalleActivoFijoTipoRamoActivoFijo,this,this.tiporamoactivofijoConstantesFunciones.activarDetalleActivoFijoTipoRamoActivoFijo));
				tableColumn.setCellEditor(new DetalleActivoFijoTableCell(tiporamoactivofijoConstantesFunciones.resaltarDetalleActivoFijoTipoRamoActivoFijo,this,this.tiporamoactivofijoConstantesFunciones.activarDetalleActivoFijoTipoRamoActivoFijo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoRamoActivoFijo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRamoActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRamoActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRamoActivoFijo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoRamoActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRamoActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRamoActivoFijo.moveColumn(this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRamoActivoFijo.moveColumn(this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoRamoActivoFijo.moveColumn(this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRamoActivoFijo.moveColumn(this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRamoActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRamoActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRamoActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRamoActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRamoActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRamoActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporamoactivofijoLogic.getTipoRamoActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporamoactivofijos.size()-1;
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
		//this.jTableDatosTipoRamoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRamoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRamoActivoFijo();
			
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
				
				//this.isEsNuevoTipoRamoActivoFijo=false;
					
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			
				if(this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRamoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRamoActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporamoactivofijo.getsType().equals("DUPLICADO")
				   || this.tiporamoactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRamoActivoFijo=true;
				
				} else {
					this.isEsNuevoTipoRamoActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporamoactivofijo.getId()>=0 && !this.tiporamoactivofijo.getIsNew()) {						
						this.isEsNuevoTipoRamoActivoFijo=false;
						
					} else {
						this.isEsNuevoTipoRamoActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRamoActivoFijo(esRelaciones);						
				
				this.seleccionarTipoRamoActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporamoactivofijo.getId()<0) {
					this.isEsNuevoTipoRamoActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRamoActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRamoActivoFijo(evt,rowIndex);
				}	
				
				if(this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRamoActivoFijo: " + this.dDif); 
					}
				}								
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRamoActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporamoactivofijo)) {
					if(this.tiporamoactivofijo.getId()>0) {
						this.tiporamoactivofijo.setIsDeleted(true);
						
						this.tiporamoactivofijosEliminados.add(this.tiporamoactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().remove(this.tiporamoactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporamoactivofijos.remove(this.tiporamoactivofijo);				
					}
					
					
					((TipoRamoActivoFijoModel) this.jTableDatosTipoRamoActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRamoActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRamoActivoFijo) {
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRamoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRamoActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRamoActivoFijo(this.tiporamoactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiporamoactivofijoConstantesFunciones.cargarid_empresaTipoRamoActivoFijo || this.tiporamoactivofijoConstantesFunciones.event_dependid_empresaTipoRamoActivoFijo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiporamoactivofijo.getid_empresa());
									//this.inicializarActualizarBindingTipoRamoActivoFijo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiporamoactivofijo.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiporamoactivofijo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiporamoactivofijo.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRamoActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRamoActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRamoActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRamoActivoFijo(tiporamoactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRamoActivoFijo(tiporamoactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRamoActivoFijo(tiporamoactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRamoActivoFijo(tiporamoactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelidTipoRamoActivoFijo.setText(tiporamoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTextAreanombreTipoRamoActivoFijo.setText(tiporamoactivofijo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRamoActivoFijo tiporamoactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporamoactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRamoActivoFijo tiporamoactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporamoactivofijoLocal=this.tiporamoactivofijo;
			} else {
				tiporamoactivofijoLocal=this.tiporamoactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporamoactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRamoActivoFijo(tiporamoactivofijoLocal,true);
					
					if(tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporamoactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporamoactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(tiporamoactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(tiporamoactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(tiporamoactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelidTipoRamoActivoFijo.getText()==null || this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelidTipoRamoActivoFijo.getText()=="" || this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelidTipoRamoActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelidTipoRamoActivoFijo.setText("0");
			}

			if(conColumnasBase) {tiporamoactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelidTipoRamoActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRamoActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelIdTipoRamoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporamoactivofijo.setnombre(this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTextAreanombreTipoRamoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelnombreTipoRamoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijoBean,TipoRamoActivoFijo tiporamoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijoOrigen,TipoRamoActivoFijo tiporamoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporamoactivofijoOrigen.getId()!=null && !tiporamoactivofijoOrigen.getId().equals(0L))) {tiporamoactivofijo.setId(tiporamoactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && tiporamoactivofijoOrigen.getnombre()!=null && !tiporamoactivofijoOrigen.getnombre().equals(""))) {tiporamoactivofijo.setnombre(tiporamoactivofijoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelidTipoRamoActivoFijo.setText(tiporamoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTextAreanombreTipoRamoActivoFijo.setText(tiporamoactivofijo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRamoActivoFijo(TipoRamoActivoFijoBean tiporamoactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelidTipoRamoActivoFijo.setText(tiporamoactivofijoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTextAreanombreTipoRamoActivoFijo.setText(tiporamoactivofijoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRamoActivoFijo(TipoRamoActivoFijoParameterReturnGeneral tiporamoactivofijoReturnGeneral,TipoRamoActivoFijoBean tiporamoactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			TipoRamoActivoFijo tiporamoactivofijoLocal=new TipoRamoActivoFijo();
			
			tiporamoactivofijoLocal=tiporamoactivofijoReturnGeneral.getTipoRamoActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporamoactivofijoLocal.getId()!=null && !tiporamoactivofijoLocal.getId().equals(0L))) {tiporamoactivofijoBean.setId(tiporamoactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && tiporamoactivofijoLocal.getnombre()!=null && !tiporamoactivofijoLocal.getnombre().equals(""))) {tiporamoactivofijoBean.setnombre(tiporamoactivofijoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoRamoActivoFijoGenerico(Long idTipoRamoActivoFijoSeleccionado,JComboBox jComboBoxTipoRamoActivoFijo,List<TipoRamoActivoFijo> tiporamoactivofijosLocal)throws Exception {
		try {
			TipoRamoActivoFijo  tiporamoactivofijoTemp=null;

			for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijosLocal) {
				if(tiporamoactivofijoAux.getId()!=null && tiporamoactivofijoAux.getId().equals(idTipoRamoActivoFijoSeleccionado)) {
					tiporamoactivofijoTemp=tiporamoactivofijoAux;
					break;
				}
			}

			jComboBoxTipoRamoActivoFijo.setSelectedItem(tiporamoactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoRamoActivoFijoGenerico(JComboBox jComboBoxTipoRamoActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRamoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRamoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRamoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRamoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRamoActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRamoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRamoActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRamoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRamoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRamoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleActivoFijo")) {
			jButtonDetalleActivoFijoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporamoactivofijo=(TipoRamoActivoFijo) tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporamoactivofijo =(TipoRamoActivoFijo) tiporamoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiporamoactivofijo.getIsNew() && !tiporamoactivofijo.getIsChanged() && !tiporamoactivofijo.getIsDeleted()) {
				sDescripcion=tiporamoactivofijo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiporamoactivofijo.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRamoActivoFijo tiporamoactivofijoRow=new TipoRamoActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporamoactivofijoRow=(TipoRamoActivoFijo) tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporamoactivofijoRow=(TipoRamoActivoFijo) tiporamoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleActivoFijoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoRamoActivoFijo tiporamoactivofijo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporamoactivofijo = (TipoRamoActivoFijo)this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiporamoactivofijo = (TipoRamoActivoFijo)this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiporamoactivofijo!=null) {
						this.tiporamoactivofijo = tiporamoactivofijo;
					} else {
						this.tiporamoactivofijo = new TipoRamoActivoFijo();
					}
				}

				if(this.isTienePermisosDetalleActivoFijo && this.permiteMantenimiento(this.tiporamoactivofijo)) {
					DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup=new DetalleActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup;
					} else {
						detalleactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame;
					}

					List<TipoRamoActivoFijo> tiporamoactivofijos=new ArrayList<TipoRamoActivoFijo>();
					tiporamoactivofijos.add(this.tiporamoactivofijo);
					if(!esRelacionado) {
						//detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setConGuardarRelaciones(false);
						//detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.cargarDetalleActivoFijoBeanSwingJInternalFrame(tiporamoactivofijos,this.tiporamoactivofijo,detalleactivofijoBeanSwingJInternalFrame,/*conInicializar,*/detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getConGuardarRelaciones(),detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado());
					detalleactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("no_relacionado");

						detalleactivofijoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA + (DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleactivofijoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoRamoActivoFijo=(TitledBorder)this.jScrollPanelDatosTipoRamoActivoFijo.getBorder();
						TitledBorder titledBorderDetalleActivoFijo=(TitledBorder)detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

						titledBorderDetalleActivoFijo.setTitle(titledBorderTipoRamoActivoFijo.getTitle() + " -> Detalle Activo Fijo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleactivofijoBeanSwingJInternalFrame);
						}

						detalleactivofijoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleactivofijoBeanSwingJInternalFrame);

						detalleactivofijoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Activo Fijo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRamoActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoRamoActivoFijo && this.isPermisoNuevoTipoRamoActivoFijo));			
			this.jButtonDuplicarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarTipoRamoActivoFijo && this.isPermisoDuplicarTipoRamoActivoFijo));			
			this.jButtonCopiarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarTipoRamoActivoFijo && this.isPermisoCopiarTipoRamoActivoFijo));
			this.jButtonVerFormTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormTipoRamoActivoFijo && this.isPermisoVerFormTipoRamoActivoFijo));
			
			this.jButtonAbrirOrderByTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoRamoActivoFijo && this.isPermisoOrdenTipoRamoActivoFijo));			
			
			this.jButtonNuevoRelacionesTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo && this.isPermisoNuevoTipoRamoActivoFijo));			
			this.jButtonNuevoGuardarCambiosTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoRamoActivoFijo && this.isPermisoNuevoTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo));
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonModificarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaModificarTipoRamoActivoFijo && this.isPermisoActualizarTipoRamoActivoFijo));	
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonActualizarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarTipoRamoActivoFijo && this.isPermisoActualizarTipoRamoActivoFijo));	
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonEliminarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarTipoRamoActivoFijo && this.isPermisoEliminarTipoRamoActivoFijo));
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonCancelarTipoRamoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoRamoActivoFijo);							
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonGuardarCambiosTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoRamoActivoFijo && this.isPermisoNuevoTipoRamoActivoFijo));						
			this.jButtonDuplicarToolBarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarTipoRamoActivoFijo && this.isPermisoDuplicarTipoRamoActivoFijo));						
			this.jButtonCopiarToolBarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarTipoRamoActivoFijo && this.isPermisoCopiarTipoRamoActivoFijo));			
			this.jButtonVerFormToolBarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormTipoRamoActivoFijo && this.isPermisoVerFormTipoRamoActivoFijo));			
			this.jButtonAbrirOrderByToolBarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoRamoActivoFijo && this.isPermisoOrdenTipoRamoActivoFijo));
			this.jButtonNuevoRelacionesToolBarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo && this.isPermisoNuevoTipoRamoActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoRamoActivoFijo && this.isPermisoNuevoTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo));			
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonModificarToolBarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaModificarTipoRamoActivoFijo && this.isPermisoActualizarTipoRamoActivoFijo));	
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonActualizarToolBarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarTipoRamoActivoFijo  && this.isPermisoActualizarTipoRamoActivoFijo));	
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonEliminarToolBarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarTipoRamoActivoFijo && this.isPermisoEliminarTipoRamoActivoFijo));
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonCancelarToolBarTipoRamoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoRamoActivoFijo);				
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonGuardarCambiosToolBarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoRamoActivoFijo && this.isPermisoNuevoTipoRamoActivoFijo));			
			this.jMenuItemDuplicarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarTipoRamoActivoFijo && this.isPermisoDuplicarTipoRamoActivoFijo));			
			this.jMenuItemCopiarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarTipoRamoActivoFijo && this.isPermisoCopiarTipoRamoActivoFijo));			
			this.jMenuItemVerFormTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormTipoRamoActivoFijo && this.isPermisoVerFormTipoRamoActivoFijo));			
			this.jMenuItemAbrirOrderByTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoRamoActivoFijo && this.isPermisoOrdenTipoRamoActivoFijo));			
			//this.jMenuItemMostrarOcultarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoRamoActivoFijo && this.isPermisoOrdenTipoRamoActivoFijo));
			this.jMenuItemDetalleAbrirOrderByTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoRamoActivoFijo && this.isPermisoOrdenTipoRamoActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoRamoActivoFijo && this.isPermisoOrdenTipoRamoActivoFijo));			
			this.jMenuItemNuevoRelacionesTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo && this.isPermisoNuevoTipoRamoActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoRamoActivoFijo && this.isPermisoNuevoTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo));									
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemModificarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaModificarTipoRamoActivoFijo && this.isPermisoActualizarTipoRamoActivoFijo));	
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemActualizarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarTipoRamoActivoFijo && this.isPermisoActualizarTipoRamoActivoFijo));	
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemEliminarTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarTipoRamoActivoFijo && this.isPermisoEliminarTipoRamoActivoFijo));
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemCancelarTipoRamoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoRamoActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo));						
			this.jMenuItemGuardarCambiosTablaTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=this.jButtonNuevoTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRamoActivoFijo=this.jButtonDuplicarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarTipoRamoActivoFijo=this.jButtonCopiarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormTipoRamoActivoFijo=this.jButtonVerFormTipoRamoActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRamoActivoFijo=this.jButtonAbrirOrderByTipoRamoActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=this.jButtonNuevoRelacionesTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarTipoRamoActivoFijo=this.jButtonModificarTipoRamoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonActualizarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonEliminarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonCancelarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonGuardarCambiosTipoRamoActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=this.jButtonNuevoToolBarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=this.jButtonNuevoRelacionesToolBarTipoRamoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonModificarToolBarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonActualizarToolBarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonEliminarToolBarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonCancelarToolBarTipoRamoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=this.jButtonGuardarCambiosToolBarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=this.jButtonGuardarCambiosTablaToolBarTipoRamoActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=this.jMenuItemNuevoTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=this.jMenuItemNuevoRelacionesTipoRamoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemModificarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemActualizarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemEliminarTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarTipoRamoActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemCancelarTipoRamoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=this.jMenuItemGuardarCambiosTipoRamoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=this.jMenuItemGuardarCambiosTablaTipoRamoActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRamoActivoFijo(Boolean esInicializar) {
		if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRamoActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRamoActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRamoActivoFijo() {
		this.jButtonNuevoTipoRamoActivoFijo.setVisible(this.isPermisoNuevoTipoRamoActivoFijo);			
		this.jButtonDuplicarTipoRamoActivoFijo.setVisible(this.isPermisoDuplicarTipoRamoActivoFijo);			
		this.jButtonCopiarTipoRamoActivoFijo.setVisible(this.isPermisoCopiarTipoRamoActivoFijo);			
		this.jButtonVerFormTipoRamoActivoFijo.setVisible(this.isPermisoVerFormTipoRamoActivoFijo);			
		
		this.jButtonAbrirOrderByTipoRamoActivoFijo.setVisible(this.isPermisoOrdenTipoRamoActivoFijo);					
		
		this.jButtonNuevoRelacionesTipoRamoActivoFijo.setVisible(this.isPermisoNuevoTipoRamoActivoFijo);			
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonModificarTipoRamoActivoFijo.setVisible(this.isPermisoActualizarTipoRamoActivoFijo);	
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonActualizarTipoRamoActivoFijo.setVisible(this.isPermisoActualizarTipoRamoActivoFijo);	
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonEliminarTipoRamoActivoFijo.setVisible(this.isPermisoEliminarTipoRamoActivoFijo);
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonCancelarTipoRamoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoRamoActivoFijo);						
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonGuardarCambiosTipoRamoActivoFijo.setVisible(this.isPermisoGuardarCambiosTipoRamoActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.setVisible(this.isPermisoActualizarTipoRamoActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRamoActivoFijo() {
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonModificarTipoRamoActivoFijo.setVisible(this.isPermisoActualizarTipoRamoActivoFijo);	
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonActualizarTipoRamoActivoFijo.setVisible(this.isPermisoActualizarTipoRamoActivoFijo);	
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonEliminarTipoRamoActivoFijo.setVisible(this.isPermisoEliminarTipoRamoActivoFijo);
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonCancelarTipoRamoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoRamoActivoFijo);							
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonGuardarCambiosTipoRamoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoRamoActivoFijo && this.isPermisoGuardarCambiosTipoRamoActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRamoActivoFijo() {
		if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRamoActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRamoActivoFijo() {
	}
	
	public void jTableDatosTipoRamoActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRamoActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoRamoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.gettiporamoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporamoactivofijo==null) {
						this.tiporamoactivofijo = new TipoRamoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.tiporamoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);
				}

				if(this.tiporamoactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporamoactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRamoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoRamoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoRamoActivoFijo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRamoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRamoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.gettiporamoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiporamoactivofijoLogic.getConnexion());

				if(this.tiporamoactivofijo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiporamoactivofijo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRamoActivoFijo=(TitledBorder)this.jScrollPanelDatosTipoRamoActivoFijo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoRamoActivoFijo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoRamoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.gettiporamoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporamoactivofijo==null) {
						this.tiporamoactivofijo = new TipoRamoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.tiporamoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);
				}

				if(this.tiporamoactivofijo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiporamoactivofijo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRamoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoRamoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.gettiporamoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporamoactivofijo==null) {
						this.tiporamoactivofijo = new TipoRamoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.tiporamoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);
				}

				if(this.tiporamoactivofijo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporamoactivofijo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRamoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoRamoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRamoActivoFijo(false,false);

			this.getTipoRamoActivoFijosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoRamoActivoFijo(false);

			//if(TipoRamoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRamoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporamoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoRamoActivoFijo() {
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
		

		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.dispose();
			this.jInternalFrameDetalleFormTipoRamoActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoTipoRamoActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionTipoRamoActivoFijo!=null) {
			this.jInternalFrameImportacionTipoRamoActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRamoActivoFijo.dispose();
			this.jInternalFrameImportacionTipoRamoActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRamoActivoFijo();
			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRamoActivoFijo")) {
				jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRamoActivoFijo")) {
				jButtonDuplicarTipoRamoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRamoActivoFijo")) {
				jButtonCopiarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRamoActivoFijo")) {
				jButtonVerFormTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRamoActivoFijo")) {
				jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRamoActivoFijo")) {
				jButtonDuplicarTipoRamoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRamoActivoFijo")) {
				jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRamoActivoFijo")) {
				jButtonDuplicarTipoRamoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRamoActivoFijo")) {
				jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRamoActivoFijo")) {
				jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRamoActivoFijo")) {
				jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRamoActivoFijo")) {
				jButtonModificarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRamoActivoFijo")) {
				jButtonModificarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRamoActivoFijo")) {
				jButtonModificarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRamoActivoFijo")) {
				jButtonActualizarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRamoActivoFijo")) {
				jButtonActualizarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRamoActivoFijo")) {
				jButtonActualizarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRamoActivoFijo")) {
				jButtonEliminarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRamoActivoFijo")) {
				jButtonEliminarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRamoActivoFijo")) {
				jButtonEliminarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRamoActivoFijo")) {
				jButtonCancelarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRamoActivoFijo")) {
				jButtonCancelarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRamoActivoFijo")) {
				jButtonCancelarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRamoActivoFijo")) {
				jButtonCerrarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRamoActivoFijo")) {
				jButtonCerrarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRamoActivoFijo")) {
				jButtonCerrarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRamoActivoFijo")) {
				jButtonMostrarOcultarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRamoActivoFijo")) {
				jButtonCancelarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRamoActivoFijo")) {
				jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRamoActivoFijo")) {
				jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRamoActivoFijo")) {
				jButtonCopiarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRamoActivoFijo")) {
				jButtonVerFormTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRamoActivoFijo")) {
				jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRamoActivoFijo")) {
				jButtonCopiarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRamoActivoFijo")) {
				jButtonVerFormTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRamoActivoFijo")) {
				jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRamoActivoFijo")) {
				jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRamoActivoFijo")) {
				jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRamoActivoFijo")) {
				jButtonRecargarInformacionTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRamoActivoFijo")) {
				jButtonRecargarInformacionTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRamoActivoFijo")) {
				jButtonRecargarInformacionTipoRamoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRamoActivoFijo")) {
				jButtonAnterioresTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRamoActivoFijo")) {
				jButtonAnterioresTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRamoActivoFijo")) {
				jButtonAnterioresTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRamoActivoFijo")) {
				jButtonSiguientesTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRamoActivoFijo")) {
				jButtonSiguientesTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRamoActivoFijo")) {
				jButtonSiguientesTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRamoActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRamoActivoFijo")) {
				jButtonAbrirOrderByTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRamoActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRamoActivoFijo")) {
				jButtonMostrarOcultarTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRamoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRamoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRamoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRamoActivoFijo")) {
				jButtonCerrarReporteDinamicoTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRamoActivoFijo")) {
				jButtonGenerarReporteDinamicoTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRamoActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRamoActivoFijo")) {
				jButtonCerrarImportacionTipoRamoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRamoActivoFijo")) {
				
				jButtonGenerarImportacionTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRamoActivoFijo")) {
				
				jButtonAbrirImportacionTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRamoActivoFijo")) {
				jComboBoxTiposAccionesTipoRamoActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRamoActivoFijo")) {
				jComboBoxTiposRelacionesTipoRamoActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRamoActivoFijo")) {
				jComboBoxTiposAccionesTipoRamoActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRamoActivoFijo")) {
				
				jComboBoxTiposSeleccionarTipoRamoActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRamoActivoFijo")) {
				jTextFieldValorCampoGeneralTipoRamoActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRamoActivoFijo")) {
				jButtonAbrirOrderByTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRamoActivoFijo")) {
				jButtonAbrirOrderByTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRamoActivoFijo")) {
				jButtonCerrarOrderByTipoRamoActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRamoActivoFijoBusqueda")) {
				this.jButtonidTipoRamoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoRamoActivoFijoUpdate")) {
				this.jButtonid_empresaTipoRamoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoRamoActivoFijoBusqueda")) {
				this.jButtonid_empresaTipoRamoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRamoActivoFijoBusqueda")) {
				this.jButtonnombreTipoRamoActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRamoActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRamoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				


				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRamoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRamoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRamoActivoFijo tiporamoactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporamoactivofijoLocal=this.tiporamoactivofijo;
			} else {
				tiporamoactivofijoLocal=this.tiporamoactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
							
				
				


				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRamoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRamoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRamoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			
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
			
			


			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRamoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
								
						
				


				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRamoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRamoActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
								
				
				


				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRamoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRamoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRamoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRamoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRamoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
							
				
				


				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRamoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRamoActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRamoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			
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
			
			


			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRamoActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
								
				
				


				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRamoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRamoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRamoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRamoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRamoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRamoActivoFijo")) {
					jCheckBoxSeleccionarTodosTipoRamoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRamoActivoFijo")) {
					jCheckBoxSeleccionadosTipoRamoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRamoActivoFijo")) {
					
				}
				
				


				
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRamoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRamoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
												
				
				


				
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRamoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRamoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRamoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRamoActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
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
			
			


			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRamoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRamoActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRamoActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporamoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporamoactivofijo);
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
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
				
				


				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRamoActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRamoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRamoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporamoactivofijoAnterior =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRamoActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoRamoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRamoActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporamoactivofijo =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporamoactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRamoActivoFijo")) {
				
				}
				
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRamoActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRamoActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRamoActivoFijo")) {
			
			}
			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRamoActivoFijo();
			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRamoActivoFijo")) {
				jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRamoActivoFijo")) {
				jButtonDuplicarTipoRamoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRamoActivoFijo")) {
				jButtonCopiarTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRamoActivoFijo")) {
				jButtonVerFormTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRamoActivoFijo")) {
				jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRamoActivoFijo")) {
				jButtonModificarTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRamoActivoFijo")) {
				jButtonActualizarTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRamoActivoFijo")) {
				jButtonEliminarTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRamoActivoFijo")) {
				jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRamoActivoFijo")) {
				jButtonCancelarTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRamoActivoFijo")) {
				jButtonCerrarTipoRamoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRamoActivoFijo")) {
				jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRamoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRamoActivoFijo")) {
				jButtonAbrirOrderByTipoRamoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRamoActivoFijo")) {
				jButtonRecargarInformacionTipoRamoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRamoActivoFijo")) {
				jButtonAnterioresTipoRamoActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRamoActivoFijo")) {
				jButtonSiguientesTipoRamoActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRamoActivoFijoBusqueda")) {
				this.jButtonidTipoRamoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoRamoActivoFijoUpdate")) {
				this.jButtonid_empresaTipoRamoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoRamoActivoFijoBusqueda")) {
				this.jButtonid_empresaTipoRamoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRamoActivoFijoBusqueda")) {
				this.jButtonnombreTipoRamoActivoFijoBusquedaActionPerformed(evt);
			}
			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRamoActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRamoActivoFijo")) {
				closingInternalFrameTipoRamoActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarTipoRamoActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRamoActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoRamoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(TipoRamoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRamoActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoRamoActivoFijoActionPerformed(null);
			}
			
			TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporamoactivofijo,new Object(),this.tiporamoactivofijoParameterGeneral,this.tiporamoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRamoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRamoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRamoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporamoactivofijo)) {
			if(!esControlTabla) {
				if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.tiporamoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);			
				}
				
				if(this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRamoActivoFijo(this.tiporamoactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporamoactivofijoReturnGeneral=tiporamoactivofijoLogic.procesarEventosTipoRamoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporamoactivofijoLogic.getTipoRamoActivoFijos(),this.tiporamoactivofijo,this.tiporamoactivofijoParameterGeneral,this.isEsNuevoTipoRamoActivoFijo,classes);//this.tiporamoactivofijoLogic.getTipoRamoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRamoActivoFijo(this.tiporamoactivofijoReturnGeneral,this.tiporamoactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRamoActivoFijo(classes,this.tiporamoactivofijoReturnGeneral,this.tiporamoactivofijoBean,false);
					}
						
					if(this.tiporamoactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRamoActivoFijo(this.tiporamoactivofijoReturnGeneral.getTipoRamoActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRamoActivoFijo(this.tiporamoactivofijoReturnGeneral.getTipoRamoActivoFijo());	
					}
						
					if(this.tiporamoactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRamoActivoFijo(this.tiporamoactivofijoReturnGeneral.getTipoRamoActivoFijo(),classes);//this.tiporamoactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRamoActivoFijo(this.tiporamoactivofijo,classes);//this.tiporamoactivofijoBean);									
				}
			
				if(TipoRamoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRamoActivoFijo(this.tiporamoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRamoActivoFijo(this.tiporamoactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporamoactivofijoAnterior!=null) {
						this.tiporamoactivofijo=this.tiporamoactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporamoactivofijoReturnGeneral=tiporamoactivofijoLogic.procesarEventosTipoRamoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporamoactivofijoLogic.getTipoRamoActivoFijos(),this.tiporamoactivofijo,this.tiporamoactivofijoParameterGeneral,this.isEsNuevoTipoRamoActivoFijo,classes);//this.tiporamoactivofijoLogic.getTipoRamoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporamoactivofijoReturnGeneral.getTipoRamoActivoFijo(),tiporamoactivofijoLogic.getTipoRamoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporamoactivofijoReturnGeneral.getTipoRamoActivoFijo(),this.tiporamoactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRamoActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRamoActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRamoActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRamoActivoFijo() throws Exception {
		
		TipoRamoActivoFijoModel tiporamoactivofijoModel=(TipoRamoActivoFijoModel)this.jTableDatosTipoRamoActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporamoactivofijoModel.tiporamoactivofijos=this.tiporamoactivofijoLogic.getTipoRamoActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporamoactivofijoModel.tiporamoactivofijos=this.tiporamoactivofijos;
		}
		
		
		((TipoRamoActivoFijoModel) this.jTableDatosTipoRamoActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRamoActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporamoactivofijoAnterior(),this.tiporamoactivofijoLogic.getTipoRamoActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporamoactivofijoAnterior(),this.tiporamoactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRamoActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(tiporamoactivofijo.getDetalleActivoFijos());
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
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
										
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporamoactivofijo,new Object(),generalEntityParameterGeneral,this.tiporamoactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoRamoActivoFijoConstantesFunciones.getClassesRelationshipsOfTipoRamoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoRamoActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRamoActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRamoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoRamoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporamoactivofijo,new Object(),generalEntityParameterGeneral,this.tiporamoactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRamoActivoFijo(TipoRamoActivoFijoBean tiporamoactivofijoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(tiporamoactivofijo.getDetalleActivoFijos());
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRamoActivoFijo(ArrayList<Classe> classes,TipoRamoActivoFijoReturnGeneral tiporamoactivofijoReturnGeneral,TipoRamoActivoFijoBean tiporamoactivofijoBean,Boolean conDefault) throws Exception {
		
			this.tiporamoactivofijoBean.setDetalleActivoFijos(tiporamoactivofijoReturnGeneral.getTipoRamoActivoFijo().getDetalleActivoFijos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					tiporamoactivofijo.setDetalleActivoFijos(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tiporamoactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo = new TipoRamoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.tiporamoactivofijoSessionBean.getConGuardarRelaciones(),this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRamoActivoFijo);
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.tiporamoactivofijoLogic=this.tiporamoactivofijoLogic;
		
		this.cargarCombosFrameForeignKeyTipoRamoActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRamoActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRamoActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRamoActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRamoActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRamoActivoFijo"));
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonModificarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarTipoRamoActivoFijo"));

		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonModificarToolBarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRamoActivoFijo"));
					
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemModificarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRamoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonActualizarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarTipoRamoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonActualizarToolBarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRamoActivoFijo"));
						
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemActualizarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRamoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonEliminarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarTipoRamoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonEliminarToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRamoActivoFijo"));
								
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemEliminarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRamoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonCancelarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarTipoRamoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonCancelarToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRamoActivoFijo"));
					
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemCancelarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRamoActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemDetalleCerrarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRamoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonGuardarCambiosToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRamoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonGuardarCambiosToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRamoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRamoActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonidTipoRamoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRamoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonid_empresaTipoRamoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRamoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonid_empresaTipoRamoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRamoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonnombreTipoRamoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRamoActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTabbedPaneRelacionesTipoRamoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRamoActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRamoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRamoActivoFijo"));
		}
		
		this.jTableDatosTipoRamoActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRamoActivoFijo"));
		
		this.jTableDatosTipoRamoActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRamoActivoFijo"));
		
		this.jButtonNuevoTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoTipoRamoActivoFijo"));
		
		this.jButtonDuplicarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarTipoRamoActivoFijo"));
		
		this.jButtonCopiarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarTipoRamoActivoFijo"));
		
		this.jButtonVerFormTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormTipoRamoActivoFijo"));
		
		
		this.jButtonNuevoToolBarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRamoActivoFijo"));
			
		this.jButtonDuplicarToolBarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRamoActivoFijo"));
			
		this.jMenuItemNuevoTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRamoActivoFijo"));
			
		this.jMenuItemDuplicarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRamoActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRamoActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRamoActivoFijo"));
			
		this.jMenuItemNuevoRelacionesTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRamoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonModificarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarTipoRamoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonModificarToolBarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRamoActivoFijo"));
			
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemModificarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRamoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonActualizarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarTipoRamoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonActualizarToolBarTipoRamoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRamoActivoFijo"));
				
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemActualizarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRamoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonEliminarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarTipoRamoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonEliminarToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRamoActivoFijo"));
						
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemEliminarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRamoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonCancelarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarTipoRamoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonCancelarToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRamoActivoFijo"));
			
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemCancelarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRamoActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRamoActivoFijo"));		
		
		
		this.jButtonCerrarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarTipoRamoActivoFijo"));
		
		
		this.jButtonCerrarToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRamoActivoFijo"));
			
		this.jMenuItemCerrarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRamoActivoFijo"));
			
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jMenuItemDetalleCerrarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRamoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonGuardarCambiosTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRamoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonGuardarCambiosToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRamoActivoFijo"));
		}
		
		this.jButtonCopiarToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRamoActivoFijo"));
			
		this.jButtonVerFormToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRamoActivoFijo"));
		
		this.jMenuItemGuardarCambiosTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRamoActivoFijo"));
			
		this.jMenuItemCopiarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRamoActivoFijo"));		
		
		this.jMenuItemVerFormTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRamoActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRamoActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRamoActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRamoActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRamoActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRamoActivoFijo"));
		
		this.jMenuItemRecargarInformacionTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRamoActivoFijo"));		
		
		
		
		this.jButtonAnterioresTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresTipoRamoActivoFijo"));
		
		
		this.jButtonAnterioresToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRamoActivoFijo"));
		
		this.jMenuItemAnterioresTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRamoActivoFijo"));		
		
		
		this.jButtonSiguientesTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesTipoRamoActivoFijo"));
		
		
		this.jButtonSiguientesToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRamoActivoFijo"));
			
		this.jMenuItemSiguientesTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRamoActivoFijo"));
			
		this.jMenuItemAbrirOrderByTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRamoActivoFijo"));
			
		this.jMenuItemMostrarOcultarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRamoActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRamoActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRamoActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRamoActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRamoActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRamoActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRamoActivoFijo"));

		this.jCheckBoxSeleccionadosTipoRamoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRamoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRamoActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRamoActivoFijo"));
			
		this.jComboBoxTiposAccionesTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRamoActivoFijo"));
					
		this.jComboBoxTiposSeleccionarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRamoActivoFijo"));
			
		this.jTextFieldValorCampoGeneralTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRamoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonidTipoRamoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRamoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonid_empresaTipoRamoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRamoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonid_empresaTipoRamoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRamoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonnombreTipoRamoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRamoActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRamoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRamoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRamoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoRamoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRamoActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRamoActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRamoActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRamoActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRamoActivoFijo!=null) {
				this.jInternalFrameImportacionTipoRamoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRamoActivoFijo"));
				this.jInternalFrameImportacionTipoRamoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRamoActivoFijo"));
				this.jInternalFrameImportacionTipoRamoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRamoActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRamoActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarTipoRamoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRamoActivoFijo"));			
			
			if(this.jInternalFrameOrderByTipoRamoActivoFijo!=null) {
				this.jInternalFrameOrderByTipoRamoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRamoActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTabbedPaneRelacionesTipoRamoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRamoActivoFijo"));
		
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
            		closingInternalFrameTipoRamoActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRamoActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            TipoRamoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(TipoRamoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRamoActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoRamoActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRamoActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoRamoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRamoActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRamoActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRamoActivoFijo";
		inputMap = this.jButtonNuevoTipoRamoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRamoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRamoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesTipoRamoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRamoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRamoActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRamoActivoFijo";
		inputMap = this.jButtonModificarTipoRamoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRamoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoRamoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRamoActivoFijo";
		inputMap = this.jButtonActualizarTipoRamoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRamoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoRamoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRamoActivoFijo";
		inputMap = this.jButtonEliminarTipoRamoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRamoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoRamoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRamoActivoFijo";
		inputMap = this.jButtonCancelarTipoRamoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRamoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoRamoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRamoActivoFijo";
		inputMap = this.jButtonCerrarTipoRamoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRamoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoRamoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonGuardarCambiosTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRamoActivoFijo";
		inputMap = this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonGuardarCambiosTipoRamoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonGuardarCambiosTipoRamoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRamoActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoRamoActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRamoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoRamoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRamoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoRamoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRamoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoRamoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonidTipoRamoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRamoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonid_empresaTipoRamoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRamoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonid_empresaTipoRamoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRamoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jButtonnombreTipoRamoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRamoActivoFijoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRamoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoRamoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoRamoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRamoActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRamoActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijoLogic.getTipoRamoActivoFijos()) {
					tiporamoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijos) {
					tiporamoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoRamoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRamoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijoLogic.getTipoRamoActivoFijos()) {
						tiporamoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijos) {
						tiporamoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijoLogic.getTipoRamoActivoFijos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRamoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRamoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRamoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoRamoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRamoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRamoActivoFijo.getSelectedRows();
			
			TipoRamoActivoFijo tiporamoactivofijoLocal=new TipoRamoActivoFijo();
			
			//this.seleccionarTodosTipoRamoActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporamoactivofijoLocal =(TipoRamoActivoFijo) this.tiporamoactivofijoLogic.getTipoRamoActivoFijos().toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporamoactivofijoLocal =(TipoRamoActivoFijo) this.tiporamoactivofijos.toArray()[this.jTableDatosTipoRamoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporamoactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijoLogic.getTipoRamoActivoFijos()) {
						tiporamoactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijos) {
						tiporamoactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRamoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRamoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRamoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoRamoActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoRamoActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoRamoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRamoActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRamoActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijoLogic.getTipoRamoActivoFijos()) {
				
						if(sTipoSeleccionar.equals(TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporamoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijos) {
					
						if(sTipoSeleccionar.equals(TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporamoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoRamoActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRamoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRamoActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRamoActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRamoActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRamoActivoFijo(conSplash);
				
					this.generarReporteTipoRamoActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRamoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRamoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesTipoRamoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRamoActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRamoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRamoActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRamoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRamoActivoFijo();
				
				this.exportarTipoRamoActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRamoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRamoActivoFijos();
				//this.importarTipoRamoActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRamoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRamoActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRamoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesTipoRamoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Ramo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRamoActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRamoActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRamoActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Ramo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRamoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRamoActivoFijo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRamoActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoRamoActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRamoActivoFijo();
			
			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();		
			TipoRamoActivoFijo tiporamoactivofijo=new TipoRamoActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRamoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRamoActivoFijo.getSelectedItem();
			
			
			
			
			tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporamoactivofijosSeleccionados.size()==1) {
				for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijosSeleccionados) {
					tiporamoactivofijo=tiporamoactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Activo Fijo")) {
					jButtonDetalleActivoFijoActionPerformed(null,rowIndex,true,false,tiporamoactivofijo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRamoActivoFijo();
			
      		//this.finishProcessTipoRamoActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoRamoActivoFijoReturnGeneral() throws Exception {
		if(this.tiporamoactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporamoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporamoactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporamoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporamoactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporamoactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRamoActivoFijo(false);
		}
		
		if(this.tiporamoactivofijoReturnGeneral.getConRetornoLista() || this.tiporamoactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporamoactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporamoactivofijoLogic.setTipoRamoActivoFijos(this.tiporamoactivofijoReturnGeneral.getTipoRamoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporamoactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporamoactivofijoLogic.setTipoRamoActivoFijo(this.tiporamoactivofijoReturnGeneral.getTipoRamoActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRamoActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRamoActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<TipoRamoActivoFijo> getTipoRamoActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRamoActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijoLogic.getTipoRamoActivoFijos()) {
					if(tiporamoactivofijoAux.getIsSelected()) {
						tiporamoactivofijosSeleccionados.add(tiporamoactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRamoActivoFijo tiporamoactivofijoAux:this.tiporamoactivofijos) {
					if(tiporamoactivofijoAux.getIsSelected()) {
						tiporamoactivofijosSeleccionados.add(tiporamoactivofijoAux);				
					}
				}
			}
			
			if(tiporamoactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporamoactivofijosSeleccionados.addAll(this.tiporamoactivofijoLogic.getTipoRamoActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporamoactivofijosSeleccionados.addAll(this.tiporamoactivofijos);				
					}
				}
			}
		} else {
			tiporamoactivofijosSeleccionados.add(this.tiporamoactivofijo);
		}
		
		return tiporamoactivofijosSeleccionados;
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
	
	public void generarReporteTipoRamoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRamoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRamoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRamoActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRamoActivoFijosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoRamoActivoFijosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Ramo Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRamoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();		
		
		tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRamoActivoFijos("Todos",tiporamoactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRamoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();		
		
		tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRamoActivoFijos("Todos",tiporamoactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRamoActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();
		
		tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRamoActivoFijos("Todos",tiporamoactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRamoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRamoActivoFijo();
		
		
		tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRamoActivoFijo();
		
		
		//this.generarReporteTipoRamoActivoFijos("Todos",tiporamoactivofijosSeleccionados ,tiporamoactivofijoImplementable,tiporamoactivofijoImplementableHome);
	}
	
	public void mostrarImportacionTipoRamoActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRamoActivoFijo();
		
		this.abrirFrameImportacionTipoRamoActivoFijo();		
		
			
		//this.generarReporteTipoRamoActivoFijos("Todos",tiporamoactivofijosSeleccionados ,tiporamoactivofijoImplementable,tiporamoactivofijoImplementableHome);
	}
	
	public void importarTipoRamoActivoFijos() throws Exception {		
	
	}
	
	public void exportarTipoRamoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRamoActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRamoActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRamoActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Ramo Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRamoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();		
		
		tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporamoactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRamoActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRamoActivoFijo(tiporamoactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporamoactivofijoAux.setsDetalleGeneralEntityReporte(tiporamoactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ramo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRamoActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoRamoActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRamoActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporamoactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporamoactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporamoactivofijo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporamoactivofijo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRamoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();		
		
		tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporamoactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRamoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRamoActivoFijo(row);				
				iRow++;
			}				
			
			for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRamoActivoFijo(tiporamoactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ramo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRamoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();		
		
		tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporamoactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporamoactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporamoactivofijo");
			//elementRoot.appendChild(element);
		
			for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijosSeleccionados) {
				element = document.createElement("tiporamoactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRamoActivoFijo(tiporamoactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ramo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRamoActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRamoActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRamoActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporamoactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporamoactivofijo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporamoactivofijo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoRamoActivoFijo(TipoRamoActivoFijo tiporamoactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoRamoActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporamoactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoRamoActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporamoactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoRamoActivoFijoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiporamoactivofijo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoRamoActivoFijoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporamoactivofijo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoRamoActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados=new ArrayList<TipoRamoActivoFijo>();
		
		tiporamoactivofijosSeleccionados=this.getTipoRamoActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRamoActivoFijo(tiporamoactivofijosSeleccionados);
		
		this.generarReporteTipoRamoActivoFijos("Todos",tiporamoactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRamoActivoFijo(ArrayList<TipoRamoActivoFijo> tiporamoactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRamoActivoFijo tiporamoactivofijoAux:tiporamoactivofijosSeleccionados) {
				tiporamoactivofijoAux.setsDetalleGeneralEntityReporte(tiporamoactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiporamoactivofijoAux.setsDescripcionGeneralEntityReporte1(tiporamoactivofijoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporamoactivofijoAux.setsDescripcionGeneralEntityReporte1(tiporamoactivofijoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRamoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRamoActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoRamoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaEliminarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoRamoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaEliminarTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaCancelarTipoRamoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaEliminarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoRamoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaModificarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoRamoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoRamoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaActualizarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoRamoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRamoActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoRamoActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsTipoRamoActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRamoActivoFijo=false;
			//this.isVisibilidadCeldaVerFormTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarTipoRamoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=false;												
			}
			
			this.jButtonCerrarTipoRamoActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRamoActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporamoactivofijo)) {
			this.isVisibilidadCeldaActualizarTipoRamoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoRamoActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRamoActivoFijo() {
		this.isVisibilidadCeldaNuevoTipoRamoActivoFijo=false;
		this.isVisibilidadCeldaGuardarCambiosTipoRamoActivoFijo=false;
	}
	
	public void actualizarEstadoPanelsTipoRamoActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRamoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoRamoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosTipoRamoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRamoActivoFijo!=null) {
				this.jPanelPaginacionTipoRamoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRamoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoRamoActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRamoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoRamoActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosTipoRamoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRamoActivoFijo!=null) {
				this.jPanelPaginacionTipoRamoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRamoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoRamoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRamoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoRamoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosTipoRamoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRamoActivoFijo!=null) {
				this.jPanelPaginacionTipoRamoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRamoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoRamoActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRamoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoRamoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosTipoRamoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRamoActivoFijo!=null) {
				this.jPanelPaginacionTipoRamoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRamoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoRamoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRamoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoRamoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosTipoRamoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRamoActivoFijo!=null) {
				this.jPanelPaginacionTipoRamoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRamoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoRamoActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRamoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoRamoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosTipoRamoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRamoActivoFijo!=null) {
				this.jPanelPaginacionTipoRamoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRamoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoRamoActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRamoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoRamoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRamoActivoFijo!=null) {
				this.jScrollPanelDatosTipoRamoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRamoActivoFijo!=null) {
				this.jPanelPaginacionTipoRamoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRamoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoRamoActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoRamoActivoFijo!=null) {
					this.jTabbedPaneBusquedasTipoRamoActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoRamoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoRamoActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRamoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoRamoActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoRamoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoRamoActivoFijo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoRamoActivoFijoParaDetalleActivoFijos() throws Exception {
		Boolean isPaginaPopupDetalleActivoFijo=false;

		try {

			if(this.tiporamoactivofijoSessionBean==null) {
				this.tiporamoactivofijoSessionBean=new TipoRamoActivoFijoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoSessionBean.setsPathNavegacionActual(tiporamoactivofijoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleActivoFijo=this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleActivoFijo(true);
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleActivoFijo(TipoRamoActivoFijoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionTipoRamoActivoFijo(true);
			this.jInternalFrameDetalleFormTipoRamoActivoFijo.detalleactivofijoSessionBean.setlidTipoRamoActivoFijoActual(this.idTipoRamoActivoFijoActual);

			tiporamoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRamoActivoFijo(true);
			tiporamoactivofijoSessionBean.setlIdTipoRamoActivoFijoActualForeignKey(this.idTipoRamoActivoFijoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoRamoActivoFijoSessionBean tiporamoactivofijoSessionBean=new TipoRamoActivoFijoSessionBean();
		
		if(this.tiporamoactivofijoSessionBean==null) {
			this.tiporamoactivofijoSessionBean=new TipoRamoActivoFijoSessionBean();
		}
		
		this.tiporamoactivofijoSessionBean.setsUltimaBusquedaTipoRamoActivoFijo(this.getsAccionBusqueda());
		this.tiporamoactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporamoactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiporamoactivofijoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoRamoActivoFijoSessionBean tiporamoactivofijoSessionBean=new TipoRamoActivoFijoSessionBean();
		
		if(this.tiporamoactivofijoSessionBean==null) {
			this.tiporamoactivofijoSessionBean=new TipoRamoActivoFijoSessionBean();
		}
		
		if(this.tiporamoactivofijoSessionBean.getsUltimaBusquedaTipoRamoActivoFijo()!=null&&!this.tiporamoactivofijoSessionBean.getsUltimaBusquedaTipoRamoActivoFijo().equals("")) {
			this.setsAccionBusqueda(tiporamoactivofijoSessionBean.getsUltimaBusquedaTipoRamoActivoFijo());
			this.setiNumeroPaginacion(tiporamoactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporamoactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiporamoactivofijoSessionBean.getid_empresa());
				tiporamoactivofijoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tiporamoactivofijoSessionBean.setsUltimaBusquedaTipoRamoActivoFijo("");
		this.tiporamoactivofijoSessionBean.setiNumeroPaginacion(TipoRamoActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.tiporamoactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRamoActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRamoActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioTipoRamoActivoFijo();
		this.updateVisibilidadBusquedasFormularioTipoRamoActivoFijo();
		this.updateHabilitarBusquedasFormularioTipoRamoActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRamoActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoRamoActivoFijo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRamoActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoRamoActivoFijo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoRamoActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoRamoActivoFijo.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoRamoActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoRamoActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoRamoActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRamoActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioTipoRamoActivoFijo();
		this.updateHabilitarResaltarControlesFormularioTipoRamoActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRamoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporamoactivofijoConstantesFunciones.resaltaridTipoRamoActivoFijo!=null && this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelidTipoRamoActivoFijo.setBorder(this.tiporamoactivofijoConstantesFunciones.resaltaridTipoRamoActivoFijo);}
		if(this.tiporamoactivofijoConstantesFunciones.resaltarid_empresaTipoRamoActivoFijo!=null && this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.setBorder(this.tiporamoactivofijoConstantesFunciones.resaltarid_empresaTipoRamoActivoFijo);}
		if(this.tiporamoactivofijoConstantesFunciones.resaltarnombreTipoRamoActivoFijo!=null && this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTextAreanombreTipoRamoActivoFijo.setBorder(this.tiporamoactivofijoConstantesFunciones.resaltarnombreTipoRamoActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRamoActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelidTipoRamoActivoFijo.setVisible(this.tiporamoactivofijoConstantesFunciones.mostraridTipoRamoActivoFijo);
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jPanelidTipoRamoActivoFijo.setVisible(this.tiporamoactivofijoConstantesFunciones.mostraridTipoRamoActivoFijo);
		//this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.setVisible(this.tiporamoactivofijoConstantesFunciones.mostrarid_empresaTipoRamoActivoFijo);
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jPanelid_empresaTipoRamoActivoFijo.setVisible(this.tiporamoactivofijoConstantesFunciones.mostrarid_empresaTipoRamoActivoFijo);
		//this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTextAreanombreTipoRamoActivoFijo.setVisible(this.tiporamoactivofijoConstantesFunciones.mostrarnombreTipoRamoActivoFijo);
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jPanelnombreTipoRamoActivoFijo.setVisible(this.tiporamoactivofijoConstantesFunciones.mostrarnombreTipoRamoActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRamoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRamoActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jLabelidTipoRamoActivoFijo.setEnabled(this.tiporamoactivofijoConstantesFunciones.activaridTipoRamoActivoFijo);
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jComboBoxid_empresaTipoRamoActivoFijo.setEnabled(this.tiporamoactivofijoConstantesFunciones.activarid_empresaTipoRamoActivoFijo);
		this.jInternalFrameDetalleFormTipoRamoActivoFijo.jTextAreanombreTipoRamoActivoFijo.setEnabled(this.tiporamoactivofijoConstantesFunciones.activarnombreTipoRamoActivoFijo);
		}
	}
	
		
}