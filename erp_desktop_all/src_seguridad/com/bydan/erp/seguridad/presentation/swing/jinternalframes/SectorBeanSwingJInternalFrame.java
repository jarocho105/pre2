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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.SectorConstantesFunciones;
import com.bydan.erp.seguridad.util.SectorParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.SectorParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.SectorBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;

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

import com.bydan.erp.seguridad.business.entity.*;
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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
public class SectorBeanSwingJInternalFrame extends SectorJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SectorBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Sector> sectorValidator = new ClassValidator<Sector>(Sector.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Sector sector;	
	public Sector sectorAux;
	public Sector sectorAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Sector sectorTotales;
	public Long idSectorActual;
	public Long iIdNuevoSector=0L;
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

	public String sFinalQueryComboCiudad="";

	public List<Ciudad> ciudadsForeignKey;

	public List<Ciudad> getciudadsForeignKey() {
		return ciudadsForeignKey;
	}

	public void setciudadsForeignKey(List<Ciudad> ciudadsForeignKey) {
		this.ciudadsForeignKey = ciudadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ciudad ciudadForeignKey;

	public Ciudad getciudadForeignKey() {
		return ciudadForeignKey;
	}

	public void setciudadForeignKey(Ciudad ciudadForeignKey) {
		this.ciudadForeignKey = ciudadForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosRuta=false;

	public Boolean getIsTienePermisosRuta() {
		return isTienePermisosRuta;
	}

	public void setIsTienePermisosRuta(Boolean isTienePermisosRuta) {
		this.isTienePermisosRuta= isTienePermisosRuta;
	}


	public Boolean isTienePermisosSubSector=false;

	public Boolean getIsTienePermisosSubSector() {
		return isTienePermisosSubSector;
	}

	public void setIsTienePermisosSubSector(Boolean isTienePermisosSubSector) {
		this.isTienePermisosSubSector= isTienePermisosSubSector;
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
	
	public Boolean isPermisoTodoSector;
	public Boolean isPermisoNuevoSector;
	public Boolean isPermisoActualizarSector;
	public Boolean isPermisoActualizarOriginalSector;
	public Boolean isPermisoEliminarSector;
	public Boolean isPermisoGuardarCambiosSector;
	public Boolean isPermisoConsultaSector;
	public Boolean isPermisoBusquedaSector;
	public Boolean isPermisoReporteSector;
	public Boolean isPermisoPaginacionMedioSector;
	public Boolean isPermisoPaginacionAltoSector;
	public Boolean isPermisoPaginacionTodoSector;
	public Boolean isPermisoCopiarSector;
	public Boolean isPermisoVerFormSector;
	public Boolean isPermisoDuplicarSector;
	public Boolean isPermisoOrdenSector;
	
	
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
	
	public SectorParameterReturnGeneral sectorReturnGeneral;
	public SectorParameterReturnGeneral sectorParameterGeneral;
	
	

	public RutaLogic rutaOrigenLogic=null;

	public RutaLogic getRutaOrigenLogic() {
		return rutaOrigenLogic;
	}

	public void setRutaOrigenLogic(RutaLogic rutaOrigenLogic) {
		this.rutaOrigenLogic = rutaOrigenLogic;
	}


	public SubSectorLogic subsectorLogic=null;

	public SubSectorLogic getSubSectorLogic() {
		return subsectorLogic;
	}

	public void setSubSectorLogic(SubSectorLogic subsectorLogic) {
		this.subsectorLogic = subsectorLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSector=false;
	public Boolean esParaAccionDesdeFormularioSector=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SectorSessionBeanAdditional sectorSessionBeanAdditional=null;
	
	public SectorSessionBeanAdditional getSectorSessionBeanAdditional() {
		return this.sectorSessionBeanAdditional;
	}
	
	public void setSectorSessionBeanAdditional(SectorSessionBeanAdditional sectorSessionBeanAdditional) {
		try {
			this.sectorSessionBeanAdditional=sectorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SectorBeanSwingJInternalFrameAdditional sectorBeanSwingJInternalFrameAdditional=null;
	//public class SectorBeanSwingJInternalFrame
	
	public SectorBeanSwingJInternalFrameAdditional getSectorBeanSwingJInternalFrameAdditional() {
		return this.sectorBeanSwingJInternalFrameAdditional;
	}
	
	public void setSectorBeanSwingJInternalFrameAdditional(SectorBeanSwingJInternalFrameAdditional sectorBeanSwingJInternalFrameAdditional) {
		try {
			this.sectorBeanSwingJInternalFrameAdditional=sectorBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SectorLogic sectorLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Sector sectorBean;
	public SectorConstantesFunciones sectorConstantesFunciones;
	//public SectorParameterReturnGeneral sectorReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CiudadLogic ciudadLogic;
	
	//PARAMETROS
	
	
	//public List<Sector> sectors;	
	//public List<Sector> sectorsEliminados;
	//public List<Sector> sectorsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSector=false;
	public Boolean isVisibilidadCeldaDuplicarSector=true;
	public Boolean isVisibilidadCeldaCopiarSector=true;
	public Boolean isVisibilidadCeldaVerFormSector=true;
	public Boolean isVisibilidadCeldaOrdenSector=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSector=false;
	public Boolean isVisibilidadCeldaModificarSector=false;
	public Boolean isVisibilidadCeldaActualizarSector=false;
	public Boolean isVisibilidadCeldaEliminarSector=false;
	public Boolean isVisibilidadCeldaCancelarSector=false;
	public Boolean isVisibilidadCeldaGuardarSector=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSector=false;	
	
	
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoSector() {
		return this.iIdNuevoSector;
	}

	public void setiIdNuevoSector(Long iIdNuevoSector) {
		this.iIdNuevoSector = iIdNuevoSector;
	}
	
	public Long getidSectorActual() {
		return this.idSectorActual;
	}

	public void setidSectorActual(Long idSectorActual) {
		this.idSectorActual = idSectorActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Sector getsector() {
		return this.sector;
	}

	public void setsector(Sector sector) {
		this.sector = sector;
	}
	
	public Sector getsectorAux() {
		return this.sectorAux;
	}

	public void setsectorAux(Sector sectorAux) {
		this.sectorAux = sectorAux;
	}				
	
	public Sector getsectorAnterior() {
		return this.sectorAnterior;
	}

	public void setsectorAnterior(Sector sectorAnterior) {
		this.sectorAnterior = sectorAnterior;
	}	
	
	public Sector getsectorTotales() {
		return this.sectorTotales;
	}

	public void setsectorTotales(Sector sectorTotales) {
		this.sectorTotales = sectorTotales;
	}	
	
	public Sector getsectorBean() {
		return this.sectorBean;
	}

	public void setsectorBean(Sector sectorBean) {
		this.sectorBean = sectorBean;
	}	
	
	public SectorParameterReturnGeneral getsectorReturnGeneral() {
		return this.sectorReturnGeneral;
	}

	public void setsectorReturnGeneral(SectorParameterReturnGeneral sectorReturnGeneral) {
		this.sectorReturnGeneral = sectorReturnGeneral;
	}	
	
	
	public Long id_ciudadFK_IdCiudad=-1L;

	public Long getid_ciudadFK_IdCiudad() {
		return this.id_ciudadFK_IdCiudad;
	}

	public void setid_ciudadFK_IdCiudad(Long id_ciudadFK_IdCiudad) {
		this.id_ciudadFK_IdCiudad = id_ciudadFK_IdCiudad;
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
	
	
	public SectorLogic getSectorLogic()	{		
		return sectorLogic;
	}

	public void setSectorLogic(SectorLogic sectorLogic) {
		this.sectorLogic = sectorLogic;
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
	
	public Boolean getIsEsNuevoSector() {
		return isEsNuevoSector;
	}

	public void setIsEsNuevoSector(Boolean isEsNuevoSector) {
		this.isEsNuevoSector = isEsNuevoSector;
	}

	public Boolean getEsParaAccionDesdeFormularioSector() {
		return esParaAccionDesdeFormularioSector;
	}
	
	public void setEsParaAccionDesdeFormularioSector(Boolean esParaAccionDesdeFormularioSector) {
		this.esParaAccionDesdeFormularioSector = esParaAccionDesdeFormularioSector;
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

			if(this.sectorSessionBean==null) {
				this.sectorSessionBean=new SectorSessionBean();
			}

			if(!this.sectorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(sectorSessionBean.getlidEmpresaActual());
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

	public void cargarCombosCiudadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ciudadsForeignKey=new ArrayList<Ciudad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CiudadLogic ciudadLogic=new CiudadLogic();

			//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.sectorSessionBean==null) {
				this.sectorSessionBean=new SectorSessionBean();
			}

			if(!this.sectorSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

					ciudadLogic.getTodosCiudadsWithConnection(sFinalQuery,new Pagination());

					this.ciudadsForeignKey=ciudadLogic.getCiudads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCiudad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getEntityWithConnection(sectorSessionBean.getlidCiudadActual());
					this.ciudadsForeignKey.add(ciudadLogic.getCiudad());
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

					if(this.sector!=null) {
						this.sector.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSector!=null) {
						this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSector.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSector!=null) {
						if(this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.getItemCount()>0) {
							this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSectorGenerico)throws Exception
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
				jComboBoxid_empresaSectorGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSectorGenerico!=null && jComboBoxid_empresaSectorGenerico.getItemCount()>0) {
					jComboBoxid_empresaSectorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCiudadForeignKey(Long idCiudadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ciudadTemp!=null) {

					if(this.sector!=null) {
						this.sector.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormSector!=null) {
						this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadSector.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormSector!=null) {
						if(this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.getItemCount()>0) {
							this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxid_ciudadFK_IdCiudadSector!=null) {
						jComboBoxid_ciudadFK_IdCiudadSector.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxid_ciudadFK_IdCiudadSector!=null) {
							//jComboBoxid_ciudadFK_IdCiudadSector.setSelectedItem(ciudadTemp);
							if(jComboBoxid_ciudadFK_IdCiudadSector.getItemCount()>0) {
								jComboBoxid_ciudadFK_IdCiudadSector.setSelectedIndex(0);
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

	public String getActualCiudadForeignKeyDescripcion(Long idCiudadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}


			sDescripcion=CiudadConstantesFunciones.getCiudadDescripcion(ciudadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadSectorGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(ciudadTemp!=null) {
				jComboBoxid_ciudadSectorGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadSectorGenerico!=null && jComboBoxid_ciudadSectorGenerico.getItemCount()>0) {
					jComboBoxid_ciudadSectorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Sector sector,JComboBox jComboBoxid_empresaSectorGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSectorGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSectorGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				sector.setid_empresa(empresaAux.getId());
				sector.setempresa_descripcion(SectorConstantesFunciones.getEmpresaDescripcion(empresaAux));
				sector.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(Sector sector,JComboBox jComboBoxid_ciudadSectorGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadSectorGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadSectorGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				sector.setid_ciudad(ciudadAux.getId());
				sector.setciudad_descripcion(SectorConstantesFunciones.getCiudadDescripcion(ciudadAux));
				sector.setCiudad(ciudadAux);			}
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

					if(!SectorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSector!=null) { 
							this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSector!=null) { 
					}

					if(!SectorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCiudadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCiudad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SectorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSector!=null) { 
							this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSector!=null) { 
					}

					if(!SectorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SectorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ciudadFK_IdCiudadSector.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxid_ciudadFK_IdCiudadSector.addItem(ciudad);
							}
						}

						if(!SectorJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSector!=null) {
							this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSector!=null) {
							this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCiudadForeignKey(Ciudad ciudad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSector!=null) {
							this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormSector!=null) {
							this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ciudadFK_IdCiudadSector.setSelectedItem(ciudad);
						} else {
							this.jComboBoxid_ciudadFK_IdCiudadSector.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSector() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SectorConstantesFunciones.refrescarForeignKeysDescripcionesSector(this.sectorLogic.getSectors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SectorConstantesFunciones.refrescarForeignKeysDescripcionesSector(this.sectors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Ciudad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//sectorLogic.setSectors(this.sectors);
			sectorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SectorParameterReturnGeneral getSectorParameterGeneral() {
		return this.sectorParameterGeneral;
	}
	
	public void setSectorParameterGeneral(SectorParameterReturnGeneral sectorParameterGeneral) {
		this.sectorParameterGeneral = sectorParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSector() {
		return isPermisoTodoSector;
	}

	public void setIsPermisoTodoSector(Boolean isPermisoTodoSector) {
		this.isPermisoTodoSector = isPermisoTodoSector;
	}

	public Boolean getIsPermisoNuevoSector() {
		return isPermisoNuevoSector;
	}

	public void setIsPermisoNuevoSector(Boolean isPermisoNuevoSector) {
		this.isPermisoNuevoSector = isPermisoNuevoSector;
	}

	public Boolean getIsPermisoActualizarSector() {
		return isPermisoActualizarSector;
	}

	public void setIsPermisoActualizarSector(Boolean isPermisoActualizarSector) {
		this.isPermisoActualizarSector = isPermisoActualizarSector;
	}

	public Boolean getIsPermisoEliminarSector() {
		return isPermisoEliminarSector;
	}

	public void setIsPermisoEliminarSector(Boolean isPermisoEliminarSector) {
		this.isPermisoEliminarSector = isPermisoEliminarSector;
	}

	public Boolean getIsPermisoGuardarCambiosSector() {
		return isPermisoGuardarCambiosSector;
	}

	public void setIsPermisoGuardarCambiosSector(Boolean isPermisoGuardarCambiosSector) {
		this.isPermisoGuardarCambiosSector = isPermisoGuardarCambiosSector;
	}
	
	public Boolean getIsPermisoConsultaSector() {
		return isPermisoConsultaSector;
	}

	public void setIsPermisoConsultaSector(Boolean isPermisoConsultaSector) {
		this.isPermisoConsultaSector = isPermisoConsultaSector;
	}

	public Boolean getIsPermisoBusquedaSector() {
		return isPermisoBusquedaSector;
	}

	public void setIsPermisoBusquedaSector(Boolean isPermisoBusquedaSector) {
		this.isPermisoBusquedaSector = isPermisoBusquedaSector;
	}

	public Boolean getIsPermisoReporteSector() {
		return isPermisoReporteSector;
	}

	public void setIsPermisoReporteSector(Boolean isPermisoReporteSector) {
		this.isPermisoReporteSector = isPermisoReporteSector;
	}
	
	public Boolean getIsPermisoPaginacionMedioSector() {
		return isPermisoPaginacionMedioSector;
	}

	public void setIsPermisoPaginacionMedioSector(Boolean isPermisoPaginacionMedioSector) {
		this.isPermisoPaginacionMedioSector = isPermisoPaginacionMedioSector;
	}
	
	public Boolean getIsPermisoPaginacionTodoSector() {
		return isPermisoPaginacionTodoSector;
	}

	public void setIsPermisoPaginacionTodoSector(Boolean isPermisoPaginacionTodoSector) {
		this.isPermisoPaginacionTodoSector = isPermisoPaginacionTodoSector;
	}
	
	public Boolean getIsPermisoPaginacionAltoSector() {
		return isPermisoPaginacionAltoSector;
	}

	public void setIsPermisoPaginacionAltoSector(Boolean isPermisoPaginacionAltoSector) {
		this.isPermisoPaginacionAltoSector = isPermisoPaginacionAltoSector;
	}
	
	public Boolean getIsPermisoCopiarSector() {
		return isPermisoCopiarSector;
	}

	public void setIsPermisoCopiarSector(Boolean isPermisoCopiarSector) {
		this.isPermisoCopiarSector = isPermisoCopiarSector;
	}
	
	public Boolean getIsPermisoVerFormSector() {
		return isPermisoVerFormSector;
	}

	public void setIsPermisoVerFormSector(Boolean isPermisoVerFormSector) {
		this.isPermisoVerFormSector = isPermisoVerFormSector;
	}
	
	public Boolean getIsPermisoDuplicarSector() {
		return isPermisoDuplicarSector;
	}

	public void setIsPermisoDuplicarSector(Boolean isPermisoDuplicarSector) {
		this.isPermisoDuplicarSector = isPermisoDuplicarSector;
	}
	
	public Boolean getIsPermisoOrdenSector() {
		return isPermisoOrdenSector;
	}

	public void setIsPermisoOrdenSector(Boolean isPermisoOrdenSector) {
		this.isPermisoOrdenSector = isPermisoOrdenSector;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSector() {
		return isVisibilidadCeldaNuevoSector;
	}

	public void setIsVisibilidadCeldaNuevoSector(Boolean isVisibilidadCeldaNuevoSector) {
		this.isVisibilidadCeldaNuevoSector = isVisibilidadCeldaNuevoSector;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSector() {
		return isVisibilidadCeldaDuplicarSector;
	}

	public void setIsVisibilidadCeldaDuplicarSector(Boolean isVisibilidadCeldaDuplicarSector) {
		this.isVisibilidadCeldaDuplicarSector = isVisibilidadCeldaDuplicarSector;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSector() {
		return isVisibilidadCeldaCopiarSector;
	}

	public void setIsVisibilidadCeldaCopiarSector(Boolean isVisibilidadCeldaCopiarSector) {
		this.isVisibilidadCeldaCopiarSector = isVisibilidadCeldaCopiarSector;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSector() {
		return isVisibilidadCeldaVerFormSector;
	}

	public void setIsVisibilidadCeldaVerFormSector(Boolean isVisibilidadCeldaVerFormSector) {
		this.isVisibilidadCeldaVerFormSector = isVisibilidadCeldaVerFormSector;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSector() {
		return isVisibilidadCeldaOrdenSector;
	}

	public void setIsVisibilidadCeldaOrdenSector(Boolean isVisibilidadCeldaOrdenSector) {
		this.isVisibilidadCeldaOrdenSector = isVisibilidadCeldaOrdenSector;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSector() {
		return isVisibilidadCeldaNuevoRelacionesSector;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSector(Boolean isVisibilidadCeldaNuevoRelacionesSector) {
		this.isVisibilidadCeldaNuevoRelacionesSector = isVisibilidadCeldaNuevoRelacionesSector;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSector() {
		return isVisibilidadCeldaModificarSector;
	}

	public void setIsVisibilidadCeldaModificarSector(Boolean isVisibilidadCeldaModificarSector) {
		this.isVisibilidadCeldaModificarSector = isVisibilidadCeldaModificarSector;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSector() {
		return isVisibilidadCeldaActualizarSector;
	}

	public void setIsVisibilidadCeldaActualizarSector(Boolean isVisibilidadCeldaActualizarSector) {
		this.isVisibilidadCeldaActualizarSector = isVisibilidadCeldaActualizarSector;
	}

	public Boolean getIsVisibilidadCeldaEliminarSector() {
		return isVisibilidadCeldaEliminarSector;
	}

	public void setIsVisibilidadCeldaEliminarSector(Boolean isVisibilidadCeldaEliminarSector) {
		this.isVisibilidadCeldaEliminarSector = isVisibilidadCeldaEliminarSector;
	}

	public Boolean getIsVisibilidadCeldaCancelarSector() {
		return isVisibilidadCeldaCancelarSector;
	}

	public void setIsVisibilidadCeldaCancelarSector(Boolean isVisibilidadCeldaCancelarSector) {
		this.isVisibilidadCeldaCancelarSector = isVisibilidadCeldaCancelarSector;
	}

	public Boolean getIsVisibilidadCeldaGuardarSector() {
		return isVisibilidadCeldaGuardarSector;
	}

	public void setIsVisibilidadCeldaGuardarSector(Boolean isVisibilidadCeldaGuardarSector) {
		this.isVisibilidadCeldaGuardarSector = isVisibilidadCeldaGuardarSector;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSector() {
		return isVisibilidadCeldaGuardarCambiosSector;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSector(Boolean isVisibilidadCeldaGuardarCambiosSector) {
		this.isVisibilidadCeldaGuardarCambiosSector = isVisibilidadCeldaGuardarCambiosSector;
	}
		
	public SectorSessionBean getsectorSessionBean() {
		return this.sectorSessionBean;
	}
	
	public void setsectorSessionBean(SectorSessionBean sectorSessionBean) {
		this.sectorSessionBean=sectorSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSector(Sector sector)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(sector,null);
				this.setActualParaGuardarCiudadForeignKey(sector,null);
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
	
	public void bugActualizarReferenciaActual(Sector sector,Sector sectorAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSector(sector);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		sectorAux.setId(sector.getId());
		sectorAux.setVersionRow(sector.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSector();
		
			int intSelectedRow = this.jTableDatosSector.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSector(this.sector,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = sectorValidator.getInvalidValues(this.sector);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			sectorLogic.setDatosCliente(datosCliente);
			sectorLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				sectorAux=new  Sector();
				
				sectorAux.setIsNew(true);
				sectorAux.setIsChanged(true);
				
				sectorAux.setSectorOriginal(this.sector);
				
				sectorAux.setId(this.sector.getId());	
				sectorAux.setVersionRow(this.sector.getVersionRow());	
				sectorAux.setid_empresa(this.sector.getid_empresa());	
				sectorAux.setid_ciudad(this.sector.getid_ciudad());	
				sectorAux.setnombre(this.sector.getnombre());	
				sectorAux.setdescripcion(this.sector.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sectorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.sectorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(sectorAux,sectorLogic.getSectors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sectorAux,sectors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.sectorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.sectorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sectorLogic.saveSectors();//WithConnection
						//sectorLogic.getSetVersionRowSectors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.sector,sectorAux);
					
					this.refrescarForeignKeysDescripcionesSector();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.sectorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.getRutas().addAll(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutasEliminados);
							this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.getSubSectors().addAll(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutas.addAll(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutasEliminados);
							this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectors.addAll(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								sectorLogic.saveSectorRelaciones(sectorAux,this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.getRutas(),this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.getSubSectors());//WithConnection
								//sectorLogic.getSetVersionRowSectors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.sector,sectorAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.setRutas(new ArrayList<Ruta>());
							this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.setSubSectors(new ArrayList<SubSector>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutas= new ArrayList<Ruta>();
							this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectors= new ArrayList<SubSector>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.quitarFilaTotales();}
							sectorAux.setRutaOrigens(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.getRutas());

							if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.quitarFilaTotales();}
							sectorAux.setSubSectors(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.getSubSectors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.sectorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.sectorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(sectorAux,sectorLogic.getSectors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(sectorAux,sectors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.sector,sectorAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				sectorAux=new  Sector();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.sectorSessionBean.getEsGuardarRelacionado() 
					|| (this.sectorSessionBean.getEsGuardarRelacionado() && this.sector.getId()>=0)) {
						
					sectorAux.setIsNew(false);
				}
				
				sectorAux.setIsDeleted(false);
			
				sectorAux.setId(this.sector.getId());	
				sectorAux.setVersionRow(this.sector.getVersionRow());	
				sectorAux.setid_empresa(this.sector.getid_empresa());	
				sectorAux.setid_ciudad(this.sector.getid_ciudad());	
				sectorAux.setnombre(this.sector.getnombre());	
				sectorAux.setdescripcion(this.sector.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(sectorAux,sectorLogic.getSectors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sectorAux,sectors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.sectorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.sectorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sectorLogic.saveSectors();//WithConnection
						//sectorLogic.getSetVersionRowSectors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.sector,sectorAux);
					
					this.refrescarForeignKeysDescripcionesSector();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.sectorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.getRutas().addAll(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutasEliminados);
							this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.getSubSectors().addAll(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutas.addAll(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutasEliminados);
							this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectors.addAll(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								sectorLogic.saveSectorRelaciones(sectorAux,this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.getRutas(),this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.getSubSectors());//WithConnection
								//sectorLogic.getSetVersionRowSectors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.sector,sectorAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.setRutas(new ArrayList<Ruta>());
							this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.setSubSectors(new ArrayList<SubSector>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutas= new ArrayList<Ruta>();
							this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectors= new ArrayList<SubSector>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.quitarFilaTotales();}
							sectorAux.setRutaOrigens(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.getRutas());

							if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.quitarFilaTotales();}
							sectorAux.setSubSectors(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.getSubSectors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.sectorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.sectorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(sectorAux,sectorLogic.getSectors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(sectorAux,sectors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.sector,sectorAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				sectorAux=new  Sector();
				
				sectorAux.setIsNew(false);
				sectorAux.setIsChanged(false);
				
				sectorAux.setIsDeleted(true);
				
				sectorAux.setId(this.sector.getId());	
				sectorAux.setVersionRow(this.sector.getVersionRow());	
				sectorAux.setid_empresa(this.sector.getid_empresa());	
				sectorAux.setid_ciudad(this.sector.getid_ciudad());	
				sectorAux.setnombre(this.sector.getnombre());	
				sectorAux.setdescripcion(this.sector.getdescripcion());	
				
				if(this.sectorSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.sectorAux.getId()>=0) {	
						this.sectorsEliminados.add(sectorAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(sectorAux,sectorLogic.getSectors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sectorAux,sectors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.sectorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.sectorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sectorLogic.saveSectors();//WithConnection
						//sectorLogic.getSetVersionRowSectors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.sectorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.getRutas().addAll(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutasEliminados);
							this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.getSubSectors().addAll(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutas.addAll(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutasEliminados);
							this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectors.addAll(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jInternalFrameDetalleFormRuta.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								sectorLogic.saveSectorRelaciones(sectorAux,this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.getRutas(),this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.getSubSectors());//WithConnection
								//sectorLogic.getSetVersionRowSectors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.setRutas(new ArrayList<Ruta>());
							this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.setSubSectors(new ArrayList<SubSector>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutas= new ArrayList<Ruta>();
							this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectors= new ArrayList<SubSector>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.quitarFilaTotales();}
							sectorAux.setRutaOrigens(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.getRutas());

							if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.quitarFilaTotales();}
							sectorAux.setSubSectors(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.getSubSectors());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.sectorSessionBean.getEstaModoGuardarRelaciones() 
								|| this.sectorSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(sectorAux,sectorLogic.getSectors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(sectorAux,sectors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.getSectors().addAll(this.sectorsEliminados);
					
					sectorLogic.saveSectors();//WithConnection
					//sectorLogic.getSetVersionRowSectors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSector();
				
				this.sectorsEliminados= new ArrayList<Sector>();		
			}
			
			if(this.sectorSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Sector GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.sector=sectorAux;
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
      		//this.finishProcessSector();
      	}
		
	}	
	
	public void actualizarRelaciones(Sector sectorLocal) throws Exception {
		
		if(this.sectorSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				sectorLocal.setRutaOrigens(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.getRutas());
				sectorLocal.setSubSectors(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.getSubSectors());
			
			} else {
			
				sectorLocal.setRutaOrigens(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutas);
				sectorLocal.setSubSectors(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectors);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Sector sectorLocal) throws Exception {	
		if(this.sectorSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				sectorLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				sectorLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSectorActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSector.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = sectorValidator.getInvalidValues(this.sector);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Sector sector,List<Sector> sectors) throws Exception {
		try	{		
			SectorConstantesFunciones.actualizarLista(sector,sectors,this.sectorSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Sector sector,List<Sector> sectors) throws Exception {
		try	{			
			SectorConstantesFunciones.actualizarSelectedLista(sector,sectors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Sector> sectorsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				sectorsLocal=this.sectorLogic.getSectors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				sectorsLocal=this.sectors;
			}
			//ARCHITECTURE
		
			for(Sector sectorLocal:sectorsLocal) {
				if(this.permiteMantenimiento(sectorLocal) && sectorLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SectorConstantesFunciones.getSectorLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SectorConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSector.jLabelid_ciudadSector,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SectorConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSector.jLabelnombreSector,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SectorConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSector.jLabeldescripcionSector,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSector!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSector.jLabelid_ciudadSector,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSector.jLabelnombreSector,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSector.jLabeldescripcionSector,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Ruta")) {
			if(this.sector==null) {
				this.sector= new Sector();
			}

			if(this.sectorSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoSector
				this.setVariablesFormularioToObjetoActualSector(this.sector,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);

				this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.getruta().setSectorOrigen(this.sector);
			}

			return;
		}
		 else  if(sTipo.equals("SubSector")) {
			if(this.sector==null) {
				this.sector= new Sector();
			}

			if(this.sectorSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoSector
				this.setVariablesFormularioToObjetoActualSector(this.sector,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);

				this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.getsubsector().setSector(this.sector);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoSector--;	
		
		
		this.sectorAux=new Sector();
		
		this.sectorAux.setId(this.iIdNuevoSector);
		this.sectorAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sectorLogic.getSectors().add(this.sectorAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.sectors.add(this.sectorAux);
		}
		//ARCHITECTURE
		
		this.sector=this.sectorAux;
		
		if(SectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSector(this.sector);
			this.setVariablesObjetoActualToFormularioForeignKeySector(this.sector);
		}
				
		//this.setDefaultControlesSector();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySector();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySector();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySector();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSector(this.sectorBean,this.sector,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SectorConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.sectorSessionBean.getConGuardarRelaciones()) {
			classes=SectorConstantesFunciones.getClassesRelationshipsOfSector(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.sectorReturnGeneral=sectorLogic.procesarEventosSectorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sectorLogic.getSectors(),this.sector,this.sectorParameterGeneral,this.isEsNuevoSector,classes);//this.sectorLogic.getSector()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSector(this.sectorReturnGeneral,this.sectorBean,false);
		
		if(this.sectorReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySector(this.sectorReturnGeneral.getSector());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSector(this.sectorReturnGeneral.getSector());
		}
		
		if(this.sectorReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSector(this.sectorReturnGeneral.getSector(),classes);//this.sectorBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSector(this.sector,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySector();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySector();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SectorBeanSwingJInternalFrameAdditional.RecargarFormSector(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSector(false);
						
			if(sectorSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaSessionBean.getEsGuardarRelacionado() && RutaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRutaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorSessionBean.getEsGuardarRelacionado() && SubSectorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubSectorActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(SectorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSector();
			}
			
			this.actualizarVisualTableDatosSector();
			
			this.jTableDatosSector.setRowSelectionInterval(this.getIndiceNuevoSector(), this.getIndiceNuevoSector());
			
			this.seleccionarFilaTablaSectorActual();
						
			this.actualizarEstadoCeldasBotonesSector("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSector(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSector.jTextAreanombreSector.setEnabled(isHabilitar && this.sectorConstantesFunciones.activarnombreSector);
		this.jInternalFrameDetalleFormSector.jTextAreadescripcionSector.setEnabled(isHabilitar && this.sectorConstantesFunciones.activardescripcionSector);	
		//
		this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.setEnabled(isHabilitar && this.sectorConstantesFunciones.activarid_empresaSector);
		this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.setEnabled(isHabilitar && this.sectorConstantesFunciones.activarid_ciudadSector);
	};
	
	public void setDefaultControlesSector() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSector(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.sectorSessionBean.setConGuardarRelaciones(true);			
			this.sectorSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSector.jTabbedPaneRelacionesSector.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.sectorSessionBean.setConGuardarRelaciones(false);			
			this.sectorSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSector.jTabbedPaneRelacionesSector.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoSector() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sector sectorAux:this.sectorLogic.getSectors()) {
				if(sectorAux.getId().equals(this.iIdNuevoSector)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sector sectorAux:this.sectors) {
				if(sectorAux.getId().equals(this.iIdNuevoSector)) {
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
	
	public int getIndiceActualSector(Sector sector,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sector sectorAux:this.sectorLogic.getSectors()) {
				if(sectorAux.getId().equals(sector.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sector sectorAux:this.sectors) {
				if(sectorAux.getId().equals(sector.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSector(Sector sectorOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sector sectorAux:this.sectorLogic.getSectors()) {
				if(sectorAux.getSectorOriginal().getId().equals(sectorOriginal.getId())) {
					existe=true;
					sectorOriginal.setId(sectorAux.getId());
					sectorOriginal.setVersionRow(sectorAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sector sectorAux:this.sectors) {
				if(sectorAux.getSectorOriginal().getId().equals(sectorOriginal.getId())) {
					existe=true;
					sectorOriginal.setId(sectorAux.getId());
					sectorOriginal.setVersionRow(sectorAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSector(Boolean esParaCancelar) throws Exception {
		sectorsAux=new ArrayList<Sector>();
		sectorAux=new Sector();
		
		if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Sector sectorAux:this.sectorLogic.getSectors()) {
					if(sectorAux.getId()<0) {
						sectorsAux.add(sectorAux);
					}		
				}
				this.iIdNuevoSector=0L;
				this.sectorLogic.getSectors().removeAll(sectorsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sector sectorAux:this.sectors) {
					if(sectorAux.getId()<0) {
						sectorsAux.add(sectorAux);
					}		
				}
				this.iIdNuevoSector=0L;
				this.sectors.removeAll(sectorsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSector 
					&& this.sectorLogic.getSectors().size()>0
					) {
					sectorAux=this.sectorLogic.getSectors().get(this.sectorLogic.getSectors().size() - 1);
				
					if(sectorAux.getId()<0) {
						this.sectorLogic.getSectors().remove(sectorAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSector && this.sectors.size()>0) {
					sectorAux=this.sectors.get(this.sectors.size() - 1);
				
					if(sectorAux.getId()<0) {
						this.sectors.remove(sectorAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSector(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(sector.getId()<0) {
				this.sectorLogic.getSectors().remove(this.sector);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(sector.getId()<0) {
				this.sectors.remove(this.sector);
			}
		}			
	}
	
	public void setEstadosInicialesSector(List<Sector> sectorsAux) throws Exception {
		SectorConstantesFunciones.setEstadosInicialesSector(sectorsAux);
	}
	
	public void setEstadosInicialesSector(Sector sectorAux) throws Exception {
		SectorConstantesFunciones.setEstadosInicialesSector(sectorAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSectorActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSector("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSectorActual()) {
				if(!this.isEsNuevoSector) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSector("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSector=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSectorActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sector ?", "MANTENIMIENTO DE Sector", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSector("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Sector sector) throws Exception {
		SectorConstantesFunciones.seleccionarAsignar(this.sector,sector);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSector=this.isPermisoActualizarOriginalSector;
			
			
			this.seleccionarAsignar(sector);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SectorConstantesFunciones.quitarEspaciosSector(this.sector,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSector("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.sectorSessionBean.setsFuncionBusquedaRapida(this.sectorSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSector) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSector(esParaCancelar);				
				this.cancelarNuevoSector(esParaCancelar);								
			}
			
			this.sector=new Sector();
			
			this.inicializarSector();
			
			this.actualizarEstadoCeldasBotonesSector("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSector() throws Exception {
		try {
			SectorConstantesFunciones.inicializarSector(this.sector);
			
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
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.sectorLogic.getSectors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSectors(String sAccionBusqueda,List<Sector> sectorsParaReportes) throws Exception {
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
					sPathReporteFinal="Sector"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SectorMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SectorMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Sector"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sectores");		
		parameters.put("busquedapor", SectorConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Ruta.class));
			classes.add(new Classe(SubSector.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					SectorLogic sectorLogicAuxiliar=new SectorLogic();
					sectorLogicAuxiliar.setDatosCliente(sectorLogic.getDatosCliente());				
					sectorLogicAuxiliar.setSectors(sectorsParaReportes);
					
					sectorLogicAuxiliar.cargarRelacionesLoteForeignKeySectorWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					sectorsParaReportes=sectorLogicAuxiliar.getSectors();
					
					//sectorLogic.getNewConnexionToDeep();
					
					//for (Sector sector:sectorsParaReportes) {
					//	sectorLogic.deepLoad(sector, false, DeepLoadType.INCLUDE, classes);
					//}						
					//sectorLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//sectorLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileRuta = AuxiliarReportes.class.getResourceAsStream("RutaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_ruta", reportFileRuta);

			InputStream reportFileSubSector = AuxiliarReportes.class.getResourceAsStream("SubSectorDetalleRelacionesDesign.jasper");
			parameters.put("subreport_subsector", reportFileSubSector);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSector=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SectorConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SectorConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSector=new JRBeanArrayDataSource(SectorJInternalFrame.TraerSectorBeans(sectorsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSector);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SectorConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SectorConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SectorBean.TraerSectorBeans(sectorsParaReportes).toArray()));
							
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
				this.generarExcelReporteSectors(sAccionBusqueda,sTipoArchivoReporte,sectorsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSectors(sAccionBusqueda,sTipoArchivoReporte,sectorsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSectorActionPerformed(null);
					//this.generarExcelReporteSectors(sAccionBusqueda,sTipoArchivoReporte,sectorsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSectors(sAccionBusqueda,sTipoArchivoReporte,sectorsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSectors(sAccionBusqueda,sTipoArchivoReporte,sectorsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSectors(sAccionBusqueda,sTipoArchivoReporte,sectorsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSectors(String sAccionBusqueda,String sTipoArchivoReporte,List<Sector> sectorsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sector";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Sectors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSector("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Sector sector : sectorsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SectorConstantesFunciones.generarExcelReporteDataSector("NORMAL",row,workbook,sector,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSector(String sTipo,Row row,Workbook workbook) {
		
		SectorConstantesFunciones.generarExcelReporteHeaderSector(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSectors(String sAccionBusqueda,String sTipoArchivoReporte,List<Sector> sectorsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sector_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Sectors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Sector sector : sectorsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SectorConstantesFunciones.getSectorDescripcion(sector));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SectorConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SectorConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sector.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SectorConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SectorConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sector.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SectorConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SectorConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sector.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SectorConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SectorConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sector.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSectors(String sAccionBusqueda,String sTipoArchivoReporte,List<Sector> sectorsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Sector> sectorsRespaldo=null;
		
		classes=SectorConstantesFunciones.getClassesRelationshipsOfSector(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.sectorLogic.setDatosCliente(this.datosCliente);
		this.sectorLogic.setDatosDeep(this.datosDeep);
		this.sectorLogic.setIsConDeep(true);
		
		sectorsRespaldo=this.sectorLogic.getSectors();
		
		this.sectorLogic.setSectors(sectorsParaReportes);	
		this.sectorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		sectorsParaReportes=this.sectorLogic.getSectors();
		this.sectorLogic.setSectors(sectorsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sector_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Sectors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSector("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Sector sector : sectorsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSector("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SectorConstantesFunciones.generarExcelReporteDataSector("NORMAL",row,workbook,sector,cellStyleDataAux);
		
			
			


				//Ruta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RutaConstantesFunciones.SCLASSWEBTITULO))) {

				if(sector.getRutaOrigens()!=null && sector.getRutaOrigens().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RutaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RutaConstantesFunciones.generarExcelReporteHeaderRuta("RELACIONADO",row,workbook);
				}

				if(sector.getRutaOrigens()!=null) {
					i2=0;
					for(Ruta ruta : sector.getRutaOrigens()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RutaConstantesFunciones.generarExcelReporteDataRuta("RELACIONADO",row,workbook,ruta,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//SubSector
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SubSectorConstantesFunciones.SCLASSWEBTITULO))) {

				if(sector.getSubSectors()!=null && sector.getSubSectors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SubSectorConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SubSectorConstantesFunciones.generarExcelReporteHeaderSubSector("RELACIONADO",row,workbook);
				}

				if(sector.getSubSectors()!=null) {
					i2=0;
					for(SubSector subsector : sector.getSubSectors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SubSectorConstantesFunciones.generarExcelReporteDataSubSector("RELACIONADO",row,workbook,subsector,cellStyleDataAuxHijo);
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
		cell.setCellValue(SectorConstantesFunciones.getSectorDescripcion(sector));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSector.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSector.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSector.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSector.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSector() throws Exception {		
		this.startProcessSector(true);
	}
	
	public void startProcessSector(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSector ,this.jPanelParametrosReportesSector, this.jScrollPanelDatosSector,this.jPanelPaginacionSector, this.jScrollPanelDatosEdicionSector, this.jPanelAccionesSector,this.jPanelAccionesFormularioSector,this.jmenuBarSector,this.jmenuBarDetalleSector,this.jTtoolBarSector,this.jTtoolBarDetalleSector);		
		
		final JTabbedPane jTabbedPaneBusquedasSector=this.jTabbedPaneBusquedasSector; 
		
		final JPanel jPanelParametrosReportesSector=this.jPanelParametrosReportesSector;
		//final JScrollPane jScrollPanelDatosSector=this.jScrollPanelDatosSector;
		final JTable jTableDatosSector=this.jTableDatosSector;		
		final JPanel jPanelPaginacionSector=this.jPanelPaginacionSector;
		//final JScrollPane jScrollPanelDatosEdicionSector=this.jScrollPanelDatosEdicionSector;
		final JPanel jPanelAccionesSector=this.jPanelAccionesSector;
		
		JPanel jPanelCamposAuxiliarSector=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSector=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSector!=null) {
			jPanelCamposAuxiliarSector=this.jInternalFrameDetalleFormSector.jPanelCamposSector;
			jPanelAccionesFormularioAuxiliarSector=this.jInternalFrameDetalleFormSector.jPanelAccionesFormularioSector;
		}
		
		final JPanel jPanelCamposSector=jPanelCamposAuxiliarSector;
		final JPanel jPanelAccionesFormularioSector=jPanelAccionesFormularioAuxiliarSector;
		
		
		final JMenuBar jmenuBarSector=this.jmenuBarSector;
		final JToolBar jTtoolBarSector=this.jTtoolBarSector;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSector=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSector=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSector!=null) {
			jmenuBarDetalleAuxiliarSector=this.jInternalFrameDetalleFormSector.jmenuBarDetalleSector;
			jTtoolBarDetalleAuxiliarSector=this.jInternalFrameDetalleFormSector.jTtoolBarDetalleSector;
		}
		
		final JMenuBar jmenuBarDetalleSector=jmenuBarDetalleAuxiliarSector;
		final JToolBar jTtoolBarDetalleSector=jTtoolBarDetalleAuxiliarSector;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSector;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSector;
			processRunnable.jTableDatos=jTableDatosSector;
			processRunnable.jPanelCampos=jPanelCamposSector;
			processRunnable.jPanelPaginacion=jPanelPaginacionSector;
			processRunnable.jPanelAcciones=jPanelAccionesSector;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSector;
			
			
			processRunnable.jmenuBar=jmenuBarSector;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSector;
			processRunnable.jTtoolBar=jTtoolBarSector;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSector;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSector ,jPanelParametrosReportesSector,jTableDatosSector, /*jScrollPanelDatosSector,*/jPanelCamposSector,jPanelPaginacionSector, /*jScrollPanelDatosEdicionSector,*/ jPanelAccionesSector,jPanelAccionesFormularioSector,jmenuBarSector,jmenuBarDetalleSector,jTtoolBarSector,jTtoolBarDetalleSector);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSector ,jPanelParametrosReportesSector, jScrollPanelDatosSector,jPanelPaginacionSector, jScrollPanelDatosEdicionSector, jPanelAccionesSector,jPanelAccionesFormularioSector,jmenuBarSector,jmenuBarDetalleSector,jTtoolBarSector,jTtoolBarDetalleSector);
						
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
	
	public void finishProcessSector() {// throws Exception 
		this.finishProcessSector(true);
	}
	
	public void finishProcessSector(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSector ,this.jPanelParametrosReportesSector, this.jScrollPanelDatosSector,this.jPanelPaginacionSector, this.jScrollPanelDatosEdicionSector, this.jPanelAccionesSector,this.jPanelAccionesFormularioSector,this.jmenuBarSector,this.jmenuBarDetalleSector,this.jTtoolBarSector,this.jTtoolBarDetalleSector);		
		
		final JTabbedPane jTabbedPaneBusquedasSector=this.jTabbedPaneBusquedasSector; 
		
		final JPanel jPanelParametrosReportesSector=this.jPanelParametrosReportesSector;
		//final JScrollPane jScrollPanelDatosSector=this.jScrollPanelDatosSector;
		final JTable jTableDatosSector=this.jTableDatosSector;		
		final JPanel jPanelPaginacionSector=this.jPanelPaginacionSector;
		//final JScrollPane jScrollPanelDatosEdicionSector=this.jScrollPanelDatosEdicionSector;
		final JPanel jPanelAccionesSector=this.jPanelAccionesSector;
		
		JPanel jPanelCamposAuxiliarSector=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSector=new JPanel();
		
		if(this.jInternalFrameDetalleFormSector!=null) {
			jPanelCamposAuxiliarSector=this.jInternalFrameDetalleFormSector.jPanelCamposSector;
			jPanelAccionesFormularioAuxiliarSector=this.jInternalFrameDetalleFormSector.jPanelAccionesFormularioSector;
		}
		
		final JPanel jPanelCamposSector=jPanelCamposAuxiliarSector;
		final JPanel jPanelAccionesFormularioSector=jPanelAccionesFormularioAuxiliarSector;
		
		
		final JMenuBar jmenuBarSector=this.jmenuBarSector;		
		final JToolBar jTtoolBarSector=this.jTtoolBarSector;
				
		JMenuBar jmenuBarDetalleAuxiliarSector=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSector=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSector!=null) {
			jmenuBarDetalleAuxiliarSector=this.jInternalFrameDetalleFormSector.jmenuBarDetalleSector;
			jTtoolBarDetalleAuxiliarSector=this.jInternalFrameDetalleFormSector.jTtoolBarDetalleSector;		
		}
		
		final JMenuBar jmenuBarDetalleSector=jmenuBarDetalleAuxiliarSector;
		final JToolBar jTtoolBarDetalleSector=jTtoolBarDetalleAuxiliarSector;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSector;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSector;
			processRunnable.jTableDatos=jTableDatosSector;
			processRunnable.jPanelCampos=jPanelCamposSector;
			processRunnable.jPanelPaginacion=jPanelPaginacionSector;
			processRunnable.jPanelAcciones=jPanelAccionesSector;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSector;
			
			
			processRunnable.jmenuBar=jmenuBarSector;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSector;
			processRunnable.jTtoolBar=jTtoolBarSector;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSector;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSector ,jPanelParametrosReportesSector, jTableDatosSector,/*jScrollPanelDatosSector,*/jPanelCamposSector,jPanelPaginacionSector, /*jScrollPanelDatosEdicionSector,*/ jPanelAccionesSector,jPanelAccionesFormularioSector,jmenuBarSector,jmenuBarDetalleSector,jTtoolBarSector,jTtoolBarDetalleSector));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSector(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSector(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSector(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSector(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSector,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSector,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSector(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSector,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSector,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.sectorConstantesFunciones.getsFinalQuerySector();
		String  finalQueryPaginacionTodos=this.sectorConstantesFunciones.getsFinalQuerySector();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SectorConstantesFunciones.getArrayColumnasGlobalesNoSector(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SectorConstantesFunciones.getArrayColumnasGlobalesSector(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SectorConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.sectorsEliminados= new ArrayList<Sector>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSector();
		
				///*SectorSessionBean*/this.sectorSessionBean=new SectorSessionBean();
			
			if(this.sectorSessionBean==null) {
				this.sectorSessionBean=new SectorSessionBean();
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
					this.iNumeroPaginacion=SectorConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SectorConstantesFunciones.getClassesForeignKeysOfSector(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/sector."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			sectorsAux= new ArrayList<Sector>();
			
				
			sectorLogic.setDatosCliente(this.datosCliente);
			sectorLogic.setDatosDeep(this.datosDeep);
			sectorLogic.setIsConDeep(true);
			
			
			sectorLogic.getSectorDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					sectorLogic.getTodosSectors(finalQueryGlobal,pagination);
					
					//sectorLogic.getTodosSectorsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(sectorLogic.getSectors()==null|| sectorLogic.getSectors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							sectorsAux= new ArrayList<Sector>();
							sectorsAux.addAll(sectorLogic.getSectors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sectorsAux= new ArrayList<Sector>();
							sectorsAux.addAll(sectors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							sectorLogic.getTodosSectors(finalQueryGlobal+"",this.pagination);												
							
							//sectorLogic.getTodosSectorsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSectors("Todos",sectorLogic.getSectors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							sectorLogic.setSectors(new ArrayList<Sector>());					
							sectorLogic.getSectors().addAll(sectorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sectors=new ArrayList<Sector>();
							sectors.addAll(sectorsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSector=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSector=this.idActual;
				
				} else if(this.idSectorActual!=null && this.idSectorActual!=0L) {
					idSector=idSectorActual;
				}
				
					
				this.sDetalleReporte=SectorConstantesFunciones.getDetalleIndicePorId(idSector);
				
				this.sectors=new ArrayList<Sector>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					sectorLogic.getEntity(idSector);
					
					//sectorLogic.getEntityWithConnection(idSector);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sectorLogic.setSectors(new ArrayList<Sector>());
					sectorLogic.getSectors().add(sectorLogic.getSector());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sectors=new ArrayList<Sector>();
					this.sectors.add(sector);
				}
				
				if(sectorLogic.getSector()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCiudad")) {
				this.sDetalleReporte=SectorConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					sectorLogic.getSectorsFK_IdCiudad(finalQueryGlobal,pagination,id_ciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SectorConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SectorConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=sectorLogic.getSectors()==null||sectorLogic.getSectors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=sectors==null|| sectors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						sectorsAux=new ArrayList<Sector>();
						sectorsAux.addAll(sectorLogic.getSectors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sectorsAux=new ArrayList<Sector>();
							sectorsAux.addAll(sectors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							sectorLogic.getSectorsFK_IdCiudad(finalQueryGlobal,pagination,id_ciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SectorConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SectorConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSectors("FK_IdCiudad",sectorLogic.getSectors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSectors("FK_IdCiudad",sectors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						sectorLogic.setSectors(new ArrayList<Sector>());
						sectorLogic.getSectors().addAll(sectorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sectors=new ArrayList<Sector>();
							sectors.addAll(sectorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SectorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					sectorLogic.getSectorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SectorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SectorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=sectorLogic.getSectors()==null||sectorLogic.getSectors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=sectors==null|| sectors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						sectorsAux=new ArrayList<Sector>();
						sectorsAux.addAll(sectorLogic.getSectors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sectorsAux=new ArrayList<Sector>();
							sectorsAux.addAll(sectors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							sectorLogic.getSectorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SectorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SectorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSectors("FK_IdEmpresa",sectorLogic.getSectors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSectors("FK_IdEmpresa",sectors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						sectorLogic.setSectors(new ArrayList<Sector>());
						sectorLogic.getSectors().addAll(sectorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sectors=new ArrayList<Sector>();
							sectors.addAll(sectorsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSector();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSector();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sectorLogic.getSectors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sectors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sectorLogic.getSectors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sectors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Sector sector) {
		Boolean permite=true;
		
		if(this.sector.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SectorConstantesFunciones.getOrderByListaSector();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SectorConstantesFunciones.getOrderByListaSector();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sector sector:sectorLogic.getSectors()) {
				if(sector.getsType().equals(Constantes2.S_TOTALES)) {
					sectorTotales=sector;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sector sector:this.sectors) {
				if(sector.getsType().equals(Constantes2.S_TOTALES)) {
					sectorTotales=sector;
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
			this.sectorAux=new Sector();
			this.sectorAux.setsType(Constantes2.S_TOTALES);
			this.sectorAux.setIsNew(false);
			this.sectorAux.setIsChanged(false);
			this.sectorAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SectorConstantesFunciones.TotalizarValoresFilaSector(this.sectorLogic.getSectors(),this.sectorAux);
				
				this.sectorLogic.getSectors().add(this.sectorAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SectorConstantesFunciones.TotalizarValoresFilaSector(this.sectors,this.sectorAux);
				
				this.sectors.add(this.sectorAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		sectorTotales=new Sector();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sectorLogic.getSectors().remove(sectorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sectors.remove(sectorTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		sectorTotales=new Sector();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sector sector:sectorLogic.getSectors()) {
				if(sector.getsType().equals(Constantes2.S_TOTALES)) {
					sectorTotales=sector;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SectorConstantesFunciones.TotalizarValoresFilaSector(this.sectorLogic.getSectors(),sectorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sector sector:this.sectors) {
				if(sector.getsType().equals(Constantes2.S_TOTALES)) {
					sectorTotales=sector;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SectorConstantesFunciones.TotalizarValoresFilaSector(this.sectors,sectorTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSectorsFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSectorsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSectorsFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sectorLogic.getSectorsFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSectorsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sectorLogic.getSectorsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosSector() {
		this.isPermisoTodoSector=false;
		this.isPermisoNuevoSector=false;
		this.isPermisoActualizarSector=false;
		this.isPermisoActualizarOriginalSector=false;
		this.isPermisoEliminarSector=false;
		this.isPermisoGuardarCambiosSector=false;
		this.isPermisoConsultaSector=false;
		this.isPermisoBusquedaSector=false;
		this.isPermisoReporteSector=false;		
		this.isPermisoOrdenSector=false;		
		this.isPermisoPaginacionMedioSector=false;		
		this.isPermisoPaginacionAltoSector=false;
		this.isPermisoPaginacionTodoSector=false;
		this.isPermisoCopiarSector=false;		
		this.isPermisoVerFormSector=false;		
		this.isPermisoDuplicarSector=false;		
		this.isPermisoOrdenSector=false;		
	}
	
	public void setPermisosUsuarioSector(Boolean isPermiso) {
		this.isPermisoTodoSector=isPermiso;
		this.isPermisoNuevoSector=isPermiso;
		this.isPermisoActualizarSector=isPermiso;
		this.isPermisoActualizarOriginalSector=isPermiso;
		this.isPermisoEliminarSector=isPermiso;
		this.isPermisoGuardarCambiosSector=isPermiso;
		this.isPermisoConsultaSector=isPermiso;
		this.isPermisoBusquedaSector=isPermiso;
		this.isPermisoReporteSector=isPermiso;
		this.isPermisoOrdenSector=isPermiso;		
		this.isPermisoPaginacionMedioSector=isPermiso;		
		this.isPermisoPaginacionAltoSector=isPermiso;		
		this.isPermisoPaginacionTodoSector=isPermiso;		
		this.isPermisoCopiarSector=isPermiso;		
		this.isPermisoVerFormSector=isPermiso;		
		this.isPermisoDuplicarSector=isPermiso;
		this.isPermisoOrdenSector=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSector(Boolean isPermiso) {
		//this.isPermisoTodoSector=isPermiso;
		this.isPermisoNuevoSector=isPermiso;
		this.isPermisoActualizarSector=isPermiso;
		this.isPermisoActualizarOriginalSector=isPermiso;
		this.isPermisoEliminarSector=isPermiso;
		this.isPermisoGuardarCambiosSector=isPermiso;
		//this.isPermisoConsultaSector=isPermiso;
		//this.isPermisoBusquedaSector=isPermiso;
		//this.isPermisoReporteSector=isPermiso;
		//this.isPermisoOrdenSector=isPermiso;		
		//this.isPermisoPaginacionMedioSector=isPermiso;		
		//this.isPermisoPaginacionAltoSector=isPermiso;		
		//this.isPermisoPaginacionTodoSector=isPermiso;		
		//this.isPermisoCopiarSector=isPermiso;		
		//this.isPermisoDuplicarSector=isPermiso;
		//this.isPermisoOrdenSector=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSectorClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(RutaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(SubSectorConstantesFunciones.SNOMBREOPCION);
		
		if(SectorJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosRuta=false;
		this.isTienePermisosRuta=this.verificarGetPermisosUsuarioOpcionSectorClaseRelacionada(this.opcionsRelacionadas,RutaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosSubSector=false;
		this.isTienePermisosSubSector=this.verificarGetPermisosUsuarioOpcionSectorClaseRelacionada(this.opcionsRelacionadas,SubSectorConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebSector(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSectorClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosRuta=conPermiso;
		this.isTienePermisosSubSector=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioSectorClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSectorClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSectorClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosRuta && this.jInternalFrameDetalleFormSector!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSector.jTabbedPaneRelacionesSector.remove(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosSubSector && this.jInternalFrameDetalleFormSector!=null && this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSector.jTabbedPaneRelacionesSector.remove(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioSector() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SectorJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.sectorSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SectorConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSector=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSector=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSector=this.isPermisoActualizarSector;
			this.isPermisoEliminarSector=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSector=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSector=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSector=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSector=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSector=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSector=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSector=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSector=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSector=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSector=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSector=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSector=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSector=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.sectorSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSector.setToolTipText(this.jTableDatosSector.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSector(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSector(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SectorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SectorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSector() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosRuta && this.sectorConstantesFunciones.mostrarRutaSector && !SectorConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Ruta");
			reporte.setsDescripcion("Ruta");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSubSector && this.sectorConstantesFunciones.mostrarSubSectorSector && !SectorConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Sector");
			reporte.setsDescripcion("Sector");
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
	public void inicializarCombosForeignKeySectorListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySectorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SectorJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySectorListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CiudadConstantesFunciones.SFINALQUERY;

				this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeySectorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SectorParameterReturnGeneral sectorReturnGeneral=new SectorParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.sectorConstantesFunciones.cargarid_empresaSector)
					 || (this.esRecargarFks && this.sectorConstantesFunciones.cargarid_empresaSector)) {

					if(!this.sectorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+sectorSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.sectorConstantesFunciones.cargarid_ciudadSector)
					 || (this.esRecargarFks && this.sectorConstantesFunciones.cargarid_ciudadSector)) {

					if(!this.sectorSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+sectorSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				sectorReturnGeneral=sectorLogic.cargarCombosLoteForeignKeySector(finalQueryGlobalEmpresa,finalQueryGlobalCiudad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=sectorReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=sectorReturnGeneral.getciudadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySector()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.sectorSessionBean==null) {
				this.sectorSessionBean=new SectorSessionBean();
			}

			if(!this.sectorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {

			if(!this.sectorSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				Ciudad ciudad=new Ciudad();
				CiudadConstantesFunciones.setCiudadDescripcion(ciudad,Constantes.SMENSAJE_ESCOJA_OPCION);
				ciudad.setId(null);

				if(!CiudadConstantesFunciones.ExisteEnLista(this.ciudadsForeignKey,ciudad,true)) {

					this.ciudadsForeignKey.add(0,ciudad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySector()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySector(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySector()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySector();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySector(Sector sector)throws Exception {	
		try {
			
			this.setActualCiudadForeignKey(sector.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySector(Sector sector,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySector()throws Exception {	
		try {
			
			this.setActualCiudadForeignKey(this.sectorConstantesFunciones.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySector()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySector()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySector()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSector()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySector()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySector(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySector()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector!=null && this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.getItemCount()>0) {
				this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector!=null && this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.getItemCount()>0) {
				this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public SectorBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SectorBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SectorBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.sectorSessionBean=new SectorSessionBean(); 
		this.sectorConstantesFunciones=new SectorConstantesFunciones(); 
		this.sectorBean=new Sector();//(this.sectorConstantesFunciones); 		
		this.sectorReturnGeneral=new SectorParameterReturnGeneral(); 
		
		this.sectorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sectorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SectorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SectorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SectorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSector(true);
			
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
			
			this.sectorConstantesFunciones=new SectorConstantesFunciones(); 
			this.sectorBean=new Sector();//this.sectorConstantesFunciones); 			
			this.sectorReturnGeneral=new SectorParameterReturnGeneral(); 
		
			SectorBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sector Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.sector=new Sector();
			this.sectors = new ArrayList<Sector>();
			this.sectorsAux = new ArrayList<Sector>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic=new SectorLogic();
				this.sectorLogic.getNewConnexionToDeep("");
			}
			
			//this.sectorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.sectorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSector);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSector!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSector);	
					}
					
					if(this.jInternalFrameImportacionSector!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSector);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySector!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySector);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSector!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSector);
				this.jInternalFrameDetalleFormSector.setVisible(false);
				this.jInternalFrameDetalleFormSector.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSector!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSector);
					this.jInternalFrameReporteDinamicoSector.setVisible(false);
					this.jInternalFrameReporteDinamicoSector.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSector!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSector);
					this.jInternalFrameImportacionSector.setVisible(false);
					this.jInternalFrameImportacionSector.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySector!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySector);
					this.jInternalFrameOrderBySector.setVisible(false);
					this.jInternalFrameOrderBySector.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSectorActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SectorConstantesFunciones.INUMEROPAGINACION;
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
			
			this.sectorReturnGeneral=new SectorParameterReturnGeneral();
			
			this.sectorParameterGeneral=new SectorParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.sectorLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SectorJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.sectorSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(RutaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(SubSectorConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SectorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sectorSessionBean.getEsGuardarRelacionado(),this.sectorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SectorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sectorSessionBean.getEsGuardarRelacionado(),this.sectorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSector=false;
			this.isVisibilidadCeldaDuplicarSector=true;
			this.isVisibilidadCeldaCopiarSector=true;
			this.isVisibilidadCeldaVerFormSector=true;
			this.isVisibilidadCeldaOrdenSector=true;
			this.isVisibilidadCeldaNuevoRelacionesSector=false;
			this.isVisibilidadCeldaModificarSector=false;
			this.isVisibilidadCeldaActualizarSector=false;
			this.isVisibilidadCeldaEliminarSector=false;
			this.isVisibilidadCeldaCancelarSector=false;
			this.isVisibilidadCeldaGuardarSector=false;
			this.isVisibilidadCeldaGuardarCambiosSector=false;
			
			
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSector("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSector();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSector(false);
			
			this.setPermisosUsuarioSector();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sectorSessionBean.getEsGuardarRelacionado() 
				|| (this.sectorSessionBean.getEsGuardarRelacionado() && this.sectorSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSectorClasesRelacionadas();
			}
			
			if(this.sectorSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSectorClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SectorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSector();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSector();
			}
			
			if(!this.isPermisoBusquedaSector) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSector.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sectorSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSector,this.isPermisoPaginacionMedioSector,this.isPermisoPaginacionTodoSector);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SectorConstantesFunciones.getTiposSeleccionarSector());
				
				this.tiposColumnasSelect=SectorConstantesFunciones.getTiposSeleccionarSector(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectSector();				
				//this.tiposRelacionesSelect=SectorConstantesFunciones.getTiposRelacionesSector(true);
				
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
			//if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSector();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioSector(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioSector(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSector() ;
			
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
			
			
			this.rutaOrigenLogic=new RutaLogic();
			this.subsectorLogic=new SubSectorLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.ciudadLogic=new CiudadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				sectorImplementable= (SectorImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SectorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				sectorImplementableHome= (SectorImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SectorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.sectors= new ArrayList<Sector>();
			this.sectorsEliminados= new ArrayList<Sector>();
						
			this.isEsNuevoSector=false;
			this.esParaAccionDesdeFormularioSector=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySector(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSector();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SectorBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SectorConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSector("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSector(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSector!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSector();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSector();
			}
			
			SectorBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSector.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSector.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSector.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSector(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Sector: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSector() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(RutaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RutaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SubSectorConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SubSectorConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSector")) {
				iIndex=this.jInternalFrameDetalleFormSector.jTabbedPaneRelacionesSector.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSector.jTabbedPaneRelacionesSector.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSector.getSelectedRow();	
				
				

				if(sTitle.equals("Rutas")) {
					if(!RutaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessSector();

						this.cargarParteTabPanelRelacionadaRuta(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Sectores")) {
					if(!SubSectorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessSector();

						this.cargarParteTabPanelRelacionadaSubSector(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSector();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaRuta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormSector.cargarSessionConBeanSwingJInternalFrameRuta(false,true,iIndex);
		this.jButtonRutaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRuta();

		//this.jTabbedPaneRelacionesSector.updateUI();
		//this.jTabbedPaneRelacionesSector.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesSector.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSubSector(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormSector.cargarSessionConBeanSwingJInternalFrameSubSector(false,true,iIndex);
		this.jButtonSubSectorActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSubSector();

		//this.jTabbedPaneRelacionesSector.updateUI();
		//this.jTabbedPaneRelacionesSector.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesSector.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Ruta")) {
				int row=this.jTableDatosSector.getSelectedRow();
				jButtonRutaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SubSector")) {
				int row=this.jTableDatosSector.getSelectedRow();
				jButtonSubSectorActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Ruta")) {

					if(this.isTienePermisosRuta && this.sectorConstantesFunciones.mostrarRutaSector && !SectorConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Rutas"+"("+RutaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Rutas");

						if(sectorConstantesFunciones.resaltarRutaSector!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(sectorConstantesFunciones.resaltarRutaSector);
						}

						jmenuItem.setEnabled(this.sectorConstantesFunciones.activarRutaSector);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Ruta"));

						

						this.jInternalFrameDetalleFormSector.jmenuDetalleSector.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Sector")) {

					if(this.isTienePermisosSubSector && this.sectorConstantesFunciones.mostrarSubSectorSector && !SectorConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Sectores"+"("+SubSectorConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Sectores");

						if(sectorConstantesFunciones.resaltarSubSectorSector!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(sectorConstantesFunciones.resaltarSubSectorSector);
						}

						jmenuItem.setEnabled(this.sectorConstantesFunciones.activarSubSectorSector);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SubSector"));

						

						this.jInternalFrameDetalleFormSector.jmenuDetalleSector.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeySector(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySector(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySector(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySectorListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySector();
		
		this.cargarCombosFrameForeignKeySector();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySector();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySector();
		}
	}
	
	

	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSectorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.sectorSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			
			
			if(jTableDatosSector.getRowCount()>=1) {
				jTableDatosSector.removeRowSelectionInterval(0, jTableDatosSector.getRowCount()-1);						
			}
			
			this.isEsNuevoSector=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSector(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSector(true);			
			//this.sector=new Sector();
			//this.sector.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSector(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSector() ;
			
			if(SectorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSector(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.sector);	
			this.actualizarInformacion("INFO_PADRE",false,this.sector);				
			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			
			if(this.sectorSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Sector: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSectorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSector.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSector.getSelectedRows().length;			
			}
			
			sectorsSeleccionados=this.getSectorsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSector--;			
				//Sector sectorAux= new Sector();			
				//sectorAux.setId(this.iIdNuevoSector);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Sector sectorOrigen=new Sector();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Sector sectorOrigen : sectorsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSector.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							sectorOrigen =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sectorOrigen =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSector();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.sector.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSector(sectorOrigen,this.sector,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sectorLogic.getSectors().add(this.sectorAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sectors.add(this.sectorAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSector(false);
				
				this.jTableDatosSector.setRowSelectionInterval(this.getIndiceNuevoSector(), this.getIndiceNuevoSector());
				
				int iLastRow =  this.jTableDatosSector.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSector.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSector.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSector(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();									
		
			Sector sectorOrigen=new Sector();
			Sector sectorDestino=new Sector();
				
			sectorsSeleccionados=this.getSectorsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSector.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || sectorsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSector.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sectorOrigen =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sectorOrigen =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sectorDestino =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sectorDestino =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				sectorOrigen =sectorsSeleccionados.get(0);
				sectorDestino =sectorsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSector(sectorOrigen,sectorDestino,true,false);
				
				sectorDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(sectorDestino,sectorLogic.getSectors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sectorDestino,sectors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSector(false);
				
				//this.jTableDatosSector.setRowSelectionInterval(this.getIndiceNuevoSector(), this.getIndiceNuevoSector());
				
				int iLastRow =  this.jTableDatosSector.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSector.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSector.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSector(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSector.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSector.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSector.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSector.setVisible(!isVisible);
			this.jPanelPaginacionSector.setVisible(!isVisible);
			this.jPanelAccionesSector.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSector();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSector();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSector();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySector();
			
			this.abrirFrameOrderBySector();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySector();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSector(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSector);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSector.isMaximum()) {
					this.jInternalFrameDetalleFormSector.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSector.setSize(this.jInternalFrameDetalleFormSector.iWidthFormulario,this.jInternalFrameDetalleFormSector.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSector.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSector.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSector.isMaximum()) {
						this.jInternalFrameDetalleFormSector.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSector.jContentPaneDetalleSector.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSector.jTabbedPaneRelacionesSector.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSector.jContentPaneDetalleSector.getWidth(),SectorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSector.jTabbedPaneRelacionesSector.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSector.jContentPaneDetalleSector.getWidth(),SectorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSector.jTabbedPaneRelacionesSector.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSector.jContentPaneDetalleSector.getWidth(),SectorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(RutaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRuta();
					}

					if(SubSectorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSubSector();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSector.setVisible(true);
	        this.jInternalFrameDetalleFormSector.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySector() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySector==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySector=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySector,false,this);
				} else {
					this.jInternalFrameOrderBySector=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySector,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySector);
				this.jInternalFrameOrderBySector.setVisible(false);
				this.jInternalFrameOrderBySector.setSelected(false);
				
				this.jInternalFrameOrderBySector.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySector"));
				
				this.inicializarActualizarBindingTablaOrderBySector();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSector() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSector==null) {
				
				this.jInternalFrameImportacionSector=new ImportacionJInternalFrame(SectorConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSector);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSector);
				this.jInternalFrameImportacionSector.setVisible(false);
				this.jInternalFrameImportacionSector.setSelected(false);


				this.jInternalFrameImportacionSector.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSector"));
				this.jInternalFrameImportacionSector.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSector"));
				this.jInternalFrameImportacionSector.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSector"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSector() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSector==null) {
				this.jInternalFrameReporteDinamicoSector=new ReporteDinamicoJInternalFrame(SectorConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSector);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSector);
				this.jInternalFrameReporteDinamicoSector.setVisible(false);
				this.jInternalFrameReporteDinamicoSector.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSector.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSector"));
				this.jInternalFrameReporteDinamicoSector.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSector"));
				this.jInternalFrameReporteDinamicoSector.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSector"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSector();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaRuta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jScrollPanelDatosRuta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormSector.jContentPaneDetalleSector.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jScrollPanelDatosRuta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jScrollPanelDatosRuta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.jScrollPanelDatosRuta.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSubSector() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.jScrollPanelDatosSubSector.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormSector.jContentPaneDetalleSector.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.jScrollPanelDatosSubSector.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.jScrollPanelDatosSubSector.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.jScrollPanelDatosSubSector.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleSector() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSector);
			
	       	this.jInternalFrameDetalleFormSector.setVisible(false);
	        this.jInternalFrameDetalleFormSector.setSelected(false);
			
			//this.jInternalFrameDetalleFormSector.dispose();
			//this.jInternalFrameDetalleFormSector=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSector() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSector.setVisible(true);
	        this.jInternalFrameReporteDinamicoSector.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSector() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSector.setVisible(true);
	        this.jInternalFrameImportacionSector.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySector() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySector.setVisible(true);
	        this.jInternalFrameOrderBySector.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySector() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySector.setVisible(false);
	        this.jInternalFrameOrderBySector.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSector() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSector.setVisible(false);
	        this.jInternalFrameReporteDinamicoSector.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSector() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSector.setVisible(false);
	        this.jInternalFrameImportacionSector.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSector(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSector(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSector.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSector(true);
			//this.isEsNuevoSector=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSector("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSector(false) ;
			
			if(sectorSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaSessionBean.getEsGuardarRelacionado() && RutaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRutaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorSessionBean.getEsGuardarRelacionado() && SubSectorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubSectorActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(SectorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSector(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSector(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSectorActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSector.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSector(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSector.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSector(true);
			//this.isEsNuevoSector=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.sector.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSector("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSector(false) ;
			
			if(SectorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSector(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSector(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSector,SectorConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSector.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSectorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSector(false);
			
			//if(!this.isEsNuevoSector) {								
				int intSelectedRow = this.jTableDatosSector.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSector(this.sector,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
				
			}
			
			if(this.permiteMantenimiento(this.sector)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.sectorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSector=true;
					this.inicializarActualizarBindingTablaSector(false);
					this.isEsNuevoSector=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSector=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSector=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSector(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSector(false);
				
				this.habilitarDeshabilitarControlesSector(false);
			
												
				
				if(SectorJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSector();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSectorActionPerformed(evt,sectorSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSector(this.sector,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSector.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,sectorSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.sector.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Sector.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sector.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSectorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSector.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				this.sector.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				this.sector.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.sector)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.sectorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SectorModel) this.jTableDatosSector.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSector=true;
				this.inicializarActualizarBindingTablaSector(false);
				this.isEsNuevoSector=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSector(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSector(false);
				
				this.habilitarDeshabilitarControlesSector(false);
				
				
				
				if(SectorJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSector();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSectorActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSector.getRowCount()>=1) {
				jTableDatosSector.removeRowSelectionInterval(0, jTableDatosSector.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSector(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSector(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSector(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSector(false) ;
			
			this.isEsNuevoSector=false;
			
			if(SectorJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSector();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSectorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSector(false);
				
				//SI ES MANUAL
				if(SectorJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSector();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSectorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSector--;			
			//Sector sectorAux= new Sector();			
			//sectorAux.setId(this.iIdNuevoSector);
			
			if(this.jInternalFrameDetalleFormSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSector();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
			
			this.sector.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.sectorLogic.getSectors().add(this.sectorAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.sectors.add(this.sectorAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSector(false);
			
			this.jTableDatosSector.setRowSelectionInterval(this.getIndiceNuevoSector(), this.getIndiceNuevoSector());
			
			int iLastRow =  this.jTableDatosSector.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSector.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSector.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSector(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSectorActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSector(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSector(false);
			
			//SI ES MANUAL
			if(SectorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSector();
			}
			
			//this.abrirFrameTreeSector();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSectorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE SectorES ?", "MANTENIMIENTO DE Sector", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSector.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSector();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.sectorReturnGeneral=sectorLogic.procesarImportacionSectorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.sectorParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSectorReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSectorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSector.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSector.setFileImportacion(this.jInternalFrameImportacionSector.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSector.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSector.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSector.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSector.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSectorActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();		

		sectorsSeleccionados=this.getSectorsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSector.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSector.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SectorBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SectorBaseDesign.jrxml";
			
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
			
			this.generarReporteSectors("Todos",sectorsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSector.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSector.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SectorConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SectorConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SectorConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSector.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSector.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSector.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SectorConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="id_ciudad";
					break;

				case SectorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case SectorConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSector.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SectorConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="id_ciudad";
					break;

				case SectorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case SectorConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSector.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSector.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SectorConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ciudad");
					break;

				case SectorConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case SectorConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoSectorActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();		
		
		sectorsSeleccionados=this.getSectorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sector";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Sectors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSector.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSector.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SectorConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SectorConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Sector sector:sectorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sector.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SectorConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SectorConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(Sector sector:sectorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sector.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SectorConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SectorConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Sector sector:sectorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sector.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SectorConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SectorConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Sector sector:sectorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sector.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelSector(row);				
			//	iRow++;
			//}				
			
			//for(Sector sectorAux:sectorsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSector(sectorAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
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
				this.sectorLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSector(false);
			
			//SI ES MANUAL
			if(SectorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSector();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSectorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSector(false);
			
			//SI ES MANUAL
			if(SectorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSector();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSectorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSector(false);
			
			//SI ES MANUAL
			if(SectorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSector();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSector() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSector.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSector.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSector.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSector.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSector.setMinimumSize(dimensionMinimum);
		this.jTableDatosSector.setMaximumSize(dimensionMaximum);
		this.jTableDatosSector.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSector(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSector(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSector(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSector(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSector(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSector(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSector(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSector(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SectorJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SectorJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSector() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSector();
		
		this.inicializarActualizarBindingBotonesManualSector(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSector();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSector() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSector(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSector(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSector.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSector.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSector.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSector!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSector.jCheckBoxPostAccionNuevoSector.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSector.jCheckBoxPostAccionSinCerrarSector.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSector.jCheckBoxPostAccionSinMensajeSector.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSector.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSector.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSector.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSector!=null) {
				this.jInternalFrameDetalleFormSector.jCheckBoxPostAccionNuevoSector.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSector.jCheckBoxPostAccionSinCerrarSector.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSector.jCheckBoxPostAccionSinMensajeSector.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSector.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSector.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSector!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSector.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSector!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSector.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSector.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSector.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSector.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSector.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSector!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSector.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSector.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSector.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSector(Boolean esInicializar) throws Exception {
		try	{	
			if(SectorJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSector(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSector() throws Exception {
		try	{
			if(SectorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSector();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSector() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSector() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSector.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSector.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSector.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSector.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSector.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSector.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSector.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSector.addItem(reporte);
			}
			
			
			if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSector.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSector.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSector.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSector.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSector.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSector.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSector.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSector.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSector.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSector();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSector() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSector!=null) {
				this.jInternalFrameReporteDinamicoSector.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSector.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSector!=null) {
				this.jInternalFrameReporteDinamicoSector.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSector.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSector!=null) {
				
				if(this.jInternalFrameReporteDinamicoSector.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSector.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSector.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSector.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSector.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSector.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSector()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ciudadFK_IdCiudadSector.getSelectedItem()!=null){this.id_ciudadFK_IdCiudad=((Ciudad)this.jComboBoxid_ciudadFK_IdCiudadSector.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSector(Boolean esInicializar) throws Exception {				
		if(SectorJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSector();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSector() throws Exception {
		this.inicializarActualizarBindingTablaSector(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySector() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySector.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySector.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySector.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SectorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySector.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySector.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SectorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSectorOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSectorOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SectorPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySector.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySector.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SectorPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySector.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSector(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=sectorLogic.getSectors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=sectors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSector.setModel(new SectorModel(this.sectorLogic.getSectors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSector.setModel(new SectorModel(this.sectors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySector!=null && this.jInternalFrameOrderBySector.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySector();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSector,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SectorPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SectorConstantesFunciones.SCLASSWEBTITULO,sectorConstantesFunciones.resaltarSeleccionarSector,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SectorConstantesFunciones.SCLASSWEBTITULO,sectorConstantesFunciones.resaltarSeleccionarSector,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSector,SectorConstantesFunciones.LABEL_ID));

		if(this.sectorConstantesFunciones.mostraridSector && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SectorConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sectorConstantesFunciones.resaltaridSector,this.sectorConstantesFunciones.activaridSector,this,true,"idSector","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sectorConstantesFunciones.resaltaridSector,this.sectorConstantesFunciones.activaridSector,this,true,"idSector","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSector,SectorConstantesFunciones.LABEL_IDCIUDAD));

		if(this.sectorConstantesFunciones.mostrarid_ciudadSector && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SectorConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.sectorConstantesFunciones.resaltarid_ciudadSector,this,this.sectorConstantesFunciones.activarid_ciudadSector));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.sectorConstantesFunciones.resaltarid_ciudadSector,this,this.sectorConstantesFunciones.activarid_ciudadSector,true,"id_ciudadSector","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SectorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSector,SectorConstantesFunciones.LABEL_NOMBRE));

		if(this.sectorConstantesFunciones.mostrarnombreSector && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SectorConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sectorConstantesFunciones.resaltarnombreSector,this.sectorConstantesFunciones.activarnombreSector,this,true,"nombreSector","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sectorConstantesFunciones.resaltarnombreSector,this.sectorConstantesFunciones.activarnombreSector,this,true,"nombreSector","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SectorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSector,SectorConstantesFunciones.LABEL_DESCRIPCION));

		if(this.sectorConstantesFunciones.mostrardescripcionSector && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SectorConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sectorConstantesFunciones.resaltardescripcionSector,this.sectorConstantesFunciones.activardescripcionSector,this,true,"descripcionSector","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sectorConstantesFunciones.resaltardescripcionSector,this.sectorConstantesFunciones.activardescripcionSector,this,true,"descripcionSector","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SectorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.sectorSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosRuta && this.sectorConstantesFunciones.mostrarRutaSector && !SectorConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Rutas");
				tableColumn.setHeaderValue("Rutas");
				tableColumn.setCellRenderer(new RutaTableCell(sectorConstantesFunciones.resaltarRutaSector,this,this.sectorConstantesFunciones.activarRutaSector));
				tableColumn.setCellEditor(new RutaTableCell(sectorConstantesFunciones.resaltarRutaSector,this,this.sectorConstantesFunciones.activarRutaSector));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosSector.addColumn(tableColumn);
			}

			if(this.isTienePermisosSubSector && this.sectorConstantesFunciones.mostrarSubSectorSector && !SectorConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Sectores");
				tableColumn.setHeaderValue("Sectores");
				tableColumn.setCellRenderer(new SubSectorTableCell(sectorConstantesFunciones.resaltarSubSectorSector,this,this.sectorConstantesFunciones.activarSubSectorSector));
				tableColumn.setCellEditor(new SubSectorTableCell(sectorConstantesFunciones.resaltarSubSectorSector,this,this.sectorConstantesFunciones.activarSubSectorSector));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosSector.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sectorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sectorSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSector.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sectorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sectorSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSector.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSector && this.isPermisoGuardarCambiosSector) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.sectorSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.sectorSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSector.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.sectorSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosSector.addColumn(tableColumn);
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
			
			this.jTableDatosSector.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSector && this.isPermisoGuardarCambiosSector) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.sectorSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSector && this.isPermisoGuardarCambiosSector) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSector.moveColumn(this.jTableDatosSector.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSector.moveColumn(this.jTableDatosSector.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.sectorSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosSector.moveColumn(this.jTableDatosSector.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSector.moveColumn(this.jTableDatosSector.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSector.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSector.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSector,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSector.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSector.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSector.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSector.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSector.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=sectorLogic.getSectors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=sectors.size()-1;
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
		//this.jTableDatosSector.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSector();
			
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
				
				//this.isEsNuevoSector=false;
					
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			
				if(this.sectorSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSector==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSector.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSector.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.sector.getsType().equals("DUPLICADO")
				   || this.sector.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSector=true;
				
				} else {
					this.isEsNuevoSector=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.sectorSessionBean.getEsGuardarRelacionado()) {
					if(this.sector.getId()>=0 && !this.sector.getIsNew()) {						
						this.isEsNuevoSector=false;
						
					} else {
						this.isEsNuevoSector=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSector(esRelaciones);						
				
				this.seleccionarSector(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.sector.getId()<0) {
					this.isEsNuevoSector=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSector(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSector(evt,rowIndex);
				}	
				
				if(this.sectorSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Sector: " + this.dDif); 
					}
				}								
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSector(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.sector)) {
					if(this.sector.getId()>0) {
						this.sector.setIsDeleted(true);
						
						this.sectorsEliminados.add(this.sector);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sectorLogic.getSectors().remove(this.sector);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sectors.remove(this.sector);				
					}
					
					
					((SectorModel) this.jTableDatosSector.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSector(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSector(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSector) {
			
			if(this.jInternalFrameDetalleFormSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSector.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSector.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSector(this.sector);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.sectorConstantesFunciones.cargarid_empresaSector || this.sectorConstantesFunciones.event_dependid_empresaSector) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.sector.getid_empresa());
									//this.inicializarActualizarBindingSector(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(sector.getEmpresa()!=null) {
							this.empresasForeignKey.add(sector.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.sector.getid_empresa(),false,"Formulario");

					//Ciudad
					if(!this.sectorConstantesFunciones.cargarid_ciudadSector || this.sectorConstantesFunciones.event_dependid_ciudadSector) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.sector.getid_ciudad());
									//this.inicializarActualizarBindingSector(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(sector.getCiudad()!=null) {
							this.ciudadsForeignKey.add(sector.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.sector.getid_ciudad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSector("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSector(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSector() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSector(Sector sector) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSector(sector,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSector(Sector sector,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSector(sector);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySector(sector,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySector(sector);
	}
	
	public void setVariablesObjetoActualToFormularioSector(Sector sector) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSector.jLabelidSector.setText(sector.getId().toString());
			this.jInternalFrameDetalleFormSector.jTextAreanombreSector.setText(sector.getnombre());
			this.jInternalFrameDetalleFormSector.jTextAreadescripcionSector.setText(sector.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Sector sectorLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,sectorLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Sector sectorLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				sectorLocal=this.sector;
			} else {
				sectorLocal=this.sectorAnterior;
			}
		}
		
		if(this.permiteMantenimiento(sectorLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSector(sectorLocal,true);
					
					if(sectorSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(sectorLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.sectorSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(sectorLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSector(Sector sector,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSector(sector,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSector(sector);
	}
	
	public void setVariablesFormularioToObjetoActualSector(Sector sector,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSector(sector,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSector(Sector sector,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSector.jLabelidSector.getText()==null || this.jInternalFrameDetalleFormSector.jLabelidSector.getText()=="" || this.jInternalFrameDetalleFormSector.jLabelidSector.getText()=="Id") {
				this.jInternalFrameDetalleFormSector.jLabelidSector.setText("0");
			}

			if(conColumnasBase) {sector.setId(Long.parseLong(this.jInternalFrameDetalleFormSector.jLabelidSector.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SectorConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSector.jLabelIdSector,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sector.setnombre(this.jInternalFrameDetalleFormSector.jTextAreanombreSector.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SectorConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSector.jLabelnombreSector,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sector.setdescripcion(this.jInternalFrameDetalleFormSector.jTextAreadescripcionSector.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SectorConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSector.jLabeldescripcionSector,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSector(Sector sectorBean,Sector sector,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && sectorBean.getid_ciudad()!=null && !sectorBean.getid_ciudad().equals(-1L))) {sector.setid_ciudad(sectorBean.getid_ciudad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSector(Sector sectorOrigen,Sector sector,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sectorOrigen.getId()!=null && !sectorOrigen.getId().equals(0L))) {sector.setId(sectorOrigen.getId());}}
			if(conDefault || (!conDefault && sectorOrigen.getid_ciudad()!=null && !sectorOrigen.getid_ciudad().equals(-1L))) {sector.setid_ciudad(sectorOrigen.getid_ciudad());}
			if(conDefault || (!conDefault && sectorOrigen.getnombre()!=null && !sectorOrigen.getnombre().equals(""))) {sector.setnombre(sectorOrigen.getnombre());}
			if(conDefault || (!conDefault && sectorOrigen.getdescripcion()!=null && !sectorOrigen.getdescripcion().equals(""))) {sector.setdescripcion(sectorOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSector(Sector sector) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSector.jLabelidSector.setText(sector.getId().toString());
			this.jInternalFrameDetalleFormSector.jTextAreanombreSector.setText(sector.getnombre());
			this.jInternalFrameDetalleFormSector.jTextAreadescripcionSector.setText(sector.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSector(SectorBean sectorBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSector.jLabelidSector.setText(sectorBean.getId().toString());
			this.jInternalFrameDetalleFormSector.jTextAreanombreSector.setText(sectorBean.getnombre());
			this.jInternalFrameDetalleFormSector.jTextAreadescripcionSector.setText(sectorBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSector(SectorParameterReturnGeneral sectorReturnGeneral,SectorBean sectorBean,Boolean conDefault) throws Exception { 
		try {
			Sector sectorLocal=new Sector();
			
			sectorLocal=sectorReturnGeneral.getSector();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sectorLocal.getId()!=null && !sectorLocal.getId().equals(0L))) {sectorBean.setId(sectorLocal.getId());}}
			if(conDefault || (!conDefault && sectorLocal.getid_ciudad()!=null && !sectorLocal.getid_ciudad().equals(-1L))) {sectorBean.setid_ciudad(sectorLocal.getid_ciudad());}
			if(conDefault || (!conDefault && sectorLocal.getnombre()!=null && !sectorLocal.getnombre().equals(""))) {sectorBean.setnombre(sectorLocal.getnombre());}
			if(conDefault || (!conDefault && sectorLocal.getdescripcion()!=null && !sectorLocal.getdescripcion().equals(""))) {sectorBean.setdescripcion(sectorLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSectorGenerico(Long idSectorSeleccionado,JComboBox jComboBoxSector,List<Sector> sectorsLocal)throws Exception {
		try {
			Sector  sectorTemp=null;

			for(Sector sectorAux:sectorsLocal) {
				if(sectorAux.getId()!=null && sectorAux.getId().equals(idSectorSeleccionado)) {
					sectorTemp=sectorAux;
					break;
				}
			}

			jComboBoxSector.setSelectedItem(sectorTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSectorGenerico(JComboBox jComboBoxSector,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSector.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSector.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSector.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSector.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Ruta")) {
			jButtonRutaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("SubSector")) {
			jButtonSubSectorActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sector=(Sector) sectorLogic.getSectors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sector =(Sector) sectors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!sector.getIsNew() && !sector.getIsChanged() && !sector.getIsDeleted()) {
				sDescripcion=sector.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=sector.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!sector.getIsNew() && !sector.getIsChanged() && !sector.getIsDeleted()) {
				sDescripcion=sector.getciudad_descripcion();
			} else {
				//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
				sDescripcion=sector.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Sector sectorRow=new Sector();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sectorRow=(Sector) sectorLogic.getSectors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sectorRow=(Sector) sectors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonRutaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Sector sector) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormSector==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sector = (Sector)this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.sector = (Sector)this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(sector!=null) {
						this.sector = sector;
					} else {
						this.sector = new Sector();
					}
				}

				if(this.isTienePermisosRuta && this.permiteMantenimiento(this.sector)) {
					RutaBeanSwingJInternalFrame rutaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFramePopup=new RutaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						rutaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFramePopup;
					} else {
						rutaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame;
					}

					List<Sector> sectors=new ArrayList<Sector>();
					sectors.add(this.sector);
					if(!esRelacionado) {
						//rutaBeanSwingJInternalFrame.rutaSessionBean.setConGuardarRelaciones(false);
						//rutaBeanSwingJInternalFrame.rutaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					rutaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormSector.cargarRutaBeanSwingJInternalFrame(sectors,this.sector,rutaBeanSwingJInternalFrame,/*conInicializar,*/rutaBeanSwingJInternalFrame.rutaSessionBean.getConGuardarRelaciones(),rutaBeanSwingJInternalFrame.rutaSessionBean.getEsGuardarRelacionado());
					rutaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						rutaBeanSwingJInternalFrame.actualizarEstadoPanelsRuta("no_relacionado");

						rutaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RutaConstantesFunciones.ITAMANIOFILATABLA + (RutaConstantesFunciones.ITAMANIOFILATABLA/2));

						rutaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSector=(TitledBorder)this.jScrollPanelDatosSector.getBorder();
						TitledBorder titledBorderRuta=(TitledBorder)rutaBeanSwingJInternalFrame.jScrollPanelDatosRuta.getBorder();

						titledBorderRuta.setTitle(titledBorderSector.getTitle() + " -> Ruta");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,rutaBeanSwingJInternalFrame);
						}

						rutaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(rutaBeanSwingJInternalFrame);

						rutaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.sectorSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Ruta",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonSubSectorActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Sector sector) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormSector==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sector = (Sector)this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.sector = (Sector)this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(sector!=null) {
						this.sector = sector;
					} else {
						this.sector = new Sector();
					}
				}

				if(this.isTienePermisosSubSector && this.permiteMantenimiento(this.sector)) {
					SubSectorBeanSwingJInternalFrame subsectorBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFramePopup=new SubSectorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						subsectorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFramePopup;
					} else {
						subsectorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame;
					}

					List<Sector> sectors=new ArrayList<Sector>();
					sectors.add(this.sector);
					if(!esRelacionado) {
						//subsectorBeanSwingJInternalFrame.subsectorSessionBean.setConGuardarRelaciones(false);
						//subsectorBeanSwingJInternalFrame.subsectorSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					subsectorBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormSector.cargarSubSectorBeanSwingJInternalFrame(sectors,this.sector,subsectorBeanSwingJInternalFrame,/*conInicializar,*/subsectorBeanSwingJInternalFrame.subsectorSessionBean.getConGuardarRelaciones(),subsectorBeanSwingJInternalFrame.subsectorSessionBean.getEsGuardarRelacionado());
					subsectorBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						subsectorBeanSwingJInternalFrame.actualizarEstadoPanelsSubSector("no_relacionado");

						subsectorBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SubSectorConstantesFunciones.ITAMANIOFILATABLA + (SubSectorConstantesFunciones.ITAMANIOFILATABLA/2));

						subsectorBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSector=(TitledBorder)this.jScrollPanelDatosSector.getBorder();
						TitledBorder titledBorderSubSector=(TitledBorder)subsectorBeanSwingJInternalFrame.jScrollPanelDatosSubSector.getBorder();

						titledBorderSubSector.setTitle(titledBorderSector.getTitle() + " -> Sector");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,subsectorBeanSwingJInternalFrame);
						}

						subsectorBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(subsectorBeanSwingJInternalFrame);

						subsectorBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.sectorSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Sector",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSector(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSector.setVisible((this.isVisibilidadCeldaNuevoSector && this.isPermisoNuevoSector));			
			this.jButtonDuplicarSector.setVisible((this.isVisibilidadCeldaDuplicarSector && this.isPermisoDuplicarSector));			
			this.jButtonCopiarSector.setVisible((this.isVisibilidadCeldaCopiarSector && this.isPermisoCopiarSector));
			this.jButtonVerFormSector.setVisible((this.isVisibilidadCeldaVerFormSector && this.isPermisoVerFormSector));
			
			this.jButtonAbrirOrderBySector.setVisible((this.isVisibilidadCeldaOrdenSector && this.isPermisoOrdenSector));			
			
			this.jButtonNuevoRelacionesSector.setVisible((this.isVisibilidadCeldaNuevoRelacionesSector && this.isPermisoNuevoSector));			
			this.jButtonNuevoGuardarCambiosSector.setVisible((this.isVisibilidadCeldaNuevoSector && this.isPermisoNuevoSector && this.isPermisoGuardarCambiosSector));
			
			if(this.jInternalFrameDetalleFormSector!=null) {
			this.jInternalFrameDetalleFormSector.jButtonModificarSector.setVisible((this.isVisibilidadCeldaModificarSector && this.isPermisoActualizarSector));	
			this.jInternalFrameDetalleFormSector.jButtonActualizarSector.setVisible((this.isVisibilidadCeldaActualizarSector && this.isPermisoActualizarSector));	
			this.jInternalFrameDetalleFormSector.jButtonEliminarSector.setVisible((this.isVisibilidadCeldaEliminarSector && this.isPermisoEliminarSector));
			this.jInternalFrameDetalleFormSector.jButtonCancelarSector.setVisible(this.isVisibilidadCeldaCancelarSector);							
			this.jInternalFrameDetalleFormSector.jButtonGuardarCambiosSector.setVisible((this.isVisibilidadCeldaGuardarSector && this.isPermisoGuardarCambiosSector));			
			
			}
						
			this.jButtonGuardarCambiosTablaSector.setVisible((this.isVisibilidadCeldaGuardarCambiosSector && this.isPermisoGuardarCambiosSector));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSector.setVisible((this.isVisibilidadCeldaNuevoSector && this.isPermisoNuevoSector));						
			this.jButtonDuplicarToolBarSector.setVisible((this.isVisibilidadCeldaDuplicarSector && this.isPermisoDuplicarSector));						
			this.jButtonCopiarToolBarSector.setVisible((this.isVisibilidadCeldaCopiarSector && this.isPermisoCopiarSector));			
			this.jButtonVerFormToolBarSector.setVisible((this.isVisibilidadCeldaVerFormSector && this.isPermisoVerFormSector));			
			this.jButtonAbrirOrderByToolBarSector.setVisible((this.isVisibilidadCeldaOrdenSector && this.isPermisoOrdenSector));
			this.jButtonNuevoRelacionesToolBarSector.setVisible((this.isVisibilidadCeldaNuevoRelacionesSector && this.isPermisoNuevoSector));			
			this.jButtonNuevoGuardarCambiosToolBarSector.setVisible((this.isVisibilidadCeldaNuevoSector && this.isPermisoNuevoSector && this.isPermisoGuardarCambiosSector));			
			
			if(this.jInternalFrameDetalleFormSector!=null) {
			this.jInternalFrameDetalleFormSector.jButtonModificarToolBarSector.setVisible((this.isVisibilidadCeldaModificarSector && this.isPermisoActualizarSector));	
			this.jInternalFrameDetalleFormSector.jButtonActualizarToolBarSector.setVisible((this.isVisibilidadCeldaActualizarSector  && this.isPermisoActualizarSector));	
			this.jInternalFrameDetalleFormSector.jButtonEliminarToolBarSector.setVisible((this.isVisibilidadCeldaEliminarSector && this.isPermisoEliminarSector));
			this.jInternalFrameDetalleFormSector.jButtonCancelarToolBarSector.setVisible(this.isVisibilidadCeldaCancelarSector);				
			this.jInternalFrameDetalleFormSector.jButtonGuardarCambiosToolBarSector.setVisible((this.isVisibilidadCeldaGuardarSector && this.isPermisoGuardarCambiosSector));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSector.setVisible((this.isVisibilidadCeldaGuardarCambiosSector && this.isPermisoGuardarCambiosSector));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSector.setVisible((this.isVisibilidadCeldaNuevoSector && this.isPermisoNuevoSector));			
			this.jMenuItemDuplicarSector.setVisible((this.isVisibilidadCeldaDuplicarSector && this.isPermisoDuplicarSector));			
			this.jMenuItemCopiarSector.setVisible((this.isVisibilidadCeldaCopiarSector && this.isPermisoCopiarSector));			
			this.jMenuItemVerFormSector.setVisible((this.isVisibilidadCeldaVerFormSector && this.isPermisoVerFormSector));			
			this.jMenuItemAbrirOrderBySector.setVisible((this.isVisibilidadCeldaOrdenSector && this.isPermisoOrdenSector));			
			//this.jMenuItemMostrarOcultarSector.setVisible((this.isVisibilidadCeldaOrdenSector && this.isPermisoOrdenSector));
			this.jMenuItemDetalleAbrirOrderBySector.setVisible((this.isVisibilidadCeldaOrdenSector && this.isPermisoOrdenSector));			
			//this.jMenuItemDetalleMostrarOcultarSector.setVisible((this.isVisibilidadCeldaOrdenSector && this.isPermisoOrdenSector));			
			this.jMenuItemNuevoRelacionesSector.setVisible((this.isVisibilidadCeldaNuevoRelacionesSector && this.isPermisoNuevoSector));			
			this.jMenuItemNuevoGuardarCambiosSector.setVisible((this.isVisibilidadCeldaNuevoSector && this.isPermisoNuevoSector && this.isPermisoGuardarCambiosSector));									
			
			if(this.jInternalFrameDetalleFormSector!=null) {
			this.jInternalFrameDetalleFormSector.jMenuItemModificarSector.setVisible((this.isVisibilidadCeldaModificarSector && this.isPermisoActualizarSector));	
			this.jInternalFrameDetalleFormSector.jMenuItemActualizarSector.setVisible((this.isVisibilidadCeldaActualizarSector && this.isPermisoActualizarSector));	
			this.jInternalFrameDetalleFormSector.jMenuItemEliminarSector.setVisible((this.isVisibilidadCeldaEliminarSector && this.isPermisoEliminarSector));
			this.jInternalFrameDetalleFormSector.jMenuItemCancelarSector.setVisible(this.isVisibilidadCeldaCancelarSector);				
			}
			
			this.jMenuItemGuardarCambiosSector.setVisible((this.isVisibilidadCeldaGuardarSector && this.isPermisoGuardarCambiosSector));						
			this.jMenuItemGuardarCambiosTablaSector.setVisible((this.isVisibilidadCeldaGuardarCambiosSector && this.isPermisoGuardarCambiosSector));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSector=this.jButtonNuevoSector.isVisible();
			this.isVisibilidadCeldaDuplicarSector=this.jButtonDuplicarSector.isVisible();
			this.isVisibilidadCeldaCopiarSector=this.jButtonCopiarSector.isVisible();
			this.isVisibilidadCeldaVerFormSector=this.jButtonVerFormSector.isVisible();
			
			this.isVisibilidadCeldaOrdenSector=this.jButtonAbrirOrderBySector.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSector=this.jButtonNuevoRelacionesSector.isVisible();
			this.isVisibilidadCeldaModificarSector=this.jButtonModificarSector.isVisible();
			
			if(this.jInternalFrameDetalleFormSector!=null) {
			this.isVisibilidadCeldaActualizarSector=this.jInternalFrameDetalleFormSector.jButtonActualizarSector.isVisible();
			this.isVisibilidadCeldaEliminarSector=this.jInternalFrameDetalleFormSector.jButtonEliminarSector.isVisible();
			this.isVisibilidadCeldaCancelarSector=this.jInternalFrameDetalleFormSector.jButtonCancelarSector.isVisible();
			this.isVisibilidadCeldaGuardarSector=this.jInternalFrameDetalleFormSector.jButtonGuardarCambiosSector.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSector=this.jButtonGuardarCambiosTablaSector.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSector=this.jButtonNuevoToolBarSector.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSector=this.jButtonNuevoRelacionesToolBarSector.isVisible();
			
			if(this.jInternalFrameDetalleFormSector!=null) {
			this.isVisibilidadCeldaModificarSector=this.jInternalFrameDetalleFormSector.jButtonModificarToolBarSector.isVisible();
			this.isVisibilidadCeldaActualizarSector=this.jInternalFrameDetalleFormSector.jButtonActualizarToolBarSector.isVisible();
			this.isVisibilidadCeldaEliminarSector=this.jInternalFrameDetalleFormSector.jButtonEliminarToolBarSector.isVisible();
			this.isVisibilidadCeldaCancelarSector=this.jInternalFrameDetalleFormSector.jButtonCancelarToolBarSector.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSector=this.jButtonGuardarCambiosToolBarSector.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSector=this.jButtonGuardarCambiosTablaToolBarSector.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSector=this.jMenuItemNuevoSector.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSector=this.jMenuItemNuevoRelacionesSector.isVisible();
			
			if(this.jInternalFrameDetalleFormSector!=null) {
			this.isVisibilidadCeldaModificarSector=this.jInternalFrameDetalleFormSector.jMenuItemModificarSector.isVisible();
			this.isVisibilidadCeldaActualizarSector=this.jInternalFrameDetalleFormSector.jMenuItemActualizarSector.isVisible();
			this.isVisibilidadCeldaEliminarSector=this.jInternalFrameDetalleFormSector.jMenuItemEliminarSector.isVisible();
			this.isVisibilidadCeldaCancelarSector=this.jInternalFrameDetalleFormSector.jMenuItemCancelarSector.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSector=this.jMenuItemGuardarCambiosSector.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSector=this.jMenuItemGuardarCambiosTablaSector.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSector(Boolean esInicializar) {
		if(SectorJInternalFrame.ISBINDING_MANUAL) {			
			if(this.sectorSessionBean.getConGuardarRelaciones()) {
				//if(this.sectorSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSector();
			}
			
			this.inicializarActualizarBindingBotonesManualSector(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSector() {
		this.jButtonNuevoSector.setVisible(this.isPermisoNuevoSector);			
		this.jButtonDuplicarSector.setVisible(this.isPermisoDuplicarSector);			
		this.jButtonCopiarSector.setVisible(this.isPermisoCopiarSector);			
		this.jButtonVerFormSector.setVisible(this.isPermisoVerFormSector);			
		
		this.jButtonAbrirOrderBySector.setVisible(this.isPermisoOrdenSector);					
		
		this.jButtonNuevoRelacionesSector.setVisible(this.isPermisoNuevoSector);			
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jButtonModificarSector.setVisible(this.isPermisoActualizarSector);	
			this.jInternalFrameDetalleFormSector.jButtonActualizarSector.setVisible(this.isPermisoActualizarSector);	
			this.jInternalFrameDetalleFormSector.jButtonEliminarSector.setVisible(this.isPermisoEliminarSector);
			this.jInternalFrameDetalleFormSector.jButtonCancelarSector.setVisible(this.isVisibilidadCeldaCancelarSector);						
			this.jInternalFrameDetalleFormSector.jButtonGuardarCambiosSector.setVisible(this.isPermisoGuardarCambiosSector);							
		}
		
		this.jButtonGuardarCambiosTablaSector.setVisible(this.isPermisoActualizarSector);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSector() {
		this.jInternalFrameDetalleFormSector.jButtonModificarSector.setVisible(this.isPermisoActualizarSector);	
		this.jInternalFrameDetalleFormSector.jButtonActualizarSector.setVisible(this.isPermisoActualizarSector);	
		this.jInternalFrameDetalleFormSector.jButtonEliminarSector.setVisible(this.isPermisoEliminarSector);
		this.jInternalFrameDetalleFormSector.jButtonCancelarSector.setVisible(this.isVisibilidadCeldaCancelarSector);							
		this.jInternalFrameDetalleFormSector.jButtonGuardarCambiosSector.setVisible((this.isVisibilidadCeldaGuardarSector && this.isPermisoGuardarCambiosSector));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSector() {
		if(SectorJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSector();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSector() {
	}
	
	public void jTableDatosSectorListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSector(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSectorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSector.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSector(this.getsector(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sector==null) {
						this.sector = new Sector();
					}

					this.setVariablesFormularioToObjetoActualSector(this.sector,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
				}

				if(this.sector.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.sector.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSector(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSectorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSector(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSector.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSector.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSector.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSector(this.getsector(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.sectorLogic.getConnexion());

				if(this.sector.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.sector.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSector=(TitledBorder)this.jScrollPanelDatosSector.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSector.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSectorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSector.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSector(this.getsector(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sector==null) {
						this.sector = new Sector();
					}

					this.setVariablesFormularioToObjetoActualSector(this.sector,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
				}

				if(this.sector.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.sector.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSector(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadSectorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebSector(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSector.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSector.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSector.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSector(this.getsector(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.sectorLogic.getConnexion());

				if(this.sector.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.sector.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSector=(TitledBorder)this.jScrollPanelDatosSector.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderSector.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadSectorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSector.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSector(this.getsector(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sector==null) {
						this.sector = new Sector();
					}

					this.setVariablesFormularioToObjetoActualSector(this.sector,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
				}

				if(this.sector.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.sector.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSector(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreSectorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSector.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSector(this.getsector(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sector==null) {
						this.sector = new Sector();
					}

					this.setVariablesFormularioToObjetoActualSector(this.sector,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
				}

				if(this.sector.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.sector.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSector(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionSectorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSector.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSector(this.getsector(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sector==null) {
						this.sector = new Sector();
					}

					this.setVariablesFormularioToObjetoActualSector(this.sector,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);
				}

				if(this.sector.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.sector.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSector(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCiudadSectorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSector(false,false);

			this.getSectorsFK_IdCiudad();

			this.inicializarActualizarBindingSector(false);

			//if(SectorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSector(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSectorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSector(false,false);

			this.getSectorsFK_IdEmpresa();

			this.inicializarActualizarBindingSector(false);

			//if(SectorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSector(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sectorLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSector() {
		if(this.jInternalFrameDetalleFormSector!=null) {
		

		if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormSector!=null) {
			this.jInternalFrameDetalleFormSector.setVisible(false);	    			
			this.jInternalFrameDetalleFormSector.dispose();
			this.jInternalFrameDetalleFormSector=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSector!=null) {
			this.jInternalFrameReporteDinamicoSector.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSector.dispose();
			this.jInternalFrameReporteDinamicoSector=null;
		}
		
		if(this.jInternalFrameImportacionSector!=null) {
			this.jInternalFrameImportacionSector.setVisible(false);	    			
			this.jInternalFrameImportacionSector.dispose();
			this.jInternalFrameImportacionSector=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSector();
			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			
			
			if(sTipo.equals("NuevoSector")) {
				jButtonNuevoSectorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSector")) {
				jButtonDuplicarSectorActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSector")) {
				jButtonCopiarSectorActionPerformed(evt);
			} else if(sTipo.equals("VerFormSector")) {
				jButtonVerFormSectorActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSector")) {
				jButtonNuevoSectorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSector")) {
				jButtonDuplicarSectorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSector")) {
				jButtonNuevoSectorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSector")) {
				jButtonDuplicarSectorActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSector")) {
				jButtonNuevoSectorActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSector")) {
				jButtonNuevoSectorActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSector")) {
				jButtonNuevoSectorActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSector")) {
				jButtonModificarSectorActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSector")) {
				jButtonModificarSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSector")) {
				jButtonModificarSectorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSector")) {
				jButtonActualizarSectorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSector")) {
				jButtonActualizarSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSector")) {
				jButtonActualizarSectorActionPerformed(evt);
			} else if(sTipo.equals("EliminarSector")) {
				jButtonEliminarSectorActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSector")) {
				jButtonEliminarSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSector")) {
				jButtonEliminarSectorActionPerformed(evt);
			} else if(sTipo.equals("CancelarSector")) {
				jButtonCancelarSectorActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSector")) {
				jButtonCancelarSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSector")) {
				jButtonCancelarSectorActionPerformed(evt);
			} else if(sTipo.equals("CerrarSector")) {
				jButtonCerrarSectorActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSector")) {
				jButtonCerrarSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSector")) {
				jButtonCerrarSectorActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSector")) {
				jButtonMostrarOcultarSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSector")) {
				jButtonCancelarSectorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSector")) {
				jButtonGuardarCambiosSectorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSector")) {
				jButtonGuardarCambiosSectorActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSector")) {
				jButtonCopiarSectorActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSector")) {
				jButtonVerFormSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSector")) {
				jButtonGuardarCambiosSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSector")) {
				jButtonCopiarSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSector")) {
				jButtonVerFormSectorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSector")) {
				jButtonGuardarCambiosSectorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSector")) {
				jButtonGuardarCambiosSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSector")) {
				jButtonGuardarCambiosSectorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSector")) {
				jButtonRecargarInformacionSectorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSector")) {
				jButtonRecargarInformacionSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSector")) {
				jButtonRecargarInformacionSectorActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSector")) {
				jButtonAnterioresSectorActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSector")) {
				jButtonAnterioresSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSector")) {
				jButtonAnterioresSectorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSector")) {
				jButtonSiguientesSectorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSector")) {
				jButtonSiguientesSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSector")) {
				jButtonSiguientesSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySector") || sTipo.equals("MenuItemDetalleAbrirOrderBySector")) {
				jButtonAbrirOrderBySectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSector") || sTipo.equals("MenuItemDetalleMostrarOcultarSector")) {
				jButtonMostrarOcultarSectorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSector")) {
				jButtonNuevoGuardarCambiosSectorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSector")) {
				jButtonNuevoGuardarCambiosSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSector")) {
				jButtonNuevoGuardarCambiosSectorActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSector")) {
				jButtonCerrarReporteDinamicoSectorActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSector")) {
				jButtonGenerarReporteDinamicoSectorActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSector")) {
				
				jButtonGenerarExcelReporteDinamicoSectorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSector")) {
				jButtonCerrarImportacionSectorActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSector")) {
				
				jButtonGenerarImportacionSectorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSector")) {
				
				jButtonAbrirImportacionSectorActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSector")) {
				jComboBoxTiposAccionesSectorActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSector")) {
				jComboBoxTiposRelacionesSectorActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSector")) {
				jComboBoxTiposAccionesSectorActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSector")) {
				
				jComboBoxTiposSeleccionarSectorActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSector")) {
				jTextFieldValorCampoGeneralSectorActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySector")) {
				jButtonAbrirOrderBySectorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSector")) {
				jButtonAbrirOrderBySectorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySector")) {
				jButtonCerrarOrderBySectorActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSectorBusqueda")) {
				this.jButtonidSectorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSectorUpdate")) {
				this.jButtonid_empresaSectorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSectorBusqueda")) {
				this.jButtonid_empresaSectorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadSectorUpdate")) {
				this.jButtonid_ciudadSectorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadSectorBusqueda")) {
				this.jButtonid_ciudadSectorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSectorBusqueda")) {
				this.jButtonnombreSectorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSectorBusqueda")) {
				this.jButtondescripcionSectorBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCiudadSector")) {
				this.jButtonFK_IdCiudadSectorActionPerformed(evt);
			}
			
			;
			
			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSector();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSectorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				


				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Sector sectorLocal=null;
			
			if(!this.getEsControlTabla()) {
				sectorLocal=this.sector;
			} else {
				sectorLocal=this.sectorAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
							
				
				


				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSectorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSector.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorAnterior =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sectorAnterior =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
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
			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			
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
			
			


			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSectorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
								
						
				


				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sector.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
								
				
				


				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSectorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSector.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorAnterior =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sectorAnterior =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sector);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSectorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSector.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorAnterior =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sectorAnterior =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSectorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
							
				
				


				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sector.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSectorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSector.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sectorAnterior =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sectorAnterior =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
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
			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			
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
			
			


			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSectorActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
								
				
				


				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSectorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSector.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorAnterior =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sectorAnterior =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSectorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSectorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSector")) {
					jCheckBoxSeleccionarTodosSectorItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSector")) {
					jCheckBoxSeleccionadosSectorItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSector")) {
					
				}
				
				


				
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
												
				
				


				
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSectorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSector.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sectorAnterior =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sectorAnterior =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSectorActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
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
			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
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
			
			


			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSectorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sector.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sector.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sector);
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
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
				
				


				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sector.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSectorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSector.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sectorAnterior =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sectorAnterior =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSector")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSectorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSector.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.sector =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.sector =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.sector);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSector")) {
				
				}
				
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSector")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSector.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSector")) {
			
			}
			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSector();
			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			
			if(sTipo.equals("NuevoSector")) {
				jButtonNuevoSectorActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSector")) {
				jButtonDuplicarSectorActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSector")) {
				jButtonCopiarSectorActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSector")) {
				jButtonVerFormSectorActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSector")) {
				jButtonNuevoSectorActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSector")) {
				jButtonModificarSectorActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSector")) {
				jButtonActualizarSectorActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSector")) {
				jButtonEliminarSectorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSector")) {
				jButtonGuardarCambiosSectorActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSector")) {
				jButtonCancelarSectorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSector")) {
				jButtonCerrarSectorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSector")) {
				jButtonGuardarCambiosSectorActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSector")) {
				jButtonNuevoGuardarCambiosSectorActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySector")) {
				jButtonAbrirOrderBySectorActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSector")) {
				jButtonRecargarInformacionSectorActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSector")) {
				jButtonAnterioresSectorActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSector")) {
				jButtonSiguientesSectorActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSectorBusqueda")) {
				this.jButtonidSectorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSectorUpdate")) {
				this.jButtonid_empresaSectorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSectorBusqueda")) {
				this.jButtonid_empresaSectorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadSectorUpdate")) {
				this.jButtonid_ciudadSectorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadSectorBusqueda")) {
				this.jButtonid_ciudadSectorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSectorBusqueda")) {
				this.jButtonnombreSectorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSectorBusqueda")) {
				this.jButtondescripcionSectorBusquedaActionPerformed(evt);
			}
			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSector();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSector")) {
				closingInternalFrameSector();
				
			} else if(sTipo.equals("jButtonCancelarSector")) {
				JInternalFrameBase jInternalFrameDetalleFormSector = (JInternalFrameBase)evt.getSource();
	            	
	            SectorBeanSwingJInternalFrame jInternalFrameParent=(SectorBeanSwingJInternalFrame)jInternalFrameDetalleFormSector.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSectorActionPerformed(null);
			}
			
			SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sector,new Object(),this.sectorParameterGeneral,this.sectorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSector(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSector(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSector(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.sector)) {
			if(!esControlTabla) {
				if(SectorJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSector(this.sector,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);			
				}
				
				if(this.sectorSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSector(this.sector,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.sectorReturnGeneral=sectorLogic.procesarEventosSectorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sectorLogic.getSectors(),this.sector,this.sectorParameterGeneral,this.isEsNuevoSector,classes);//this.sectorLogic.getSector()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSector(this.sectorReturnGeneral,this.sectorBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.sectorSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSector(classes,this.sectorReturnGeneral,this.sectorBean,false);
					}
						
					if(this.sectorReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySector(this.sectorReturnGeneral.getSector());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSector(this.sectorReturnGeneral.getSector());	
					}
						
					if(this.sectorReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSector(this.sectorReturnGeneral.getSector(),classes);//this.sectorBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSector(this.sector,classes);//this.sectorBean);									
				}
			
				if(SectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSector(this.sector,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSector(this.sector);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.sectorAnterior!=null) {
						this.sector=this.sectorAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.sectorReturnGeneral=sectorLogic.procesarEventosSectorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sectorLogic.getSectors(),this.sector,this.sectorParameterGeneral,this.isEsNuevoSector,classes);//this.sectorLogic.getSector()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sectorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.sectorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.sectorReturnGeneral.getSector(),sectorLogic.getSectors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.sectorReturnGeneral.getSector(),this.sectors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSector.repaint();
				
				//((AbstractTableModel) this.jTableDatosSector.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSector();
			}
		}
	}
	
	public void actualizarVisualTableDatosSector() throws Exception {
		
		SectorModel sectorModel=(SectorModel)this.jTableDatosSector.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sectorModel.sectors=this.sectorLogic.getSectors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			sectorModel.sectors=this.sectors;
		}
		
		
		((SectorModel) this.jTableDatosSector.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSector() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsectorAnterior(),this.sectorLogic.getSectors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsectorAnterior(),this.sectors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSector();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSector(Sector sector,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Ruta.class)) {
					this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.setRutas(sector.getRutaOrigens());
					this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRuta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubSector.class)) {
					this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.setSubSectors(sector.getSubSectors());
					this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubSector(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
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
										
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sector,new Object(),generalEntityParameterGeneral,this.sectorReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.sectorSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SectorConstantesFunciones.getClassesRelationshipsOfSector(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SectorConstantesFunciones.getClassesRelationshipsFromStringsOfSector(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSector(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sector,new Object(),generalEntityParameterGeneral,this.sectorReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSector(SectorBean sectorBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Ruta.class)) {
					this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.setRutas(sector.getRutaOrigens());
					this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRuta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubSector.class)) {
					this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.setSubSectors(sector.getSubSectors());
					this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubSector(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSector(ArrayList<Classe> classes,SectorReturnGeneral sectorReturnGeneral,SectorBean sectorBean,Boolean conDefault) throws Exception {
		
			this.sectorBean.setRutas(sectorReturnGeneral.getSector().getRutas());
			this.sectorBean.setSubSectors(sectorReturnGeneral.getSector().getSubSectors());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSector(Sector sector,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Ruta.class)) {
					sector.setRutaOrigens(this.jInternalFrameDetalleFormSector.rutaBeanSwingJInternalFrame.rutaLogic.getRutas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubSector.class)) {
					sector.setSubSectors(this.jInternalFrameDetalleFormSector.subsectorBeanSwingJInternalFrame.subsectorLogic.getSubSectors());
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
		if(!paraTabla && !this.permiteMantenimiento(this.sector)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSector = new SectorDetalleFormJInternalFrame(jDesktopPane,this.sectorSessionBean.getConGuardarRelaciones(),this.sectorSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSector);
		this.jInternalFrameDetalleFormSector.setVisible(false);
		this.jInternalFrameDetalleFormSector.setSelected(false);						
		
		this.jInternalFrameDetalleFormSector.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSector.sectorLogic=this.sectorLogic;
		
		this.cargarCombosFrameForeignKeySector("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSector();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSector();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySector("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySector();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSector.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSector"));
		
		this.jInternalFrameDetalleFormSector.jButtonModificarSector.addActionListener(new ButtonActionListener(this,"ModificarSector"));

		
		this.jInternalFrameDetalleFormSector.jButtonModificarToolBarSector.addActionListener(new ButtonActionListener(this,"ModificarToolBarSector"));
					
		this.jInternalFrameDetalleFormSector.jMenuItemModificarSector.addActionListener(new ButtonActionListener(this,"MenuItemModificarSector"));		
		
		
		
		this.jInternalFrameDetalleFormSector.jButtonActualizarSector.addActionListener (new ButtonActionListener(this,"ActualizarSector"));
		
		
		this.jInternalFrameDetalleFormSector.jButtonActualizarToolBarSector.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSector"));
						
		this.jInternalFrameDetalleFormSector.jMenuItemActualizarSector.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSector"));		
		
		
		
		this.jInternalFrameDetalleFormSector.jButtonEliminarSector.addActionListener (new ButtonActionListener(this,"EliminarSector"));
		
		
		this.jInternalFrameDetalleFormSector.jButtonEliminarToolBarSector.addActionListener (new ButtonActionListener(this,"EliminarToolBarSector"));
								
		this.jInternalFrameDetalleFormSector.jMenuItemEliminarSector.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSector"));		
		
		
		
		this.jInternalFrameDetalleFormSector.jButtonCancelarSector.addActionListener (new ButtonActionListener(this,"CancelarSector"));
		
		
		this.jInternalFrameDetalleFormSector.jButtonCancelarToolBarSector.addActionListener (new ButtonActionListener(this,"CancelarToolBarSector"));
					
		this.jInternalFrameDetalleFormSector.jMenuItemCancelarSector.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSector"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSector.jMenuItemDetalleCerrarSector.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSector"));		
		
		
		
		this.jInternalFrameDetalleFormSector.jButtonGuardarCambiosToolBarSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSector"));
		
		
		
		this.jInternalFrameDetalleFormSector.jButtonGuardarCambiosToolBarSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSector"));
		
		
		
		this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSector"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtonidSectorBusqueda.addActionListener(new ButtonActionListener(this,"idSectorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSector.jButtonid_empresaSectorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSectorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtonid_empresaSectorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSectorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSector.jButtonid_ciudadSectorUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadSectorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtonid_ciudadSectorBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtonnombreSectorBusqueda.addActionListener(new ButtonActionListener(this,"nombreSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtondescripcionSectorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSectorBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSector.jTabbedPaneRelacionesSector.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSector"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSector"));
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSector"));
		}
		
		this.jTableDatosSector.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSector"));
		
		this.jTableDatosSector.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSector"));
		
		this.jButtonNuevoSector.addActionListener(new ButtonActionListener(this,"NuevoSector"));
		
		this.jButtonDuplicarSector.addActionListener(new ButtonActionListener(this,"DuplicarSector"));
		
		this.jButtonCopiarSector.addActionListener(new ButtonActionListener(this,"CopiarSector"));
		
		this.jButtonVerFormSector.addActionListener(new ButtonActionListener(this,"VerFormSector"));
		
		
		this.jButtonNuevoToolBarSector.addActionListener(new ButtonActionListener(this,"NuevoToolBarSector"));
			
		this.jButtonDuplicarToolBarSector.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSector"));
			
		this.jMenuItemNuevoSector.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSector"));
			
		this.jMenuItemDuplicarSector.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSector"));		
		
		
		this.jButtonNuevoRelacionesSector.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSector"));
		
		
		this.jButtonNuevoRelacionesToolBarSector.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSector"));
			
		this.jMenuItemNuevoRelacionesSector.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSector"));		
		
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jButtonModificarSector.addActionListener(new ButtonActionListener(this,"ModificarSector"));
		}
		
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jButtonModificarToolBarSector.addActionListener(new ButtonActionListener(this,"ModificarToolBarSector"));
			
			this.jInternalFrameDetalleFormSector.jMenuItemModificarSector.addActionListener(new ButtonActionListener(this,"MenuItemModificarSector"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSector.jButtonActualizarSector.addActionListener (new ButtonActionListener(this,"ActualizarSector"));
		}
		
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jButtonActualizarToolBarSector.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSector"));
				
			this.jInternalFrameDetalleFormSector.jMenuItemActualizarSector.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSector"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jButtonEliminarSector.addActionListener (new ButtonActionListener(this,"EliminarSector"));
		}
		
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jButtonEliminarToolBarSector.addActionListener (new ButtonActionListener(this,"EliminarToolBarSector"));
						
			this.jInternalFrameDetalleFormSector.jMenuItemEliminarSector.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSector"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jButtonCancelarSector.addActionListener (new ButtonActionListener(this,"CancelarSector"));
		}
		
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jButtonCancelarToolBarSector.addActionListener (new ButtonActionListener(this,"CancelarToolBarSector"));
			
			this.jInternalFrameDetalleFormSector.jMenuItemCancelarSector.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSector"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSector.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSector"));		
		
		
		this.jButtonCerrarSector.addActionListener (new ButtonActionListener(this,"CerrarSector"));
		
		
		this.jButtonCerrarToolBarSector.addActionListener (new ButtonActionListener(this,"CerrarToolBarSector"));
			
		this.jMenuItemCerrarSector.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSector"));
			
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jMenuItemDetalleCerrarSector.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSector"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jButtonGuardarCambiosSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosSector"));
		}
		
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jButtonGuardarCambiosToolBarSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSector"));
		}
		
		this.jButtonCopiarToolBarSector.addActionListener (new ButtonActionListener(this,"CopiarToolBarSector"));
			
		this.jButtonVerFormToolBarSector.addActionListener (new ButtonActionListener(this,"VerFormToolBarSector"));
		
		this.jMenuItemGuardarCambiosSector.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSector"));
			
		this.jMenuItemCopiarSector.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSector"));		
		
		this.jMenuItemVerFormSector.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSector"));		
		
		
		this.jButtonGuardarCambiosTablaSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSector"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSector"));
			
		this.jMenuItemGuardarCambiosTablaSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSector"));		
		
		
		
		this.jButtonRecargarInformacionSector.addActionListener (new ButtonActionListener(this,"RecargarInformacionSector"));
					
		this.jButtonRecargarInformacionToolBarSector.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSector"));
		
		this.jMenuItemRecargarInformacionSector.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSector"));		
		
		
		
		this.jButtonAnterioresSector.addActionListener (new ButtonActionListener(this,"AnterioresSector"));
		
		
		this.jButtonAnterioresToolBarSector.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSector"));
		
		this.jMenuItemAnterioresSector.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSector"));		
		
		
		this.jButtonSiguientesSector.addActionListener (new ButtonActionListener(this,"SiguientesSector"));
		
		
		this.jButtonSiguientesToolBarSector.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSector"));
			
		this.jMenuItemSiguientesSector.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSector"));
			
		this.jMenuItemAbrirOrderBySector.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySector"));
			
		this.jMenuItemMostrarOcultarSector.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSector"));
			
		this.jMenuItemDetalleAbrirOrderBySector.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySector"));
			
		this.jMenuItemDetalleMostarOcultarSector.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSector"));		
		
		
		this.jButtonNuevoGuardarCambiosSector.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSector"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSector.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSector"));
			
		this.jMenuItemNuevoGuardarCambiosSector.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSector"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSector.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSector"));

		this.jCheckBoxSeleccionadosSector.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSector"));
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSector"));
		}
		
		
		this.jComboBoxTiposRelacionesSector.addActionListener (new ButtonActionListener(this,"TiposRelacionesSector"));
			
		this.jComboBoxTiposAccionesSector.addActionListener (new ButtonActionListener(this,"TiposAccionesSector"));
					
		this.jComboBoxTiposSeleccionarSector.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSector"));
			
		this.jTextFieldValorCampoGeneralSector.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSector"));		
		
		
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtonidSectorBusqueda.addActionListener(new ButtonActionListener(this,"idSectorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSector.jButtonid_empresaSectorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSectorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtonid_empresaSectorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSectorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSector.jButtonid_ciudadSectorUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadSectorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtonid_ciudadSectorBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtonnombreSectorBusqueda.addActionListener(new ButtonActionListener(this,"nombreSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtondescripcionSectorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSectorBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCiudadSector.addActionListener(new ButtonActionListener(this,"FK_IdCiudadSector"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSector!=null) {
				this.jInternalFrameReporteDinamicoSector.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSector"));
				this.jInternalFrameReporteDinamicoSector.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSector"));
				this.jInternalFrameReporteDinamicoSector.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSector"));
			}
			
			//this.jButtonCerrarReporteDinamicoSector.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSector"));				
			//this.jButtonGenerarReporteDinamicoSector.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSector"));
			//this.jButtonGenerarExcelReporteDinamicoSector.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSector"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSector!=null) {
				this.jInternalFrameImportacionSector.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSector"));
				this.jInternalFrameImportacionSector.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSector"));
				this.jInternalFrameImportacionSector.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSector"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySector.addActionListener (new ButtonActionListener(this,"AbrirOrderBySector"));
			
			this.jButtonAbrirOrderByToolBarSector.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSector"));			
			
			if(this.jInternalFrameOrderBySector!=null) {
				this.jInternalFrameOrderBySector.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySector"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSector.jTabbedPaneRelacionesSector.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSector"));
		
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
            		closingInternalFrameSector();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSector.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSector = (JInternalFrameBase)event.getSource();
	            	
	            SectorBeanSwingJInternalFrame jInternalFrameParent=(SectorBeanSwingJInternalFrame)jInternalFrameDetalleFormSector.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSectorActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSector.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSectorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSector.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSector.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSectorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSectorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSectorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSector";
		inputMap = this.jButtonNuevoSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSectorActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSectorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSectorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSectorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSector";
		inputMap = this.jButtonNuevoRelacionesSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSectorActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSector";
		inputMap = this.jButtonModificarSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSectorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSector";
		inputMap = this.jButtonActualizarSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSectorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSector";
		inputMap = this.jButtonEliminarSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSectorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSector";
		inputMap = this.jButtonCancelarSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSectorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSector";
		inputMap = this.jButtonCerrarSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSectorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSector.jButtonGuardarCambiosSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSector";
		inputMap = this.jInternalFrameDetalleFormSector.jButtonGuardarCambiosSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSector.jButtonGuardarCambiosSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSectorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSector.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSectorItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSector.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSectorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSector.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSectorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSector.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSectorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtonidSectorBusqueda.addActionListener(new ButtonActionListener(this,"idSectorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSector.jButtonid_empresaSectorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSectorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtonid_empresaSectorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSectorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSector.jButtonid_ciudadSectorUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadSectorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtonid_ciudadSectorBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtonnombreSectorBusqueda.addActionListener(new ButtonActionListener(this,"nombreSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSector.jButtondescripcionSectorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSectorBusqueda"));
		
		
		this.jButtonFK_IdCiudadSector.addActionListener(new ButtonActionListener(this,"FK_IdCiudadSector"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSectorActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSector.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSector(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Sector sectorAux:this.sectorLogic.getSectors()) {
					sectorAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sector sectorAux:sectors) {
					sectorAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSectorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSector(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Sector sectorAux:this.sectorLogic.getSectors()) {
						sectorAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Sector sectorAux:sectors) {
						sectorAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Sector sectorAux:this.sectorLogic.getSectors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Sector sectorAux:sectors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSector(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSector.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSector.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSector,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSectorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSector(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSector.getSelectedRows();
			
			Sector sectorLocal=new Sector();
			
			//this.seleccionarTodosSector(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sectorLocal =(Sector) this.sectorLogic.getSectors().toArray()[this.jTableDatosSector.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					sectorLocal =(Sector) this.sectors.toArray()[this.jTableDatosSector.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				sectorLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Sector sectorAux:this.sectorLogic.getSectors()) {
						sectorAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Sector sectorAux:sectors) {
						sectorAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSector(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSector.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSector.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSector,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSectorItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSectorParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSectorActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSector(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSector.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Sector sectorAux:this.sectorLogic.getSectors()) {
				
						if(sTipoSeleccionar.equals(SectorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							sectorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SectorConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							sectorAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sector sectorAux:sectors) {
					
						if(sTipoSeleccionar.equals(SectorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							sectorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SectorConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							sectorAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSector(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSectorActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSector(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSector=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSector.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSector) {				
					conSplash=true;//false;										
					
					//this.startProcessSector(conSplash);
				
					this.generarReporteSectorsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSector.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSectorsSeleccionados();
				//this.jComboBoxTiposAccionesSector.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSectorsSeleccionados(false);
				//this.jComboBoxTiposAccionesSector.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSectorsSeleccionados(true);
				//this.jComboBoxTiposAccionesSector.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSector();
				
				this.exportarSectorsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSector.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSectors();
				//this.importarSectors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSector.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSector();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSectorsSeleccionados();
				//this.jComboBoxTiposAccionesSector.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sector", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSector();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSector)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySector(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSector.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.setSelectedIndex(0);					
				}	
			} 			
			else if(SectorBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSector) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSector(conSplash);
					
						//this.actualizarParametrosGeneralSector();
						
						this.generarReporteProcesoAccionSectorsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSector.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SectorBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO SectorES SELECCIONADOS?", "MANTENIMIENTO DE Sector", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSector();
				
						this.actualizarParametrosGeneralSector();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.sectorReturnGeneral=sectorLogic.procesarAccionSectorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.sectorLogic.getSectors(),this.sectorParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSectorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSector.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSector();
					
					SectorBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSectorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSector.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSector.jComboBoxTiposAccionesFormularioSector.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSector(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSectorActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSector();
			
			if(this.jInternalFrameDetalleFormSector==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();		
			Sector sector=new Sector();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSector(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSector.getSelectedItem();
			
			
			
			
			sectorsSeleccionados=this.getSectorsSeleccionados(true);
			//this.sTipoAccion;
			
			if(sectorsSeleccionados.size()==1) {
				for(Sector sectorAux:sectorsSeleccionados) {
					sector=sectorAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Ruta")) {
					jButtonRutaActionPerformed(null,rowIndex,true,false,sector);
				}
				else if(this.sTipoRelacion.equals("Sector")) {
					jButtonSubSectorActionPerformed(null,rowIndex,true,false,sector);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSector();
			
      		//this.finishProcessSector(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSectorReturnGeneral() throws Exception {
		if(this.sectorReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.sectorReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.sectorReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.sectorReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.sectorReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.sectorReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSector(false);
		}
		
		if(this.sectorReturnGeneral.getConRetornoLista() || this.sectorReturnGeneral.getConRetornoObjeto()) {
			if(this.sectorReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.sectorLogic.setSectors(this.sectorReturnGeneral.getSectors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.sectorReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.sectorLogic.setSector(this.sectorReturnGeneral.getSector());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSector(false);
		}
	}
	
	public void actualizarParametrosGeneralSector() throws Exception {
		
		
	}
	
	public ArrayList<Sector> getSectorsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSector) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Sector sectorAux:sectorLogic.getSectors()) {
					if(sectorAux.getIsSelected()) {
						sectorsSeleccionados.add(sectorAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sector sectorAux:this.sectors) {
					if(sectorAux.getIsSelected()) {
						sectorsSeleccionados.add(sectorAux);				
					}
				}
			}
			
			if(sectorsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						sectorsSeleccionados.addAll(this.sectorLogic.getSectors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						sectorsSeleccionados.addAll(this.sectors);				
					}
				}
			}
		} else {
			sectorsSeleccionados.add(this.sector);
		}
		
		return sectorsSeleccionados;
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
	
	public void generarReporteSectorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSectorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSectorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSectorsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSectorsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesSectorsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sector",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSectorsSeleccionados() throws Exception {
		ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();		
		
		sectorsSeleccionados=this.getSectorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSectors("Todos",sectorsSeleccionados);
		
	}	
	
	public void generarReporteNormalSectorsSeleccionados() throws Exception {
		ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();		
		
		sectorsSeleccionados=this.getSectorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSectors("Todos",sectorsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSectorsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();
		
		sectorsSeleccionados=this.getSectorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSectors("Todos",sectorsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSectorsSeleccionados() throws Exception {
		ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSector();
		
		
		sectorsSeleccionados=this.getSectorsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSector();
		
		
		//this.generarReporteSectors("Todos",sectorsSeleccionados ,sectorImplementable,sectorImplementableHome);
	}
	
	public void mostrarImportacionSectors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSector();
		
		this.abrirFrameImportacionSector();		
		
			
		//this.generarReporteSectors("Todos",sectorsSeleccionados ,sectorImplementable,sectorImplementableHome);
	}
	
	public void importarSectors() throws Exception {		
	
	}
	
	public void exportarSectorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSectorsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSectorsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSectorsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sector",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSectorsSeleccionados() throws Exception {
		ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();		
		
		sectorsSeleccionados=this.getSectorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sector."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSector(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Sector sectorAux:sectorsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSector(sectorAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//sectorAux.setsDetalleGeneralEntityReporte(sectorAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSector(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SectorConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SectorConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SectorConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SectorConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SectorConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SectorConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSector(Sector sector,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=sector.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=sector.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=sector.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sector.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sector.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sector.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSectorsSeleccionados() throws Exception {
		ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();		
		
		sectorsSeleccionados=this.getSectorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sector.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Sectors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSector(row);				
				iRow++;
			}				
			
			for(Sector sectorAux:sectorsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSector(sectorAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSectorsSeleccionados() throws Exception {
		ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();		
		
		sectorsSeleccionados=this.getSectorsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sector.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("sectors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("sector");
			//elementRoot.appendChild(element);
		
			for(Sector sectorAux:sectorsSeleccionados) {
				element = document.createElement("sector");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSector(sectorAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSector(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SectorConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SectorConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SectorConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SectorConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(SectorConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(SectorConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSector(Sector sector,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(sector.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(sector.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sector.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sector.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(sector.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlSector(Sector sector,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SectorConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(sector.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SectorConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(sector.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SectorConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(sector.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementciudad_descripcion = document.createElement(SectorConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(sector.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementnombre = document.createElement(SectorConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(sector.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(SectorConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(sector.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoSectorsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Sector> sectorsSeleccionados=new ArrayList<Sector>();
		
		sectorsSeleccionados=this.getSectorsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSector(sectorsSeleccionados);
		
		this.generarReporteSectors("Todos",sectorsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSector(ArrayList<Sector> sectorsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Sector sectorAux:sectorsSeleccionados) {
				sectorAux.setsDetalleGeneralEntityReporte(sectorAux.toString());
			
				if(sTipoSeleccionar.equals(SectorConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					sectorAux.setsDescripcionGeneralEntityReporte1(sectorAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SectorConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					sectorAux.setsDescripcionGeneralEntityReporte1(sectorAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SectorConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					sectorAux.setsDescripcionGeneralEntityReporte1(sectorAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(SectorConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					sectorAux.setsDescripcionGeneralEntityReporte1(sectorAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SectorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSector(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSector=true;
				this.isVisibilidadCeldaNuevoRelacionesSector=true;
				this.isVisibilidadCeldaGuardarCambiosSector=true;
			}
			
			this.isVisibilidadCeldaModificarSector=false;
			this.isVisibilidadCeldaActualizarSector=false;
			this.isVisibilidadCeldaEliminarSector=false;
			this.isVisibilidadCeldaCancelarSector=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSector=true;
				} else {
					this.isVisibilidadCeldaGuardarSector=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSector=false;
			this.isVisibilidadCeldaNuevoRelacionesSector=false;
			this.isVisibilidadCeldaGuardarCambiosSector=false;
			this.isVisibilidadCeldaModificarSector=false;
			this.isVisibilidadCeldaActualizarSector=true;
			this.isVisibilidadCeldaEliminarSector=false;
			this.isVisibilidadCeldaCancelarSector=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSector=true;
				} else {
					this.isVisibilidadCeldaGuardarSector=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSector=false;
			this.isVisibilidadCeldaNuevoRelacionesSector=false;
			this.isVisibilidadCeldaGuardarCambiosSector=false;
			this.isVisibilidadCeldaModificarSector=false;
			this.isVisibilidadCeldaActualizarSector=true;
			this.isVisibilidadCeldaEliminarSector=true;
			this.isVisibilidadCeldaCancelarSector=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSector=true;
				} else {
					this.isVisibilidadCeldaGuardarSector=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSector=false;
			this.isVisibilidadCeldaNuevoRelacionesSector=false;
			this.isVisibilidadCeldaGuardarCambiosSector=false;
			this.isVisibilidadCeldaModificarSector=false;
			this.isVisibilidadCeldaActualizarSector=true;
			this.isVisibilidadCeldaEliminarSector=false;
			this.isVisibilidadCeldaCancelarSector=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSector=false;
				} else {
					this.isVisibilidadCeldaGuardarSector=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSector=true;
			this.isVisibilidadCeldaNuevoRelacionesSector=true;
			this.isVisibilidadCeldaGuardarCambiosSector=true;
			this.isVisibilidadCeldaModificarSector=false;
			this.isVisibilidadCeldaActualizarSector=false;
			this.isVisibilidadCeldaEliminarSector=false;
			this.isVisibilidadCeldaCancelarSector=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSector=true;
				} else {
					this.isVisibilidadCeldaGuardarSector=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSector=false;
			this.isVisibilidadCeldaNuevoRelacionesSector=false;
			this.isVisibilidadCeldaGuardarCambiosSector=false;
			this.isVisibilidadCeldaActualizarSector=false;
			this.isVisibilidadCeldaEliminarSector=false;
			this.isVisibilidadCeldaCancelarSector=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSector=false;
				} else {
					this.isVisibilidadCeldaGuardarSector=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSector=false;
			this.isVisibilidadCeldaNuevoRelacionesSector=false;
			this.isVisibilidadCeldaGuardarCambiosSector=false;
			this.isVisibilidadCeldaModificarSector=true;
			this.isVisibilidadCeldaActualizarSector=false;
			this.isVisibilidadCeldaEliminarSector=false;
			this.isVisibilidadCeldaCancelarSector=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSector=false;
				} else {
					this.isVisibilidadCeldaGuardarSector=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SectorJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSector=true;
			this.isVisibilidadCeldaNuevoRelacionesSector=true;
			this.isVisibilidadCeldaGuardarCambiosSector=true;
		} else {
			this.actualizarEstadoPanelsSector(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSector=false;
			//this.isVisibilidadCeldaVerFormSector=false;
			this.isVisibilidadCeldaDuplicarSector=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!sectorSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSector=false;
		} else {
			this.isVisibilidadCeldaNuevoSector=false;
			this.isVisibilidadCeldaGuardarCambiosSector=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(sectorSessionBean.getEsGuardarRelacionado()) {
			if(!sectorSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSector=false;												
			}
			
			this.jButtonCerrarSector.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSector=false;
		}
		
		if(!this.permiteMantenimiento(this.sector)) {
			this.isVisibilidadCeldaActualizarSector=false;
			this.isVisibilidadCeldaEliminarSector=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSector() {
		this.isVisibilidadCeldaNuevoSector=false;
		this.isVisibilidadCeldaGuardarCambiosSector=false;
	}
	
	public void actualizarEstadoPanelsSector(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSector!=null) {
				this.jScrollPanelDatosEdicionSector.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSector!=null) {
				this.jTabbedPaneBusquedasSector.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSector!=null) {
				this.jScrollPanelDatosSector.setVisible(true);
			}
			
			if(this.jPanelPaginacionSector!=null) {
				this.jPanelPaginacionSector.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSector!=null) {
				this.jPanelParametrosReportesSector.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSector!=null) {
				this.jScrollPanelDatosEdicionSector.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSector!=null) {
				this.jTabbedPaneBusquedasSector.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSector!=null) {
				this.jScrollPanelDatosSector.setVisible(false);
			}
			
			if(this.jPanelPaginacionSector!=null) {
				this.jPanelPaginacionSector.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSector!=null) {
				this.jPanelParametrosReportesSector.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSector!=null) {
				this.jScrollPanelDatosEdicionSector.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSector!=null) {
				this.jTabbedPaneBusquedasSector.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSector!=null) {
				this.jScrollPanelDatosSector.setVisible(false);
			}
			
			if(this.jPanelPaginacionSector!=null) {
				this.jPanelPaginacionSector.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSector!=null) {
				this.jPanelParametrosReportesSector.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSector!=null) {
				this.jScrollPanelDatosEdicionSector.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSector!=null) {
				this.jTabbedPaneBusquedasSector.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSector!=null) {
				this.jScrollPanelDatosSector.setVisible(false);
			}
			
			if(this.jPanelPaginacionSector!=null) {
				this.jPanelPaginacionSector.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSector!=null) {
				this.jPanelParametrosReportesSector.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSector!=null) {
				this.jScrollPanelDatosEdicionSector.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSector!=null) {
				this.jTabbedPaneBusquedasSector.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSector!=null) {
				this.jScrollPanelDatosSector.setVisible(true);
			}
			
			if(this.jPanelPaginacionSector!=null) {
				this.jPanelPaginacionSector.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSector!=null) {
				this.jPanelParametrosReportesSector.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSector!=null) {
				this.jScrollPanelDatosEdicionSector.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSector!=null) {
				this.jTabbedPaneBusquedasSector.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSector!=null) {
				this.jScrollPanelDatosSector.setVisible(true);
			}
			
			if(this.jPanelPaginacionSector!=null) {
				this.jPanelPaginacionSector.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSector!=null) {
				this.jPanelParametrosReportesSector.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSector!=null) {
				this.jScrollPanelDatosEdicionSector.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSector!=null) {
				this.jTabbedPaneBusquedasSector.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSector!=null) {
				this.jScrollPanelDatosSector.setVisible(true);
			}
			
			if(this.jPanelPaginacionSector!=null) {
				this.jPanelPaginacionSector.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSector!=null) {
				this.jPanelParametrosReportesSector.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.sectorSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSector!=null) {
					this.jTabbedPaneBusquedasSector.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSector!=null) {
				this.jPanelParametrosReportesSector.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.sectorSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSector!=null) {
				this.jTabbedPaneBusquedasSector.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSector!=null) {
				this.jPanelParametrosReportesSector.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCiudad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasSector.remove(jPanelFK_IdCiudadSector);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadFK_IdCiudad=isParaCiudad;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasSector.remove(jPanelFK_IdCiudadSector);}
		}
		
	}
	
	

	public String registrarSesionSectorOrigenParaRutas() throws Exception {
		Boolean isPaginaPopupRuta=false;

		try {

			if(this.sectorSessionBean==null) {
				this.sectorSessionBean=new SectorSessionBean();
			}

			if(this.jInternalFrameDetalleFormSector.rutaSessionBean==null) {
				this.jInternalFrameDetalleFormSector.rutaSessionBean=new RutaSessionBean();
			}

			this.jInternalFrameDetalleFormSector.rutaSessionBean.setsPathNavegacionActual(sectorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RutaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormSector.rutaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRuta=this.jInternalFrameDetalleFormSector.rutaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormSector.rutaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRuta(true);
			this.jInternalFrameDetalleFormSector.rutaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRuta(SectorConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormSector.rutaSessionBean.setisBusquedaDesdeForeignKeySesionSectorOrigen(true);
			this.jInternalFrameDetalleFormSector.rutaSessionBean.setlidSectorOrigenActual(this.idSectorActual);

			sectorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySector(true);
			sectorSessionBean.setlIdSectorActualForeignKey(this.idSectorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionSectorParaSubSectores() throws Exception {
		Boolean isPaginaPopupSubSector=false;

		try {

			if(this.sectorSessionBean==null) {
				this.sectorSessionBean=new SectorSessionBean();
			}

			if(this.jInternalFrameDetalleFormSector.subsectorSessionBean==null) {
				this.jInternalFrameDetalleFormSector.subsectorSessionBean=new SubSectorSessionBean();
			}

			this.jInternalFrameDetalleFormSector.subsectorSessionBean.setsPathNavegacionActual(sectorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SubSectorConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormSector.subsectorSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSubSector=this.jInternalFrameDetalleFormSector.subsectorSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormSector.subsectorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSubSector(true);
			this.jInternalFrameDetalleFormSector.subsectorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSubSector(SectorConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormSector.subsectorSessionBean.setisBusquedaDesdeForeignKeySesionSector(true);
			this.jInternalFrameDetalleFormSector.subsectorSessionBean.setlidSectorActual(this.idSectorActual);

			sectorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySector(true);
			sectorSessionBean.setlIdSectorActualForeignKey(this.idSectorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SectorSessionBean sectorSessionBean=new SectorSessionBean();
		
		if(this.sectorSessionBean==null) {
			this.sectorSessionBean=new SectorSessionBean();
		}
		
		this.sectorSessionBean.setsUltimaBusquedaSector(this.getsAccionBusqueda());
		this.sectorSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.sectorSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
			sectorSessionBean.setid_ciudad(this.getid_ciudadFK_IdCiudad());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			sectorSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SectorSessionBean sectorSessionBean=new SectorSessionBean();
		
		if(this.sectorSessionBean==null) {
			this.sectorSessionBean=new SectorSessionBean();
		}
		
		if(this.sectorSessionBean.getsUltimaBusquedaSector()!=null&&!this.sectorSessionBean.getsUltimaBusquedaSector().equals("")) {
			this.setsAccionBusqueda(sectorSessionBean.getsUltimaBusquedaSector());
			this.setiNumeroPaginacion(sectorSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(sectorSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
				this.setid_ciudadFK_IdCiudad(sectorSessionBean.getid_ciudad());
				sectorSessionBean.setid_ciudad(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(sectorSessionBean.getid_empresa());
				sectorSessionBean.setid_empresa(-1L);
			}
		}
		
		this.sectorSessionBean.setsUltimaBusquedaSector("");
		this.sectorSessionBean.setiNumeroPaginacion(SectorConstantesFunciones.INUMEROPAGINACION);
		this.sectorSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSector(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSector() {
		this.updateBorderResaltarBusquedasFormularioSector();
		this.updateVisibilidadBusquedasFormularioSector();
		this.updateHabilitarBusquedasFormularioSector();
	}
	
	public void updateBorderResaltarBusquedasFormularioSector() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSector.getComponents().length>0) {
	

		if(this.sectorConstantesFunciones.resaltarFK_IdCiudadSector!=null) {
			index= this.jTabbedPaneBusquedasSector.indexOfComponent(this.jPanelFK_IdCiudadSector);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSector.getComponent(index);
				jPanel.setBorder(this.sectorConstantesFunciones.resaltarFK_IdCiudadSector);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSector() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSector.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSector.indexOfComponent(this.jPanelFK_IdCiudadSector);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSector.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.sectorConstantesFunciones.mostrarFK_IdCiudadSector);
			if(!this.sectorConstantesFunciones.mostrarFK_IdCiudadSector && index>-1) {
				this.jTabbedPaneBusquedasSector.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSector() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSector.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSector.indexOfComponent(this.jPanelFK_IdCiudadSector);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSector.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.sectorConstantesFunciones.activarFK_IdCiudadSector);
				this.jTabbedPaneBusquedasSector.setEnabledAt(index,this.sectorConstantesFunciones.activarFK_IdCiudadSector);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSector(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCiudad")) {
			index= this.jTabbedPaneBusquedasSector.indexOfComponent(this.jPanelFK_IdCiudadSector);

			this.jTabbedPaneBusquedasSector.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSector.getComponent(index);

			this.sectorConstantesFunciones.setResaltarFK_IdCiudadSector(resaltar);

			jPanel.setBorder(this.sectorConstantesFunciones.resaltarFK_IdCiudadSector);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSector.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSector() throws Exception {

		if(this.jInternalFrameDetalleFormSector==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSector();
		this.updateVisibilidadResaltarControlesFormularioSector();
		this.updateHabilitarResaltarControlesFormularioSector();
		
	}
	
	public void updateBorderResaltarControlesFormularioSector() throws Exception {
		if(this.jInternalFrameDetalleFormSector==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.sectorConstantesFunciones.resaltaridSector!=null && this.jInternalFrameDetalleFormSector!=null) {this.jInternalFrameDetalleFormSector.jLabelidSector.setBorder(this.sectorConstantesFunciones.resaltaridSector);}
		if(this.sectorConstantesFunciones.resaltarid_empresaSector!=null && this.jInternalFrameDetalleFormSector!=null) {this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.setBorder(this.sectorConstantesFunciones.resaltarid_empresaSector);}
		if(this.sectorConstantesFunciones.resaltarid_ciudadSector!=null && this.jInternalFrameDetalleFormSector!=null) {this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.setBorder(this.sectorConstantesFunciones.resaltarid_ciudadSector);}
		if(this.sectorConstantesFunciones.resaltarnombreSector!=null && this.jInternalFrameDetalleFormSector!=null) {this.jInternalFrameDetalleFormSector.jTextAreanombreSector.setBorder(this.sectorConstantesFunciones.resaltarnombreSector);}
		if(this.sectorConstantesFunciones.resaltardescripcionSector!=null && this.jInternalFrameDetalleFormSector!=null) {this.jInternalFrameDetalleFormSector.jTextAreadescripcionSector.setBorder(this.sectorConstantesFunciones.resaltardescripcionSector);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSector() throws Exception {		
		if(this.jInternalFrameDetalleFormSector==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSector!=null) {
	
		//this.jInternalFrameDetalleFormSector.jLabelidSector.setVisible(this.sectorConstantesFunciones.mostraridSector);
		this.jInternalFrameDetalleFormSector.jPanelidSector.setVisible(this.sectorConstantesFunciones.mostraridSector);
		//this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.setVisible(this.sectorConstantesFunciones.mostrarid_empresaSector);
		this.jInternalFrameDetalleFormSector.jPanelid_empresaSector.setVisible(this.sectorConstantesFunciones.mostrarid_empresaSector);
		//this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.setVisible(this.sectorConstantesFunciones.mostrarid_ciudadSector);
		this.jInternalFrameDetalleFormSector.jPanelid_ciudadSector.setVisible(this.sectorConstantesFunciones.mostrarid_ciudadSector);
		//this.jInternalFrameDetalleFormSector.jTextAreanombreSector.setVisible(this.sectorConstantesFunciones.mostrarnombreSector);
		this.jInternalFrameDetalleFormSector.jPanelnombreSector.setVisible(this.sectorConstantesFunciones.mostrarnombreSector);
		//this.jInternalFrameDetalleFormSector.jTextAreadescripcionSector.setVisible(this.sectorConstantesFunciones.mostrardescripcionSector);
		this.jInternalFrameDetalleFormSector.jPaneldescripcionSector.setVisible(this.sectorConstantesFunciones.mostrardescripcionSector);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSector() throws Exception {
		if(this.jInternalFrameDetalleFormSector==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSector!=null) {
	
		this.jInternalFrameDetalleFormSector.jLabelidSector.setEnabled(this.sectorConstantesFunciones.activaridSector);
		this.jInternalFrameDetalleFormSector.jComboBoxid_empresaSector.setEnabled(this.sectorConstantesFunciones.activarid_empresaSector);
		this.jInternalFrameDetalleFormSector.jComboBoxid_ciudadSector.setEnabled(this.sectorConstantesFunciones.activarid_ciudadSector);
		this.jInternalFrameDetalleFormSector.jTextAreanombreSector.setEnabled(this.sectorConstantesFunciones.activarnombreSector);
		this.jInternalFrameDetalleFormSector.jTextAreadescripcionSector.setEnabled(this.sectorConstantesFunciones.activardescripcionSector);
		}
	}
	
		
}