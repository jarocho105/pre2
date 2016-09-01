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

import com.bydan.erp.activosfijos.util.PartidaPresuConstantesFunciones;
import com.bydan.erp.activosfijos.util.PartidaPresuParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.PartidaPresuParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.PartidaPresuBean;
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
public class PartidaPresuBeanSwingJInternalFrame extends PartidaPresuJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PartidaPresuBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PartidaPresu> partidapresuValidator = new ClassValidator<PartidaPresu>(PartidaPresu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PartidaPresu partidapresu;	
	public PartidaPresu partidapresuAux;
	public PartidaPresu partidapresuAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PartidaPresu partidapresuTotales;
	public Long idPartidaPresuActual;
	public Long iIdNuevoPartidaPresu=0L;
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
	
	public Boolean isPermisoTodoPartidaPresu;
	public Boolean isPermisoNuevoPartidaPresu;
	public Boolean isPermisoActualizarPartidaPresu;
	public Boolean isPermisoActualizarOriginalPartidaPresu;
	public Boolean isPermisoEliminarPartidaPresu;
	public Boolean isPermisoGuardarCambiosPartidaPresu;
	public Boolean isPermisoConsultaPartidaPresu;
	public Boolean isPermisoBusquedaPartidaPresu;
	public Boolean isPermisoReportePartidaPresu;
	public Boolean isPermisoPaginacionMedioPartidaPresu;
	public Boolean isPermisoPaginacionAltoPartidaPresu;
	public Boolean isPermisoPaginacionTodoPartidaPresu;
	public Boolean isPermisoCopiarPartidaPresu;
	public Boolean isPermisoVerFormPartidaPresu;
	public Boolean isPermisoDuplicarPartidaPresu;
	public Boolean isPermisoOrdenPartidaPresu;
	
	
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
	
	public PartidaPresuParameterReturnGeneral partidapresuReturnGeneral;
	public PartidaPresuParameterReturnGeneral partidapresuParameterGeneral;
	
	

	public DetalleActivoFijoLogic detalleactivofijoLogic=null;

	public DetalleActivoFijoLogic getDetalleActivoFijoLogic() {
		return detalleactivofijoLogic;
	}

	public void setDetalleActivoFijoLogic(DetalleActivoFijoLogic detalleactivofijoLogic) {
		this.detalleactivofijoLogic = detalleactivofijoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPartidaPresu=false;
	public Boolean esParaAccionDesdeFormularioPartidaPresu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PartidaPresuSessionBeanAdditional partidapresuSessionBeanAdditional=null;
	
	public PartidaPresuSessionBeanAdditional getPartidaPresuSessionBeanAdditional() {
		return this.partidapresuSessionBeanAdditional;
	}
	
	public void setPartidaPresuSessionBeanAdditional(PartidaPresuSessionBeanAdditional partidapresuSessionBeanAdditional) {
		try {
			this.partidapresuSessionBeanAdditional=partidapresuSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PartidaPresuBeanSwingJInternalFrameAdditional partidapresuBeanSwingJInternalFrameAdditional=null;
	//public class PartidaPresuBeanSwingJInternalFrame
	
	public PartidaPresuBeanSwingJInternalFrameAdditional getPartidaPresuBeanSwingJInternalFrameAdditional() {
		return this.partidapresuBeanSwingJInternalFrameAdditional;
	}
	
	public void setPartidaPresuBeanSwingJInternalFrameAdditional(PartidaPresuBeanSwingJInternalFrameAdditional partidapresuBeanSwingJInternalFrameAdditional) {
		try {
			this.partidapresuBeanSwingJInternalFrameAdditional=partidapresuBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PartidaPresuLogic partidapresuLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PartidaPresu partidapresuBean;
	public PartidaPresuConstantesFunciones partidapresuConstantesFunciones;
	//public PartidaPresuParameterReturnGeneral partidapresuReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<PartidaPresu> partidapresus;	
	//public List<PartidaPresu> partidapresusEliminados;
	//public List<PartidaPresu> partidapresusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPartidaPresu=false;
	public Boolean isVisibilidadCeldaDuplicarPartidaPresu=true;
	public Boolean isVisibilidadCeldaCopiarPartidaPresu=true;
	public Boolean isVisibilidadCeldaVerFormPartidaPresu=true;
	public Boolean isVisibilidadCeldaOrdenPartidaPresu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPartidaPresu=false;
	public Boolean isVisibilidadCeldaModificarPartidaPresu=false;
	public Boolean isVisibilidadCeldaActualizarPartidaPresu=false;
	public Boolean isVisibilidadCeldaEliminarPartidaPresu=false;
	public Boolean isVisibilidadCeldaCancelarPartidaPresu=false;
	public Boolean isVisibilidadCeldaGuardarPartidaPresu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPartidaPresu=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoPartidaPresu() {
		return this.iIdNuevoPartidaPresu;
	}

	public void setiIdNuevoPartidaPresu(Long iIdNuevoPartidaPresu) {
		this.iIdNuevoPartidaPresu = iIdNuevoPartidaPresu;
	}
	
	public Long getidPartidaPresuActual() {
		return this.idPartidaPresuActual;
	}

	public void setidPartidaPresuActual(Long idPartidaPresuActual) {
		this.idPartidaPresuActual = idPartidaPresuActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PartidaPresu getpartidapresu() {
		return this.partidapresu;
	}

	public void setpartidapresu(PartidaPresu partidapresu) {
		this.partidapresu = partidapresu;
	}
	
	public PartidaPresu getpartidapresuAux() {
		return this.partidapresuAux;
	}

	public void setpartidapresuAux(PartidaPresu partidapresuAux) {
		this.partidapresuAux = partidapresuAux;
	}				
	
	public PartidaPresu getpartidapresuAnterior() {
		return this.partidapresuAnterior;
	}

	public void setpartidapresuAnterior(PartidaPresu partidapresuAnterior) {
		this.partidapresuAnterior = partidapresuAnterior;
	}	
	
	public PartidaPresu getpartidapresuTotales() {
		return this.partidapresuTotales;
	}

	public void setpartidapresuTotales(PartidaPresu partidapresuTotales) {
		this.partidapresuTotales = partidapresuTotales;
	}	
	
	public PartidaPresu getpartidapresuBean() {
		return this.partidapresuBean;
	}

	public void setpartidapresuBean(PartidaPresu partidapresuBean) {
		this.partidapresuBean = partidapresuBean;
	}	
	
	public PartidaPresuParameterReturnGeneral getpartidapresuReturnGeneral() {
		return this.partidapresuReturnGeneral;
	}

	public void setpartidapresuReturnGeneral(PartidaPresuParameterReturnGeneral partidapresuReturnGeneral) {
		this.partidapresuReturnGeneral = partidapresuReturnGeneral;
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
	
	
	public PartidaPresuLogic getPartidaPresuLogic()	{		
		return partidapresuLogic;
	}

	public void setPartidaPresuLogic(PartidaPresuLogic partidapresuLogic) {
		this.partidapresuLogic = partidapresuLogic;
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
	
	public Boolean getIsEsNuevoPartidaPresu() {
		return isEsNuevoPartidaPresu;
	}

	public void setIsEsNuevoPartidaPresu(Boolean isEsNuevoPartidaPresu) {
		this.isEsNuevoPartidaPresu = isEsNuevoPartidaPresu;
	}

	public Boolean getEsParaAccionDesdeFormularioPartidaPresu() {
		return esParaAccionDesdeFormularioPartidaPresu;
	}
	
	public void setEsParaAccionDesdeFormularioPartidaPresu(Boolean esParaAccionDesdeFormularioPartidaPresu) {
		this.esParaAccionDesdeFormularioPartidaPresu = esParaAccionDesdeFormularioPartidaPresu;
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

			if(this.partidapresuSessionBean==null) {
				this.partidapresuSessionBean=new PartidaPresuSessionBean();
			}

			if(!this.partidapresuSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(partidapresuSessionBean.getlidEmpresaActual());
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

					if(this.partidapresu!=null) {
						this.partidapresu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
						this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPartidaPresu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
						if(this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPartidaPresuGenerico)throws Exception
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
				jComboBoxid_empresaPartidaPresuGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPartidaPresuGenerico!=null && jComboBoxid_empresaPartidaPresuGenerico.getItemCount()>0) {
					jComboBoxid_empresaPartidaPresuGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PartidaPresu partidapresu,JComboBox jComboBoxid_empresaPartidaPresuGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPartidaPresuGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPartidaPresuGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				partidapresu.setid_empresa(empresaAux.getId());
				partidapresu.setempresa_descripcion(PartidaPresuConstantesFunciones.getEmpresaDescripcion(empresaAux));
				partidapresu.setEmpresa(empresaAux);			}
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

					if(!PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPartidaPresu!=null) { 
							this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPartidaPresu!=null) { 
					}

					if(!PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
							this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
							this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPartidaPresu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PartidaPresuConstantesFunciones.refrescarForeignKeysDescripcionesPartidaPresu(this.partidapresuLogic.getPartidaPresus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PartidaPresuConstantesFunciones.refrescarForeignKeysDescripcionesPartidaPresu(this.partidapresus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//partidapresuLogic.setPartidaPresus(this.partidapresus);
			partidapresuLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PartidaPresuParameterReturnGeneral getPartidaPresuParameterGeneral() {
		return this.partidapresuParameterGeneral;
	}
	
	public void setPartidaPresuParameterGeneral(PartidaPresuParameterReturnGeneral partidapresuParameterGeneral) {
		this.partidapresuParameterGeneral = partidapresuParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPartidaPresu() {
		return isPermisoTodoPartidaPresu;
	}

	public void setIsPermisoTodoPartidaPresu(Boolean isPermisoTodoPartidaPresu) {
		this.isPermisoTodoPartidaPresu = isPermisoTodoPartidaPresu;
	}

	public Boolean getIsPermisoNuevoPartidaPresu() {
		return isPermisoNuevoPartidaPresu;
	}

	public void setIsPermisoNuevoPartidaPresu(Boolean isPermisoNuevoPartidaPresu) {
		this.isPermisoNuevoPartidaPresu = isPermisoNuevoPartidaPresu;
	}

	public Boolean getIsPermisoActualizarPartidaPresu() {
		return isPermisoActualizarPartidaPresu;
	}

	public void setIsPermisoActualizarPartidaPresu(Boolean isPermisoActualizarPartidaPresu) {
		this.isPermisoActualizarPartidaPresu = isPermisoActualizarPartidaPresu;
	}

	public Boolean getIsPermisoEliminarPartidaPresu() {
		return isPermisoEliminarPartidaPresu;
	}

	public void setIsPermisoEliminarPartidaPresu(Boolean isPermisoEliminarPartidaPresu) {
		this.isPermisoEliminarPartidaPresu = isPermisoEliminarPartidaPresu;
	}

	public Boolean getIsPermisoGuardarCambiosPartidaPresu() {
		return isPermisoGuardarCambiosPartidaPresu;
	}

	public void setIsPermisoGuardarCambiosPartidaPresu(Boolean isPermisoGuardarCambiosPartidaPresu) {
		this.isPermisoGuardarCambiosPartidaPresu = isPermisoGuardarCambiosPartidaPresu;
	}
	
	public Boolean getIsPermisoConsultaPartidaPresu() {
		return isPermisoConsultaPartidaPresu;
	}

	public void setIsPermisoConsultaPartidaPresu(Boolean isPermisoConsultaPartidaPresu) {
		this.isPermisoConsultaPartidaPresu = isPermisoConsultaPartidaPresu;
	}

	public Boolean getIsPermisoBusquedaPartidaPresu() {
		return isPermisoBusquedaPartidaPresu;
	}

	public void setIsPermisoBusquedaPartidaPresu(Boolean isPermisoBusquedaPartidaPresu) {
		this.isPermisoBusquedaPartidaPresu = isPermisoBusquedaPartidaPresu;
	}

	public Boolean getIsPermisoReportePartidaPresu() {
		return isPermisoReportePartidaPresu;
	}

	public void setIsPermisoReportePartidaPresu(Boolean isPermisoReportePartidaPresu) {
		this.isPermisoReportePartidaPresu = isPermisoReportePartidaPresu;
	}
	
	public Boolean getIsPermisoPaginacionMedioPartidaPresu() {
		return isPermisoPaginacionMedioPartidaPresu;
	}

	public void setIsPermisoPaginacionMedioPartidaPresu(Boolean isPermisoPaginacionMedioPartidaPresu) {
		this.isPermisoPaginacionMedioPartidaPresu = isPermisoPaginacionMedioPartidaPresu;
	}
	
	public Boolean getIsPermisoPaginacionTodoPartidaPresu() {
		return isPermisoPaginacionTodoPartidaPresu;
	}

	public void setIsPermisoPaginacionTodoPartidaPresu(Boolean isPermisoPaginacionTodoPartidaPresu) {
		this.isPermisoPaginacionTodoPartidaPresu = isPermisoPaginacionTodoPartidaPresu;
	}
	
	public Boolean getIsPermisoPaginacionAltoPartidaPresu() {
		return isPermisoPaginacionAltoPartidaPresu;
	}

	public void setIsPermisoPaginacionAltoPartidaPresu(Boolean isPermisoPaginacionAltoPartidaPresu) {
		this.isPermisoPaginacionAltoPartidaPresu = isPermisoPaginacionAltoPartidaPresu;
	}
	
	public Boolean getIsPermisoCopiarPartidaPresu() {
		return isPermisoCopiarPartidaPresu;
	}

	public void setIsPermisoCopiarPartidaPresu(Boolean isPermisoCopiarPartidaPresu) {
		this.isPermisoCopiarPartidaPresu = isPermisoCopiarPartidaPresu;
	}
	
	public Boolean getIsPermisoVerFormPartidaPresu() {
		return isPermisoVerFormPartidaPresu;
	}

	public void setIsPermisoVerFormPartidaPresu(Boolean isPermisoVerFormPartidaPresu) {
		this.isPermisoVerFormPartidaPresu = isPermisoVerFormPartidaPresu;
	}
	
	public Boolean getIsPermisoDuplicarPartidaPresu() {
		return isPermisoDuplicarPartidaPresu;
	}

	public void setIsPermisoDuplicarPartidaPresu(Boolean isPermisoDuplicarPartidaPresu) {
		this.isPermisoDuplicarPartidaPresu = isPermisoDuplicarPartidaPresu;
	}
	
	public Boolean getIsPermisoOrdenPartidaPresu() {
		return isPermisoOrdenPartidaPresu;
	}

	public void setIsPermisoOrdenPartidaPresu(Boolean isPermisoOrdenPartidaPresu) {
		this.isPermisoOrdenPartidaPresu = isPermisoOrdenPartidaPresu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPartidaPresu() {
		return isVisibilidadCeldaNuevoPartidaPresu;
	}

	public void setIsVisibilidadCeldaNuevoPartidaPresu(Boolean isVisibilidadCeldaNuevoPartidaPresu) {
		this.isVisibilidadCeldaNuevoPartidaPresu = isVisibilidadCeldaNuevoPartidaPresu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPartidaPresu() {
		return isVisibilidadCeldaDuplicarPartidaPresu;
	}

	public void setIsVisibilidadCeldaDuplicarPartidaPresu(Boolean isVisibilidadCeldaDuplicarPartidaPresu) {
		this.isVisibilidadCeldaDuplicarPartidaPresu = isVisibilidadCeldaDuplicarPartidaPresu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPartidaPresu() {
		return isVisibilidadCeldaCopiarPartidaPresu;
	}

	public void setIsVisibilidadCeldaCopiarPartidaPresu(Boolean isVisibilidadCeldaCopiarPartidaPresu) {
		this.isVisibilidadCeldaCopiarPartidaPresu = isVisibilidadCeldaCopiarPartidaPresu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPartidaPresu() {
		return isVisibilidadCeldaVerFormPartidaPresu;
	}

	public void setIsVisibilidadCeldaVerFormPartidaPresu(Boolean isVisibilidadCeldaVerFormPartidaPresu) {
		this.isVisibilidadCeldaVerFormPartidaPresu = isVisibilidadCeldaVerFormPartidaPresu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPartidaPresu() {
		return isVisibilidadCeldaOrdenPartidaPresu;
	}

	public void setIsVisibilidadCeldaOrdenPartidaPresu(Boolean isVisibilidadCeldaOrdenPartidaPresu) {
		this.isVisibilidadCeldaOrdenPartidaPresu = isVisibilidadCeldaOrdenPartidaPresu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPartidaPresu() {
		return isVisibilidadCeldaNuevoRelacionesPartidaPresu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPartidaPresu(Boolean isVisibilidadCeldaNuevoRelacionesPartidaPresu) {
		this.isVisibilidadCeldaNuevoRelacionesPartidaPresu = isVisibilidadCeldaNuevoRelacionesPartidaPresu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPartidaPresu() {
		return isVisibilidadCeldaModificarPartidaPresu;
	}

	public void setIsVisibilidadCeldaModificarPartidaPresu(Boolean isVisibilidadCeldaModificarPartidaPresu) {
		this.isVisibilidadCeldaModificarPartidaPresu = isVisibilidadCeldaModificarPartidaPresu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPartidaPresu() {
		return isVisibilidadCeldaActualizarPartidaPresu;
	}

	public void setIsVisibilidadCeldaActualizarPartidaPresu(Boolean isVisibilidadCeldaActualizarPartidaPresu) {
		this.isVisibilidadCeldaActualizarPartidaPresu = isVisibilidadCeldaActualizarPartidaPresu;
	}

	public Boolean getIsVisibilidadCeldaEliminarPartidaPresu() {
		return isVisibilidadCeldaEliminarPartidaPresu;
	}

	public void setIsVisibilidadCeldaEliminarPartidaPresu(Boolean isVisibilidadCeldaEliminarPartidaPresu) {
		this.isVisibilidadCeldaEliminarPartidaPresu = isVisibilidadCeldaEliminarPartidaPresu;
	}

	public Boolean getIsVisibilidadCeldaCancelarPartidaPresu() {
		return isVisibilidadCeldaCancelarPartidaPresu;
	}

	public void setIsVisibilidadCeldaCancelarPartidaPresu(Boolean isVisibilidadCeldaCancelarPartidaPresu) {
		this.isVisibilidadCeldaCancelarPartidaPresu = isVisibilidadCeldaCancelarPartidaPresu;
	}

	public Boolean getIsVisibilidadCeldaGuardarPartidaPresu() {
		return isVisibilidadCeldaGuardarPartidaPresu;
	}

	public void setIsVisibilidadCeldaGuardarPartidaPresu(Boolean isVisibilidadCeldaGuardarPartidaPresu) {
		this.isVisibilidadCeldaGuardarPartidaPresu = isVisibilidadCeldaGuardarPartidaPresu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPartidaPresu() {
		return isVisibilidadCeldaGuardarCambiosPartidaPresu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPartidaPresu(Boolean isVisibilidadCeldaGuardarCambiosPartidaPresu) {
		this.isVisibilidadCeldaGuardarCambiosPartidaPresu = isVisibilidadCeldaGuardarCambiosPartidaPresu;
	}
		
	public PartidaPresuSessionBean getpartidapresuSessionBean() {
		return this.partidapresuSessionBean;
	}
	
	public void setpartidapresuSessionBean(PartidaPresuSessionBean partidapresuSessionBean) {
		this.partidapresuSessionBean=partidapresuSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(PartidaPresu partidapresu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(partidapresu,null);
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
	
	public void bugActualizarReferenciaActual(PartidaPresu partidapresu,PartidaPresu partidapresuAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPartidaPresu(partidapresu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		partidapresuAux.setId(partidapresu.getId());
		partidapresuAux.setVersionRow(partidapresu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPartidaPresu();
		
			int intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PartidaPresuJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPartidaPresu(this.partidapresu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = partidapresuValidator.getInvalidValues(this.partidapresu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			partidapresuLogic.setDatosCliente(datosCliente);
			partidapresuLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				partidapresuAux=new  PartidaPresu();
				
				partidapresuAux.setIsNew(true);
				partidapresuAux.setIsChanged(true);
				
				partidapresuAux.setPartidaPresuOriginal(this.partidapresu);
				
				partidapresuAux.setId(this.partidapresu.getId());	
				partidapresuAux.setVersionRow(this.partidapresu.getVersionRow());	
				partidapresuAux.setid_empresa(this.partidapresu.getid_empresa());	
				partidapresuAux.setcodigo(this.partidapresu.getcodigo());	
				partidapresuAux.setnombre(this.partidapresu.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.partidapresuSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.partidapresuSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(partidapresuAux,partidapresuLogic.getPartidaPresus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(partidapresuAux,partidapresus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.partidapresuSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.partidapresuSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						partidapresuLogic.savePartidaPresus();//WithConnection
						//partidapresuLogic.getSetVersionRowPartidaPresus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.partidapresu,partidapresuAux);
					
					this.refrescarForeignKeysDescripcionesPartidaPresu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.partidapresuSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos().addAll(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos.addAll(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								partidapresuLogic.savePartidaPresuRelaciones(partidapresuAux,this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());//WithConnection
								//partidapresuLogic.getSetVersionRowPartidaPresus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.partidapresu,partidapresuAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(new ArrayList<DetalleActivoFijo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos= new ArrayList<DetalleActivoFijo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							partidapresuAux.setDetalleActivoFijos(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.partidapresuSessionBean.getEstaModoGuardarRelaciones() 
									|| this.partidapresuSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(partidapresuAux,partidapresuLogic.getPartidaPresus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(partidapresuAux,partidapresus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.partidapresu,partidapresuAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				partidapresuAux=new  PartidaPresu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.partidapresuSessionBean.getEsGuardarRelacionado() 
					|| (this.partidapresuSessionBean.getEsGuardarRelacionado() && this.partidapresu.getId()>=0)) {
						
					partidapresuAux.setIsNew(false);
				}
				
				partidapresuAux.setIsDeleted(false);
			
				partidapresuAux.setId(this.partidapresu.getId());	
				partidapresuAux.setVersionRow(this.partidapresu.getVersionRow());	
				partidapresuAux.setid_empresa(this.partidapresu.getid_empresa());	
				partidapresuAux.setcodigo(this.partidapresu.getcodigo());	
				partidapresuAux.setnombre(this.partidapresu.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(partidapresuAux,partidapresuLogic.getPartidaPresus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(partidapresuAux,partidapresus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.partidapresuSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.partidapresuSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						partidapresuLogic.savePartidaPresus();//WithConnection
						//partidapresuLogic.getSetVersionRowPartidaPresus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.partidapresu,partidapresuAux);
					
					this.refrescarForeignKeysDescripcionesPartidaPresu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.partidapresuSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos().addAll(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos.addAll(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								partidapresuLogic.savePartidaPresuRelaciones(partidapresuAux,this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());//WithConnection
								//partidapresuLogic.getSetVersionRowPartidaPresus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.partidapresu,partidapresuAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(new ArrayList<DetalleActivoFijo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos= new ArrayList<DetalleActivoFijo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							partidapresuAux.setDetalleActivoFijos(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.partidapresuSessionBean.getEstaModoGuardarRelaciones() 
									|| this.partidapresuSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(partidapresuAux,partidapresuLogic.getPartidaPresus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(partidapresuAux,partidapresus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.partidapresu,partidapresuAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				partidapresuAux=new  PartidaPresu();
				
				partidapresuAux.setIsNew(false);
				partidapresuAux.setIsChanged(false);
				
				partidapresuAux.setIsDeleted(true);
				
				partidapresuAux.setId(this.partidapresu.getId());	
				partidapresuAux.setVersionRow(this.partidapresu.getVersionRow());	
				partidapresuAux.setid_empresa(this.partidapresu.getid_empresa());	
				partidapresuAux.setcodigo(this.partidapresu.getcodigo());	
				partidapresuAux.setnombre(this.partidapresu.getnombre());	
				
				if(this.partidapresuSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.partidapresuAux.getId()>=0) {	
						this.partidapresusEliminados.add(partidapresuAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(partidapresuAux,partidapresuLogic.getPartidaPresus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(partidapresuAux,partidapresus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.partidapresuSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.partidapresuSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						partidapresuLogic.savePartidaPresus();//WithConnection
						//partidapresuLogic.getSetVersionRowPartidaPresus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.partidapresuSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos().addAll(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos.addAll(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								partidapresuLogic.savePartidaPresuRelaciones(partidapresuAux,this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());//WithConnection
								//partidapresuLogic.getSetVersionRowPartidaPresus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(new ArrayList<DetalleActivoFijo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos= new ArrayList<DetalleActivoFijo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							partidapresuAux.setDetalleActivoFijos(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.partidapresuSessionBean.getEstaModoGuardarRelaciones() 
								|| this.partidapresuSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(partidapresuAux,partidapresuLogic.getPartidaPresus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(partidapresuAux,partidapresus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.getPartidaPresus().addAll(this.partidapresusEliminados);
					
					partidapresuLogic.savePartidaPresus();//WithConnection
					//partidapresuLogic.getSetVersionRowPartidaPresus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPartidaPresu();
				
				this.partidapresusEliminados= new ArrayList<PartidaPresu>();		
			}
			
			if(this.partidapresuSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Partida Presupuestaria GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Partida Presupuestaria",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.partidapresu=partidapresuAux;
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
      		//this.finishProcessPartidaPresu();
      	}
		
	}	
	
	public void actualizarRelaciones(PartidaPresu partidapresuLocal) throws Exception {
		
		if(this.partidapresuSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				partidapresuLocal.setDetalleActivoFijos(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
			
			} else {
			
				partidapresuLocal.setDetalleActivoFijos(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PartidaPresu partidapresuLocal) throws Exception {	
		if(this.partidapresuSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				partidapresuLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPartidaPresuActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = partidapresuValidator.getInvalidValues(this.partidapresu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PartidaPresu partidapresu,List<PartidaPresu> partidapresus) throws Exception {
		try	{		
			PartidaPresuConstantesFunciones.actualizarLista(partidapresu,partidapresus,this.partidapresuSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PartidaPresu partidapresu,List<PartidaPresu> partidapresus) throws Exception {
		try	{			
			PartidaPresuConstantesFunciones.actualizarSelectedLista(partidapresu,partidapresus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PartidaPresu> partidapresusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				partidapresusLocal=this.partidapresuLogic.getPartidaPresus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				partidapresusLocal=this.partidapresus;
			}
			//ARCHITECTURE
		
			for(PartidaPresu partidapresuLocal:partidapresusLocal) {
				if(this.permiteMantenimiento(partidapresuLocal) && partidapresuLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PartidaPresuConstantesFunciones.getPartidaPresuLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PartidaPresuConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPartidaPresu.jLabelid_empresaPartidaPresu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PartidaPresuConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPartidaPresu.jLabelcodigoPartidaPresu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PartidaPresuConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPartidaPresu.jLabelnombrePartidaPresu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPartidaPresu.jLabelid_empresaPartidaPresu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPartidaPresu.jLabelcodigoPartidaPresu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPartidaPresu.jLabelnombrePartidaPresu,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleActivoFijo")) {
			if(this.partidapresu==null) {
				this.partidapresu= new PartidaPresu();
			}

			if(this.partidapresuSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPartidaPresu
				this.setVariablesFormularioToObjetoActualPartidaPresu(this.partidapresu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);

				this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.getdetalleactivofijo().setPartidaPresu(this.partidapresu);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPartidaPresu--;	
		
		
		this.partidapresuAux=new PartidaPresu();
		
		this.partidapresuAux.setId(this.iIdNuevoPartidaPresu);
		this.partidapresuAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.partidapresuLogic.getPartidaPresus().add(this.partidapresuAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.partidapresus.add(this.partidapresuAux);
		}
		//ARCHITECTURE
		
		this.partidapresu=this.partidapresuAux;
		
		if(PartidaPresuJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPartidaPresu(this.partidapresu);
			this.setVariablesObjetoActualToFormularioForeignKeyPartidaPresu(this.partidapresu);
		}
				
		//this.setDefaultControlesPartidaPresu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPartidaPresu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPartidaPresu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPartidaPresu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPartidaPresu(this.partidapresuBean,this.partidapresu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PartidaPresuConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.partidapresuSessionBean.getConGuardarRelaciones()) {
			classes=PartidaPresuConstantesFunciones.getClassesRelationshipsOfPartidaPresu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.partidapresuReturnGeneral=partidapresuLogic.procesarEventosPartidaPresusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.partidapresuLogic.getPartidaPresus(),this.partidapresu,this.partidapresuParameterGeneral,this.isEsNuevoPartidaPresu,classes);//this.partidapresuLogic.getPartidaPresu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPartidaPresu(this.partidapresuReturnGeneral,this.partidapresuBean,false);
		
		if(this.partidapresuReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPartidaPresu(this.partidapresuReturnGeneral.getPartidaPresu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPartidaPresu(this.partidapresuReturnGeneral.getPartidaPresu());
		}
		
		if(this.partidapresuReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPartidaPresu(this.partidapresuReturnGeneral.getPartidaPresu(),classes);//this.partidapresuBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPartidaPresu(this.partidapresu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPartidaPresu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPartidaPresu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PartidaPresuBeanSwingJInternalFrameAdditional.RecargarFormPartidaPresu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPartidaPresu(false);
						
			if(partidapresuSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado() && DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleActivoFijoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPartidaPresu();
			}
			
			this.actualizarVisualTableDatosPartidaPresu();
			
			this.jTableDatosPartidaPresu.setRowSelectionInterval(this.getIndiceNuevoPartidaPresu(), this.getIndiceNuevoPartidaPresu());
			
			this.seleccionarFilaTablaPartidaPresuActual();
						
			this.actualizarEstadoCeldasBotonesPartidaPresu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPartidaPresu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPartidaPresu.jTextFieldcodigoPartidaPresu.setEnabled(isHabilitar && this.partidapresuConstantesFunciones.activarcodigoPartidaPresu);
		this.jInternalFrameDetalleFormPartidaPresu.jTextAreanombrePartidaPresu.setEnabled(isHabilitar && this.partidapresuConstantesFunciones.activarnombrePartidaPresu);	
		//
		this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.setEnabled(isHabilitar && this.partidapresuConstantesFunciones.activarid_empresaPartidaPresu);
	};
	
	public void setDefaultControlesPartidaPresu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPartidaPresu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.partidapresuSessionBean.setConGuardarRelaciones(true);			
			this.partidapresuSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPartidaPresu.jTabbedPaneRelacionesPartidaPresu.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.partidapresuSessionBean.setConGuardarRelaciones(false);			
			this.partidapresuSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPartidaPresu.jTabbedPaneRelacionesPartidaPresu.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPartidaPresu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PartidaPresu partidapresuAux:this.partidapresuLogic.getPartidaPresus()) {
				if(partidapresuAux.getId().equals(this.iIdNuevoPartidaPresu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PartidaPresu partidapresuAux:this.partidapresus) {
				if(partidapresuAux.getId().equals(this.iIdNuevoPartidaPresu)) {
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
	
	public int getIndiceActualPartidaPresu(PartidaPresu partidapresu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PartidaPresu partidapresuAux:this.partidapresuLogic.getPartidaPresus()) {
				if(partidapresuAux.getId().equals(partidapresu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PartidaPresu partidapresuAux:this.partidapresus) {
				if(partidapresuAux.getId().equals(partidapresu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPartidaPresu(PartidaPresu partidapresuOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PartidaPresu partidapresuAux:this.partidapresuLogic.getPartidaPresus()) {
				if(partidapresuAux.getPartidaPresuOriginal().getId().equals(partidapresuOriginal.getId())) {
					existe=true;
					partidapresuOriginal.setId(partidapresuAux.getId());
					partidapresuOriginal.setVersionRow(partidapresuAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PartidaPresu partidapresuAux:this.partidapresus) {
				if(partidapresuAux.getPartidaPresuOriginal().getId().equals(partidapresuOriginal.getId())) {
					existe=true;
					partidapresuOriginal.setId(partidapresuAux.getId());
					partidapresuOriginal.setVersionRow(partidapresuAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPartidaPresu(Boolean esParaCancelar) throws Exception {
		partidapresusAux=new ArrayList<PartidaPresu>();
		partidapresuAux=new PartidaPresu();
		
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PartidaPresu partidapresuAux:this.partidapresuLogic.getPartidaPresus()) {
					if(partidapresuAux.getId()<0) {
						partidapresusAux.add(partidapresuAux);
					}		
				}
				this.iIdNuevoPartidaPresu=0L;
				this.partidapresuLogic.getPartidaPresus().removeAll(partidapresusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PartidaPresu partidapresuAux:this.partidapresus) {
					if(partidapresuAux.getId()<0) {
						partidapresusAux.add(partidapresuAux);
					}		
				}
				this.iIdNuevoPartidaPresu=0L;
				this.partidapresus.removeAll(partidapresusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPartidaPresu 
					&& this.partidapresuLogic.getPartidaPresus().size()>0
					) {
					partidapresuAux=this.partidapresuLogic.getPartidaPresus().get(this.partidapresuLogic.getPartidaPresus().size() - 1);
				
					if(partidapresuAux.getId()<0) {
						this.partidapresuLogic.getPartidaPresus().remove(partidapresuAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPartidaPresu && this.partidapresus.size()>0) {
					partidapresuAux=this.partidapresus.get(this.partidapresus.size() - 1);
				
					if(partidapresuAux.getId()<0) {
						this.partidapresus.remove(partidapresuAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPartidaPresu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(partidapresu.getId()<0) {
				this.partidapresuLogic.getPartidaPresus().remove(this.partidapresu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(partidapresu.getId()<0) {
				this.partidapresus.remove(this.partidapresu);
			}
		}			
	}
	
	public void setEstadosInicialesPartidaPresu(List<PartidaPresu> partidapresusAux) throws Exception {
		PartidaPresuConstantesFunciones.setEstadosInicialesPartidaPresu(partidapresusAux);
	}
	
	public void setEstadosInicialesPartidaPresu(PartidaPresu partidapresuAux) throws Exception {
		PartidaPresuConstantesFunciones.setEstadosInicialesPartidaPresu(partidapresuAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPartidaPresuActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPartidaPresu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPartidaPresuActual()) {
				if(!this.isEsNuevoPartidaPresu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPartidaPresu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPartidaPresu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPartidaPresuActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Partida Presupuestaria ?", "MANTENIMIENTO DE Partida Presupuestaria", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPartidaPresu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PartidaPresu partidapresu) throws Exception {
		PartidaPresuConstantesFunciones.seleccionarAsignar(this.partidapresu,partidapresu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPartidaPresu=this.isPermisoActualizarOriginalPartidaPresu;
			
			
			this.seleccionarAsignar(partidapresu);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PartidaPresuConstantesFunciones.quitarEspaciosPartidaPresu(this.partidapresu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPartidaPresu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.partidapresuSessionBean.setsFuncionBusquedaRapida(this.partidapresuSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPartidaPresu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPartidaPresu(esParaCancelar);				
				this.cancelarNuevoPartidaPresu(esParaCancelar);								
			}
			
			this.partidapresu=new PartidaPresu();
			
			this.inicializarPartidaPresu();
			
			this.actualizarEstadoCeldasBotonesPartidaPresu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPartidaPresu() throws Exception {
		try {
			PartidaPresuConstantesFunciones.inicializarPartidaPresu(this.partidapresu);
			
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
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.partidapresuLogic.getPartidaPresus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePartidaPresus(String sAccionBusqueda,List<PartidaPresu> partidapresusParaReportes) throws Exception {
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
					sPathReporteFinal="PartidaPresu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PartidaPresuMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PartidaPresuMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PartidaPresu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Partida Presupuestarias");		
		parameters.put("busquedapor", PartidaPresuConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					PartidaPresuLogic partidapresuLogicAuxiliar=new PartidaPresuLogic();
					partidapresuLogicAuxiliar.setDatosCliente(partidapresuLogic.getDatosCliente());				
					partidapresuLogicAuxiliar.setPartidaPresus(partidapresusParaReportes);
					
					partidapresuLogicAuxiliar.cargarRelacionesLoteForeignKeyPartidaPresuWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					partidapresusParaReportes=partidapresuLogicAuxiliar.getPartidaPresus();
					
					//partidapresuLogic.getNewConnexionToDeep();
					
					//for (PartidaPresu partidapresu:partidapresusParaReportes) {
					//	partidapresuLogic.deepLoad(partidapresu, false, DeepLoadType.INCLUDE, classes);
					//}						
					//partidapresuLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//partidapresuLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePartidaPresu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PartidaPresuConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PartidaPresuConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePartidaPresu=new JRBeanArrayDataSource(PartidaPresuJInternalFrame.TraerPartidaPresuBeans(partidapresusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePartidaPresu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PartidaPresuConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PartidaPresuConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PartidaPresuBean.TraerPartidaPresuBeans(partidapresusParaReportes).toArray()));
							
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
				this.generarExcelReportePartidaPresus(sAccionBusqueda,sTipoArchivoReporte,partidapresusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPartidaPresus(sAccionBusqueda,sTipoArchivoReporte,partidapresusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPartidaPresuActionPerformed(null);
					//this.generarExcelReportePartidaPresus(sAccionBusqueda,sTipoArchivoReporte,partidapresusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPartidaPresus(sAccionBusqueda,sTipoArchivoReporte,partidapresusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPartidaPresus(sAccionBusqueda,sTipoArchivoReporte,partidapresusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPartidaPresus(sAccionBusqueda,sTipoArchivoReporte,partidapresusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePartidaPresus(String sAccionBusqueda,String sTipoArchivoReporte,List<PartidaPresu> partidapresusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"partidapresu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PartidaPresus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPartidaPresu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PartidaPresu partidapresu : partidapresusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PartidaPresuConstantesFunciones.generarExcelReporteDataPartidaPresu("NORMAL",row,workbook,partidapresu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Partida Presupuestaria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPartidaPresu(String sTipo,Row row,Workbook workbook) {
		
		PartidaPresuConstantesFunciones.generarExcelReporteHeaderPartidaPresu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPartidaPresus(String sAccionBusqueda,String sTipoArchivoReporte,List<PartidaPresu> partidapresusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"partidapresu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PartidaPresus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PartidaPresu partidapresu : partidapresusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PartidaPresuConstantesFunciones.getPartidaPresuDescripcion(partidapresu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PartidaPresuConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PartidaPresuConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(partidapresu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PartidaPresuConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PartidaPresuConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(partidapresu.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PartidaPresuConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PartidaPresuConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(partidapresu.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Partida Presupuestaria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPartidaPresus(String sAccionBusqueda,String sTipoArchivoReporte,List<PartidaPresu> partidapresusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PartidaPresu> partidapresusRespaldo=null;
		
		classes=PartidaPresuConstantesFunciones.getClassesRelationshipsOfPartidaPresu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.partidapresuLogic.setDatosCliente(this.datosCliente);
		this.partidapresuLogic.setDatosDeep(this.datosDeep);
		this.partidapresuLogic.setIsConDeep(true);
		
		partidapresusRespaldo=this.partidapresuLogic.getPartidaPresus();
		
		this.partidapresuLogic.setPartidaPresus(partidapresusParaReportes);	
		this.partidapresuLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		partidapresusParaReportes=this.partidapresuLogic.getPartidaPresus();
		this.partidapresuLogic.setPartidaPresus(partidapresusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"partidapresu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PartidaPresus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPartidaPresu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PartidaPresu partidapresu : partidapresusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPartidaPresu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PartidaPresuConstantesFunciones.generarExcelReporteDataPartidaPresu("NORMAL",row,workbook,partidapresu,cellStyleDataAux);
		
			
			


				//DetalleActivoFijo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO))) {

				if(partidapresu.getDetalleActivoFijos()!=null && partidapresu.getDetalleActivoFijos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleActivoFijoConstantesFunciones.generarExcelReporteHeaderDetalleActivoFijo("RELACIONADO",row,workbook);
				}

				if(partidapresu.getDetalleActivoFijos()!=null) {
					i2=0;
					for(DetalleActivoFijo detalleactivofijo : partidapresu.getDetalleActivoFijos()) {
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
		cell.setCellValue(PartidaPresuConstantesFunciones.getPartidaPresuDescripcion(partidapresu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Partida Presupuestaria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPartidaPresu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPartidaPresu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPartidaPresu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPartidaPresu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPartidaPresu() throws Exception {		
		this.startProcessPartidaPresu(true);
	}
	
	public void startProcessPartidaPresu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPartidaPresu ,this.jPanelParametrosReportesPartidaPresu, this.jScrollPanelDatosPartidaPresu,this.jPanelPaginacionPartidaPresu, this.jScrollPanelDatosEdicionPartidaPresu, this.jPanelAccionesPartidaPresu,this.jPanelAccionesFormularioPartidaPresu,this.jmenuBarPartidaPresu,this.jmenuBarDetallePartidaPresu,this.jTtoolBarPartidaPresu,this.jTtoolBarDetallePartidaPresu);		
		
		final JTabbedPane jTabbedPaneBusquedasPartidaPresu=this.jTabbedPaneBusquedasPartidaPresu; 
		
		final JPanel jPanelParametrosReportesPartidaPresu=this.jPanelParametrosReportesPartidaPresu;
		//final JScrollPane jScrollPanelDatosPartidaPresu=this.jScrollPanelDatosPartidaPresu;
		final JTable jTableDatosPartidaPresu=this.jTableDatosPartidaPresu;		
		final JPanel jPanelPaginacionPartidaPresu=this.jPanelPaginacionPartidaPresu;
		//final JScrollPane jScrollPanelDatosEdicionPartidaPresu=this.jScrollPanelDatosEdicionPartidaPresu;
		final JPanel jPanelAccionesPartidaPresu=this.jPanelAccionesPartidaPresu;
		
		JPanel jPanelCamposAuxiliarPartidaPresu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPartidaPresu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
			jPanelCamposAuxiliarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jPanelCamposPartidaPresu;
			jPanelAccionesFormularioAuxiliarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jPanelAccionesFormularioPartidaPresu;
		}
		
		final JPanel jPanelCamposPartidaPresu=jPanelCamposAuxiliarPartidaPresu;
		final JPanel jPanelAccionesFormularioPartidaPresu=jPanelAccionesFormularioAuxiliarPartidaPresu;
		
		
		final JMenuBar jmenuBarPartidaPresu=this.jmenuBarPartidaPresu;
		final JToolBar jTtoolBarPartidaPresu=this.jTtoolBarPartidaPresu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPartidaPresu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPartidaPresu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
			jmenuBarDetalleAuxiliarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jmenuBarDetallePartidaPresu;
			jTtoolBarDetalleAuxiliarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jTtoolBarDetallePartidaPresu;
		}
		
		final JMenuBar jmenuBarDetallePartidaPresu=jmenuBarDetalleAuxiliarPartidaPresu;
		final JToolBar jTtoolBarDetallePartidaPresu=jTtoolBarDetalleAuxiliarPartidaPresu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPartidaPresu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPartidaPresu;
			processRunnable.jTableDatos=jTableDatosPartidaPresu;
			processRunnable.jPanelCampos=jPanelCamposPartidaPresu;
			processRunnable.jPanelPaginacion=jPanelPaginacionPartidaPresu;
			processRunnable.jPanelAcciones=jPanelAccionesPartidaPresu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPartidaPresu;
			
			
			processRunnable.jmenuBar=jmenuBarPartidaPresu;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePartidaPresu;
			processRunnable.jTtoolBar=jTtoolBarPartidaPresu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePartidaPresu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPartidaPresu ,jPanelParametrosReportesPartidaPresu,jTableDatosPartidaPresu, /*jScrollPanelDatosPartidaPresu,*/jPanelCamposPartidaPresu,jPanelPaginacionPartidaPresu, /*jScrollPanelDatosEdicionPartidaPresu,*/ jPanelAccionesPartidaPresu,jPanelAccionesFormularioPartidaPresu,jmenuBarPartidaPresu,jmenuBarDetallePartidaPresu,jTtoolBarPartidaPresu,jTtoolBarDetallePartidaPresu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPartidaPresu ,jPanelParametrosReportesPartidaPresu, jScrollPanelDatosPartidaPresu,jPanelPaginacionPartidaPresu, jScrollPanelDatosEdicionPartidaPresu, jPanelAccionesPartidaPresu,jPanelAccionesFormularioPartidaPresu,jmenuBarPartidaPresu,jmenuBarDetallePartidaPresu,jTtoolBarPartidaPresu,jTtoolBarDetallePartidaPresu);
						
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
	
	public void finishProcessPartidaPresu() {// throws Exception 
		this.finishProcessPartidaPresu(true);
	}
	
	public void finishProcessPartidaPresu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPartidaPresu ,this.jPanelParametrosReportesPartidaPresu, this.jScrollPanelDatosPartidaPresu,this.jPanelPaginacionPartidaPresu, this.jScrollPanelDatosEdicionPartidaPresu, this.jPanelAccionesPartidaPresu,this.jPanelAccionesFormularioPartidaPresu,this.jmenuBarPartidaPresu,this.jmenuBarDetallePartidaPresu,this.jTtoolBarPartidaPresu,this.jTtoolBarDetallePartidaPresu);		
		
		final JTabbedPane jTabbedPaneBusquedasPartidaPresu=this.jTabbedPaneBusquedasPartidaPresu; 
		
		final JPanel jPanelParametrosReportesPartidaPresu=this.jPanelParametrosReportesPartidaPresu;
		//final JScrollPane jScrollPanelDatosPartidaPresu=this.jScrollPanelDatosPartidaPresu;
		final JTable jTableDatosPartidaPresu=this.jTableDatosPartidaPresu;		
		final JPanel jPanelPaginacionPartidaPresu=this.jPanelPaginacionPartidaPresu;
		//final JScrollPane jScrollPanelDatosEdicionPartidaPresu=this.jScrollPanelDatosEdicionPartidaPresu;
		final JPanel jPanelAccionesPartidaPresu=this.jPanelAccionesPartidaPresu;
		
		JPanel jPanelCamposAuxiliarPartidaPresu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPartidaPresu=new JPanel();
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
			jPanelCamposAuxiliarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jPanelCamposPartidaPresu;
			jPanelAccionesFormularioAuxiliarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jPanelAccionesFormularioPartidaPresu;
		}
		
		final JPanel jPanelCamposPartidaPresu=jPanelCamposAuxiliarPartidaPresu;
		final JPanel jPanelAccionesFormularioPartidaPresu=jPanelAccionesFormularioAuxiliarPartidaPresu;
		
		
		final JMenuBar jmenuBarPartidaPresu=this.jmenuBarPartidaPresu;		
		final JToolBar jTtoolBarPartidaPresu=this.jTtoolBarPartidaPresu;
				
		JMenuBar jmenuBarDetalleAuxiliarPartidaPresu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPartidaPresu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
			jmenuBarDetalleAuxiliarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jmenuBarDetallePartidaPresu;
			jTtoolBarDetalleAuxiliarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jTtoolBarDetallePartidaPresu;		
		}
		
		final JMenuBar jmenuBarDetallePartidaPresu=jmenuBarDetalleAuxiliarPartidaPresu;
		final JToolBar jTtoolBarDetallePartidaPresu=jTtoolBarDetalleAuxiliarPartidaPresu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPartidaPresu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPartidaPresu;
			processRunnable.jTableDatos=jTableDatosPartidaPresu;
			processRunnable.jPanelCampos=jPanelCamposPartidaPresu;
			processRunnable.jPanelPaginacion=jPanelPaginacionPartidaPresu;
			processRunnable.jPanelAcciones=jPanelAccionesPartidaPresu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPartidaPresu;
			
			
			processRunnable.jmenuBar=jmenuBarPartidaPresu;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePartidaPresu;
			processRunnable.jTtoolBar=jTtoolBarPartidaPresu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePartidaPresu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPartidaPresu ,jPanelParametrosReportesPartidaPresu, jTableDatosPartidaPresu,/*jScrollPanelDatosPartidaPresu,*/jPanelCamposPartidaPresu,jPanelPaginacionPartidaPresu, /*jScrollPanelDatosEdicionPartidaPresu,*/ jPanelAccionesPartidaPresu,jPanelAccionesFormularioPartidaPresu,jmenuBarPartidaPresu,jmenuBarDetallePartidaPresu,jTtoolBarPartidaPresu,jTtoolBarDetallePartidaPresu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPartidaPresu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPartidaPresu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPartidaPresu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPartidaPresu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPartidaPresu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePartidaPresu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPartidaPresu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPartidaPresu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePartidaPresu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.partidapresuConstantesFunciones.getsFinalQueryPartidaPresu();
		String  finalQueryPaginacionTodos=this.partidapresuConstantesFunciones.getsFinalQueryPartidaPresu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PartidaPresuConstantesFunciones.getArrayColumnasGlobalesNoPartidaPresu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PartidaPresuConstantesFunciones.getArrayColumnasGlobalesPartidaPresu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PartidaPresuConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.partidapresusEliminados= new ArrayList<PartidaPresu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPartidaPresu();
		
				///*PartidaPresuSessionBean*/this.partidapresuSessionBean=new PartidaPresuSessionBean();
			
			if(this.partidapresuSessionBean==null) {
				this.partidapresuSessionBean=new PartidaPresuSessionBean();
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
					this.iNumeroPaginacion=PartidaPresuConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PartidaPresuConstantesFunciones.getClassesForeignKeysOfPartidaPresu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/partidapresu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			partidapresusAux= new ArrayList<PartidaPresu>();
			
				
			partidapresuLogic.setDatosCliente(this.datosCliente);
			partidapresuLogic.setDatosDeep(this.datosDeep);
			partidapresuLogic.setIsConDeep(true);
			
			
			partidapresuLogic.getPartidaPresuDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					partidapresuLogic.getTodosPartidaPresus(finalQueryGlobal,pagination);
					
					//partidapresuLogic.getTodosPartidaPresusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(partidapresuLogic.getPartidaPresus()==null|| partidapresuLogic.getPartidaPresus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							partidapresusAux= new ArrayList<PartidaPresu>();
							partidapresusAux.addAll(partidapresuLogic.getPartidaPresus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							partidapresusAux= new ArrayList<PartidaPresu>();
							partidapresusAux.addAll(partidapresus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							partidapresuLogic.getTodosPartidaPresus(finalQueryGlobal+"",this.pagination);												
							
							//partidapresuLogic.getTodosPartidaPresusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePartidaPresus("Todos",partidapresuLogic.getPartidaPresus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							partidapresuLogic.setPartidaPresus(new ArrayList<PartidaPresu>());					
							partidapresuLogic.getPartidaPresus().addAll(partidapresusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							partidapresus=new ArrayList<PartidaPresu>();
							partidapresus.addAll(partidapresusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPartidaPresu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPartidaPresu=this.idActual;
				
				} else if(this.idPartidaPresuActual!=null && this.idPartidaPresuActual!=0L) {
					idPartidaPresu=idPartidaPresuActual;
				}
				
					
				this.sDetalleReporte=PartidaPresuConstantesFunciones.getDetalleIndicePorId(idPartidaPresu);
				
				this.partidapresus=new ArrayList<PartidaPresu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					partidapresuLogic.getEntity(idPartidaPresu);
					
					//partidapresuLogic.getEntityWithConnection(idPartidaPresu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					partidapresuLogic.setPartidaPresus(new ArrayList<PartidaPresu>());
					partidapresuLogic.getPartidaPresus().add(partidapresuLogic.getPartidaPresu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.partidapresus=new ArrayList<PartidaPresu>();
					this.partidapresus.add(partidapresu);
				}
				
				if(partidapresuLogic.getPartidaPresu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PartidaPresuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					partidapresuLogic.getPartidaPresusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PartidaPresuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PartidaPresuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=partidapresuLogic.getPartidaPresus()==null||partidapresuLogic.getPartidaPresus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=partidapresus==null|| partidapresus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						partidapresusAux=new ArrayList<PartidaPresu>();
						partidapresusAux.addAll(partidapresuLogic.getPartidaPresus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							partidapresusAux=new ArrayList<PartidaPresu>();
							partidapresusAux.addAll(partidapresus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							partidapresuLogic.getPartidaPresusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PartidaPresuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PartidaPresuConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePartidaPresus("FK_IdEmpresa",partidapresuLogic.getPartidaPresus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePartidaPresus("FK_IdEmpresa",partidapresus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						partidapresuLogic.setPartidaPresus(new ArrayList<PartidaPresu>());
						partidapresuLogic.getPartidaPresus().addAll(partidapresusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							partidapresus=new ArrayList<PartidaPresu>();
							partidapresus.addAll(partidapresusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPartidaPresu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPartidaPresu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=partidapresuLogic.getPartidaPresus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=partidapresus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=partidapresuLogic.getPartidaPresus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=partidapresus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PartidaPresu partidapresu) {
		Boolean permite=true;
		
		if(this.partidapresu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PartidaPresuConstantesFunciones.getOrderByListaPartidaPresu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PartidaPresuConstantesFunciones.getOrderByListaPartidaPresu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PartidaPresu partidapresu:partidapresuLogic.getPartidaPresus()) {
				if(partidapresu.getsType().equals(Constantes2.S_TOTALES)) {
					partidapresuTotales=partidapresu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PartidaPresu partidapresu:this.partidapresus) {
				if(partidapresu.getsType().equals(Constantes2.S_TOTALES)) {
					partidapresuTotales=partidapresu;
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
			this.partidapresuAux=new PartidaPresu();
			this.partidapresuAux.setsType(Constantes2.S_TOTALES);
			this.partidapresuAux.setIsNew(false);
			this.partidapresuAux.setIsChanged(false);
			this.partidapresuAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PartidaPresuConstantesFunciones.TotalizarValoresFilaPartidaPresu(this.partidapresuLogic.getPartidaPresus(),this.partidapresuAux);
				
				this.partidapresuLogic.getPartidaPresus().add(this.partidapresuAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PartidaPresuConstantesFunciones.TotalizarValoresFilaPartidaPresu(this.partidapresus,this.partidapresuAux);
				
				this.partidapresus.add(this.partidapresuAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		partidapresuTotales=new PartidaPresu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.partidapresuLogic.getPartidaPresus().remove(partidapresuTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.partidapresus.remove(partidapresuTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		partidapresuTotales=new PartidaPresu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PartidaPresu partidapresu:partidapresuLogic.getPartidaPresus()) {
				if(partidapresu.getsType().equals(Constantes2.S_TOTALES)) {
					partidapresuTotales=partidapresu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PartidaPresuConstantesFunciones.TotalizarValoresFilaPartidaPresu(this.partidapresuLogic.getPartidaPresus(),partidapresuTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PartidaPresu partidapresu:this.partidapresus) {
				if(partidapresu.getsType().equals(Constantes2.S_TOTALES)) {
					partidapresuTotales=partidapresu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PartidaPresuConstantesFunciones.TotalizarValoresFilaPartidaPresu(this.partidapresus,partidapresuTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPartidaPresusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPartidaPresusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					partidapresuLogic.getPartidaPresusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosPartidaPresu() {
		this.isPermisoTodoPartidaPresu=false;
		this.isPermisoNuevoPartidaPresu=false;
		this.isPermisoActualizarPartidaPresu=false;
		this.isPermisoActualizarOriginalPartidaPresu=false;
		this.isPermisoEliminarPartidaPresu=false;
		this.isPermisoGuardarCambiosPartidaPresu=false;
		this.isPermisoConsultaPartidaPresu=false;
		this.isPermisoBusquedaPartidaPresu=false;
		this.isPermisoReportePartidaPresu=false;		
		this.isPermisoOrdenPartidaPresu=false;		
		this.isPermisoPaginacionMedioPartidaPresu=false;		
		this.isPermisoPaginacionAltoPartidaPresu=false;
		this.isPermisoPaginacionTodoPartidaPresu=false;
		this.isPermisoCopiarPartidaPresu=false;		
		this.isPermisoVerFormPartidaPresu=false;		
		this.isPermisoDuplicarPartidaPresu=false;		
		this.isPermisoOrdenPartidaPresu=false;		
	}
	
	public void setPermisosUsuarioPartidaPresu(Boolean isPermiso) {
		this.isPermisoTodoPartidaPresu=isPermiso;
		this.isPermisoNuevoPartidaPresu=isPermiso;
		this.isPermisoActualizarPartidaPresu=isPermiso;
		this.isPermisoActualizarOriginalPartidaPresu=isPermiso;
		this.isPermisoEliminarPartidaPresu=isPermiso;
		this.isPermisoGuardarCambiosPartidaPresu=isPermiso;
		this.isPermisoConsultaPartidaPresu=isPermiso;
		this.isPermisoBusquedaPartidaPresu=isPermiso;
		this.isPermisoReportePartidaPresu=isPermiso;
		this.isPermisoOrdenPartidaPresu=isPermiso;		
		this.isPermisoPaginacionMedioPartidaPresu=isPermiso;		
		this.isPermisoPaginacionAltoPartidaPresu=isPermiso;		
		this.isPermisoPaginacionTodoPartidaPresu=isPermiso;		
		this.isPermisoCopiarPartidaPresu=isPermiso;		
		this.isPermisoVerFormPartidaPresu=isPermiso;		
		this.isPermisoDuplicarPartidaPresu=isPermiso;
		this.isPermisoOrdenPartidaPresu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPartidaPresu(Boolean isPermiso) {
		//this.isPermisoTodoPartidaPresu=isPermiso;
		this.isPermisoNuevoPartidaPresu=isPermiso;
		this.isPermisoActualizarPartidaPresu=isPermiso;
		this.isPermisoActualizarOriginalPartidaPresu=isPermiso;
		this.isPermisoEliminarPartidaPresu=isPermiso;
		this.isPermisoGuardarCambiosPartidaPresu=isPermiso;
		//this.isPermisoConsultaPartidaPresu=isPermiso;
		//this.isPermisoBusquedaPartidaPresu=isPermiso;
		//this.isPermisoReportePartidaPresu=isPermiso;
		//this.isPermisoOrdenPartidaPresu=isPermiso;		
		//this.isPermisoPaginacionMedioPartidaPresu=isPermiso;		
		//this.isPermisoPaginacionAltoPartidaPresu=isPermiso;		
		//this.isPermisoPaginacionTodoPartidaPresu=isPermiso;		
		//this.isPermisoCopiarPartidaPresu=isPermiso;		
		//this.isPermisoDuplicarPartidaPresu=isPermiso;
		//this.isPermisoOrdenPartidaPresu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPartidaPresuClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
		
		if(PartidaPresuJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosDetalleActivoFijo=this.verificarGetPermisosUsuarioOpcionPartidaPresuClaseRelacionada(this.opcionsRelacionadas,DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPartidaPresu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPartidaPresuClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleActivoFijo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPartidaPresuClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPartidaPresuClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPartidaPresuClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleActivoFijo && this.jInternalFrameDetalleFormPartidaPresu!=null && this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPartidaPresu.jTabbedPaneRelacionesPartidaPresu.remove(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPartidaPresu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PartidaPresuJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.partidapresuSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PartidaPresuConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPartidaPresu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPartidaPresu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPartidaPresu=this.isPermisoActualizarPartidaPresu;
			this.isPermisoEliminarPartidaPresu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPartidaPresu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPartidaPresu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPartidaPresu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPartidaPresu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePartidaPresu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPartidaPresu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPartidaPresu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPartidaPresu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPartidaPresu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPartidaPresu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPartidaPresu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPartidaPresu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPartidaPresu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.partidapresuSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPartidaPresu.setToolTipText(this.jTableDatosPartidaPresu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPartidaPresu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPartidaPresu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PartidaPresuJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PartidaPresuJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPartidaPresu() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleActivoFijo && this.partidapresuConstantesFunciones.mostrarDetalleActivoFijoPartidaPresu && !PartidaPresuConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyPartidaPresuListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPartidaPresuListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PartidaPresuJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPartidaPresuListas(false);
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
	
	public void cargarCombosLoteForeignKeyPartidaPresuListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PartidaPresuParameterReturnGeneral partidapresuReturnGeneral=new PartidaPresuParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.partidapresuConstantesFunciones.cargarid_empresaPartidaPresu)
					 || (this.esRecargarFks && this.partidapresuConstantesFunciones.cargarid_empresaPartidaPresu)) {

					if(!this.partidapresuSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+partidapresuSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				partidapresuReturnGeneral=partidapresuLogic.cargarCombosLoteForeignKeyPartidaPresu(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=partidapresuReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPartidaPresu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.partidapresuSessionBean==null) {
				this.partidapresuSessionBean=new PartidaPresuSessionBean();
			}

			if(!this.partidapresuSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyPartidaPresu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPartidaPresu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPartidaPresu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPartidaPresu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPartidaPresu(PartidaPresu partidapresu)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPartidaPresu(PartidaPresu partidapresu,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPartidaPresu()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPartidaPresu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPartidaPresu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPartidaPresu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPartidaPresu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPartidaPresu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPartidaPresu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPartidaPresu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu!=null && this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public PartidaPresuBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PartidaPresuBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PartidaPresuBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.partidapresuSessionBean=new PartidaPresuSessionBean(); 
		this.partidapresuConstantesFunciones=new PartidaPresuConstantesFunciones(); 
		this.partidapresuBean=new PartidaPresu();//(this.partidapresuConstantesFunciones); 		
		this.partidapresuReturnGeneral=new PartidaPresuParameterReturnGeneral(); 
		
		this.partidapresuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.partidapresuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PartidaPresuBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PartidaPresuBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PartidaPresuBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPartidaPresu(true);
			
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
			
			this.partidapresuConstantesFunciones=new PartidaPresuConstantesFunciones(); 
			this.partidapresuBean=new PartidaPresu();//this.partidapresuConstantesFunciones); 			
			this.partidapresuReturnGeneral=new PartidaPresuParameterReturnGeneral(); 
		
			PartidaPresuBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Partida Presupuestaria Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.partidapresu=new PartidaPresu();
			this.partidapresus = new ArrayList<PartidaPresu>();
			this.partidapresusAux = new ArrayList<PartidaPresu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic=new PartidaPresuLogic();
				this.partidapresuLogic.getNewConnexionToDeep("");
			}
			
			//this.partidapresuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.partidapresuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPartidaPresu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPartidaPresu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPartidaPresu);	
					}
					
					if(this.jInternalFrameImportacionPartidaPresu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPartidaPresu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPartidaPresu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPartidaPresu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPartidaPresu);
				this.jInternalFrameDetalleFormPartidaPresu.setVisible(false);
				this.jInternalFrameDetalleFormPartidaPresu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPartidaPresu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPartidaPresu);
					this.jInternalFrameReporteDinamicoPartidaPresu.setVisible(false);
					this.jInternalFrameReporteDinamicoPartidaPresu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPartidaPresu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPartidaPresu);
					this.jInternalFrameImportacionPartidaPresu.setVisible(false);
					this.jInternalFrameImportacionPartidaPresu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPartidaPresu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPartidaPresu);
					this.jInternalFrameOrderByPartidaPresu.setVisible(false);
					this.jInternalFrameOrderByPartidaPresu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPartidaPresuActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PartidaPresuConstantesFunciones.INUMEROPAGINACION;
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
			
			this.partidapresuReturnGeneral=new PartidaPresuParameterReturnGeneral();
			
			this.partidapresuParameterGeneral=new PartidaPresuParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.partidapresuLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PartidaPresuJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.partidapresuSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PartidaPresuConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.partidapresuSessionBean.getEsGuardarRelacionado(),this.partidapresuSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PartidaPresuConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.partidapresuSessionBean.getEsGuardarRelacionado(),this.partidapresuSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPartidaPresu=false;
			this.isVisibilidadCeldaDuplicarPartidaPresu=true;
			this.isVisibilidadCeldaCopiarPartidaPresu=true;
			this.isVisibilidadCeldaVerFormPartidaPresu=true;
			this.isVisibilidadCeldaOrdenPartidaPresu=true;
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=false;
			this.isVisibilidadCeldaModificarPartidaPresu=false;
			this.isVisibilidadCeldaActualizarPartidaPresu=false;
			this.isVisibilidadCeldaEliminarPartidaPresu=false;
			this.isVisibilidadCeldaCancelarPartidaPresu=false;
			this.isVisibilidadCeldaGuardarPartidaPresu=false;
			this.isVisibilidadCeldaGuardarCambiosPartidaPresu=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPartidaPresu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPartidaPresu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPartidaPresu(false);
			
			this.setPermisosUsuarioPartidaPresu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.partidapresuSessionBean.getEsGuardarRelacionado() 
				|| (this.partidapresuSessionBean.getEsGuardarRelacionado() && this.partidapresuSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPartidaPresuClasesRelacionadas();
			}
			
			if(this.partidapresuSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPartidaPresuClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPartidaPresu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPartidaPresu();
			}
			
			if(!this.isPermisoBusquedaPartidaPresu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPartidaPresu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPartidaPresu,this.isPermisoPaginacionMedioPartidaPresu,this.isPermisoPaginacionTodoPartidaPresu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PartidaPresuConstantesFunciones.getTiposSeleccionarPartidaPresu());
				
				this.tiposColumnasSelect=PartidaPresuConstantesFunciones.getTiposSeleccionarPartidaPresu(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPartidaPresu();				
				//this.tiposRelacionesSelect=PartidaPresuConstantesFunciones.getTiposRelacionesPartidaPresu(true);
				
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
			//if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPartidaPresu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPartidaPresu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPartidaPresu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPartidaPresu() ;
			
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
				partidapresuImplementable= (PartidaPresuImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PartidaPresuConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				partidapresuImplementableHome= (PartidaPresuImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PartidaPresuConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.partidapresus= new ArrayList<PartidaPresu>();
			this.partidapresusEliminados= new ArrayList<PartidaPresu>();
						
			this.isEsNuevoPartidaPresu=false;
			this.esParaAccionDesdeFormularioPartidaPresu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPartidaPresu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPartidaPresu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PartidaPresuBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PartidaPresuConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPartidaPresu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPartidaPresu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPartidaPresu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPartidaPresu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPartidaPresu();
			}
			
			PartidaPresuBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPartidaPresu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPartidaPresu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPartidaPresu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPartidaPresu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PartidaPresu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPartidaPresu() {
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
			if(sTipo.equals("RelacionesPartidaPresu")) {
				iIndex=this.jInternalFrameDetalleFormPartidaPresu.jTabbedPaneRelacionesPartidaPresu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPartidaPresu.jTabbedPaneRelacionesPartidaPresu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Activo Fijos")) {
					if(!DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPartidaPresu();

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
				this.finishProcessPartidaPresu();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleActivoFijo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPartidaPresu.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(false,true,iIndex);
		this.jButtonDetalleActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleActivoFijo();

		//this.jTabbedPaneRelacionesPartidaPresu.updateUI();
		//this.jTabbedPaneRelacionesPartidaPresu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPartidaPresu.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleActivoFijo")) {
				int row=this.jTableDatosPartidaPresu.getSelectedRow();
				jButtonDetalleActivoFijoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Activo Fijo")) {

					if(this.isTienePermisosDetalleActivoFijo && this.partidapresuConstantesFunciones.mostrarDetalleActivoFijoPartidaPresu && !PartidaPresuConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Activo Fijos"+"("+DetalleActivoFijoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Activo Fijos");

						if(partidapresuConstantesFunciones.resaltarDetalleActivoFijoPartidaPresu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(partidapresuConstantesFunciones.resaltarDetalleActivoFijoPartidaPresu);
						}

						jmenuItem.setEnabled(this.partidapresuConstantesFunciones.activarDetalleActivoFijoPartidaPresu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleActivoFijo"));

						

						this.jInternalFrameDetalleFormPartidaPresu.jmenuDetallePartidaPresu.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPartidaPresu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPartidaPresu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPartidaPresu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPartidaPresuListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPartidaPresu();
		
		this.cargarCombosFrameForeignKeyPartidaPresu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPartidaPresu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPartidaPresu();
		}
	}
	
	
	
	public void jButtonNuevoPartidaPresuActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.partidapresuSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPartidaPresu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			
			
			if(jTableDatosPartidaPresu.getRowCount()>=1) {
				jTableDatosPartidaPresu.removeRowSelectionInterval(0, jTableDatosPartidaPresu.getRowCount()-1);						
			}
			
			this.isEsNuevoPartidaPresu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPartidaPresu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPartidaPresu(true);			
			//this.partidapresu=new PartidaPresu();
			//this.partidapresu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPartidaPresu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPartidaPresu() ;
			
			if(PartidaPresuJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePartidaPresu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.partidapresu);	
			this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);				
			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			
			if(this.partidapresuSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PartidaPresu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPartidaPresuActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPartidaPresu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPartidaPresu.getSelectedRows().length;			
			}
			
			partidapresusSeleccionados=this.getPartidaPresusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPartidaPresu--;			
				//PartidaPresu partidapresuAux= new PartidaPresu();			
				//partidapresuAux.setId(this.iIdNuevoPartidaPresu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PartidaPresu partidapresuOrigen=new PartidaPresu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PartidaPresu partidapresuOrigen : partidapresusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							partidapresuOrigen =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							partidapresuOrigen =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPartidaPresu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.partidapresu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPartidaPresu(partidapresuOrigen,this.partidapresu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.partidapresuLogic.getPartidaPresus().add(this.partidapresuAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.partidapresus.add(this.partidapresuAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPartidaPresu(false);
				
				this.jTableDatosPartidaPresu.setRowSelectionInterval(this.getIndiceNuevoPartidaPresu(), this.getIndiceNuevoPartidaPresu());
				
				int iLastRow =  this.jTableDatosPartidaPresu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPartidaPresu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPartidaPresu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPartidaPresu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPartidaPresuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();									
		
			PartidaPresu partidapresuOrigen=new PartidaPresu();
			PartidaPresu partidapresuDestino=new PartidaPresu();
				
			partidapresusSeleccionados=this.getPartidaPresusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPartidaPresu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || partidapresusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPartidaPresu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						partidapresuOrigen =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						partidapresuOrigen =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						partidapresuDestino =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						partidapresuDestino =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				partidapresuOrigen =partidapresusSeleccionados.get(0);
				partidapresuDestino =partidapresusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPartidaPresu(partidapresuOrigen,partidapresuDestino,true,false);
				
				partidapresuDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(partidapresuDestino,partidapresuLogic.getPartidaPresus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(partidapresuDestino,partidapresus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPartidaPresu(false);
				
				//this.jTableDatosPartidaPresu.setRowSelectionInterval(this.getIndiceNuevoPartidaPresu(), this.getIndiceNuevoPartidaPresu());
				
				int iLastRow =  this.jTableDatosPartidaPresu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPartidaPresu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPartidaPresu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPartidaPresu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPartidaPresuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPartidaPresu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPartidaPresu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPartidaPresuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPartidaPresu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPartidaPresu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPartidaPresu.setVisible(!isVisible);
			this.jPanelPaginacionPartidaPresu.setVisible(!isVisible);
			this.jPanelAccionesPartidaPresu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPartidaPresuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePartidaPresu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPartidaPresuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPartidaPresu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPartidaPresuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPartidaPresu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPartidaPresuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPartidaPresu();
			
			this.abrirFrameOrderByPartidaPresu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPartidaPresuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPartidaPresu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePartidaPresu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPartidaPresu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPartidaPresu.isMaximum()) {
					this.jInternalFrameDetalleFormPartidaPresu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPartidaPresu.setSize(this.jInternalFrameDetalleFormPartidaPresu.iWidthFormulario,this.jInternalFrameDetalleFormPartidaPresu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPartidaPresu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPartidaPresu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPartidaPresu.isMaximum()) {
						this.jInternalFrameDetalleFormPartidaPresu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPartidaPresu.jContentPaneDetallePartidaPresu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPartidaPresu.jTabbedPaneRelacionesPartidaPresu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPartidaPresu.jContentPaneDetallePartidaPresu.getWidth(),PartidaPresuConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPartidaPresu.jTabbedPaneRelacionesPartidaPresu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPartidaPresu.jContentPaneDetallePartidaPresu.getWidth(),PartidaPresuConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPartidaPresu.jTabbedPaneRelacionesPartidaPresu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPartidaPresu.jContentPaneDetallePartidaPresu.getWidth(),PartidaPresuConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleActivoFijo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPartidaPresu.setVisible(true);
	        this.jInternalFrameDetalleFormPartidaPresu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPartidaPresu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPartidaPresu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPartidaPresu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPartidaPresu,false,this);
				} else {
					this.jInternalFrameOrderByPartidaPresu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPartidaPresu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPartidaPresu);
				this.jInternalFrameOrderByPartidaPresu.setVisible(false);
				this.jInternalFrameOrderByPartidaPresu.setSelected(false);
				
				this.jInternalFrameOrderByPartidaPresu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPartidaPresu"));
				
				this.inicializarActualizarBindingTablaOrderByPartidaPresu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPartidaPresu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPartidaPresu==null) {
				
				this.jInternalFrameImportacionPartidaPresu=new ImportacionJInternalFrame(PartidaPresuConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPartidaPresu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPartidaPresu);
				this.jInternalFrameImportacionPartidaPresu.setVisible(false);
				this.jInternalFrameImportacionPartidaPresu.setSelected(false);


				this.jInternalFrameImportacionPartidaPresu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPartidaPresu"));
				this.jInternalFrameImportacionPartidaPresu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPartidaPresu"));
				this.jInternalFrameImportacionPartidaPresu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPartidaPresu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPartidaPresu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPartidaPresu==null) {
				this.jInternalFrameReporteDinamicoPartidaPresu=new ReporteDinamicoJInternalFrame(PartidaPresuConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPartidaPresu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPartidaPresu);
				this.jInternalFrameReporteDinamicoPartidaPresu.setVisible(false);
				this.jInternalFrameReporteDinamicoPartidaPresu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPartidaPresu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPartidaPresu"));
				this.jInternalFrameReporteDinamicoPartidaPresu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPartidaPresu"));
				this.jInternalFrameReporteDinamicoPartidaPresu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPartidaPresu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPartidaPresu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleActivoFijo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPartidaPresu.jContentPaneDetallePartidaPresu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePartidaPresu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPartidaPresu);
			
	       	this.jInternalFrameDetalleFormPartidaPresu.setVisible(false);
	        this.jInternalFrameDetalleFormPartidaPresu.setSelected(false);
			
			//this.jInternalFrameDetalleFormPartidaPresu.dispose();
			//this.jInternalFrameDetalleFormPartidaPresu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPartidaPresu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPartidaPresu.setVisible(true);
	        this.jInternalFrameReporteDinamicoPartidaPresu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPartidaPresu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPartidaPresu.setVisible(true);
	        this.jInternalFrameImportacionPartidaPresu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPartidaPresu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPartidaPresu.setVisible(true);
	        this.jInternalFrameOrderByPartidaPresu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPartidaPresu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPartidaPresu.setVisible(false);
	        this.jInternalFrameOrderByPartidaPresu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPartidaPresu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPartidaPresu.setVisible(false);
	        this.jInternalFrameReporteDinamicoPartidaPresu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPartidaPresu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPartidaPresu.setVisible(false);
	        this.jInternalFrameImportacionPartidaPresu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPartidaPresuActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPartidaPresu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPartidaPresu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPartidaPresu(true);
			//this.isEsNuevoPartidaPresu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPartidaPresu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPartidaPresu(false) ;
			
			if(partidapresuSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado() && DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PartidaPresuJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePartidaPresu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPartidaPresu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPartidaPresuActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPartidaPresu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPartidaPresu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPartidaPresu(true);
			//this.isEsNuevoPartidaPresu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.partidapresu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPartidaPresu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPartidaPresu(false) ;
			
			if(PartidaPresuJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePartidaPresu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPartidaPresu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarPartidaPresuActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPartidaPresu(false);
			
			//if(!this.isEsNuevoPartidaPresu) {								
				int intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PartidaPresuJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPartidaPresu(this.partidapresu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
				
			}
			
			if(this.permiteMantenimiento(this.partidapresu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPartidaPresu=true;
					this.inicializarActualizarBindingTablaPartidaPresu(false);
					this.isEsNuevoPartidaPresu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPartidaPresu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPartidaPresu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPartidaPresu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPartidaPresu(false);
				
				this.habilitarDeshabilitarControlesPartidaPresu(false);
			
												
				
				if(PartidaPresuJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePartidaPresu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPartidaPresuActionPerformed(evt,partidapresuSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPartidaPresu(this.partidapresu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPartidaPresu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,partidapresuSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.partidapresu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PartidaPresu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PartidaPresu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPartidaPresuActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				this.partidapresu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				this.partidapresu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.partidapresu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PartidaPresuModel) this.jTableDatosPartidaPresu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPartidaPresu=true;
				this.inicializarActualizarBindingTablaPartidaPresu(false);
				this.isEsNuevoPartidaPresu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPartidaPresu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPartidaPresu(false);
				
				this.habilitarDeshabilitarControlesPartidaPresu(false);
				
				
				
				if(PartidaPresuJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePartidaPresu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPartidaPresuActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPartidaPresu.getRowCount()>=1) {
				jTableDatosPartidaPresu.removeRowSelectionInterval(0, jTableDatosPartidaPresu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPartidaPresu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPartidaPresu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPartidaPresu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPartidaPresu(false) ;
			
			this.isEsNuevoPartidaPresu=false;
			
			if(PartidaPresuJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePartidaPresu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPartidaPresuActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPartidaPresu(false);
				
				//SI ES MANUAL
				if(PartidaPresuJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPartidaPresu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPartidaPresuActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPartidaPresu--;			
			//PartidaPresu partidapresuAux= new PartidaPresu();			
			//partidapresuAux.setId(this.iIdNuevoPartidaPresu);
			
			if(this.jInternalFrameDetalleFormPartidaPresu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPartidaPresu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
			
			this.partidapresu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.partidapresuLogic.getPartidaPresus().add(this.partidapresuAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.partidapresus.add(this.partidapresuAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPartidaPresu(false);
			
			this.jTableDatosPartidaPresu.setRowSelectionInterval(this.getIndiceNuevoPartidaPresu(), this.getIndiceNuevoPartidaPresu());
			
			int iLastRow =  this.jTableDatosPartidaPresu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPartidaPresu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPartidaPresu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPartidaPresu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPartidaPresuActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPartidaPresu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPartidaPresu(false);
			
			//SI ES MANUAL
			if(PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPartidaPresu();
			}
			
			//this.abrirFrameTreePartidaPresu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPartidaPresuActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Partida PresupuestariaS ?", "MANTENIMIENTO DE Partida Presupuestaria", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPartidaPresu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPartidaPresu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.partidapresuReturnGeneral=partidapresuLogic.procesarImportacionPartidaPresusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.partidapresuParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPartidaPresuReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPartidaPresuActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPartidaPresu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPartidaPresu.setFileImportacion(this.jInternalFrameImportacionPartidaPresu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPartidaPresu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPartidaPresu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPartidaPresu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPartidaPresu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPartidaPresuActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();		

		partidapresusSeleccionados=this.getPartidaPresusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPartidaPresu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPartidaPresu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PartidaPresuBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PartidaPresuBaseDesign.jrxml";
			
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
			
			this.generarReportePartidaPresus("Todos",partidapresusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Partida Presupuestaria",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPartidaPresu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPartidaPresu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PartidaPresuConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PartidaPresuConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PartidaPresuConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoPartidaPresu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPartidaPresu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPartidaPresu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PartidaPresuConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PartidaPresuConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PartidaPresuConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPartidaPresu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PartidaPresuConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PartidaPresuConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PartidaPresuConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPartidaPresu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPartidaPresu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PartidaPresuConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PartidaPresuConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PartidaPresuConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoPartidaPresuActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();		
		
		partidapresusSeleccionados=this.getPartidaPresusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"partidapresu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PartidaPresus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPartidaPresu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPartidaPresu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PartidaPresuConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PartidaPresuConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PartidaPresu partidapresu:partidapresusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(partidapresu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PartidaPresuConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PartidaPresuConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(PartidaPresu partidapresu:partidapresusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(partidapresu.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PartidaPresuConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PartidaPresuConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(PartidaPresu partidapresu:partidapresusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(partidapresu.getnombre());
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
			//	this.getFilaCabeceraExportarExcelPartidaPresu(row);				
			//	iRow++;
			//}				
			
			//for(PartidaPresu partidapresuAux:partidapresusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPartidaPresu(partidapresuAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Partida Presupuestaria",JOptionPane.INFORMATION_MESSAGE);
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
				this.partidapresuLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPartidaPresu(false);
			
			//SI ES MANUAL
			if(PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPartidaPresu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPartidaPresuActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPartidaPresu(false);
			
			//SI ES MANUAL
			if(PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPartidaPresu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPartidaPresuActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPartidaPresu(false);
			
			//SI ES MANUAL
			if(PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPartidaPresu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPartidaPresu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPartidaPresu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPartidaPresu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPartidaPresu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPartidaPresu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPartidaPresu.setMinimumSize(dimensionMinimum);
		this.jTableDatosPartidaPresu.setMaximumSize(dimensionMaximum);
		this.jTableDatosPartidaPresu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPartidaPresu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPartidaPresu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPartidaPresu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPartidaPresu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPartidaPresu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPartidaPresu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPartidaPresu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPartidaPresu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PartidaPresuJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPartidaPresu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPartidaPresu();
		
		this.inicializarActualizarBindingBotonesManualPartidaPresu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPartidaPresu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPartidaPresu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPartidaPresu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPartidaPresu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPartidaPresu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPartidaPresu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePartidaPresu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPartidaPresu.jCheckBoxPostAccionNuevoPartidaPresu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPartidaPresu.jCheckBoxPostAccionSinCerrarPartidaPresu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPartidaPresu.jCheckBoxPostAccionSinMensajePartidaPresu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPartidaPresu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPartidaPresu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePartidaPresu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
				this.jInternalFrameDetalleFormPartidaPresu.jCheckBoxPostAccionNuevoPartidaPresu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPartidaPresu.jCheckBoxPostAccionSinCerrarPartidaPresu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPartidaPresu.jCheckBoxPostAccionSinMensajePartidaPresu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPartidaPresu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPartidaPresu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPartidaPresu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPartidaPresu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPartidaPresu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPartidaPresu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPartidaPresu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPartidaPresu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPartidaPresu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPartidaPresu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPartidaPresu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPartidaPresu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPartidaPresu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPartidaPresu(Boolean esInicializar) throws Exception {
		try	{	
			if(PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPartidaPresu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPartidaPresu() throws Exception {
		try	{
			if(PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPartidaPresu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePartidaPresu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPartidaPresu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPartidaPresu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPartidaPresu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPartidaPresu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPartidaPresu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPartidaPresu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPartidaPresu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPartidaPresu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPartidaPresu.addItem(reporte);
			}
			
			
			if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPartidaPresu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPartidaPresu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPartidaPresu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPartidaPresu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPartidaPresu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPartidaPresu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPartidaPresu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPartidaPresu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPartidaPresu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPartidaPresu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPartidaPresu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPartidaPresu!=null) {
				this.jInternalFrameReporteDinamicoPartidaPresu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPartidaPresu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPartidaPresu!=null) {
				this.jInternalFrameReporteDinamicoPartidaPresu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPartidaPresu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPartidaPresu!=null) {
				
				if(this.jInternalFrameReporteDinamicoPartidaPresu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPartidaPresu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPartidaPresu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPartidaPresu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPartidaPresu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPartidaPresu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPartidaPresu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPartidaPresu(Boolean esInicializar) throws Exception {				
		if(PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPartidaPresu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPartidaPresu() throws Exception {
		this.inicializarActualizarBindingTablaPartidaPresu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPartidaPresu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PartidaPresuPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PartidaPresuPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPartidaPresuOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPartidaPresuOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PartidaPresuPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PartidaPresuPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPartidaPresu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=partidapresuLogic.getPartidaPresus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=partidapresus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PartidaPresuJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPartidaPresu.setModel(new PartidaPresuModel(this.partidapresuLogic.getPartidaPresus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPartidaPresu.setModel(new PartidaPresuModel(this.partidapresus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPartidaPresu!=null && this.jInternalFrameOrderByPartidaPresu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPartidaPresu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPartidaPresu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPartidaPresu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PartidaPresuPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO,partidapresuConstantesFunciones.resaltarSeleccionarPartidaPresu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO,partidapresuConstantesFunciones.resaltarSeleccionarPartidaPresu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPartidaPresu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPartidaPresu,PartidaPresuConstantesFunciones.LABEL_ID));

		if(this.partidapresuConstantesFunciones.mostraridPartidaPresu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PartidaPresuConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.partidapresuConstantesFunciones.resaltaridPartidaPresu,this.partidapresuConstantesFunciones.activaridPartidaPresu,this,true,"idPartidaPresu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.partidapresuConstantesFunciones.resaltaridPartidaPresu,this.partidapresuConstantesFunciones.activaridPartidaPresu,this,true,"idPartidaPresu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPartidaPresu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPartidaPresu,PartidaPresuConstantesFunciones.LABEL_IDEMPRESA));

		if(this.partidapresuConstantesFunciones.mostrarid_empresaPartidaPresu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PartidaPresuConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.partidapresuConstantesFunciones.resaltarid_empresaPartidaPresu,this,this.partidapresuConstantesFunciones.activarid_empresaPartidaPresu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.partidapresuConstantesFunciones.resaltarid_empresaPartidaPresu,this,this.partidapresuConstantesFunciones.activarid_empresaPartidaPresu,false,"id_empresaPartidaPresu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PartidaPresuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPartidaPresu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPartidaPresu,PartidaPresuConstantesFunciones.LABEL_CODIGO));

		if(this.partidapresuConstantesFunciones.mostrarcodigoPartidaPresu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PartidaPresuConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.partidapresuConstantesFunciones.resaltarcodigoPartidaPresu,this.partidapresuConstantesFunciones.activarcodigoPartidaPresu,this,true,"codigoPartidaPresu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.partidapresuConstantesFunciones.resaltarcodigoPartidaPresu,this.partidapresuConstantesFunciones.activarcodigoPartidaPresu,this,true,"codigoPartidaPresu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PartidaPresuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPartidaPresu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPartidaPresu,PartidaPresuConstantesFunciones.LABEL_NOMBRE));

		if(this.partidapresuConstantesFunciones.mostrarnombrePartidaPresu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PartidaPresuConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.partidapresuConstantesFunciones.resaltarnombrePartidaPresu,this.partidapresuConstantesFunciones.activarnombrePartidaPresu,this,true,"nombrePartidaPresu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.partidapresuConstantesFunciones.resaltarnombrePartidaPresu,this.partidapresuConstantesFunciones.activarnombrePartidaPresu,this,true,"nombrePartidaPresu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PartidaPresuPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleActivoFijo && this.partidapresuConstantesFunciones.mostrarDetalleActivoFijoPartidaPresu && !PartidaPresuConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Activo Fijos");
				tableColumn.setHeaderValue("Detalle Activo Fijos");
				tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(partidapresuConstantesFunciones.resaltarDetalleActivoFijoPartidaPresu,this,this.partidapresuConstantesFunciones.activarDetalleActivoFijoPartidaPresu));
				tableColumn.setCellEditor(new DetalleActivoFijoTableCell(partidapresuConstantesFunciones.resaltarDetalleActivoFijoPartidaPresu,this,this.partidapresuConstantesFunciones.activarDetalleActivoFijoPartidaPresu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPartidaPresu.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.partidapresuSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.partidapresuSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPartidaPresu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.partidapresuSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.partidapresuSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPartidaPresu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.partidapresuSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.partidapresuSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPartidaPresu.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.partidapresuSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosPartidaPresu.addColumn(tableColumn);
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
			
			this.jTableDatosPartidaPresu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.partidapresuSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPartidaPresu.moveColumn(this.jTableDatosPartidaPresu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPartidaPresu.moveColumn(this.jTableDatosPartidaPresu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.partidapresuSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPartidaPresu.moveColumn(this.jTableDatosPartidaPresu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPartidaPresu.moveColumn(this.jTableDatosPartidaPresu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPartidaPresu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPartidaPresu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPartidaPresu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PartidaPresuJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPartidaPresu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPartidaPresu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PartidaPresuJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PartidaPresuJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPartidaPresu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPartidaPresu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPartidaPresu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=partidapresuLogic.getPartidaPresus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=partidapresus.size()-1;
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
		//this.jTableDatosPartidaPresu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPartidaPresu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPartidaPresu();
			
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
				
				//this.isEsNuevoPartidaPresu=false;
					
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			
				if(this.partidapresuSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPartidaPresu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPartidaPresu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPartidaPresu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.partidapresu.getsType().equals("DUPLICADO")
				   || this.partidapresu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPartidaPresu=true;
				
				} else {
					this.isEsNuevoPartidaPresu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
					if(this.partidapresu.getId()>=0 && !this.partidapresu.getIsNew()) {						
						this.isEsNuevoPartidaPresu=false;
						
					} else {
						this.isEsNuevoPartidaPresu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPartidaPresu(esRelaciones);						
				
				this.seleccionarPartidaPresu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.partidapresu.getId()<0) {
					this.isEsNuevoPartidaPresu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPartidaPresu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPartidaPresu(evt,rowIndex);
				}	
				
				if(this.partidapresuSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PartidaPresu: " + this.dDif); 
					}
				}								
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPartidaPresu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.partidapresu)) {
					if(this.partidapresu.getId()>0) {
						this.partidapresu.setIsDeleted(true);
						
						this.partidapresusEliminados.add(this.partidapresu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.partidapresuLogic.getPartidaPresus().remove(this.partidapresu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.partidapresus.remove(this.partidapresu);				
					}
					
					
					((PartidaPresuModel) this.jTableDatosPartidaPresu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPartidaPresu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPartidaPresu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPartidaPresu) {
			
			if(this.jInternalFrameDetalleFormPartidaPresu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPartidaPresu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPartidaPresu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PartidaPresuJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPartidaPresu(this.partidapresu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.partidapresuConstantesFunciones.cargarid_empresaPartidaPresu || this.partidapresuConstantesFunciones.event_dependid_empresaPartidaPresu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.partidapresu.getid_empresa());
									//this.inicializarActualizarBindingPartidaPresu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(partidapresu.getEmpresa()!=null) {
							this.empresasForeignKey.add(partidapresu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.partidapresu.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPartidaPresu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPartidaPresu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPartidaPresu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPartidaPresu(PartidaPresu partidapresu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPartidaPresu(partidapresu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPartidaPresu(PartidaPresu partidapresu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPartidaPresu(partidapresu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPartidaPresu(partidapresu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPartidaPresu(partidapresu);
	}
	
	public void setVariablesObjetoActualToFormularioPartidaPresu(PartidaPresu partidapresu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPartidaPresu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPartidaPresu.jLabelidPartidaPresu.setText(partidapresu.getId().toString());
			this.jInternalFrameDetalleFormPartidaPresu.jTextFieldcodigoPartidaPresu.setText(partidapresu.getcodigo());
			this.jInternalFrameDetalleFormPartidaPresu.jTextAreanombrePartidaPresu.setText(partidapresu.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PartidaPresu partidapresuLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,partidapresuLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PartidaPresu partidapresuLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				partidapresuLocal=this.partidapresu;
			} else {
				partidapresuLocal=this.partidapresuAnterior;
			}
		}
		
		if(this.permiteMantenimiento(partidapresuLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPartidaPresu(partidapresuLocal,true);
					
					if(partidapresuSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(partidapresuLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.partidapresuSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(partidapresuLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPartidaPresu(PartidaPresu partidapresu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPartidaPresu(partidapresu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(partidapresu);
	}
	
	public void setVariablesFormularioToObjetoActualPartidaPresu(PartidaPresu partidapresu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPartidaPresu(partidapresu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPartidaPresu(PartidaPresu partidapresu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPartidaPresu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPartidaPresu.jLabelidPartidaPresu.getText()==null || this.jInternalFrameDetalleFormPartidaPresu.jLabelidPartidaPresu.getText()=="" || this.jInternalFrameDetalleFormPartidaPresu.jLabelidPartidaPresu.getText()=="Id") {
				this.jInternalFrameDetalleFormPartidaPresu.jLabelidPartidaPresu.setText("0");
			}

			if(conColumnasBase) {partidapresu.setId(Long.parseLong(this.jInternalFrameDetalleFormPartidaPresu.jLabelidPartidaPresu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PartidaPresuConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPartidaPresu.jLabelIdPartidaPresu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			partidapresu.setcodigo(this.jInternalFrameDetalleFormPartidaPresu.jTextFieldcodigoPartidaPresu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PartidaPresuConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPartidaPresu.jLabelcodigoPartidaPresu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			partidapresu.setnombre(this.jInternalFrameDetalleFormPartidaPresu.jTextAreanombrePartidaPresu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PartidaPresuConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPartidaPresu.jLabelnombrePartidaPresu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPartidaPresu(PartidaPresu partidapresuBean,PartidaPresu partidapresu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPartidaPresu(PartidaPresu partidapresuOrigen,PartidaPresu partidapresu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && partidapresuOrigen.getId()!=null && !partidapresuOrigen.getId().equals(0L))) {partidapresu.setId(partidapresuOrigen.getId());}}
			if(conDefault || (!conDefault && partidapresuOrigen.getcodigo()!=null && !partidapresuOrigen.getcodigo().equals(""))) {partidapresu.setcodigo(partidapresuOrigen.getcodigo());}
			if(conDefault || (!conDefault && partidapresuOrigen.getnombre()!=null && !partidapresuOrigen.getnombre().equals(""))) {partidapresu.setnombre(partidapresuOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPartidaPresu(PartidaPresu partidapresu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPartidaPresu.jLabelidPartidaPresu.setText(partidapresu.getId().toString());
			this.jInternalFrameDetalleFormPartidaPresu.jTextFieldcodigoPartidaPresu.setText(partidapresu.getcodigo());
			this.jInternalFrameDetalleFormPartidaPresu.jTextAreanombrePartidaPresu.setText(partidapresu.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPartidaPresu(PartidaPresuBean partidapresuBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPartidaPresu.jLabelidPartidaPresu.setText(partidapresuBean.getId().toString());
			this.jInternalFrameDetalleFormPartidaPresu.jTextFieldcodigoPartidaPresu.setText(partidapresuBean.getcodigo());
			this.jInternalFrameDetalleFormPartidaPresu.jTextAreanombrePartidaPresu.setText(partidapresuBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPartidaPresu(PartidaPresuParameterReturnGeneral partidapresuReturnGeneral,PartidaPresuBean partidapresuBean,Boolean conDefault) throws Exception { 
		try {
			PartidaPresu partidapresuLocal=new PartidaPresu();
			
			partidapresuLocal=partidapresuReturnGeneral.getPartidaPresu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && partidapresuLocal.getId()!=null && !partidapresuLocal.getId().equals(0L))) {partidapresuBean.setId(partidapresuLocal.getId());}}
			if(conDefault || (!conDefault && partidapresuLocal.getcodigo()!=null && !partidapresuLocal.getcodigo().equals(""))) {partidapresuBean.setcodigo(partidapresuLocal.getcodigo());}
			if(conDefault || (!conDefault && partidapresuLocal.getnombre()!=null && !partidapresuLocal.getnombre().equals(""))) {partidapresuBean.setnombre(partidapresuLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPartidaPresuGenerico(Long idPartidaPresuSeleccionado,JComboBox jComboBoxPartidaPresu,List<PartidaPresu> partidapresusLocal)throws Exception {
		try {
			PartidaPresu  partidapresuTemp=null;

			for(PartidaPresu partidapresuAux:partidapresusLocal) {
				if(partidapresuAux.getId()!=null && partidapresuAux.getId().equals(idPartidaPresuSeleccionado)) {
					partidapresuTemp=partidapresuAux;
					break;
				}
			}

			jComboBoxPartidaPresu.setSelectedItem(partidapresuTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPartidaPresuGenerico(JComboBox jComboBoxPartidaPresu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPartidaPresu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPartidaPresu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPartidaPresu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPartidaPresu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPartidaPresu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPartidaPresu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPartidaPresu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPartidaPresu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPartidaPresu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPartidaPresu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			partidapresu=(PartidaPresu) partidapresuLogic.getPartidaPresus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			partidapresu =(PartidaPresu) partidapresus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!partidapresu.getIsNew() && !partidapresu.getIsChanged() && !partidapresu.getIsDeleted()) {
				sDescripcion=partidapresu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=partidapresu.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PartidaPresu partidapresuRow=new PartidaPresu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			partidapresuRow=(PartidaPresu) partidapresuLogic.getPartidaPresus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			partidapresuRow=(PartidaPresu) partidapresus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleActivoFijoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PartidaPresu partidapresu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPartidaPresu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.partidapresu = (PartidaPresu)this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.partidapresu = (PartidaPresu)this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(partidapresu!=null) {
						this.partidapresu = partidapresu;
					} else {
						this.partidapresu = new PartidaPresu();
					}
				}

				if(this.isTienePermisosDetalleActivoFijo && this.permiteMantenimiento(this.partidapresu)) {
					DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFramePopup=new DetalleActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFramePopup;
					} else {
						detalleactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame;
					}

					List<PartidaPresu> partidapresus=new ArrayList<PartidaPresu>();
					partidapresus.add(this.partidapresu);
					if(!esRelacionado) {
						//detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setConGuardarRelaciones(false);
						//detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPartidaPresu.cargarDetalleActivoFijoBeanSwingJInternalFrame(partidapresus,this.partidapresu,detalleactivofijoBeanSwingJInternalFrame,/*conInicializar,*/detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getConGuardarRelaciones(),detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado());
					detalleactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("no_relacionado");

						detalleactivofijoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA + (DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleactivofijoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPartidaPresu=(TitledBorder)this.jScrollPanelDatosPartidaPresu.getBorder();
						TitledBorder titledBorderDetalleActivoFijo=(TitledBorder)detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

						titledBorderDetalleActivoFijo.setTitle(titledBorderPartidaPresu.getTitle() + " -> Detalle Activo Fijo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleactivofijoBeanSwingJInternalFrame);
						}

						detalleactivofijoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleactivofijoBeanSwingJInternalFrame);

						detalleactivofijoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.partidapresuSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Activo Fijo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPartidaPresu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPartidaPresu.setVisible((this.isVisibilidadCeldaNuevoPartidaPresu && this.isPermisoNuevoPartidaPresu));			
			this.jButtonDuplicarPartidaPresu.setVisible((this.isVisibilidadCeldaDuplicarPartidaPresu && this.isPermisoDuplicarPartidaPresu));			
			this.jButtonCopiarPartidaPresu.setVisible((this.isVisibilidadCeldaCopiarPartidaPresu && this.isPermisoCopiarPartidaPresu));
			this.jButtonVerFormPartidaPresu.setVisible((this.isVisibilidadCeldaVerFormPartidaPresu && this.isPermisoVerFormPartidaPresu));
			
			this.jButtonAbrirOrderByPartidaPresu.setVisible((this.isVisibilidadCeldaOrdenPartidaPresu && this.isPermisoOrdenPartidaPresu));			
			
			this.jButtonNuevoRelacionesPartidaPresu.setVisible((this.isVisibilidadCeldaNuevoRelacionesPartidaPresu && this.isPermisoNuevoPartidaPresu));			
			this.jButtonNuevoGuardarCambiosPartidaPresu.setVisible((this.isVisibilidadCeldaNuevoPartidaPresu && this.isPermisoNuevoPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu));
			
			if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
			this.jInternalFrameDetalleFormPartidaPresu.jButtonModificarPartidaPresu.setVisible((this.isVisibilidadCeldaModificarPartidaPresu && this.isPermisoActualizarPartidaPresu));	
			this.jInternalFrameDetalleFormPartidaPresu.jButtonActualizarPartidaPresu.setVisible((this.isVisibilidadCeldaActualizarPartidaPresu && this.isPermisoActualizarPartidaPresu));	
			this.jInternalFrameDetalleFormPartidaPresu.jButtonEliminarPartidaPresu.setVisible((this.isVisibilidadCeldaEliminarPartidaPresu && this.isPermisoEliminarPartidaPresu));
			this.jInternalFrameDetalleFormPartidaPresu.jButtonCancelarPartidaPresu.setVisible(this.isVisibilidadCeldaCancelarPartidaPresu);							
			this.jInternalFrameDetalleFormPartidaPresu.jButtonGuardarCambiosPartidaPresu.setVisible((this.isVisibilidadCeldaGuardarPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu));			
			
			}
						
			this.jButtonGuardarCambiosTablaPartidaPresu.setVisible((this.isVisibilidadCeldaGuardarCambiosPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPartidaPresu.setVisible((this.isVisibilidadCeldaNuevoPartidaPresu && this.isPermisoNuevoPartidaPresu));						
			this.jButtonDuplicarToolBarPartidaPresu.setVisible((this.isVisibilidadCeldaDuplicarPartidaPresu && this.isPermisoDuplicarPartidaPresu));						
			this.jButtonCopiarToolBarPartidaPresu.setVisible((this.isVisibilidadCeldaCopiarPartidaPresu && this.isPermisoCopiarPartidaPresu));			
			this.jButtonVerFormToolBarPartidaPresu.setVisible((this.isVisibilidadCeldaVerFormPartidaPresu && this.isPermisoVerFormPartidaPresu));			
			this.jButtonAbrirOrderByToolBarPartidaPresu.setVisible((this.isVisibilidadCeldaOrdenPartidaPresu && this.isPermisoOrdenPartidaPresu));
			this.jButtonNuevoRelacionesToolBarPartidaPresu.setVisible((this.isVisibilidadCeldaNuevoRelacionesPartidaPresu && this.isPermisoNuevoPartidaPresu));			
			this.jButtonNuevoGuardarCambiosToolBarPartidaPresu.setVisible((this.isVisibilidadCeldaNuevoPartidaPresu && this.isPermisoNuevoPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu));			
			
			if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
			this.jInternalFrameDetalleFormPartidaPresu.jButtonModificarToolBarPartidaPresu.setVisible((this.isVisibilidadCeldaModificarPartidaPresu && this.isPermisoActualizarPartidaPresu));	
			this.jInternalFrameDetalleFormPartidaPresu.jButtonActualizarToolBarPartidaPresu.setVisible((this.isVisibilidadCeldaActualizarPartidaPresu  && this.isPermisoActualizarPartidaPresu));	
			this.jInternalFrameDetalleFormPartidaPresu.jButtonEliminarToolBarPartidaPresu.setVisible((this.isVisibilidadCeldaEliminarPartidaPresu && this.isPermisoEliminarPartidaPresu));
			this.jInternalFrameDetalleFormPartidaPresu.jButtonCancelarToolBarPartidaPresu.setVisible(this.isVisibilidadCeldaCancelarPartidaPresu);				
			this.jInternalFrameDetalleFormPartidaPresu.jButtonGuardarCambiosToolBarPartidaPresu.setVisible((this.isVisibilidadCeldaGuardarPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPartidaPresu.setVisible((this.isVisibilidadCeldaGuardarCambiosPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPartidaPresu.setVisible((this.isVisibilidadCeldaNuevoPartidaPresu && this.isPermisoNuevoPartidaPresu));			
			this.jMenuItemDuplicarPartidaPresu.setVisible((this.isVisibilidadCeldaDuplicarPartidaPresu && this.isPermisoDuplicarPartidaPresu));			
			this.jMenuItemCopiarPartidaPresu.setVisible((this.isVisibilidadCeldaCopiarPartidaPresu && this.isPermisoCopiarPartidaPresu));			
			this.jMenuItemVerFormPartidaPresu.setVisible((this.isVisibilidadCeldaVerFormPartidaPresu && this.isPermisoVerFormPartidaPresu));			
			this.jMenuItemAbrirOrderByPartidaPresu.setVisible((this.isVisibilidadCeldaOrdenPartidaPresu && this.isPermisoOrdenPartidaPresu));			
			//this.jMenuItemMostrarOcultarPartidaPresu.setVisible((this.isVisibilidadCeldaOrdenPartidaPresu && this.isPermisoOrdenPartidaPresu));
			this.jMenuItemDetalleAbrirOrderByPartidaPresu.setVisible((this.isVisibilidadCeldaOrdenPartidaPresu && this.isPermisoOrdenPartidaPresu));			
			//this.jMenuItemDetalleMostrarOcultarPartidaPresu.setVisible((this.isVisibilidadCeldaOrdenPartidaPresu && this.isPermisoOrdenPartidaPresu));			
			this.jMenuItemNuevoRelacionesPartidaPresu.setVisible((this.isVisibilidadCeldaNuevoRelacionesPartidaPresu && this.isPermisoNuevoPartidaPresu));			
			this.jMenuItemNuevoGuardarCambiosPartidaPresu.setVisible((this.isVisibilidadCeldaNuevoPartidaPresu && this.isPermisoNuevoPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu));									
			
			if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
			this.jInternalFrameDetalleFormPartidaPresu.jMenuItemModificarPartidaPresu.setVisible((this.isVisibilidadCeldaModificarPartidaPresu && this.isPermisoActualizarPartidaPresu));	
			this.jInternalFrameDetalleFormPartidaPresu.jMenuItemActualizarPartidaPresu.setVisible((this.isVisibilidadCeldaActualizarPartidaPresu && this.isPermisoActualizarPartidaPresu));	
			this.jInternalFrameDetalleFormPartidaPresu.jMenuItemEliminarPartidaPresu.setVisible((this.isVisibilidadCeldaEliminarPartidaPresu && this.isPermisoEliminarPartidaPresu));
			this.jInternalFrameDetalleFormPartidaPresu.jMenuItemCancelarPartidaPresu.setVisible(this.isVisibilidadCeldaCancelarPartidaPresu);				
			}
			
			this.jMenuItemGuardarCambiosPartidaPresu.setVisible((this.isVisibilidadCeldaGuardarPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu));						
			this.jMenuItemGuardarCambiosTablaPartidaPresu.setVisible((this.isVisibilidadCeldaGuardarCambiosPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPartidaPresu=this.jButtonNuevoPartidaPresu.isVisible();
			this.isVisibilidadCeldaDuplicarPartidaPresu=this.jButtonDuplicarPartidaPresu.isVisible();
			this.isVisibilidadCeldaCopiarPartidaPresu=this.jButtonCopiarPartidaPresu.isVisible();
			this.isVisibilidadCeldaVerFormPartidaPresu=this.jButtonVerFormPartidaPresu.isVisible();
			
			this.isVisibilidadCeldaOrdenPartidaPresu=this.jButtonAbrirOrderByPartidaPresu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=this.jButtonNuevoRelacionesPartidaPresu.isVisible();
			this.isVisibilidadCeldaModificarPartidaPresu=this.jButtonModificarPartidaPresu.isVisible();
			
			if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
			this.isVisibilidadCeldaActualizarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jButtonActualizarPartidaPresu.isVisible();
			this.isVisibilidadCeldaEliminarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jButtonEliminarPartidaPresu.isVisible();
			this.isVisibilidadCeldaCancelarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jButtonCancelarPartidaPresu.isVisible();
			this.isVisibilidadCeldaGuardarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jButtonGuardarCambiosPartidaPresu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPartidaPresu=this.jButtonGuardarCambiosTablaPartidaPresu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPartidaPresu=this.jButtonNuevoToolBarPartidaPresu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=this.jButtonNuevoRelacionesToolBarPartidaPresu.isVisible();
			
			if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
			this.isVisibilidadCeldaModificarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jButtonModificarToolBarPartidaPresu.isVisible();
			this.isVisibilidadCeldaActualizarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jButtonActualizarToolBarPartidaPresu.isVisible();
			this.isVisibilidadCeldaEliminarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jButtonEliminarToolBarPartidaPresu.isVisible();
			this.isVisibilidadCeldaCancelarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jButtonCancelarToolBarPartidaPresu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPartidaPresu=this.jButtonGuardarCambiosToolBarPartidaPresu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPartidaPresu=this.jButtonGuardarCambiosTablaToolBarPartidaPresu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPartidaPresu=this.jMenuItemNuevoPartidaPresu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=this.jMenuItemNuevoRelacionesPartidaPresu.isVisible();
			
			if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
			this.isVisibilidadCeldaModificarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jMenuItemModificarPartidaPresu.isVisible();
			this.isVisibilidadCeldaActualizarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jMenuItemActualizarPartidaPresu.isVisible();
			this.isVisibilidadCeldaEliminarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jMenuItemEliminarPartidaPresu.isVisible();
			this.isVisibilidadCeldaCancelarPartidaPresu=this.jInternalFrameDetalleFormPartidaPresu.jMenuItemCancelarPartidaPresu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPartidaPresu=this.jMenuItemGuardarCambiosPartidaPresu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPartidaPresu=this.jMenuItemGuardarCambiosTablaPartidaPresu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPartidaPresu(Boolean esInicializar) {
		if(PartidaPresuJInternalFrame.ISBINDING_MANUAL) {			
			if(this.partidapresuSessionBean.getConGuardarRelaciones()) {
				//if(this.partidapresuSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPartidaPresu();
			}
			
			this.inicializarActualizarBindingBotonesManualPartidaPresu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPartidaPresu() {
		this.jButtonNuevoPartidaPresu.setVisible(this.isPermisoNuevoPartidaPresu);			
		this.jButtonDuplicarPartidaPresu.setVisible(this.isPermisoDuplicarPartidaPresu);			
		this.jButtonCopiarPartidaPresu.setVisible(this.isPermisoCopiarPartidaPresu);			
		this.jButtonVerFormPartidaPresu.setVisible(this.isPermisoVerFormPartidaPresu);			
		
		this.jButtonAbrirOrderByPartidaPresu.setVisible(this.isPermisoOrdenPartidaPresu);					
		
		this.jButtonNuevoRelacionesPartidaPresu.setVisible(this.isPermisoNuevoPartidaPresu);			
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jButtonModificarPartidaPresu.setVisible(this.isPermisoActualizarPartidaPresu);	
			this.jInternalFrameDetalleFormPartidaPresu.jButtonActualizarPartidaPresu.setVisible(this.isPermisoActualizarPartidaPresu);	
			this.jInternalFrameDetalleFormPartidaPresu.jButtonEliminarPartidaPresu.setVisible(this.isPermisoEliminarPartidaPresu);
			this.jInternalFrameDetalleFormPartidaPresu.jButtonCancelarPartidaPresu.setVisible(this.isVisibilidadCeldaCancelarPartidaPresu);						
			this.jInternalFrameDetalleFormPartidaPresu.jButtonGuardarCambiosPartidaPresu.setVisible(this.isPermisoGuardarCambiosPartidaPresu);							
		}
		
		this.jButtonGuardarCambiosTablaPartidaPresu.setVisible(this.isPermisoActualizarPartidaPresu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePartidaPresu() {
		this.jInternalFrameDetalleFormPartidaPresu.jButtonModificarPartidaPresu.setVisible(this.isPermisoActualizarPartidaPresu);	
		this.jInternalFrameDetalleFormPartidaPresu.jButtonActualizarPartidaPresu.setVisible(this.isPermisoActualizarPartidaPresu);	
		this.jInternalFrameDetalleFormPartidaPresu.jButtonEliminarPartidaPresu.setVisible(this.isPermisoEliminarPartidaPresu);
		this.jInternalFrameDetalleFormPartidaPresu.jButtonCancelarPartidaPresu.setVisible(this.isVisibilidadCeldaCancelarPartidaPresu);							
		this.jInternalFrameDetalleFormPartidaPresu.jButtonGuardarCambiosPartidaPresu.setVisible((this.isVisibilidadCeldaGuardarPartidaPresu && this.isPermisoGuardarCambiosPartidaPresu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPartidaPresu() {
		if(PartidaPresuJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPartidaPresu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPartidaPresu() {
	}
	
	public void jTableDatosPartidaPresuListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPartidaPresu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPartidaPresuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPartidaPresu(this.getpartidapresu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.partidapresu==null) {
						this.partidapresu = new PartidaPresu();
					}

					this.setVariablesFormularioToObjetoActualPartidaPresu(this.partidapresu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
				}

				if(this.partidapresu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.partidapresu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPartidaPresu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPartidaPresuUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPartidaPresu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPartidaPresu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPartidaPresu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPartidaPresu(this.getpartidapresu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.partidapresuLogic.getConnexion());

				if(this.partidapresu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.partidapresu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPartidaPresu=(TitledBorder)this.jScrollPanelDatosPartidaPresu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPartidaPresu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPartidaPresuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPartidaPresu(this.getpartidapresu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.partidapresu==null) {
						this.partidapresu = new PartidaPresu();
					}

					this.setVariablesFormularioToObjetoActualPartidaPresu(this.partidapresu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
				}

				if(this.partidapresu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.partidapresu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPartidaPresu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPartidaPresuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPartidaPresu(this.getpartidapresu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.partidapresu==null) {
						this.partidapresu = new PartidaPresu();
					}

					this.setVariablesFormularioToObjetoActualPartidaPresu(this.partidapresu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
				}

				if(this.partidapresu.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.partidapresu.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPartidaPresu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePartidaPresuBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPartidaPresu(this.getpartidapresu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.partidapresu==null) {
						this.partidapresu = new PartidaPresu();
					}

					this.setVariablesFormularioToObjetoActualPartidaPresu(this.partidapresu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);
				}

				if(this.partidapresu.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.partidapresu.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPartidaPresu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaPartidaPresuActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPartidaPresu(false,false);

			this.getPartidaPresusFK_IdEmpresa();

			this.inicializarActualizarBindingPartidaPresu(false);

			//if(PartidaPresuBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPartidaPresu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.partidapresuLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePartidaPresu() {
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
		

		if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
			this.jInternalFrameDetalleFormPartidaPresu.setVisible(false);	    			
			this.jInternalFrameDetalleFormPartidaPresu.dispose();
			this.jInternalFrameDetalleFormPartidaPresu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPartidaPresu!=null) {
			this.jInternalFrameReporteDinamicoPartidaPresu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPartidaPresu.dispose();
			this.jInternalFrameReporteDinamicoPartidaPresu=null;
		}
		
		if(this.jInternalFrameImportacionPartidaPresu!=null) {
			this.jInternalFrameImportacionPartidaPresu.setVisible(false);	    			
			this.jInternalFrameImportacionPartidaPresu.dispose();
			this.jInternalFrameImportacionPartidaPresu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPartidaPresu();
			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			
			
			if(sTipo.equals("NuevoPartidaPresu")) {
				jButtonNuevoPartidaPresuActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPartidaPresu")) {
				jButtonDuplicarPartidaPresuActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPartidaPresu")) {
				jButtonCopiarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("VerFormPartidaPresu")) {
				jButtonVerFormPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPartidaPresu")) {
				jButtonNuevoPartidaPresuActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPartidaPresu")) {
				jButtonDuplicarPartidaPresuActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPartidaPresu")) {
				jButtonNuevoPartidaPresuActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPartidaPresu")) {
				jButtonDuplicarPartidaPresuActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPartidaPresu")) {
				jButtonNuevoPartidaPresuActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPartidaPresu")) {
				jButtonNuevoPartidaPresuActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPartidaPresu")) {
				jButtonNuevoPartidaPresuActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPartidaPresu")) {
				jButtonModificarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPartidaPresu")) {
				jButtonModificarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPartidaPresu")) {
				jButtonModificarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPartidaPresu")) {
				jButtonActualizarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPartidaPresu")) {
				jButtonActualizarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPartidaPresu")) {
				jButtonActualizarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("EliminarPartidaPresu")) {
				jButtonEliminarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPartidaPresu")) {
				jButtonEliminarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPartidaPresu")) {
				jButtonEliminarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("CancelarPartidaPresu")) {
				jButtonCancelarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPartidaPresu")) {
				jButtonCancelarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPartidaPresu")) {
				jButtonCancelarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("CerrarPartidaPresu")) {
				jButtonCerrarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPartidaPresu")) {
				jButtonCerrarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPartidaPresu")) {
				jButtonCerrarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPartidaPresu")) {
				jButtonMostrarOcultarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPartidaPresu")) {
				jButtonCancelarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPartidaPresu")) {
				jButtonGuardarCambiosPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPartidaPresu")) {
				jButtonGuardarCambiosPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPartidaPresu")) {
				jButtonCopiarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPartidaPresu")) {
				jButtonVerFormPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPartidaPresu")) {
				jButtonGuardarCambiosPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPartidaPresu")) {
				jButtonCopiarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPartidaPresu")) {
				jButtonVerFormPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPartidaPresu")) {
				jButtonGuardarCambiosPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPartidaPresu")) {
				jButtonGuardarCambiosPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPartidaPresu")) {
				jButtonGuardarCambiosPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPartidaPresu")) {
				jButtonRecargarInformacionPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPartidaPresu")) {
				jButtonRecargarInformacionPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPartidaPresu")) {
				jButtonRecargarInformacionPartidaPresuActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPartidaPresu")) {
				jButtonAnterioresPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPartidaPresu")) {
				jButtonAnterioresPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePartidaPresu")) {
				jButtonAnterioresPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPartidaPresu")) {
				jButtonSiguientesPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPartidaPresu")) {
				jButtonSiguientesPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPartidaPresu")) {
				jButtonSiguientesPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPartidaPresu") || sTipo.equals("MenuItemDetalleAbrirOrderByPartidaPresu")) {
				jButtonAbrirOrderByPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPartidaPresu") || sTipo.equals("MenuItemDetalleMostrarOcultarPartidaPresu")) {
				jButtonMostrarOcultarPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPartidaPresu")) {
				jButtonNuevoGuardarCambiosPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPartidaPresu")) {
				jButtonNuevoGuardarCambiosPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPartidaPresu")) {
				jButtonNuevoGuardarCambiosPartidaPresuActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPartidaPresu")) {
				jButtonCerrarReporteDinamicoPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPartidaPresu")) {
				jButtonGenerarReporteDinamicoPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPartidaPresu")) {
				
				jButtonGenerarExcelReporteDinamicoPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPartidaPresu")) {
				jButtonCerrarImportacionPartidaPresuActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPartidaPresu")) {
				
				jButtonGenerarImportacionPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPartidaPresu")) {
				
				jButtonAbrirImportacionPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPartidaPresu")) {
				jComboBoxTiposAccionesPartidaPresuActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPartidaPresu")) {
				jComboBoxTiposRelacionesPartidaPresuActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPartidaPresu")) {
				jComboBoxTiposAccionesPartidaPresuActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPartidaPresu")) {
				
				jComboBoxTiposSeleccionarPartidaPresuActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPartidaPresu")) {
				jTextFieldValorCampoGeneralPartidaPresuActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPartidaPresu")) {
				jButtonAbrirOrderByPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPartidaPresu")) {
				jButtonAbrirOrderByPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPartidaPresu")) {
				jButtonCerrarOrderByPartidaPresuActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPartidaPresuBusqueda")) {
				this.jButtonidPartidaPresuBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPartidaPresuUpdate")) {
				this.jButtonid_empresaPartidaPresuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPartidaPresuBusqueda")) {
				this.jButtonid_empresaPartidaPresuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPartidaPresuBusqueda")) {
				this.jButtoncodigoPartidaPresuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePartidaPresuBusqueda")) {
				this.jButtonnombrePartidaPresuBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPartidaPresu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPartidaPresuActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				


				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PartidaPresu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PartidaPresu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PartidaPresu partidapresuLocal=null;
			
			if(!this.getEsControlTabla()) {
				partidapresuLocal=this.partidapresu;
			} else {
				partidapresuLocal=this.partidapresuAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
							
				
				


				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PartidaPresu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PartidaPresu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPartidaPresuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuAnterior =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.partidapresuAnterior =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
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
			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			
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
			
			


			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPartidaPresuActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
								
						
				


				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PartidaPresu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PartidaPresu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
								
				
				


				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PartidaPresu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PartidaPresu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPartidaPresuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuAnterior =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.partidapresuAnterior =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPartidaPresuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuAnterior =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.partidapresuAnterior =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPartidaPresuActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
							
				
				


				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PartidaPresu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PartidaPresu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPartidaPresuActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.partidapresuAnterior =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.partidapresuAnterior =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
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
			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			
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
			
			


			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPartidaPresuActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
								
				
				


				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PartidaPresu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PartidaPresu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPartidaPresuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuAnterior =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.partidapresuAnterior =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPartidaPresuActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPartidaPresuActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPartidaPresu")) {
					jCheckBoxSeleccionarTodosPartidaPresuItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPartidaPresu")) {
					jCheckBoxSeleccionadosPartidaPresuItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPartidaPresu")) {
					
				}
				
				


				
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PartidaPresu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PartidaPresu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
												
				
				


				
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PartidaPresu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PartidaPresu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPartidaPresuActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.partidapresuAnterior =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.partidapresuAnterior =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPartidaPresuActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
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
			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
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
			
			


			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPartidaPresuActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PartidaPresu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PartidaPresu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.partidapresu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.partidapresu);
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
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
				
				


				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PartidaPresu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PartidaPresu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPartidaPresuActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.partidapresuAnterior =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.partidapresuAnterior =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPartidaPresu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPartidaPresuListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPartidaPresu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.partidapresu =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.partidapresu =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.partidapresu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPartidaPresu")) {
				
				}
				
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPartidaPresu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPartidaPresu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPartidaPresu")) {
			
			}
			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPartidaPresu();
			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			
			if(sTipo.equals("NuevoPartidaPresu")) {
				jButtonNuevoPartidaPresuActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPartidaPresu")) {
				jButtonDuplicarPartidaPresuActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPartidaPresu")) {
				jButtonCopiarPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPartidaPresu")) {
				jButtonVerFormPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPartidaPresu")) {
				jButtonNuevoPartidaPresuActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPartidaPresu")) {
				jButtonModificarPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPartidaPresu")) {
				jButtonActualizarPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPartidaPresu")) {
				jButtonEliminarPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPartidaPresu")) {
				jButtonGuardarCambiosPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPartidaPresu")) {
				jButtonCancelarPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPartidaPresu")) {
				jButtonCerrarPartidaPresuActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPartidaPresu")) {
				jButtonGuardarCambiosPartidaPresuActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPartidaPresu")) {
				jButtonNuevoGuardarCambiosPartidaPresuActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPartidaPresu")) {
				jButtonAbrirOrderByPartidaPresuActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPartidaPresu")) {
				jButtonRecargarInformacionPartidaPresuActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPartidaPresu")) {
				jButtonAnterioresPartidaPresuActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPartidaPresu")) {
				jButtonSiguientesPartidaPresuActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPartidaPresuBusqueda")) {
				this.jButtonidPartidaPresuBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPartidaPresuUpdate")) {
				this.jButtonid_empresaPartidaPresuUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPartidaPresuBusqueda")) {
				this.jButtonid_empresaPartidaPresuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPartidaPresuBusqueda")) {
				this.jButtoncodigoPartidaPresuBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePartidaPresuBusqueda")) {
				this.jButtonnombrePartidaPresuBusquedaActionPerformed(evt);
			}
			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPartidaPresu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePartidaPresu")) {
				closingInternalFramePartidaPresu();
				
			} else if(sTipo.equals("jButtonCancelarPartidaPresu")) {
				JInternalFrameBase jInternalFrameDetalleFormPartidaPresu = (JInternalFrameBase)evt.getSource();
	            	
	            PartidaPresuBeanSwingJInternalFrame jInternalFrameParent=(PartidaPresuBeanSwingJInternalFrame)jInternalFrameDetalleFormPartidaPresu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPartidaPresuActionPerformed(null);
			}
			
			PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.partidapresu,new Object(),this.partidapresuParameterGeneral,this.partidapresuReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPartidaPresu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPartidaPresu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPartidaPresu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.partidapresu)) {
			if(!esControlTabla) {
				if(PartidaPresuJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPartidaPresu(this.partidapresu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);			
				}
				
				if(this.partidapresuSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPartidaPresu(this.partidapresu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.partidapresuReturnGeneral=partidapresuLogic.procesarEventosPartidaPresusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.partidapresuLogic.getPartidaPresus(),this.partidapresu,this.partidapresuParameterGeneral,this.isEsNuevoPartidaPresu,classes);//this.partidapresuLogic.getPartidaPresu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPartidaPresu(this.partidapresuReturnGeneral,this.partidapresuBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.partidapresuSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPartidaPresu(classes,this.partidapresuReturnGeneral,this.partidapresuBean,false);
					}
						
					if(this.partidapresuReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPartidaPresu(this.partidapresuReturnGeneral.getPartidaPresu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPartidaPresu(this.partidapresuReturnGeneral.getPartidaPresu());	
					}
						
					if(this.partidapresuReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPartidaPresu(this.partidapresuReturnGeneral.getPartidaPresu(),classes);//this.partidapresuBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPartidaPresu(this.partidapresu,classes);//this.partidapresuBean);									
				}
			
				if(PartidaPresuJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPartidaPresu(this.partidapresu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPartidaPresu(this.partidapresu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.partidapresuAnterior!=null) {
						this.partidapresu=this.partidapresuAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.partidapresuReturnGeneral=partidapresuLogic.procesarEventosPartidaPresusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.partidapresuLogic.getPartidaPresus(),this.partidapresu,this.partidapresuParameterGeneral,this.isEsNuevoPartidaPresu,classes);//this.partidapresuLogic.getPartidaPresu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.partidapresuSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.partidapresuSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.partidapresuReturnGeneral.getPartidaPresu(),partidapresuLogic.getPartidaPresus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.partidapresuReturnGeneral.getPartidaPresu(),this.partidapresus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPartidaPresu.repaint();
				
				//((AbstractTableModel) this.jTableDatosPartidaPresu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPartidaPresu();
			}
		}
	}
	
	public void actualizarVisualTableDatosPartidaPresu() throws Exception {
		
		PartidaPresuModel partidapresuModel=(PartidaPresuModel)this.jTableDatosPartidaPresu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			partidapresuModel.partidapresus=this.partidapresuLogic.getPartidaPresus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			partidapresuModel.partidapresus=this.partidapresus;
		}
		
		
		((PartidaPresuModel) this.jTableDatosPartidaPresu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPartidaPresu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpartidapresuAnterior(),this.partidapresuLogic.getPartidaPresus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpartidapresuAnterior(),this.partidapresus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPartidaPresu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPartidaPresu(PartidaPresu partidapresu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(partidapresu.getDetalleActivoFijos());
					this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
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
										
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.partidapresu,new Object(),generalEntityParameterGeneral,this.partidapresuReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.partidapresuSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PartidaPresuConstantesFunciones.getClassesRelationshipsOfPartidaPresu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PartidaPresuConstantesFunciones.getClassesRelationshipsFromStringsOfPartidaPresu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPartidaPresu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PartidaPresuBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.partidapresu,new Object(),generalEntityParameterGeneral,this.partidapresuReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPartidaPresu(PartidaPresuBean partidapresuBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(partidapresu.getDetalleActivoFijos());
					this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPartidaPresu(ArrayList<Classe> classes,PartidaPresuReturnGeneral partidapresuReturnGeneral,PartidaPresuBean partidapresuBean,Boolean conDefault) throws Exception {
		
			this.partidapresuBean.setDetalleActivoFijos(partidapresuReturnGeneral.getPartidaPresu().getDetalleActivoFijos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPartidaPresu(PartidaPresu partidapresu,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					partidapresu.setDetalleActivoFijos(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.partidapresu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPartidaPresu = new PartidaPresuDetalleFormJInternalFrame(jDesktopPane,this.partidapresuSessionBean.getConGuardarRelaciones(),this.partidapresuSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPartidaPresu);
		this.jInternalFrameDetalleFormPartidaPresu.setVisible(false);
		this.jInternalFrameDetalleFormPartidaPresu.setSelected(false);						
		
		this.jInternalFrameDetalleFormPartidaPresu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPartidaPresu.partidapresuLogic=this.partidapresuLogic;
		
		this.cargarCombosFrameForeignKeyPartidaPresu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePartidaPresu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePartidaPresu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPartidaPresu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPartidaPresu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPartidaPresu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPartidaPresu"));
		
		this.jInternalFrameDetalleFormPartidaPresu.jButtonModificarPartidaPresu.addActionListener(new ButtonActionListener(this,"ModificarPartidaPresu"));

		
		this.jInternalFrameDetalleFormPartidaPresu.jButtonModificarToolBarPartidaPresu.addActionListener(new ButtonActionListener(this,"ModificarToolBarPartidaPresu"));
					
		this.jInternalFrameDetalleFormPartidaPresu.jMenuItemModificarPartidaPresu.addActionListener(new ButtonActionListener(this,"MenuItemModificarPartidaPresu"));		
		
		
		
		this.jInternalFrameDetalleFormPartidaPresu.jButtonActualizarPartidaPresu.addActionListener (new ButtonActionListener(this,"ActualizarPartidaPresu"));
		
		
		this.jInternalFrameDetalleFormPartidaPresu.jButtonActualizarToolBarPartidaPresu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPartidaPresu"));
						
		this.jInternalFrameDetalleFormPartidaPresu.jMenuItemActualizarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPartidaPresu"));		
		
		
		
		this.jInternalFrameDetalleFormPartidaPresu.jButtonEliminarPartidaPresu.addActionListener (new ButtonActionListener(this,"EliminarPartidaPresu"));
		
		
		this.jInternalFrameDetalleFormPartidaPresu.jButtonEliminarToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"EliminarToolBarPartidaPresu"));
								
		this.jInternalFrameDetalleFormPartidaPresu.jMenuItemEliminarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPartidaPresu"));		
		
		
		
		this.jInternalFrameDetalleFormPartidaPresu.jButtonCancelarPartidaPresu.addActionListener (new ButtonActionListener(this,"CancelarPartidaPresu"));
		
		
		this.jInternalFrameDetalleFormPartidaPresu.jButtonCancelarToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"CancelarToolBarPartidaPresu"));
					
		this.jInternalFrameDetalleFormPartidaPresu.jMenuItemCancelarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPartidaPresu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPartidaPresu.jMenuItemDetalleCerrarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPartidaPresu"));		
		
		
		
		this.jInternalFrameDetalleFormPartidaPresu.jButtonGuardarCambiosToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPartidaPresu"));
		
		
		
		this.jInternalFrameDetalleFormPartidaPresu.jButtonGuardarCambiosToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPartidaPresu"));
		
		
		
		this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPartidaPresu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPartidaPresu.jButtonidPartidaPresuBusqueda.addActionListener(new ButtonActionListener(this,"idPartidaPresuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPartidaPresu.jButtonid_empresaPartidaPresuUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPartidaPresuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPartidaPresu.jButtonid_empresaPartidaPresuBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPartidaPresuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPartidaPresu.jButtoncodigoPartidaPresuBusqueda.addActionListener(new ButtonActionListener(this,"codigoPartidaPresuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPartidaPresu.jButtonnombrePartidaPresuBusqueda.addActionListener(new ButtonActionListener(this,"nombrePartidaPresuBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPartidaPresu.jTabbedPaneRelacionesPartidaPresu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPartidaPresu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePartidaPresu"));
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPartidaPresu"));
		}
		
		this.jTableDatosPartidaPresu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPartidaPresu"));
		
		this.jTableDatosPartidaPresu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPartidaPresu"));
		
		this.jButtonNuevoPartidaPresu.addActionListener(new ButtonActionListener(this,"NuevoPartidaPresu"));
		
		this.jButtonDuplicarPartidaPresu.addActionListener(new ButtonActionListener(this,"DuplicarPartidaPresu"));
		
		this.jButtonCopiarPartidaPresu.addActionListener(new ButtonActionListener(this,"CopiarPartidaPresu"));
		
		this.jButtonVerFormPartidaPresu.addActionListener(new ButtonActionListener(this,"VerFormPartidaPresu"));
		
		
		this.jButtonNuevoToolBarPartidaPresu.addActionListener(new ButtonActionListener(this,"NuevoToolBarPartidaPresu"));
			
		this.jButtonDuplicarToolBarPartidaPresu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPartidaPresu"));
			
		this.jMenuItemNuevoPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPartidaPresu"));
			
		this.jMenuItemDuplicarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPartidaPresu"));		
		
		
		this.jButtonNuevoRelacionesPartidaPresu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPartidaPresu"));
		
		
		this.jButtonNuevoRelacionesToolBarPartidaPresu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPartidaPresu"));
			
		this.jMenuItemNuevoRelacionesPartidaPresu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPartidaPresu"));		
		
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jButtonModificarPartidaPresu.addActionListener(new ButtonActionListener(this,"ModificarPartidaPresu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jButtonModificarToolBarPartidaPresu.addActionListener(new ButtonActionListener(this,"ModificarToolBarPartidaPresu"));
			
			this.jInternalFrameDetalleFormPartidaPresu.jMenuItemModificarPartidaPresu.addActionListener(new ButtonActionListener(this,"MenuItemModificarPartidaPresu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPartidaPresu.jButtonActualizarPartidaPresu.addActionListener (new ButtonActionListener(this,"ActualizarPartidaPresu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jButtonActualizarToolBarPartidaPresu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPartidaPresu"));
				
			this.jInternalFrameDetalleFormPartidaPresu.jMenuItemActualizarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPartidaPresu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jButtonEliminarPartidaPresu.addActionListener (new ButtonActionListener(this,"EliminarPartidaPresu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jButtonEliminarToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"EliminarToolBarPartidaPresu"));
						
			this.jInternalFrameDetalleFormPartidaPresu.jMenuItemEliminarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPartidaPresu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jButtonCancelarPartidaPresu.addActionListener (new ButtonActionListener(this,"CancelarPartidaPresu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jButtonCancelarToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"CancelarToolBarPartidaPresu"));
			
			this.jInternalFrameDetalleFormPartidaPresu.jMenuItemCancelarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPartidaPresu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPartidaPresu"));		
		
		
		this.jButtonCerrarPartidaPresu.addActionListener (new ButtonActionListener(this,"CerrarPartidaPresu"));
		
		
		this.jButtonCerrarToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"CerrarToolBarPartidaPresu"));
			
		this.jMenuItemCerrarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPartidaPresu"));
			
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jMenuItemDetalleCerrarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPartidaPresu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jButtonGuardarCambiosPartidaPresu.addActionListener (new ButtonActionListener(this,"GuardarCambiosPartidaPresu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jButtonGuardarCambiosToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPartidaPresu"));
		}
		
		this.jButtonCopiarToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"CopiarToolBarPartidaPresu"));
			
		this.jButtonVerFormToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"VerFormToolBarPartidaPresu"));
		
		this.jMenuItemGuardarCambiosPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPartidaPresu"));
			
		this.jMenuItemCopiarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPartidaPresu"));		
		
		this.jMenuItemVerFormPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPartidaPresu"));		
		
		
		this.jButtonGuardarCambiosTablaPartidaPresu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPartidaPresu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPartidaPresu"));
			
		this.jMenuItemGuardarCambiosTablaPartidaPresu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPartidaPresu"));		
		
		
		
		this.jButtonRecargarInformacionPartidaPresu.addActionListener (new ButtonActionListener(this,"RecargarInformacionPartidaPresu"));
					
		this.jButtonRecargarInformacionToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPartidaPresu"));
		
		this.jMenuItemRecargarInformacionPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPartidaPresu"));		
		
		
		
		this.jButtonAnterioresPartidaPresu.addActionListener (new ButtonActionListener(this,"AnterioresPartidaPresu"));
		
		
		this.jButtonAnterioresToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPartidaPresu"));
		
		this.jMenuItemAnterioresPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPartidaPresu"));		
		
		
		this.jButtonSiguientesPartidaPresu.addActionListener (new ButtonActionListener(this,"SiguientesPartidaPresu"));
		
		
		this.jButtonSiguientesToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPartidaPresu"));
			
		this.jMenuItemSiguientesPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPartidaPresu"));
			
		this.jMenuItemAbrirOrderByPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPartidaPresu"));
			
		this.jMenuItemMostrarOcultarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPartidaPresu"));
			
		this.jMenuItemDetalleAbrirOrderByPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPartidaPresu"));
			
		this.jMenuItemDetalleMostarOcultarPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPartidaPresu"));		
		
		
		this.jButtonNuevoGuardarCambiosPartidaPresu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPartidaPresu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPartidaPresu"));
			
		this.jMenuItemNuevoGuardarCambiosPartidaPresu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPartidaPresu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPartidaPresu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPartidaPresu"));

		this.jCheckBoxSeleccionadosPartidaPresu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPartidaPresu"));
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPartidaPresu"));
		}
		
		
		this.jComboBoxTiposRelacionesPartidaPresu.addActionListener (new ButtonActionListener(this,"TiposRelacionesPartidaPresu"));
			
		this.jComboBoxTiposAccionesPartidaPresu.addActionListener (new ButtonActionListener(this,"TiposAccionesPartidaPresu"));
					
		this.jComboBoxTiposSeleccionarPartidaPresu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPartidaPresu"));
			
		this.jTextFieldValorCampoGeneralPartidaPresu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPartidaPresu"));		
		
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPartidaPresu.jButtonidPartidaPresuBusqueda.addActionListener(new ButtonActionListener(this,"idPartidaPresuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPartidaPresu.jButtonid_empresaPartidaPresuUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPartidaPresuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPartidaPresu.jButtonid_empresaPartidaPresuBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPartidaPresuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPartidaPresu.jButtoncodigoPartidaPresuBusqueda.addActionListener(new ButtonActionListener(this,"codigoPartidaPresuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPartidaPresu.jButtonnombrePartidaPresuBusqueda.addActionListener(new ButtonActionListener(this,"nombrePartidaPresuBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPartidaPresu!=null) {
				this.jInternalFrameReporteDinamicoPartidaPresu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPartidaPresu"));
				this.jInternalFrameReporteDinamicoPartidaPresu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPartidaPresu"));
				this.jInternalFrameReporteDinamicoPartidaPresu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPartidaPresu"));
			}
			
			//this.jButtonCerrarReporteDinamicoPartidaPresu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPartidaPresu"));				
			//this.jButtonGenerarReporteDinamicoPartidaPresu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPartidaPresu"));
			//this.jButtonGenerarExcelReporteDinamicoPartidaPresu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPartidaPresu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPartidaPresu!=null) {
				this.jInternalFrameImportacionPartidaPresu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPartidaPresu"));
				this.jInternalFrameImportacionPartidaPresu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPartidaPresu"));
				this.jInternalFrameImportacionPartidaPresu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPartidaPresu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPartidaPresu.addActionListener (new ButtonActionListener(this,"AbrirOrderByPartidaPresu"));
			
			this.jButtonAbrirOrderByToolBarPartidaPresu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPartidaPresu"));			
			
			if(this.jInternalFrameOrderByPartidaPresu!=null) {
				this.jInternalFrameOrderByPartidaPresu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPartidaPresu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPartidaPresu.jTabbedPaneRelacionesPartidaPresu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPartidaPresu"));
		
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
            		closingInternalFramePartidaPresu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPartidaPresu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPartidaPresu = (JInternalFrameBase)event.getSource();
	            	
	            PartidaPresuBeanSwingJInternalFrame jInternalFrameParent=(PartidaPresuBeanSwingJInternalFrame)jInternalFrameDetalleFormPartidaPresu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPartidaPresuActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPartidaPresu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPartidaPresuListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPartidaPresu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPartidaPresu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPartidaPresuActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPartidaPresuActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPartidaPresuActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPartidaPresu";
		inputMap = this.jButtonNuevoPartidaPresu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPartidaPresu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPartidaPresuActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPartidaPresuActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPartidaPresuActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPartidaPresuActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPartidaPresu";
		inputMap = this.jButtonNuevoRelacionesPartidaPresu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPartidaPresu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPartidaPresuActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPartidaPresu";
		inputMap = this.jButtonModificarPartidaPresu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPartidaPresu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPartidaPresuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPartidaPresu";
		inputMap = this.jButtonActualizarPartidaPresu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPartidaPresu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPartidaPresuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPartidaPresu";
		inputMap = this.jButtonEliminarPartidaPresu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPartidaPresu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPartidaPresuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPartidaPresu";
		inputMap = this.jButtonCancelarPartidaPresu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPartidaPresu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPartidaPresuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPartidaPresu";
		inputMap = this.jButtonCerrarPartidaPresu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPartidaPresu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPartidaPresuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPartidaPresu.jButtonGuardarCambiosPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPartidaPresu";
		inputMap = this.jInternalFrameDetalleFormPartidaPresu.jButtonGuardarCambiosPartidaPresu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPartidaPresu.jButtonGuardarCambiosPartidaPresu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPartidaPresuActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPartidaPresu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPartidaPresuItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPartidaPresu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPartidaPresuActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPartidaPresu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPartidaPresuActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPartidaPresu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPartidaPresuActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPartidaPresu.jButtonidPartidaPresuBusqueda.addActionListener(new ButtonActionListener(this,"idPartidaPresuBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPartidaPresu.jButtonid_empresaPartidaPresuUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPartidaPresuUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPartidaPresu.jButtonid_empresaPartidaPresuBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPartidaPresuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPartidaPresu.jButtoncodigoPartidaPresuBusqueda.addActionListener(new ButtonActionListener(this,"codigoPartidaPresuBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPartidaPresu.jButtonnombrePartidaPresuBusqueda.addActionListener(new ButtonActionListener(this,"nombrePartidaPresuBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPartidaPresu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPartidaPresuActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPartidaPresuActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPartidaPresu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPartidaPresu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PartidaPresu partidapresuAux:this.partidapresuLogic.getPartidaPresus()) {
					partidapresuAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PartidaPresu partidapresuAux:partidapresus) {
					partidapresuAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPartidaPresuItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPartidaPresu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PartidaPresu partidapresuAux:this.partidapresuLogic.getPartidaPresus()) {
						partidapresuAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PartidaPresu partidapresuAux:partidapresus) {
						partidapresuAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PartidaPresu partidapresuAux:this.partidapresuLogic.getPartidaPresus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PartidaPresu partidapresuAux:partidapresus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPartidaPresu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPartidaPresu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPartidaPresu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPartidaPresu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPartidaPresuItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPartidaPresu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPartidaPresu.getSelectedRows();
			
			PartidaPresu partidapresuLocal=new PartidaPresu();
			
			//this.seleccionarTodosPartidaPresu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					partidapresuLocal =(PartidaPresu) this.partidapresuLogic.getPartidaPresus().toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					partidapresuLocal =(PartidaPresu) this.partidapresus.toArray()[this.jTableDatosPartidaPresu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				partidapresuLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PartidaPresu partidapresuAux:this.partidapresuLogic.getPartidaPresus()) {
						partidapresuAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PartidaPresu partidapresuAux:partidapresus) {
						partidapresuAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPartidaPresu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPartidaPresu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPartidaPresu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPartidaPresu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPartidaPresuItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPartidaPresuParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPartidaPresuActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPartidaPresu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPartidaPresu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PartidaPresu partidapresuAux:this.partidapresuLogic.getPartidaPresus()) {
				
						if(sTipoSeleccionar.equals(PartidaPresuConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							partidapresuAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PartidaPresuConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							partidapresuAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PartidaPresu partidapresuAux:partidapresus) {
					
						if(sTipoSeleccionar.equals(PartidaPresuConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							partidapresuAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PartidaPresuConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							partidapresuAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPartidaPresu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPartidaPresuActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPartidaPresu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPartidaPresu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPartidaPresu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePartidaPresu) {				
					conSplash=true;//false;										
					
					//this.startProcessPartidaPresu(conSplash);
				
					this.generarReportePartidaPresusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPartidaPresu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPartidaPresusSeleccionados();
				//this.jComboBoxTiposAccionesPartidaPresu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPartidaPresusSeleccionados(false);
				//this.jComboBoxTiposAccionesPartidaPresu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPartidaPresusSeleccionados(true);
				//this.jComboBoxTiposAccionesPartidaPresu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPartidaPresu();
				
				this.exportarPartidaPresusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPartidaPresu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPartidaPresus();
				//this.importarPartidaPresus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPartidaPresu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPartidaPresu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPartidaPresusSeleccionados();
				//this.jComboBoxTiposAccionesPartidaPresu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Partida Presupuestaria", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPartidaPresu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPartidaPresu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPartidaPresu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Partida Presupuestaria",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPartidaPresu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.setSelectedIndex(0);					
				}	
			} 			
			else if(PartidaPresuBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePartidaPresu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPartidaPresu(conSplash);
					
						//this.actualizarParametrosGeneralPartidaPresu();
						
						this.generarReporteProcesoAccionPartidaPresusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPartidaPresu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PartidaPresuBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Partida PresupuestariaS SELECCIONADOS?", "MANTENIMIENTO DE Partida Presupuestaria", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPartidaPresu();
				
						this.actualizarParametrosGeneralPartidaPresu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.partidapresuReturnGeneral=partidapresuLogic.procesarAccionPartidaPresusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.partidapresuLogic.getPartidaPresus(),this.partidapresuParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPartidaPresuReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPartidaPresu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPartidaPresu();
					
					PartidaPresuBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPartidaPresuReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPartidaPresu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPartidaPresu.jComboBoxTiposAccionesFormularioPartidaPresu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPartidaPresu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPartidaPresuActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPartidaPresu();
			
			if(this.jInternalFrameDetalleFormPartidaPresu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();		
			PartidaPresu partidapresu=new PartidaPresu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPartidaPresu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPartidaPresu.getSelectedItem();
			
			
			
			
			partidapresusSeleccionados=this.getPartidaPresusSeleccionados(true);
			//this.sTipoAccion;
			
			if(partidapresusSeleccionados.size()==1) {
				for(PartidaPresu partidapresuAux:partidapresusSeleccionados) {
					partidapresu=partidapresuAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Activo Fijo")) {
					jButtonDetalleActivoFijoActionPerformed(null,rowIndex,true,false,partidapresu);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPartidaPresu();
			
      		//this.finishProcessPartidaPresu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPartidaPresuReturnGeneral() throws Exception {
		if(this.partidapresuReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.partidapresuReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.partidapresuReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.partidapresuReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.partidapresuReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.partidapresuReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPartidaPresu(false);
		}
		
		if(this.partidapresuReturnGeneral.getConRetornoLista() || this.partidapresuReturnGeneral.getConRetornoObjeto()) {
			if(this.partidapresuReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.partidapresuLogic.setPartidaPresus(this.partidapresuReturnGeneral.getPartidaPresus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.partidapresuReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.partidapresuLogic.setPartidaPresu(this.partidapresuReturnGeneral.getPartidaPresu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPartidaPresu(false);
		}
	}
	
	public void actualizarParametrosGeneralPartidaPresu() throws Exception {
		
		
	}
	
	public ArrayList<PartidaPresu> getPartidaPresusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPartidaPresu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PartidaPresu partidapresuAux:partidapresuLogic.getPartidaPresus()) {
					if(partidapresuAux.getIsSelected()) {
						partidapresusSeleccionados.add(partidapresuAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PartidaPresu partidapresuAux:this.partidapresus) {
					if(partidapresuAux.getIsSelected()) {
						partidapresusSeleccionados.add(partidapresuAux);				
					}
				}
			}
			
			if(partidapresusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						partidapresusSeleccionados.addAll(this.partidapresuLogic.getPartidaPresus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						partidapresusSeleccionados.addAll(this.partidapresus);				
					}
				}
			}
		} else {
			partidapresusSeleccionados.add(this.partidapresu);
		}
		
		return partidapresusSeleccionados;
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
	
	public void generarReportePartidaPresusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPartidaPresusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPartidaPresusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPartidaPresusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPartidaPresusSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPartidaPresusSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Partida Presupuestaria",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPartidaPresusSeleccionados() throws Exception {
		ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();		
		
		partidapresusSeleccionados=this.getPartidaPresusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePartidaPresus("Todos",partidapresusSeleccionados);
		
	}	
	
	public void generarReporteNormalPartidaPresusSeleccionados() throws Exception {
		ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();		
		
		partidapresusSeleccionados=this.getPartidaPresusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePartidaPresus("Todos",partidapresusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPartidaPresusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();
		
		partidapresusSeleccionados=this.getPartidaPresusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePartidaPresus("Todos",partidapresusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPartidaPresusSeleccionados() throws Exception {
		ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPartidaPresu();
		
		
		partidapresusSeleccionados=this.getPartidaPresusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPartidaPresu();
		
		
		//this.generarReportePartidaPresus("Todos",partidapresusSeleccionados ,partidapresuImplementable,partidapresuImplementableHome);
	}
	
	public void mostrarImportacionPartidaPresus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPartidaPresu();
		
		this.abrirFrameImportacionPartidaPresu();		
		
			
		//this.generarReportePartidaPresus("Todos",partidapresusSeleccionados ,partidapresuImplementable,partidapresuImplementableHome);
	}
	
	public void importarPartidaPresus() throws Exception {		
	
	}
	
	public void exportarPartidaPresusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPartidaPresusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPartidaPresusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPartidaPresusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Partida Presupuestaria",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPartidaPresusSeleccionados() throws Exception {
		ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();		
		
		partidapresusSeleccionados=this.getPartidaPresusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"partidapresu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPartidaPresu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PartidaPresu partidapresuAux:partidapresusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPartidaPresu(partidapresuAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//partidapresuAux.setsDetalleGeneralEntityReporte(partidapresuAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Partida Presupuestaria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPartidaPresu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PartidaPresuConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PartidaPresuConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PartidaPresuConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PartidaPresuConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PartidaPresuConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPartidaPresu(PartidaPresu partidapresu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=partidapresu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=partidapresu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=partidapresu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=partidapresu.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=partidapresu.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPartidaPresusSeleccionados() throws Exception {
		ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();		
		
		partidapresusSeleccionados=this.getPartidaPresusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"partidapresu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PartidaPresus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPartidaPresu(row);				
				iRow++;
			}				
			
			for(PartidaPresu partidapresuAux:partidapresusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPartidaPresu(partidapresuAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Partida Presupuestaria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPartidaPresusSeleccionados() throws Exception {
		ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();		
		
		partidapresusSeleccionados=this.getPartidaPresusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"partidapresu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("partidapresus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("partidapresu");
			//elementRoot.appendChild(element);
		
			for(PartidaPresu partidapresuAux:partidapresusSeleccionados) {
				element = document.createElement("partidapresu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPartidaPresu(partidapresuAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Partida Presupuestaria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPartidaPresu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PartidaPresuConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PartidaPresuConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PartidaPresuConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PartidaPresuConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PartidaPresuConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPartidaPresu(PartidaPresu partidapresu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(partidapresu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(partidapresu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(partidapresu.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(partidapresu.getnombre());				
	}
	
	public void setFilaDatosExportarXmlPartidaPresu(PartidaPresu partidapresu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PartidaPresuConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(partidapresu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PartidaPresuConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(partidapresu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PartidaPresuConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(partidapresu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(PartidaPresuConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(partidapresu.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(PartidaPresuConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(partidapresu.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoPartidaPresusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PartidaPresu> partidapresusSeleccionados=new ArrayList<PartidaPresu>();
		
		partidapresusSeleccionados=this.getPartidaPresusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPartidaPresu(partidapresusSeleccionados);
		
		this.generarReportePartidaPresus("Todos",partidapresusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPartidaPresu(ArrayList<PartidaPresu> partidapresusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PartidaPresu partidapresuAux:partidapresusSeleccionados) {
				partidapresuAux.setsDetalleGeneralEntityReporte(partidapresuAux.toString());
			
				if(sTipoSeleccionar.equals(PartidaPresuConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					partidapresuAux.setsDescripcionGeneralEntityReporte1(partidapresuAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PartidaPresuConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					partidapresuAux.setsDescripcionGeneralEntityReporte1(partidapresuAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PartidaPresuConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					partidapresuAux.setsDescripcionGeneralEntityReporte1(partidapresuAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PartidaPresuConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPartidaPresu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPartidaPresu=true;
				this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=true;
				this.isVisibilidadCeldaGuardarCambiosPartidaPresu=true;
			}
			
			this.isVisibilidadCeldaModificarPartidaPresu=false;
			this.isVisibilidadCeldaActualizarPartidaPresu=false;
			this.isVisibilidadCeldaEliminarPartidaPresu=false;
			this.isVisibilidadCeldaCancelarPartidaPresu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPartidaPresu=true;
				} else {
					this.isVisibilidadCeldaGuardarPartidaPresu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPartidaPresu=false;
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=false;
			this.isVisibilidadCeldaGuardarCambiosPartidaPresu=false;
			this.isVisibilidadCeldaModificarPartidaPresu=false;
			this.isVisibilidadCeldaActualizarPartidaPresu=true;
			this.isVisibilidadCeldaEliminarPartidaPresu=false;
			this.isVisibilidadCeldaCancelarPartidaPresu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPartidaPresu=true;
				} else {
					this.isVisibilidadCeldaGuardarPartidaPresu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPartidaPresu=false;
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=false;
			this.isVisibilidadCeldaGuardarCambiosPartidaPresu=false;
			this.isVisibilidadCeldaModificarPartidaPresu=false;
			this.isVisibilidadCeldaActualizarPartidaPresu=true;
			this.isVisibilidadCeldaEliminarPartidaPresu=true;
			this.isVisibilidadCeldaCancelarPartidaPresu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPartidaPresu=true;
				} else {
					this.isVisibilidadCeldaGuardarPartidaPresu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPartidaPresu=false;
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=false;
			this.isVisibilidadCeldaGuardarCambiosPartidaPresu=false;
			this.isVisibilidadCeldaModificarPartidaPresu=false;
			this.isVisibilidadCeldaActualizarPartidaPresu=true;
			this.isVisibilidadCeldaEliminarPartidaPresu=false;
			this.isVisibilidadCeldaCancelarPartidaPresu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPartidaPresu=false;
				} else {
					this.isVisibilidadCeldaGuardarPartidaPresu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPartidaPresu=true;
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=true;
			this.isVisibilidadCeldaGuardarCambiosPartidaPresu=true;
			this.isVisibilidadCeldaModificarPartidaPresu=false;
			this.isVisibilidadCeldaActualizarPartidaPresu=false;
			this.isVisibilidadCeldaEliminarPartidaPresu=false;
			this.isVisibilidadCeldaCancelarPartidaPresu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPartidaPresu=true;
				} else {
					this.isVisibilidadCeldaGuardarPartidaPresu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPartidaPresu=false;
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=false;
			this.isVisibilidadCeldaGuardarCambiosPartidaPresu=false;
			this.isVisibilidadCeldaActualizarPartidaPresu=false;
			this.isVisibilidadCeldaEliminarPartidaPresu=false;
			this.isVisibilidadCeldaCancelarPartidaPresu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPartidaPresu=false;
				} else {
					this.isVisibilidadCeldaGuardarPartidaPresu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPartidaPresu=false;
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=false;
			this.isVisibilidadCeldaGuardarCambiosPartidaPresu=false;
			this.isVisibilidadCeldaModificarPartidaPresu=true;
			this.isVisibilidadCeldaActualizarPartidaPresu=false;
			this.isVisibilidadCeldaEliminarPartidaPresu=false;
			this.isVisibilidadCeldaCancelarPartidaPresu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPartidaPresu=false;
				} else {
					this.isVisibilidadCeldaGuardarPartidaPresu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PartidaPresuJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPartidaPresu=true;
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=true;
			this.isVisibilidadCeldaGuardarCambiosPartidaPresu=true;
		} else {
			this.actualizarEstadoPanelsPartidaPresu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPartidaPresu=false;
			//this.isVisibilidadCeldaVerFormPartidaPresu=false;
			this.isVisibilidadCeldaDuplicarPartidaPresu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!partidapresuSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=false;
		} else {
			this.isVisibilidadCeldaNuevoPartidaPresu=false;
			this.isVisibilidadCeldaGuardarCambiosPartidaPresu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(partidapresuSessionBean.getEsGuardarRelacionado()) {
			if(!partidapresuSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=false;												
			}
			
			this.jButtonCerrarPartidaPresu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPartidaPresu=false;
		}
		
		if(!this.permiteMantenimiento(this.partidapresu)) {
			this.isVisibilidadCeldaActualizarPartidaPresu=false;
			this.isVisibilidadCeldaEliminarPartidaPresu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPartidaPresu() {
		this.isVisibilidadCeldaNuevoPartidaPresu=false;
		this.isVisibilidadCeldaGuardarCambiosPartidaPresu=false;
	}
	
	public void actualizarEstadoPanelsPartidaPresu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPartidaPresu!=null) {
				this.jScrollPanelDatosEdicionPartidaPresu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPartidaPresu!=null) {
				this.jTabbedPaneBusquedasPartidaPresu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPartidaPresu!=null) {
				this.jScrollPanelDatosPartidaPresu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPartidaPresu!=null) {
				this.jPanelPaginacionPartidaPresu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPartidaPresu!=null) {
				this.jPanelParametrosReportesPartidaPresu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPartidaPresu!=null) {
				this.jScrollPanelDatosEdicionPartidaPresu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPartidaPresu!=null) {
				this.jTabbedPaneBusquedasPartidaPresu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPartidaPresu!=null) {
				this.jScrollPanelDatosPartidaPresu.setVisible(false);
			}
			
			if(this.jPanelPaginacionPartidaPresu!=null) {
				this.jPanelPaginacionPartidaPresu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPartidaPresu!=null) {
				this.jPanelParametrosReportesPartidaPresu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPartidaPresu!=null) {
				this.jScrollPanelDatosEdicionPartidaPresu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPartidaPresu!=null) {
				this.jTabbedPaneBusquedasPartidaPresu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPartidaPresu!=null) {
				this.jScrollPanelDatosPartidaPresu.setVisible(false);
			}
			
			if(this.jPanelPaginacionPartidaPresu!=null) {
				this.jPanelPaginacionPartidaPresu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPartidaPresu!=null) {
				this.jPanelParametrosReportesPartidaPresu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPartidaPresu!=null) {
				this.jScrollPanelDatosEdicionPartidaPresu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPartidaPresu!=null) {
				this.jTabbedPaneBusquedasPartidaPresu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPartidaPresu!=null) {
				this.jScrollPanelDatosPartidaPresu.setVisible(false);
			}
			
			if(this.jPanelPaginacionPartidaPresu!=null) {
				this.jPanelPaginacionPartidaPresu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPartidaPresu!=null) {
				this.jPanelParametrosReportesPartidaPresu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPartidaPresu!=null) {
				this.jScrollPanelDatosEdicionPartidaPresu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPartidaPresu!=null) {
				this.jTabbedPaneBusquedasPartidaPresu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPartidaPresu!=null) {
				this.jScrollPanelDatosPartidaPresu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPartidaPresu!=null) {
				this.jPanelPaginacionPartidaPresu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPartidaPresu!=null) {
				this.jPanelParametrosReportesPartidaPresu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPartidaPresu!=null) {
				this.jScrollPanelDatosEdicionPartidaPresu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPartidaPresu!=null) {
				this.jTabbedPaneBusquedasPartidaPresu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPartidaPresu!=null) {
				this.jScrollPanelDatosPartidaPresu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPartidaPresu!=null) {
				this.jPanelPaginacionPartidaPresu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPartidaPresu!=null) {
				this.jPanelParametrosReportesPartidaPresu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPartidaPresu!=null) {
				this.jScrollPanelDatosEdicionPartidaPresu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPartidaPresu!=null) {
				this.jTabbedPaneBusquedasPartidaPresu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPartidaPresu!=null) {
				this.jScrollPanelDatosPartidaPresu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPartidaPresu!=null) {
				this.jPanelPaginacionPartidaPresu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPartidaPresu!=null) {
				this.jPanelParametrosReportesPartidaPresu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.partidapresuSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPartidaPresu!=null) {
					this.jTabbedPaneBusquedasPartidaPresu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPartidaPresu!=null) {
				this.jPanelParametrosReportesPartidaPresu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPartidaPresu!=null) {
				this.jTabbedPaneBusquedasPartidaPresu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPartidaPresu!=null) {
				this.jPanelParametrosReportesPartidaPresu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionPartidaPresuParaDetalleActivoFijos() throws Exception {
		Boolean isPaginaPopupDetalleActivoFijo=false;

		try {

			if(this.partidapresuSessionBean==null) {
				this.partidapresuSessionBean=new PartidaPresuSessionBean();
			}

			if(this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoSessionBean==null) {
				this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
			}

			this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoSessionBean.setsPathNavegacionActual(partidapresuSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleActivoFijo=this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleActivoFijo(true);
			this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleActivoFijo(PartidaPresuConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionPartidaPresu(true);
			this.jInternalFrameDetalleFormPartidaPresu.detalleactivofijoSessionBean.setlidPartidaPresuActual(this.idPartidaPresuActual);

			partidapresuSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPartidaPresu(true);
			partidapresuSessionBean.setlIdPartidaPresuActualForeignKey(this.idPartidaPresuActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PartidaPresuSessionBean partidapresuSessionBean=new PartidaPresuSessionBean();
		
		if(this.partidapresuSessionBean==null) {
			this.partidapresuSessionBean=new PartidaPresuSessionBean();
		}
		
		this.partidapresuSessionBean.setsUltimaBusquedaPartidaPresu(this.getsAccionBusqueda());
		this.partidapresuSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.partidapresuSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			partidapresuSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PartidaPresuSessionBean partidapresuSessionBean=new PartidaPresuSessionBean();
		
		if(this.partidapresuSessionBean==null) {
			this.partidapresuSessionBean=new PartidaPresuSessionBean();
		}
		
		if(this.partidapresuSessionBean.getsUltimaBusquedaPartidaPresu()!=null&&!this.partidapresuSessionBean.getsUltimaBusquedaPartidaPresu().equals("")) {
			this.setsAccionBusqueda(partidapresuSessionBean.getsUltimaBusquedaPartidaPresu());
			this.setiNumeroPaginacion(partidapresuSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(partidapresuSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(partidapresuSessionBean.getid_empresa());
				partidapresuSessionBean.setid_empresa(-1L);
			}
		}
		
		this.partidapresuSessionBean.setsUltimaBusquedaPartidaPresu("");
		this.partidapresuSessionBean.setiNumeroPaginacion(PartidaPresuConstantesFunciones.INUMEROPAGINACION);
		this.partidapresuSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPartidaPresu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPartidaPresu() {
		this.updateBorderResaltarBusquedasFormularioPartidaPresu();
		this.updateVisibilidadBusquedasFormularioPartidaPresu();
		this.updateHabilitarBusquedasFormularioPartidaPresu();
	}
	
	public void updateBorderResaltarBusquedasFormularioPartidaPresu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPartidaPresu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPartidaPresu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPartidaPresu.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPartidaPresu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPartidaPresu.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPartidaPresu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarPartidaPresu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPartidaPresu() throws Exception {

		if(this.jInternalFrameDetalleFormPartidaPresu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPartidaPresu();
		this.updateVisibilidadResaltarControlesFormularioPartidaPresu();
		this.updateHabilitarResaltarControlesFormularioPartidaPresu();
		
	}
	
	public void updateBorderResaltarControlesFormularioPartidaPresu() throws Exception {
		if(this.jInternalFrameDetalleFormPartidaPresu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.partidapresuConstantesFunciones.resaltaridPartidaPresu!=null && this.jInternalFrameDetalleFormPartidaPresu!=null) {this.jInternalFrameDetalleFormPartidaPresu.jLabelidPartidaPresu.setBorder(this.partidapresuConstantesFunciones.resaltaridPartidaPresu);}
		if(this.partidapresuConstantesFunciones.resaltarid_empresaPartidaPresu!=null && this.jInternalFrameDetalleFormPartidaPresu!=null) {this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.setBorder(this.partidapresuConstantesFunciones.resaltarid_empresaPartidaPresu);}
		if(this.partidapresuConstantesFunciones.resaltarcodigoPartidaPresu!=null && this.jInternalFrameDetalleFormPartidaPresu!=null) {this.jInternalFrameDetalleFormPartidaPresu.jTextFieldcodigoPartidaPresu.setBorder(this.partidapresuConstantesFunciones.resaltarcodigoPartidaPresu);}
		if(this.partidapresuConstantesFunciones.resaltarnombrePartidaPresu!=null && this.jInternalFrameDetalleFormPartidaPresu!=null) {this.jInternalFrameDetalleFormPartidaPresu.jTextAreanombrePartidaPresu.setBorder(this.partidapresuConstantesFunciones.resaltarnombrePartidaPresu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPartidaPresu() throws Exception {		
		if(this.jInternalFrameDetalleFormPartidaPresu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
	
		//this.jInternalFrameDetalleFormPartidaPresu.jLabelidPartidaPresu.setVisible(this.partidapresuConstantesFunciones.mostraridPartidaPresu);
		this.jInternalFrameDetalleFormPartidaPresu.jPanelidPartidaPresu.setVisible(this.partidapresuConstantesFunciones.mostraridPartidaPresu);
		//this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.setVisible(this.partidapresuConstantesFunciones.mostrarid_empresaPartidaPresu);
		this.jInternalFrameDetalleFormPartidaPresu.jPanelid_empresaPartidaPresu.setVisible(this.partidapresuConstantesFunciones.mostrarid_empresaPartidaPresu);
		//this.jInternalFrameDetalleFormPartidaPresu.jTextFieldcodigoPartidaPresu.setVisible(this.partidapresuConstantesFunciones.mostrarcodigoPartidaPresu);
		this.jInternalFrameDetalleFormPartidaPresu.jPanelcodigoPartidaPresu.setVisible(this.partidapresuConstantesFunciones.mostrarcodigoPartidaPresu);
		//this.jInternalFrameDetalleFormPartidaPresu.jTextAreanombrePartidaPresu.setVisible(this.partidapresuConstantesFunciones.mostrarnombrePartidaPresu);
		this.jInternalFrameDetalleFormPartidaPresu.jPanelnombrePartidaPresu.setVisible(this.partidapresuConstantesFunciones.mostrarnombrePartidaPresu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPartidaPresu() throws Exception {
		if(this.jInternalFrameDetalleFormPartidaPresu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPartidaPresu!=null) {
	
		this.jInternalFrameDetalleFormPartidaPresu.jLabelidPartidaPresu.setEnabled(this.partidapresuConstantesFunciones.activaridPartidaPresu);
		this.jInternalFrameDetalleFormPartidaPresu.jComboBoxid_empresaPartidaPresu.setEnabled(this.partidapresuConstantesFunciones.activarid_empresaPartidaPresu);
		this.jInternalFrameDetalleFormPartidaPresu.jTextFieldcodigoPartidaPresu.setEnabled(this.partidapresuConstantesFunciones.activarcodigoPartidaPresu);
		this.jInternalFrameDetalleFormPartidaPresu.jTextAreanombrePartidaPresu.setEnabled(this.partidapresuConstantesFunciones.activarnombrePartidaPresu);
		}
	}
	
		
}